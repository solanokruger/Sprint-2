package com.company;

public class ValidarFrase {


    public String validarFrase(char[] caracteres, String entrada){
        int divertido = 0;
        int chateado = 0;
        String status;

        for (int i = 0; i < entrada.length(); i++) {
            if(caracteres[i] == ':' && caracteres[i+1] == '-' && caracteres[i+2] == ')'){
                divertido++;
            }
        }

        for (int i = 0; i < entrada.length(); i++) {
            if(caracteres[i] == ':' && caracteres[i+1] == '-' && caracteres[i+2] == '('){
                chateado++;
            }
        }

        if(divertido > chateado){
            status = "divertido";
        }else if(chateado > divertido){
            status = "chateado";
        }else{
            status = "neutro";
        }

        return status;
    }
}
