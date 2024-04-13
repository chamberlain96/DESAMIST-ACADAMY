package com.desamist.academy;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Welcome to Desamist Academy</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome to Desamist Academy</h1>");
        out.println("<p>This is your starting point for learning!</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
