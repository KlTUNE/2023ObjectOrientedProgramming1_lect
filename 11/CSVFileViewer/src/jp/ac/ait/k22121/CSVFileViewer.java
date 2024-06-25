package jp.ac.ait.k22121;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CSVFileViewer {
    public static void main(String[] args) {
        String filename;
        Scanner sc = new Scanner(System.in);

        System.out.print("ファイル名を入力してください > ");
        filename = sc.nextLine();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename))) {
            int count=1, count_cols=1;
            String line;
            String[] cols;

            while ((line = br.readLine()) != null) {
                cols = line.split(",", -1);
                System.out.printf("%d:", count);
                for (String col : cols) {
                    System.out.printf("\t%d:%s", count_cols, col);
                    count_cols++;
                }
                System.out.println();
                count ++;
                count_cols = 1;
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
