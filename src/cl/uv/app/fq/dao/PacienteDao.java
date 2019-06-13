/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.dao;

import cl.uv.app.fq.bo.PacienteBo;
import cl.uv.app.fq.conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Byron Navarro
 */
public class PacienteDao {

    private Statement state;
    private ResultSet res;

    public int insert(String query) {
        int x = 0;
        try {

            state = Conexion.conectar().createStatement();

            state.execute(query);
            System.out.println("Inserto Correctamente");
            x = 1;

        } catch (SQLException ex) {
            System.out.println("Error al insertar " + ex);
        } finally {
            try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            Conexion.desconectar();
        }
        return x;
    }

    public int update(String query) {
        int x = 0;
        try {
            state = Conexion.conectar().createStatement();
            state.execute(query);
        } catch (SQLException ex) {
            System.out.println("Error al modificar " + ex);
        } finally {
            try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            Conexion.desconectar();
        }
        return x;
    }

    public int delete(String query) {
        int x = 0;
        try {
            state = Conexion.conectar().createStatement();

            state.execute(query);
            System.out.println("Eliminado de forma correccta");

        } catch (SQLException ex) {
            System.out.println("Error al eliminar " + ex);
        } finally {
            try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            Conexion.desconectar();
        }
        return x;

    }

    public ArrayList selectArray(String query) {
        ArrayList<PacienteBo> pacienteBo = new ArrayList<PacienteBo>();
        try {
            state = Conexion.conectar().createStatement();
            res = state.executeQuery(query);

            while (res.next()) {
                pacienteBo.add(new PacienteBo(res.getInt("id_paciente"), res.getString("nombre"), res.getDate("fecha_nacimiento"), res.getDate("fecha_incorporacion"), res.getFloat("peso"), res.getFloat("estatura"), res.getString("comentario"), res.getInt("medico_id_medico")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PacienteBo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                state.close();
                res.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteBo.class.getName()).log(Level.SEVERE, null, ex);
            }
            Conexion.desconectar();
        }
        return pacienteBo;
    }
    
    
}
