package com.wyn.content.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wyn.content.mapper.CourseTeacherMapper;
import com.wyn.content.model.dto.TeachplanDto;
import com.wyn.content.model.po.CourseTeacher;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "师资管理编辑接口",tags = "师资管理编辑接口")
@RestController
public class CourseTeacherController {

    @Autowired
    CourseTeacherMapper courseTeacherMapper;

    @ApiOperation("查询师资管理")
    @GetMapping("/courseTeacher/list/{courseId}")
    public CourseTeacher getCourseTeacher(@PathVariable Long courseId){
        QueryWrapper<CourseTeacher> queryWrapper = new QueryWrapper();
        queryWrapper.eq("course_id",courseId);
        CourseTeacher courseTeacher = courseTeacherMapper.selectOne(queryWrapper);
        return courseTeacher;
    }


    @ApiOperation("添加师资")
    @PostMapping("/courseTeacher")
    public Integer addCourseTeacher(@RequestBody CourseTeacher courseTeacher){
        int insert = courseTeacherMapper.insert(courseTeacher);
        return insert;
    }


    @ApiOperation("修改师资")
    @PutMapping("/courseTeacher")
    public Integer updateCourseTeacher(@RequestBody CourseTeacher courseTeacher){
        int update = courseTeacherMapper.updateById(courseTeacher);
        return update;
    }


    @ApiOperation("删除师资")
    @DeleteMapping("/courseTeacher/course/{courseId}/{id}")
    public Integer deleteCourseTeacher(@PathVariable Long courseId,@PathVariable Long id){
        QueryWrapper<CourseTeacher> queryWrapper = new QueryWrapper();
        queryWrapper.eq("course_id",courseId);
        queryWrapper.eq("id",id);
        int delete = courseTeacherMapper.delete(queryWrapper);
        return delete;
    }
}
