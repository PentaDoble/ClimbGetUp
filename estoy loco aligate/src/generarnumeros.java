
import java.util.Random;

public class generarnumeros{
public static int iValorTirada;

public static void main(String[] args)
{

 Random rGenerador = new Random();  
 
iValorTirada = rGenerador.nextInt(1)+1; //premio final
System.out.println("◘._._._.⇑._._._.◘");
iValorTirada = rGenerador.nextInt(2)+1; //1
System.out.println("◘._._._.⇑.⇖._._.◘");
iValorTirada = rGenerador.nextInt(3)+1; //2
System.out.println("◘._._.⇗.⇑.⇑._._.◘");
System.out.println("◘._._.⇑.⇑.⇑._._.◘");
iValorTirada = rGenerador.nextInt(4)+1; //2
System.out.println("◘._._.⇑.⇑.⇑.⇖._.◘");
System.out.println("◘._._.⇑.⇑.⇑.⇑._.◘");
iValorTirada = rGenerador.nextInt(5)+1; //3
System.out.println("◘._.⇗.⇑.⇑.⇑.⇑._.◘");
System.out.println("◘._.⇑.⇑.⇑.⇑.⇑._.◘");
System.out.println("◘._.⇑.⇑.⇑.⇑.⇑._.◘");
iValorTirada = rGenerador.nextInt(6)+1; //3
System.out.println("◘._.⇑.⇑.⇑.⇑.⇑.⇖.◘");
System.out.println("◘._.⇑.⇑.⇑.⇑.⇑.⇑.◘");
System.out.println("◘._.⇑.⇑.⇑.⇑.⇑.⇑.◘");
iValorTirada = rGenerador.nextInt(7)+1; //4
System.out.println("◘.⇗.⇑.⇑.⇑.⇑.⇑.⇑.◘");
System.out.println("◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘");
System.out.println("◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘");
System.out.println("◘.⇑.⇑.⇑.⇑.⇑.⇑.⇑.◘");
}}