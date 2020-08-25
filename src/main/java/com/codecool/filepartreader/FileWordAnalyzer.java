package com.codecool.filepartreader;

import java.util.List;

public class FileWordAnalyzer {
    private final FilePartReader reader;

    FileWordAnalyzer(FilePartReader reader) {
        this.reader = reader;
    }

    /**
     * calls FilePartReader.readLines()
     *
     * @return the words ordered by alphabetically as an ArrayList
     */
    public List<String> getWordsOrderedAlphabetically() {
        return null;
    }

    /**
     * calls FilePartReader.readLines()
     *
     * @param subString
     * @return the words which contains the subString
     */
    public List<String> getWordsContainingSubstring(String subString) {
        return null;
    }

    /**
     * calls FilePartReader.readLines()
     *
     * @return the words from the String which are palindrome
     */
    public List<String> getStringsWhichPalindromes() {
        return null;
    }
}
