package com.yjy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yjy.model.Users;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface UsersService extends IService<Users> {
//    public Map findAllUsers(int page, int limit, String desc);

//    LinkedHashMap<String, Object> select(int page, int limit);
      public LinkedHashMap<String, Object> select();
      public int insert(Users users);
      public Users findById(int id);
}
