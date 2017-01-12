/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.EmployeDAO;
import utng.datos.DeptoManagerDAO;

import utng.modelo.Employe;
import utng.modelo.DeptoManager;

/**
 *
 * @author MOYA
 */
@ManagedBean(name = "deptoManagerBean")
@SessionScoped
public class DeptoManagerBean implements Serializable {

    private List<DeptoManager> deptoManagers;
    private DeptoManager deptoManager;
    private List<Employe> employes;

      public DeptoManagerBean(){
    deptoManager=new DeptoManager();
    
    }
    public DeptoManagerBean(List<DeptoManager> deptoManagers, DeptoManager deptoManager, List<Employe> employes) {
        this.deptoManagers = deptoManagers;
        this.deptoManager = deptoManager;
        this.employes = employes;
    }

    public List<DeptoManager> getDeptoManagers() {
        return deptoManagers;
    }

    public void setDeptoManagers(List<DeptoManager> deptoManagers) {
        this.deptoManagers = deptoManagers;
    }

    public DeptoManager getDeptoManager() {
        return deptoManager;
    }

    public void setDeptoManager(DeptoManager deptoManager) {
        this.deptoManager = deptoManager;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

  

    public String listar() {
        DeptoManagerDAO dao = new DeptoManagerDAO();
        try {
            deptoManagers = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "DeptoManager";
    }

    public String eliminar() {
        DeptoManagerDAO dao = new DeptoManagerDAO();
        try {
            dao.delete(deptoManager);
            deptoManagers = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {

        deptoManager = new DeptoManager();
       deptoManager.setEmploye(new Employe());
        try {
           employes = new EmployeDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }

    public String guardar() {
        DeptoManagerDAO dao = new DeptoManagerDAO();
        try {
            if (deptoManager.getIdDept()!= 0) {
                dao.update(deptoManager);
            } else {
                dao.insert(deptoManager);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        deptoManagers = dao.getAll();
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(DeptoManager deptoManager) {
        this.deptoManager = deptoManager;
        try {
            employes = new EmployeDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }
}//final
