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
public class EnvioArgentina implements IEnvio {
    
    @Override
    public String procesarPedido() {
        return "El pedido ha sido procesado desde Argentina";
    }

    @Override
    public String enviar() {
        return "El pedido ha sido enviado desde Argentina";
    }

    @Override
    public String entregar() {
        return "El pedido ha sido entregado desde Argentina";
    }
}
