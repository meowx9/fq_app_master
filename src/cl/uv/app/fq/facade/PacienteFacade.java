/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.facade;

import cl.uv.app.fq.bo.MedicoBo;
import cl.uv.app.fq.bo.PacienteBo;
import cl.uv.app.fq.dao.PacienteDao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Byron Navarro
 */
public class PacienteFacade {

    private final PacienteDao pacienteDao;

    public PacienteFacade() {
        pacienteDao = new PacienteDao();
    }

//    //Elimina todos los casos de 1 equipo
//    public void eliminaTodosLosCasosDeUnEquipo(int idEquipo) {
//        String query = "DELETE FROM `asignaciones` WHERE Equipo_idEquipo = '" + idEquipo + "'";
//        pacienteDao.delete(query);
//    }
////Elimina casos especificos
//
//    public void eliminaCasosEspecificos(int idPpf, int idNavegador, int idEquipo) {
//        String query = "DELETE FROM `asignaciones` WHERE ppf_idPPF = '" + idPpf + "' and Equipo_idEquipo = '" + idEquipo + "' and navegadores_idNavegadores = '" + idNavegador + "';";
//        pacienteDao.delete(query);
//    }
    //Incerta Paciente
    public int Ingresarpaciente(PacienteBo paciente, MedicoBo medico) {
        int x = 0;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nacimiento = dateFormat.format(paciente.getFechaNacimiento());
        String incorporacion = dateFormat.format(paciente.getFechaIncorporacion());
        String query = "INSERT INTO `paciente`(`id_paciente`, `nombre`, `fecha_nacimiento`, `fecha_incorporacion`, `peso`, `estatura`, `comentario`, `medico_id_medico`)"
                + "VALUES (NULL, '" + paciente.getNombre() + "', '" + nacimiento + "', '" + incorporacion + "', '" + paciente.getPeso() + "', '" + paciente.getEstatura() + "', '" + paciente.getComentario() + "', " + medico.getIdMedico() + ")";
        return pacienteDao.insert(query);

    }

    public ArrayList<PacienteBo> getAllPacientes() {
        String query = "SELECT * FROM `paciente`";
        return pacienteDao.selectArray(query);
    }

    public PacienteBo getPacienteWhereId(String id_paciente) {
        PacienteBo paciente = null;
        String query = "SELECT * FROM `paciente` where id_paciente = '" + id_paciente + "'";
        ArrayList<PacienteBo> arrayPaciente = pacienteDao.selectArray(query);
        if (arrayPaciente.size() > 0) {
            paciente = arrayPaciente.get(0);
        }
        return paciente;
    }

}
