import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Bermuda ciclone", 100));
		lista.add(new Produto("Adidas ultraboost", 899));
		lista.add(new Produto("Camisa MCD", 120));
		lista.add(new Produto("Boné Maresia", 50));
		
		Carrinho c = new Carrinho(lista);
		
		c.darDesconto(20, p -> p.getNome().contains("a"));
		
		c.getLista().forEach(System.out::println);
	}

}
