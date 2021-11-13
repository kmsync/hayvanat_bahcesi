package com.bilgeadam.hayvanatbahcesi;

// Hayvan classının objesinin oluşturulmasını istemiyorum
// abstract class yapacağız.
public abstract class Hayvan {

    private String ad;
    private double agirlik;
    private double uzunluk;

    // Consturactor
    public Hayvan() {
        ad = "";
        agirlik = 0;
        uzunluk = 0;
    }

    // Encapsulation = Information Hiding = Bilgi Gizleme
    // değişkenler private olur get-set methotlarıyla erişilir.
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
