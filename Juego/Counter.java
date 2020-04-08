import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Counter extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private int target;
    private String prefix;
    
    public Counter()
    {
        this(new String());
    }

    /**
     * Crear un nuevo contador, inicializando en 0
     */
    public Counter(String prefix)
    {
        background = getImage();  // obtener imagen de la clase
        value = 0;
        target = 0;
        this.prefix = prefix;
        updateImage();
    }
    
    /**
     * Anime la pantalla para que cuente hacia arriba (o hacia abajo)
     * hasta el valor de destino actual.
     */
    public void act() 
    {
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
    }

    /**
     * Agregue una nueva puntuación al valor del contador actual. 
     * Esto animará el contador sobre fotogramas consecutivos hasta que alcance el nuevo valor. 
     */
    public void add(int score)
    {
        target += score;
    }

    /**
     * Devuelve el valor del contador actual.
     */
    public int getValue()
    {
        return target;
    }

    /**
     * Establezca un nuevo valor de contador. Esto no animará el contador.
     */
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }
    
    /**
     * Establezca un nuevo valor de contador. Esto no animará el contador
     * el valor del contador (por ejemplo, "Puntuación: ").
     */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    /**
     * Actualice la imagen en pantalla para mostrar el valor actual.
     */
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
