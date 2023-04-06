
public class Principal {

	public static void main(String[] args) {
		Cesta<Frutas> c1 = new Cesta<>();
		
		c1.adiciona(new Frutas("Maçã"));
		c1.adiciona(new Frutas("Banana"));
		c1.adiciona(new Frutas("Melão"));
		c1.adiciona(new Frutas("Pêra"));
		c1.adiciona(new Frutas("Morango"));
		
		
		while(c1.temItens()) {
			System.out.println(c1.retira());
		}
	}
}
