package org.example;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Pedro",19,"A",new BigDecimal(100)));
        alunos.add(new Aluno("Cleber",19,"A",new BigDecimal(49)));
        alunos.add(new Aluno("Junior",19,"A",new BigDecimal(20)));
        alunos.add(new Aluno("Gilmar",19,"A",new BigDecimal(80)));
        alunos.add(new Aluno("Jair",19,"A",new BigDecimal(99)));
        alunos.add(new Aluno("Sebastião",19,"A",new BigDecimal(100)));
        alunos.add(new Aluno("Clara",19,"A",new BigDecimal(10)));
        alunos.add(new Aluno("Irineu",19,"A",new BigDecimal(5)));
        alunos.add(new Aluno("Bruna",19,"A",new BigDecimal(100)));
        alunos.add(new Aluno("Iris",19,"A",new BigDecimal(98)));
        alunos.add(new Aluno("Claudia",19,"A",new BigDecimal(70)));
        alunos.add(new Aluno("Peter",19,"A",new BigDecimal(69)));
        alunos.add(new Aluno("Claudio",19,"A",new BigDecimal(25)));
        alunos.add(new Aluno("Jonas",19,"A",new BigDecimal(95)));
        alunos.add(new Aluno("Jorge",19,"A",new BigDecimal(78)));
        alunos.add(new Aluno("Jorel",19,"A",new BigDecimal(71)));
        alunos.add(new Aluno("Germano",19,"A",new BigDecimal(81)));
        alunos.add(new Aluno("Gabriel",19,"A",new BigDecimal(44)));
        alunos.add(new Aluno("Gabriela",19,"A",new BigDecimal(29)));
        alunos.add(new Aluno("Gauderio",19,"A",new BigDecimal(100)));
        alunos.add(new Aluno("Gaby",19,"A",new BigDecimal(100)));

        for(Aluno auxiliar : alunos) {
            if(auxiliar.getNota().intValue() >= 70) {
                System.out.println(auxiliar.getNome() + " APROVADO");
            }
                if(auxiliar.getNota().intValue() < 70 && auxiliar.getNota().intValue() >=49) {
                    System.out.println(auxiliar.getNome() + " RECUPERAÇÃO");
                }
                    if(auxiliar.getNota().intValue() < 50){
                        System.out.println(auxiliar.getNome() + " REPROVADO");
                    }
        }
    }
}