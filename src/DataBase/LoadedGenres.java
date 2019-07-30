/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.util.ArrayList;

/**
 *
 * @author Nemanja
 */
public class LoadedGenres extends ArrayList<GenrePOJO>{
    
   public ArrayList<String> getGenreNames() {
       ArrayList<String> result = new ArrayList();
       for(GenrePOJO current : this){
           result.add(current.getName());
       }
       return result;
   }
}
