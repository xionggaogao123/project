package Dao;

import Bean.User;

public interface UserDao { //ÓÃ»§µÇÂ¼¡¢×¢²á
	public boolean login(User user);
	public boolean register(User user);
}
