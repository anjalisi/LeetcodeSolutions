package com.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        if(path.length()==0 || path==null)
            return path;   
        //We will store the correct elements in the stack
        Stack<String> stack= new Stack<>();
        String[] correctPath= path.split("/");
        //Traverse each string and add only the correct values in the stack
        for(String p: correctPath)
        {
            //Pop the prev element when we are moving up a directory
            if(!stack.isEmpty() && p.equals(".."))
                stack.pop();
            //Add the relevant elements (not '.','..','') in the stack
            else if(!p.equals("..") && !p.equals(".") && !p.equals(""))
                stack.push(p);
        }
        List<String> res= new ArrayList<>(stack);
        return "/"+String.join("/", res);
    }
}