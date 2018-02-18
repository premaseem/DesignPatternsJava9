package me.premaseem.proxy.protectiveProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeInvocationHandler implements InvocationHandler  {

	private EmployeeInterface emp;
	
	public EmployeeInvocationHandler(EmployeeInterface emp){
		this.emp = emp;
	}
	
	@Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().contains("setSalary")){
	    	throw new IllegalAccessException();
	    }
		if(method.getName().startsWith("get")){
	    	return method.invoke(emp, args);
	    }
		return null;
    }
}


 class ManagerInvocationHandler implements InvocationHandler  {

	private EmployeeInterface emp;
	
	public ManagerInvocationHandler(EmployeeInterface emp){
		this.emp = emp;
	}
	
	@Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().contains("Salary")){
	    	throw new IllegalAccessException();
	    }
		if(method.getName().startsWith("get")){
	    	return method.invoke(emp, args);
	    }
		if(method.getName().startsWith("set")){
	    	return method.invoke(emp, args);
	    }
		return null;
    }
}
