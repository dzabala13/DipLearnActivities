package org.example;

import java.sql.SQLOutput;

public class NavegadorFirefox extends Navegador implements AccionesNavegador {


    // this is for inherit
    public NavegadorFirefox (String tipoNavegador){
        // this super allows us to start the attributes's parents before of the
        //start the own attributes's this class
        super(tipoNavegador);
    }

    // this is a metodh abstract that should be implement for the inherits of the Navegator
    @Override
    String startNavigator() {
        return "tu navegagor " + tipoNavegador + " ha sido inicializado, Bienvenido a Firefox";
    }

    // this is a method that should be implement for the implementation of the interface AccionesNAvegador
    @Override
    public String localizarElementos() {
        return tipoNavegador + " ha localizado su elemento";
    }

    // this is a method that should be implement for the implementation of the interface AccionesNAvegador
    @Override
    public void ingresarTexto(String text) {
        System.out.println("Firefox navegador: "+ text);
    }
}
