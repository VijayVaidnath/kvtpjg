package com.kvtpj.rentalhub.web.controllers;

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
public class MyRentalHomeResource {

	@PostMapping("bookmyreservations/userId")
	public void bookMyReservation(@RequestParam("userId") String userId) {

	}

	@GetMapping("getmyreservations/{reservationId}")
	public void getMyReservation(@RequestParam("reservationId") String reservationId) {

	}

	@PatchMapping("bookmyreservations/{reservationId}")
	public void updateMyReservation(@RequestParam("reservationId") String reservationId) {

	}

}
