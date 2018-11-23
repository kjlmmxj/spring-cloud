package org.finance_server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceConsumer {

	@RequestMapping("/getfinanceInfo")
	@ResponseBody
	public String getFinanceInfo() {
		return "invoking getFinanceInfo";
	}
}
