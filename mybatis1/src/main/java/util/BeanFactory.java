package util;


import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class BeanFactory {
         private  static Properties pro = new Properties();
         private  static Map<String,Object> map=new HashMap<>();
         static {
             InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("beans.Properties");

             try {
                 pro.load(in);
                 Set<Object> set = pro.keySet();
                 for (Object key : set) {
                     String property = pro.getProperty(key.toString());
                     Object obj = Class.forName(property).newInstance();
                     map.put(key.toString(),obj);

                 }
             } catch (Exception e) {
                 e.printStackTrace();
             }

         }
}
