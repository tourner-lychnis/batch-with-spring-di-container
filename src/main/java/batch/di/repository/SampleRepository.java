package batch.di.repository;

import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {
  public String find() {
    return "Hello world";
  }
}