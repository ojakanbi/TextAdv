public class Action {

    private Method method;
    private char hotkey;

    private String name;

    private Enemy kwargs;

    public char getHotkey(){
        return hotkey;
    }
    public void setHotkey(char hotkey){
        this.hotkey = hotkey;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Enemy getKwargs(){
        return kwargs;
    }

    public void setKwargs(Enemy kwargs){
        this.kwargs = kwargs;

    }



    public String str(){
        return hotkey + " :" + name;
    }

    public Method getMethod(){
        return method;
    }

    public void setMethod(Method method){
        this.method = method;
    }

    //constructor
    public Action(Method method, String name, char hotkey, Enemy kwargs){
        this.method = method;
        this.name = name;
        this.hotkey = hotkey;
        this.kwargs = kwargs;

    }


}
