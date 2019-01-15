package com.rongyi.easy.malllife.common.util;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class UpPicToYun {

	protected static final String BUCKET_NAME = "rongyi"; // 云服务器上的空间名
	protected static final String YUN_USERNAME = "gongzhen";
	protected static final String YUN_PASSWORD = "rynw87^%43";

	/**
	 * 同步上传图片 e
	 * 
	 * @return
	 * @throws IOException
	 */
	public boolean uploadPicBySync(String filePath, String picUrl) throws IOException {
		UpYun upyun = new UpYun(BUCKET_NAME, YUN_USERNAME, YUN_PASSWORD);
		File file = new File(filePath);
		return upyun.writeFile(picUrl, file, true);
	}

	/**
	 * 图片直接上传到云
	 *
	 * @param filePath
	 * @param datas
	 * @return
	 * @throws IOException
	 */
	public boolean uploadToYun(String filePath, byte[] datas) throws IOException {
		UpYun upyun = new UpYun(BUCKET_NAME, YUN_USERNAME, YUN_PASSWORD);
		return upyun.writeFile(filePath, datas, true);
	}
	
	public String readFile(String filePath) throws IOException {
		UpYun upyun = new UpYun(BUCKET_NAME, YUN_USERNAME, YUN_PASSWORD);
		return upyun.readFile(filePath);
	}
	
	public Map<String, String> getFileInfo(String filePath) {
		UpYun upyun = new UpYun(BUCKET_NAME, YUN_USERNAME, YUN_PASSWORD);
		return upyun.getFileInfo(filePath);
	}

	public boolean deleteFile(String filePath){
		UpYun upyun = new UpYun(BUCKET_NAME, YUN_USERNAME, YUN_PASSWORD);
		return upyun.deleteFile(filePath);
	}

	/**
	 * 资源上传到云盘
	 *
	 * @param localFilePath 本地资源全路径， 例如/data/ss.txt
	 * @param remoteFilePath 云盘资源全路径 例如/system/yun/ss.txt
	 * @return
	 * @throws IOException
	 */
	public boolean writeFile(String localFilePath, String remoteFilePath) throws IOException{
		UpYun upyun = new UpYun(BUCKET_NAME, YUN_USERNAME, YUN_PASSWORD);
		File file = new File(localFilePath);
		return upyun.writeFile(remoteFilePath, file);
	}

	public boolean writeFile(String localFilePath, String remoteFilePath, boolean auto) throws IOException{
		UpYun upyun = new UpYun(BUCKET_NAME, YUN_USERNAME, YUN_PASSWORD);
		File file = new File(localFilePath);
		return upyun.writeFile(remoteFilePath, file, auto);
	}

}
