package kz.bitlab.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<form action='/second' method='post' class='container mt-5'>");
        out.print("Full name: <input class='form-control' type='text' name='user_fio'>");
        out.print("Age: <select class='form-control' name='user_age'>");
        for (int i = 0; i < 120; i++) {
            out.print("<option>");
            out.print(i);
            out.print("</option>");
        }
        out.print("</select>");
        out.print("GENDER: Male <input type='radio' name='gender' id='gender' value='male'>");
        out.print(" Female <input name='gender' id='gender' value='female' type='radio'> ");
        out.print("<br>");
        out.print("<button class='btn btn-secondary'> SEND </button>");
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");

    }

}
