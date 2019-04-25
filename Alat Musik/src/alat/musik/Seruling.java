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
public class Seruling extends Tiup{
    private int jumlahLubang;
    private String jenis;
    
    public Seruling(){
    jumlahLubang = 0;
    jenis = "";
    }
    public Seruling(int harga, String warna, String cara_main, String ukuran, String bentuk, int jumlahLubang, String jenis){
    super(harga,warna,cara_main,ukuran,bentuk);
    this.jumlahLubang = jumlahLubang;
    this.jenis = jenis;
    }
    
    public int getJumlahLubang(){
    return jumlahLubang;
    }
    
    public String getJenis(){
    return jenis;
    }
    
/////////////////////////// Mutator ///////////////////////////////
    public void setJumlahLubang(int jl){
    jumlahLubang = jl;
    }
    
    public void setJenis(String j){
    jenis = j;
    }

////////////////// Method Cetak /////////////////////
@Override
    public void cetak(){
    super.cetak();
    System.out.println("Jumlah Lubang : " + jumlahLubang);
    System.out.println("Jenis : " + jenis);   
    }
}
