package com.spingbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value="get") 
	public String vamsi() {
		return  "hello Vamsi!";
	}
}



//get mapping
//public Office get(){
//Office office=new office(2,"vamsi","bhargav");

//list
////public Office get(){
//List<Office> new =Arraylist();
//new.add(new Office(2,"vamsi","bhargav));


//pathvariable(value="path"/{number})
//public Office path(@pathvaraible int number){
//Office obj=new Object(number,"vamsi","bhargav")
//return obj

//
//pathvariable(value="path"/{number}/{first-number}/{last-name})
//public Office path(@pathvaraible("number") int studentnumber,@pathvaraible String firstname,@pathvaraible String lastname){
//Office obj=new Object(studentnumber,"firstname","lastname")
//return obj


//requestparam("req/id")
//public Office request(@requestparamint id){
////Office obj=new Object(id,"vamsi","bhargav")
//return obj

