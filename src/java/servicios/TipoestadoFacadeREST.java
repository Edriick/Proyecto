/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Tipoestado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Alienware
 */
@Stateless
@Path("entidades.tipoestado")
public class TipoestadoFacadeREST extends AbstractFacade<Tipoestado> {
    @PersistenceContext(unitName = "PolizaEDPU")
    private EntityManager em;

    public TipoestadoFacadeREST() {
        super(Tipoestado.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Tipoestado entity) {
        super.create(entity);
        
    }

    @PUT
    @Path("editar/{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id) {
        Tipoestado tipoestado = new Tipoestado();
        tipoestado.setDescripcionestado("probando2");  
        tipoestado.setIdestado(super.find(id).getIdestado());
        super.edit(tipoestado);
    }
    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public String GetDescripcionRest(@PathParam("id") Integer id) {
        String descripcion;
        descripcion=  super.find(id).getDescripcionestado();   
        return descripcion;
    }
    
    public String GetDescripcion(Integer id) {
        String descripcion;
        descripcion=  super.find(id).getDescripcionestado();   
        return descripcion;
    }
    
    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Tipoestado> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Tipoestado> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
