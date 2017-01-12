/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;

import utng.modelo.Receta;

/**
 *
 * @author MOYA
 */
public class RecetaDAO_1 extends DAO<Receta>{
    public RecetaDAO_1(){
        super(new Receta());
       
    }
    
    public Receta getOneById(Receta receta)
            throws HibernateException{
        return super.getOneById(receta.getIdReceta());
    }
     
}//final
