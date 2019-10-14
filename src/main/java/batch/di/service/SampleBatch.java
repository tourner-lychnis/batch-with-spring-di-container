package batch.di.service;

import org.springframework.stereotype.Service;

import batch.di.repository.SampleRepository;

@Service
public class SampleBatch implements Batch {

  private SampleRepository sampleRepository;

  public SampleBatch(SampleRepository sampleRepository) {
    this.sampleRepository = sampleRepository;
  }

  @Override
  public void execute() {
    System.out.println(getClass().getSimpleName() + " start.");
    System.out.println(sampleRepository.getClass().getSimpleName() + ": " + sampleRepository.find());
    System.out.println(getClass().getSimpleName() + " end.");
  }
}