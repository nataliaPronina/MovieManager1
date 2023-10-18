import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test

    public void addNewMovieNotAdded() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void addNewMoviePlusOne() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film One");
        String[] expected = {"Film One"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewMoviePlusSeveral() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film One");
        manager.addMovie("Film Two");
        manager.addMovie("Film Three");

        String[] expected = {"Film One", "Film Two", "Film Three"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewMovieFindLast() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film One");
        manager.addMovie("Film Two");
        manager.addMovie("Film Three");
        manager.addMovie("Film Four");
        manager.addMovie("Film Five");

        String[] expected = {"Film Five", "Film Four", "Film Three", "Film Two", "Film One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewMovieFindLastIfSix() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film One");
        manager.addMovie("Film Two");
        manager.addMovie("Film Three");
        manager.addMovie("Film Four");
        manager.addMovie("Film Five");
        manager.addMovie("Film Six");

        String[] expected = {"Film Six", "Film Five", "Film Four", "Film Three", "Film Two"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewMovieFindLastIfThree() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film One");
        manager.addMovie("Film Two");
        manager.addMovie("Film Three");

        String[] expected = {"Film Three", "Film Two", "Film One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
