
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
		if(this.tamanho == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		
		No<T> atual = this.inicio;
		if(this.inicio == this.ultimo) {
			builder.append(atual.getElemento());
		} else {
			builder.append(atual.getElemento()).append(",");
		}
		while(atual.getProximo() != null) {
			atual = atual.getProximo();
			if(atual.getProximo() != null) {
				builder.append(atual.getElemento()).append(",");
			} else {
				builder.append(atual.getElemento());
			}
		}
		
		return builder.toString();
	}
	
}
