package com.example.web1905.beans;

import com.example.web1905.logic.data.Point;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointBean {
    private List<Point> points;
}
