import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/conversor"})
public class ConversaoServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String celcius = request.getParameter("celsius");
        String fahrenheit = request.getParameter("fahrenheit");
        Integer grau = Integer.valueOf(request.getParameter("grau"));
        Integer temperatura = 0;
        
        if(request.equals(celcius)) {
            temperatura = ((grau - 32) * 5) / 9;  
        } else if(request.equals(fahrenheit)) {
            temperatura = ((grau * 9)/5) + 32;
        } else {
            System.out.println("Selecione uma opção válida!");
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado da conversão: </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>O resultado foi: " + temperatura + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
