/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Pengirim {

private String nama;
private String alamat;
private String kotakodepos;
private String provinsi;
private String telpon;

    public Pengirim() {
    }

    public Pengirim(String nama, String alamat, String kotakodepos, String provinsi, String telpon) {
        this.nama = nama;
        this.alamat = alamat;
        this.kotakodepos = kotakodepos;
        this.provinsi = provinsi;
        this.telpon = telpon;
    }
 
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the kotakodepos
     */
    public String getKotakodepos() {
        return kotakodepos;
    }

    /**
     * @param kotakodepos the kotakodepos to set
     */
    public void setKotakodepos(String kotakodepos) {
        this.kotakodepos = kotakodepos;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * @return the telpon
     */
    public String getTelpon() {
        return telpon;
    }

    /**
     * @param telpon the telpon to set
     */
    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }


    
}
