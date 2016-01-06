package com.kdyzm.controller;

import java.util.Collection;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kdyzm.domain.Person;
import com.kdyzm.service.PersonService;

@Controller
@RequestMapping(value="/person")
public class PersonController {
	Model model;
	@Resource(name="personService")
	private PersonService personService;
	@RequestMapping(value="/save")
	public String savePerson(Person p){
		this.personService.saveEntity(p);
		return "redirect:/person/listAll";
	}
	@RequestMapping(value="addPersonUI")
	public String addPersonUI(Model model){
		return "person/addPersonUI";
	}
	@RequestMapping(value="listAll")
	public String listAllPersons(HttpServletRequest request){
		Collection<Person> persons=this.personService.findAllEntities();
		request.setAttribute("persons", persons);
		for(Person p:persons){
			System.out.println(p);
		}
		return "person/listAll";
	}
	
	/**
	 * 
	 * @param p
	 * @param request
	 * @return
	 * 
	 * 出现的问题是如果使用person作为关键字名字，那么在前端页面上就不能正确获取到该值
	 * 必须使用其它的名字，这个和springmvc的底层数据的存储方式有关系？
	 */
	@RequestMapping(value="updateUI")
	public String updateUI(long id,HttpServletRequest request){
		Person p=this.personService.getEntityById(id);
		System.out.println(p);
		request.setAttribute("person", p);
		return "person/updateUI";
	}
	
	@RequestMapping(value="updatePersonInf")
	public String updatePersonInf(Person person){
		System.out.println(person);
		this.personService.updateEntity(person);
		return "redirect:/person/listAll";
	}
	@RequestMapping(value="deletePerson")
	public String deletePerson(Person person){
		this.personService.deleteEntity(person);
		return "redirect:/person/listAll";
	}
}
