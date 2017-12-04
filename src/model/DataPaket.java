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
public class DataPaket {
    private String tujuanPengiriman;
    private double regulerServices;
    private double kilatServices;
    private double sameDayServices;
    private double oneNightServices;
    private double holidayServices;

//    public DataPaket(String tujuanPengiriman, double regulerServices, double kilatServices, double sameDayServices, double oneNightServices, double holidayServices) {
//        this.tujuanPengiriman = tujuanPengiriman;
//        this.regulerServices = regulerServices;
//        this.kilatServices = kilatServices;
//        this.sameDayServices = sameDayServices;
//        this.oneNightServices = oneNightServices;
//        this.holidayServices = holidayServices;
//    }

    public DataPaket() {
    }

    /**
     * @return the tujuanPengiriman
     */
    public String getTujuanPengiriman() {
        return tujuanPengiriman;
    }

    /**
     * @param tujuanPengiriman the tujuanPengiriman to set
     */
    public void setTujuanPengiriman(String tujuanPengiriman) {
        this.tujuanPengiriman = tujuanPengiriman;
    }

    /**
     * @return the regulerServices
     */
    public double getRegulerServices() {
        return regulerServices;
    }

    /**
     * @param regulerServices the regulerServices to set
     */
    public void setRegulerServices(double regulerServices) {
        this.regulerServices = regulerServices;
    }

    /**
     * @return the kilatServices
     */
    public double getKilatServices() {
        return kilatServices;
    }

    /**
     * @param kilatServices the kilatServices to set
     */
    public void setKilatServices(double kilatServices) {
        this.kilatServices = kilatServices;
    }

    /**
     * @return the sameDayServices
     */
    public double getSameDayServices() {
        return sameDayServices;
    }

    /**
     * @param sameDayServices the sameDayServices to set
     */
    public void setSameDayServices(double sameDayServices) {
        this.sameDayServices = sameDayServices;
    }

    /**
     * @return the oneNightServices
     */
    public double getOneNightServices() {
        return oneNightServices;
    }

    /**
     * @param oneNightServices the oneNightServices to set
     */
    public void setOneNightServices(double oneNightServices) {
        this.oneNightServices = oneNightServices;
    }

    /**
     * @return the holidayServices
     */
    public double getHolidayServices() {
        return holidayServices;
    }

    /**
     * @param holidayServices the holidayServices to set
     */
    public void setHolidayServices(double holidayServices) {
        this.holidayServices = holidayServices;
    }

    @Override
    public String toString() {
        return this.tujuanPengiriman;
    }
    
}
