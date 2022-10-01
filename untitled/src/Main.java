public class Main {
    public static void main(String[] args) {
        HalloJavaMitForEach halloJavaMitForEach = new HalloJavaMitForEach();

        halloJavaMitForEach.addStrings(5);
        halloJavaMitForEach.printListForEach();

        halloJavaMitForEach.printListMethodForEach();

        halloJavaMitForEach.printListLambda();

        NumberTester numberTester = new NumberTester("testFile.txt");
        numberTester.testFile();


    }
}