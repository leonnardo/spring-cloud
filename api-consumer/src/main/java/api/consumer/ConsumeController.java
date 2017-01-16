package api.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by leonnardo on 16/01/17.
 */
@RestController
public class ConsumeController {

    @Autowired
    private ProducerClient producerClient;

    @RequestMapping("/people")
    public Collection<PersonStatus> people() {
        Collection<Person> personList = producerClient.getPeople();
        Collection<PersonStatus> statusList = new ArrayList<>();
        return personList.stream().map(PersonStatus::new).collect(Collectors.toList());

    }
}
