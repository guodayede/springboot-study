package com.gyc.mapper;

import com.gyc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> selectAll();
}
