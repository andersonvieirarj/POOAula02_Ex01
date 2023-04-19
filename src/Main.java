/* HERANÇA -> É a possibilidade de se criar um laço
de ligação entre as classes. Assim como na vida real,
a herança permite "herdar" os comportamentos e característias
de uma classe.
 -> Classe mãe/pai -> Superclasse: que é quem gera a herança
 -> Classe filha -> Subclasse: que é quem herda a herança

  EXEMPLO: PROFESSOR -> ALUNO -> FUNCIONARIO
           nome, endereço, datadenascimento, telefone, cep
           PESSOA -> PROFESSOR -> ALUNO -> FUNCIONARIO
           (SUPER)   (SUBCLASSES)
  OBS: Uma classe pode gerar herança para várias outras
       Uma classe filha NÃO PODE ter duas classes mãe
       As características são herdadas e PODEM ser utilizadas.
 */
public class Main {
    public static void main(String[] args) {
        Professor X = new Professor();
        X.nome = "Anderson Vieira";
        X.CEP = "23333-333";
        X.dataNascimento = "99/99/99";
        X.endereco = "Rua do Sobe e Desce, 222";
        X.telefone = "99999-999";
        X.horasTrabalhadas = 556;

        X.mostrarDados();
        System.out.println(X.horasTrabalhadas);

        Aluno a = new Aluno();
        a.nome = "Zé das Couves";
        System.out.println(a.nome);

    }
}