/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.dao;

import cl.uv.app.fq.bo.ControlBo;
import cl.uv.app.fq.bo.MedicoBo;
import cl.uv.app.fq.conexion.Conexion;
import cl.uv.app.fq.resource.ResourcesUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Byron Navarro
 */
public class MedicoDao {

    private Statement state;
    private ResultSet res;

    public int insert(String query) {
        int x = 0;
        ResourcesUtil rutil = new ResourcesUtil();

        try {

            state = Conexion.conectar().createStatement();

            state.execute(query);
            System.out.println("Inserto Correctamente");
            JOptionPane.showMessageDialog(null, "Registrado con éxito.", "Información:", 0, new ImageIcon(rutil.getPulmonShowMessage()));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido registrar médico.", "Información:", 0, new ImageIcon(rutil.getPulmonShowMessage()));

            System.out.println("Error al insertar " + ex);
        } finally {
            try {
                state.close();
            } catch (SQLException ex) {

                Logger.getLogger(MedicoDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(MedicoDao.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(MedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            Conexion.desconectar();
        }
        return x;

    }

    public MedicoBo select(String query) {
        MedicoBo medicoBo = null;
        try {
            state = Conexion.conectar().createStatement();
            res = state.executeQuery(query);
            while (res.next()) {
                medicoBo = new MedicoBo(res.getInt("id_medico"), res.getString("nombres"), res.getString("apellidos"), res.getString("cargo"), res.getString("rut"), res.getString("contrasenna"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MedicoBo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                state.close();
                res.close();
            } catch (SQLException ex) {
                Logger.getLogger(MedicoBo.class.getName()).log(Level.SEVERE, null, ex);
            }
            Conexion.desconectar();
        }

        return medicoBo;
    }
}
