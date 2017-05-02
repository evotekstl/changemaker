import java.util.Scanner;

public class Nine_ninecents {
	public static void main(String[] args) {
		//Initialize Vars
		int q=0;int qc=0;
		int d=0;int dc=0;
		int n=0; int nc=0;
		int p=0;int pc=0;
		
		
		
		//Get user input
		System.out.println("Enter your Change amount.");
		Scanner sc = new Scanner(System.in);
		int ui1 =sc.nextInt();
		
		//while loop til done with quarters
		while(ui1 >= 25) {
			ui1=ui1-25;q=q+1;qc ++;
		}
			//while loop til done with dimes
			while(ui1 >= 10){
				ui1=ui1 - 10;d=d+1;dc ++;
			}
				//while loop til done with nickels
				while(ui1 >= 5){
					ui1= ui1 - 5; n=n+1; nc ++;
				}
					//while loop til done with pennies
					while(ui1 >= 1){
						ui1 = ui1 - 1;p = p + 1;pc ++;
					}
		System.out.println("your change is \n");
		System.out.println(qc + " quarters, " + dc + " dimes, " + nc + " nickels, and " + pc + " pennies.");
}
}