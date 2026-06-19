public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Welcome to DevOps");
    }
}
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileDownloader {

    public static void main(String[] args) {
        String fileUrl = "https://example.com/sample.pdf";
        String destination = "sample.pdf";

        try (InputStream in = new URL(fileUrl).openStream()) {
            Files.copy(in,
                    Path.of(destination),
                    StandardCopyOption.REPLACE_EXISTING);

            System.out.println("File downloaded successfully!");
        } catch (Exception e) {
            System.err.println("Download failed: " + e.getMessage());
        }
    }
}
