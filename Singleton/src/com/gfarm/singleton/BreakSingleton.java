package com.gfarm.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			FileNotFoundException, IOException, CloneNotSupportedException {
		Singleton oSingleInstance = Singleton.getInstance();
		Singleton dSingleInstance = Singleton.getInstance();

		System.out.println("hashcode of original single ton instance : " + oSingleInstance.hashCode());
		System.out.println("hashcode of duplicate single ton instance : " + dSingleInstance.hashCode());

		// using Reflection
		Class<?> singletonClass = Class.forName("com.gfarm.singleton.Singleton");
		Constructor<Singleton> constructor = (Constructor<Singleton>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);

		Singleton ReflectionSingletonInstance = constructor.newInstance();

		System.out.println("hashcode of original single ton instance : " + oSingleInstance.hashCode());
		System.out.println("hashcode of ReflectionSingletonInstance single ton instance : "
				+ ReflectionSingletonInstance.hashCode());

		// using serialization
		System.out.println("------------------------------------------------");
		System.out.println("breaking singleton pattern using serialization ");

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Serialization.ser"));
		objectOutputStream.writeObject(oSingleInstance);
		objectOutputStream.close();

		// deserialization
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\Serialization.ser"));
		Singleton brokenUsingSerializationSingletonInstance = (Singleton) objectInputStream.readObject();

		System.out.println("hashcode of original single ton instance : " + oSingleInstance.hashCode());
		System.out.println("hashcode of brokenUsingSerializationSingletonInstance single ton instance : "
				+ brokenUsingSerializationSingletonInstance.hashCode());

		// using clone method
		System.out.println("------------------------------------------------");
		System.out.println("breaking singleton pattern using cloning  ");
		
		Singleton brokenSingletonUsingClone = (Singleton) oSingleInstance.clone();
		
		System.out.println("hashcode of original single ton instance : " + oSingleInstance.hashCode());
		System.out.println("hashcode of brokenSingletonUsingClone single ton instance : "
				+ brokenSingletonUsingClone.hashCode());

	}

}
