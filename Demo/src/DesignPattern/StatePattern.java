package DesignPattern;

interface MobileAlertState 
{
    public void alert(AlertStateContext ctx);
}
  

class Vibration implements MobileAlertState 
{
  @Override
  public void alert(AlertStateContext ctx) 
  {
       System.out.println("vibration...");
  }

}

class Silent implements MobileAlertState
{
  @Override
  public void alert(AlertStateContext ctx) 
  {
      System.out.println("silent...");
  }

}

class AlertStateContext 
{
    private MobileAlertState currentState;
  
    public AlertStateContext() 
    {
        currentState = new Vibration();
    }
  
    public void setState(MobileAlertState state) 
    {
        currentState = state;
    }
  
    public void alert() 
    {
        currentState.alert(this);
    }
}

  
class StatePattern 
{
    public static void main(String[] args) 
    {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();        
    }
}

//
//
//In the State design pattern, an object’s behavior is the result of the function of its state, 
//and the behavior gets changed at runtime depending on the state. 
//This removes the dependency on the if/else or switch/case conditional logic.
//
//Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
//
//
//A state machine can be thought of as something that has:
//
//    an initial state
//    some inputs that can change the state
//    possible outputs that occur as a result of that change
//    new states that may arise as a result of those inputs
//    a possible final state.
//
//Use the State pattern when you have an object that behaves differently depending on its current state, 
//the number of states is enormous,
//and the state-specific code changes frequently.
//
//
//
//Use State when you have a lot of duplicate code across similar states and transitions of a condition-based state machine.
//
//
//
//Single Responsibility Principle. Organize the code related to particular states into separate classes.
//Open/Closed Principle. Introduce new states without changing existing state classes or the context.
//Simplify the code of the context by eliminating bulky state machine conditionals.


//  say parsing>initilizing>executing>reportcollection




