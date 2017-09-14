public class Food 
{
    Pet pet;
    Player player;
    String foodType;
    String dog = "dog";
    String cat = "cat";
    String bunny = "bunny";
    private int health;
    
    public Food()
    {
        player = new Player();
        this.health = player.getPetHealthOrignal();
    }
    
    public void checkFood(int food, String petOne)
    {  
        if(dog.equals(petOne))
        {
            switch(food)
            {
                case 1: foodType = "dog food";
                    break;

                case 2: foodType = "cat food";
                    break;

                case 3: foodType = "bunny food";
                    break;

                case 4: foodType = "no food";
                    break;
            }
            
            if(this.foodType.equals("dog food"))
            {
                this.health += 25;
            }
            
            if(this.foodType.equals("cat food"))
            {
                this.health -= 10;
            }
            
            if(this.foodType.equals("bunny food"))
            {
                this.health -= 15;
            }
            
            if(this.foodType.equals("no food"))
            {
                this.health -= 35;
                
            }
            
            System.out.println("Your pet's health is now; " + getHealth());
        }
        
        if(cat.equals(petOne))
        {
            switch(food)
            {
                case 1: foodType = "dog food";
                    break;

                case 2: foodType = "cat food";
                    break;

                case 3: foodType = "bunny food";
                    break;

                case 4: foodType = "no food";
                    break;
            }
            
            if(this.foodType.equals("dog food"))
            {
                this.health+=25;
            }
            
            if(this.foodType.equals("cat food"))
            {
                this.health-=2;
            }
            
            if(this.foodType.equals("bunny food"))
            {
                this.health-=5;
            }
            
            if(this.foodType.equals("no food"))
            {
                this.health-=35;
                
            }
            System.out.println("Your pet's health is now; " + getHealth());
        }
        
        if(bunny.equals(petOne))
        {
            switch(food)
            {
                case 1: foodType = "dog food";
                    break;

                case 2: foodType = "cat food";
                    break;

                case 3: foodType = "bunny food";
                    break;

                case 4: foodType = "no food";
                    break;
            }
            
            if(this.foodType.equals("dog food"))
            {
                this.health += 25;
            }
            
            if(this.foodType.equals("cat food"))
            {
                this.health-=2;
            }
            
            if(this.foodType.equals("bunny food"))
            {
                this.health-=5;
            }
            
            if(this.foodType.equals("no food"))
            {
                this.health-=35;
                
            }
            System.out.println("Your pet's health is now; " + getHealth());
        }
    }
    
    public void checkHealthStatus(int pet)
    {
        
        if(getHealth() <= 0)
        {
            System.out.println("Your pet have died.");
        }
    }
    
    public String getFoodType()
    {
        return this.foodType;
    }

    public int getHealth() {
        return this.health;
    }


}
