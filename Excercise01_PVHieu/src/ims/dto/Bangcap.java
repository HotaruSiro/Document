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
@Table(name = "bangcap")
public class Bangcap {

    private int Mabangcap;
    private String Tenbangcap;
    private Set<Employee> employee;

    public Bangcap(int Mabangcap, String Tenbangcap, Set<Employee> employee) {
        this.Mabangcap = Mabangcap;
        this.Tenbangcap = Tenbangcap;
        this.employee = employee;
    }

    public Bangcap() {
    }
    @Id
    @Column(name = "Mabangcap")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMabangcap() {
        return Mabangcap;
    }

    public void setMabangcap(int Mabangcap) {
        this.Mabangcap = Mabangcap;
    }
     @Column(name = "Tenbangcap")
    public String getTenbangcap() {
        return Tenbangcap;
    }

    public void setTenbangcap(String Tenbangcap) {
        this.Tenbangcap = Tenbangcap;
    }
@OneToMany(mappedBy="bangcap", cascade = CascadeType.ALL)
    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
        @Override
        public String toString()
        {
            return Tenbangcap;
        }
}
