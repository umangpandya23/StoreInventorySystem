package BLL;

import DAL.Supplyer;
import Getway.SupplyerGetway;

public class SupplyerBLL {
    
    SupplyerGetway supplyerGetway = new SupplyerGetway();

    public void save(){
        
    }
    
    public Object delete(Supplyer supplyer){
        if(supplyerGetway.isNotUse(supplyer)){
            supplyerGetway.delete(supplyer);
        }else{
            
        }
        return supplyer;
    }
}
