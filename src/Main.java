import java.util.Scanner;
void main() {

    Scanner sc = new Scanner (System.in);

float n_nota1, n_nota2, media;

    System.out.println("Digite sua nota da primeira  prova");
n_nota1 = sc.nextFloat();


    System.out.println("Digite sua nota da segunda  prova");
    n_nota2 = sc.nextFloat();

media = (n_nota1 + n_nota2) / 2;

    System.out.println("sua media foi: " + media );
if (media >= 7) {System.out.println("aprovado");}
    if (media >4) {System.out.println("recuperaçao");}
    else {System.out.println("reprovado");}
    sc.close();










}


