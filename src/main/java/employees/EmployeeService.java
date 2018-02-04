/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.ArrayList;
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
@Path("employees")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeService {
    
    @PersistenceContext(unitName = "RondaPU")
    private EntityManager entity;
    
    public EmployeeService(){
    }

    @GET
    public List<Employee> getEmployees(){
        Query query = entity.createQuery("SELECT p FROM Employee p");
        return query.getResultList();
    }
    
    @POST
    public Employee adicionar(Employee employee){
        entity.persist(employee);
        return employee;
     }
    
    @PUT
    @Path("{id}")
    public Employee atualizar(@PathParam("id") Integer id, Employee employee){
        Employee emp = getEmployee(id);
        emp.setCargo(employee.getCargo());
        emp.setName(employee.getName());
        emp.setEmpresa(employee.getEmpresa());
        emp.setHorarioInicio(employee.getHorarioInicio());
        emp.setHorarioFim(employee.getHorarioFim());
        emp.setContrato(employee.getContrato());
        emp.setUsuario(employee.getUsuario());
        emp.setSenha(employee.getSenha());
        emp.setAtivo(employee.getAtivo());
        emp.setLatitude(employee.getLatitude());
        emp.setLongitude(employee.getLongitude());
        entity.merge(emp);
        return emp;
    }
 
    @DELETE
    @Path("{id}")
    public Employee excluir(@PathParam("id") Integer id){
        Employee emp = getEmployee(id); 
        entity.remove(emp);
        return emp;
    }
    
    @GET
    @Path("{id}")
    public Employee getEmployee(@PathParam("id") Integer id){
        return entity.find(Employee.class, id);
    }
    
    
    
}

