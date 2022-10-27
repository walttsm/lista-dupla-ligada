import java.lang.IndexOutOfBoundsException;

public class ListaLigada<T> {

    private No<T> primeiro;
    private int tamanho;

    public ListaLigada() {
        primeiro = null;
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionaInicio(T conteudo) {
        if (tamanho == 0) {
            No<T> novoNo = new No<T>(conteudo, null, null);
            primeiro = novoNo;
        } else {
            No<T> novoNo = new No<T>(conteudo, primeiro, null);
            primeiro.setAnterior(novoNo);
            this.primeiro = novoNo;
        }
        tamanho++;
    }

    public void adicionaFinal(T conteudo) {
        No<T> novoNo = new No<T>(conteudo, null, null);
        if (tamanho == 0) {
            primeiro = novoNo;
        } else {
            No<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
            novoNo.setAnterior(atual);
        }
        tamanho++;
    }

    public T removeInicio() {
        No<T> removido;
        if (tamanho == 0) {
            throw new IndexOutOfBoundsException("Lista sem elementos. Tamanho == 0.");
        } else if (tamanho == 1) {
            removido = this.primeiro;
            this.primeiro = null;
        } else {
            No<T> segundo = this.primeiro.getProximo();
            removido = this.primeiro;
            segundo.setAnterior(null);
            this.primeiro = segundo;
        }

        tamanho--;
        return removido.getConteudo();
    }

    public T removeFinal() {
        No<T> removido;
        if (tamanho == 0) {
            throw new IndexOutOfBoundsException("Lista sem elementos. Tamanho == 0.");
        } else if (tamanho == 1) {
            removido = this.primeiro;
            this.primeiro = null;
        } else {
            No<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            No<T> anterior = atual.getAnterior();
            anterior.setProximo(null);
            removido = atual;
        }
        tamanho--;
        return removido.getConteudo();
    }

    public void mostraNos() {
        if (tamanho != 0) {
            No<T> atual = primeiro;
            int contador = 0;
            // atual = atual.getProximo();
            while (atual.getProximo() != null) {
                System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
                atual = atual.getProximo();
                contador++;
            }
            System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
        } else {
            System.out.println("Não existe nenhum elemento na lista.");
        }
    }

    public void mostraNosInvertido() {
        if (tamanho != 0) {
            No<T> atual = primeiro;
            int contador = 0;
            // atual = atual.getProximo();
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
                contador++;
            }

            while (atual.getAnterior() != null) {
                System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
                atual = atual.getAnterior();
                contador--;
            }
            System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
        } else {
            System.out.println("Não existe nenhum elemento na lista.");
        }
    }

}