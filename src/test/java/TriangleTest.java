import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_isNotTriangle() {
    Triangle testTriangle = new Triangle(2, 2, 7);
    assertEquals(false, testTriangle.isTriangle());
  }
  @Test
  public void newTriangle_isTriangle() {
    Triangle testTriangle = new Triangle(2, 7, 7);
    assertEquals(true, testTriangle.isTriangle());
  }
  @Test
  public void newTriangle_isEquilateral() {
    Triangle testTriangle = new Triangle(7, 7, 7);
    assertEquals("equilateral", testTriangle.triangleType());
  }
  @Test
  public void newTriangle_isIsosceles() {
    Triangle testTriangle = new Triangle(6, 7, 7);
    assertEquals("isosceles", testTriangle.triangleType());
  }
  @Test
  public void newTriangle_isScalene() {
    Triangle testTriangle = new Triangle(6, 5, 7);
    assertEquals("scalene", testTriangle.triangleType());
  }
}
