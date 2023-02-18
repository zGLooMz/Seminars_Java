// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.

package Seminars_Java.Seminar2;

import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;

public class Home22 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("Seminars_Java\\Seminar2\\file.txt");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST");
        }

        Files.writeString(file, sb);
    }
}
