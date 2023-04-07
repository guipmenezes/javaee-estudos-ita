import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Cesta<Frutas> cesta = new Cesta<>();
		
		cesta.adiciona(new Frutas("Maca"));
		cesta.adiciona(new Frutas("Banana"));
		cesta.adiciona(new Frutas("Melao"));
		cesta.adiciona(new Frutas("Pera"));
		cesta.adiciona(new Frutas("Morango"));
		cesta.adiciona(new FrutaVermelha("Framboesa"));
		
		List<FrutaVermelha> vermelhas = new ArrayList<>();
		vermelhas.add(new FrutaVermelha("Amora"));
		vermelhas.add(new FrutaVermelha("Cereja"));
		
		//Se eu tentar adicionar a lista vermelhas dentro da cesta, ele não aceita
		
		
		while(cesta.temItens()) {
			System.out.println(cesta.retira());
		}
		
	}
}
