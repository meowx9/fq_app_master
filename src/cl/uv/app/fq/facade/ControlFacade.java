/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.facade;

import cl.uv.app.fq.bo.ControlBo;
import cl.uv.app.fq.bo.MedicoBo;
import cl.uv.app.fq.bo.PacienteBo;
import cl.uv.app.fq.dao.ControlDao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Byron Navarro
 */
public class ControlFacade {

    private final ControlDao controlDao;

    public ControlFacade() {
        controlDao = new ControlDao();
    }

//    //Elimina todos los casos de 1 equipo
//    public void eliminaTodosLosCasosDeUnEquipo(int idEquipo) {
//        String query = "DELETE FROM `asignaciones` WHERE Equipo_idEquipo = '" + idEquipo + "'";
//        controlDao.delete(query);
//    }
////Elimina casos especificos
//
//    public void eliminaCasosEspecificos(int idPpf, int idNavegador, int idEquipo) {
//        String query = "DELETE FROM `asignaciones` WHERE ppf_idPPF = '" + idPpf + "' and Equipo_idEquipo = '" + idEquipo + "' and navegadores_idNavegadores = '" + idNavegador + "';";
//        controlDao.delete(query);
//    }
//
//    //Asigna casos al equipo
//    public void asignarCaso(String idPPF, int idNavegador, int idEquipo) {
//        String query = "INSERT INTO `asignaciones` (`idAsignacion`, `Equipo_idEquipo`, `navegadores_idNavegadores`, `ppf_idPPF`) "
//                + "VALUES (NULL, '" + idEquipo + "', '" + idNavegador + "', '" + idPPF + "');";
//        controlDao.insert(query);
//    }
    public int insertControl(ControlBo control) {
        System.out.println(control.toString());
        String query = "INSERT INTO `control`(`id_control`, `fecha`, `estatura`, `peso`,`tiempo_soplado`,`nivel_max`, `comentario`, `paciente_id_paciente`, `medico_id_medico`) VALUES(NULL,?,?,?,?,?,?,?,?);";
        System.out.println(query);
        return controlDao.insert(query, control);
    }

    public ArrayList<ControlBo> getAllControlWherePaciente(PacienteBo paciente) {
        String query = "Select * from control where paciente_id_paciente=" + paciente.getIdPaciente() + "";
        return controlDao.select(query);

    }
}
