package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    /**
     * 根据类型查询
     * @param type
     * @return
     */
   public List<Category> getCategoryByType(Integer type);

    /**
     * 分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    /**
     * 新增分类
     * @param category
     */
    void insert(Category category);

    public Category queryById(Long id);

    @Delete("delete from category where id = #{id}")
    void delete(long id);

    void update(Category category);
}
