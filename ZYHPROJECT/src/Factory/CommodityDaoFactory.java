package Factory;

import Dao.CommodityDao;
import Proxy.CommodityDaoProxy;

public class CommodityDaoFactory {
	public static CommodityDao getCommodityDaoInstance() throws Exception{
		return new CommodityDaoProxy() ;
	}
}
