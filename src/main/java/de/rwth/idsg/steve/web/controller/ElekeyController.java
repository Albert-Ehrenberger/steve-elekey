package de.rwth.idsg.steve.web.controller;

import de.rwth.idsg.steve.ocpp.OcppVersion;
import de.rwth.idsg.steve.web.dto.ocpp.ChangeAvailabilityParams;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import de.rwth.idsg.steve.web.dto.ocpp.ChangeAvailabilityParams;
import de.rwth.idsg.steve.service.ChargePointServiceClient;
import de.rwth.idsg.steve.service.ChargePointHelperService;

@Controller
@RequestMapping(value = "/elekey")
public class ElekeyController
{


    @RequestMapping(value = "/reserve", method = RequestMethod.GET)
    public String reserve(Model model) {
        System.out.println("Hallo Elekey");
        return "0";
    }


    protected static final String REDIRECT_TASKS_PATH = "redirect:/manager/operations/tasks/";
    @Autowired protected ChargePointServiceClient chargePointServiceClient;
    protected static final String PARAMS = "params";

    @PostMapping(value = "/ChangeAvailability",
            consumes = "application/x-www-form-urlencoded")
    @ResponseBody                       // Nur String, keine View‑Auflösung
    public String changeAvailability(ChangeAvailabilityParams params) {

        int taskId =
                chargePointServiceClient.changeAvailability(params);

        return String.valueOf(taskId);
    }
}
