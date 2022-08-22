package com.yjy.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author 徐晓瑞
 * @date 2022/8/19 16:10
 * @describe:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user_info")
public class Users {
    @TableId("userid")
    public String userid;
    public String username;
    public String userportrait;
    public String userphone;
    public Integer isdelete;
    public BigInteger createtime;
    public BigInteger updatetime;
    public Integer guardianid;
}
