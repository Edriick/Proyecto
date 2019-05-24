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
public interface TipocoberturaFacadeLocal {

    void create(Tipocobertura tipocobertura);

    void edit(Tipocobertura tipocobertura);

    void remove(Tipocobertura tipocobertura);

    Tipocobertura find(Object id);

    List<Tipocobertura> findAll();

    List<Tipocobertura> findRange(int[] range);

    int count();
    
}
