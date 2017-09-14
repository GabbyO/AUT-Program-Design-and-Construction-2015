
public class Pet 
{
    private String petType;
    
    public void checkPetType(int pet)
    {
        switch(pet)
        {
            case 1: petType = "dog";
                break;

            case 2: petType = "cat";
                break;
                
            case 3: petType = "bunny";
                break;
             
            case 4: petType = "no pet";
                break;
        }
    }
    
    public String getPetType()
    {
        return this.petType;
    }
}
