package com.etoak.mapper;

import com.etoak.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface UserMapper {
	int add(User u);
	List<User> queryPage();
	int update(Map<String, Object> map);
}
