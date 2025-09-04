module com.example.cst8412_1lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cst8412lab1 to javafx.fxml;
    exports com.example.cst8412lab1;
}