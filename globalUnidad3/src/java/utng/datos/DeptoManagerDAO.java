/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;

import utng.modelo.DeptoManager;

/**
 *
 * @author MOYA
 */
public class DeptoManagerDAO extends DAO<DeptoManager>{
    public DeptoManagerDAO(){
        super(new DeptoManager());
       
    }
    
    public DeptoManager getOneById(DeptoManager deptoManager)
            throws HibernateException{
        return super.getOneById(deptoManager.getIdDept());
    }
     
}//final
