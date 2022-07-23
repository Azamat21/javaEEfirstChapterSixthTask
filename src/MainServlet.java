
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(value = "/main")

public class MainServlet extends HttpServlet {



    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {

    }



    @Override

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" " +
                "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class='mx-auto' style='width:350px'>");
        out.print("<form action='/func' method='post'>");
        out.print("<table style='border-spacing:20px;border:1px solid lightgray;width:320px; padding:5px;'>");
        out.print("<tr>");
        out.print("<td>FULL NAME:</td><td><input type='text' name='user_name' placeholder='Name'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Exam points:</td><td><input type='number' max-value='100' name='grade'></td><br>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td colspan='2'><button style='margin-left:200px;margin-top:10px;margin-bottom:10px;'>Submit</button></td>");
        out.print("</tr>");
        out.print("</table>");
        out.print("</form>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");

    }

}