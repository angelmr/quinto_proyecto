package ec.edu.unach.siget.entidades;

public class Rol {
    private int codigo;
    private String nombre;
    private String descripcion;
    private int estado;
    private int codigo_modulo;

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
    
    @Override
    public String toString() {
        return nombre;
    }
}
