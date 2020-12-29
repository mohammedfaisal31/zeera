package com.zeera.model;


public class MenuItem {
   private Long menu_item_id;
   private String menu_item_title;
   private String menu_item_description;
   private int menu_item_price;

   public Long getMenu_item_id() {
	 return menu_item_id;
   }
   
   public void setMenu_item_id(Long menu_item_id) {
	 this.menu_item_id = menu_item_id;
   }
   
   public String getMenu_item_title() {
	 return menu_item_title;
   }

   public void setMenu_item_title(String menu_item_title) {
	 this.menu_item_title = menu_item_title;
   } 

   public String getMenu_item_description() {
	 return menu_item_description;
   }
   
   public void setMenu_item_description(String menu_item_description) {
	 this.menu_item_description = menu_item_description;
   }
   
   public int getMenu_item_price() {
	 return menu_item_price;
   }
   
   public void setMenu_item_price(int menu_item_price) {
	this.menu_item_price = menu_item_price;
   }
   
   
	 
}