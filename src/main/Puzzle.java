/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amani Kilumanga
 *
 */
public class Puzzle {

	private final List<int[]> solutions;

	public Puzzle(int from, int to) {
		this.solutions = getSolutions(from, to);
	}

	/*
	 * Source: http://math.stackexchange.com/a/1748081/332513
	 * Author: http://math.stackexchange.com/users/307483/noble-mushtak
	 * License: https://creativecommons.org/licenses/by-sa/3.0/
	 * Modification: Translated to Java, optimized, fixed bugs
	 */
	private List<int[]> getSolutions(int from, int to) {
		List<int[]> solutions = new ArrayList<int[]>();
		for (int a = from; a < to; a++) {
			for (int b = from; b < to; b++) {
				for (int c = from; c < to; c++) {
					for (int d = from; d < to; d++) {
						for (int e = from; e < to; e++) {
							for (int f = from; f < to; f++) {
								for (int g = from; g < to; g++) {
									for (int h = from; h < to; h++) {
										if (isSolved(a, b, c, d, e, f, g, h))
											solutions.add(new int[] { a, b, c, d, e, f, g, h });
									}
								}
							}
						}
					}
				}
			}
		}
		return solutions;
	}

	private boolean isSolved(int a, int b, int c, int d, int e, int f, int g, int h) {
		if (a + b != 13)
			return false;
		if ((c - d) * e != 4)
			return false;
		if (f + g - h != 4)
			return false;
		if (a + c != 4 * f)
			return false;
		if ((b - d) * g != 4)
			return false;
		if (5 != e + h)
			return false;
		return true;
	}

	public List<int[]> getSolutions() {
		return solutions;
	}

	public void printSolutions() {
		for (int[] solution : this.solutions) {
			StringBuilder output = new StringBuilder();
			for (int number : solution) {
				output.append(number + ", ");
			}
			System.out.println(output.substring(0, output.length() - 2));
		}
	}
}
