/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiosplit;

//Se eu selecionar as variaveis e der um insert code + get and seter ele iniciliza todos

public class Aluno {
    public String nome;
    public String curso;
    public int ano;
    public String instituicao;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setAno(String anoTexto) {
        
        this.ano = Integer.parseInt(anoTexto);
        
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    
    public String toString() {
        
        return String.format("Nome: %s\nCurso: %s\nAno:%d\nInstituição: %s\n\n", 
                   this.nome,
                   this.curso,
                   this.ano,
                   this.instituicao);
        
    }

    
    
}



