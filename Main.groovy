
File xml = com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine.fileFromGit(
	"https://github.com/CommonWealthRobotics/CaDoodle-script.git", 
	"MainWindow.fxml")
File icon = com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine.fileFromGit(
	"https://github.com/CommonWealthRobotics/CaDoodle-script.git", 
	"SourceIcon.png")

class MainWindow extends javafx.scene.control.Tab implements com.neuronrobotics.bowlerstudio.IStageReceiver{
	void receiveStage(javafx.stage.Stage stage,javafx.scene.Scene scene) {
		println "Cadoodle recived stage";
	}
}
javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(xml.toURI().toURL());
javafx.scene.layout.Pane newLoadedPane =  loader.load();
// Create a tab
MainWindow myTab = new MainWindow();
//set the title of the new tab
myTab.setContent(newLoadedPane);
return myTab;