module com.dtn.qlvexe {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dtn.qlvexe to javafx.fxml;
    exports com.dtn.qlvexe;
}
