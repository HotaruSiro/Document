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
@Table(name = "tinhthanh")
public class Tinhthanh {

    private int Matinhthanh;
    private String Tentinhthanh;
    private Set<Employee> employee;

    public Tinhthanh(int Matinhthanh, String Tentinhthanh, Set<Employee> employee) {
        this.Matinhthanh = Matinhthanh;
        this.Tentinhthanh = Tentinhthanh;
        this.employee = employee;
    }

    public Tinhthanh() {
    }

    @Id
    @Column(name = "Matinhthanh")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getMatinhthanh() {
        return Matinhthanh;
    }

    public void setMatinhthanh(int Matinhthanh) {
        this.Matinhthanh = Matinhthanh;
    }

    @Column(name = "Tentinhthanh")
    public String getTentinhthanh() {
        return Tentinhthanh;
    }

    public void setTentinhthanh(String Tentinhthanh) {
        this.Tentinhthanh = Tentinhthanh;
    }

    @OneToMany(mappedBy = "tinhthanh", cascade = CascadeType.ALL)
    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return Tentinhthanh;
    }
}
