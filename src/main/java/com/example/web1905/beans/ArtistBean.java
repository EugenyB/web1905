package com.example.web1905.beans;

import com.example.web1905.logic.data.Artist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArtistBean {
    private List<Artist> artists;
}
