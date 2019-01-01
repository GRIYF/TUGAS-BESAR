/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pengelolaan_Buku;

/**
 *
 * @author Destroy Eyes
 */
public class ComboItem {
     private int kode;
    private String nama;
    

    public ComboItem(int kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
