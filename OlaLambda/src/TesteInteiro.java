
public class TesteInteiro {
	
	public static void main(String[] args) {
		Inteiro i1 = () -> 5;
		System.out.println(i1.getValue());
		Inteiro i2 = () -> 40;
		System.out.println(i2.getValue());
		System.out.println(multiplica(i1, i2));
	}

}
