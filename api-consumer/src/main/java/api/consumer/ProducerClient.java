package api.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by leonnardo on 16/01/17.
 */
@FeignClient("producer")
interface ProducerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/people")
    List<Person> getPeople();
}
