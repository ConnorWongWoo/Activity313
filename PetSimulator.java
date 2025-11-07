/*
 * Activity 3.1.3
 */
public class PetSimulator
{
  public static void main(String[] args)
  {
    // create an array that can hold up to 10 pets (does not require looping)
    Pet[] pets = new Pet[10];
    
    // adopt (create and name) four pets, two cats, two dogs (does not require looping)
    Pet cat1 = new Pet("Poop", 1);
    Pet cat2 = new Pet("PoopCat", 1);
    Pet dog1 = new Pet("PoopDog", 2);
    Pet dog2 = new Pet("PoopDog2", 2);
    pets[0] = cat1;
    pets[1] = cat2;
    pets[2] = dog1;
    pets[3] = dog2;

    // first things first, feed your pets

    // next, make yourself the owner of all of your new pets

    // your dogs make some noise, take them for a walk

    // when you get back, your cats make some noise
    
    // give all of your pets a treat

    // groom your cats
 
    // grooming is done, play with all pets

    // whew, that was tiring, all pets nap and get fed
    for (Pet p : pets) {
        p.feed();
      p.setOwner("Me");
      if (p.getType() == 2) { 
        p.makeNoise();
        p.walk();
      }
      if (p.getType() == 1) p.makeNoise();
      p.giveTreat();
      if (p.getType() == 1) p.groom();
      p.feed();
      p.sleep();
    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
      p.toString();
    }
    // You decide to get a couple of pets for your friend (does not require looping)
    Pet fcat1 = new Pet("FriedCat", 1);
    Pet fcat2 = new Pet("FriedCat2", 1);
    // set the owner of the new pets to your friends name
    fcat1.setOwner("Friend");
    fcat2.setOwner("Friend");
    pets[4] = fcat1;
    pets[5] = fcat2;
    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet p : pets) {
      if (p.getOwner().equals("Friend")) p.toString();
    }

  }
}