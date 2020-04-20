package be.learningfever.mavenLessons;
import org.apache.logging.log4j.*;

public class HelloWorld {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.debug("Somebody siad Hello!");
        System.out.println("Hello, World!");
    }
}
