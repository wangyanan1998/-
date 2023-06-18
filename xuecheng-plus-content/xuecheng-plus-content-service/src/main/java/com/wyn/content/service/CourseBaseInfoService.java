package com.wyn.content.service;


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
}
