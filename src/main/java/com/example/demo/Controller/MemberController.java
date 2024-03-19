package com.example.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@GetMapping("/memberlist")
	public String memberlist() {
		
		System.out.println("충돌테스트");
		System.out.println("충돌테스트1");
		return "멤버목록";
	}
	
}
