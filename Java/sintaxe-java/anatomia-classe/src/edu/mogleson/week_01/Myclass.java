package edu.mogleson.week_01;
public class Myclass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        String BR = "Brasil";
        // Using final to make a constant

        double PI = 3.14;
        
        int ESTADOS_BRASILEIROS = 27;

        int ANO_2000 = 2000;

        String nome = "João";

        int anoFabricacao = 2014;

        boolean verdadeiro = true;

        String firstName = "João";
        String lastName = "Silva";

        //String nomeCompleto = fullName("João", "Silva");
        
        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);

    }

    public static String fullName(String firstName, String lastName) {
        //firstName + " " + lastName
        return firstName.concat(" ").concat(lastName);
    }
}
