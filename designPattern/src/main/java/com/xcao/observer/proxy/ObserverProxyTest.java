package com.xcao.observer.proxy;

import com.xcao.observer.core.Event;
import com.xcao.observer.proxy.core.EventLisenter;
import com.xcao.observer.proxy.core.SubjectEventType;

import java.lang.reflect.Method;

public class ObserverProxyTest {

    public static void main(String[] args) {

        try {
            //观察者
            Observer observer = new Observer();
            Method method = observer.getClass().getMethod("observe", Event.class);
//            System.out.println(method.getName());
            EventLisenter eventLisenter = new EventLisenter(new SubjectImpl());
            eventLisenter.addLisenter(SubjectEventType.ADD.toString().toLowerCase(), observer, method);
            eventLisenter.addLisenter(SubjectEventType.EDIT.toString().toLowerCase(), observer, method);
            eventLisenter.addLisenter(SubjectEventType.REMOVE.toString().toLowerCase(), observer, method);
            eventLisenter.addLisenter(SubjectEventType.QUERY.toString().toLowerCase(), observer, method);
            Subject subject = (Subject) eventLisenter.getProxy();
            subject.add();
            subject.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
