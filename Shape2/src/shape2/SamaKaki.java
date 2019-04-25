/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape2;

/**
 *
 * @author Rauf Mazzidan
 */
public class SamaKaki extends Triangle{
     public double tinggi(int p, int l){
    int a = p/2;
    double m = Math.sqrt((l * l) + (a*a));
    return m;
    }
     public void cetak(){
     }
}
