package de.rwth.idsg.steve.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/manager/operations/elekey")
public class ElekeyController
{


    @RequestMapping(value = "/reserve", method = RequestMethod.GET)
    public String reserve(Model model) {
        System.out.println("Hallo Elekey");
        return "0";
    }
}
