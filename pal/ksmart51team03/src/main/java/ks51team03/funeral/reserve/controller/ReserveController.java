package ks51team03.funeral.reserve.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReserveController {

    @GetMapping("funeral/reserveDetail")
    public String reserveDetail() {

        return "funeral/funeral_reserve_detail";
    }
}
