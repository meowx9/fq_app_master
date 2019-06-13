/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.controller;

import cl.uv.app.fq.resource.ResourcesUtil;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author bnavarro
 */
public class Init {

    JFrame frame;

    public void loadInit(JFrame jframe) {
        frame = jframe;

        //Centrar
        frame.setLocationRelativeTo(null);

        //Título
        frame.setTitle("Bienvenído a FQ");

        ResourcesUtil rUtil = new ResourcesUtil();
        ImageIcon ImageIcon = new ImageIcon(rUtil.getPulmonShowMessage());
        Image Image = ImageIcon.getImage();
        frame.setIconImage(Image);

    }

}
