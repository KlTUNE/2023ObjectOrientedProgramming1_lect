public class UtilityMethods {
    void printCurrency(double value){
    System.out.printf("%.2f\n",value);
    }
    int add (int a, int b){
        return a+b;
    }
    double division(int a, int b){
        return (double)a/(double)b;
    }
    String getTheAnswerToTheUltimateQuestionOfLife_TheUniverse_And_Everything(){
        try{
            Thread.sleep(750);
        }catch(InterruptedException e){}
        return "42";
    }

    public static void main(String[] args) {
        UtilityMethods app = new UtilityMethods();

        //1-1テスト
        System.out.println("1-1確認中");
        app.printCurrency(1.342);
        app.printCurrency(1.025);
        app.printCurrency(0);

        //1-2テスト
        System.out.println("1-2確認中");
        System.out.println(3 == app.add(1, 2)? "OK":"NG");
        System.out.println(5 == app.add(4, 1)? "OK":"NG");
        System.out.println(7 == app.add(5, 2)? "OK":"NG");

        //1-3テスト
        System.out.println("1-3確認中");
        System.out.println(0.5 == app.division(1, 2)? "OK":"NG");
        System.out.println(4 == app.division(4, 1)? "OK":"NG");
        System.out.println(3.5 == app.division(7, 2)? "OK":"NG");

        //1-4テスト
        System.out.println("1-4確認中");
        System.out.println("42" == app.getTheAnswerToTheUltimateQuestionOfLife_TheUniverse_And_Everything()? "OK":"NG");
    }
}
