import java.util.*;
public class a_problem12 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char ch = 'A';
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(ch);
      }
      System.out.println();
      ch++;
      if(ch>'Z'){
        ch=(char)(ch-26);
      }
    }
    sc.close();
  }
}
