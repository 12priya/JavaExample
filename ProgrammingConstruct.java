
public class ProgrammingConstruct{
    public static void main(String[] args) {
        //for loop
        for (int index = 0; index < args.length; index++) {
            System.out.println("ths value of index is "+args[index]);
        }

        if(args.length>0){
            System.out.println("number of cities passed"+args.length);
        }else{
            System.out.println("please pass in atleast name of city");
        }

        int value=args.length;
        while(value>0){
            System.out.println("Printing the value using while loop"+args[value-1]);
           value--;
        }
    }
}