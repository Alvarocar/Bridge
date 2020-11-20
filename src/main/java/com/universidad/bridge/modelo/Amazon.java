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
public class Amazon {

    protected IEnvio iEnvio;
    
    public Amazon(IEnvio envio ) {
        this.iEnvio = envio;
    }
    
    public String procesarPedido(){
        return iEnvio.procesarPedido();
    }
    
    public String enviarPedido() {
        return iEnvio.enviar();
    }
    
    public String entregarPedido(){
        return iEnvio.entregar();
    }
    
    public void asignarPedido(IEnvio envio){
        this.iEnvio = envio;
    }
}
