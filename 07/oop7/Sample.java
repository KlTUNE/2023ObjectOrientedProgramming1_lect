public class Sample {
    public static void main(String[] args) {
        SuperClass[] sa = {
                new SubClass1(),
                new SubClass2(),
        };

        for (int i = 0; i < sa.length; i++) {
            if (sa[i] instanceof SubClass1){
                System.out.print("これは子クラス1です。：");
            } else {
                System.out.print("これは子クラス1ではありません。：");
            }
            sa[i].showMessage();
        }
    }
}