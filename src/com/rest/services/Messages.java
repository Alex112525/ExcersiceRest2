package com.rest.services;

import java.util.Map;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/services")
public class Messages
{
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String sayPlainTextHello()
//	{
//		return "Hello jersey Plain Text";
//	}
	
//	@GET
//	@Produces(MediaType.TEXT_XML)
//	public String sayXMLHello()
//	{
//		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
//	}
	
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String sayHtmlHello()
//	{
//		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
//				 + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
//
//	}
	
	@GET
	@Path("sq")
	public String square(@DefaultValue("2") @QueryParam(value = "num") long num )
	{
		return "" + num * num;
	}
	
	@GET
	@Path("msgs")
	public String message(@DefaultValue("Holis Crayolis") @QueryParam(value = "msg") String msg)
	{
		return msg;
	}
	
	@GET
	@Path("sum")
	public String suma(@QueryParam(value = "num1") long num1, @QueryParam(value= "num2") long num2)
	{
		return "" + (num1 + num2);
	}
	
	@GET
	@Path("urimsg")
	public String UriMesssage(@Context UriInfo uriInfo)
	{
		String result = "";
		for (Map.Entry<?, ?> entry : uriInfo.getQueryParameters().entrySet())
		{
			result += entry.getKey() + " = " + entry.getValue() + ", ";
		}
		return result;
	}
	
	
	
	
}
