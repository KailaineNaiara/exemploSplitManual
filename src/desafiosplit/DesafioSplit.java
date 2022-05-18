/*
    Uma rotina x carrega um método especifico para analisar e separar uma string com o seguinte formato :
    " Maiara; Redes de Compuadores; 2019; SENAI" 
    A rotina deve retornar um objeto que representa os dados acima.
 */
package desafiosplit;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Kailaine-Naiara
 */

public class DesafioSplit {
    
 public static void main(String[] args) {

        String linha = "Maiara;Redes de Computadores;2021;SENAI";
        Aluno a1 = separaString(linha);
        
        System.out.println(a1.toString());
        
    }
    
    public static Aluno separaString(String origem) {
        
        // Prepara string de origem
        origem = origem + ";";
        
        String aux = "";
        List<String> arrayCampos = new ArrayList();
        

        for (int i = 0; i < origem.length(); i++) {
            
            if (origem.charAt(i) != ';') {
                
                aux = aux + origem.charAt(i);
                
            } else {
                
                arrayCampos.add(aux);
                aux = "";
                
            }
            
        }
        // Exibição do vetor - somente para teste.
        for (String t : arrayCampos) {
            System.out.println(t);
        }
        
        Aluno alunoTemp = new Aluno();
        alunoTemp.setNome(arrayCampos.get(0));
        alunoTemp.setCurso(arrayCampos.get(1));
        alunoTemp.setAno(   arrayCampos.get(2)  );
        alunoTemp.setInstituicao(arrayCampos.get(3));
        
        return alunoTemp;
    }
    
}

   