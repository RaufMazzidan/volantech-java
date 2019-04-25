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
public class AlatMusik {
private int harga;
    private String warna;
    private String cara_main;

//////////////  Constructor ( Default) ////////////////////////
public AlatMusik(){
    harga = 0;
    warna = "";
    cara_main = "";
}

///////////// Constructor ( Parameter ) /////////////////////////
public AlatMusik(int harga, String warna, String cara_main){
this.harga = harga;
this.warna = warna;
this.cara_main = cara_main;
}

/////////////////////////// Accessor ///////////////////////////////
public int getHarga(){
return harga;
} 

public String getWarna(){
return warna;
}

public String getCara_Main(){
return cara_main;
} 
/////////////////////////// Mutator ///////////////////////////////
public void setHarga(int h){
harga = h;
} 
 
public void setWarna(String w){
warna = w;
} 

public void setCara_Main(String cm){
cara_main = cm;
} 

////////////////// Method Cetak /////////////////////
public void cetak(){
    System.out.println("Harga         : " +"Rp"+ harga +",00");
    System.out.println("Warna         : " + warna);
    System.out.println("Cara Main     : " + cara_main);
}
}