import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,133,208);
        worm worm = new worm();
        addObject(worm,374,269);
        worm worm2 = new worm();
        addObject(worm2,360,85);
        worm worm3 = new worm();
        addObject(worm3,93,390);
        worm worm4 = new worm();
        addObject(worm4,383,466);
        worm worm5 = new worm();
        addObject(worm5,124,88);
        worm worm6 = new worm();
        addObject(worm6,472,161);
        worm worm7 = new worm();
        addObject(worm7,211,487);
        worm worm8 = new worm();
        addObject(worm8,444,383);
        Lobster lobster = new Lobster();
        addObject(lobster,249,339);
    }
}