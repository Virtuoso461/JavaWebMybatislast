package com.itheima.mapper;


import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {

    /**
     * 查询所有
     */
    List<Brand> selectAll();

    Brand selectById(int id);

    /**
     * 条件查询
     *  *查询参数
     *      1散装参数 需要使用@Param(“SQL语句参数占位名称”）
     *      2对象参数 对象的属性名称要和占位符名称一致
     *      3集合参数
     *
     * @param status
     * @param companyName
     * @param brandName
     * @return
     */
    //List<Brand> selectByCondition(@Param("status")int status, @Param("companyName")String companyName, @Param("brandName")String brandName);

    //List<Brand> selectByCondition(Brand brand);

    List<Brand> selectByCondition(Map map);

    List<Brand> selectByConditionSingle(Brand brand);

    void add(Brand brand);

    int update(Brand brand);

    void deleteById(int id);

    void deleteIds(@Param("ids") int[] ids);
}
