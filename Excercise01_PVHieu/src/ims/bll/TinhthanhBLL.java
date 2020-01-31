/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;
import ims.dal.*;
import ims.dto.*;
import java.util.List;
/**
 *
 * @author Dell
 */
public class TinhthanhBLL {
    private TinhthanhDAL dal;
	
	public TinhthanhBLL() {
		dal = new TinhthanhDAL();
	}

	public List<Tinhthanh> listAll()  {
		return dal.list();
	}
	
	public void save(Tinhthanh tt) throws Exception {
		dal.save(tt);
	}
	
	public void delete(Tinhthanh tt) throws Exception {
		dal.delete(tt);
	}
}
