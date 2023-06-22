package com.stackroute.commonjavaclasses;

public class WrapperClassConvert {

    public Object convertToWrapper(Object object) {
        if (object == null || !isPrimitive(object)) {
            return "Give proper primitive type as input";
        }
        
        String type = object.getClass().getSimpleName();
        
        switch (type) {
            case "Integer":
            case "int":
                return Integer.valueOf(object.toString());
            case "Boolean":
            case "boolean":
                return Boolean.valueOf(object.toString());
            case "Character":
            case "char":
                return Character.valueOf(object.toString().charAt(0));
            case "Byte":
            case "byte":
                return Byte.valueOf(object.toString());
            case "Short":
            case "short":
                return Short.valueOf(object.toString());
            case "Long":
            case "long":
                return Long.valueOf(object.toString());
            case "Double":
            case "double":
                return Double.valueOf(object.toString());
            case "Float":
            case "float":
                return Float.valueOf(object.toString());
            default:
                return null;
        }
    }
    
    private boolean isPrimitive(Object object) {
        return object instanceof Integer ||
                object instanceof Boolean ||
                object instanceof Character ||
                object instanceof Byte ||
                object instanceof Short ||
                object instanceof Long ||
                object instanceof Double ||
                object instanceof Float ||
                object.getClass().getSimpleName().equals("int") ||
                object.getClass().getSimpleName().equals("boolean") ||
                object.getClass().getSimpleName().equals("char") ||
                object.getClass().getSimpleName().equals("byte") ||
                object.getClass().getSimpleName().equals("short") ||
                object.getClass().getSimpleName().equals("long") ||
                object.getClass().getSimpleName().equals("double") ||
                object.getClass().getSimpleName().equals("float");
    }
}
