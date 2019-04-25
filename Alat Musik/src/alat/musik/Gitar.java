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
public class Gitar extends Petik{
    private String ukuran;
    private String jenis;
    
    public Gitar(){
    ukuran ="";
    jenis = "";
    }
    public Gitar(int harga, String warna, String cara_main, int jumlahSnar, boolean butuhListrik,String jenisSnar, String ukuran, String jenis){
    super(harga,warna,cara_main,jumlahSnar,butuhListrik,jenisSnar);
    this.ukuran = ukuran;
    this.jenis = jenis;
    }
    
    
    public String getUkuran(){
    return ukuran;
    }
    public String getJenis(){
    return jenis;
    }
    
/////////////////////////// Mutator ///////////////////////////////
    public void setUkuran(String u){
    ukuran = u;
    }
    
    public void setJenis(String j){
    jenis = j;
    }

////////////////// Method Cetak /////////////////////
@Override
    public void cetak(){
    super.cetak();
    System.out.println("Ukuran : " + ukuran);
    System.out.println("Jenis : " + jenis);   
    }
}