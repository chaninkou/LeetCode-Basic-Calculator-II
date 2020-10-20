package leetcode227;

public class Main {
	public static void main(String[] args) {
		String s = " 3 + 3 - 2 / 2 + 4 * 5    ";
		
		System.out.println("Input: " + s);
		
		FindSolutionOfMathFunction solution = new FindSolutionOfMathFunction();
		
		System.out.println("Solution: " + solution.calculate(s));
	}
}
