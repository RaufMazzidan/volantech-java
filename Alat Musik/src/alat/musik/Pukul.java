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
public class Pukul extends AlatMusik{
      private String bahan;
      private int diameter;

//////////////  Constructor ( Default) ////////////////////////
public Pukul(){
 bahan = "";
 diameter = 0; 
}

///////////// Constructor ( Parameter ) /////////////////////////
public Pukul(int harga, String warna, String cara_main, String bahan, int diameter){
super(harga,warna,cara_main);
this.bahan = bahan;
this.diameter = diameter;
}


/////////////////////////// Accessor ///////////////////////////////
public String getBahan(){
    return bahan;
}

public int getDiameter(){
    return diameter;
}

/////////////////////////// Mutator ///////////////////////////////
public void setBahan(String b){
    bahan = b;

}

public void setDiameter(int d){
    diameter = d;
}

////////////////// Method Cetak /////////////////////
@Override
public void cetak(){
   super.cetak();
   System.out.println("Bahan : " + bahan);
   System.out.println("Diameter : " + diameter + " cm");   
}
}