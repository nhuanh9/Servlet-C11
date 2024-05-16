package com.example.c11;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "abcServlet", value = "/abc")
public class AbcServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("x", "Như Anh");
        request.getRequestDispatcher("/abc.jsp").forward(request, response);

        // Nhan vao a,b =-> Hien ra tong
    }
}


// products?act
// =list => list.jsp
// =create => create.jsp
// =edit => edit.jsp