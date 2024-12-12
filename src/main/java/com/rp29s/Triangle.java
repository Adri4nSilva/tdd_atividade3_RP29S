package com.rp29s;

public class Triangle {
    /**
     * @param ladoA
     * @param LadoB
     * @param LadoC
     * @return
     */
    public static TriangleType classify(int ladoA, int ladoB, int ladoC) {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            return TriangleType.INVALID;
        }

        // Checar se é um triangulo
        if (ladoA + ladoB <= ladoC ||
            ladoA + ladoC <= ladoB ||
            ladoB + ladoC <= ladoA) {
            return TriangleType.INVALID;
        }

        int matchinglados = 0;
        if (ladoA == ladoB) matchinglados++;
        if (ladoA == ladoC) matchinglados++;
        if (ladoB == ladoC) matchinglados++;

        return switch (matchinglados) {
            case 3 -> TriangleType.EQUILATERAL;
            case 1 -> TriangleType.ISOSCELES;
            case 0 -> TriangleType.SCALENE;
            default -> TriangleType.INVALID;
        };
    }
}
