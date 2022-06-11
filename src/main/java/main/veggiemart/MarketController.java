package main.veggiemart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;

public class MarketController extends Sayur {
    @FXML
    private Label labelBawang;
    @FXML
    private Label labelBrokoli;
    @FXML
    private Label labelJagung;
    @FXML
    private Label labelKubis;
    @FXML
    private Label labelPaprika;
    @FXML
    private Label labelTerong;
    @FXML
    private Label labelTomat;
    @FXML
    private Label labelWortel;
    @FXML
    private Label quantityBawang;
    @FXML
    private Label quantityBrokoli;
    @FXML
    private Label quantityJagung;
    @FXML
    private Label quantityKubis;
    @FXML
    private Label quantityPaprika;
    @FXML
    private Label quantityTerong;
    @FXML
    private Label quantityTomat;
    @FXML
    private Label quantityWortel;
    @FXML
    private Label totalHarga;

    @FXML
    void addBawang(ActionEvent event) {
        this.setQtyBawang(1);
        this.tambahHargaTotalBawang();
        this.quantityBawang.setText(Integer.toString(this.getQtyBawang()));
        this.labelBawang.setText("Rp" + this.getHargaTotalBawang());
        this.refreshTotalHarga();
    }
    @FXML
    void addBrokoli(ActionEvent event) {
        this.setQtyBrokoli(1);
        this.tambahHargaTotalBrokoli();
        this.quantityBrokoli.setText(Integer.toString(this.getQtyBrokoli()));
        this.labelBrokoli.setText("Rp" + this.getHargaTotalBrokoli());
        this.refreshTotalHarga();
    }
    @FXML
    void addJagung(ActionEvent event) {
        this.setQtyJagung(1);
        this.tambahHargaTotalJagung();
        this.quantityJagung.setText(Integer.toString(this.getQtyJagung()));
        this.labelJagung.setText("Rp" + this.getHargaTotalJagung());
        this.refreshTotalHarga();
    }
    @FXML
    void addKubis(ActionEvent event) {
        this.setQtyKubis(1);
        this.tambahHargaTotalKubis();
        this.quantityKubis.setText(Integer.toString(this.getQtyKubis()));
        this.labelKubis.setText("Rp" + this.getHargaTotalKubis());
        this.refreshTotalHarga();
    }
    @FXML
    void addPaprika(ActionEvent event) {
        this.setQtyPaprika(1);
        this.tambahHargaTotalPaprika();
        this.quantityPaprika.setText(Integer.toString(this.getQtyPaprika()));
        this.labelPaprika.setText("Rp" + this.getHargaTotalPaprika());
        this.refreshTotalHarga();
    }
    @FXML
    void addTerong(ActionEvent event) {
        this.setQtyTerong(1);
        this.tambahHargaTotalTerong();
        this.quantityTerong.setText(Integer.toString(this.getQtyTerong()));
        this.labelTerong.setText("Rp" + this.getHargaTotalTerong());
        this.refreshTotalHarga();
    }
    @FXML
    void addTomat(ActionEvent event) {
        this.setQtyTomat(1);
        this.tambahHargaTotalTomat();
        this.quantityTomat.setText(Integer.toString(this.getQtyTomat()));
        this.labelTomat.setText("Rp" + this.getHargaTotalTomat());
        this.refreshTotalHarga();
    }
    @FXML
    void addWortel(ActionEvent event) {
        this.setQtyWortel(1);
        this.tambahHargaTotalWortel();
        this.quantityWortel.setText(Integer.toString(this.getQtyWortel()));
        this.labelWortel.setText("Rp" + this.getHargaTotalWortel());
        this.refreshTotalHarga();
    }
    void setQuantityNol() {
        this.setQtyTomat(-this.getQtyTomat());
        this.kosongTotalHargaTomat();
        this.quantityTomat.setText(Integer.toString(this.getQtyTomat()));
        this.labelTomat.setText("Rp" + this.getHargaTotalTomat());
        this.setQtyBrokoli(-this.getQtyBrokoli());
        this.kosongTotalHargaBrokoli();
        this.quantityBrokoli.setText(Integer.toString(this.getQtyBrokoli()));
        this.labelBrokoli.setText("Rp" + this.getHargaTotalBrokoli());
        this.setQtyWortel(-this.getQtyWortel());
        this.kosongTotalHargaWortel();
        this.quantityWortel.setText(Integer.toString(this.getQtyWortel()));
        this.labelWortel.setText("Rp" + this.getHargaTotalWortel());
        this.setQtyKubis(-this.getQtyKubis());
        this.kosongTotalHargaKubis();
        this.quantityKubis.setText(Integer.toString(this.getQtyKubis()));
        this.labelKubis.setText("Rp" + this.getHargaTotalKubis());
        this.setQtyJagung(-this.getQtyJagung());
        this.kosongTotalHargaJagung();
        this.quantityJagung.setText(Integer.toString(this.getQtyJagung()));
        this.labelJagung.setText("Rp" + this.getHargaTotalJagung());
        this.setQtyTerong(-this.getQtyTerong());
        this.kosongTotalHargaTerong();
        this.quantityTerong.setText(Integer.toString(this.getQtyTerong()));
        this.labelTerong.setText("Rp" + this.getHargaTotalTerong());
        this.setQtyPaprika(-this.getQtyPaprika());
        this.kosongTotalHargaPaprika();
        this.quantityPaprika.setText(Integer.toString(this.getQtyPaprika()));
        this.labelPaprika.setText("Rp" + this.getHargaTotalPaprika());
        this.setQtyBawang(-this.getQtyBawang());
        this.kosongTotalHargaBawang();
        this.quantityBawang.setText(Integer.toString(this.getQtyBawang()));
        this.labelBawang.setText("Rp" + this.getHargaTotalBawang());
        this.refreshTotalHarga();
    }
    @FXML
    void checkOutButton(ActionEvent event) {
        Alert alert;
        if (this.getQtyTomat() + this.getQtyBrokoli() + this.getQtyWortel() + this.getQtyKubis() + this.getQtyJagung() + this.getQtyTerong() + this.getQtyPaprika() + this.getQtyBawang() == 0) {
            alert = new Alert(AlertType.NONE, "Keranjang Anda masih kosong!", ButtonType.OK);
            alert.show();
        } else {
            alert = new Alert(AlertType.NONE, "Silakan tunggu pesanan Anda~", ButtonType.OK);
            alert.show();
            this.setQuantityNol();
        }

    }
    @FXML
    void clearKeranjangButton(ActionEvent event) {
        Alert alert;
        if (this.getQtyTomat() + this.getQtyBrokoli() + this.getQtyWortel() + this.getQtyKubis() + this.getQtyJagung() + this.getQtyTerong() + this.getQtyPaprika() + this.getQtyBawang() == 0) {
            alert = new Alert(AlertType.NONE, "Keranjang Anda masih kosong!", ButtonType.OK);
            alert.show();
        } else {
            alert = new Alert(AlertType.NONE, "Keranjang Anda telah dikosongkan.", ButtonType.OK);
            alert.show();
            this.setQuantityNol();
        }

    }
    @FXML
    void removeBawang(ActionEvent event) {
        if (this.getQtyBawang() > 0) {
            this.setQtyBawang(-1);
            this.kurangHargaTotalBawang();
            this.quantityBawang.setText(Integer.toString(this.getQtyBawang()));
            this.labelBawang.setText("Rp" + this.getHargaTotalBawang());
            this.refreshTotalHarga();
        }

    }
    @FXML
    void removeBrokoli(ActionEvent event) {
        if (this.getQtyBrokoli() > 0) {
            this.setQtyBrokoli(-1);
            this.kurangHargaTotalBrokoli();
            this.quantityBrokoli.setText(Integer.toString(this.getQtyBrokoli()));
            this.labelBrokoli.setText("Rp" + this.getHargaTotalBrokoli());
            this.refreshTotalHarga();
        }

    }
    @FXML
    void removeJagung(ActionEvent event) {
        if (this.getQtyJagung() > 0) {
            this.setQtyJagung(-1);
            this.kurangHargaTotalJagung();
            this.quantityJagung.setText(Integer.toString(this.getQtyJagung()));
            this.labelJagung.setText("Rp" + this.getHargaTotalJagung());
            this.refreshTotalHarga();
        }

    }
    @FXML
    void removeKubis(ActionEvent event) {
        if (this.getQtyKubis() > 0) {
            this.setQtyKubis(-1);
            this.kurangHargaTotalKubis();
            this.quantityKubis.setText(Integer.toString(this.getQtyKubis()));
            this.labelKubis.setText("Rp" + this.getHargaTotalKubis());
            this.refreshTotalHarga();
        }

    }
    @FXML
    void removePaprika(ActionEvent event) {
        if (this.getQtyPaprika() > 0) {
            this.setQtyPaprika(-1);
            this.kurangHargaTotalPaprika();
            this.quantityPaprika.setText(Integer.toString(this.getQtyPaprika()));
            this.labelPaprika.setText("Rp" + this.getHargaTotalPaprika());
            this.refreshTotalHarga();
        }

    }
    @FXML
    void removeTerong(ActionEvent event) {
        if (this.getQtyTerong() > 0) {
            this.setQtyTerong(-1);
            this.kurangHargaTotalTerong();
            this.quantityTerong.setText(Integer.toString(this.getQtyTerong()));
            this.labelTerong.setText("Rp" + this.getHargaTotalTerong());
            this.refreshTotalHarga();
        }

    }
    @FXML
    void removeTomat(ActionEvent event) {
        if (this.getQtyTomat() > 0) {
            this.setQtyTomat(-1);
            this.kurangHargaTotalTomat();
            this.quantityTomat.setText(Integer.toString(this.getQtyTomat()));
            this.labelTomat.setText("Rp" + this.getHargaTotalTomat());
            this.refreshTotalHarga();
        }

    }
    @FXML
    void removeWortel(ActionEvent event) {
        if (this.getQtyWortel() > 0) {
            this.setQtyWortel(-1);
            this.kurangHargaTotalWortel();
            this.quantityWortel.setText(Integer.toString(this.getQtyWortel()));
            this.labelWortel.setText("Rp" + this.getHargaTotalWortel());
            this.refreshTotalHarga();
        }

    }
    void refreshTotalHarga() {
        this.totalHarga.setText("Rp" + (this.getHargaTotalTomat() + this.getHargaTotalBrokoli() + this.getHargaTotalWortel() + this.getHargaTotalKubis() + this.getHargaTotalJagung() + this.getHargaTotalTerong() + this.getHargaTotalPaprika() + this.getHargaTotalBawang()));
    }
}