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
public class Rectangle extends Shape2{
    public static final int segi = 4;
    public int panjang;
    public int lebar;
    
    public Rectangle(){
    panjang = 10;
    lebar = 20; 
    }
    
    public int luas(int panjang, int lebar){
    int l = this.panjang * this.lebar;
    return l;
    }
    
    public int keliling(int p, int le){
    int k = 2 * (p + le);
    return k;
    }
    
    public void cetak(){
        super.cetak();
        System.out.println("Segi     : "+segi);
        int a = luas(panjang , lebar);
        System.out.println("Luas     :"+ a);
        int b = keliling(panjang , lebar);
        System.out.println("Keliling :"+ b);
    }
    
}
