package Day03.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exercise2 {
    public static void main(String[] args) {

        Class<?> exercise1Class = Exercise1.class;

        String className = exercise1Class.getName();
        System.out.println("Class Name: " + className);

        Constructor<?>[] constructors = exercise1Class.getConstructors();
        System.out.println("Constructors: " + constructors.length);

        Method[] numberOfMethods = exercise1Class.getDeclaredMethods();
        System.out.println("Number Of Methods: " + numberOfMethods);

        for (Method method : numberOfMethods) {
            String methodName = method.getName();
            Class<?> methodReturnType = method.getReturnType();
            System.out.println("Method: " + methodName + ", Method Return Type: " + methodReturnType.getName());
        }

        Field[] fields = exercise1Class.getDeclaredFields();
        System.out.println("Fields numbers: "+fields.length);

        for (Field field : fields) {
            String fieldName = field.getName();
            Class<?> fieldType = field.getType();
            System.out.println("Field: "+ fieldName + "Field Type: "+fieldType);

        }
    }
}
