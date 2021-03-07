package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueStringsImpl implements  UniqueStrings{
    /**
     * toUniqueList
     * @param list
     * @return removes a list of String which contains only the unique elements
     */
    @Override
    public List<String> toUniqueList(List<String> list) {
        UniqueStrings uniqueStrings = (l) -> new ArrayList<>(new HashSet<>(l));

        return uniqueStrings.toUniqueList(list);
    }
}
