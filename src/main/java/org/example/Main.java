package org.example;

public class Main {
    public static void main(String[] args) {

        NavegadorFirefox navegadorFirefox = new NavegadorFirefox("Firefox");
        NavegadorChrome navegadorChrome = new NavegadorChrome("Chrome");

        System.out.println(navegadorChrome.startNavigator());
        navegadorChrome.ingresarTexto("quiero buscar perritos");
        System.out.println(navegadorChrome.localizarElementos());

        System.out.println(navegadorFirefox.startNavigator());
        navegadorChrome.ingresarTexto("quiero buscar Youtube");
        System.out.println(navegadorFirefox.localizarElementos());

    }
}