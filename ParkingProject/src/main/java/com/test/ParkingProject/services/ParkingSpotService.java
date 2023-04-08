package com.test.ParkingProject.services;

import com.test.ParkingProject.repositorys.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

   final ParkingSpotRepository parkingSpotRepository;

   public ParkingSpotService (ParkingSpotRepository parkingSpotRepository){
       this.parkingSpotRepository = parkingSpotRepository;
   }


}
