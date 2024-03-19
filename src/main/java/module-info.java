module org.example.project_u_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.project_u_2 to javafx.fxml;
    exports org.example.project_u_2;
}