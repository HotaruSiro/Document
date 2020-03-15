/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;
import ims.dto.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dell
 */
public class BangcapDAL extends BaseDAL{
    public long save(Bangcap dep) throws Exception {
	session.beginTransaction();
	Long MaNV = (Long) session.save(dep);
        session.getTransaction().commit();
        return MaNV;
    }
	
    public void delete(Bangcap dep) throws Exception {
	session.beginTransaction();
	session.delete(dep);
	session.getTransaction().commit();
    }
        
    public List<Bangcap> list() {
        List<Bangcap> result = new ArrayList<Bangcap>();         
        result = session.createQuery("FROM Bangcap").list();
        return result;
    }
    
}
