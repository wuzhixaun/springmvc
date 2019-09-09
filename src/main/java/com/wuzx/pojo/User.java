package com.wuzx.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @program: springmvc->User
 * @description:
 * @author: wuzx
 * @create: 2019-09-06 14:02
 * @version: 1.0
 **/
@Data
public class User {
    private Integer id;
    private String useraname;
    private Integer age;

    private Address address;

    private Date birth;

}
