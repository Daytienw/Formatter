public class Formatter {
    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.printf("Please specify an email for %s", args[0]);
        }
        else if (args.length == 0){
            System.out.println("Please specify a name and email");
        }
        else {
            System.out.print(String.format("%s", args[0]));
            System.out.print(String.format(" <%s>", args[1]));
        }
    }
}
