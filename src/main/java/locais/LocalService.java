/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locais;

import employees.Employee;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author José_Junio
 */
@Stateless
@Path("locais")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LocalService {
    
    @PersistenceContext(unitName = "RondaPU")
    private EntityManager entity;
    
    public LocalService(){
    }

    @GET
    public List<Local> getLocais(){
        Query query = entity.createQuery("SELECT p FROM Local p");
        return query.getResultList();
    }
    
    @POST
    public Local adicionar(Local local){
        entity.persist(local);
        return local;
     }
    
    @PUT
    @Path("{id}")
    public Local atualizar(@PathParam("id") Integer id, Local local){
        Local loc = getLocal(id);
        loc.setMarcacaoRota(local.getMarcacaoRota());
        loc.setTempoPermanencia(local.getTempoPermanencia());
        loc.setInicioRonda(local.getInicioRonda());
        loc.setLatitude(local.getLatitude());
        loc.setLongitude(local.getLongitude());
        entity.merge(loc);
        return loc;
    }
 
    @DELETE
    @Path("{id}")
    public Local excluir(@PathParam("id") Integer id){
        Local local = getLocal(id); 
        entity.remove(local);
        return local;
    }
    
    @GET
    @Path("{id}")
    public Local getLocal(@PathParam("id") Integer id){
        return entity.find(Local.class, id);
    }
    
}
