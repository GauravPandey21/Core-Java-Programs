package com.dev.simpleprograms;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class DomParserExample {
	
	public void parseInputXML(File f1) throws Exception{
		DocumentBuilderFactory dbFactory  = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(f1);
		
		doc.getDocumentElement().normalize();
		
		System.out.println("Root element :"  + doc.getDocumentElement().getNodeName());
		
		NodeList nList = doc.getElementsByTagName("OrderNo");
		System.out.println("----------------------------");
		
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
			
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				System.out.println("RespCode : " + eElement.getElementsByTagName("RespCode").item(0).getTextContent());
				System.out.println("RespDesc : " + eElement.getElementsByTagName("RespDesc").item(0).getTextContent());				
				System.out.println("Amount : " + eElement.getElementsByTagName("Amount").item(0).getTextContent());
				
				System.out.println("RespCode : " + eElement.getElementsByTagName("RespCode"));
				System.out.println("RespDesc : " + eElement.getElementsByTagName("RespDesc"));				
				System.out.println("Amount : " + eElement.getElementsByTagName("Amount"));
				
				
			}        
		}
	}

}
