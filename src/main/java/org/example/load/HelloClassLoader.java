package org.example.load;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class HelloClassLoader
{
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        URL[] urls = {new URL("http://localhost:8000/")};
        System.out.println("load url");
        URLClassLoader loader = URLClassLoader.newInstance(urls);
        System.out.println("loadClass Test");
        Class c = loader.loadClass("TestURLClassLoader");
        System.out.println("newInstance Test");
        c.newInstance();

    }
}
