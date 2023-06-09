package restwithspringbootandjavaerudio.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import restwithspringbootandjavaerudio.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}