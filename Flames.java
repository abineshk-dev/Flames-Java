import java.util.Scanner;
class Flames{
	
	public static void main(String a[]) {

			//calling another class by creating object
			Cdlink list=new Cdlink();

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Name : ");
			String maleName=sc.nextLine();
                        System.out.println();
			System.out.print("Enter Your Partner Name : ");
			String femaleName=sc.nextLine();
			char[] male= new char[maleName.length()];
			char[] female= new char[femaleName.length()];

			//converting String to char array
			for(int k=0;k<maleName.length();k++)
				male[k]=maleName.charAt(k);
			for(int m=0;m<femaleName.length();m++)
				female[m]=femaleName.charAt(m);

			//replace the common char with "*"
			for(int i=0;i<male.length;i++) {
				for(int j=0;j<female.length;j++) {
					if(male[i]==female[j]) {
						male[i]='*';
						female[j]='*';
					}
				}
			}

			//the below loop is used to find the common char length
			int count=0;
			for(int i=0;i<male.length;i++) {
				if(male[i]=='*')
					count++;
			}

			//total varible represent the remaiming char length after striked with "*"
			int total=(male.length-count)+(female.length-count);

			//System.out.println(male);
			//System.out.println(female);
			//System.out.println(count);
			//System.out.println(total);

			//inserting flames abbrevations in list
			list.insertatfirst("Siblings");
			list.insertatfirst("Enemy");
			list.insertatfirst("Marriage");
			list.insertatfirst("Affection ");
			list.insertatfirst("Love");
			list.insertatfirst("Friends");

			//finding the result by using list's methods
			list.traverseNew(total);
			if(total>4)
			list.display();
	}
}
