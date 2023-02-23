
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimplesmenteEncadeada<Integer> lista = new ListaSimplesmenteEncadeada<>();
		for(int i=1; i<4; i++) {
			lista.adicionar(i);
		}
		
		System.out.println("Tamanho = " + lista.getTamanho());
		System.out.println(lista);
		
	}

}
