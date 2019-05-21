package com.ds.trainproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ds.trainproject.models.Reservation;
import com.ds.trainproject.models.Train;
import com.ds.trainproject.models.User;
import com.ds.trainproject.repos.ReservationRepository;
import com.ds.trainproject.repos.TrainRepository;
import com.ds.trainproject.repos.UserRepository;

@RestController
public class ReservationController {
	
	@Autowired
	private ReservationRepository reservationRepository;
	@Autowired
	private TrainRepository trainRepository;
	@Autowired 
	UserRepository userRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/reservations")
	public List<Reservation> getAll() {
		return reservationRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/reservations")
	public Reservation AddBooking(@RequestBody Reservation reservation) {
		Optional<User> optUser = userRepository.findById(reservation.getUserId());
		User user = optUser.get();
		
		Optional<Train> optTrain = trainRepository.findById(reservation.getTrainId());
		Train train = optTrain.get();
		
		reservation.setPrice(reservation.getNoOfTickets() * train.getTripPrice());
		
		reservation = reservationRepository.insert(reservation);
		try {
			MessageController messageController = new MessageController();
			messageController.sendSMS(user.getTelephoneNo(), "You have ordered Train tickets");
			
			EmailController emailController = new EmailController();
			emailController.sendEmail(user.getEmail(), "You have ordered Train tickets");
		}catch(Exception e) {}
		
		return reservation;
	}
	
	
}
