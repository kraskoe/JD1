package Lesson15MultyStream;

import java.util.Stack;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class JunkYard {
    public Stack<PartFactory> junkParts = new Stack<>();
    public JunkYard(int det){
        for (int i = 0; i < det; i++){
            junkParts.push(new PartFactory());
        }
    }
    public JunkYard(){
        this(20);
    }

    public void throwDetails(int td){
        for (int i = 0; i < td; i++){
            junkParts.push(new PartFactory());
            System.out.println("+++ Фабрика выбросила новую деталь +++");
        }
    }

    public PartFactory gatherPart(){
        if (!(junkParts.isEmpty())){
            return junkParts.pop();
        } else return null;
    }
}
