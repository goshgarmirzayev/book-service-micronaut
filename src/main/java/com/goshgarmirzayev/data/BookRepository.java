package com.goshgarmirzayev.data;

import com.goshgarmirzayev.model.Book;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
