import javax.swing.JOptionPane;

class Main {

    static float Notas[][] = new float[3][2];
    static float media[][] = new float[3][2];
    static String alunos[] = new String[3];
    static String mostrarMatriz = " ";

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Inserção dos dados do aluno " + (i + 1));
            for (int j = 0; j < 2; j++) {

                do {
                    Notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da Prova " + (j + 1)));
                    if (Notas[i][j] < 0 || Notas[i][j] > 10) {
                        JOptionPane.showMessageDialog(null, "Valor inválido!");
                    }
                } while (Notas[i][j] < 0 || Notas[i][j] > 10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 2; j++) {
                alunos[i] = "Média do " + (i + 1) + "º aluno: ";
                media[i][j] = (Notas[i][j - 1] + Notas[i][j]) / 2;
                mostrarMatriz += alunos[i] + media[i][j] + " " + " ";
            }
            mostrarMatriz += "\n";
        }

        JOptionPane.showMessageDialog(null, "Abaixo temos a média dos alunos:" + "\n" + mostrarMatriz);

    }

}