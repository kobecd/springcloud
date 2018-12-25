package com.arc.mybatisplus.controller;

import com.arc.mybatisplus.model.entries.User;
import com.arc.mybatisplus.model.vo.ResponseVo;
import com.arc.mybatisplus.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 控制器
 * 作用：
 * 接收参数，访问一个url，带一些参数
 * 处理业务【与数据库交互，或者做一些判断】
 * 返回数据【1）返回一个html页面 2）返回JSON的字符串】
 *
 * @author yechao
 * @date 2018/12/21
 */

//@Slf4j 等效 private Logger logger = LoggerFactory.getLogger(FileController.class);
@Controller
@RequestMapping("/files")
public class FileController {

    private Logger log = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private UserService userService;


    /**
     * 查询所有的数据库中所有的file数据
     * 注意请求是GET方式的
     * http://localhost:80/files
     *
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public Object list() {
        return userService.list();
    }

    /**
     * 保存
     * 注意请求是POST方式的
     * http://localhost:80/files
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody  //用了这个注解返回的是json数据
    public ResponseVo save(@RequestBody User user) {
        log.debug("参数 {}", user);
        return ResponseVo.success(userService.save(user));
    }

    /**
     * 删除
     * 表示删除id为1的数据
     * http://localhost:80/files/delete//1
     *
     * @param id
     * @return
     */
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("id") Long id) {
        log.debug("删除id为{}的数据", id);
        return ResponseVo.success(userService.delete(id));
    }


    /**
     * 更新
     * 注意 1请求是POST方式的 2请求类型为Content-Type:application/json
     * 对于必要参数没有传则判断了一下会返回错误代码10000
     * http://localhost:80/files/update
     *
     * @param user
     * @return
     */
    @RequestMapping(path = "/update", method = {RequestMethod.PUT, RequestMethod.POST})
    @ResponseBody
    public Object update(@RequestBody User user) {
        if (user == null || user.getId() == null) {
            return ResponseVo.failure(1000, "必要属性未传");
        }
        return ResponseVo.success(userService.update(user));
    }


    /**
     * 通过id获取数据
     *
     * @param id
     * @return
     */
    @RequestMapping(path = "/get/id", method = RequestMethod.GET)
    @ResponseBody
    public Object get(@RequestParam(name = "id", required = true) Long id) {
        return ResponseVo.success(userService.get(id));
    }

    /**
     * 通过filename获取数据
     *
     * @param filename
     * @return
     */
    @RequestMapping(value = "/get/filename", method = RequestMethod.GET)
    @ResponseBody
    public Object getByfilename(@RequestParam(name = "filename", required = true) String filename) {
        return ResponseVo.success(userService.getByFilename(filename));
    }


}
