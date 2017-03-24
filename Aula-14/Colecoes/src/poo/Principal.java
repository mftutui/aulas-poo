/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Collection;
import java.util.Stack;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String eq = "-{[bxb-(4xaxc)]/(2xa)}";
        
        Stack<String> abre = new Stack<>();
        Stack<String> fecha = new Stack<>();
        
        for (int i = 0; i<eq.length(); i++) {
            String sub = eq.substring(i,1);
            if ((sub == '(') || (sub == '{') || (sub == '[')){
                
            }
            else  if ((sub == ')') || (sub == '}') || (sub == ']')){
                
            }
    }
    
}
