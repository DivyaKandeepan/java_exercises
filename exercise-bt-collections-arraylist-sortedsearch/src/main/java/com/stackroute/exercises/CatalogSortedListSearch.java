package com.stackroute.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {
    private List<String> sortedCatalogList;

    public String catalogListSorter(List<String> unSortedCatalogList) {
        if (unSortedCatalogList == null) {
            return "The catalog list is null";
        }
        if (unSortedCatalogList.isEmpty()) {
            return "The catalog List is empty";
        }
        if (unSortedCatalogList.contains(null) || unSortedCatalogList.contains("") || unSortedCatalogList.contains(" ")) {
            return "The catalog List contains empty or null or blank space as a value";
        }
        sortedCatalogList = new ArrayList<>(unSortedCatalogList);
        Collections.sort(sortedCatalogList);
        return sortedCatalogList.toString();
    }

    public String catalogListSearcher(String value) {
        if (value == null || value.isEmpty() || value.trim().isEmpty()) {
            return "Input is not accepted";
        }
        if (sortedCatalogList == null || sortedCatalogList.isEmpty()) {
            return "The catalog List is empty";
        }
        value = value.trim().toLowerCase(); // Convert value to lowercase for case-insensitive search
        int index = Collections.binarySearch(sortedCatalogList, value, String.CASE_INSENSITIVE_ORDER);
        if (index >= 0) {
            return "Found: " + sortedCatalogList.get(index);
        }
        return "Not Found";
    }
    
}
