package com.sky.service;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

  //根据类型查询分类数据
  public List<Category> getCategoryByType(Integer type);

  //分页查询分类信息
    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    //新增分类
  void add(CategoryDTO categoryDTO);

  //删除分类
  void delete(long id);

  //修改分类
  void update(CategoryDTO categoryDTO);

  //启用禁用分类
  void startOrStop(Integer status, Long id);
}
