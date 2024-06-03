package org.example;

public abstract class  Navegador {

    protected String tipoNavegador;

    public Navegador(String tipoNavegador) {
        this.tipoNavegador = tipoNavegador;
    }

    public String getTipoNavegador() {
        return tipoNavegador;
    }

    public void setTipoNavegador(String tipoNavegador) {
        this.tipoNavegador = tipoNavegador;
    }

    abstract String  startNavigator();
}
