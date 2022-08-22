package com.yjy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yjy.model.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper extends BaseMapper<Users> {
//    public List<Users> findAllUsr(@Param("page") int page, @Param("limit") int limit, @Param("user_name") String username);
//    public int getCount(String username);
}
