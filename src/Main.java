
void main() {

    Scanner sc = new Scanner (System.in);

float n_nota1, n_nota2, media , mediaAlunos , somaAlunos=0;
byte alunos;

    for (int i = 1; i <= 5; i++) {

        System.out.println("digite  seu numero na chamada");
        alunos = sc.nextByte();

        System.out.println("Digite sua nota da primeira  prova");
        n_nota1 = sc.nextFloat();


        System.out.println("Digite sua nota da segunda  prova");
        n_nota2 = sc.nextFloat();

        media = (n_nota1 + n_nota2) / 2;
somaAlunos = (somaAlunos + media);
        System.out.println("sua media foi: " + media);
        if (media >= 7) {
            System.out.println("aprovado");
        } else if (media>4) {
            System.out.println("recuperaçao");
        }
         else {
            System.out.println("reprovado");
        }


    }
    mediaAlunos = somaAlunos/5;
    System.out.println("a media da turma foi:" + mediaAlunos);

    sc.close();










}


