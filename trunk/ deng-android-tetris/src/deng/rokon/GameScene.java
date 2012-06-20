package deng.rokon;


import com.stickycoding.rokon.Point;
import com.stickycoding.rokon.Polygon;
import com.stickycoding.rokon.PolygonSprite;
import com.stickycoding.rokon.Scene;
import com.stickycoding.rokon.Sprite;
import com.stickycoding.rokon.background.FixedBackground;

public class GameScene extends Scene {

	private FixedBackground background;
	private float x=10f,y=10f;
	private Sprite box1;
	private float mBoxSize =10;// tetrisActivity.getGameWidth()/10;

	private Point p0 = new Point(0.0f,0.0f);
	private Point p1 = new Point(1.0f,0.0f);
	private Point p2 = new Point(2.0f,0.0f);
	private Point p3 = new Point(3.0f,0.0f);
	
	private Point p4 = new Point(0.0f,1.0f);
	private Point p5 = new Point(1.0f,1.0f);
	private Point p6 = new Point(2.0f,1.0f);
	private Point p7 = new Point(3.0f,1.0f);
	
	private Point p8 = new Point(0.0f,2.0f);
	private Point p9 = new Point(1.0f,2.0f);
	private Point p10 = new Point(2.0f,2.0f);
	private Point p11 = new Point(3.0f,2.0f);

	private Point[] arrayPoint_Triangle={p2,p6,p5,p1,p7,p11,p9,p5};//{p1,p2,p6,p7,p11,p8,p4,p5};
	private Point[] arrayPoint_Strip={p4,p7,p11,p8};
	private Point[] arrayPoint_Turn={p0,p8,p11,p7,p5,p1};
	private Point[] arrayPoint_Stone={p0,p2,p10,p8};
	
	private Polygon polygon_Triangle = new Polygon(arrayPoint_Triangle);
	private Polygon polygon_Strip = new Polygon(arrayPoint_Strip);
	private Polygon polygon_Turn = new Polygon(arrayPoint_Turn);
	private Polygon polygon_Stone = new Polygon(arrayPoint_Stone);
	
	private PolygonSprite brick_Triangle,brick_Strip,brick_Turn,brick_Stone;
	
	
	
	public GameScene() {
		super();
		// Create a fixed background (ie a non-changing background) with the texture loaded in Textures.load().
		setBackground(background = new FixedBackground(Textures.background));
		brick_Triangle = new PolygonSprite(polygon_Triangle,tetrisActivity.getGameWidth()/2,20.0f,mBoxSize,mBoxSize);
		brick_Strip = new PolygonSprite(polygon_Strip,tetrisActivity.getGameWidth()/2,60.0f,mBoxSize,mBoxSize);
		brick_Turn = new PolygonSprite(polygon_Turn,tetrisActivity.getGameWidth()/2,120.0f,mBoxSize,mBoxSize);
		brick_Stone = new PolygonSprite(polygon_Stone,tetrisActivity.getGameWidth()/2,160.0f,mBoxSize,mBoxSize);

		add(brick_Triangle);
		add(brick_Strip);
		add(brick_Turn);
		add(brick_Stone);
		
		polygon_Triangle.complete();
		polygon_Strip.complete();
		polygon_Turn.complete();
		polygon_Stone.complete();
	}


	@Override
	public void onGameLoop() {
		// This is the game loop that is called once every frame.
	}

	@Override
	public void onPause() {
		// This is called when the game is hidden. (ie when the user switches to another app without turning this one off)
		// (this should be used to pause the game logic so the user doesn't miss anything while he/she's gone)
	}

	@Override
	public void onResume() {
		// And when the user return to this app.
	}

	@Override
	public void onReady() {
		// This is called when the scene has been successfully created and is ready to be used.
	}

}
