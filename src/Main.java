
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimplesmenteEncadeada<Integer> lista = new ListaSimplesmenteEncadeada<>();
		for(int i=1; i<11; i++) {
			lista.adicionar(i);
		}
		
		System.out.println("Tamanho = " + lista.getTamanho());
		System.out.println(lista);
		
		ListaSimplesmenteEncadeada<Integer> novaLista = new ListaSimplesmenteEncadeada<>();
		novaLista.adicionar(1);
		novaLista.adicionar(2);
		novaLista.adicionar(3);
		novaLista.adicionar(4);
		System.out.println(novaLista);
		
	}

}
