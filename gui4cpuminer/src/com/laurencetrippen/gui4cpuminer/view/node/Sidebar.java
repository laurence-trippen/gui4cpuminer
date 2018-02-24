package com.laurencetrippen.gui4cpuminer.view.node;

import com.laurencetrippen.gui4cpuminer.model.Resources;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Sidebar extends Pane {
	
	private boolean hide = true;
	private boolean dashboardIsActive = true;
	private boolean settingsIsActive = false;
	private Button dashboardButton;
	private Button settingsButton;
	private ScrollPane configPane;
	private ImageView imageView;
	
	public Sidebar(ScrollPane configPane) {
		this.configPane = configPane;
		this.initNode();
		this.defineNode();
	}
	
	private void initNode() {
		this.dashboardButton = new Button("Dashboard");
		this.settingsButton = new Button("Settings");
		this.imageView = new ImageView();
	}
	
	private void defineNode() {
		this.getStyleClass().add("ui-sidebar");
		this.setPrefWidth(200);
		
		AnchorPane.setBottomAnchor(this, 0.0);
		AnchorPane.setLeftAnchor(this, 0.0);
		AnchorPane.setTopAnchor(this, 0.0);
		
		this.imageView.setLayoutX(68);
		this.imageView.setLayoutY(40);
		this.imageView.setImage(new Image(getClass().getResourceAsStream(Resources.PICKAXE_PNG)));

		this.dashboardButton.setLayoutY(148);
		this.dashboardButton.setPrefSize(200, 50);
		this.dashboardButton.getStyleClass().add("ui-sidebar-button");
		this.dashboardButton.getStyleClass().add("ui-sidebar-button-active");
		this.dashboardButton.setAlignment(Pos.BASELINE_LEFT);
		this.dashboardButton.setOnAction(this::onDashboardButtonClick);
		
		this.settingsButton.setLayoutY(198);
		this.settingsButton.setPrefSize(200, 50);
		this.settingsButton.getStyleClass().add("ui-sidebar-button");
		this.settingsButton.setAlignment(Pos.BASELINE_LEFT);
		this.settingsButton.setOnAction(this::onSettingsButtonClick);
		
		ObservableList<Node> sidebarChilds = this.getChildren();
		sidebarChilds.add(dashboardButton);
		sidebarChilds.add(settingsButton);
		sidebarChilds.add(imageView);
	}
	
	private void onDashboardButtonClick(ActionEvent event) {
		if (settingsIsActive) {
			this.settingsButton.getStyleClass().remove("ui-sidebar-button-active");
			this.dashboardButton.getStyleClass().add("ui-sidebar-button-active");
			this.settingsIsActive = false;
			this.dashboardIsActive = true;
			
			if (!hide) {
				Timeline timeline = new Timeline();
				KeyFrame kf = new KeyFrame(Duration.millis(500), new KeyValue(configPane.translateXProperty(), -824));
				timeline.getKeyFrames().add(kf);
				timeline.play();
				hide = true;
			}
		}
	}
	
	private void onSettingsButtonClick(ActionEvent event) {
		if (dashboardIsActive) {
			this.settingsButton.getStyleClass().add("ui-sidebar-button-active");
			this.dashboardButton.getStyleClass().remove("ui-sidebar-button-active");
			this.settingsIsActive = true;
			this.dashboardIsActive = false;
			
			if (hide) {					
				Timeline timeline = new Timeline();
				KeyFrame kf = new KeyFrame(Duration.millis(500), new KeyValue(configPane.translateXProperty(), +824));
				timeline.getKeyFrames().add(kf);
				timeline.play();
				hide = false;
			} else {
				Timeline timeline = new Timeline();
				KeyFrame kf = new KeyFrame(Duration.millis(500), new KeyValue(configPane.translateXProperty(), -824));
				timeline.getKeyFrames().add(kf);
				timeline.play();
				hide = true;
			}
		}
	}
}