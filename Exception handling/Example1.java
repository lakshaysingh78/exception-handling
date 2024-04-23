import java.util.Scanner;
//how tocreate custom exception...
class AgeInvalidException extends Exception{
    AgeInvalidException(){
        super("age is invalid");
    }
    AgeInvalidException(String message){
        super(message);
    }

}


public class Example1 {
    public static void main(String[]args){
        System.out.println("Started");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        try{
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            System.out.println("enter the n1 :"+ n1);
            System.out.println("enter the n2 :"+ n2);
            int result=  n1/n2;
            System.out.println("Division is "+result);
            if(n2<10){
                //jab jan buj ke programmer exception dena chata han
                
                throw new AgeInvalidException("my age is invalid");
            }

        }catch(ArithmeticException e){
            System.out.println("n2 can not be 0\\");
            System.out.println(e.getMessage());

        }
        
        catch(NumberFormatException e){
            System.out.println("invalid numbers");
            System.out.println(e.getMessage());


        }catch(Exception e){
            //sari exception bta dega ye use karege to ye parent han sabhi exception ka or koi sa bhi na chale


            System.out.println("error!!");
            System.out.println(e.getMessage());
        }
        finally{
            //always chalega  chaye try chale ya catch chale...
            System.out.println("IM am in final block");
            System.out.println("closing ll the resource");
            
        }
     
      
        System.out.println("terminated..");


    }
    
}
