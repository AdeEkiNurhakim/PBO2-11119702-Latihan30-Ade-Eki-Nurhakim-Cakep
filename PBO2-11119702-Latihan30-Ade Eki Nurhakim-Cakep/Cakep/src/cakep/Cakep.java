/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakep;

import java.util.Scanner;

/**
 *
 * @author Ekiw
 */
public class Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String jawaban;
       System.out.println((char)27+"[01;31m Kamu"+(char)27+"[00;32m Ngerjain Sendiri"+(char)27+"[01;33m Latiahn 17"+(char)27+"[01;34m Sampe 30"+(char)27+"[01;36m Sendiri ?"+(char)27+"[01;31m (YOI/ENGGAK)"+(char)27+"[00;00m");
       System.out.println(" : ");
        jawaban = scan.nextLine();
        switch(jawaban){
        case "yoi":
        System.out.println((char)27+"[01;31m CAKEP"+(char)27+"[00;32m BENER");
        break;
        case "enggak":
        System.out.println((char)27+"[01;31m SING CAKEPSIH ");
        System.out.println((char)27+"[01;34m SING PENTING TAHU KONSEPNYA YEEE ");
        System.out.println("KEEP THE CODE WORKS DUDE");
        break;
        default:
        System.out.println("Salah Ontohod !!!!");
        }
    }
    }