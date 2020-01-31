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
@Table(name = "quoctich")
public class Quoctich {

    private int Maquoctich;
    private String Tenquoctich;
    private Set<Employee> employee;

    public Quoctich() {
    }

    public Quoctich(int Maquoctich, String Tenquoctich, Set<Employee> employee) {
        this.Maquoctich = Maquoctich;
        this.Tenquoctich = Tenquoctich;
        this.employee = employee;
    }

    @Id
    @Column(name = "Maquoctich")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMaquoctich() {
        return Maquoctich;
    }

    public void setMaquoctich(int Maquoctich) {
        this.Maquoctich = Maquoctich;
    }

    @Column(name = "Tenquoctich")
    public String getTenquoctich() {
        return Tenquoctich;
    }

    public void setTenquoctich(String Tenquoctich) {
        this.Tenquoctich = Tenquoctich;
    }

    @OneToMany(mappedBy = "quoctich", cascade = CascadeType.ALL)
    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return Tenquoctich;
    }
}
