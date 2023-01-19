import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaFakerTest {
    public static void main(String[] args) {
        Faker faker = new Faker();

        System.out.println(faker.phoneNumber().cellPhone());

    }
}
