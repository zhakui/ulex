package com.zhkui.ulex.common;

public abstract class AbstractFilterChain implements Filter{

    private AbstractFilterChain next;

    public AbstractFilterChain(AbstractFilterChain filter){
        this.next = filter;
    }

    public Filter setFilter(AbstractFilterChain filter){
        this.next = filter;
        return this.next;
    }

    public Filter getFilter(){
        return this.next;
    } 

    public void done(Request request,Response response){
        if(doFilter(request,response)){
            return;
        }else if(this.next != null){
            this.next.done(request,response);
        }
    }

}