class Chicken implements Animal 
{     
    private String myType;     
    private String mySound;      
    public Chicken(String type, String sound1, String sound2)     {         
        myType = type;         
        if (Math.random() < 0.5){
            mySound = sound1;
        }     
        else{
            mySound = sound2;
        }
    }     
    public Chicken(){         
        myType = "unknown";         
        mySound = "unknown";     
     }      
    public String getSound(){
        return mySound;
    }     
    public String getType(){
        return myType;
    } 
}
