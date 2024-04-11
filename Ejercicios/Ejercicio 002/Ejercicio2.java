/*public*/ class Lasagna {

    public int expectedMinutesInOven(){

        final int OVEN_TIME = 40;
        return OVEN_TIME;
    }

    public int remainingMinutesInOven(int actualTime){

        return expectedMinutesInOven() - actualTime;

    }
    
    public int preparationTimeInMinutes(int layers){

        return layers * 2;

    }

    
    public int totalTimeInMinutes(int layers,int timeInOven){

        return preparationTimeInMinutes(layers) + timeInOven;
    }
}
