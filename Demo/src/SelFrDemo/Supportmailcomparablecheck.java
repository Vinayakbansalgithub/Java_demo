package SelFrDemo;

import java.util.ArrayList;

import java.util.*;



public class Supportmailcomparablecheck {
public static void main(String[] args) {
	ArrayList<ComparableInterfaceCheck> list= new ArrayList<ComparableInterfaceCheck>();
	
	list.add(new ComparableInterfaceCheck(19,"vinayak","firozabad"));
	list.add(new ComparableInterfaceCheck(15,"nitin","gzb"));
	list.add(new ComparableInterfaceCheck(18,"nasa","gurgaon"));
	
	Collections.sort(list);
	
	for(ComparableInterfaceCheck var:list){
	
	System.out.println(var);
	}
}
}
