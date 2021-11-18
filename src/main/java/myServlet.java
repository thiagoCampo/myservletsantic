import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/patients"}, loadOnStartup = 1)
public class myServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletPath();
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        resp.getWriter().write("<!DOCTYPE html><html>");
        resp.getWriter().write("<head>");
        resp.getWriter().write("<title> Hello, world!</title>");
        resp.getWriter().write("</head");
        resp.getWriter().write("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
