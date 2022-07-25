package com.Dibyanshu.Assignments.Basic;

public class ExecuteQuestions {

	public static void main(String[] args) {
		System.out.println("executing question 1");
		QuestionSuper que = new Question1();
		que.executor();

		System.out.println("executing question 2");
		que = new Question2();
		que.executor();

		QuestionSuper.release();
	}
}
