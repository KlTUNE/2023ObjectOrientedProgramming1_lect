package jp.ac.ait.k22121;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class JpegCrasher {
    public static void main(String[] args) {
        crash("Baboon.jpg", "Baboon_out.jpg", 15);
    }
    /**
     * 入力されたファイルのランダムな1Byteをランダムな1bit加算で置き換えることでファイルをクラッシュさせる
     * @param input_filePath
     * @param output_filePath
     * @param challenge
     */
    public static void crash(String input_filePath, String output_filePath, int challenge) {
        // TODO:
        byte[] bytes;
        try {
            bytes = Files.readAllBytes(Path.of(input_filePath));
            byte[] bits = {
                    (byte)0b00000001,
                    (byte)0b00000010,
                    (byte)0b00000100,
                    (byte)0b00001000,
                    (byte)0b00010000,
                    (byte)0b00100000,
                    (byte)0b01000000,
                    (byte)0b10000000
            };
            byte value = bits[new Random().nextInt(bits.length)];

            for (int i=0;i<challenge;i++){
                int randomIndex = new Random().nextInt(bytes.length);
                bytes[randomIndex] = (byte)((int)bytes[randomIndex] + (int)value & 0xFF);
            }

            Files.write( Path.of(output_filePath), bytes, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
