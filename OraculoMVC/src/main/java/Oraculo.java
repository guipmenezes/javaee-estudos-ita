
import java.util.ArrayList;
import java.util.List;

public class Oraculo {
    
    public List<String> melhoresProdutos(String tipo) {
        List<String> lista = new ArrayList<String>();
        
        if(tipo.equals("doce de leite")) {
            lista.add("Viçosa");
            lista.add("Boreal");
            lista.add("Itambé");
        } else if(tipo.equals("queijo mineiro")) {
            lista.add("Candido Tostes");
            lista.add("Humaitá");
            lista.add("O da minha Tia Totônia");
        }
        
        return lista;
    }
    
}
