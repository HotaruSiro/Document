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
public class GioitinhBLL {
    	private GioitinhDAL dal;
	
	public GioitinhBLL() {
		dal = new GioitinhDAL();
	}

	public List<Gioitinh> listAll()  {
		return dal.list();
	}
	
	public void save(Gioitinh gt) throws Exception {
		dal.save(gt);
	}
	
	public void delete(Gioitinh gt) throws Exception {
		dal.delete(gt);
	}

}
