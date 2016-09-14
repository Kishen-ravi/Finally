function ValidateContactForm()
	{
		var name = document.contactform.username;
	    var email = document.contactform.email;
	    var password= document.contactform.password;
	    var pass_con= document.contactform.pass_con;
	    
	if (name.value == "")
	{
	    window.alert("Please enter your name.");
	    name.focus();
	    return false;
	}
	if (email.value == "")
	{
	    window.alert("Please enter a valid e-mail address.");
	    email.focus();
	    return false;
	}

	if (email.value.indexOf("@", 0) < 0)
	{
	    window.alert("Please enter a valid e-mail address.");
	    email.focus();
	    return false;
	}

	if (email.value.indexOf(".", 0) < 0)
	{
	    window.alert("Please enter a valid e-mail address.");
	    email.focus();
	    return false;
	}
	if (password.value == "")
	{
	    alert("Please enter the password");
	    password.focus();
	    return false;
	}
	if (pass_con.value != password)
	{
	    alert("Please enter the password again");
	    pass_con.focus();
	    return false;
	}
	}