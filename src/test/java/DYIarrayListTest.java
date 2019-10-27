import org.junit.jupiter.api.Test;
import ru.sbrf.hw1.DYIarrayList;

import java.util.Collections;


public class DYIarrayListTest<T> extends DYIarrayList<T> {
  @Test
    public static void main(String[] args) {
      Integer[] array1 = new Integer[]{8, 6, 7, 24, 59, 2, 1, 75, 6, 1, 13, 14, 15, 16, 1, 7, 8, 4, 92};
      Integer [] array2 = new Integer[]{101, 102, 103};
      DYIarrayList <Integer>  list = new DYIarrayList<>();

      list.add(1);
      list.add(3);
      list.add(8);

      boolean r = Collections.addAll(list, array1);

      for (int i=0; i< list.size(); i++ ) {
          System.out.println("элемент номер " + i +": " + list.get(i));
      }
      System.out.println("Длина нашего массива составляет " + list.size() +" ячеек(ки)");
    }
}

