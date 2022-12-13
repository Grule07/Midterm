import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class MidtermProject
{
	public static void main(String[] args) 
	{
			
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			String userName, playerAttack = "", computerAttack;
			int userSkillPoints = 0, computerSkillPoints = 0, playerHealth = 10, computerAiHealth = 10,
				 round = 1, playerPointsChecker = 0;

			ArrayList<String> statsPlayers = new ArrayList<String>();
			ArrayList<String> computerSkills = new ArrayList<String>();
			Skills skill = new Skills();
			
			System.out.print("Enter Your Username: ");
			userName = sc.nextLine();
			
			System.out.println("Hi " + userName + " GoodLuck! ");
			 	
			Stats.UserStats(userName, round, userSkillPoints, playerHealth);
			Stats.EnemyStats(round, computerSkillPoints, computerAiHealth);
			System.out.println("\n");
		do
		{
			
			System.out.println("Player Skills Option ");
			System.out.println(skill.StatsPlayer(userSkillPoints, statsPlayers));
		do
		{
			
			System.out.print("Enter your move: ");
			playerAttack = sc.nextLine();
			Calculation.Invalid(playerPointsChecker, statsPlayers, playerAttack);
		}while(playerPointsChecker == 1);
			Computer.ComputerAi(computerSkillPoints, computerSkills);
			int randomComputer = random.nextInt(computerSkills.size());
			computerAttack = computerSkills.get(randomComputer);
			
			System.out.println("\nComputer Skill Option ");
			System.out.println(computerSkills);
			System.out.println("Computer move: " + computerAttack);
			
			if(statsPlayers.contains("Charge"))
			{
				if(playerAttack.equalsIgnoreCase("charge"))
				{
					if(computerAttack.equalsIgnoreCase("charge"))
					{
						userSkillPoints ++;
						computerSkillPoints++;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("shield"))
					{
						userSkillPoints ++;
						computerSkillPoints -=1;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("wave"))
					{
						userSkillPoints ++;
						computerSkillPoints -=1;
						playerHealth -=2;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("Ax"))
					{
						userSkillPoints ++;
						computerSkillPoints -=2;
						playerHealth -=3;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("kamekameha"))
					{
						userSkillPoints ++;
						computerSkillPoints -=4;
						playerHealth -=6;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("amen"))
					{
						userSkillPoints ++;
						computerSkillPoints -=5;
						computerAiHealth +=5;
						round++;
					}
				}
			}
			if(statsPlayers.contains("Wave"))
			{
				if(playerAttack.equalsIgnoreCase("wave"))
				{
					if(computerAttack.equalsIgnoreCase("charge"))
					{
						userSkillPoints -=1;
						computerSkillPoints++;
						computerAiHealth -=2;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("shield"))
					{
						userSkillPoints -=1;
						computerSkillPoints -=1;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("wave"))
					{
						userSkillPoints -=1;
						computerSkillPoints -=1;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("Ax"))
					{
						userSkillPoints -=1;
						computerSkillPoints -=2;
						playerHealth -=1;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("kamekameha"))
					{
						userSkillPoints -=1;
						computerSkillPoints -=4;
						playerHealth -=5;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("amen"))
					{
						userSkillPoints -=1;
						computerSkillPoints -=5;
						computerAiHealth +=5;
						round++;
					}	
				}
			}
			if(statsPlayers.contains("Shield"))
			{
				if(playerAttack.equalsIgnoreCase("shield"))
				{
					if(computerAttack.equalsIgnoreCase("charge"))
					{
						userSkillPoints -=1;
						computerSkillPoints++;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("shield"))
					{
						userSkillPoints -=1;
						computerSkillPoints -= 1;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("wave"))
					{
						userSkillPoints -=1;
						computerSkillPoints -= 1;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("Ax"))
					{
						userSkillPoints -=1;
						computerSkillPoints -= 2;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("kamekameha"))
					{
						userSkillPoints -=1;
						computerSkillPoints -= 4;
						playerHealth -=6;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("amen"))
					{
						userSkillPoints -=1;
						computerSkillPoints -= 5;
						computerAiHealth += 5;
						round++;
					}
				}
			}
			if(statsPlayers.contains("Ax"))
			{
				if(playerAttack.equalsIgnoreCase("Ax"))
				{
						
					if(computerAttack.equalsIgnoreCase("charge"))
					{
						userSkillPoints -=2;
						computerSkillPoints++;
						computerAiHealth -=3;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("shield"))
					{
						userSkillPoints -=2;
						computerSkillPoints -= 1;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("wave"))
					{
						userSkillPoints -=2;
						computerSkillPoints -= 1;
						computerAiHealth -=1;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("Ax"))
					{
						userSkillPoints -=2;
						computerSkillPoints -= 2;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("kamekameha"))
					{
						userSkillPoints -=2;
						computerSkillPoints -= 4;
						playerHealth -=3;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("amen"))
					{
						userSkillPoints -=1;
						computerSkillPoints -= 5;
						computerAiHealth += 5;
						round++;
					}	
				}
			}
			if(statsPlayers.contains("Kamekameha"))
			{
				if(playerAttack.equalsIgnoreCase("Kamekameha"))
				{
						
					if(computerAttack.equalsIgnoreCase("charge"))
					{
						userSkillPoints -=4;
						computerSkillPoints++;
						computerAiHealth -=6;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("shield"))
					{
						userSkillPoints -=4;
						computerSkillPoints -= 1;
						computerAiHealth -=6;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("wave"))
					{
						userSkillPoints -=4;
						computerSkillPoints -= 1;
						computerAiHealth -=4;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("Ax"))
					{
						userSkillPoints -=4;
						computerSkillPoints -= 2;
						computerAiHealth -=3;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("kamekameha"))
					{
						userSkillPoints -=2;
						computerSkillPoints -= 4;
						round++;
						
					}
					if(computerAttack.equalsIgnoreCase("amen"))
					{
						userSkillPoints -=1;
						computerSkillPoints -= 5;
						computerAiHealth += 5;
						round++;
					}	
				}	
			}
			if(statsPlayers.contains("Amen"))
			{
				if(playerAttack.equalsIgnoreCase("amen"))
				{
						
					if(computerAttack.equalsIgnoreCase("charge"))
					{
						userSkillPoints -=5;
						computerSkillPoints++;
						playerHealth +=5;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("shield"))
					{
						userSkillPoints -=5;
						computerSkillPoints -= 1;
						playerHealth +=5;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("wave"))
					{
						userSkillPoints -=5;
						computerSkillPoints -= 1;
						playerHealth +=5;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("Ax"))
					{
						userSkillPoints -=5;
						computerSkillPoints -= 2;
						playerHealth +=5;
						round++;
					}
					if(computerAttack.equalsIgnoreCase("kamekameha"))
					{
						userSkillPoints -=5;
						computerSkillPoints -= 4;
						round++;
						
					}
					if(computerAttack.equalsIgnoreCase("amen"))
					{
						userSkillPoints -=5;
						computerSkillPoints -= 5;
						playerHealth +=5;
						computerAiHealth += 5;
						round++;
					}	
				}
			}	
						statsPlayers.clear();
						computerSkills.clear();
			
			damageCalculation.HealthEqualsZero(playerHealth, computerAiHealth);
			
				Stats.UserStats(userName, round, userSkillPoints, playerHealth);
				Stats.EnemyStats(round, computerSkillPoints, computerAiHealth);
				System.out.println("\n");
				
		}while(!(playerHealth <= 0 || computerAiHealth <= 0));
		
		damageCalculation.WinOrLose(computerAiHealth);
		}
	}





		
	
}
