package ec.edu.unach.siget.dao;
import ec.edu.unach.siget.entidades.Periodo;
import java.util.*;

public interface IPeriodo {
    public int insertar(Periodo periodo) throws Exception;
    public int modificar(Periodo periodo) throws Exception;
    public int eliminar(Periodo periodo) throws Exception;
    public Periodo obtener(int codigo) throws Exception;
    public List<Periodo> obtener() throws Exception;    
}
