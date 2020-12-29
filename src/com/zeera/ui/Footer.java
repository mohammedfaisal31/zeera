package com.zeera.ui;

public class Footer {
  private String footer;

public String getFooter() {
	return footer;
}

 public void prepareFooter() {
	footer = " <footer id=\"footer\">\n"
			+ "    <i class=\"icons fab fa-2x fa-twitter\"></i>\n"
			+ "   <a class = \"black\" href = \"https://www.facebook.com/profile.php?id=100034936238638\"> <i class=\"icons fab fa-2x fa-facebook-f\"></i></a>\n"
			+ "   <a class = \"black\" href = \"https://www.instagram.com/mohd_____arham/?hl=en\">  <i class=\"icons fab fa-2x fa-instagram\"></i></a>\n"
			+ "    <i class=\"icons fas fa-2x fa-envelope\"></i>\n"
			+ "    <p>© Copyright 2020 Zeera</p>\n"
			+ "\n"
			+ "  </footer>\n"
			+ "\n"
			+ "</body>\n"
			+ "\n"
			+ "</html>";
 }
  
  
}
