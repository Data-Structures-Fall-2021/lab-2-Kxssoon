import java.util.Arrays;

public class Lab02 {

	// YOUR CODE GOES HERE
    public static double[] map(UnaryFunction unaryFunction, double[] numArray){
        double[] resultArr = new double[numArray.length];
        int count = 0;
        for (double num : numArray){
            resultArr[count] = unaryFunction.exec(num);
            count++;
        }
        System.out.println(Arrays.toString(resultArr));
        return resultArr;
    }
}
