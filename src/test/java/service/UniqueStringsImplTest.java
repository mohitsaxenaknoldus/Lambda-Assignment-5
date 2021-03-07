package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UniqueStringsImplTest {

    @org.junit.Test
    public void toUniqueList() {
        UniqueStringsImpl uniqueStrings = new UniqueStringsImpl();
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("scala");
        list.add("java");
        list.add("clojure");
        list.add("clojure");

        List<String> response = uniqueStrings.toUniqueList(list);
        List<String> result = Arrays.asList("java", "scala", "clojure");

        assertEquals(result, response);
    }
}