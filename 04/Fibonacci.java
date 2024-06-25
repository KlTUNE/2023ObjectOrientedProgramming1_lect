public class Fibonacci {
    public IntCollector get(int n){
        IntCollector app = new IntCollector();
        app.add(0);
        app.add(1);

        int fib;

        for (int i=2;i<n;i++){
            fib = app.getArray()[i-2] + app.getArray()[i-1];
            if (fib >n){
                break;
            }
            else {
                app.add(fib);
            }
        }
        return app;
    }

    public static void main(String[] args) {
        Fibonacci app = new Fibonacci();

        app.get(10000).print();
    }
}
