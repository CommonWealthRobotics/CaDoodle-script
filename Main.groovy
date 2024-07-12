import com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine
import com.neuronrobotics.bowlerstudio.IStageReceiver

File xml = ScriptingEngine.fileFromGit(
	"https://github.com/CommonWealthRobotics/CaDoodle-script.git", 
	"MainWindow.fxml")
class MainWindow extends javafx.scene.control.Tab implements IStageReceiver{
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