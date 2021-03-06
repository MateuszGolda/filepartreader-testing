package com.codecool.filepartreader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FilePartReader {
    private String filePath;
    private Integer fromLine;
    private Integer toLine;

    FilePartReader() {
        setup("text.txt", 1, 1);
    }

    /**
     * @throws IllegalArgumentException if toLine < fromLine, or fromLine < 1
     */
    void setup(String filePath, Integer fromLine, Integer toLine) throws IllegalArgumentException {
        if (toLine < fromLine || fromLine < 1) {
            throw new IllegalArgumentException("fromLine has to be > 0, and >= toLine");
        }
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    /**
     * @return content of file on filePath
     * @throws IOException if the file isn't present on filePath
     */
    String read() throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    /**
     * Reads the file with read(), and gives back every line from it's content between fromLine and toLine (both included).
     * Returns these lines as a String.
     *
     * @return every line from file content between fromLine and toLine (both of them are included)
     */
    String readLines() throws IOException {
        String[] lines = read().split("\n");
        var sb = new StringBuilder();
        for (int i = fromLine; i <= Math.min(toLine, lines.length); i++) {
            sb.append(lines[i - 1]).append("\n");
        }
        return sb.toString();
    }
}
