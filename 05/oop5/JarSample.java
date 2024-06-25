public class JarSample {
    /**
     * 与えられた2つの整数の和を計算して返します。
     *
     * @author Yamada Taro
     * @version 1.0
     * @param a 加算する最初の整数
     * @param b 加算する2番目の整数
     * @return 2つの整数の和
     * @since 1.0
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello, JAR FILE!!");
        System.out.println("add(10,20) -> " + new JarSample().add(10, 20));
    }
}