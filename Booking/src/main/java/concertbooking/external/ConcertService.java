
package concertbooking.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="Concert", url="http://Concert:8080")
public interface ConcertService {

    @RequestMapping(method= RequestMethod.GET, path="/concerts")
    public void checkAndBookStock(@RequestBody Concert concert);

}