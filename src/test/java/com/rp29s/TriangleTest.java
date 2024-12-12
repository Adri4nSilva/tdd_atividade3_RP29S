package com.rp29s;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
      public TriangleTest() {
   }
   @Test
   void testEquilateral() {
      Assertions.assertEquals(TriangleType.EQUILATERAL, Triangle.classify(3, 3, 3));
      System.out.println("Triangulo Equilátero");
   }
   @Test
   void testIsosceles() {
      Assertions.assertEquals(TriangleType.ISOSCELES, Triangle.classify(3, 3, 4));
      System.out.println("Triangulo Isosceles");
   }
   @Test
   void testScalene() {
      Assertions.assertEquals(TriangleType.SCALENE, Triangle.classify(3, 4, 5));
      System.out.println("Triangulo Escaleno");
   }
   @Test
   void testInvalidNegativeSide() {
      Assertions.assertEquals(TriangleType.INVALID, Triangle.classify(-1, 4, 5));
      System.out.println("Lados Inválidos");
   }
   @Test
   void testInvalidTriangleInequality() {
      Assertions.assertEquals(TriangleType.INVALID, Triangle.classify(1, 10, 12));
      System.out.println("Qualquer coisa menos um triangulo");
   }
}
