package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println(hello());
    }

    /**
     * @author Ethan Besse
     * Méthode hello() n'attendant pas de paramètres et retourne un String. 
     * @return String "Hello World!"
     */
    public static String hello() {
        return "Hello World!";
    }

    /**
     * @author Ethan Besse
     * Fonction hello(String) qui retourne le paramètre reçu.
     * @param String
     * @return String
     */
    public static String hello(String str){
        return str;
    }
}
