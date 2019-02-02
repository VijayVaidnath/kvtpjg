package com.kvtpj.rentalhub.myrentalhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvtpj.rentalhub.myrentalhome.entity.MyRentalHomeDetails;

/**
 * @author vijay
 *
 */
public interface MyRentalHomeRepository extends JpaRepository<MyRentalHomeDetails, Long> {

}
