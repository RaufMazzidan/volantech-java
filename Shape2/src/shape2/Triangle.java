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
public class Triangle extends Shape2{
    public static final int segi = 3;
    public int panjang;
    public int lebar;
    
   
    
    public int luas(int p, int le){
    int l = p * le / 2;
    return l;
    }
    
    public int keliling(int p){
    int k = 3 * p;
    return k;
    }
    
    public void cetak(){
        super.cetak();
        System.out.println("Segi     :"+segi);
        int a = luas(panjang , lebar);
        System.out.println("Luas     :"+ a);
        int b = keliling(panjang);
        System.out.println("Keliling :"+ b);
    }
    
}
