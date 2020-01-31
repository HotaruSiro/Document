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
public class HocvanBLL {
    	private HocvanDAL dal;
	
	public HocvanBLL() {
		dal = new HocvanDAL();
	}

	public List<Hocvan> listAll()  {
		return dal.list();
	}
	
	public void save(Hocvan hv) throws Exception {
		dal.save(hv);
	}
	
	public void delete(Hocvan hv) throws Exception {
		dal.delete(hv);
	}

}
