package View;

import Model.Materia;
import java.util.List;
import java.util.Scanner;

public class MateriaView {

    public void menu(List<Materia>materias){

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("------------------------------------");
            System.out.println("          [Bem Vindo]               ");
            System.out.println("                                    ");
            System.out.println(" [1] - Matricular Aluno             ");
            System.out.println(" [2] - Listar Alunos                ");
            System.out.println(" [3] - Verificar Aprovação          ");
            System.out.println(" [0] - Sair                         ");
            System.out.println("------------------------------------");


            int opcao = scan.nextInt();

            switch(opcao) {
                case 1:
                    this.cadastraAluno(materias);
                    break;

                case 2:
                    this.listarAlunos(materias);
                    break;
                case 3:
                    this.verificarAprovacao(materias);
                    break;
                case 0:
                    return;
            }
        } while(true);
    }

    public void cadastraAluno(List<Materia>materias){

        Scanner scan = new Scanner(System.in);
        Materia materia = new Materia();

        System.out.println("------------------------------------");
        System.out.print("Nome do Aluno: ");  materia.setNome(scan.nextLine());
        System.out.print("Idade do Aluno: "); materia.setIdade(scan.nextInt());
        System.out.print("Turma: ");          materia.setTurma(scan.nextLine()); materia.setTurma(scan.nextLine());
        System.out.print("Materia: ");        materia.setNomeMateria(scan.nextLine());
        System.out.print("Nota: ");           materia.setNota(scan.nextBigDecimal());
        System.out.println("------------------------------------");
        materias.add(materia);

    }

    public void listarAlunos(List<Materia> materias){

        System.out.println("------------------------------------");
        for(Materia auxiliar: materias){
            System.out.println("Aluno: " + auxiliar.getNome());
            System.out.println("Idade: " + auxiliar.getIdade());
            System.out.println("Turma : " + auxiliar.getTurma());
            System.out.println("Materia: "+ auxiliar.getNomeMateria());
            System.out.println("Nota: " + auxiliar.getNota());
            System.out.println("------------------------------------");
        }
    }

    public void verificarAprovacao(List<Materia> materias){


        for(Materia auxiliar: materias){
            if(auxiliar.getNota().intValue() >= 70){
                System.out.println("------------------------------------");
                System.out.println("Aluno: " + auxiliar.getNome());
                System.out.println("Idade: " + auxiliar.getIdade());
                System.out.println("Turma : " + auxiliar.getTurma());
                System.out.println("Materia: "+ auxiliar.getNomeMateria());
                System.out.println("Nota: " + auxiliar.getNota());
                System.out.println("------------- APROVADO -------------");
            }
            else if(auxiliar.getNota().intValue() > 49 && auxiliar.getNota().intValue() < 69){
                System.out.println("------------------------------------");
                System.out.println("Aluno: " + auxiliar.getNome());
                System.out.println("Idade: " + auxiliar.getIdade());
                System.out.println("Turma : " + auxiliar.getTurma());
                System.out.println("Materia: "+ auxiliar.getNomeMateria());
                System.out.println("Nota: " + auxiliar.getNota());
                System.out.println("------------ RECUPERAÇÃO -----------");
            }
            else{
                System.out.println("------------------------------------");
                System.out.println("Aluno: " + auxiliar.getNome());
                System.out.println("Idade: " + auxiliar.getIdade());
                System.out.println("Turma : " + auxiliar.getTurma());
                System.out.println("Materia: "+ auxiliar.getNomeMateria());
                System.out.println("Nota: " + auxiliar.getNota());
                System.out.println("------------- REPROVADO ------------");
            }
        }
    }
}
