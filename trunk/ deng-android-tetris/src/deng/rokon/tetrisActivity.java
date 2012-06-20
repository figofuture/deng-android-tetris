package deng.rokon;




import com.stickycoding.rokon.DrawPriority;
import com.stickycoding.rokon.RokonActivity;

public class tetrisActivity extends RokonActivity  {
    /** Called when the activity is first created. */
	
	private static final float GAME_WIDTH = 480f;//getGameWidth();//display.getWidth();// = //480.0f;
    private static final float GAME_HEIGHT = 320f;//getGameHeight();//display.getHeight();//320.0f;
	
    private static final int HORIZONTAL_AMPLITUDE  = 10;
	private static final int COLUM_WIDTH = 20;
	
    private GameScene scene;
    public void onCreate() {
        debugMode();
        forceFullscreen();
        forcePortrait();
        setGameSize(GAME_WIDTH, GAME_HEIGHT);
        setDrawPriority(DrawPriority.PRIORITY_VBO);
        setGraphicsPath("textures/");
        createEngine();
    }
    public void onLoadComplete() {
        Textures.load();
        setScene(scene = new GameScene());
    }
}