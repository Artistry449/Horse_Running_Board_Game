package test;

import org.junit.*;

import Backend.Shagai;

public class ShagaiTest {
    @Test
    public void test() {
        Shagai shagai = new Shagai();

        String shape = shagai.rollShagai();

        System.out.println(shape);

    }
}