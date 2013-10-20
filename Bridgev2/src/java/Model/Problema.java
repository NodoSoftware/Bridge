/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Deus Ex Machina
 */
public class Problema {
    
    String titulo;
    String descripcion;   
    Integer idProblema;   
    String fI;
    String fL;
    
    public Problema(String t,String d,Integer id){
        titulo = t;
        descripcion=d;
        idProblema=id;
    }
    public Problema(String t,String d,Integer id, String fi, String fl){
        titulo = t;
        descripcion=d;
        idProblema=id;
        fI=fi;
        fL=fl;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getDesc(){
        return this.descripcion;
    }
 
    public Integer getidP(){
        return this.idProblema;
    }
    public String getFechaInicio(){
        return this.fI;
    }
    public String getFechaLimite(){
        return this.fL;
    }
}
