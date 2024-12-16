module javafx1 {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens gui to javafx.fxml;
	exports gui;

	
	opens application to javafx.graphics, javafx.fxml;
}
