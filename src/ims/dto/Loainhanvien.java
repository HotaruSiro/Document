/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;

import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Dell
 */

@Entity
@Table(name = "loainhanvien")
public class Loainhanvien {

    private int Maloainv;
    private String Tenloainv;
    private Set<Employee> employee;

    public Loainhanvien() {
    }

    public Loainhanvien(int Maloainv, String Tenloainv, Set<Employee> employee) {
        this.Maloainv = Maloainv;
        this.Tenloainv = Tenloainv;
        this.employee = employee;
    }

    @Id
    @Column(name = "Maloainv")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMaloainv() {
        return Maloainv;
    }

    public void setMaloainv(int Maloainv) {
        this.Maloainv = Maloainv;
    }

    @Column(name = "Tenloainv")
    public String getTenloainv() {
        return Tenloainv;
    }

    public void setTenloainv(String Tenloainv) {
        this.Tenloainv = Tenloainv;
    }
    @OneToMany(mappedBy = "loainhanvien", cascade = CascadeType.ALL)
    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return Tenloainv;
    }

}
