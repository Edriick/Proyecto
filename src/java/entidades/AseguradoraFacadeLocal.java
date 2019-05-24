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
public interface AseguradoraFacadeLocal {

    void create(Aseguradora aseguradora);

    void edit(Aseguradora aseguradora);

    void remove(Aseguradora aseguradora);

    Aseguradora find(Object id);

    List<Aseguradora> findAll();

    List<Aseguradora> findRange(int[] range);

    int count();
    
}
