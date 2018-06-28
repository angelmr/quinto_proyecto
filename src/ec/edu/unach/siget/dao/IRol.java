package ec.edu.unach.siget.dao;
import ec.edu.unach.siget.entidades.Rol;
import java.util.*;

public interface IRol{
    public int insertar(Rol rol) throws Exception;
    public int modificar(Rol rol) throws Exception;
    public int eliminar(Rol rol) throws Exception;
    public Rol obtener(int codigo) throws Exception;
    public List<Rol> obtener() throws Exception;    
}
