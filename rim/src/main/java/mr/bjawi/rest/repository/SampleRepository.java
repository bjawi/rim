package mr.bjawi.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mr.bjawi.rest.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
