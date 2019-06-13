/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.controller;

import cl.uv.app.fq.bo.MedicoBo;
import cl.uv.app.fq.facade.MedicoFacade;

/**
 *
 * @author bnavarro
 */
public class Medico {

    MedicoFacade facade;

    public void insertMedico(MedicoBo medico) {
        facade = new MedicoFacade();
        facade.insertMedico(medico);
    }

    public MedicoBo getMedico(int id_medico) {
        facade = new MedicoFacade();
        return facade.getMedicoWhere(id_medico);
    }

    public boolean existeRut(String rut) {
        boolean flag = false;
        facade = new MedicoFacade();
        if (facade.getAllMedico(rut) != null) {
            flag = true;
        }
        return flag;
    }
}
