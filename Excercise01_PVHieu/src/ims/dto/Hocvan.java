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
@Table(name = "hocvan")
public class Hocvan {

    private int Mahocvan;
    private String Tenhocvan;
    private Set<Employee> employee;

    public Hocvan() {
    }

    public Hocvan(int Mahocvan, String Tenhocvan, Set<Employee> employee) {
        this.Mahocvan = Mahocvan;
        this.Tenhocvan = Tenhocvan;
        this.employee = employee;
    }

    @Id
    @Column(name = "Mahocvan")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMahocvan() {
        return Mahocvan;
    }

    public void setMahocvan(int Mahocvan) {
        this.Mahocvan = Mahocvan;
    }

    @Column(name = "Tenhocvan")
    public String getTenhocvan() {
        return Tenhocvan;
    }

    public void setTenhocvan(String Tenhocvan) {
        this.Tenhocvan = Tenhocvan;
    }

    @OneToMany(mappedBy = "hocvan", cascade = CascadeType.ALL)

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return Tenhocvan;
    }

}
