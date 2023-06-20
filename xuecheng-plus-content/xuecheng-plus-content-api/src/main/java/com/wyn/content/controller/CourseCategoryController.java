package com.wyn.content.controller;

import com.wyn.content.model.dto.CourseCategoryTreeDto;
import com.wyn.content.service.CourseCategoryService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 数据字典 前端控制器
 * </p>
 *
 * @author itcast
 */
@Slf4j
@RestController
public class CourseCategoryController {


    @Autowired
    CourseCategoryService courseCategoryService;

    @GetMapping("/course-category/tree-nodes")
    @ApiOperation("课程节点信息查询")
    public List<CourseCategoryTreeDto> queryTreeNodes() {
        return courseCategoryService.queryTreeNodes("1");
    }
}
