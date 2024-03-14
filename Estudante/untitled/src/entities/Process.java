package entities;

import java.util.Locale;
import java.util.Scanner;

public class Process {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calculo() {
            return nota1 + nota2 + nota3;
    }
        public double falta() {
               if (calculo() < 60) {
                   return 60 - calculo();
               } else {
                   return 0;

               }

           }}

