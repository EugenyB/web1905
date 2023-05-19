package com.example.web1905.logic;


import com.example.web1905.logic.data.Point;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        double start = in.nextDouble();
        double finish = in.nextDouble();
        double step = in.nextDouble();

        List<Point> points = tabulate(start, finish, step);

        printPoints(points);
    }

    public List<Point> tabulate(double start, double finish, double step) {
        int n = (int) Math.round((finish - start) / step + 1);

//        List<Point> points = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            double x = start + i * step;
//            double y = f(x);
//            points.add(new Point(x,y));
//        }
//        return points;
        return IntStream.range(0, n).mapToDouble(i -> start + i * step).mapToObj(x -> new Point(x, f(x))).toList();

    }

    private void printPoints(List<Point> points) {
        for (Point p : points) {
            System.out.printf("%4.2f %6.3f\n", p.getX(), p.getY());
        }
    }

    private double f(double x) {
        return Math.sqrt(x);
    }
}
