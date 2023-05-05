
public interface ValorQuadrado {

	int aplicaPotenciaDois(Inteiro i);
	
	public static void main(String[] args) {

		ValorQuadrado vq = e -> e.getValue() * e.getValue();
		System.out.println(vq.aplicaPotenciaDois(() -> 7));
		
		int b = (int) Math.sqrt(81);
		System.out.println(vq.aplicaPotenciaDois(() -> b));
	}
}


