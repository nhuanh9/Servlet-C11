package com.example.c11;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "productServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    ArrayList<Product> list = new ArrayList<>();

    public ProductServlet() {
        list.add(new Product(1, "BBB", 25));
        list.add(new Product(2, "CCC", 40));
        list.add(new Product(1, "DDD", 30));
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Product product = new Product(1,"AAA", 20);
        String name = "Hello";
        request.setAttribute("x",name);
        request.setAttribute("p",product);
        request.setAttribute("l",list);
        request.getRequestDispatcher("product/list.jsp").forward(request, response);
    }
}