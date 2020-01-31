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
@Table(name = "chucvu")
public class Chucvu {

    private int Machucvu;
    private String Tenchucvu;
    private Set<Employee> employee;

    public Chucvu() {
    }

    public Chucvu(int Machucvu, String Tenchucvu, Set<Employee> employee) {
        this.Machucvu = Machucvu;
        this.Tenchucvu = Tenchucvu;
        this.employee = employee;
    }

    @Id
    @Column(name = "Machucvu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMachucvu() {
        return Machucvu;
    }

    public void setMachucvu(int Machucvu) {
        this.Machucvu = Machucvu;
    }

    @Column(name = "Tenchucvu")
    public String getTenchucvu() {
        return Tenchucvu;
    }

    public void setTenchucvu(String Tenchucvu) {
        this.Tenchucvu = Tenchucvu;
    }

    @OneToMany(mappedBy = "chucvu", cascade = CascadeType.ALL)

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return Tenchucvu;
    }

}
