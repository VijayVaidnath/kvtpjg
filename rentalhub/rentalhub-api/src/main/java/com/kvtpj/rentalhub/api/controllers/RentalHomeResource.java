package com.kvtpj.rentalhub.api.controllers;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Vijay Vaidnath
 *
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("rentalhub/api")
@Transactional(rollbackFor = Exception.class)
public class RentalHomeResource {

	@PostMapping("bookmyreservations/userId")
	public void bookReservation(@RequestParam("userId") String userId) {
		log.info("Creating a new reservation for {} user id", userId);
		log.info("Reservation completed for {} user id", userId);
	}

	@GetMapping("getmyreservations/{postalCode}")
	public void getReservation(@RequestParam("postalCode") String postalCode) {
		log.info("Find availability for {} postal code", postalCode);
		log.info("Availability for postal code {} has been sent out", postalCode);
	}

	@PatchMapping("bookmyreservations/{reservationId}")
	public void updateReservation(@RequestParam("reservationId") String reservationId) {
		log.info("Updating the existing reservation for {} reservation id", reservationId);
		log.info("Update for the existing reservation {} has been completed", reservationId);
	}

}
