package zw.co.nmbz.CRUDApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.nmbz.CRUDApplication.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
}
