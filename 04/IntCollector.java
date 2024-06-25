import java.util.Arrays;

public class IntCollector {
    private int[] array;
    public IntCollector(){
        array = new int[0];
    }
    public IntCollector(int[] values){
        setArray(values);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] values) {
        this.array = new int[values.length];
        for (int i=0;i<values.length;i++){
            this.array[i] = values[i];
        }
    }
    public void add(int value){
        int[] newarray = new int[this.array.length + 1];

        for (int i=0;i<this.array.length;i++){
            newarray[i] = this.array[i];
        }
        newarray[newarray.length-1] = value;
        this.array = newarray;
    }
    public int countOf(int value){
        int count = 0;

        for (int i=0;i<this.array.length;i++){
            if(this.array[i] == value){
                count++;
            }
        }
        return count;
    }
    public int indexOf(int value){
        for (int i=0;i<this.array.length;i++){
            if(this.array[i] == value){
                return i;
            }
        }
        return -1;
    }
    public void remove(int index){
        if (this.array.length > index) {
            int[] newarray = new int[this.array.length - 1];

            for (int i = 0; i < newarray.length; i++) {
                if (i >= index) {
                    newarray[i] = this.array[i + 1];
                } else {
                    newarray[i] = this.array[i];
                }
            }
            this.array = newarray;
        }
    }
    public void print(){
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        IntCollector arr =new IntCollector();
        int[] a = {4,3,56};

        arr.setArray(a);
        arr.print();

        arr.add(3);
        arr.add(23);
        arr.add(4);
        arr.add(3);
        arr.add(6);
        arr.add(7);
        arr.add(9);
        arr.print();

        System.out.printf("%d\n",arr.countOf(3));
        System.out.printf("%d\n",arr.countOf(9));
        System.out.printf("%d\n",arr.countOf(99));

        System.out.printf("%d\n",arr.indexOf(4));
        System.out.printf("%d\n",arr.indexOf(9));
        System.out.printf("%d\n",arr.indexOf(99));

        arr.remove(3);
        arr.print();
        arr.remove(6);
        arr.print();
        arr.remove(99);
        arr.print();
    }
}
