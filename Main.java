

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
     Computer hp = new Computer(new Ram(), new Processor(),new Storage());
     System.out.println(hp);
    
    }
}