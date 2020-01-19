package com.example.demo.service;

public class Texto {

    boolean verificarChave (String texto, String chave) {
        if (texto.isEmpty() || texto.length() > 5000) {
            return false;
        }
        return texto.contains(chave);
    }
}
