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
@Table(name = "gioitinh")

public class Gioitinh {

    private int Magioitinh;
    private String Tengioitinh;
    private Set<Employee> employee;

    public Gioitinh() {
    }

    public Gioitinh(int Magioitinh, String Tengioitinh, Set<Employee> employee) {
        this.Magioitinh = Magioitinh;
        this.Tengioitinh = Tengioitinh;
        this.employee = employee;
    }

    @Id
    @Column(name = "Magioitinh")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getMagioitinh() {
        return Magioitinh;
    }

    public void setMagioitinh(int Magioitinh) {
        this.Magioitinh = Magioitinh;
    }

    @Column(name = "Tengioitinh")
    public String getTengioitinh() {
        return Tengioitinh;
    }

    public void setTengioitinh(String Tengioitinh) {
        this.Tengioitinh = Tengioitinh;
    }

    @OneToMany(mappedBy = "gioitinh", cascade = CascadeType.ALL)

    public Set<Employee> getEmployee() {
        return employee;
    }

    
    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return Tengioitinh;
    }

}
