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
public class CongviecDAL extends BaseDAL{
    public long save(Congviec dep) throws Exception {
	session.beginTransaction();
	Long MaNV = (Long) session.save(dep);
        session.getTransaction().commit();
        return MaNV;
    }
	
    public void delete(Congviec dep) throws Exception {
	session.beginTransaction();
	session.delete(dep);
	session.getTransaction().commit();
    }
        
    public List<Congviec> list() {
        List<Congviec> result = new ArrayList<Congviec>();         
        result = session.createQuery("FROM Congviec").list();
        return result;
    }
}
