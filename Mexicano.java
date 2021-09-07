/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica3;

import java.util.Random;

/**
 *
 * @author Luis
 */
public class Mexicano {
   //Declaracion de los atributos.
    String nombre;
    String apellidoP;
    String apellidoM;
    char sexo;
    String estado;
    int año;
    int mes;
    int dia;
    //Metodo constructor publico,recibe parametros.
    public Mexicano( String nombre, String apellidoP, String apellidoM, char sexo, String estado, int año, int mes, int dia){
        setNombre(nombre);
        setApellidoP(apellidoP);
        setApellidoM(apellidoM);
        setSexo(sexo);
        setEstado(estado);
        setAño(año);
        setMes(mes);
        setDia(dia);
    }
    //Setters
    public void setNombre(String nombre){
        this.nombre=nombre.toUpperCase();//Conversion a mayusculas
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP=apellidoP.toUpperCase();//Conversion a mayusculas
    }
    public void setApellidoM(String apellidoM) {
        this.apellidoM=apellidoM.toUpperCase();//Conversion a mayusculas
    }
    public void setSexo(char sexo) {
        this.sexo=sexo;
    }
    public void setEstado(String estado){
        this.estado=estado.toUpperCase();//Conversion a mayusculas
    }
    public void  setAño(int año) {
        this.año=año;
    }
    public void  setMes(int mes) {
        this.mes=mes;
    }
    public void  setDia(int dia) {
        this.dia=dia;
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getApellidoP(){
        return apellidoP;
    }
    public String getApellidoM(){
        return apellidoM;
    }
    public char getSexo(){
        return sexo;
    }
    public String getEstado(){
        return estado;
    }
    public int getAño(){
        return año;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    //Metodo para calcular la CURP
    public void CURP(String nombre, String apellidoP, String apellidoM,char sexo, String estado, int año, int mes,int dia){
        //Convertimos las fechas a tipo String
        String year=String.valueOf(año);
        String month=String.valueOf(mes);
        String day=String.valueOf(dia);
        char c1=apellidoP.charAt(0);//Primer caracter del apellido
        char c2 = 0 ;
        char c3=apellidoM.charAt(0);//Primer caracter del apellido
        char c4=nombre.charAt(0);//Primer caracter del nombre
        char c5=year.charAt(2);
        char c6=year.charAt(3);
        char c7;
        char c8;
        char c9;
        char c10;
        char c11=sexo;
        String c12yc13;
        char c14 = 0;
        char c15 = 0;
        char c16 = 0;
        //Ciclo para encontrar la primera vocal del apellido paterno
        for(int i=1; i<apellidoP.length();i++){
             char primerVocal= apellidoP.charAt(i);
            if(primerVocal=='A'||primerVocal=='E'||primerVocal=='I'||primerVocal=='O'||primerVocal=='U'){
                c2=primerVocal;
                break;
            }
        }
        //Ciclo para obtener el caracter 0 en caso de que sea menor que 10
        if(mes<10){
            c7='0';
            c8=month.charAt(0);
        }
        else{
            c7=month.charAt(0);
            c8=month.charAt(1);
        }
        if(dia<10){
            c9='0';
            c10=day.charAt(0);
        }
        else{
            c9=day.charAt(0);
            c10=day.charAt(1);
        }
        //Ciclo para seleccionar la abreviatura del estado
        switch(estado){
                    case "AGUASCALIENTES":
                    c12yc13="AS"; break;
                    case "BAJA CALIFORNIA":
                    c12yc13="BC"; break;
                    case "BAJA CALIFORNIA SUR":
                    c12yc13="BS"; break;
                    case "CAMPECHE":
                    c12yc13="CC"; break;
                    case "CHIAPAS":
                    c12yc13="CS"; break;
                    case "CHIHUAHUA":
                    c12yc13="CH"; break;
                    case "COAHUILA":
                    c12yc13="CL"; break;
                    case "COLIMA":
                    c12yc13="CM"; break;
                    case "DF":
                    c12yc13="DF"; break;
                    case "DURANGO":
                    c12yc13="DG"; break;
                    case "GUANAJUATO":
                    c12yc13="GT"; break;
                    case "GUERRERO":
                    c12yc13="GR"; break;
                    case "HIDALGO":
                    c12yc13="HG"; break;
                    case "JALISCO":
                    c12yc13="JC"; break;
                    case "ESTADO DE MEXICO":
                    c12yc13="MC"; break;
                    case "MICHOACAN":
                    c12yc13="MN"; break;
                    case "MORELOS":
                    c12yc13="MS"; break;
                    case "NAYARIT":
                    c12yc13="NT"; break;
                    case "NUEVO LEON":
                    c12yc13="NL"; break;
                    case "OAXACA":
                    c12yc13="OC"; break;
                    case "PUEBLA":
                    c12yc13="PL"; break;
                    case "QUERETARO":
                    c12yc13="QT"; break;
                    case "QUINTANA ROO":
                    c12yc13="QR"; break;
                    case "SAN LUIS POTOSI":
                    c12yc13="SP"; break;
                    case "SINALOA":
                    c12yc13="SL"; break;
                    case "SONORA":
                    c12yc13="SR"; break;
                    case "TABASCO":
                    c12yc13="TC"; break;
                    case "TAMAULIPAS":
                    c12yc13="TS"; break;
                    case "TLAXCALA":
                    c12yc13="TL"; break;
                    case "VERACRUZ":
                    c12yc13="VZ"; break;
                    case "YUCATAN":
                    c12yc13="YN"; break;
                    case "ZACATECAS":
                    c12yc13="ZS"; break;
                    default:
                    c12yc13="NE"; break;
                }
        //Ciclo para encontrar la primera consonante del apellido paterno
         for(int i=1; i<apellidoP.length();i++){
             char primerConsonante= apellidoP.charAt(i);
            if(primerConsonante!='A'&& primerConsonante!='E'&&primerConsonante!='I'&&primerConsonante!='O'&&primerConsonante!='U'){//Si es diferente a las vocales tendremos la consonante
                c14 = primerConsonante;
                break;
            }
         }
        for(int j=1; j<apellidoM.length();j++){
             char primerConsonant= apellidoM.charAt(j);
            if(primerConsonant!='A'&& primerConsonant!='E'&&primerConsonant!='I'&&primerConsonant!='O'&&primerConsonant!='U'){
                c15 = primerConsonant;
                break;
            }
        }
        for(int j=1; j<nombre.length();j++){
             char Consonante= nombre.charAt(j);
            if(Consonante!='A'&& Consonante!='E'&&Consonante!='I'&&Consonante!='O'&&Consonante!='U'){
                c16 = Consonante;
                break;
            }
        }
        Random random = new Random();//Iniciamos la clase random para los caracteres finales

        String banco="QWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        int indiceAleatorio=random.nextInt(banco.length());
        char c17=banco.charAt(indiceAleatorio);
        char c18=banco.charAt(indiceAleatorio);
            
        //Impresion de la CURP
        System.out.println(c1+""+c2+""+c3+""+c4+""+c5+""+c6+""+c7+""+c8+""+c9+""+c10+""+c11+""+c12yc13+""+c14+""+c15+""+c16+""+c17+""+c18);



    }
    public void RFC(String nombre, String apellidoP, String apellidoM, int año, int mes,int dia){
        String year=String.valueOf(año);
        String month=String.valueOf(mes);
        String day=String.valueOf(dia);
        char c1=apellidoP.charAt(0);//Primer caracter del apellido
        char c2 = 0 ;
        char c3=apellidoM.charAt(0);
        char c4=nombre.charAt(0);
        char c5=year.charAt(2);
        char c6=year.charAt(3);
        char c7;
        char c8;
        char c9;
        char c10;
        
        for(int i=1; i<apellidoP.length();i++){
             char primerVocal= apellidoP.charAt(i);
            if(primerVocal=='A'||primerVocal=='E'||primerVocal=='I'||primerVocal=='O'||primerVocal=='U'){
                c2=primerVocal;
                break;
            }
        }
        if(mes<10){
            c7='0';
            c8=month.charAt(0);
        }
        else{
            c7=month.charAt(0);
            c8=month.charAt(1);
        }
        if(dia<10){
            c9='0';
            c10=day.charAt(0);
        }
        else{
            c9=day.charAt(0);
            c10=day.charAt(1);
        }
          Random random = new Random();

        String banco="QWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        int indiceAleatorio=random.nextInt(banco.length());
        char c11=banco.charAt(indiceAleatorio);
        char c12=banco.charAt(indiceAleatorio);
        char c13=banco.charAt(indiceAleatorio);
    
        System.out.println(c1+""+c2+""+c3+""+c4+""+c5+""+c6+""+c7+""+c8+""+c9+""+c10+""+c11+""+c12+""+c13);

    }
}
