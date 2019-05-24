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
public interface TipoestadoFacadeLocal {

    void create(Tipoestado tipoestado);

    void edit(Tipoestado tipoestado);

    void remove(Tipoestado tipoestado);

    Tipoestado find(Object id);

    List<Tipoestado> findAll();

    List<Tipoestado> findRange(int[] range);

    int count();
    
}
