# Proggen
Proggen.txt 
Anil Cevik 
Kim Wotzka
Najbir Omar

Im folgenden sieht man den Code fürs Memory kartenspiel:
Wir haben mit JavaFx gearbeitet.

MAIN KLASSE:
package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;


public class Main extends Application {
	
	StackPane memoMenu = new StackPane();
	StackPane memoTwoPlayer=new StackPane();
	StackPane memoConnection=new StackPane();
	StackPane memoField = new StackPane();
	int counter=0;
	Button test=new Button();
	
	Player player1;
	Player player2;
	MemoryField field;
	Label credits=new Label("Von Anil, Kim, Najbir");
	
	//Items-memoMenu
	Label menuTitle=new Label("Memory kartenspiel");
	Button onePlayer=new Button("Ein Spieler");
	Button twoPlayer=new Button("Zwei Spieler");
	
	//Items-twoPlayer
	Label twoPlayerTitle=new Label("Zwei Spieler");
	TextField namePlayer1, namePlayer2;
	Button startGame;
	
	//Items-memoConnection
	TextField textfieldConnection;
	Label ConnectioTitle=new Label("Verbinde mit einem Spieler");
	Button setIP;
	
	//Items-memoField
	Button[][] cards;
	boolean[][] cardFieldBool;
	boolean[][] fieldBool=new boolean[4][5];
	char[][] mainCards;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			field=new MemoryField();
			mainCards=new char[4][5];
			mainCards=field.getArray();
			Scene sceneMemoMenu = new Scene(memoMenu, 325, 200);
			Scene sceneMemoTwoPlayer=new Scene(memoTwoPlayer, 350,150);
			Scene sceneMemoConnection = new Scene(memoConnection, 335, 248);
			Scene sceneMemoField = new Scene(memoField, 500, 500);
			
			setItems();
			
			
			sceneMemoMenu.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//sceneMemoTwoPlayer.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//sceneMemoConnection.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			
			primaryStage.setScene(sceneMemoMenu);
			primaryStage.setResizable(false);
			primaryStage.show();
			
			onePlayer.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event){
					primaryStage.close();
					cards=new Button[4][5];
					for (int i = 0; i < cards.length; i++) {
						for (int k = 0; k < cards[0].length; k++) {
							cards[i][k] = new Button();
							memoField.getChildren().add(cards[i][k]);
							cards[i][k].setPrefSize(100, 100);
							cards[i][k].setTranslateX((k - 2) * 100);
							cards[i][k].setTranslateY((i - 1) * 100);
							cards[i][k].setFont(new Font("Arial",50));
						}
					}
					cards[0][0].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							if(counter==0){
								char a=mainCards[0][0];
								cards[0][0].setText(a+"");
								counter=1;
								test.setText(cards[0][0].getText());
							}
							else{
								if(test.getText()!=cards[0][0].getText()){
									counter=0;
									cards[0][0].setText("");
									test.setText("");
								}
								else{
									System.out.println("NICEE");
								}
							}
						}
					});
					cards[0][1].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							if(counter==0){
								char a=mainCards[0][1];
								cards[0][1].setText(a+"");
								counter=1;
								test.setText(cards[0][1].getText());
							}
							else{
								if(test.getText()!=cards[0][1].getText()){
									counter=0;
									cards[0][1].setText("");
									test.setText("");
								}
								else{
									System.out.println("NICEE");
								}
							}
						}
					});
					cards[0][2].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							if(counter==0){
								char a=mainCards[0][2];
								cards[0][2].setText(a+"");
								counter=1;
								test.setText(cards[0][2].getText());
							}
							else{
								if(test.getText()!=cards[0][2].getText()){
									counter=0;
									cards[0][2].setText("");
									test.setText("");
								}
								else{
									System.out.println("NICEE");
								}
							}
						}
					});
					cards[0][3].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							if(counter==0){
								char a=mainCards[0][3];
								cards[0][3].setText(a+"");
								counter=1;
								test.setText(cards[0][3].getText());
							}
							else{
								if(test.getText()!=cards[0][3].getText()){
									counter=0;
									cards[0][3].setText("");
									test.setText("");
								}
								else{
									System.out.println("NICEE");
								}
							}
						}
					});
					cards[0][4].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							if(counter==0){
								char a=mainCards[0][4];
								cards[0][4].setText(a+"");
								counter=1;
								test.setText(cards[0][4].getText());
							}
							else{
								if(test.getText()!=cards[0][4].getText()){
									counter=0;
									cards[0][4].setText("");
									test.setText("");
								}
								else{
									System.out.println("NICEE");
								}
							}
						}
					});
					cards[1][0].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							if(counter==0){
								char a=mainCards[1][0];
								cards[1][0].setText(a+"");
								counter=1;
								test.setText(cards[1][0].getText());
							}
							else{
								if(test.getText()!=cards[1][0].getText()){
									counter=0;
									cards[1][0].setText("");
									test.setText("");
								}
								else{
									System.out.println("NICEE");
								}
							}
						}
					});
					cards[1][1].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							if(counter==0){
								char a=mainCards[1][1];
								cards[1][1].setText(a+"");
								counter=1;
								test.setText(cards[1][1].getText());
							}
							if(counter!=0){
								if(test.getText()!=cards[1][1].getText()){
									counter=0;
									cards[1][1].setText("");
									test.setText("");
								}
								else{
									System.out.println("NICEE");
								}
							}
						}
					});
					cards[1][2].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[1][2];
							String a2=""+a;
							cards[1][2].setText(a2);
						}
					});
					cards[1][3].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[1][3];
							String a2=""+a;
							cards[1][3].setText(a2);
						}
					});
					cards[1][4].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[1][4];
							String a2=""+a;
							cards[1][4].setText(a2);
						}
					});
					cards[2][0].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[2][0];
							String a2=""+a;
							cards[2][0].setText(a2);
						}
					});
					cards[2][1].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[2][1];
							String a2=""+a;
							cards[2][1].setText(a2);
						}
					});
					cards[2][2].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[2][2];
							String a2=""+a;
							cards[2][2].setText(a2);
						}
					});
					cards[2][3].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[2][3];
							String a2=""+a;
							cards[2][3].setText(a2);
						}
					});
					cards[2][4].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[2][4];
							String a2=""+a;
							cards[2][4].setText(a2);
						}
					});
					cards[3][0].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[3][0];
							String a2=""+a;
							cards[3][0].setText(a2);
						}
					});
					cards[3][1].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[3][1];
							String a2=""+a;
							cards[3][1].setText(a2);
						}
					});					
					cards[3][2].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[3][2];
							String a2=""+a;
							cards[3][2].setText(a2);
						}
					});
					cards[3][3].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[3][3];
							String a2=""+a;
							cards[3][3].setText(a2);
						}
					});
					cards[3][4].setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							char a=mainCards[3][4];
							String a2=""+a;
							cards[3][4].setText(a2);
						}
					});
					sceneMemoField.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setScene(sceneMemoField);
					primaryStage.setResizable(false);
					primaryStage.show();
				}
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	/**
	 * Das Einfuegen der einzelenen Items beszogen auf der StackPane vom jeweiligen
	 * werden gesetzt.
	 */
	private void setItems(){
		setItemsOnMemoMenu();
		setItemsOnMemoTwoPlayer();
		//setItemsOnMemoConnection();
		//setItemsOnMemoField();
	}
	
	/**
	 * Eigenschaften der Scene von "memoMenu" wird im initialiesiert.
	 */
	private void setItemsOnMemoMenu(){
		//MemoMenu
		credits.setFont(new Font("Arial",10));
		credits.setTranslateX(110);
		credits.setTranslateY(90);
		
		menuTitle.setTranslateX(0);
		menuTitle.setTranslateY(-50);
		menuTitle.setFont(new Font("Arial",30));
		
		onePlayer.setFont(new Font("Arial",20));
		onePlayer.setTranslateX(0);
		onePlayer.setTranslateY(0);
		
		twoPlayer.setFont(new Font("Arial",20));
		twoPlayer.setTranslateX(0);
		twoPlayer.setTranslateY(50);
		
		memoMenu.getChildren().add(menuTitle);
		memoMenu.getChildren().add(onePlayer);
		memoMenu.getChildren().add(twoPlayer);
		memoMenu.getChildren().add(credits);
	}
	
	/**
	 * Eigenschaften der Scene von "memoTwoPlayer" wird im initialiesiert.
	 */
	private void setItemsOnMemoTwoPlayer(){
		Label player1=new Label("Spieler 1:");//namePlayer1-TextFeld
		player1.setFont(new Font("Arial",20));
		player1.setTranslateX(-100);
		player1.setTranslateY(5);
		
		Label player2=new Label("Spieler 2:");//namePlayer2-TextFeld
		player2.setFont(new Font("Arial",20));
		player2.setTranslateX(100);
		player2.setTranslateY(5);
		
		twoPlayerTitle.setFont(new Font("Arial",30));//Titel von Scene 
		twoPlayerTitle.setTranslateX(0);
		twoPlayerTitle.setTranslateY(-50);
		
		namePlayer1 =new TextField();//TextField für Spieler 2
		namePlayer1.setMaxWidth(100);
		namePlayer1.setTranslateX(-100);
		namePlayer1.setTranslateY(35);
		Tooltip name=new Tooltip("Geben Sie ihren Namen hier ein!");
		namePlayer1.setTooltip(name);
		
		namePlayer2 =new TextField();//TextField für Spieler 2
		namePlayer2.setMaxWidth(100);
		namePlayer2.setTranslateX(100);
		namePlayer2.setTranslateY(35);
		namePlayer2.setTooltip(name);
		
		startGame=new Button("Start");
		startGame.setFont(new Font("Arial",15));
		startGame.setTranslateX(0);
		startGame.setTranslateY(0);
		
		memoTwoPlayer.getChildren().add(player1);
		memoTwoPlayer.getChildren().add(player2);
		memoTwoPlayer.getChildren().add(twoPlayerTitle);
		memoTwoPlayer.getChildren().add(namePlayer1);
		memoTwoPlayer.getChildren().add(namePlayer2);
		memoTwoPlayer.getChildren().add(startGame);
	}
	
	/**
	 * Wenn das gesamte Feld aufgedeckt wurde, dann soll True zurückgegeben werden, um
	 * den Sieger zu bestimmen.
	 * @return True=Feld komplett aufgedeckt.
	 */
	private boolean fieldBoolTrue(){
		for(int i=0;i<fieldBool.length;i++){
			for(int j=0;j<fieldBool[0].length;j++){
				if(!fieldBool[i][j]){
					return false;
				}
			}
			
		}
		return true;
	}
}

-----------------------------------------------------------------
MemoryField Klasse:
package application;

public class MemoryField {
	final int cardsLength=10;
	final char[][] charArray=new char[4][5]; 
	final boolean[][] boolArray=new boolean[4][5];
	String randomString="";
	
	public MemoryField (){
		randomString=randomString2();
		Matchfield();
		show();
		
	}
	/**
	 * Die Methode "randomString()" Erstellt ein String aus unterschiedlichen kleinen Buchstaben.
	 * @return String =randomString
	 */
	public String randomString(){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<cardsLength;i++){
			sb.append((char)((int)(Math.random()*26)+97)); 
		}
		return sb.toString();
	}
	
	/**
	 * Falls die Methode "randomString()" ein String mit mehreren gleichen Chars erstellt,
	 * dann wird in "randomString2" dafuer gesorgt, dass es keine gleichen chars gibt.
	 * Ein neues String wird solange neu erzeugt, bis keine chars vorhanden sind, die gleich 
	 * vorkommen.
	 * @return String=randomString
	 */
	public String randomString2(){
		String x=randomString();
		boolean y=false;
		for(int i=0;i<x.length();i++){
			for(int j=i+1;j<x.length();j++){
				if(x.charAt(i)==x.charAt(j) && !y){
					x=randomString();
					y=true;
				}
				if(y){
					i=0;
					j=0;
					y=false;
				}
			}
		}
		if(!y){
			return x;
		}
		return x;
	}
	
	public char[][] getArray(){
		return charArray;
	}
	//ZEIGT DAS FELD AN später löschen!!!!!!!!!
	public void show(){
		for(int i=0;i<charArray.length;i++){
			for(int j=0;j<charArray[0].length;j++){
				System.out.print(charArray[i][j]+"|");
			}
			System.out.println();
		}
	}
	
	/**
	 * Die Methode erstellt das Char-Feld für Das Memory Spiel.
	 * Die Methode ist abhängig von der methode "random_String2()", da sie die vorraussetztung ist, 
	 * um die werte ins Feld einzuspeichern.
	 */
	public void Matchfield(){
		int rand1=(int)(Math.random() *4); //randomWert das hoechstens von 0-3 werte annhemen kann
		int rand2=(int)(Math.random() *5); //randomWert das hoechstens von 0-4 werte annhemen kann
		int index=0; //Lauf Index fuer ranom_zeichenfolge 
		while(!allTrue()){//Solang alle Werte nicht belegt sind machen folgendes:
			//wir pruefen, ob an der stelle rand1 und rand2 von boolArray kein wert belegt ist, wenn WAHR dann:
			if(!boolArray[rand1][rand2] ){
				//Ein Char an der stelle des Index von randomString wird ins Feld gespeichert.
				charArray[rand1][rand2]=randomString.charAt(index);
				//Belegung auf True setzen
				boolArray[rand1][rand2]=true;
				//neue werte werden gesetzt
				rand1=(int)(Math.random() *4);
				rand2=(int)(Math.random() *5);
				//index wird angepasst, falls das array die grenze überschritten hat, soll wieder auf 0 gesetzt werden 
				//und von vorn anfangen, andernfalls soll erhoet werden.
				if(index>=9){
					index=0;
				}
				else{
					index++;
				}
			}else{
				//Wenn die gegebene Stelle belegt ist, werden neue werte erstellt.
				rand1=(int)(Math.random() *4);
				rand2=(int)(Math.random() *5);
			}
		}
	}

	/**
	 * Eine Methode, um zu pruefen, ob alle Werte bzw. alle Chars ins Feld eingespeichert worde,
	 * wenn JA, dann soll True zurück gegeben werden.
	 * @return True = Wenn alles Belegt wurde im Feld
	 */
	public boolean allTrue(){
		for(int i=0;i<boolArray.length;i++){
			for(int j=0;j<boolArray[0].length;j++){
				if(!boolArray[i][j]){
					return false;
				}
			}
			
		}
		return true;
	}
	
	/**
	 * Eine ueberpruefung, ob an der Stelle vom Parameter a und Parameter b, keine Belegung festgestellt wurde. 
	 * @param a = rand1 vom Matchfield
	 * @param b = rand2 vom Matchfield
	 * @return True = Wenn an der Stelle a und b, keine Belegte Stelle ist.
	 */
	public boolean leeresFeld(int a, int b){
		if(boolArray[a][b]==false){
			return true;
		}
		else{return false;}
	}
	
}

---------------------------------------------------------------------
Player Klasse:

package application;

public class Player {
	
	String name;
	boolean turn;
	int points;
	
	/**
	 * Der Spieler Name wird festgehalten und ob er am Zug ist.
	 * 
	 * @param playerName=Spieler Name
	 * @param isTurn=Wenn der Spieler dran ist, dann ist Wahr
	 */
	public Player(String playerName, boolean isTurn){
		turn=isTurn;
		name=playerName;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}
	/**
	 * Die derzeitig erhaltenen Punkte, werden gesetzt.
	 */
	public void setPoint(){
		points++;
	}
	public int getPoints(){
		return points;
	}

}
