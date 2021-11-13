package com.bilgeadam.hayvanatbahcesi;

// Encapsulation = Information Hiding = Bilgi Gizleme
// değişkenler private olur get-set methotlarıyla erişilir.

public class Hayvan {

    private String ad;
    private double agirlik;
    private double uzunluk;

    // Consturactor
    public Hayvan() {
        ad = "";
        agirlik = 0;
        uzunluk = 0;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public void sesCikar() {
        System.out.println("-----");
    }
}
