package org.lessons.java.shop;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Prodotto product1 = new Prodotto();

        // Modifica del nome del prodotto creato
        product1.setName("Maglietta");

        // Test per provare la non possibilità di modificare il nome attraverso la modifica dell'attributo
        /*product1.name = "djkdjddj";*/

        // Modifca del prezzo di un attributo
        product1.setPrice(15.99);

        // Prezzo base a schermo con utilizzo del metodo getPrice
        System.out.println("Il prezzo base del prodotto è " + new DecimalFormat("0.00€").format(product1.getPrice()));
        // Prezzo con iva a schermo con utilizzo del metodo getPrice
        System.out.println("Il prezzo con iva del prodotto è " + new DecimalFormat("0.00€").format(product1.getVatPrice()));

        // Chiamata al metodo getExtendedName
        System.out.println("Il nome del prodotto per esteso è " + product1.getExtendedName());
    }
}
