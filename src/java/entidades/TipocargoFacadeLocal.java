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
public interface TipocargoFacadeLocal {

    void create(Tipocargo tipocargo);

    void edit(Tipocargo tipocargo);

    void remove(Tipocargo tipocargo);

    Tipocargo find(Object id);

    List<Tipocargo> findAll();

    List<Tipocargo> findRange(int[] range);

    int count();
    
}
