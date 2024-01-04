package Pilas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        //OK
        System.out.println(pila("0 0 /"));
        System.out.println(cola("0 0 /"));
    }

    public static String pila(String expresion){
        Stack<Integer> pila = new Stack<>();
        String resultado = "";
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < expresion.length(); i++) {
            if(expresion.charAt(i) == ' '){
                continue;
            }
            if(Character.isDigit(expresion.charAt(i))){
                pila.push(Integer.parseInt(expresion.charAt(i) + ""));
            } else {
                switch (expresion.charAt(i)){
                    case '+':
                        num1 = pila.pop();
                        num2 = pila.pop();
                        pila.push(num2 + num1);
                        break;
                    case '-':
                        num1 = pila.pop();
                        num2 = pila.pop();
                        pila.push(num2 - num1);
                        break;
                    case '/':
                        try {
                            num1 = pila.pop();
                            num2 = pila.pop();
                            pila.push(num2 / num1);
                        } catch (Exception e){
                            return "ERROR";
                        }
                        break;
                    case '*':
                        num1 = pila.pop();
                        num2 = pila.pop();
                        pila.push(num2 * num1);
                        break;
                }
            }
        }
        resultado = Integer.toString(pila.pop());

        return resultado;
    }

    public static String cola(String expresion){
        Queue<Integer> cola = new LinkedList<>();
        String resultado = "";
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < expresion.length(); i++) {
            if(expresion.charAt(i) == ' '){
                continue;
            }
            if(Character.isDigit(expresion.charAt(i))){
                cola.add(Integer.parseInt(expresion.charAt(i) + ""));
            } else {
                switch (expresion.charAt(i)){
                    case '+':
                        num1 = cola.poll();
                        num2 = cola.poll();
                        cola.add(num2 + num1);
                        break;
                    case '-':
                        num1 = cola.poll();
                        num2 = cola.poll();
                        cola.add(num2 - num1);
                        break;
                    case '/':
                        try {
                            num1 = cola.poll();
                            num2 = cola.poll();
                            cola.add(num2 / num1);
                        } catch (Exception e){
                            return "ERROR";
                        }
                        break;
                    case '*':
                        num1 = cola.poll();
                        num2 = cola.poll();
                        cola.add(num2 * num1);
                        break;
                }
            }
        }
        resultado = Integer.toString(cola.poll());

        return resultado;
    }
}
