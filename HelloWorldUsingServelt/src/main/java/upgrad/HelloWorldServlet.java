package upgrad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/gethello")
public class HelloWorldServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter p=response.getWriter();// opens up the stream
        p.print("<!Doctype html>");
        p.print("<html>");
        p.print("<body>");
        p.print("<p>Helllllllloo</p>");
        p.print("</body>");
        p.print("</html>");
        p.close();
    }
}
