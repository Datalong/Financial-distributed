package com.atlong.mybatisplus.entity;

/**
 * @Auther: datalong
 * @Date: 2021/11/23 - 11 - 10:17
 * @Description: com.atlong.mybatisplus.entity
 * @version: 1.0
 */

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value = "t_user")
@Data /*简化实体类的 帮你添加*/
public class User {

    @TableId
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
