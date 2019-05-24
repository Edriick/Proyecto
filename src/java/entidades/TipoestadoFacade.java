/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alienware
 */
@Stateless
public class TipoestadoFacade extends AbstractFacade<Tipoestado> implements TipoestadoFacadeLocal {
    @PersistenceContext(unitName = "PolizaEDPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoestadoFacade() {
        super(Tipoestado.class);
    }
    
}
