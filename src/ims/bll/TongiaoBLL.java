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
public class TongiaoBLL {
    private TongiaoDAL dal;
	
	public TongiaoBLL() {
		dal = new TongiaoDAL();
	}

	public List<Tongiao> listAll()  {
		return dal.list();
	}
	
	public void save(Tongiao tg) throws Exception {
		dal.save(tg);
	}
	
	public void delete(Tongiao tg) throws Exception {
		dal.delete(tg);
	}

}
