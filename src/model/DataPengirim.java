/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author user
 */
public class DataPengirim {

    /**
     * @return the Asuransi
     */
    public boolean isAsuransi() {
        return Asuransi;
    }

    /**
     * @return the jasaPengiriman
     */
    private String nomorPaket;
    private String kotaTujuan;
    private String jenisBarang;
    private String jasaPengiriman;
    private Double beratBarang;
    private Date tanggalKirim;
    private Double dimensi;
    private boolean Asuransi;
    private Double hargaBarang;
    private String pembayaran;

    public DataPengirim(String nomorPaket, String kotaTujuan, String jenisBarang, Double beratBarang, Date tanggalKirim, Double dimensi, String jenisLayanan, boolean Asuransi, Double hargaBarang, String pembayaran) {
        this.nomorPaket = nomorPaket;
        this.kotaTujuan = kotaTujuan;
        this.jenisBarang = jenisBarang;
        this.beratBarang = beratBarang;
        this.tanggalKirim = tanggalKirim;
        this.dimensi = dimensi;
        this.Asuransi = Asuransi;
        this.hargaBarang = hargaBarang;
        this.pembayaran = pembayaran;
    }

    public DataPengirim() {
    }

    /**
     * @return the nomorPaket
     */
    public String getNomorPaket() {
        return nomorPaket;
    }

    /**
     * @param nomorPaket the nomorPaket to set
     */
    public void setNomorPaket(String nomorPaket) {
        this.nomorPaket = nomorPaket;
    }

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the jenisBarang
     */
    public String getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the beratBarang
     */
    public Double getBeratBarang() {
        return beratBarang;
    }

    /**
     * @param beratBarang the beratBarang to set
     */
    public void setBeratBarang(Double beratBarang) {
        this.beratBarang = beratBarang;
    }

    /**
     * @return the tanggalKirim
     */
    public Date getTanggalKirim() {
        return tanggalKirim;
    }

    /**
     * @param tanggalKirim the tanggalKirim to set
     */
    public void setTanggalKirim(Date tanggalKirim) {
        this.tanggalKirim = tanggalKirim;
    }

    /**
     * @return the dimensi
     */
    public Double getDimensi() {
        return dimensi;
    }

    /**
     * @param dimensi the dimensi to set
     */
    public void setDimensi(Double dimensi) {
        this.dimensi = dimensi;
    }


    /**
     * @return the hargaBarang
     */
    public Double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(Double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the pembayaran
     */
    public String getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getJasaPengiriman() {
        return jasaPengiriman;
    }

    /**
     * @param jasaPengiriman the jasaPengiriman to set
     */
    public void setJasaPengiriman(String jasaPengiriman) {
        this.jasaPengiriman = jasaPengiriman;
    }

}
