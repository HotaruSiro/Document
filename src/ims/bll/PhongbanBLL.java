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
public class PhongbanBLL {
    private  PhongbanDAL dal;
	
	public PhongbanBLL() {
		dal = new PhongbanDAL();
	}

	public List<Phongban> listAll()  {
		return dal.list();
	}
	
	public void save(Phongban pb) throws Exception {
		dal.save(pb);
	}
	
	public void delete(Phongban pb) throws Exception {
		dal.delete(pb);
	}
}
