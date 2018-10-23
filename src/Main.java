public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("a", "b", 0, 100, 150, 2000, 2000 );
        processor.override();
        processor.override();
        processor.override();
        processor.override();
        processor.override();
        processor.override();

        System.out.println(processor);
    }
}
