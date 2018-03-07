package org.frame.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
* this example used to illustrate that init() is called only once
* */
@WebServlet("/test1")
public class Test1Servelet extends HttpServlet{
    String message="hello,this is the first test!";
    public void init() throws ServletException{
        System.out.println(System.currentTimeMillis()+":servlet is being initializing");
        super.init();
        System.out.println(System.currentTimeMillis()+":servlet initialized finished");
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
         resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.write("<h1>"+message+"</h1>");
        destroy();
    }
    public void  destroy(){
         System.out.println(System.currentTimeMillis()+":servlet is being destroyed");
         super.destroy();
        System.out.println(System.currentTimeMillis()+":servlet destroy finished");
    }
}
