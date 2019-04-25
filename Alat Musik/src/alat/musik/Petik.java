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
public class Petik extends AlatMusik{
    //2R3-01-Property
    private int jumlah_senar;
    private boolean butuh_listrik;
    private String jenis_senar;
    //2R3-01-Constructor Default
    //////////////  Constructor (Default) ////////////////////////
    public Petik(){
    jumlah_senar = 0;
    butuh_listrik = false;
    jenis_senar = "";
    }
    //2R3-01-Constructor Parameter
    ///////////// Constructor ( Parameter ) /////////////////////////
    public Petik(int harga, String warna, String cara_main, int jumlah_senar, boolean butuh_listrik, String jenis_senar){
    super(harga,warna,cara_main);
    this.jumlah_senar = jumlah_senar;
    this.butuh_listrik = butuh_listrik;
    this.jenis_senar = jenis_senar;
    }
    //2R3-01-Accessor
    /////////////////////////// Accessor ///////////////////////////////
    public int getJumlah_Senar(){
        return jumlah_senar;
    }
    
    public boolean getButuh_Listrik(){
        return butuh_listrik;
    }
    
    public String getJenis_Senar(){
        return jenis_senar;
    }
    //2R3-01-Mutator
    /////////////////////////// Mutator ///////////////////////////////
    public void setJumlah_Senar(int js){
    jumlah_senar = js;
    }
    
    public void setButuh_Listrik(boolean bl){
    butuh_listrik = bl;
    }
    public void setJenis_Senar(String jes){
    jenis_senar = jes;
    }
    
    ////////////////// Method Cetak /////////////////////
    @Override
    public void cetak(){
    super.cetak();
    if(butuh_listrik == true){
    System.out.println("Butuh Listrik : Ya");
    }else{
    System.out.println("Butuh Listrik : Tidak");
    }
    System.out.println("Jumlah Senar  : " +jumlah_senar);
    System.out.println("Jenis Senar   : " +jenis_senar);
    }
}


