
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/oraculoController")
public class OraculoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //pegar o parametro
        String tipoProduto = request.getParameter("produto");
        
        //chamar a regra de negocio
        Oraculo oraculo = new Oraculo();
        List<String> produtos = oraculo.melhoresProdutos(tipoProduto);
        request.setAttribute("produtos", produtos);
        request.getRequestDispatcher("resposta.jsp").forward(request, response);
        
        //passar o controle para um view
    }

}
