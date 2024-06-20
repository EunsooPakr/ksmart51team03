package ks51team03.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {
	
	@GetMapping("/company/insert")			// 어노테이션 괄호안에는 옵션을 쓴다.   /  컨트롤러에서는 무조건 String으로 반환
	public String companyInsert() {

		return "company/company_insert";
	}
	@GetMapping("/company/info")			// 어노테이션 괄호안에는 옵션을 쓴다.   /  컨트롤러에서는 무조건 String으로 반환
	public String companyInfo() {

		return "company/company_info";
	}
	@GetMapping("/company/modify")			// 어노테이션 괄호안에는 옵션을 쓴다.   /  컨트롤러에서는 무조건 String으로 반환
	public String companyModify() {

		return "company/company_modify";
	}
	@GetMapping("/company/delete")			// 어노테이션 괄호안에는 옵션을 쓴다.   /  컨트롤러에서는 무조건 String으로 반환
	public String companyDelete() {

		return "company/company_delete";
	}
	@GetMapping("/company/send_alarm")			// 어노테이션 괄호안에는 옵션을 쓴다.   /  컨트롤러에서는 무조건 String으로 반환
	public String companySendAlarm() {

		return "company/company_send_alarm";
	}
	@GetMapping("/company/staff_setting")			// 어노테이션 괄호안에는 옵션을 쓴다.   /  컨트롤러에서는 무조건 String으로 반환
	public String companyStaffSetting() {

		return "company/company_staff_setting";
	}
	@GetMapping("/company/question")			// 어노테이션 괄호안에는 옵션을 쓴다.   /  컨트롤러에서는 무조건 String으로 반환
	public String companyQuestion() {

		return "company/company_question";
	}
	@GetMapping("/company/review")			// 어노테이션 괄호안에는 옵션을 쓴다.   /  컨트롤러에서는 무조건 String으로 반환
	public String companyReview() {

		return "company/company_review";
	}

}
