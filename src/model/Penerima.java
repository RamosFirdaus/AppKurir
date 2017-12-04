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
public class Penerima {

private String nama;
private String alamat;
private String Telepon;

    public Penerima(String nama, String alamat, String Telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.Telepon = Telepon;
    }

    public Penerima() {
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
     * @return the Telepon
     */
    public String getTelepon() {
        return Telepon;
    }

    /**
     * @param Telepon the Telepon to set
     */
    public void setTelepon(String Telepon) {
        this.Telepon = Telepon;
    }



    
}
