/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universidad.bridge.modelo;

/**
 *
 * @author AlvaroCardozo
 */
public class RepartoAmazon extends Amazon{

    private int idPedido;
    
    public RepartoAmazon(int idPedido , IEnvio envio) {
        super(envio);
        this.idPedido = idPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public IEnvio getiEnvio() {
        return iEnvio;
    }

    public void setiEnvio(IEnvio iEnvio) {
        this.iEnvio = iEnvio;
    }
    
    
}
