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
public class Test_AlatMusik {
       public static void main(String[] args){
        
    ////////////////// Objek Alat Musik default//////////////
    AlatMusik Gitar = new AlatMusik();
    Gitar.cetak();
    System.out.println("");
    
     ////////////////// Objek Tiup dengan Parameter //////////////
    
    
     Tiup seruling = new Tiup(100000, "Putih", "Ditiup", "Sedang", "Melingkar");
     seruling.cetak();
     System.out.println("");
      
    ////////////////// Objek Pukul dengan Acessor Mutator //////////////
    Pukul Gendang = new Pukul();
    Gendang.setHarga(1560000);
    Gendang.setWarna("Coklat");
    Gendang.setCara_Main("4");
    Gendang.setBahan("Kulit Sapi");
    Gendang.setDiameter(32);
    Gendang.cetak();
    System.out.println("");

 
    
    //2R3-01-Object Constructor Parameter
    Petik bassguitar = new Petik(20000000, "Hitam", "Dipetik", 6, true, "Senar String");
    bassguitar.cetak();
    System.out.println();
    Petik acousticguitar = new Petik(3000000, "Cokelat", "Dipetik", 5, false, "Nylon");
    acousticguitar.cetak();
    
       //2R3-01-Object dari Accesor/Mutator
      ////////////////// Objek Petik dengan Acessor Mutator //////////////
    Petik Kecapi = new Petik();
    Kecapi.setHarga(3500000);
    Kecapi.setWarna("Coklat Muda");
    Kecapi.setCara_Main("Petik");
    Kecapi.setJumlah_Senar(13);
    Kecapi.setButuh_Listrik(false);
    Kecapi.setJenis_Senar("Nylon");
    Kecapi.cetak();
    System.out.println("");
    Petik ukulele = new Petik();
    ukulele.setButuh_Listrik(false);
    ukulele.setCara_Main("Dipetik");
    ukulele.setHarga(200000);
    ukulele.setJenis_Senar("Nylon");
    ukulele.setJumlah_Senar(4);
    ukulele.setWarna("Dark Cokelat");
    ukulele.cetak(); 
    //2R3-01-Object Constructor Default
//    Petik a = new Petik();
//    a.cetak();
//    System.out.println();
//    Petik b = new Petik();
//    b.cetak();
    
//    Gitar gitarlistrik = new Gitar(20000000, "Hitam", "Dipetik", 6, true, "Besar", "Rock");
//    gitarlistrik.cetak();
//    System.out.println();
    
    Gitar gitarakustik = new Gitar();
    gitarakustik.setButuh_Listrik(true);
    gitarakustik.setCara_Main("Dipetik");
    gitarakustik.setHarga(500000);
    gitarakustik.setJenis("Akustik");
    gitarakustik.setJumlah_Senar(5);
    gitarakustik.setUkuran("Kecil");
    gitarakustik.setWarna("Dark Coklat");
    gitarakustik.cetak();
    System.out.println();
    
    Drum fullset = new Drum(10000000, "Putih", "Dipukul", "Sner", 60, 9, "Soft");
    fullset.cetak();
    System.out.println();
    
    Drum mobilesiet = new Drum();
    mobilesiet.setBahan("Kulit");
    mobilesiet.setCara_Main("Dipukul");
    mobilesiet.setDiameter(40);
    mobilesiet.setHarga(5000000);
    mobilesiet.setJenis("Medium");
    mobilesiet.setJumlahSimbal(5);
    mobilesiet.setWarna("Merah");
    mobilesiet.cetak();
    
    Seruling serbambu = new Seruling(200000, "Kuning", "ditiup", "Kecil", "Memanjang", 8, "Tradisional");
    serbambu.cetak();
    System.out.println();
    
    Seruling seratom = new Seruling();
    seratom.setBentuk("Memanjang");
    seratom.setCara_Main("Ditiup");
    seratom.setHarga(3000000);
    seratom.setJenis("Modern");
    seratom.setJumlahLubang(10);
    seratom.setUkuran("Sedang");
    seratom.setWarna("Silver");
    seratom.cetak();
    }
}