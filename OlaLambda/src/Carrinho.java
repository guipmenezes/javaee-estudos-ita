import java.util.List;

public class Carrinho {
	
	private List<Produto> lista;
	
	public Carrinho(List<Produto> lista) {
		this.lista = lista;
	}
	
	public List<Produto> getLista() {
		return lista;
	}
	
	public void darDesconto(int porcentagem, Condicao<Produto> cond) {
		for(Produto p : lista) {
			if(cond.incluir(p)) {
				p.setValor(p.getValor() * (100 - porcentagem) / 100);
			}
		}
	}

	@Override
	public String toString() {
		return "Carrinho [lista=" + lista + "]";
	}
	

}
