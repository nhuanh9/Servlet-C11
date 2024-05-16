package com.example.c11;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String usn = request.getParameter("usn");
        String pass = request.getParameter("pass");
        response.setContentType("text/html");
        String rs = "";
        if (usn.equals("admin") && pass.equals("admin")) {
            rs = "Hello Admin";
        } else  {
            rs = "Hello "+usn;
        }
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + rs + "</h1>");
        out.println("</body></html>");
    }
}


// Lop Product: id, name, price
// /products:
// act=list: hien list product
// act=create: hien form tao product
// act=delete&id=1: xoa product co id la 1
// act=detail&id=1: hien thong san pham 1
