package Wrapper;

public class Wrap {

        public static void main(String[] args) {

            int primitive = 100;
            Integer wrapperInt = primitive ;  // Autoboxing
            System.out.println("Wrapper Integer: " + wrapperInt);

            Integer anotherWrapper = new Integer(200);
            int primitiveAgain = anotherWrapper;  // Unboxing
            System.out.println("Primitive int: " + primitiveAgain);

            String str = "300";
            int parsed = Integer.parseInt(str);  // Convert String -> int
            System.out.println("Parsed int: " + parsed);


            java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
            list.add(10);  // Autoboxing happens here
            list.add(20);
            System.out.println("ArrayList of Integers: " + list);

            // Character Wrapper Example
            Character ch = 'A';  // Autoboxing
            char primitiveChar = ch;  // Unboxing
            System.out.println("Character Wrapper: " + ch + ", Primitive char: " + primitiveChar);
        }
    }


