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
public class Kendaraan {
    private String merek;
    private String warna;
    private int kecepatan;
    /**
     * @param args the command line arguments
     */
    public void tampil(){
        System.out.println("Merek     :"+merek);
        System.out.println("Warna     :"+warna);
        System.out.println("Kecepatan :"+kecepatan);
    }
    public Kendaraan(){
        merek = "";
        warna= "";
        kecepatan= 0;
    }
    public Kendaraan (String m, String w,int k){
        merek = m;
        warna= w;
        kecepatan= k;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public String getMerek(){
        return merek;
    }
    public void setMerek(String m){
        merek = m;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String w){
        warna = w;
    }
    public int getKecepatan(){
        return kecepatan;
    }
    public void setKecepatan(int k){
        kecepatan = k;
    }
}