//package org.example;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//class TriangleTest {
//    @Test
//    @DisplayName("输入错误")
//    void parameters_error_test() {
//        Triangle triangle = new Triangle();
//        String type = triangle.classify(0, 4, 5);
//        assertEquals("输入错误", type);
//    }
//    @Test
//    @DisplayName("不等边三角形")
//    void scalene_test() {
//        Triangle triangle = new Triangle();
//        String type = triangle.classify(3, 4, 6);
//        assertEquals("不等边三角形", type);
//    }
//}


package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    @DisplayName(value="不等边三角形")
    void testTriangle() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(3, 4, 6);
        assertEquals("不等边三角形", type);
    }

    @Test
    @DisplayName(value="等边三角形")
    void equallaterialTriangle() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(3, 3, 3);
        assertEquals("等边三角形", type);
    }

    @Test
    @DisplayName(value="非三角形")
    void notTriangle() {
        Triangle triangle = new Triangle();

        String type = triangle.classify(3, 3, 6);
        assertEquals("非三角形", type);
    }

    @ParameterizedTest
    @CsvSource({
            "3,4,6,不等边三角形",
            "3,3,3,等边三角形",
            "3,3,6,非三角形"
    })
    void paramTriangle(int a, int b,int c,String expected) {
        Triangle triangle = new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形一般边界测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形一般边界测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest(int a, int b,int c,String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形健壮性最坏情况测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形健壮性最坏情况测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest1(int a, int b, int c, String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形健壮测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形健壮测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest2(int a, int b, int c, String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形弱一般等价类测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形弱一般等价类测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest3(int a, int b, int c, String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
    @DisplayName(value="三角形最坏情况测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形最坏情况测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest4(int a, int b, int c, String expected) throws ParseException {

        Triangle triangle=new Triangle();

        String type = triangle.classify(a, b, c);

        assertEquals(expected, type);
    }
}