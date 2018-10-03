

public class MatrixSum {

    public static void main(String[] args) {


    double[][] matrix = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
	double[][] secondMatrix= {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
	
	if (matrix.length == secondMatrix.length && matrix[0].length == secondMatrix[0].length){
		arraySum(matrix,secondMatrix);
}else {
	System.out.println("the height and width dont match!");
}
	}
public static double[][] arraySum(double[][] firstArray,double[][] secondArray){
	double[][] sumArray = new double[3][3];
	for (int i = 0;i<3; i++){ // loop to increment through the columns
		for (int j = 0;j<3;j++){ // loop to increment through the rows
			double tempSum = firstArray[j][i] + secondArray[j][i];
			sumArray[i][j] = tempSum;
		}
	}
	for (int i = 0; i < sumArray.length; i++) {
    for (int j = 0; j < sumArray[i].length; j++) {
        System.out.print(sumArray[i][j] + " ");
    }
    System.out.println();
}
	return sumArray;
}
}
	
			