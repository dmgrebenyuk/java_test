package ru.qa.javatest.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

   @Test
   public void testArea() {
      Square s = new Square(7);
      Assert.assertEquals(s.area(),49);

   }
}
