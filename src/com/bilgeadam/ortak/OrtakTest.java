package com.bilgeadam.ortak;

public class OrtakTest {

    public void testBuyukHarfeCevir() {
        String kelime = "izmirli İĞDELER ÖÇŞİGÜI";

        System.out.println(Ortak.buyukHarfeCevir(kelime));
    }

    public void testKucukHarfeCevir() {
        String kelime = "IĞDIRLI ıspanaklar ÖÇŞİGÜI";

        System.out.println(Ortak.kucukHarfeCevir(kelime));
    }

    public static void main(String[] args) {

        OrtakTest ortakTest = new OrtakTest();

        ortakTest.testBuyukHarfeCevir();
        ortakTest.testKucukHarfeCevir();

    }
}
