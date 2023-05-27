import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class play extends World
{
    private int maxFood = 7; 
    private int maxTrash = 7; // Maximum number of objects allowed on the screen
    
    static Counter score = new Counter ("score: ");
    static Counter hp = new Counter ("Hp: ");
    
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter();
    public play()
    {    
        super(300, 500, 1); // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
        addObject(timeCount,150, 30);
        tim.mark();
    }
    
    private void prepare()
    {
        robot robot = new robot();
        addObject(robot,138,495);

        addObject(score, 40, 30);
        score.setValue(0);
        addObject(hp, 260, 30);
        hp.setValue(5);
    }
    private int trashSpawnTimer = 0; // Timer to track trash spawning
    private int trashSpawnInterval = 100; // 1 second = 60 frames (assuming act() is called 60 times per second)

    public void act()
    {
        spawnFood();
        spawnTrash();
        timeCount.setValue(tim.millisElapsed()/1000);
        if (hp.getValue() == 0) {
            Greenfoot.setWorld(new GameOver());
        }
        if (timeCount.getValue() >= 30) {
        Greenfoot.setWorld(new GameOver());
        }
    }
    
    private void spawnFood()
    {
        if (CountTracker.foodCount < maxFood && Greenfoot.getRandomNumber(500) < 3) {
            food newFood = new food();
            newFood.getImage().scale(30, 30);
            addObject(newFood, Greenfoot.getRandomNumber(1000), 1);
            CountTracker.foodCount++;
        }
        if (CountTracker.foodCount < maxFood && Greenfoot.getRandomNumber(500) < 3) {
            chicken newChicken = new chicken();
            newChicken.getImage().scale(30, 30);
            addObject(newChicken, Greenfoot.getRandomNumber(1000), 1);
            CountTracker.foodCount++;
        }
        if (CountTracker.foodCount < maxFood && Greenfoot.getRandomNumber(500) < 3) {
            apple newApple = new apple();
            newApple.getImage().scale(30, 30);
            addObject(newApple, Greenfoot.getRandomNumber(1000), 1);
            CountTracker.foodCount++;
        }
    }
     // 1 second = 60 frames (assuming act() is called 60 times per second)

    private void spawnTrash() {
    if (trashSpawnTimer % trashSpawnInterval == 0 && CountTracker.trashCount < maxTrash) {
        trash newTrash = new trash();
        trashh newTrashh = new trashh();
        newTrash.getImage().scale(20, 20);
        addObject(newTrash, Greenfoot.getRandomNumber(1000), 1);
        CountTracker.trashCount++;
        trashSpawnTimer = 0;
    }
    if (trashSpawnTimer % trashSpawnInterval == 0 && CountTracker.trashCount < maxTrash) {
        trashh newTrashh = new trashh();
        newTrashh.getImage().scale(20, 20);
        addObject(newTrashh, Greenfoot.getRandomNumber(1000), 1);
        CountTracker.trashCount++;
        trashSpawnTimer = 0;
    }
    trashSpawnTimer++; // Increment the timer
    } 
}
