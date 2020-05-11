package com.vankireddy;

import java.util.ArrayList;
import java.util.List;

public class ChattingMediatorImpl implements ChattingMediator {
	
	private List<User> userList;

	@Override
	public void sendMessage(String message, User user)
	{
		userList = new ArrayList<User>();

	}

	@Override
	public void addUser(User user) {
		userList.add(user);

	}

}
