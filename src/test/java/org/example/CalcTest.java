package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach() {
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }
    @AfterEach
    public void tearDownEach() {
        System.out.println("after each");
    }

    @Test
    @DisplayName("Проверка суммирование")
    @Timeout(10)
    @Tag ("summ")
    void summ() {
        Calc calc =  new Calc();
        int result = calc.summ(1,6);
        Assertions.assertEquals(7, result, "Не тот ответ");

    }

    @Test
        @DisplayName("Проверка вычитание")
        @Timeout(10)
        void subtract() {
            Calc calc =  new Calc();
            int result = calc.subtract(8,1);
            Assertions.assertEquals(7, result, "Не тот ответ");
    }

    @ParameterizedTest (name ="#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, -2, -3", "0, 0, 0"})
    @DisplayName("Проверка суммирование 3")
    void summ1(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }
}