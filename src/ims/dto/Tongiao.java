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
@Table(name = "tongiao")
public class Tongiao {

    private int Matongiao;
    private String Tentongiao;
    private Set<Employee> employee;

    public Tongiao(int Matongiao, String Tentongiao, Set<Employee> employee) {
        this.Matongiao = Matongiao;
        this.Tentongiao = Tentongiao;
        this.employee = employee;
    }

    @Id
    @Column(name = "Matongiao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMatongiao() {
        return Matongiao;
    }

    public void setMatongiao(int Matongiao) {
        this.Matongiao = Matongiao;
    }

    @Column(name = "Tentongiao")
    public String getTentongiao() {
        return Tentongiao;
    }

    public void setTentongiao(String Tentongiao) {
        this.Tentongiao = Tentongiao;
    }

    @OneToMany(mappedBy = "tongiao", cascade = CascadeType.ALL)
    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    public Tongiao() {
    }

    @Override
    public String toString() {
        return Tentongiao;
    }

}
