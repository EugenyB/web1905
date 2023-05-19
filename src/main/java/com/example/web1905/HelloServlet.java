package com.example.web1905;

import com.example.web1905.beans.PointBean;
import com.example.web1905.logic.Main;
import com.example.web1905.logic.data.Point;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "helloServlet", value = {"/tabulate"})
public class HelloServlet extends HttpServlet {

    public void init() {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double start = Double.parseDouble(request.getParameter("start"));
        double finish = Double.parseDouble(request.getParameter("finish"));
        double step = Double.parseDouble(request.getParameter("step"));
        List<Point> points = new Main().tabulate(start, finish, step);

        request.setAttribute("pb", new PointBean(points));
        request.getRequestDispatcher("/tab.jsp").forward(request, response);
    }

    public void destroy() {
    }
}