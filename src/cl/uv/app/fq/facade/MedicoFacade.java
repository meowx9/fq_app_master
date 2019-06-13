/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.facade;

import cl.uv.app.fq.bo.MedicoBo;
import cl.uv.app.fq.dao.MedicoDao;

/**
 *
 * @author Byron Navarro
 */
public class MedicoFacade {

    private final MedicoDao medicoDao;

    public MedicoFacade() {
        medicoDao = new MedicoDao();
    }
//
//    //Elimina todos los casos de 1 equipo
//    public void eliminaTodosLosCasosDeUnEquipo(int idEquipo) {
//        String query = "DELETE FROM `asignaciones` WHERE Equipo_idEquipo = '" + idEquipo + "'";
//        medicoDao.delete(query);
//    }
////Elimina casos especificos
//
//    public void eliminaCasosEspecificos(int idPpf, int idNavegador, int idEquipo) {
//        String query = "DELETE FROM `asignaciones` WHERE ppf_idPPF = '" + idPpf + "' and Equipo_idEquipo = '" + idEquipo + "' and navegadores_idNavegadores = '" + idNavegador + "';";
//        medicoDao.delete(query);
//    }

    public MedicoBo login(String rut, String password) {
        String query = "SELECT * FROM `medico` WHERE rut = '" + rut.replace(".", "").replace("-", "") + "' and contrasenna = '" + password + "'";
        return medicoDao.select(query);
    }

    //Insert Médico
    public void insertMedico(MedicoBo medico) {
        String query = "INSERT INTO `medico` (`id_medico`, `nombres`, `apellidos`, `cargo`, `rut`, `contrasenna`) "
                + "VALUES (NULL, '" + medico.getNombres() + "', '" + medico.getApellidos() + "', '" + medico.getCargo() + "', '" + medico.getRut().replace(".", "").replace("-", "") + "', '" + medico.getContrasenna() + "');";
        System.out.println(query);
        medicoDao.insert(query);
    }

    public MedicoBo getMedicoWhere(int id_medico) {
        String query = "SELECT * FROM `medico` WHERE id_medico=" + id_medico + "";
        return medicoDao.select(query);
    }

    public MedicoBo getAllMedico(String rut) {
        String query = "SELECT * FROM `medico` WHERE rut=" + rut + "";
        return medicoDao.select(query);
    }

}
