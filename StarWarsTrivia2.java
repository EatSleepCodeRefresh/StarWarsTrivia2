import javax.swing.JOptionPane;
public class StarWarsTrivia2
{
	public static void main(String[] args)
	{
		String[] questions = {"Which bounty hunter did Han Solo kill in A New Hope?\nA.Bolba Fette  B.Greedo  C.Darth Maul",
		"Who played Lando Calrissian?\nA.Billy Dee Williams  B.John  C.Darth Vader",
		"Who said I find your lack of faith disturbing.?\nA.Darth Vader  B.Luke Skywalker C.Bulba Fette",
		"What game do Chewbacca and R2-D2 play in 'A New Hope'?\nA.Checkers  B.Dejarik  C.Jenga",
		"Who is the only non-Jedi/Sith character to use a lightsaber in the original trilogy?\nA.Jarjar Binks  B.Chewbacca  C.Han Solo",
		"What creature does Han Solo have to cut open to save Luke on planet Hoth?\nA.TaunTaun  B.Narwall  C.Wookie",
		"Who said i think it is time we demonstrated the full power of this station?\nA.Darth Vader  B.Grand Moff Tarkin  C.Jar Jar Binks",
		"What fatal flaw did the rebels exploit to destroy the first Death Star?\nA.Being unfinished  B.Exposed thermal exhaust port  C.Shields were down",
		"What line have Luke Skywalker, Han Solo, C-3PO, Obi-Wan Kenobi, Anakin Skywalker, and Princess Leia all said at some point?\nA.Use the force  B.You are a nerfherder  C.I have a bad feeling about this",
		 "Where did Darth Vader reveal himself to be Luke's father?\nA.Planet Hoth  B.Cloud city  C.The Deathstar",
		 "Who said I suggest a new strategy, R2. Let the wookiee win?\nA.Princess Leia  B.C3PO  C.Luke Skywalker",
		"Who did Jabba the Hutt hire to capture Han Solo?\nA.Bolba Fette  B.Grand Moff Tarkin  C.Jenga Fette",
		"Who adopted Leia at birth?\nA.Darth Vader  B.Obi-Wan Kenobi  C.Breha Organa and Bail Organa"};
		 
		
		char[] answers = {'B', 'A', 'A', 'B', 'C', 'A', 'B', 'B', 'C', 'B', 'C', 'A', 'C'};
		char ans = ' ';
		int x;
		int correct = 0;
		String userEntry;
		boolean isGood;
		
		for(x = 0; x < questions.length; ++x)
		{
			isGood = false;
			int firstError = 0;
			
			while(!isGood)
			{
				isGood = true;
				userEntry = JOptionPane.showInputDialog(null, questions[x]);
				ans = userEntry.charAt(0);
				if(ans != 'A' && ans != 'B' && ans != 'C')
				{
					isGood = false;
					if(firstError == 0)
					{
						questions[x] = questions[x] + "\nYour answer must be A, B, or C";
						firstError = 1;
					}
				}
					
			}
			if(ans == answers[x])
			{
				++correct;
				JOptionPane.showMessageDialog(null, "Correct!!");
			}
			else
				JOptionPane.showMessageDialog(null, "The correct answer is " + answers[x]);
		}
		JOptionPane.showMessageDialog(null, "You got " + correct + " right and " + (questions.length - correct) + " wrong");
	}
	
}