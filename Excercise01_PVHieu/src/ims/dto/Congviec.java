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
@Table(name = "congviec")
public class Congviec {

    private int Macongviec;
    private String Tencongviec;
    private Set<Employee> employee;

    @Id
    @Column(name = "Macongviec")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMacongviec() {
        return Macongviec;
    }

    public Congviec(int Macongviec, String Tencongviec, Set<Employee> employee) {
        this.Macongviec = Macongviec;
        this.Tencongviec = Tencongviec;
        this.employee = employee;
    }

    public Congviec() {
    }

    public void setMacongviec(int Macongviec) {
        this.Macongviec = Macongviec;
    }

    @Column(name = "Tencongviec")
    public String getTencongviec() {
        return Tencongviec;
    }

    public void setTencongviec(String Tencongviec) {
        this.Tencongviec = Tencongviec;
    }

    @OneToMany(mappedBy = "congviec", cascade = CascadeType.ALL)

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return Tencongviec;
    }
}
