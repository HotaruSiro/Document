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
public class NgoainguBLL {
    	private NgoainguDAL dal;
	
	public NgoainguBLL() {
		dal = new NgoainguDAL();
	}

	public List<Ngoaingu> listAll()  {
		return dal.list();
	}
	
	public void save(Ngoaingu nn) throws Exception {
		dal.save(nn);
	}
	
	public void delete(Ngoaingu nn) throws Exception {
		dal.delete(nn);
	}

}
