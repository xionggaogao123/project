package Dao;

import Bean.User;

public interface UserDao { //�û���¼��ע��
	public boolean login(User user);
	public boolean register(User user);
}
