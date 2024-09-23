public class b_passing_arrays {
    public static void update(int marks[]){
        for(int i =0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int[] marks = {89, 99, 94};
        update(marks);
        for(int i =0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }

        // out put - 90, 100, 94
        // arrays are passed by reference

    }
}
