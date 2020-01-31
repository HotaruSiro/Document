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
public class CongviecBLL {
    private CongviecDAL dal;
	
	public CongviecBLL() {
		dal = new CongviecDAL();
	}

	public List<Congviec> listAll()  {
		return dal.list();
	}
	
	public void save(Congviec viec) throws Exception {
		dal.save(viec);
	}
	
	public void delete(Congviec viec) throws Exception {
		dal.delete(viec);
	}
}
