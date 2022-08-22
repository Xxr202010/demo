package com.yjy.controller;

import com.yjy.model.LayuiPage;
import com.yjy.model.Users;
import com.yjy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 徐晓瑞
 * @date 2022/8/19 17:38
 * @describe:
 */

@RestController
@RequestMapping("/Users")
public class UsersController {

    @Resource
    private UsersService usersService;

//    @RequestMapping("/findAll")
//    public LayuiPage pageData(int page, int limit) {
//        //传入分页的属性
//        Page<Users> pager = new Page<>(page,limit);
//        //分页查询学校信息
//        IPage<Users> schoolPage = usersService.page(pager, new QueryWrapper<>());
//        // schoolPage.getTotal() 信息总条数
//        // schoolPage.getRecords() 分页数据
//        return new LayuiPage(schoolPage.getTotal(),schoolPage.getRecords());
//    }

//    @RequestMapping("/findAll")
//    public Map findAllUsers(int page, int limit, String username){
//        Map map = usersService.findAllUsers(page, limit, username);
//        return map;
//    }

    @RequestMapping("/findAll")
    public LinkedHashMap<String, Object> pageData() {
        LinkedHashMap<String, Object> map = usersService.select();
        return map;
    }

    @RequestMapping("addUser")
    public int insert(Users users){
        int insert = usersService.insert(users);
        return insert;
    }

    @RequestMapping("findById")
    public Users findById(int id, HttpSession session){
        Users user = usersService.findById(id);
        session.setAttribute("user",user);
        return user;
    }
}
