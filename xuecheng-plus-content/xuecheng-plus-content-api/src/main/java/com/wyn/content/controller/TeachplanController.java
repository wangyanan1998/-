package com.wyn.content.controller;


import com.wyn.content.model.dto.SaveTeachplanDto;
import com.wyn.content.model.dto.TeachplanDto;
import com.wyn.content.service.TeachplanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description 课程计划编辑接口
 * @author Mr.M
 * @date 2022/9/6 11:29
 * @version 1.0
 */
@Api(value = "课程计划编辑接口",tags = "课程计划编辑接口")
@RestController
public class TeachplanController {

    @Autowired
    TeachplanService teachplanService;

    @ApiOperation("查询课程计划树形结构")
    @ApiImplicitParam(value = "courseId",name = "课程Id",required = true,dataType = "Long",paramType = "path")
    @GetMapping("/teachplan/{courseId}/tree-nodes")
    public List<TeachplanDto> getTreeNodes(@PathVariable Long courseId){

        return teachplanService.findTeachplanTree(courseId);
    }


    @ApiOperation("课程计划创建或修改")
    @PostMapping("/teachplan")
    public void saveTeachplan( @RequestBody SaveTeachplanDto teachplan){

        teachplanService.saveTeachplan(teachplan);
    }



    @ApiOperation("删除课程计划")
    @DeleteMapping("/teachplan/{courseId}")
    public Integer removeTreeNodes(@PathVariable Long courseId){
        int i = teachplanService.deleteTeachplanTree(courseId);
        return i;
    }




    @ApiOperation("上移课程计划")
    @PostMapping ("/teachplan/moveup/{courseId}")
    public Integer moveupTreeNodes(@PathVariable Long courseId){

        //TODO:上移课程计划

        return null;
    }



    @ApiOperation("下移课程计划")
    @PostMapping("/teachplan/movedown/{courseId}")
    public Integer movedownTreeNodes(@PathVariable Long courseId){


        //TODO:下移课程计划

        return null;
    }



}
