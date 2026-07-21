static class Singleton {
    private static Singleton mySingleton = null;
    private String value;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(mySingleton == null){
            mySingleton = new Singleton();
        }
        return mySingleton;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
