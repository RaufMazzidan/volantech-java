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
public class TestDrive {
    
    public static void main(String[] args) {
        Rectangle abcd = new Rectangle();
        abcd.panjang = 5;
        abcd.lebar = 10;
        abcd.warna = "Pink";
        abcd.cetak();
        System.out.println("");
        
        Triangle abc = new Triangle();
        abc.panjang = 2;
        abc.lebar = 8;
        abc.warna = "Hijau";
        abc.cetak();
        System.out.println("");
        Circle a = new Circle();
        a.panjang=10;
        a.warna= "Hitam";
        a.cetak();
        
        
        System.out.println("");
        
        Square pqrs = new Square();
        pqrs.warna = "Hijau";
        pqrs.cetak();
        
        System.out.println("");
        
        SamaKaki pqr = new SamaKaki();
        pqr.panjang = 20;
        pqr.lebar= 10;
        pqr.warna = "Hijau";
        pqr.cetak();
    }
}
