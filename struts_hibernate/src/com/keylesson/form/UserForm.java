package com.keylesson.form;


import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


import javax.servlet.http.HttpServletRequest;
public class UserForm extends org.apache.struts.action.ActionForm  {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
private String pass;
@Override
public String toString() {
	return "UserForm [name=" + name + ", pass=" + pass + "]";
}
public UserForm() {
	super();
	// TODO Auto-generated constructor stub
}
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	ActionErrors errors = new ActionErrors();
	if (name == null || name.length() < 1) {
		errors.add("name", new ActionMessage("error.name.required"));
		// TODO: add 'error.name.required' key to your resources
	}

	return errors;
}

}
