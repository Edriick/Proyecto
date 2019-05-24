/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Poliza;
import entidades.Tipoestado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
@Path("entidades.poliza")
public class PolizaFacadeREST extends AbstractFacade<Poliza> {
    @PersistenceContext(unitName = "PolizaEDPU")
    private EntityManager em;

    public PolizaFacadeREST() {
        super(Poliza.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Poliza entity) {
        super.create(entity);
    }

    @PUT
    @Path("{idPoliza}/{idEstado}")
    @Consumes({"application/xml", "application/json"})
    public void actualizarEstado(@PathParam("idPoliza") Integer idPoliza,@PathParam("idEstado") Integer idEstado) {
        Poliza poliza = new Poliza();
        Tipoestado tipoestado= new Tipoestado();
        tipoestado.setIdestado(idEstado);
        if(idEstado==1)
            tipoestado.setDescripcionestado("Vigente");
        if(idEstado==2)
            tipoestado.setDescripcionestado("Caducada");
   /*     TipoestadoFacadeREST tipoEstadoFacadeRest = new TipoestadoFacadeREST();  
        String GetDescripcion = tipoEstadoFacadeRest.GetDescripcion(descripcion);
        tipoestado.setDescripcionestado(GetDescripcion);*/
        
        poliza.setFechainicialcobertura(super.find(idPoliza).getFechainicialcobertura());
        poliza.setFechapagoanticipo(super.find(idPoliza).getFechapagoanticipo());
        poliza.setIdaseguradora(super.find(idPoliza).getIdaseguradora());
        poliza.setIdcobertura(super.find(idPoliza).getIdcobertura());        
        poliza.setIdestado(tipoestado);    
        poliza.setIdcontrato(super.find(idPoliza).getIdcontrato()); 
        poliza.setIdpolizatabla(super.find(idPoliza).getIdpolizatabla());
        poliza.setNumpoliza(super.find(idPoliza).getNumpoliza());
        poliza.setNumrenovaciones(super.find(idPoliza).getNumrenovaciones());
        poliza.setObservaciones(super.find(idPoliza).getObservaciones());
        poliza.setValorcoberturaactual(super.find(idPoliza).getValorcoberturaactual());
        poliza.setValorcoberturainicial(super.find(idPoliza).getValorcoberturainicial());
        poliza.setVencimientofechafinal(super.find(idPoliza).getVencimientofechafinal());
        poliza.setVencimientofechainicial(super.find(idPoliza).getVencimientofechainicial());
 
        super.edit(poliza);
 
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }
    
    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Poliza find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Poliza> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Poliza> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
