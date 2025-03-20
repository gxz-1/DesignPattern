

public class SingleClass {
    private static volatile SingleClass instance;

    private SingleClass(){}

    public static SingleClass getInstance(){
        if(instance==null){
            synchronized (SingleClass.class){
                if(instance==null){
                    instance = new SingleClass();
                }
            }
        }
        return instance;
    }
}

