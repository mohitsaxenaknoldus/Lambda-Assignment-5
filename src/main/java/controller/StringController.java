package controller;

import service.UniqueStringsImpl;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.List;

public final class StringController {
    private static final Logger LOGGER = Logger.getLogger(StringController.class.getName());

    private StringController(){}

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("scala");
        list.add("java");
        list.add("clojure");
        list.add("clojure");

        UniqueStringsImpl uniqueStrings = new UniqueStringsImpl();
        List<String> result = uniqueStrings.toUniqueList(list);

        for(String str : result) {
            LOGGER.info(str);
        }
    }
}
