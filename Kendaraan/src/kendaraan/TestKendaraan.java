/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Abdul Rauf
 */

public class TestKendaraan {
    public static void main (String[] args){
        Kendaraan mobil =new Kendaraan();
        mobil.setMerek("Toyota");
        mobil.setWarna("Merah");
        mobil.setKecepatan(100);
        mobil.tampil();
       // Kendaraan mobil2=new Kendaraan();
        //mobil2.tampil();
        //Kendaraan mobil3=new Kendaraan("Daihatsu","Hitam",75);
        //mobil3.tampil();
    }
}
