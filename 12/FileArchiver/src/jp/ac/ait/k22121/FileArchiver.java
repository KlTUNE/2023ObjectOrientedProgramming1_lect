package jp.ac.ait.k22121;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileArchiver {
    public static void main(String[] args) {
        String file = "Baboon_out.jpg";
        String output = file + ".zip";

        zip(file, output);
    }
    public static void zip(String file, String output) {
        Path input = Paths.get(file);

        try(FileOutputStream fos = new FileOutputStream(output);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ZipOutputStream zos = new ZipOutputStream(bos);) {
            // zipの中のファイル1
            byte[] data = Files.readAllBytes(input);
            ZipEntry zip = new ZipEntry("zip_" + file);
            zos.putNextEntry(zip);
            zos.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
