package com.rongyi.core.framework.redis.service.impl;

import com.rongyi.core.framework.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RedisServiceImpl<T, E> implements RedisService{
	
	private static String redisCode = "utf-8";

	@Autowired
	protected RedisTemplate<T, E> redisTemplate;

	public RedisTemplate<T, E> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<T, E> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	@Override
	public long del(final String... keys) {
		return redisTemplate.execute(new RedisCallback<Long>() {
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                long result = 0;
                for (int i = 0; i < keys.length; i++) {
                    result = connection.del(keys[i].getBytes());
                }
                return result;
            }
        });
	}

	@Override
	public void set(final byte[] key, final byte[] value, final long liveTime) {
		redisTemplate.execute(new RedisCallback<Long>() {
			@Override
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                connection.set(key, value);
                if (liveTime > 0) {
                    connection.expire(key, liveTime);
                }
                return 1L;
            }
        });
		
	}

	@Override
	public void set(final String key, final String value, final long liveTime) {
		this.set(key.getBytes(), value.getBytes(), liveTime);
	}

	@Override
	public void set(String key, String value) {
		this.set(key, value, 0L);
		
	}

	@Override
	public void set(byte[] key, byte[] value) {
		this.set(key, value, 0L);
		
	}

	@Override
	public String get(final String key) {
		return redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				try {
					return new String(connection.get(key.getBytes()),redisCode);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				return "";
			}
		});
	}

	@Override
	public boolean exists(final String key) {
		return redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.exists(key.getBytes());
			}
		});
	}

	@Override
	public String flushDB() {
		return redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				connection.flushDb();
				return "ok";
			}
		});
	}

	@Override
	public long dbSize() {
		return redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.dbSize();
			}
		});
	}

	@Override
	public String ping() {
		return redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.ping();
			}
		});
	}

	@Override
	public Set<byte[]> keys(final String keyPattern)
	{
		Set<byte[]> res;
		try {
			res = redisTemplate.execute(new RedisCallback<Set<byte[]>>() {
				@Override
				public Set<byte[]> doInRedis(RedisConnection redisConnection) throws DataAccessException {
					byte[] keyPatternByte;
					try {
						keyPatternByte = keyPattern.getBytes(redisCode);
					} catch (UnsupportedEncodingException e) {
						return null;
					}
					Set keySet = redisConnection.keys(keyPatternByte);
					return keySet;
				}
			});
		} catch (Exception e)
		{
			res = null;
		}
		return res;
	}

	// Set 数据结构相关操作的封装

	/**
	 * desc 向set集合添加一个新元素
	 * @param key
	 * @param obj
	 * @param <T>
	 * @return
	 */
	public <T> Boolean sAdd(String key, T obj) {
		final byte[] bkey = key.getBytes();
		//final byte[] bvalue = ProtoStuffSerializerUtil.serialize(obj); //采用序列化存储,  obj的好处是可以存储对象，但是只用存储字符串
		final byte[] bvalue = obj.toString().getBytes(); //value不序列化存储
		Boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.sAdd(bkey, bvalue);
			}
		});
		return result;
	}

	/**
	 * desc 随机取出一个元素并且删除
	 * @param key
	 * @return
	 */
	public String sPop(final String key){
		final byte[] bkey = key.getBytes();
		byte[] result = redisTemplate.execute(
				new RedisCallback<byte[]>() {
					@Override
					public byte[] doInRedis(RedisConnection connection) throws DataAccessException {
						return connection.sPop(bkey);
					}
				}
		);
		if (result == null) {
			return null;
		}
		return  new String(result);
	}

	/**
	 * desc 删除指定元素
	 * @param key
	 * @return
	 */
	public Boolean sRem(final String key, final String value){
		final byte[] bkey = key.getBytes();
		final byte[] bvalue = value.getBytes();
		Boolean result = redisTemplate.execute(
				new RedisCallback<Boolean>() {
					@Override
					public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
						return connection.sRem(bkey, bvalue);
					}
				}
		);
		return  result;
	}

	/**
	 * desc 获取set集合的成员数量
	 * @param key
	 * @return
	 */
	public Long sCard(final String key){
		final byte[] bkey = key.getBytes();
		long result = redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.sCard(bkey);
			}
		});
		if (result == 0) {
			return null;
		}
		return  result;

	}

	/**
	 * desc 获取key的所有集合
	 * @param key
	 * @return
	 */
	public Set<byte[]>  sMembers(final String key){
		final byte[] bkey = key.getBytes();
		Set<byte[]> result = redisTemplate.execute(new RedisCallback<Set<byte[]>>() {
			@Override
			public Set<byte[]> doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.sMembers(bkey);
			}
		});
		if (result == null) {
			return null;
		}
		return  result;
	}

	/**
	 * desc 获取key的所有集合
	 * @param key
	 * @return
	 */
	public Boolean  sIsMember(final String key, final String vlue){
		final byte[] bkey = key.getBytes();
		final byte[] bvalue = vlue.getBytes();
		Boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.sIsMember(bkey, bvalue);
			}
		});
		return  result;
	}

	// hash结构 封装
	/**
	 * desc 获取key的所有集合
	 * @param key
	 * @return
	 */
	public Map<String, String> hGetAll(final String key){
		final byte[] bkey = key.getBytes();
		Map<byte[], byte[]> result = redisTemplate.execute(new RedisCallback<Map<byte[], byte[]>>() {
			@Override
			public Map<byte[], byte[]> doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.hGetAll(bkey);
			}
		});
		if (result == null) {
			return null;
		}
		Map<String, String> newresult = new LinkedHashMap<>();
		Iterator<Map.Entry<byte[], byte[]>> iterator = result.entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry<byte[], byte[]> entry = iterator.next();
			newresult.put(new String(entry.getKey()), new String(entry.getValue()));
		}
		return  newresult;
	}

	/**
	 * desc 向hash结构添加一条记录
	 * @param key
	 * @param field
	 * @param obj
	 * @param <T>
	 * @return
	 */
	public <T> Boolean hSet(final String key, final String field, T obj){
		final byte[] bkey = key.getBytes();
		final byte[] bfield = field.getBytes();
		final byte[] bvalue = obj.toString().getBytes(); //value不序列化存储
		//final byte[] bvalue = ProtoStuffSerializerUtil.serialize(obj);
		Boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.hSet(bkey, bfield, bvalue);
			}
		});
		return  result;
	}

	/**
	 * desc 获取指定key的value
	 * @param key
	 * @param field
	 * @return
	 */
	public String hGet(final String key, final String field){
		final byte[] bkey = key.getBytes();
		final byte[] bfield = field.getBytes();
		byte[]  result = redisTemplate.execute(new RedisCallback<byte[] >() {
			@Override
			public byte[]  doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.hGet(bkey, bfield);
			}
		});
		if (result == null) {
			return null;
		}
		return  new String(result);
	}

	/**
	 * desc 为哈希表 key 中的指定字段的整数值加上增量 increment 。
	 * @param key
	 * @param field
	 * @param inc
	 * @return
	 */
	public Long hIncrBy(final String key, final String field, final Long inc){
		final byte[] bkey = key.getBytes();
		final byte[] bfield = field.getBytes();
		Long result = redisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.hIncrBy(bkey, bfield, inc);
			}
		});
		return  result;
	}
}
