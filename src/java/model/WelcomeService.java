package model;

import java.util.Calendar;

public class WelcomeService {
    
    Calendar now = Calendar.getInstance();
    
    public String getTimeOfDay(Calendar now){
        if(now == null){
            throw new IllegalArgumentException("Error: Calendar object cannot be null.");
        }
        
        String timeOfDay = "Good day";
        
        int currentTime = now.get(Calendar.HOUR_OF_DAY);

        if(currentTime >= 0 && currentTime < 12){
            timeOfDay = "Good Morning";       
        }else if(currentTime >= 12 && currentTime < 16){
            timeOfDay = "Good Afternoon";
        }else if(currentTime >= 16 && currentTime < 24){
            timeOfDay = "Good Evening";
        }
        
        return timeOfDay;
    }
    
    public String getWelcomeMessage(String name){
        
        String timeOfDay = getTimeOfDay(now);
        String msg = timeOfDay + " " + name + ", Welcome!";
        
        return msg;
    }
    
}
