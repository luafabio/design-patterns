# Factory Method

## Intent
Define an **interface** for **creating an object** but let subclasses decide whitch class to instantiate. Factory Method lets a Class **defer instantiation** to **subclasses**

## Known As
Virtual Constructor

## When
- Class can't expect the type of object it must create
- Subclasses must decide what types of objects are created

## Benefits
- Delegate object creation
- Hooks for subclasses
- Base class can provide default implementation

##Conclusion
- Delegate object creation at runtime
- Don't know what type of class you need to create