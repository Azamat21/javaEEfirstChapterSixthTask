import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;


@WebServlet(value = "/func")

public class SecondServlet extends HttpServlet {



    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("user_name");
        int grade = Integer.parseInt(request.getParameter("grade"));

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" " +
                "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        String grading = "";
        if(grade>=90){
            grading = "A";
        } else if (grade >= 75&&grade<=89) {
             grading = "B";
        }
        else if (grade>=60&&grade<=74) {
            grading = "C";
        }
        else if (grade>=50&&grade<=59) {
            grading = "D";
        }
        else grading = "F";
        out.print("<div class='mx-auto' style='width:280px'>");
        out.print("<p style='font-size:30px;font-weight:500;' class='container-fluid text-justify text-align'>"+name+"  "+" got"+"  "+grading+"  "+"for exam!"+"</p>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }



    @Override
    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        System.out.println("This is Apply page");


    }

}