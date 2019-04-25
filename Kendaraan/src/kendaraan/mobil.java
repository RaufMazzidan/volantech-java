/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;


public class mobil extends Kendaraan{
private String tipe;
public mobil(){
        super();
        tipe= "Kosong";
    }
public mobil (String m, String w,int k, String t){
        super(m,w,k);
        tipe = t;
    }    
public void tampil(){
    System.out.println("-----Mobil-----");
    super.tampil();
    System.out.println("Tipe      :"+tipe);
}
    
}
