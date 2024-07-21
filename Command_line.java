public class Command_line {
        
        int arg = 5;
        Command_line(){
            super();
            System.out.println("Hi! I am default constructor");
        }
        Command_line(int arg){
            this();
            this.arg = arg;
        }
        public static void main(String[] args) {
            Command_line obj = new Command_line(10);
            System.out.println(obj.arg);
        }
    }

