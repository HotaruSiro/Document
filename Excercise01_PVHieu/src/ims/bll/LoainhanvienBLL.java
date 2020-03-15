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
public class LoainhanvienBLL {
    private LoainhanvienDAL dal;
	
	public LoainhanvienBLL() {
		dal = new LoainhanvienDAL();
	}

	public List<Loainhanvien> listAll()  {
		return dal.list();
	}
	
	public void save(Loainhanvien lnv) throws Exception {
		dal.save(lnv);
	}
	
	public void delete(Loainhanvien lnv) throws Exception {
		dal.delete(lnv);
	}
}
