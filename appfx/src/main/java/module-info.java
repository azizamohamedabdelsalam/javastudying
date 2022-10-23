module com.azizaabdelsalam.appfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.azizaabdelsalam.appfx to javafx.fxml;
    exports com.azizaabdelsalam.appfx;
}