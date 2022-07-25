package com.Dibyanshu.Assignments.Basic;

import java.util.Scanner;

public abstract class QuestionSuper {
	static Scanner sc = new Scanner(System.in);

	public void executor() {
		executeQuestion(sc);
	}

	public static void release() {
		sc.close();

	}

	abstract void executeQuestion(Scanner sc);
}
