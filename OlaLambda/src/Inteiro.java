
@FunctionalInterface
public interface Inteiro {

	int getValue();
	
	public static int multiplica(Inteiro primeiro, Inteiro segundo){
		return primeiro.getValue() * segundo.getValue();
	}
	
	public static void main(String[] args) {
		Inteiro i1 = () -> 5;
		System.out.println(i1.getValue());
		System.out.println(multiplica(i1, () -> 40));
	}
}
