/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PP7;

/**
 *
 * @author bhadr
 */
public class MataKuliah {
    private String kode;
    private String nama;
    private int SKS;

    public MataKuliah(String kode, String nama, int sks) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.SKS = sks;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }
}
