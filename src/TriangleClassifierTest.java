import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("Tam giác đều")
    void test222(){
        int edgeA  = 2;
        int edgeB  = 2;
        int edgeC  = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.edgeValue(edgeA,edgeB,edgeC);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Tam giác cân")
    void test223(){
        int edgeA  = 2;
        int edgeB  = 2;
        int edgeC  = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.edgeValue(edgeA,edgeB,edgeC);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Tam giác thường")
    void test345(){
        int edgeA  = 3;
        int edgeB  = 4;
        int edgeC  = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.edgeValue(edgeA,edgeB,edgeC);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Không phải tam giác")
    void test823(){
        int edgeA  = 8;
        int edgeB  = 2;
        int edgeC  = 3;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.edgeValue(edgeA,edgeB,edgeC);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Không phải tam giác")
    void test021(){
        int edgeA  = -1;
        int edgeB  = 2;
        int edgeC  = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.edgeValue(edgeA,edgeB,edgeC);
        assertEquals(expected,result);
    }

}