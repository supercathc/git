package com.etoak.service;


import com.etoak.bean.User;
import com.etoak.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName={"java.lang.Exception"})
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;

	@Override

	public void addUser(User u) {
		int x =  mapper.add(u);
		if(x<=0){
			throw new RuntimeException("�����û�"+u.getUsername()+"ʧ��");
		}
	}
	
	
}
