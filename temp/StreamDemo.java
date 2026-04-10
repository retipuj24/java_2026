import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // stream from a list
        List<String> names = Arrays.asList("Jupiter "," John", "Jane", "Jack");
        System.out.println(names);
        Stream<String> stream = names.stream().filter(s -> s.contains("hn")).map(s -> s.toUpperCase());
        stream.forEach(t -> System.out.println(t));
        List<String> nms = names.stream().map(n -> n.strip()).map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(nms);

        // stram from arrays
        int[] numbers = {1,2,3,4,5,6};
        IntStream stream2 = Arrays.stream(numbers);
        stream2.forEach(System.out::println);

        // stream frpm values
        Stream<String> stream3 = Stream.of("a", "b", "c", "d", "e", "f", "g");
        stream3.forEach(System.out::println);

        // using the numbers from arrays
        List<Integer> numIntegers = Arrays.asList(2,4,6,8,10);
        System.out.println(numIntegers);
    
        List<Integer> numberSquare = numIntegers.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(numberSquare);

        int length = 10;
      
        List<String> names1 = Arrays.asList("Menardo", "Alicia", "Bobi", "Carlito", "Devon", "Edward", "Fernando", "Gregoria");
        List<String> selectedNames = names1.stream()
                            .filter(s -> s.length() < length)
                            .collect(Collectors.toList());
        System.out.println(selectedNames);
        
        // ascending
        selectedNames = names1.stream()
                            .sorted((n1,n2)-> n1.compareTo(n2))
                            .collect(Collectors.toList());
         System.out.println(selectedNames);
         
         // descending
         selectedNames = names1.stream()
                            .sorted((n1,n2)-> n2.compareTo(n1))
                            .collect(Collectors.toList());
         System.out.println(selectedNames);

    }
}
