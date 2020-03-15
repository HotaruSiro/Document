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
public class BangcapBLL {
    	private BangcapDAL dal;
	
	public BangcapBLL() {
		dal = new BangcapDAL();
	}

	public List<Bangcap> listAll()  {
		return dal.list();
	}
	
	public void save(Bangcap bc) throws Exception {
		dal.save(bc);
	}
	
	public void delete(Bangcap bc) throws Exception {
		dal.delete(bc);
	}
}

//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
//
//<hibernate-configuration>
//  <session-factory>
//    <property name="hibernate.dialect">org.hibernate.dialect.DerbyDialect</property>
//    <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
//    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/qlemployee?zeroDateTimeBehavior=convertToNull</property>
//    <property name="hibernate.connection.username">root</property>
//    <mapping class="ims.dto.Bangcap"/>
//    <mapping class="ims.dto.Chucvu"/>
//    <mapping class="ims.dto.Congviec"/>
//    <mapping class="ims.dto.Dantoc"/>
//    <mapping class="ims.dto.Employee"/>
//    <mapping class="ims.dto.Hocvan"/>
//      <mapping class="ims.dto.Gioitinh"/>
//    <mapping class="ims.dto.Loainhanvien"/>
//    <mapping class="ims.dto.Ngoaingu"/>
//    <mapping class="ims.dto.Phongban"/>
//    <mapping class="ims.dto.Quoctich"/>
//    <mapping class="ims.dto.Tinhhoc"/>
//    <mapping class="ims.dto.Tinhthanh"/>
//    <mapping class="ims.dto.Tongiao"/>
//  </session-factory>
//</hibernate-configuration>
