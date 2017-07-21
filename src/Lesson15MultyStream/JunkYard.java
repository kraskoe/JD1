package Lesson15MultyStream;

import java.util.Stack;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class JunkYard {
    public Stack<Part> junkParts = new Stack<>();
    public JunkYard(int det){
        for (int i = 0; i < det; i++){
            junkParts.push(new Part());
            System.out.println(junkParts.peek());
            System.out.println(junkParts.peek().getPart());
        }
    }
    public JunkYard(){
        new JunkYard(20);
    }

    public void throwDetails(int td){
        for (int i = 0; i < td; i++){
            junkParts.push(new Part());
        }
    }

    public Part gatherPart(){
        if (!(junkParts.isEmpty())){
            return junkParts.pop();
        } else return null;
    }
}
