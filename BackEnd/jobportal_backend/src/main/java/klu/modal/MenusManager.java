package klu.modal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.GsonBuilder;

import klu.repository.MenusRepository;
import klu.repository.UserRepository;

@Service
public class MenusManager {
	
	@Autowired
	MenusRepository MR;
	
	@Autowired
	JwtManager JWT;
	
	@Autowired
	UserRepository UR;
	
	//Fetch all menu items from database
	public String getMenus()
	{
		List<Menus> menuList = new ArrayList<Menus>();
		menuList = MR.findAll();
		return new GsonBuilder().create().toJson(menuList).toString();
	}
	
	//Fetch all menu items based on role
	public String getMenusByRole(String token)
	{
		String emailid = JWT.validateToken(token);
		if(emailid.equals("401"))
			return "401::Invalid Token";
		
		User U = UR.findById(emailid).get();
		List<Menus> menuList = MR.findByRole(U.getRole());
		return new GsonBuilder().create().toJson(menuList);
	}
}
