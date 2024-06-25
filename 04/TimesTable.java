public class TimesTable {
    private int width;
    private int height;
    private int[][] array;
    private  TimesTable(){}
    public TimesTable(int width, int height){
        this.width = width;
        this.height = height;
        array = new int[height][width];

        for (int h=0;h<height;h++){
            for (int w=0;w<width;w++){
                array[h][w] = (w+1) * (h+1);
            }
        }
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public int[][] getArray() {
        return array;
    }
    public void print(){
        for (int h=0;h<height;h++){
            for (int w=0;w<width;w++){
                System.out.printf("|%d",array[h][w]);
            }
            System.out.printf("|\n");
        }
    }

    public static void main(String[] args) {
        TimesTable tt1 = new TimesTable(5, 5);
//        TimesTable tt1 = new TimesTable(0, 0);
//        TimesTable tt1 = new TimesTable(9, 13);
//        TimesTable tt1 = new TimesTable(0, 4);


//        System.out.printf("height=%d width=%d\n", app.getHeight(), app.getWidth());
        tt1.print();
    }
}
