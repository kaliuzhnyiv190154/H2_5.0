import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester {
    private String fileName;
    private NumberTest oddEvenTest;
    private NumberTest primeTest;
    private NumberTest palindromeTest;

    public NumberTester(String file) {
        this.fileName = file;

    }

    public void setOddEvenTest(NumberTest oddEvenTest) {
        this.oddEvenTest = oddEvenTest;
    }

    public void setPrimeTest(NumberTest primeTest) {
        this.primeTest = primeTest;
    }

    public void setPalindromeTest(NumberTest palindromeTest) {
        this.palindromeTest = palindromeTest;
    }

    public void testFile() {
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);

            setOddEvenTest((number) -> {
                if (number % 2 == 0) {
                    return true;
                }
                return false;
            });

            setPrimeTest((number -> {
                if (number == 0 || number == 1) {
                    return false;
                }

                if (number == 2 || number == 3 || number == 5) {
                    return true;
                }

                if (number % 2 == 0) {
                    return false;
                }

                if (number % 3 == 0) {
                    return false;
                }

                if (number % 5 == 0) {
                    return false;
                }

                return true;
            }));

            setPalindromeTest((number -> {
                String reverse = "";
                String num = number + "";
                int length = num.length();
                for (int i = length - 1; i >= 0; i--)
                    reverse = reverse + num.charAt(i);
                if (num.equals(reverse)) {
                    return true;
                }
                return false;
            }));

            int numberOfTests = Integer.parseInt(scanner.nextLine());
            System.out.println(numberOfTests);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                int part1 = Integer.parseInt(parts[0]);
                int part2 = Integer.parseInt(parts[1]);

                switch (part1) {
                    case 1:
                        if (oddEvenTest.testNumber(part2)) {
                            System.out.println("EVEN");
                        }
                        else {
                            System.out.println("ODD");
                        }
                        break;
                    case 2:
                        if (primeTest.testNumber(part2)) {
                            System.out.println("PRIME");
                        }
                        else {
                            System.out.println("NOT PRIME");
                        }
                        break;
                    case 3:
                        if (palindromeTest.testNumber(part2)) {
                            System.out.println("PALINDROME");
                        }
                        else {
                            System.out.println("NOT PALINDROME");
                        }
                }


            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
