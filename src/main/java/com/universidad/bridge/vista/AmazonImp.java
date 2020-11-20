/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universidad.bridge.vista;

import com.universidad.bridge.modelo.Amazon;
import com.universidad.bridge.modelo.EnvioColombia;
import com.universidad.bridge.modelo.EnvioMexico;
import com.universidad.bridge.modelo.RepartoAmazon;

/**
 *
 * @author AlvaroCardozo
 */
public class AmazonImp {
    public static void main(String[] args) {
        RepartoAmazon miReparto = new RepartoAmazon(12345, new EnvioColombia());
        //Envio desde Colombia
        System.out.println("Su numero de pedido es " + miReparto.getIdPedido());
        System.out.println(miReparto.procesarPedido());
        System.out.println(miReparto.enviarPedido());
        System.out.println(miReparto.entregarPedido());
        //Cambiar pedido
        miReparto.asignarPedido(new EnvioMexico());
        //Pedido desde Mexico
        System.out.println(miReparto.procesarPedido());
        System.out.println(miReparto.enviarPedido());
        System.out.println(miReparto.entregarPedido());
    }
}
