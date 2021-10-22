package com.wpirog.memory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueRepository extends CrudRepository<Value, Long> {

}
