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
public class ChucvuBLL {
    	private ChucvuDAL dal;
	
	public ChucvuBLL() {
		dal = new ChucvuDAL();
	}

	public List<Chucvu> listAll()  {
		return dal.list();
	}
	
	public void save(Chucvu cv) throws Exception {
		dal.save(cv);
	}
	
	public void delete(Chucvu cv) throws Exception {
		dal.delete(cv);
	}
}
