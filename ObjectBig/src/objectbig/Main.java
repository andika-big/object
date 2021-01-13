/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectbig;

/**
 *
 * @author User
 */
public class Main {
     public static void main(String[] args) {
        Hewan Garuda = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");
        Garuda.beratHewan(5);
        Garuda.jumlahKakiHewan(2);
        Garuda.cetakHewan();
        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    } 
}
