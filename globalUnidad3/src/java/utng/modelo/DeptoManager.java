/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Moya
 */
@Entity
@Table(name = "dept_manager")
public class DeptoManager implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_dept")
    private Long idDept;
    @Column(name = "from_date", length = 10)
    private String fromDate;
    @Column(length = 15)
     private String toDate;
 
    @ManyToOne
    @JoinColumn(name = "id_emp")
    private Employe employe;

    public DeptoManager() {
        this.idDept=0L;
    }

    public DeptoManager(Long idDept, String fromDate, String toDate, Employe employe) {
        this.idDept = idDept;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.employe = employe;
    }

    
    public Long getIdDept() {
        return idDept;
    }

    public void setIdDept(Long idDept) {
        this.idDept = idDept;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    
   

  
    
    
    
    

   

    

    
     
}//final
