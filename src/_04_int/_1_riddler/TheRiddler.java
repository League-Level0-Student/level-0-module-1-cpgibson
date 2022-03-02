package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle1 = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle1.equalsIgnoreCase("a stamp")) {
	JOptionPane.showMessageDialog(null, "Correct! Good job!");
	score++;
}
else {
	String answer = JOptionPane.showInputDialog(null,"Sorry, that's wrong. Would you like to know the answer?");
if (answer.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(null, "A stamp! Better luck next time!");
}
}
JOptionPane.showMessageDialog(null, "Your current score is " + score + " point(s)");
	
String riddle2 = JOptionPane.showInputDialog(null, "What has many keys but can't open a single lock? ");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle2.equalsIgnoreCase("A piano")) {
JOptionPane.showMessageDialog(null, "Correct! Good job!");
score++;
}
else {
String answer = JOptionPane.showInputDialog(null,"Sorry, that's wrong. Would you like to know the answer?");
if (answer.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(null, "A piano! Better luck next time.");
}
}
JOptionPane.showMessageDialog(null, "Your current score is " + score + " point(s)");

String riddle3 = JOptionPane.showInputDialog(null, " What runs all around a backyard, yet never moves? ");
//4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle3.equalsIgnoreCase("A fence")) {
JOptionPane.showMessageDialog(null, "Correct! Good job!");
score++;
}
else {
String answer = JOptionPane.showInputDialog(null,"Sorry, that's wrong. Would you like to know the answer?");
if (answer.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(null, "A fence! Better luck next time.");
}
}
JOptionPane.showMessageDialog(null, "Your current score is " + score + " point(s)");

String riddle4 = JOptionPane.showInputDialog(null, " What tastes better than it smells? ");
//4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle4.equalsIgnoreCase("A tongue")) {
JOptionPane.showMessageDialog(null, "Correct! Good job!");
score++;
}
else {
String answer = JOptionPane.showInputDialog(null,"Sorry, that's wrong. Would you like to know the answer?");
if (answer.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(null, "A tongue! Better luck next time!");
}
}
JOptionPane.showMessageDialog(null, "Your current score is " + score + " point(s)");

String riddle5 = JOptionPane.showInputDialog(null, " I am an odd number. Take away a letter and I become even. What number am I? ");
//4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle5.equalsIgnoreCase("Seven")) {
JOptionPane.showMessageDialog(null, "Correct! Good job!");
score++;
}
else {
String answer = JOptionPane.showInputDialog(null,"Sorry, that's wrong. Would you like to know the answer?");
if (answer.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(null, "It was Seven! Better luck next time!");
}
}
JOptionPane.showMessageDialog(null, "Your final score is " + score + " point(s) out of 5. Thanks for playing!");


// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

