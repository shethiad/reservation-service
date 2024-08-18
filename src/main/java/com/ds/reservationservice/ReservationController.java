package com.ds.reservationservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1")
public class ReservationController {

	@Autowired
	ReservationRepository reservationRepository;
	//@Autowired
	//Producer producer;

	@PostMapping("add/reservation")
	public ResponseEntity<Reservation> addReservatiion(@RequestBody Reservation reservation)
			throws JsonProcessingException {
		reservationRepository.save(reservation);
		//producer.sendEvent("NOTIFICATION", reservation.getCustomerid(), reservation.getRoomnumber());
		return ResponseEntity.ok(reservation);
	}

	@GetMapping("booking/{id}")
	public ResponseEntity<Optional<Reservation>> getBookingById(@PathVariable String id) {
		Optional<Reservation> reservation = reservationRepository.findById(id);
		return ResponseEntity.ok(reservation);
	}

	@GetMapping("bookings")
	public ResponseEntity<Object> getAllCustomers() throws JsonProcessingException {
		List<Reservation> reservations = reservationRepository.findAll();
		return ResponseEntity.ok(reservations);
	}

}
