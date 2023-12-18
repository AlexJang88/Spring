package test.spring.mvc.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/chat/*")
public class ChatController {
	
	
	@RequestMapping("/room")
	public String chatRoom(String id, HttpSession session,Model model) {
		session.setAttribute("memId", id);
		model.addAttribute(id, model);
		String cid=id;
		String path = "D:\\springdev\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\spring\\resources\\file\\chat\\";
		String fullname=path+cid+".txt";
		File file = new File(fullname);
		ArrayList<String> list=null;
		if(file.exists()) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fullname));
			String str;
			list = new ArrayList();
			while((str=reader.readLine())!=null) {
				list.add(str);
			}
			reader.close();
			model.addAttribute("list", list);
			} catch (Exception e) {
			e.printStackTrace();
			}
		}
		
		return "chat/room";
}
}
