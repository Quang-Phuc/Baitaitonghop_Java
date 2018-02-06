package com.keylesson.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.keylesson.form.UserForm;

import org.apache.struts.action.ActionForward;
public class UserAction extends org.apache.struts.action.Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		UserForm loginForm = (UserForm) form;
		String page=request.getParameter("page");
			return mapping.findForward(page);
		
		
	
	}

}
