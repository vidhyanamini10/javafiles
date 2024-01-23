package objectArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    // Constructor
    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    // Getter methods

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    // Comparator for sorting by rating and profit
    public static Comparator<Movie> ratingAndProfitComparator = Comparator
            .comparingDouble(Movie::getRating)
            .thenComparingDouble(movie -> movie.getCollectionAmount() - movie.getBudget());

    // Comparator for sorting by year released and rating
    public static Comparator<Movie> yearAndRatingComparator = Comparator
            .comparingInt(Movie::getYearReleased)
            .thenComparingDouble(Movie::getRating);

    // toString method to print movie details
    @Override
    public String toString() {
        return "Movie [yearReleased=" + yearReleased + ", rating=" + rating +
                ", budget=" + budget + ", collectionAmount=" + collectionAmount + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating some movies for testing
        Movie movie1 = new Movie(2000, 8.5, 50.0, 120.0);
        Movie movie2 = new Movie(1995, 7.8, 30.0, 80.0);
        Movie movie3 = new Movie(2010, 9.2, 80.0, 200.0);

        // Creating a list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        // Sorting by rating and profit
        System.out.println("Sorting by Rating and Profit:");
        movies.sort(Movie.ratingAndProfitComparator);
        printMovies(movies);

        // Sorting by year released and rating
        System.out.println("\nSorting by Year Released and Rating:");
        movies.sort(Movie.yearAndRatingComparator);
        printMovies(movies);
    }

    // Helper method to print the list of movies
    private static void printMovies(List<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}

