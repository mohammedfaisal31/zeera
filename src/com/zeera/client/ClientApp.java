package com.zeera.client;


import java.util.List;
import com.zeera.dao.*;
import com.zeera.model.*;

public class ClientApp {
  private static ZeeraDAO menu = new ZeeraDAOImpl();
  public static void main(String[] args) {
  System.err.println("Listing all Items:");
  listAllItems();
  }

  private static void listAllItems() {
  List<MenuItem> items = menu.listAllItems();
 
  for (MenuItem item : items) {
   System.out.println(item);
  }
}

}