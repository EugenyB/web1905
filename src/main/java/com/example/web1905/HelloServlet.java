package com.example.web1905;

import com.example.web1905.beans.ArtistBean;
import com.example.web1905.beans.PointBean;
import com.example.web1905.logic.Main;
import com.example.web1905.logic.data.Artist;
import com.example.web1905.logic.data.Point;
import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "helloServlet", value = {"/tabulate", "/artists"})
public class HelloServlet extends HttpServlet {

    @Resource(name = "jdbc/chinook")
    DataSource ds;

    public void init() {

    }

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (Connection connection = ds.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from artist");
            List<Artist> artists = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("ArtistId");
                String name = rs.getString("Name");
                Artist artist = new Artist(id, name);
                artists.add(artist);
            }
            request.setAttribute("ab", new ArtistBean(artists));
            request.getRequestDispatcher("/artists.jsp").forward(request, response);
        }
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