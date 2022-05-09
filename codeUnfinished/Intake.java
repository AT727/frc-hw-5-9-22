class Intake extends Constant{
  RobotContainer robotContainer = new RobotContainer();

  public Intake(){
    robotContainer.initIntake();
  }
  
  void runIntake(){
    System.out.println("Intake is running at power: " + intakePower);
  }
}
