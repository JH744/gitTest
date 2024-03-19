package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@GetMapping("/listMember")
	public String listMember() {
		System.out.println("회원목록 기능 추가함");


		
		System.out.println("충돌테스트");
		System.out.println("충돌테스트1");
		return "멤버목록";
	
	}	
}

