package com.stackroute.collections;

import java.time.LocalDate;
import java.util.*;

public class MovieService {

    private Map<Movie, Integer> movieMap;

    public MovieService() {
        movieMap = new LinkedHashMap<>();
    }

    public Map<Movie, Integer> getMovieMap() {
        return movieMap;
    }

    public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {
        movieMap.put(movie, rating);
        return movieMap.entrySet();
    }

    public List<String> getHigherRatedMovieNames(int rating) {
        List<String> movieNames = new ArrayList<>();
        for (Map.Entry<Movie, Integer> entry : movieMap.entrySet()) {
            if (entry.getValue() >= rating) {
                movieNames.add(entry.getKey().getMovieName());
            }
        }
        return movieNames;
    }

    public List<String> getMovieNamesOfSpecificGenre(String genre) {
        List<String> movieNames = new ArrayList<>();
        for (Map.Entry<Movie, Integer> entry : movieMap.entrySet()) {
            if (entry.getKey().getGenre().equals(genre)) {
                movieNames.add(entry.getKey().getMovieName());
            }
        }
        return movieNames;
    }

    public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
        List<String> movieNames = new ArrayList<>();
        for (Map.Entry<Movie, Integer> entry : movieMap.entrySet()) {
            Movie movie = entry.getKey();
            if (movie.getReleaseDate().isAfter(releaseDate) && entry.getValue() <= 3) {
                movieNames.add(movie.getMovieName());
            }
        }
        return movieNames;
    }

    public List<Movie> getSortedMovieListByReleaseDate() {
        List<Movie> sortedMovies = new ArrayList<>(movieMap.keySet());
        sortedMovies.sort(Comparator.comparing(Movie::getReleaseDate));
        return sortedMovies;
    }

    public Map<Movie, Integer> getSortedMovieListByRating() {
        List<Map.Entry<Movie, Integer>> entries = new ArrayList<>(movieMap.entrySet());
        entries.sort(Comparator.comparing(Map.Entry::getValue));
        LinkedHashMap<Movie, Integer> sortedMovieMap = new LinkedHashMap<>();
        for (Map.Entry<Movie, Integer> entry : entries) {
            sortedMovieMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMovieMap;
    }
}

