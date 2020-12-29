package com.zeera.dao;

import java.util.List;
import com.zeera.model.*;


public interface ZeeraDAO {
   
   public  List<MenuItem> listAllItems();
	
   public void insert(MenuItem item);
   
   public void update(MenuItem item);
    
   public void delete(MenuItem item);


}


