package com.service;


import java.util.List;
import java.util.Map;

public interface FlightService {
    List<Map<String,String>> findAllFlight();
    Map<String,String> findFlightId(int id);
}