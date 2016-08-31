package Java.Structural.Facade;

/**
 * Created by Jack F. Dalton on 0030 30 08 2016.
 */
public class HouseHandlerFacade {

    private Boolean isNight;
    private KitchenHandler kitchenHandler;
    private HeatingHandler heatingHandler;
    private LightsHandler lightsHandler;
    private AlarmHandler alarmHandler;

    public HouseHandlerFacade() {
        this.kitchenHandler = new KitchenHandler();
        this.heatingHandler = new HeatingHandler();
        this.lightsHandler = new LightsHandler();
        this.alarmHandler = new AlarmHandler();
    }

    public void setHouseIntoHolidayMode() {
        lightsHandler.turnOffAllLights();
        alarmHandler.turnOnAlarmSystem();
        //turn off all kitchen stuff
        //set heating to keep pipes warm
    }

    public void setHouseIntoLivingMode() {
        alarmHandler.turnoffAlarmSystem();

        if(isNight) {
            lightsHandler.turnOnAllLights();
            //turn on heating
            //kitchen handler
        }
    }

    public void prepareForCooking(int numberOfMinutes) {

    }

    public void setHouseIntoAtWorkMode() {

    }
}
