/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.resource;

import java.net.URL;

public class ResourcesUtil {

    URL classURL;
    private static final String pulmonShowMessage = "pulmonShowMessage.png";
    private static final String microfono = "microfono.png";
    private static final String microfonoEscuchando = "microfonoEscuchando.gif";
    private static final String x1 = "1.jpg";
    private static final String x2 = "2.jpg";
    private static final String x3 = "3.jpg";
    private static final String x4 = "4.jpg";
    private static final String x5 = "5.jpg";
    private static final String x6 = "6.jpg";
    private static final String x7 = "7.jpg";
    private static final String x8 = "8.jpg";

    public java.net.URL x1() {
        return getPath(x1);
    }

    public java.net.URL x2() {
        return getPath(x2);
    }

    public java.net.URL x3() {
        return getPath(x3);
    }

    public java.net.URL x4() {
        return getPath(x4);
    }

    public java.net.URL x5() {
        return getPath(x5);
    }

    public java.net.URL x6() {
        return getPath(x6);
    }

    public java.net.URL x7() {
        return getPath(x7);
    }

    public java.net.URL x8() {
        return getPath(x8);

    }

    public java.net.URL getPulmonShowMessage() {
        return getPath(pulmonShowMessage);
    }

    public java.net.URL getMicrofono() {
        return getPath(microfono);
    }

    public java.net.URL getMicrofonoEscuchando() {
        return getPath(microfonoEscuchando);
    }

    public java.net.URL getPath(String pathResource) {
//        String path = "";
//        try {
//            
        classURL = getClass().getResource(pathResource);
//            System.out.println("classURL: "+classURL);
//            String url = classURL.getFile().substring(1).replace("/", java.io.File.separator);
//            path = java.net.URLDecoder.decode(url, "UTF-8");
//                        System.out.println("classURL: "+classURL);
//
//        } catch (UnsupportedEncodingException ex) {
//            Logger.getLogger(ResourcesUtil.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return classURL;
    }

}
