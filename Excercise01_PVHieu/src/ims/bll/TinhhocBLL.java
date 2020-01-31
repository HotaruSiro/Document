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
public class TinhhocBLL {
    private TinhhocDAL dal;
	
	public TinhhocBLL() {
		dal = new TinhhocDAL();
	}

	public List<Tinhhoc> listAll()  {
		return dal.list();
	}
	
	public void save(Tinhhoc th) throws Exception {
		dal.save(th);
	}
	
	public void delete(Tinhhoc th) throws Exception {
		dal.delete(th);
	}

}
