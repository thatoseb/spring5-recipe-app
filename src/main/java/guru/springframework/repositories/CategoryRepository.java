package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dell on 2017/11/22.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
