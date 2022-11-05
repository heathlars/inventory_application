module wargaapplication.hwinventorysystemmain {
    requires javafx.controls;
    requires javafx.fxml;


    opens wargaapplication.hwinventorysystemmain to javafx.fxml;
    exports wargaapplication.hwinventorysystemmain;
}