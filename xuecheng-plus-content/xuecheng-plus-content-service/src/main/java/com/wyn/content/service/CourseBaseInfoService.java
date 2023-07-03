package com.wyn.content.service;


import com.wyn.content.model.dto.AddCourseDto;
import com.wyn.content.model.dto.CourseBaseInfoDto;
import com.wyn.content.model.dto.EditCourseDto;
import com.wyn.content.model.dto.QueryCourseParamsDto;
import com.wyn.content.model.po.CourseBase;
import com.wyn.model.PageParams;
import com.wyn.model.PageResult;


/**
 * @description 课程基本信息管理业务接口
 *  @author Mr.M
 *  @date 2022/9/6 21:42
 *  @version 1.0
 */
public interface CourseBaseInfoService {
    /**
     *
     @description 课程查询接口
      * @param pageParams 分页参数
     * @param queryCourseParamsDto 条件条件
     * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
     * @author Mr.M
     * @date 2022/9/6 21:44
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * @description 添加课程基本信息
     * @param companyId  教学机构id
     * @param addCourseDto  课程基本信息
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @author Mr.M
     * @date 2022/9/7 17:51
     */
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    /**
     * 查询课程
     * @param courseId 课程id
     * @return
     */
    CourseBaseInfoDto getCourseBaseInfo(long courseId);


    /**
     * @description 修改课程信息
     * @param companyId  机构id
     * @param dto  课程信息
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @author Mr.M
     * @date 2022/9/8 21:04
     */
    public CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto dto);
}
