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
public class TestMobil {
        public static void main(String[] args) {
            /*Kendaraan mobil1 = new Kendaraan();
            mobil1.setMerek("Toyota");
            mobil1.setWarna("Merah");
            mobil1.setKecepatan(100);
            mobil1.tampil();
            
            System.out.print("\n");
            
            mobil  mobil2 = new mobil();
            mobil2.setMerek("Daihatsu");
            mobil2.setWarna("Biru");
            mobil2.setKecepatan(75);
            mobil2.tampil();*/
            
            Kendaraan mobil3=new Kendaraan("Toyota","Hitam",75);
            mobil3.tampil();
            
            System.out.print("\n");
            
            mobil mobil4=new mobil("Daihatsu","Merah",75,"Xenia");
            mobil4.tampil();
    }
}
