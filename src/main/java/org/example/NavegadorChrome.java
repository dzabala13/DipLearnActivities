package org.example;

public class NavegadorChrome extends Navegador implements AccionesNavegador {

    // this is because we implement inherent and we need supply a constructor with all the attributes of the parent
    public NavegadorChrome(String tipoNavegador) {
        super(tipoNavegador);
    }

    @Override
    String startNavigator() {
        return "tu navegagor " + tipoNavegador + " ha sido inicializado, Bienvenido a Chrome";
    }

    @Override
    public String localizarElementos() {
        return  tipoNavegador + " ha localizado su elemento";

    }

    @Override
    public void ingresarTexto(String text) {
        System.out.println("Chorme navegador: "+ text);

    }
}
