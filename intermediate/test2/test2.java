package intermediate.test2;

import static java.util.stream.Collectors.toList;
 
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
 
public class test2 {
    private static final String PATH = "d:/toys.txt";
 
    public static void main(String[] args) throws IOException {
        System.out.println(parseFile(PATH));
    }
 
    private static Optional<List<Toy>> parseFile(String path) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            return Optional.of(lines.map(test2::parse)
                    .filter(toy -> BigDecimal.valueOf(40).compareTo(toy.getPrice()) > 0)
                    .filter(toy -> toy.age <= 5)
                    .collect(toList()));
        }
    }
 

    private static Toy parse(String line) {
        String[] fields = line.split(";");
        if (fields.length != 3) {
            throw new IllegalArgumentException();
        }

        return new Toy().setName(fields[0]).setPrice(new BigDecimal(fields[1])).setAge(Integer.parseInt(fields[2]));
    }
 
    @Data
    @Accessors(chain = true)
    private static class Toy {
        private String name;
        private BigDecimal price;
        private int age;
    }
}