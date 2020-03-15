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
public class DantocBLL {
    private DantocDAL dal;
	
	public DantocBLL() {
		dal = new DantocDAL();
	}

	public List<Dantoc> listAll()  {
		return dal.list();
	}
	
	public void save(Dantoc dt) throws Exception {
		dal.save(dt);
	}
	
	public void delete(Dantoc dt) throws Exception {
		dal.delete(dt);
	}
}
