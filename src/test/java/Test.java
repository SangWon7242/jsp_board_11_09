import java.util.stream.IntStream;

public class Test {
  public static void main(String[] args) {
    // 스트림 문법 연습
    IntStream.rangeClosed(1, 5)
        .map(i -> 6 - i)
        .forEach(System.out::println);
  }
}
