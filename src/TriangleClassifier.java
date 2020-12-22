public class TriangleClassifier {
    public static String edgeValue(int edgeA, int edgeB, int edgeC){
        String result = "";
        if ( edgeA == edgeB && edgeA == edgeC) {
            result =  "Tam giác đều";
        } else if ( edgeA == edgeB || edgeA == edgeC || edgeB == edgeC & edgeA+edgeB > edgeC &
            edgeA-edgeB < edgeC ){
            result = "Tam giác cân";
        } else if ( edgeA+edgeB > edgeC & edgeA+edgeC > edgeB & edgeB+edgeC > edgeA &
                    edgeA-edgeB < edgeC & edgeA-edgeC < edgeB & edgeB-edgeC < edgeA ){
            result = "Tam giác thường";
        } else
            result = "Không phải tam giác";
        return result;
    }
}
