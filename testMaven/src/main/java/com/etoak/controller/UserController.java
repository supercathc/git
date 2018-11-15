package com.etoak.controller;

import com.etoak.bean.User;
import com.etoak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserService service;
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> add(User u){
		Map<String,Object> map = new HashMap<>();
		try{
		service.addUser(u);
		map.put("flag", "success");
		map.put("msg","用户名"+u.getUsername()+"成功");
			System.out.println(map);
		}catch(Exception e){
			e.printStackTrace();
			map.put("flag", "error");
			map.put("msg",e.getMessage());
		}
		return map;
	}
}
