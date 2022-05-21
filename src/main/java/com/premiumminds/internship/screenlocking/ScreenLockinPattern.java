package com.premiumminds.internship.screenlocking;

import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * Created by aamado on 05-05-2022.
 */
class ScreenLockinPattern implements IScreenLockinPattern {

    private ExecutorService executor = Executors.newSingleThreadExecutor();
 /**
  * Method to count patterns from firstPoint with the length
  * @param firstPoint initial matrix position
  * @param length the number of points used in pattern
  * @return number of patterns
  */
  public Future<Integer> countPatternsFrom(int firstPoint,int length) {
      System.out.println("Teste");
      return executor.submit(() -> {
          Thread.sleep(1000);
          return 5;
      });
    //throw new RuntimeException("Not Implemented Yet");
  };
}
