package com.bilgeadam.hayvanatbahcesi;

//Inheritance
//Superclass'ın özelliklerini subclass alıyor.
//Extends ile sağlanır.
public class Kopek extends Hayvan{

    private String kopekCins;
    private double kuyrukUzunlugu;

    public String getKopekCins() {
        return kopekCins;
    }

    public void setKopekCins(String kopekCins) {
        this.kopekCins = kopekCins;
    }

    public double getKuyrukUzunlugu() {
        return kuyrukUzunlugu;
    }

    public void setKuyrukUzunlugu(double kuyrukUzunlugu) {
        this.kuyrukUzunlugu = kuyrukUzunlugu;
    }

    //Methot Overriding
    //Superclass methodunu kendimize özgü yeniden yazıyoruz.
    @Override //olmasada çalışır.
    public void sesCikar(){
        System.out.println("Hav Hav");
    }

    @Override
    public String toString() {
        return "Ad: " + getAd() + "\n" +
               "Cins: " + getKopekCins() + "\n" +
               "Ağırlık: " + getAgirlik() + "\n" +
               "Uzunluk: " + getUzunluk() + "\n" +
               "Kuyruk Uzunluğu: " +getKuyrukUzunlugu() + "cm";
    }
}