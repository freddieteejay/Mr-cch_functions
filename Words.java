import java.util.Scanner;
public class Words{
public static void main(String... args) {

String prompt = """
Hi welcome
1 -> for English
2 -> for Yoruba
3 -> for Hausa
""";

String prompt1 =  """
1 -> for nin 
2 -> for airtime
3 -> for data
""";

String prompt2 = """
1 -> fun Food
2 -> fun Gender
3 -> for Name
""";
String prompt3 = """
1 -> for House
2 -> for Age
3 -> for Size
""";

System.out.println("prompt"); 
Scanner freddie = new Scanner(System.in);
int input = freddie.nextInt();

switch(input){
case 1:{
 System.out.println("English");
System.out.print(prompt1);
break;
}


case 2:{ 
System.out.println("Yoruba");
System.out.print(prompt2);
break;
}


case 3:{ 
System.out.println("Hausa");
System.out.print(prompt3);
break;

}
}


}
}












s