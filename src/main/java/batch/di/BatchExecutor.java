package batch.di;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import batch.di.service.Batch;

public class BatchExecutor {
  public static void main (String[] args) {
    if (args.length == 0 || args[0].trim().length() == 0) {
      System.err.println("Please specify the batch processing.");
      System.exit(1);
    }

    try (AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(BatchConfig.class);) {
      Batch batch = context.getBean(args[0], Batch.class);
      batch.execute();
    } catch (BeansException e) {
      System.err.println(e.getMessage());
    }
  }
}