/**
 * @author falvesmac
 */

package com.br.falves;

public class Notas {
  int nota1;
  int nota2 = 5;
  int nota3;
  int nota4;
  int media;

  public int getNota1() {
    return nota1;
  }
  public void setNota1(int nota1) {
    this.nota1 = nota1;
  }
  public int getNota2() {
    return nota2;
  }
  public void setNota2(int nota2) {
    this.nota2 = nota2;
  }
  public int getNota3() {
    return nota3;
  }
  public void setNota3(int nota3) {
    this.nota3 = nota3;
  }
  public int getNota4() {
    return nota4;
  }
  public void setNota4(int nota4) {
    this.nota4 = nota4;
  }
  public int getMedia() {
    return media;
  }
  public void setMedia(int media) {
    this.media = media;
  }


  public static void main(String[] args) {
    Notas notas = new Notas();

    notas.calculaMedia();
    notas.retornoAprovacao();
  }

  public void calculaMedia() {
    nota1 = 10;
    nota2 = 5;
    nota3 = 7;
    nota4 = 8;

    this.media = (nota1 + nota2 + nota3 + nota4) / 4;
    System.out.println("Sua Média de notas foi: " + media);
  }

  public void retornoAprovacao() {

    if (this.media >= 6) {
      System.out.println("Você foi Aprovado");
    } else if (this.media == 5) {
      System.out.println("Você está de Recuperação");
    } else {
      System.out.println("Você foi Reprovado");
    }
  }
}