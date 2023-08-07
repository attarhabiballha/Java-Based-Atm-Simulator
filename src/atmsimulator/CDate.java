/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package atmsimulator;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
/**
 *
 * @author Admin
 */
public class CDate {
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   public String cdateTime =dtf.format(now);
   String cdateTimeFun(){
       return cdateTime;
   }
   
}
