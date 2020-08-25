package com.codecool.filepartreader;

import java.io.IOException;

public class FilePartReader {
    String filePath;
    Integer fromLine;
    Integer toLine;

    FilePartReader() {
        setup("filepath", 1, 0);
    }

    /**
     * @throws IllegalArgumentException if toLine < fromLine, or fromLine < 1
     */
    public void setup(String filePath, Integer fromLine, Integer toLine) throws IllegalArgumentException {
        if (toLine < fromLine || fromLine < 1) {
            throw new IllegalArgumentException("fromLine has to be > 0, and >= toLine");
        }
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    /**
     * opens the file on filePath, and gives back it's content as a String
     *
     * @return
     * @throws IOException if the file isn't present on filePath
     */
    public String read() throws IOException {
        return null;
    }

    /**
     * reads the file with read ()
     * it gives back every line from it's content between fromLine and toLine (both of them are included), and returns these lines as a String. Take care because if fromLine is 1, it means the very first row in the file. Also, if fromLine is 1 and toLine is 1 also, we will read only the very first line.
     *
     * @return
     */
    public String readLines() {
        return null;
    }
}
