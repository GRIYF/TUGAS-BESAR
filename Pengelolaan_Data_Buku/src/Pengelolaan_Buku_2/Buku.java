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
public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String pengarang;
    private int thnTerbit;
    private String lokasi;
    private byte[] gambar;
    private String penerbit;
    private String kategori;

    public Buku(){}
    
    public Buku(String kodeBuku, String judulBuku, String pengarang, int thnTerbit, String lokasi, byte[] gambar, String penerbit, String kategori) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.thnTerbit = thnTerbit;
        this.lokasi = lokasi;
        this.gambar = gambar;
        this.penerbit = penerbit;
        this.kategori = kategori;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getThnTerbit() {
        return thnTerbit;
    }

    public void setThnTerbit(int thnTerbit) {
        this.thnTerbit = thnTerbit;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public byte[] getGambar() {
        return gambar;
    }

    

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
}
