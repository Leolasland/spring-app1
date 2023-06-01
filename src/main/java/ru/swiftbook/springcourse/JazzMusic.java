package ru.swiftbook.springcourse;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> result = new ArrayList<>();
        result.add("JazzMusic1");
        result.add("JazzMusic2");
        result.add("JazzMusic3");
        return result;
    }
}
