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
@Table(name = "phongban")
public class Phongban {

    private int Maphongban;
    private String Tenphongban;
    private Set<Employee> employee;

    public Phongban() {
    }

    public Phongban(int Maphongban, String Tenphongban, Set<Employee> employee) {
        this.Maphongban = Maphongban;
        this.Tenphongban = Tenphongban;
        this.employee = employee;
    }

    @Id
    @Column(name = "Maphongban")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMaphongban() {
        return Maphongban;
    }

    public void setMaphongban(int Maphongban) {
        this.Maphongban = Maphongban;
    }

    @Column(name = "Tenphongban")
    public String getTenphongban() {
        return Tenphongban;
    }

    public void setTenphongban(String Tenphongban) {
        this.Tenphongban = Tenphongban;
    }

    @OneToMany(mappedBy = "phongban", cascade = CascadeType.ALL)
    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return Tenphongban;
    }
}
