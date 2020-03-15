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
@Table(name = "ngoaingu")
public class Ngoaingu {

    private int Mangoaingu;
    private String Tenngoaingu;
    private Set<Employee> employee;

    public Ngoaingu() {
    }

    public Ngoaingu(int Mangoaingu, String Tenngoaingu, Set<Employee> employee) {
        this.Mangoaingu = Mangoaingu;
        this.Tenngoaingu = Tenngoaingu;
        this.employee = employee;
    }

    @Id
    @Column(name = "Mangoaingu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMangoaingu() {
        return Mangoaingu;
    }

    public void setMangoaingu(int Mangoaingu) {
        this.Mangoaingu = Mangoaingu;
    }

    @Column(name = "Tenngoaingu")
    public String getTenngoaingu() {
        return Tenngoaingu;
    }

    public void setTenngoaingu(String Tenngoaingu) {
        this.Tenngoaingu = Tenngoaingu;
    }

    @OneToMany(mappedBy = "ngoaingu", cascade = CascadeType.ALL)

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return Tenngoaingu;
    }
}
