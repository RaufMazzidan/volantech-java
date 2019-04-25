/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alat.musik;

/**
 *
 * @author Rauf Mazzidan
 */
public class Drum extends Pukul{
    private int jumlahSimbal;
    private String jenis;
    
    public Drum(){
    jumlahSimbal = 0;
    jenis = "";
    }
    public Drum(int harga, String warna, String cara_main, String bahan, int diameter, int jumlahSimbal, String jenis){
    super(harga,warna,cara_main,bahan,diameter);
    this.jumlahSimbal = jumlahSimbal;
    this.jenis = jenis;
    }
    
    public int getJumlahSimbal(){
    return jumlahSimbal;
    }
    
    public String getJenis(){
    return jenis;
    }
    
/////////////////////////// Mutator ///////////////////////////////
    public void setJumlahSimbal(int js){
    jumlahSimbal = js;
    }
    
    public void setJenis(String j){
    jenis = j;
    }

////////////////// Method Cetak /////////////////////
@Override
    public void cetak(){
    super.cetak();
    System.out.println("Jumlah Simbal : " + jumlahSimbal);
    System.out.println("Jenis : " + jenis);   
    }
}