import printing.Printer;

public class Main {
    public static void main() {
        Printer myPrinter = new Printer();
        String[] documents = new String[] { "Document 1", "Document 2", "Document 3"};
        myPrinter.print(documents);
    }
}
