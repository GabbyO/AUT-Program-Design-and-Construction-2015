class Play 
{
    private int happiness;
    Pet pet;
    Player player;
    String playType;
    String dog = "dog";
    String cat = "cat";
    String bunny = "bunny";
    
    
    public Play()
    {
        player = new Player();
        this.happiness = player.petHappinessOrignal;
    }
    
    public void checkPlay(int toy, String petOne)
    {  
        if(dog.equals(petOne))
        {
            switch(toy)
            {
                    
                case 1: playType = "dog toy";
                    break;

                case 2: playType = "cat toy";
                    break;

                case 3: playType = "bunny toy";
                    break;

                case 4: playType = "no toy";
                    break;
                    
                case 5: playType = "petting";
                    break;
            }
            
            if(this.playType.equals("dog toy"))
            {
                this.happiness += 25;
            }
            
            if(this.playType.equals("cat toy"))
            {
                this.happiness -= 10;
            }
            
            if(this.playType.equals("bunny toy"))
            {
                this.happiness -= 15;
            }
            
            if(this.playType.equals("no toy"))
            {
                this.happiness -= 35;
                
            }
            
            if(this.playType.equals("petting"))
            {
                this.happiness += 20;
            }
            System.out.println("Your pet's happiness is now; " + getHappiness());
            
        }
        
        if(cat.equals(petOne))
        {
            switch(toy)
            {
                case 1: playType = "dog toy";
                    break;

                case 2: playType = "cat toy";
                    break;

                case 3: playType = "bunny toy";
                    break;

                case 4: playType = "no toy";
                    break;
                    
                case 5: playType = "petting";
            }
            
            
            
            if(this.playType.equals("dog toy"))
            {
                this.happiness -= 25;
            }
            
            if(this.playType.equals("cat toy"))
            {
                this.happiness += 35;
            }
            
            if(this.playType.equals("bunny toy"))
            {
                this.happiness -= 5;
            }
            
            if(this.playType.equals("no toy"))
            {
                this.happiness -= 35;
                
            }
            
            if(this.playType.equals("petting"))
            {
                this.happiness += 15;
            }
            
            System.out.println("Your pet's happiness is now; " + getHappiness());
        }
        
        if(bunny.equals(petOne))
        {
            switch(toy)
            {
                case 1: playType = "dog toy";
                    break;

                case 2: playType = "cat toy";
                    break;

                case 3: playType = "bunny toy";
                    break;

                case 4: playType = "no toy";
                    break;
                    
                case 5: playType = "petting";
                    break;
            }
            System.out.println("You have given your pet the " + this.playType);
            
            if(this.playType.equals("dog toy"))
            {
                this.happiness += 25;
            }
            
            if(this.playType.equals("cat toy"))
            {
                this.happiness -= 5;
            }
            
            if(this.playType.equals("bunny toy"))
            {
                this.happiness -= 5;
            }
            
            if(this.playType.equals("no toy"))
            {
                this.happiness -= 35;
                
            }
            
            if(this.playType.equals("petting"))
            {
                this.happiness += 25;
                
            }
            
            System.out.println("Your pet's happiness is now; " + getHappiness());
        }
        
    }
    
    public void checkHappiness(int pet)
    {
        if(getHappiness() <= 0)
        {
            System.out.println("Your pet have ran away.");
        }
    }

    public String getPlayType()
    {
        return this.playType;
    }
    
    public int getHappiness() 
    {
        return this.happiness;
    }
}
