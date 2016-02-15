import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("triangle");
  }

  @Test
  public void triangleTestIsNotATriangle() {
    goTo("http://localhost:4567/");
    fill("#sideA").with("1");
    fill("#sideB").with("1");
    fill("#sideC").with("13");
    submit(".btn");
    assertThat(pageSource()).contains("That isn't a triangle!");
  }
  //
  // @Test
  // public void squareTestIsNotASquare() {
  //   goTo("http://localhost:4567/");
  //   fill("#length").with("5");
  //   fill("#width").with("7");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Your rectangle isn't a square");
  // }
}
