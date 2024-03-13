/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.restexamen;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/**
 *
 * @author Patricio Salamanca
 */

     @Path("/alerces")
public class ExamenService {
 
private static List<Usuario> listadoUsuarios = new ArrayList<Usuario>();
       
      static {
               listadoUsuarios.add(new Usuario("Jhon Trace","pass","JhonyPeter","TraceHills"));
               listadoUsuarios.add(new Usuario("Linda Stewart","password","LindaRose","StewartOlsen"));
               listadoUsuarios.add(new Usuario("Phil Col","123hqw","PhilipDaniel","ColinsMacgregor"));
               listadoUsuarios.add(new Usuario("Stan Sto","wordpass","stuardAndy","stuardAnderson"));
             
       }

   @GET
   @Path("/consultarUsuarios")
   public String findAllUsuarios() {
      String salida;
      Gson gson = new GsonBuilder().create();
      Respuesta r = new Respuesta();
      r.setStatus(200);
      r.setData(listadoUsuarios);
      salida = gson.toJson(r);
      return salida;
   }
   @POST
   @Path("/agregarUsuarios")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Respuesta addUsuarios(Usuario usuario) {
   Gson gson = new GsonBuilder().create();
   listadoUsuarios.add(usuario);
       
   Respuesta r = new Respuesta();
   r.setStatus(200);
   r.setData(gson.toJson(usuario));
   return r;
   }
   @PUT
   @Path("/modificarUsuario")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public String updateUsuario(Usuario usuario) {
       String salida;
       int i=0;
       Gson gson = new GsonBuilder().create();
       Respuesta r = new Respuesta();
       
       for(Usuario aux : listadoUsuarios) {
           if(aux.getUserName().equals(usuario.getUserName())){
             listadoUsuarios.get(i).setNombres(usuario.getNombres());
             listadoUsuarios.get(i).setApellidos(usuario.getApellidos());
           }
           i++;
       }
       r.setStatus(200);
       r.setData("Usuario modificado userName:" + usuario.getUserName());
       salida = gson.toJson(r);
       return salida;
   }
    @DELETE
    @Path("/eliminarUsuario/{userName}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
   public String deleteUsuario(@PathParam("userName")String userName) {
      
       int i=0,posicion= -1;
       String salida;
       Gson gson = new GsonBuilder().create();
       Respuesta r = new Respuesta();
       
       for(Usuario aux : listadoUsuarios) {
           if(aux.getUserName().equals(userName)){
               posicion = i;
           }
           i++;
   }
       listadoUsuarios.remove(posicion);
       
       r.setStatus(200);
       r.setData("Usuario eliminado userName:" + userName);
       salida = gson.toJson(r);
       return salida;
   }  
//Representante  
 private static List<Representante> listadoRepresentantes = new ArrayList<Representante>();
       
       static {
               listadoRepresentantes.add(new Representante("1-9","Jhon","Trace","12233"));
               listadoRepresentantes.add(new Representante("2-7","Linda","Stewart","12345"));
               listadoRepresentantes.add(new Representante("3-5","Phill","Coll","1234"));
               listadoRepresentantes.add(new Representante("4-3","Stan","Sto","96521"));
       }
       

   @GET
   @Path("/consultarRepresentantes")
   public String findAllRepresentantes() {
      String salida;
      Gson gson = new GsonBuilder().create();
      Respuesta r = new Respuesta();
      r.setStatus(200);
      r.setData(listadoRepresentantes);
      salida = gson.toJson(r);
      return salida;
   }
   @POST
   @Path("/agregarRepresentantes")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Respuesta addRepresentantes(Representante representante) {
       Gson gson = new GsonBuilder().create();
       
       listadoRepresentantes.add(representante);
       
       Respuesta r = new Respuesta();
       r.setStatus(200);
       r.setData(gson.toJson(representante));
       return r;
   }
   @PUT
   @Path("/modificarRepresentante")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
   public String updateRepresentante(Representante representante) {
       String salida;
       int i=0;
       Gson gson = new GsonBuilder().create();
       Respuesta r = new Respuesta();
       
       for(Representante aux : listadoRepresentantes) {
           if(aux.getRut().equals(representante.getRut())){
             listadoRepresentantes.get(i).setNombres(representante.getNombres());
             listadoRepresentantes.get(i).setApellidos(representante.getApellidos());
           }
           i++;
       }
       r.setStatus(200);
       r.setData("Representante modificado Rut:" + representante.getRut());
       salida = gson.toJson(r);
       return salida;
   }
    @DELETE
    @Path("/eliminarRepresentante/{rut}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
   public String deleteRepresentante(@PathParam("rut")String rut) {
      
       int i=0,posicion= -1;
       String salida;
       Gson gson = new GsonBuilder().create();
       Respuesta r = new Respuesta();
       
       for(Representante aux : listadoRepresentantes) {
           if(aux.getRut().equals(rut)){
               posicion = i;
           }
           i++;
   }
       listadoRepresentantes.remove(posicion);
       
       r.setStatus(200);
       r.setData("Representante eliminado rut:" + rut);
       salida = gson.toJson(r);
       return salida;
   }
   private static List<Alojamiento> listadoAlojamientos = new ArrayList<Alojamiento>();
       
       static {
               listadoAlojamientos.add(new Alojamiento());
               listadoAlojamientos.add(new Alojamiento());
               listadoAlojamientos.add(new Alojamiento());
               listadoAlojamientos.add(new Alojamiento());
       }
       
   @GET
   @Path("/consultarAlojamientos")
   public String findAllAlojamientos() {
      String salida;
      Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
      Respuesta r = new Respuesta();
      r.setStatus(200);
      r.setData(listadoAlojamientos);
      salida = gson.toJson(r);
      return salida;
   }
   @POST
   @Path("/agregarAlojamientos")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Respuesta addAlojamientos(Alojamiento alojamiento) {
       Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
       
       listadoAlojamientos.add(alojamiento);
       
       Respuesta r = new Respuesta();
       r.setStatus(200);
       r.setData(gson.toJson(alojamiento));
       return r;
   }
   @PUT
   @Path("/modificarAlojamiento")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
   public String updateAlojamiento(Alojamiento alojamiento) {
       String salida;
       int i=0;
       Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
       Respuesta r = new Respuesta();
       
       for(Alojamiento aux : listadoAlojamientos) {
           if(aux.getRut().equals(alojamiento.getRut())){
             listadoAlojamientos.get(i).setNombreAgrupacion(alojamiento.getNombreAgrupacion());
             listadoAlojamientos.get(i).setIdTipoVehiculo(alojamiento.getIdTipoVehiculo());
             listadoAlojamientos.get(i).setIdTipoAlojamiento(alojamiento.getIdTipoAlojamiento());
             listadoAlojamientos.get(i).setFechaIngreso(alojamiento.getFechaIngreso());
             listadoAlojamientos.get(i).setDias(alojamiento.getDias());
           
           }
           i++;
       }
       r.setStatus(200);
       r.setData("Alojamiento modificado Rut:" + alojamiento.getRut());
       salida = gson.toJson(r);
       return salida;
   }
    @DELETE
    @Path("/eliminarAlojamiento/{rut}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
   public String deleteAlojamiento(@PathParam("rut")String rut) {
      
       int i=0,posicion= -1;
       String salida;
       Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
       Respuesta r = new Respuesta();
       
       for(Alojamiento aux : listadoAlojamientos) {
           if(aux.getRut().equals("rut")){
               posicion = i;
           }
           i++;
   }
       listadoAlojamientos.remove(posicion);
       
       r.setStatus(200);
       r.setData("Alojamiento eliminado rut:" + "rut");
       salida = gson.toJson(r);
       return salida;
   }
   } 

