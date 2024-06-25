package jp.ac.ait.k22121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AichiTouristSpot {
    public List<String> spots_sort(List<String> spots) {
        Collections.sort(spots, (o1, o2) -> {
            return sort_util(o2, o1) - sort_util(o1, o2);
        });
        return spots;
    }

    public int sort_util(String o1, String  o2) {
        String[] o1_cols = o1.split(",", -1);
        String[] o2_cols = o2.split(",", -1);

        if (Double.parseDouble(o1_cols[2]) < Double.parseDouble(o2_cols[2])) { return 1; }
        else {return 0;}
    }

    public static void main(String[] args) {
        String[] filenames = {"c200326.csv", "c200328.csv", "c200329.csv",
                "c200330.csv", "c200361.csv", "c200362.csv", "c200363.csv", "c200364.csv"};
        String output = "TouristSpot.csv";
        List<String> spots = new ArrayList<>();
        AichiTouristSpot app = new AichiTouristSpot();

        for (String filename : filenames){
            try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), Charset.forName("ms932"))) {
                int count = 1;
                int[] index = {0, 0};
                double ido, keido;
                String line, spot;
                String[] cols, point;

                while ((line = br.readLine()) != null) {
                    cols = line.split(",", -1);
                    if (cols[0].equals("フィーチャID")) {
                        count = 0;
                        for (String col : cols) {
                            if (col.equals("形状(WKT)")) index[0] = count;
                            else if (col.equals("データ名") || col.equals("名称")) index[1] = count;
                            count++;
                        }
                    } else {
                        point = cols[index[0]].split(" ", -1);
                        ido = Double.parseDouble(point[1].substring(0, point[1].length()-1));
                        keido = Double.parseDouble(point[0].substring(6));
                        spot = ido + "," + keido + "," + Math.sqrt(Math.pow(35.1834122-ido, 2) + Math.pow(137.1130419-keido, 2)) + "," + cols[index[1]];
                        spots.add(spot);
                    }
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        try (BufferedWriter bw = Files.newBufferedWriter(Path.of(output))) {
            spots = app.spots_sort(spots);
            spots.add(0, "緯度情報,経度情報,愛工大からの距離,データ名");
            for (String line : spots) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
