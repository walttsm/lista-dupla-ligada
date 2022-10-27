public class No<T> {
    private T conteudo;
    private No<T> proximo;
    private No<T> anterior;

    public No(T conteudo, No<T> proximo, No<T> anterior) {
        this.conteudo = conteudo;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }
}
