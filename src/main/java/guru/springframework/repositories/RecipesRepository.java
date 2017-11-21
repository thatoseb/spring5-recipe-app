package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dell on 2017/11/22.
 */
public interface RecipesRepository extends CrudRepository<Recipe, Long> {
}
