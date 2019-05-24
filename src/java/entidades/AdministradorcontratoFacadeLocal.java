/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alienware
 */
@Local
public interface AdministradorcontratoFacadeLocal {

    void create(Administradorcontrato administradorcontrato);

    void edit(Administradorcontrato administradorcontrato);

    void remove(Administradorcontrato administradorcontrato);

    Administradorcontrato find(Object id);

    List<Administradorcontrato> findAll();

    List<Administradorcontrato> findRange(int[] range);

    int count();
    
}
