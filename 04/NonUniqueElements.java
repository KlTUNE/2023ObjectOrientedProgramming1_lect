public class NonUniqueElements {
    public IntCollector convert(IntCollector app){
        for (int i=0;i<app.getArray().length;i++){
            if (app.countOf(app.getArray()[i]) == 1){
                app.remove(i);
                i --;
            }
        }
        return app;
    }

    public static void main(String[] args) {
        NonUniqueElements  unique= new NonUniqueElements();
        IntCollector app = new IntCollector();

//        int[] arr = {1,2,3,1,3};
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {5,5,5,5,5,5};
//        int[] arr = {10,9,10,10,9,8};
        int[] arr = {10,9,10,10,9,8,10,2,3,9,0,7,2};
        app.setArray(arr);

        unique.convert(app).print();
    }
}