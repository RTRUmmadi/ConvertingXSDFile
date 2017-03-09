package com.raj.unMarshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.raj.AddressInfo;
import com.raj.Employee;

public class Address {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
			AddressInfo a1 = new AddressInfo();
			System.out.println(a1);
			
			File f1 = new File("Employee.xml");
			JAXBContext jc = JAXBContext.newInstance(Employee.class);
			
			Unmarshaller us = jc.createUnmarshaller();
			Employee emp = (Employee)us.unmarshal(f1);
			System.out.println(emp);
			
	}

}
