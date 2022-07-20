package co.grandcircus.HotelSearch;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String> {

	List<Hotel> findByCity(String city, Sort sort);
	
}
