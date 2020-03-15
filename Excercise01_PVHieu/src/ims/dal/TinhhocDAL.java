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
public class TinhhocDAL extends BaseDAL{
    public long save(Tinhhoc dep) throws Exception {
	session.beginTransaction();
	Long MaNV = (Long) session.save(dep);
        session.getTransaction().commit();
        return MaNV;
    }
	
    public void delete(Tinhhoc dep) throws Exception {
	session.beginTransaction();
	session.delete(dep);
	session.getTransaction().commit();
    }
        
    public List<Tinhhoc> list() {
        List<Tinhhoc> result = new ArrayList<Tinhhoc>();         
        result = session.createQuery("FROM Tinhhoc").list();
        return result;
    }
    
}
