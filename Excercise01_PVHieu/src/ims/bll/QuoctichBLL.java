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
public class QuoctichBLL {
    	private QuoctichDAL dal;
	
	public QuoctichBLL() {
		dal = new QuoctichDAL();
	}

	public List<Quoctich> listAll()  {
		return dal.list();
	}
	
	public void save(Quoctich qt) throws Exception {
		dal.save(qt);
	}
	
	public void delete(Quoctich qt) throws Exception {
		dal.delete(qt);
	}
}
