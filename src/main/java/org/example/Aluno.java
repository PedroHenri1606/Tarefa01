package org.example;
import java.math.BigDecimal;

public class Aluno {
    private String nome;
    private int idade;
    private String turma;
    BigDecimal nota;
    public Aluno() {
    }
    //APRENDI A PASSAR PARA PDF
    public Aluno(String nome, int idade, String turma, BigDecimal nota) {
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public BigDecimal getNota() {
        return nota;
    }
    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
}
