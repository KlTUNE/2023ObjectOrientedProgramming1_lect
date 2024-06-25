import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSample {
    public static void main(String[] args) throws IOException {
        // ↑検査例外であるIOExceptionは、InputStreamReaderなどの入出力関連プログラムで発生します。
        // 本来例外処理を適切に行わなければなりませんが、このメソッド内ではその例外発生時に対処できないため
        // throws構文を用いて例外を呼び出しもとへ伝播させます。

        // InputStreamReaderをSystem.inから生成 (InputStreamReaderは1byteずつ順次読み込み)
        InputStreamReader isr = new InputStreamReader(System.in);
        // 改行コードが送信されるまで待ち、
        // バッファに溜め込んでおいてくれるBufferedReaderをInputStreamReaderから生成
        BufferedReader bf = new BufferedReader(isr);

        // 改行コードが送信されるのを待って1行分をString型として返す
        String str = bf.readLine();

        // 入力された文字列をそのまま出力する
        System.out.println(str);

    }
}