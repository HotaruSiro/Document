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
@Table(name = "tinhhoc")
public class Tinhhoc {

    private int Matinhoc;
    private String Tentinhoc;
    private Set<Employee> employee;

    public Tinhhoc() {
    }

    public Tinhhoc(int Matinhoc, String Tentinhoc, Set<Employee> employee) {
        this.Matinhoc = Matinhoc;
        this.Tentinhoc = Tentinhoc;
        this.employee = employee;
    }

    @Id
    @Column(name = "Matinhoc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMatinhoc() {
        return Matinhoc;
    }

    public void setMatinhoc(int Matinhoc) {
        this.Matinhoc = Matinhoc;
    }

    @Column(name = "Tentinhoc")
    public String getTentinhoc() {
        return Tentinhoc;
    }

    public void setTentinhoc(String Tentinhoc) {
        this.Tentinhoc = Tentinhoc;
    }

    @OneToMany(mappedBy = "tinhhoc", cascade = CascadeType.ALL)
    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return Tentinhoc;
    }
}
