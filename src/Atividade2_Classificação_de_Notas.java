public class Atividade2_Classificação_de_Notas {

        public static void main(String[] args) {
            // 1. Crie uma variável para armazenar a nota de um aluno (de 0 a 10)
            double nota = 8.5; // Você pode alterar o valor para testar diferentes notas

            // classificando a nota
            if (nota >= 9) {
                // 3. Imprima a classificação correspondente
                System.out.println("Excelente");
            } else if (nota >= 7) {
                System.out.println("Bom");
            } else if (nota >= 5) {
                System.out.println("Satisfatório");
            } else {
                System.out.println("Insatisfatório");
            }
        }
    }

