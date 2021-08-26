package com.praticaintegradora;

import com.praticaintegradora.model.GuardaRoupa;
import com.praticaintegradora.model.Roupa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GuardaRoupa guardaRoupa = new GuardaRoupa(0, new HashMap<>());
        Integer codigo = 0;
        for(int i = 0 ; i < 2 ; i++){
            String marca, roupa;
            List<Roupa> roupas = new ArrayList<>();

            Scanner marcaEntrada  = new Scanner(System.in);
            System.out.println("Qual é a marca da sua roupa!");
            marca = marcaEntrada.next();

            Scanner roupaEntrada  = new Scanner(System.in);
            System.out.println("Qual é o modelo da sua roupa!");
            roupa = marcaEntrada.next();

            roupas.add(new Roupa(marca,roupa));

            guardaRoupa.guardarRoupas(roupas);
        }

        guardaRoupa.mostrarRoupas();

        guardaRoupa.devolverRoupas(1);

        System.out.println("---------------------*************Restou no guarda-roupa*************---------------------");

        guardaRoupa.mostrarRoupas();

    }
}
