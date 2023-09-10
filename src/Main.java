public class Main {
    public static void main(String[] args) {
        String [] candidatos = {"João", "Maria", "Pedro", "Felipe", "José", "Ana", "Alfredo", "Bárbara", "Carlos"};
        System.out.println("Iniciando sistema de seleção:");
        candidatura.ProcessoSeletivo processo = new candidatura.ProcessoSeletivo();
        processo.selecaoCandidatos(candidatos);
        System.out.println("Processo finalizado.");
    }
}