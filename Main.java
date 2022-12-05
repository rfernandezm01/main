import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(System.getenv("PATH"));
    System.out.println(System.getenv("HOME"));
    //  System.out.println(System.getenv(""));

    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
    // File pathBinary = new File("src/main/resources/firefox");
    //  FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
    // DesiredCapabilities desired = new DesiredCapabilities();
    FirefoxOptions options = new FirefoxOptions();
    // desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
    WebDriver driver = new FirefoxDriver(options);
    driver.get("https://genshin-impact.fandom.com/es/wiki/Wiki_Genshin_Impact");
    String title = driver.getTitle();

    WebElement acceptButton = driver.findElement(By.className("NN0_TB_DIsNmMHgJWgT7U"));

    acceptButton.click();


    List<WebElement> cardLinks = driver.findElements(By.className("card-link"));


    for (WebElement cardLink : cardLinks) {
      System.out.println(cardLink.getText());
    }
    int entrar = 0;
    while(entrar == 0){
    System.out.println("Que quieres scriptear");
    System.out.println("1- Personaje, 2- Región, 3- Arma, 4- Salir");
    int usuario = scan.nextInt();


    switch (usuario) {
      case 1:
        driver.findElement(By.linkText("Shogun Raiden")).click();
        System.out.println("Title of page is: " + driver.getTitle());

        List<WebElement> ps = driver.findElements(By.tagName("p"));
        List<WebElement> his = driver.findElements(By.className("mw-collapsible"));

        for (WebElement p : ps) {
          System.out.println(p.getText());
        }
        for (WebElement historia : his) {
          System.out.println(historia.getText());
        }
        break;

      case 2:
        driver.findElement(By.linkText("Shogun Raiden")).click();
        System.out.println("Title of page is: " + driver.getTitle());

        driver.get("https://genshin-impact.fandom.com/es/wiki/Inazuma");
        System.out.println("Title of page is: " + driver.getTitle());

        List<WebElement> ps2 = driver.findElements(By.tagName("p"));
        List<WebElement> his2 = driver.findElements(By.className("mw-collapsible"));

        for (WebElement p : ps2) {
          System.out.println(p.getText());
        }
        for (WebElement historia : his2) {
          System.out.println(historia.getText());
        }
        break;

      case 3:
        driver.findElement(By.linkText("Shogun Raiden")).click();
        System.out.println("Title of page is: " + driver.getTitle());

        driver.get("https://genshin-impact.fandom.com/es/wiki/Lanza");
        System.out.println("Title of page is: " + driver.getTitle());

        List<WebElement> ps3 = driver.findElements(By.tagName("p"));
        List<WebElement> his3 = driver.findElements(By.className("mw-collapsible"));

        for (WebElement p : ps3) {
          System.out.println(p.getText());
        }
        for (WebElement historia : his3) {
          System.out.println(historia.getText());
        }
        break;
      case 4:
        entrar++;
        break;

      default:
        System.out.println("Esta opción no esta permitida");
        break;
    }
  }

  }

}
 driver.close();
}


