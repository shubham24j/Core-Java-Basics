public class A11_WrapperClass {

    public static void main(String[] args) {

        // Primitive Variable
        int primitiveNum = 10;  // Primitive variable

        // Wrapper Class Object (Boxing)
        Integer integerObj = Integer.valueOf(primitiveNum); // Boxing (Converting primitive to object)
        
        // AutoBoxing (Automatic conversion of primitive to object)
        Integer autoBoxedObj = primitiveNum;  // AutoBoxing (automatic conversion)

        System.out.println("\nBoxed integerObj: " + integerObj);  // Printing boxed value of integerObj
        System.out.println("AutoBoxed autoBoxedObj: " + autoBoxedObj);  // Printing AutoBoxed value of autoBoxedObj

        // Modifying the value of integerObj
        integerObj = 1000;
        System.out.println("Modified integerObj: " + integerObj);  // Printing modified value of integerObj

        // Unboxing (Converting object back to primitive)
        int unboxedPrimitive = integerObj.intValue(); // Explicit Unboxing
        int autoUnboxedPrimitive = integerObj;  // Auto-Unboxing (Automatically converts Integer to int)
        
        System.out.println("Unboxed unboxedPrimitive: " + unboxedPrimitive);  // Printing unboxed value of unboxedPrimitive
        System.out.println("Auto-Unboxed autoUnboxedPrimitive: " + autoUnboxedPrimitive);  // Printing auto-unboxed value of autoUnboxedPrimitive

        // Converting String to int
        String stringValue = "400";
        int parsedInt = Integer.parseInt(stringValue);  // Converting string "400" to int
        System.out.println("Converted string to int: " + parsedInt);
    }
}
