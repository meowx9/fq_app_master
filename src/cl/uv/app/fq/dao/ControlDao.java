/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.dao;

import cl.uv.app.fq.bo.ControlBo;
import cl.uv.app.fq.bo.MedicoBo;
import cl.uv.app.fq.bo.PacienteBo;
import cl.uv.app.fq.conexion.Conexion;
import java.sql.PreparedStatement;
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
public class ControlDao {

    private Statement state;
    private ResultSet res;

    public int insert(String query, ControlBo control) {
        int x = 0;
        PreparedStatement st = null;
        try {

            st = Conexion.conectar().prepareStatement(query);

            st.setDate(1, new java.sql.Date(control.getFechaControl().getTime()));
            st.setFloat(2, control.getEstatura());
            st.setFloat(3, control.getPeso());
            st.setInt(4, control.getTiempoSoplado());
            st.setFloat(5, control.getNivelMaximo());

            st.setString(6, control.getComentario());
            st.setInt(7, control.getPacienteIdPaciente());
            st.setInt(8, control.getMedioIdMedico());

            System.out.println(st.toString());

            st.executeUpdate();
            System.out.println("Inserto Correctamente");
            x = 1;
        } catch (SQLException ex) {
            System.out.println("Error al insertar " + ex);
        } finally {
            try {
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControlDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(ControlDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(ControlDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            Conexion.desconectar();
        }
        return x;

    }

    public ArrayList select(String query) {
        ArrayList<ControlBo> controlBo = new ArrayList<ControlBo>();
        try {
            state = Conexion.conectar().createStatement();
            res = state.executeQuery(query);

            while (res.next()) {
                controlBo.add(new ControlBo(res.getInt("id_control"), res.getDate("fecha"), res.getFloat("estatura"), res.getFloat("peso"), res.getInt("tiempo_soplado"), res.getFloat("nivel_max"), res.getString("comentario"), res.getInt("paciente_id_paciente"), res.getInt("medico_id_medico")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControlBo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                state.close();
                res.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControlBo.class.getName()).log(Level.SEVERE, null, ex);
            }
            Conexion.desconectar();
        }

        return controlBo;
    }

}
