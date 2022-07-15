package kz.bitlab.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/second")
public class SecondServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String fio = request.getParameter("user_fio");
        int age = Integer.parseInt(request.getParameter("user_age"));
        String gender = request.getParameter("gender");

        if(age>=18){
            if("male".equals(gender)){
                out.print("Hello Dear Mister " + fio + "!");
            }else{
                out.print("Hello Dear Miss " + fio + "!");
            }
        }else{
            if("male".equals(gender)){
                out.print("Hello Dude Mister " + fio + "!");
            }else{
                out.print("Hello Dude Miss " + fio + "!");
            }
        }
    }
}
