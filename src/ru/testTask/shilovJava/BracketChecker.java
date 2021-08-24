package ru.testTask.shilovJava;

import java.util.Stack;

public class BracketChecker {
    private String line;
    public BracketChecker(String inputLine){
        line=inputLine;
    }
    public void check(){
        Stack theStack = new Stack();
        for(int i=0;i<line.length();i++){
            char ch = line.charAt(i);
            switch(ch){
                case '{':
                case '(':
                case '[':
                    theStack.push(ch);
                    break;
                case '}':
                case ')':
                case ']':
                    if(!theStack.isEmpty()){
                        char chx = (char) theStack.pop();
                        if((ch=='}'&&chx!='{')||(ch==')'&&chx!='(')||(ch==']'&&chx!='['))
                            System.out.println("Error: "+ch+" at "+i);
                    }
                    else
                        System.out.println("Error: "+ch+" at "+i);
                    break;
                default:
                    break;
            }
        }
        if(!theStack.isEmpty())
            System.out.println("Error: missing right delimiter");
    }
}
