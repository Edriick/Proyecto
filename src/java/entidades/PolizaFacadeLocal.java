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
public interface PolizaFacadeLocal {

    void create(Poliza poliza);

    void edit(Poliza poliza);

    void remove(Poliza poliza);

    Poliza find(Object id);

    List<Poliza> findAll();

    List<Poliza> findRange(int[] range);

    int count();
    
}
