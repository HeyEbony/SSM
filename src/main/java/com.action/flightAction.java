package com.action;

import com.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
//Scope为每一个用户的请求都会创建一个实例，默认为单例
@Scope("prototype")
@RequestMapping("/flight")
public class flightAction {
    @Autowired
    FlightService flightService;

    @RequestMapping(value = "/findAllFilght.do", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> findAllFilght() {
        //  System.out.println("control test ok");
        List<Map<String, String>> allFlight = flightService.findAllFlight();
        //System.out.println("action="+allFlight);
        return allFlight;
    }

}
