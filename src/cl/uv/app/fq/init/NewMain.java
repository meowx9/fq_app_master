/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.init;

/**
 *
 * @author bnavarro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ELIJO = 4;
        int DESDE = 2;
        int HASTA = 3;
        
        if (ELIJO>=DESDE && ELIJO <= HASTA) {
            System.out.println("Pertenece");
        }else{
            System.out.println("No pertenece");
        }

    }

}
