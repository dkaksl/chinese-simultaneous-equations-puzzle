/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package main;

public class PuzzleSolver {

	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle(0, 10);
		System.out.println("solution count: " + puzzle.getSolutions().size());
		puzzle.printSolutions();
	}
}