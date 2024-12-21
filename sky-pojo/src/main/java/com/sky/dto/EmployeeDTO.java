package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data//前端提交的数据和实体类中对应的属性差别较大时，用DTO类封装数据
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
