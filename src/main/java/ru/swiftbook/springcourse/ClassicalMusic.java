package ru.swiftbook.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> result = new ArrayList<>();
        result.add("ClassicalMusic1");
        result.add("ClassicalMusic2");
        result.add("ClassicalMusic3");
        return result;
    }
}
