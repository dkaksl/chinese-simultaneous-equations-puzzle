/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package main;

public class EquationSolver {

	public static long totalCount = 0;
	public static long solutionCount = 0;

	public static void main(String[] args) {
		findAndPrintSolutions(1, 10);
		System.out.println();

		System.out.println("number of solutions: " + solutionCount);
		System.out.println("number of tries: " + totalCount);
	}

	/*
	 * Source: http://math.stackexchange.com/a/1748081/332513
	 * User: http://math.stackexchange.com/users/307483/noble-mushtak
	 * Used under: https://creativecommons.org/licenses/by-sa/3.0/
	 */
	private static void findAndPrintSolutions(int from, int to) {
		for (int a = from; a < to; a++) {
			for (int b = from; b < to; b++) {
				for (int c = from; c < to; c++) {
					for (int d = from; d < to; d++) {
						for (int e = from; e < to; e++) {
							for (int f = from; f < to; f++) {
								for (int g = from; g < to; g++) {
									for (int h = from; h < to; h++) {
										if (isSolution(a, b, c, d, e, f, g, h))
											printSolution(new int[] { a, b, c, d, e, f, g, h });
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private static boolean isSolution(int a, int b, int c, int d, int e, int f, int g, int h) {
		totalCount++;
		if (a + b - 9 != 4)
			return false;
		if ((c - d) * e != 4)
			return false;
		if (f + g - h != 4)
			return false;
		if ((a + c) / f != 4)
			return false;
		if ((b - d) * g != 4)
			return false;
		if (9 - e - h != 4)
			return false;

		solutionCount++;
		return true;
	}

	private static void printSolution(int[] variables) {
		StringBuilder output = new StringBuilder();
		for (int variable : variables) {
			output.append(variable + ", ");
		}
		output.deleteCharAt(output.length() - 1);
		output.deleteCharAt(output.length() - 1);
		System.out.println(output.toString());
	}
}