package Factory;

import Dao.UserDao;
import Proxy.UserDaoProxy;

public class UserDaoFactory {
	public static UserDao getUserDaoInstance() throws Exception{
		return new UserDaoProxy() ;
	}
}
