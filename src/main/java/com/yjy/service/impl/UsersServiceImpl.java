package com.yjy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yjy.mapper.UsersMapper;
import com.yjy.model.Users;
import com.yjy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 徐晓瑞
 * @date 2022/8/19 17:31
 * @describe:
 */

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper,Users> implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public LinkedHashMap<String, Object> select() {
        List<Users> list = usersMapper.selectList(null);
        LinkedHashMap<String, Object>linkedHashMap=new LinkedHashMap<String, Object>();
        linkedHashMap.put("code", 0);
        linkedHashMap.put("msg", "");
        linkedHashMap.put("count", 1);
        linkedHashMap.put("data", list);
        return linkedHashMap;
    }

    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }

    @Override
    public Users findById(int id) {
        return usersMapper.selectById(id);
    }


//    @Override
//    public Map findAllUsers(int page, int limit, String username) {
//        List<Users> list = usersMapper.findAllUsr((page-1)*limit, limit,username);
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("code",0);
//        map.put("msg","");
//        map.put("count",usersMapper.getCount(username));
//        map.put("data",list);
//        return map;
//    }
}
