/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.DataPaket;
import model.DataPengirim;

/**
 *
 * @author user
 */
public class hitungPaketDAO {

    final double asuransi = 0.03;

    public double hitungBiaya(DataPengirim detail) {
        double total = 0.0;
        double hargaPengiriman;
        double berat = detail.getBeratBarang();
        double harga = detail.getHargaBarang();

        List<DataPaket> hargaPaket = tarifPaketDAO.getKotaTujuan();

        for (DataPaket dataPaket : hargaPaket) {

            if (dataPaket.getTujuanPengiriman().equalsIgnoreCase(detail.getKotaTujuan())) {
                if (detail.getJasaPengiriman().equalsIgnoreCase("Reguler")) {
                    hargaPengiriman = dataPaket.getRegulerServices();
                    if (detail.isAsuransi()) {
                        total = (hargaPengiriman * berat) + (harga * asuransi);

                    } else {
                        total = hargaPengiriman * berat;
                    }
                }
            }

            if (dataPaket.getTujuanPengiriman().equalsIgnoreCase(detail.getKotaTujuan())) {
                if (detail.getJasaPengiriman().equalsIgnoreCase("Kilat")) {
                    hargaPengiriman = dataPaket.getRegulerServices();
                    if (detail.isAsuransi()) {
                        total = (hargaPengiriman * berat) + (harga * asuransi);

                    } else {
                        total = hargaPengiriman * berat;
                    }
                }
            }

            if (dataPaket.getTujuanPengiriman().equalsIgnoreCase(detail.getKotaTujuan())) {
                if (detail.getJasaPengiriman().equalsIgnoreCase("SDS")) {
                    hargaPengiriman = dataPaket.getRegulerServices();
                    if (detail.isAsuransi()) {
                        total = (hargaPengiriman * berat) + (harga * asuransi);

                    } else {
                        total = hargaPengiriman * berat;
                    }
                }
            }

            if (dataPaket.getTujuanPengiriman().equalsIgnoreCase(detail.getKotaTujuan())) {
                if (detail.getJasaPengiriman().equalsIgnoreCase("ONS")) {
                    hargaPengiriman = dataPaket.getRegulerServices();
                    if (detail.isAsuransi()) {
                        total = (hargaPengiriman * berat) + (harga * asuransi);

                    } else {
                        total = hargaPengiriman * berat;
                    }
                }
            }
            if (dataPaket.getTujuanPengiriman().equalsIgnoreCase(detail.getKotaTujuan())) {
                if (detail.getJasaPengiriman().equalsIgnoreCase("HDS")) {
                    hargaPengiriman = dataPaket.getRegulerServices();
                    if (detail.isAsuransi()) {
                        total = (hargaPengiriman * berat) + (harga * asuransi);

                    } else {
                        total = hargaPengiriman * berat;
                    }
                }
            }
        }
        return total;

    }
}
