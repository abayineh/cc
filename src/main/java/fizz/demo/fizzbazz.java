


 +package fizzbuzz.com.demo;
         +import org.springframework.web.bind.annotation.RequestMapping;
         +import org.springframework.web.bind.annotation.RestController;gggg
         +import java.util.Scanner;
         +@RestController
 +
         +public class fizzBazz {
             public static void main(String[]args){
                 for(int i=1;i <=100 ;i++){
                     if (i % 3 ==   0 && i % 5 ==0)
                     {
                         System.out.println("FizzBuzz"");
                     }
                     else if (i % 3 == 0)
                                 {
                                   System.out.println("Fizz");
                         }
                         else if (i % 5 == 0)
                         System.out.println("Bizz");


                     }
                     else {system.out.println(i);

                     }
                 }
             }

