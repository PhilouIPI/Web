import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {
    private static final String TEST_MESSAGE = "SIMPLE SERVLET OK";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        //set response content type
        resp.setContentType("text/html");
        //test 1
        //Actual logic goes here
        PrintWriter out = resp.getWriter();
        out.println("<h1>"+ TEST_MESSAGE + "</h1");
    }
}
