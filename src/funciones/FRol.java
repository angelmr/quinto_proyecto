/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import entidades.Rol;

/**
 *
 * @author Diego
 */
public class FRol implements Serializable {

    public static boolean Insertar(Rol rol) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.finsertar_rol(?,?,?,?)";
            lstP.add(new Parametro(1, rol.getNombre()));
            lstP.add(new Parametro(2, rol.getDescripcion()));
            lstP.add(new Parametro(3, rol.getEstado()));
            lstP.add(new Parametro(4, rol.getCodigo_modulo()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals
                ("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }

    public static ArrayList<Rol> llenarRoles(ConjuntoResultado rs) throws Exception {
        ArrayList<Rol> lst = new ArrayList<Rol>();
        Rol rol = null;
        try {
            while (rs.next()) {
                rol = new Rol(rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getString("pdescripcion"), rs.getInt("pestado"), rs.getInt("pcodigo_modulo"));
                lst.add(rol);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    public static ArrayList<Rol> ObtenerRoles() throws Exception {
        ArrayList<Rol> lst = new ArrayList<Rol>();
        try {
            String sql = "select * from actividades.fc_obtener_roles()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarRoles(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Rol ObtenerRolDadoCodigo(int codigo) throws Exception {
        Rol lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fc_obtener_rol_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Rol();
            lst = llenarRoles(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static boolean actualizar(Rol rol) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.factualiza_rol(?,?,?,?,?)";
            lstP.add(new Parametro(1, rol.getNombre()));
            lstP.add(new Parametro(2, rol.getDescripcion()));
            lstP.add(new Parametro(3, rol.getEstado()));
            lstP.add(new Parametro(4, rol.getCodigo_modulo()));
            lstP.add(new Parametro(5, rol.getCodigo()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }

    public static boolean eliminar(Rol rol) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.felimina_rol(?)";
            lstP.add(new Parametro(1, rol.getCodigo()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }
}
