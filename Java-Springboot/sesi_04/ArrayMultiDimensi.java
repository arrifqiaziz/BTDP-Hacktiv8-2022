public class ArrayMultiDimensi {
    public static void main(String[] args) {
        
        // Array multi dimensi
        String[][] framework = {
            {"Java", "Kotlin"},
            {"ReactJS", "ReactNative"},
            {"Golang", "Python"}
        };

        // Output
        for (int i = 0; i < framework.length; i++){
            System.out.println("Bahasa : " + framework[i][0]);
        }
    }
}
