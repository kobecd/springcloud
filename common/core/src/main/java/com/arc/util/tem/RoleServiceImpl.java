//package com.arc.util;
//
//import cn.com.besttone.csp.context.api.Api;
//import cn.com.besttone.csp.context.api.ApiClient;
//import cn.com.besttone.csp.context.api.ApiResponse;
//import cn.com.besttone.csp.context.web.WebResult;
//import cn.com.besttone.csp.model.sys.Realm;
//import cn.com.besttone.csp.model.sys.Role;
//import cn.com.besttone.csp.query.sys.RoleQuery;
//import cn.com.besttone.csp.web.service.system.RoleService;
//import com.fasterxml.jackson.core.type.TypeReference;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.ConfigAttribute;
//import org.springframework.security.access.SecurityConfig;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service
//public class RoleServiceImpl implements RoleService {
//
//    @Autowired
//    private ApiClient client;
//
//    /**
//     * 获取一个role  by  roleName
//     *
//     * @param roleName
//     * @return
//     */
//    @Override
//    public Role getByRoleName(String roleName) {
//        Map<String, Object> uriVariables = new HashMap<>();
//        uriVariables.put("roleName", roleName);
//        TypeReference<ApiResponse<Role>> typeRef = new TypeReference<ApiResponse<Role>>() {
//        };
//        ApiResponse<Role> resp = client.get(Api.CSP_MS_SYSTEM, "/role/rolename", typeRef, uriVariables);
//        Role role = resp.getResult();
//        return role;
//    }
//
//    /**
//     * 列表显示 roles
//     *
//     * @param query
//     * @return
//     */
//    @Override
//    public WebResult page(RoleQuery query) {
//        TypeReference<ApiResponse<List<Role>>> typeRef = new TypeReference<ApiResponse<List<Role>>>() {
//        };
//        ApiResponse<List<Role>> apiResponse = client.postJson(Api.CSP_MS_SYSTEM, "/role/page", typeRef, query);
//        WebResult build = WebResult.build(apiResponse);
//        return build;
//    }
//
//    /**
//     * 保存 role
//     *
//     * @param role
//     * @return
//     */
//    @Override
//    public WebResult save(Role role) {
//        TypeReference<ApiResponse<String>> typeRef = new TypeReference<ApiResponse<String>>() {
//        };
//        ApiResponse<String> apiResponse = client.postJson(Api.CSP_MS_SYSTEM, "/role/save", typeRef, role);
//        return WebResult.build(apiResponse);
//    }
//
//    /**
//     * 更新 role
//     *
//     * @param role
//     * @return
//     */
//    @Override
//    public WebResult update(Role role) {
//        TypeReference<ApiResponse<Integer>> typeRef = new TypeReference<ApiResponse<Integer>>() {
//        };
//        ApiResponse<Integer> apiResponse = client.postJson(Api.CSP_MS_SYSTEM, "/role/update", typeRef, role);
//        return WebResult.build(apiResponse);
//    }
//
//    /**
//     * 删除 单个role
//     *
//     * @param id
//     * @return
//     */
//    @Override
//    public WebResult delete(String id) {
//        Map<String, Object> uriVariables = new HashMap<>();
//        uriVariables.put("id", id);
//        TypeReference<ApiResponse<Integer>> typeRef = new TypeReference<ApiResponse<Integer>>() {
//        };
//        ApiResponse<Integer> resp = client.get(Api.CSP_MS_SYSTEM, "/role/delete", typeRef, uriVariables);
//        return WebResult.build(resp);
//    }
//
//
//    @Override
//    public WebResult get(String id) {
//        return null;
//    }
//
//    /**
//     * 获取权限列表
//     *
//     * @return
//     */
//    @Override
//    public WebResult list() {
//        Map<String, Object> uriVariables = new HashMap<>();
//        TypeReference<ApiResponse<List<Role>>> typeRef = new TypeReference<ApiResponse<List<Role>>>() {
//        };
//        ApiResponse<List<Role>> resp = client.get(Api.CSP_MS_SYSTEM, "/role/list", typeRef, uriVariables);
//        return WebResult.build(resp);
//    }
//
//    /**
//     * 查询所有 资源路径和 角色
//     *
//     * @return map<url,role>
//     */
//    @Override
//    public Map<String, Collection<ConfigAttribute>> listRealmAndRole() {
//        //1 调用微服务 查数据
//        Map<String, Object> uriVariables = new HashMap<>();
//        TypeReference<ApiResponse<List<Role>>> typeRef = new TypeReference<ApiResponse<List<Role>>>() {
//        };
//        ApiResponse<List<Role>> resp = client.get(Api.CSP_MS_SYSTEM, "/role/realm/list", typeRef, uriVariables);
//        List<Role> roles = resp.getResult();//roles with realms
//
//        //2组装map
//        Map<String, Collection<ConfigAttribute>> resources = new HashMap<String, Collection<ConfigAttribute>>();//属性
//        ArrayList<String> roleNames = new ArrayList<>();
//
//
//        //map< url , list<roleName>>
//
//        for (Role role : roles) {
//            List<Realm> realms = role.getRealms();//获取资源集合
//
//            ConfigAttribute securityAttribute = new SecurityConfig(role.getRoleName());// [] spring 的角色名称 roleName
//            String url = null;
//            for (Realm realm : realms) {
//                //会有相同资源的role被覆盖！！  如何处理
//                url = realm.getPath();
//                if (resources.containsKey(url)) {
//                    Collection<ConfigAttribute> configAttribute = resources.get(url);
//                    configAttribute.add(securityAttribute);
//                    resources.put(url, configAttribute);
//                } else {
//                    Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
//                    atts.add(securityAttribute);
//                    resources.put(url, atts);
//                }
//            }
//            System.out.println();
//            System.out.println();
//            System.out.println(resources);
//            System.out.println(resources);
//
////            Map<String, Object> map = new HashMap<>();
////            List<Realm> realms = role.getRealms();
////            for (Realm realm : realms) {
////                map.put(realm.getPath(), role.getRoleName());
////                resources.add()
////            }
//
//        }
//        return resources;
//    }
//}
