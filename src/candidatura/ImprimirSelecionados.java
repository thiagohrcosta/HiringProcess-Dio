package candidatura;

import model.Candidates;

import java.util.ArrayList;

public class ImprimirSelecionados {

    public static void ImprimirCandidatosSelecionados(ArrayList<Candidates> selectedCandidates) {
        System.out.println("====== LISTA DOS SELECIONADOS =====");
        for (Candidates candidate : selectedCandidates) {
            System.out.println("O candidato selecionado foi: " + candidate.getName() +
                    ", Salario: " + String.format("%.2f", candidate.getSalary()) +
                    ", Registro: " + candidate.getIndex());
        }
        System.out.println("===================================");

    }
}
