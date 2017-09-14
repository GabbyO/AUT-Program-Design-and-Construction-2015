public class Player 
{
    Pet pet;
    Food food;
    private final int petHealthMax = 250;
    private final int petHappinessMax = 250;
    
    public int petHealthOrignal = 50;
    public int petHappinessOrignal = 50;
    
    String dog = "dog";
    String cat = "cat";
    String bunny = "bunny";
            
    public void checkHealth(String aUserHealth)
    {
        
        if(dog.equals(aUserHealth))
        {
            System.out.println("Your pet's health now have: " + getPetHealthOrignal());
        }
        
        if(cat.equals(aUserHealth))
        {
            System.out.println("Your pet's health now have: " + getPetHealthOrignal());
        }
        
        if(bunny.equals(aUserHealth))
        {
            System.out.println("Your pet's health now have: " + getPetHealthOrignal());
        }
        
    }
    
    public void checkHappiness(String aUserHappiness)
    {
        if(dog.equals(aUserHappiness))
        {
            System.out.println("Your pet's happiness now have: " + getPetHappinessOrignal());
        }
        
        if(cat.equals(aUserHappiness))
        {
            System.out.println("Your pet's happiness now have: " + getPetHappinessOrignal());
        }
        
        if(bunny.equals(aUserHappiness))
        {
            System.out.println("Your pet's happiness now have: " + getPetHappinessOrignal());
        }
    }
    
    
    public void checkHungry(String aUserHungry)
    {
        if(dog.equals(aUserHungry))
        {
            System.out.println("Your pet's hungry now have: " + getPetHappinessOrignal());
        }
        
        if(cat.equals(aUserHungry))
        {
            System.out.println("Your pet's hungry now have: " + getPetHappinessOrignal());
        }
        
        if(bunny.equals(aUserHungry))
        {
            System.out.println("Your pet's hungry now have: " + getPetHappinessOrignal());
        }
    }  
    
    /**
     * @return the petHealthOrignal
     */
    public int getPetHealthOrignal() {
        return this.petHealthOrignal;
    }

    /**
     * @return the petHappinessOrignal
     */
    public int getPetHappinessOrignal() {
        return this.petHappinessOrignal;
    }

    /**
     * @return the petHealthMax
     */
    public int getPetHealthMax() 
    {
        return this.petHealthMax;
    }

    /**
     * @return the petHappinessMax
     */
    public int getPetHappinessMax() 
    {
        return this.petHappinessMax;
    }
    
}
