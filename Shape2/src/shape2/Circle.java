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
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rauf Mazzidan
 */
public class Circle extends Shape2{
    public static final int segi = 100000000;
    public int panjang;
    
    public int luas(int p){
    int l = 22 * p * p / 7;
    return l;
    }
    
    public int keliling(int p){
    int k = 22 * p * 2 / 7;
    return k;
    }
    
    public void cetak(){
        super.cetak();
        System.out.println("Segi     :"+segi);
        int a = luas(panjang);
        System.out.println("Luas     :"+ a);
        int b = keliling(panjang);
        System.out.println("Keliling :"+ b);
    }
    
}
   

