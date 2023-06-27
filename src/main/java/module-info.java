module alexis.cefim_javafx_tp {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;


    exports alexis.cefim_javafx_tp.controller;
    opens alexis.cefim_javafx_tp.controller to javafx.fxml;
    exports alexis.cefim_javafx_tp;
    opens alexis.cefim_javafx_tp to javafx.fxml;
}