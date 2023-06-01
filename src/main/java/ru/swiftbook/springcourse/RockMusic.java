package ru.swiftbook.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> result = new ArrayList<>();
        result.add("RockMusic1");
        result.add("RockMusic2");
        result.add("RockMusic3");
        return result;
    }
}
