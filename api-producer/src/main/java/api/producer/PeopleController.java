package api.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by leonnardo on 16/01/17.
 */
@RestController
public class PeopleController {

    @RequestMapping("/people")
    public List<Person> people() {
        return Arrays.asList(
                new Person("Jeronimo", 22, "gege"),
                new Person("Adolfo", 40, "Ad"),
                new Person("Astolfo", 35, "ast")
        );
    }
}
