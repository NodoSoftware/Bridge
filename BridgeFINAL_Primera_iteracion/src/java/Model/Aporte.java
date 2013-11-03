/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author drosas
 */
public class Aporte {
    
    Integer idAporte; 
    String titulo;
    String autor;
    String descripcion;   
    String fecha;
    String costo;
    Integer calificacion;
    String problema;
    Integer idAporteElegido;
    
    public Aporte(String t,String d,Integer id){
        titulo = t;
        descripcion=d;
        idAporte=id;
        
    }
    
    public Aporte(String t,String d,Integer id,Integer c, Integer idA){
        titulo = t;
        descripcion=d;
        idAporte=id;
        calificacion = c;
        idAporteElegido = idA;
        
    }

    public Aporte(String t,String a,String d,Integer id,Integer c, String fe,String co){
        titulo = t;
        autor=a;
        descripcion=d;
        idAporte=id;
        calificacion = c;
        fecha=fe;
        costo = co;
    }
    
    public Aporte(String t,String f,String d,String c,Integer id,String p){
        titulo = t;
        costo = c;
        descripcion=d;
        idAporte=id;
        fecha=f; 
    }

    
    
    public String getTitulo(){
        return this.titulo;
    }
    public String getDesc(){
        return this.descripcion;
    }
 
    public Integer getidA(){
        return this.idAporte;
    }
    public String getFecha(){
        return this.fecha;
    }
    public String getCalificacion(){
        return this.fecha;
    }
    public String getCosto(){
        return this.costo;
    }
    
}
