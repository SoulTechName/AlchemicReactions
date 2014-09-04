package evilcraft.api.weather;

import net.minecraft.world.World;

/**
 * Abstract class for weather types.
 * @author rubensworks
 *
 */
public abstract class WeatherType {
    
    /**
     * Clear weather.
     */
    public static final WeatherType CLEAR = new WeatherTypeClear();
    /**
     * Rain.
     */
    public static final WeatherType RAIN = new WeatherTypeRain();
    /**
     * Lightning.
     */
    public static final WeatherType LIGHTNING = new WeatherTypeLightning();
    
    /**
     * Array that contains all possible weather types
     */
    public static final WeatherType[] WEATHER_TYPES = {CLEAR, RAIN, LIGHTNING};
    
    /**
     * Check if this weather is active in the given world.
     * @param world The world.
     * @return If it is active.
     */
    public abstract boolean isActive(World world);
    
    /**
     * Activate this weather in the given world.
     * @param world The world.
     */
    public abstract void activate(World world);
    /**
     * Deactivate this weather in the given world.
     * @param world The world.
     */
    public abstract void deactivate(World world);
    
    /**
     * Activate or deactivate this weather in the given world.
     * @param world The world.
     * @param activate If the weather must be activated.
     */
    public void activate(World world, boolean activate) {
        if (activate)
            activate(world);
        else
            deactivate(world);
    }
    
    /**
     * Returns the current active weather type.
     * 
     * @param world The world.
     * @return The current active {@link WeatherType},
     *         or null in case no known active weather 
     *         type was found.
     */
    public static WeatherType getActiveWeather(World world) {
        for (WeatherType type : WEATHER_TYPES) {
            if (type.isActive(world))
                return type;
        }
        
        return null;
    }
}
