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
public class DantocDAL extends BaseDAL{
    public long save(Dantoc dep) throws Exception {
	session.beginTransaction();
	Long MaNV = (Long) session.save(dep);
        session.getTransaction().commit();
        return MaNV;
    }
	
    public void delete(Dantoc dep) throws Exception {
	session.beginTransaction();
	session.delete(dep);
	session.getTransaction().commit();
    }
        
    public List<Dantoc> list() {
        List<Dantoc> result = new ArrayList<Dantoc>();         
        result = session.createQuery("FROM Dantoc").list();
        return result;
    }
    
}
