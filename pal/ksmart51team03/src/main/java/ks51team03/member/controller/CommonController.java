package ks51team03.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("userCommonController")
public class CommonController {
	@GetMapping("/member/member_main")
	public String userMainPage(Model model)
	{
		model.addAttribute("title","PAL");
		
		return "member/member_main";
	}
}
