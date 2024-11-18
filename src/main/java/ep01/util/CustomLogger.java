package ep01.util;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class CustomLogger {

  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

  public static void log(Object ...obj) {
    String time = LocalDateTime.now().format(formatter);
    String collect = Arrays.stream(obj).map(Object::toString).collect(Collectors.joining(" "));
    System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), collect);
  }

}
