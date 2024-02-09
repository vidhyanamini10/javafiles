package customException;
import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTest {
    FileReader fileReader = new FileReader();
    @Test
    public void testFileReader() {
        String output = fileReader.readFile("\"C:\\Users\\srivi\\Downloads\\data.txt\"");
        Assert.assertEquals("HelloI am vidhya ", output);
    }
    @Test
    public void testFileException() {
        Exception exception = Assert.assertThrows(RuntimeException.class,
                () -> fileReader.readFile("data.txt"));
        Assert.assertEquals(exception.getMessage(), "File not found");
    }
}