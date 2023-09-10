package candidatura;

import model.Candidates;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void selecaoCandidatos(String [] candidatos) {
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        ArrayList<Candidates> selectedCandidates = new ArrayList<>();

        try {
            while (candidatoAtual < 5 && candidatoAtual < candidatos.length) {
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato " + candidato + " solicitou este valor de salário " + String.format("%.2f", salarioPretendido));

                if(salarioBase >= salarioPretendido) {
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                    Candidates candidates = new Candidates(candidato, salarioPretendido, candidatoAtual);
                    selectedCandidates.add(candidates);

                    candidatosSelecionados++;
                }
                candidatoAtual++;
            }
        } catch (Exception e) {
            System.out.println("Erro no sistema " + e);
        } finally {
            ImprimirSelecionados.ImprimirCandidatosSelecionados(selectedCandidates);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
