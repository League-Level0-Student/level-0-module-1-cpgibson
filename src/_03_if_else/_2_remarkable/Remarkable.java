package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String knight = ("The knight costs 3 elixir.");
String princess = ("The princess has the longest range!");
String barrel = ("The barrel can go anywhere on the map!");
String gang = ("The gang spawns 5 troops!");
String tower = ("The inferno tower heats up over time!");
String wrong = ("Please type in a CARD.");
		// 2. Ask the user to enter a name. Store their answer in a variable.
String card = JOptionPane.showInputDialog("Type in a card.");

if(card.equalsIgnoreCase("knight")) {
	JOptionPane.showMessageDialog(null, knight);
}
if(card.equalsIgnoreCase("Princess")) {
	JOptionPane.showMessageDialog(null, princess);
}
if(card.equalsIgnoreCase("Goblin Barrel")) {
	JOptionPane.showMessageDialog(null, barrel);
}
if(card.equalsIgnoreCase("Goblin Gang")) {
	JOptionPane.showMessageDialog(null, gang);
}

if(card.equalsIgnoreCase("Inferno Tower")) {
	JOptionPane.showMessageDialog(null, tower);
}

else {
	JOptionPane.showMessageDialog(null, wrong);
}

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

