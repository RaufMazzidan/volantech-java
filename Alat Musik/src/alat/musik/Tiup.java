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
public class Tiup extends AlatMusik{
    private String ukuran;
    private String bentuk;

//////////////  Constructor ( Default) ////////////////////////
public Tiup(){
    ukuran = "";
    bentuk = "";
}

///////////// Constructor ( Parameter ) /////////////////////////
public Tiup(int harga, String warna, String cara_main, String ukuran, String bentuk){
super(harga, warna, cara_main);
this.ukuran = ukuran;
this.bentuk = bentuk;
}

/////////////////////////// Accessor ///////////////////////////////
public String getUkuran(){
    return ukuran;
}

public String getBentuk(){
    return bentuk;
}
/////////////////////////// Mutator ///////////////////////////////
public void setUkuran (String u){
    ukuran = u;
}

public void setBentuk (String b){
    bentuk = b;
}

////////////////// Method Cetak /////////////////////
@Override
public void cetak(){
   super.cetak();
   System.out.println("Ukuran : " + ukuran);
   System.out.println("Bentuk : " + bentuk);
}
}