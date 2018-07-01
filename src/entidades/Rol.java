/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;

/**
 *
 * @author Diego
 */
public class Rol implements Serializable{
  private int codigo;
  private String nombre;
  private String descripcion;
  private int estado;
  private int codigo_modulo;

    public Rol(int codigo, String nombre, String descripcion, int estado, int codigo_modulo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.codigo_modulo = codigo_modulo;
    }

    public Rol() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCodigo_modulo() {
        return codigo_modulo;
    }

    public void setCodigo_modulo(int codigo_modulo) {
        this.codigo_modulo = codigo_modulo;
    }
    
    
    
}
