import javax.swing.JOptionPane;

class Main {

    // Declaração de Variáveis

    static float Notas[][] = new float[3][2], mediaProvas[] = new float[2];
    static String mostrarMatriz = " ", mostraProvas = " ", alunos[] = new String[3];;

    public static void main(String[] args) {

        // Primeiro laço de repetição (for) que receberá as notas dos alunos
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Inserção dos dados do aluno " + (i + 1));
            for (int j = 0; j < 2; j++) {

                // Laço de repetição (do while) repete a ação enquanto a condição não for
                // satisfeita.
                do {
                    Notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da Prova " + (j + 1)));

                    // Confição para verificar se o valor é menor que 0 ou maior que 10
                    if (Notas[i][j] < 0 || Notas[i][j] > 10) {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                } while (Notas[i][j] < 0 || Notas[i][j] > 10);
            }
        }

        /*
         * Laço de repetição que monta a estrutura da matriz que mostrará os resultados
         * e fazer o cálculo da média
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 2; j++) {
                alunos[i] = "Média do " + (i + 1) + "º aluno: ";

                Notas[i][j] = (Notas[i][j - 1] + Notas[i][j]) / 2;
                mostrarMatriz += alunos[i] + Notas[i][j] + " " + " ";

            }
            mostrarMatriz += "\n"; // Concatenando a quebra de linha na matriz
        }

        // Laço de repetição para calcular a média das notas de prova
        for (int i = 0; i <= 1; i++) {
            mediaProvas[i] = (Notas[0][i] + Notas[1][i] + Notas[2][i]) / 3;
            mostraProvas += "Média da " + (i + 1) + " º prova: " + String.format("%.2f", mediaProvas[i]) + "\n";
        }
        // Imprimindo o resultado das médias dos alunos
        JOptionPane.showMessageDialog(null, "Abaixo temos a média dos alunos:" + "\n" + mostrarMatriz);

        // Imprimindo o resultado das médias das notas
        JOptionPane.showMessageDialog(null, "A médias da prova foi de: \n" + mostraProvas);

    }

}
