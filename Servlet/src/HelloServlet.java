import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
            response.getWriter().println("<h1>Hello Servlet</h1>");
            response.getWriter().println(request.getRequestURL()+"<br/>");
            response.getWriter().println(new Date());
            response.setHeader("TODAY","HELLO WORLD");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
