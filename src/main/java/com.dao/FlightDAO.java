package com.dao;

import java.util.List;
import java.util.Map;

public interface FlightDAO {
    List<Map<String,String>> findAllFlightInfo();
    Map<String,String> findFlightId(int id);
}
