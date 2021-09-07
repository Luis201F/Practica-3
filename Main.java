/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica3;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

      
        int opcion=0;
        do{
            System.out.println("-------Menu de opciones-------\n"+
                    "1. Muestra Curp.\n" +
                    "2. Muestra RFC.\n" +
                    "3. Muestra CURP y RFC.\n" +       //Impresion de las opciones del menu
                    "4. Salir.\n");
            System.out.println("ingrese una opcion:");
            opcion= scanner.nextInt();//Ingreso de la opcion del usuario
            switch(opcion){
                case 1:
                            //Mandamos a llamar la clase Mexicano
                    Mexicano mex1=new Mexicano(CapturaEntrada.capturarCadena("Ingresa nombre"),CapturaEntrada.capturarCadena("Ingresa Apellido Paterno"),CapturaEntrada.capturarCadena("Ingresa Apellido Materno"), CapturaEntrada.capturarCaracter("Ingresa tu sexo(H/F)"), CapturaEntrada.capturarCadena("Ingresa el estado"), CapturaEntrada.capturarEntero("Ingresa el año de nacimiento"),CapturaEntrada.capturarEntero("Ingresa el mes"),CapturaEntrada.capturarEntero("Ingresa el dia"));
      
                    mex1.CURP(mex1.getNombre(),mex1.getApellidoP(), mex1.getApellidoM(),mex1.getSexo(), mex1.getEstado(), mex1.getAño(), mex1.getMes(), mex1.getDia());
                     break;
                case 2:
                            //Mandamos a llamar la clase Mexicano
                    Mexicano mex2=new Mexicano(CapturaEntrada.capturarCadena("Ingresa nombre"),CapturaEntrada.capturarCadena("Ingresa Apellido Paterno"),CapturaEntrada.capturarCadena("Ingresa Apellido Materno"), CapturaEntrada.capturarCaracter("Ingresa tu sexo(H/F)"), CapturaEntrada.capturarCadena("Ingresa el estado"), CapturaEntrada.capturarEntero("Ingresa el año de nacimiento"),CapturaEntrada.capturarEntero("Ingresa el mes"),CapturaEntrada.capturarEntero("Ingresa el dia"));
                    mex2.RFC(mex2.getNombre(),mex2.getApellidoP(), mex2.getApellidoM(), mex2.getAño(), mex2.getMes(), mex2.getDia());
                    break;
                case 3:
                            //Mandamos a llamar la clase Mexicano
                     Mexicano mex3=new Mexicano(CapturaEntrada.capturarCadena("Ingresa nombre"),CapturaEntrada.capturarCadena("Ingresa Apellido Paterno"),CapturaEntrada.capturarCadena("Ingresa Apellido Materno"), CapturaEntrada.capturarCaracter("Ingresa tu sexo(H/F)"), CapturaEntrada.capturarCadena("Ingresa el estado"), CapturaEntrada.capturarEntero("Ingresa el año de nacimiento"),CapturaEntrada.capturarEntero("Ingresa el mes"),CapturaEntrada.capturarEntero("Ingresa el dia"));
       
                    mex3.CURP(mex3.getNombre(),mex3.getApellidoP(), mex3.getApellidoM(),mex3.getSexo(), mex3.getEstado(), mex3.getAño(), mex3.getMes(), mex3.getDia());
                    mex3.RFC(mex3.getNombre(),mex3.getApellidoP(), mex3.getApellidoM(), mex3.getAño(), mex3.getMes(), mex3.getDia());
                break;
                case 4:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                        //En caso de que ingrese una opcion incorrecta mostrara el mensaje
                        System.out.println("Ingreso una opcion invalida.");
                
            }    
        }while(opcion>=1 && opcion<=3);
          }
}
