package org.frame.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/formtest")
public class FormTestServlet  extends HttpServlet{
    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse resp) throws IOException,ServletException{
         String name=request.getParameter("name");
         String url=request.getParameter("url");
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        String content="";
        content+="<html>";
        content+="<body>";
        content+="<h1>"+name+"</h1>";
        content+="<h1>"+url+"</h1>";
        content+="</body>";
        content+="</html>";
        out.write(content);
    }
}
