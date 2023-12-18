package Pilas;

import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        boolean parentizado = esParentizado("(esta[()] mal {[]}(");
        if(parentizado){
            System.out.println("Esta bien parentizado");
        } else {
            System.out.println("Esta MAL parentizado");
        }
    }

    public static boolean esParentizado(String cadena){
        Stack<Character> pila = new Stack<>();
        boolean correcto = false;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '(' || cadena.charAt(i) == '{' || cadena.charAt(i) == '[' ){
                pila.push(cadena.charAt(i));
            } else if(cadena.charAt(i) == ')' || cadena.charAt(i) == '}' || cadena.charAt(i) == ']'){
                if(pila.isEmpty()){
                    return false;
                } else {
                    char ultimo = pila.pop();
                    if(cadena.charAt(i) == ')' && ultimo == '('){
                        correcto = true;
                    } else if (cadena.charAt(i) == ']' && ultimo == '['){
                        correcto = true;
                    } else if (cadena.charAt(i) == '}' && ultimo == '{'){
                        correcto = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return pila.isEmpty() && correcto;
    }

}
