class DriveTrain extends Constant{
  RobotContainer robotContainer = new RobotContainer();

  public DriveTrain(){
    robotContainer.initMotors();
  }
  
  void runDriveTrain(){
    System.out.println("DriveTrain is running at power: " + motorPower);
  }
}
