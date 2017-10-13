package loopproject;
import java.util.Scanner;
import java.util.Random;

public class LoopProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		int hi;
		int low;
		int hi2;
		int num=0;

		System.out.println("Welcome to the Times Table Challenge!");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		hi2=hi;
		if (hi<=10) {
			System.out.println("A little bit easy don't you think?");
		}System.out.println("What is the smallest number you want?");
		low=in.nextInt();
		if (low>10) {
			System.out.println("Well someone's looking for a challaenge!");
		}int x=1;
		if (hi<low) {
			hi=low;
			low=hi2;
			System.out.println("Sorry but I was told to make this idiot proof");
		}while (num<10) {
			int num1=rnd.nextInt(hi-low+1)+low;
			int num2=rnd.nextInt(hi-low+1)+low;
			System.out.println("Question: " +x+ ") "+num1+" x "+num2+"  = ?"); 
			int ans=in.nextInt();
			if (ans==num1*num2) {
				num++;
				System.out.println("Right!");
			}else {
				System.out.println("Wrong! The answer is "+(num1*num2)+" Try again");
				num=0;
			}
			x++;
		}
		System.out.println("You got "+num+" out of"+num);

	}
}



