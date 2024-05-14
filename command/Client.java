
class Client {
	public static void main(String[] args) {
		LightReceiver lr = new LightReceiver();
		
		LightOnCommand loc = new LightOnCommand();
		loc.setLight(lr);
		
		LightOffCommand lofc = new LightOffCommand();
		lofc.setLight(lr);
		
		RemoteController rc = new RemoteController();
				
		rc.setCommand(1, loc, lofc);
		
		rc.onButtonWasPushed(1);
		rc.offButtonWasPushed(1);
		rc.undoButtonWasPushed();
	}
}
