public class Executor {
    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();
        System.out.println("Tamanho da lista:" + listaLigada.getTamanho()); // Tamanho 0.

        // Inserindo um elemento na lista ligada
        listaLigada.adicionaInicio(10); // Lista = [10]
        listaLigada.adicionaFinal(11); // Lista = [10,11]
        listaLigada.adicionaFinal(12); // Lista = [10,11,12]
        System.out.println("Tamanho da lista:" + listaLigada.getTamanho());
        // Verificando elementos da minha lista ligada
        listaLigada.mostraNos();

        //  Mostrando lista invertida
        System.out.println("-----------------------------");
        System.out.println("Printando lista inversamente");
        System.out.println("-----------------------------");
        listaLigada.mostraNosInvertido();
        // Testando novos métodos.
        System.out.println("Removido = " + listaLigada.removeInicio()); // Lista = [11,12] Removido = 10
        System.out.println("Removido = " + listaLigada.removeFinal()); // Lista = [11] Removido = 12
        System.out.println("Removido = " + listaLigada.removeInicio()); // Lista = [] Removido = 11
        listaLigada.adicionaInicio(10); // Lista = [10]
        System.out.println("Removido = " + listaLigada.removeFinal()); // Lista = [] Removido = 10
        listaLigada.mostraNos();
        listaLigada.mostraNosInvertido();
    }
}