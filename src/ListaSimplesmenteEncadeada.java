
public class ListaSimplesmenteEncadeada<T> {
	
	private No<T> inicio, ultimo;
	private int tamanho;
	
	public void adicionar(T elemento) {
		No<T> celula = new No<T>(elemento);
		if(this.tamanho == 0) {
			this.inicio = celula;
		} else {
			this.ultimo.setProximo(celula);
		}
		this.ultimo = celula;
		this.tamanho++;
	}

	public int getTamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		return "ListaSimplesmenteEncadeada [inicio=" + inicio + "]";
	}
	
}
