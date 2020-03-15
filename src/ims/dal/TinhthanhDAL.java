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
public class TinhthanhDAL extends BaseDAL{
    public long save(Tinhthanh dep) throws Exception {
	session.beginTransaction();
	Long MaNV = (Long) session.save(dep);
        session.getTransaction().commit();
        return MaNV;
    }
	
    public void delete(Tinhthanh dep) throws Exception {
	session.beginTransaction();
	session.delete(dep);
	session.getTransaction().commit();
    }
        
    public List<Tinhthanh> list() {
        List<Tinhthanh> result = new ArrayList<Tinhthanh>();         
        result = session.createQuery("FROM Tinhthanh").list();
        return result;
    }
    
}
