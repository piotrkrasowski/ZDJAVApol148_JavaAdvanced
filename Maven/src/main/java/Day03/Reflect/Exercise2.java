package Day03.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exercise2 {
    public static void main(String[] args) {

        Class<Exercise1> exercise1Class = Exercise1.class;

        String className = exercise1Class.getName();
        System.out.println("Class Name: " + className);

        Constructor<Exercise1>[] constructors = (Constructor<Exercise1>[]) exercise1Class.getConstructors();
        System.out.println("Constructors: " + constructors.length);

        Method[] numberOfMethods = exercise1Class.getDeclaredMethods();
        System.out.println("Methods: " + numberOfMethods);

        for (Method method : numberOfMethods) {
            String methodName = method.getName();
            Class<Exercise1> methodReturnType = (Class<Exercise1>) method.getReturnType();
            System.out.println("Method: " + methodName + ", Method Return Type: " + methodReturnType.getName());
        }

        Field[] fields = exercise1Class.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            Class<Exercise1> fieldType = (Class<Exercise1>) field.getType();
            System.out.println("Field: "+ fieldName + "Field Type: "+fieldType);

        }
    }
}
