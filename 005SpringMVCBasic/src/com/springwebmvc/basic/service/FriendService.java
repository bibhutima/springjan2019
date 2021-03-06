package com.springwebmvc.basic.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwebmvc.basic.bean.Friend;
import com.springwebmvc.basic.dao.FriendDao;

@Service("friendService")
public class FriendService {
	
	@Autowired
	FriendDao friendDao;

	@Transactional
	public void saveFriend(Friend friend) {
		// TODO Auto-generated method stub
		
		friendDao.saveFriend(friend);
	}

	
	
}
