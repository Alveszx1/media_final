package br.senai.sp.jandira.ds1t.mediaescolar.model;

import java.util.Scanner;

public class ResultadoFinal {
    String nomeAluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double mediaFinalAluno;
    String aprovadoReprovado;

    public void coletarDados(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("---------------------------------------------------------------------------------------");

        System.out.print("Digite o nome do aluno: ");
        nomeAluno = leitor.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = leitor.nextDouble();

        System.out.println("---------------------------------------------------------------------------------------");

        calcularMedia();
    }
    public void calcularMedia(){
        mediaFinalAluno = (nota1 + nota2 + nota3 + nota4) / 4;

        if (mediaFinalAluno >= 5){
            aprovadoReprovado = "Aprovado";
        }else{
            aprovadoReprovado = "Reprovado";
        }
        determinarSituacao();
    }
    public void determinarSituacao(){
        if (mediaFinalAluno >= 5){
            aprovadoReprovado = "Aprovado";
        }else if (mediaFinalAluno < 3) {
            aprovadoReprovado = "Reprovado";
        }else {
            aprovadoReprovado = "de Recuperação";
        }
        exibirResultados();
    }

    public void exibirResultados(){
        System.out.println("Média do aluno: "+mediaFinalAluno);
        System.out.print("Resultado: O(a) aluno(a) "+nomeAluno+ " esta "+aprovadoReprovado+" !");
    }
}
