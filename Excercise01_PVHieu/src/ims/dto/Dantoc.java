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
@Table(name = "dantoc")
public class Dantoc {
        private int Madantoc;
    private String Tendantoc;
    private Set<Employee> employee;

    public Dantoc() {
    }

    public Dantoc(int Madantoc, String Tendantoc, Set<Employee> employee) {
        this.Madantoc = Madantoc;
        this.Tendantoc = Tendantoc;
        this.employee = employee;
    }
    @Id
    @Column(name = "Madantoc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMadantoc() {
        return Madantoc;
    }

    public void setMadantoc(int Madantoc) {
        this.Madantoc = Madantoc;
    }
@Column(name = "Tendantoc")
    public String getTendantoc() {
        return Tendantoc;
    }

    public void setTendantoc(String Tendantoc) {
        this.Tendantoc = Tendantoc;
    }
@OneToMany(mappedBy="dantoc", cascade = CascadeType.ALL)

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
               @Override
        public String toString()
        {
            return Tendantoc;
        }
}
