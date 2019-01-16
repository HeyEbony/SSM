package com.service.impl;

import com.dao.FlightDAO;
import com.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("flightService")
public class FlightServiceImpl implements FlightService {
    @Autowired
    FlightDAO flightInfoDAOImpl;
    @Override
    public List<Map<String, String>> findAllFlight() {
        //   System.out.println("Service Test ok");
        List<Map<String, String>> allFlightInfo = flightInfoDAOImpl.findAllFlightInfo();
        //  System.out.println(allFlightInfo);
        return allFlightInfo;
    }

    @Override
    public Map<String, String> findFlightId(int id) {
        Map<String, String> flightId = flightInfoDAOImpl.findFlightId(id);
        return flightId;
    }
}