# Singleton Pattern
##Details
### Issues
- Multiple classes require the same object instance
- There can **only be one** object for the entire application
- It must be guaranteed that there is only one object
### Examples
- One FileSystem, Windows Manager, Data base pool connection
##Consequences
###Benefits
- Configure the number of intances you need
###Drawbacks
- State of the singleton must be shareable between program executions