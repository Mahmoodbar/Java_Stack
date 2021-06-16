package com.section.hash;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDate {
	@RequestMapping("/")
	public String main() {

		return "main.jsp";
	}

	@RequestMapping("/date")
	public String Date(Model model) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
		String dayFormat = new SimpleDateFormat("EEEE").format(new Date());
		Date date = new Date();
		model.addAttribute("date" , dateFormat.format(date));
		model.addAttribute("dayFormat" , dayFormat);
		return "date.jsp";
	}

	@RequestMapping("/time")
	public String Time(Model model) {
		Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
	    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    String formattedDate=dateFormat.format(date);
	    model.addAttribute("time" , formattedDate);
		return "time2.jsp";
	}
}
