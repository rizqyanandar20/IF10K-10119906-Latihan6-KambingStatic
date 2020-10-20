/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan6.mamalia;

/**
 *
 * @author senenngahenen
 * Nama      : Rizqy Ananda Rusmana
 * NIM       : 10119906
 * Kelas     : IF-10K
 * Deskripsi : Implementasi Variabel 2 class.
 */
public class KambingStatic {
    
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }    
}