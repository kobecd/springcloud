package com.arc.swagger3.controller;

import com.arc.swagger3.service.AreaService;
import com.arc.swagger3.model.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 系统地区信息的接口
 *
 * @author yeChao
 * @date 2018/12/27
 */
@Api(value = "系统地区信息的接口")
@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @ApiOperation(value = "根据code查询地区码", notes = "根据code查询地区码")
    @ApiImplicitParam(name = "code", value = "6位地区码", required = true)
    @GetMapping("/get")
    public ResponseVo get(String code) {
        return ResponseVo.success(areaService.get(code));
    }

    @ApiOperation(value = "查询树形结构地区码", notes = "根节点为请求参数中root的地区对象，子节点从children中可以获得，该方法将递归到最后一层")
    @ApiImplicitParam(name = "root", value = "树形根节点6位地区码", required = false)
    @GetMapping("/tree")
    public ResponseVo tree(@RequestParam(value = "root", required = true, defaultValue = "000000") String root) {
        return ResponseVo.success(areaService.tree(root));
    }

    @ApiOperation(value = "查询树形结构市级码", notes = "根节点为请求参数中root的市级对象，子节点从children中可以获得，该方法将递归到最后一层")
    @ApiImplicitParam(name = "root", value = "树形根节点6位地区码", required = false)
    @GetMapping("/tree/city")
    public ResponseVo treeCity(@RequestParam(value = "root", required = true, defaultValue = "000000") String root) {
        return ResponseVo.success(areaService.treeCity(root));
    }

    @ApiOperation(value = "查询子节点列表", notes = "根据root参数查询下属子节点列表，该方法只取下属一层子集")
    @ApiImplicitParam(name = "root", value = "树形根节点6位地区码", required = false)
    @GetMapping("/list/children")
    public ResponseVo listChildren(
            @RequestParam(value = "root", required = true, defaultValue = "000000") String root) {
        return ResponseVo.success(areaService.listChildren(root));
    }

    @GetMapping("/get/shortCode/level")
    public ResponseVo getByShortCodeAndLevel(
            @RequestParam(value = "shortCode", required = true) String shortCode,
            @RequestParam(value = "level", required = true) String level) {
        return ResponseVo.success(areaService.getByShortCodeAndLevel(shortCode, level));
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseVo list(@RequestBody List<String> areaCodes) {
        return ResponseVo.success(areaService.list(areaCodes));
    }

}
