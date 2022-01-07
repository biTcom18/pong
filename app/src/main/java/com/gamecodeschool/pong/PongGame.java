
package com.gamecodeschool.pong;


import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.graphics.Paint;

public class PongGame extends SurfaceView {

    // Are we debugging?
    private final boolean DEBUGGING = true;

    // These objects are needed to do the drawing
    private SurfaceHolder mOurHolder;
    private Canvas mCanvas;
    private Paint mPaint;

    // How many frames per second did we get?
    private long mFPS;
    // The number of milliseconds in a second
    private  final int MILLIS_IN_SECOND = 1000;
    // Holds the resolution of the screen
    private  int mScreenX;
    private int mScreenY;
    // How big will the text be?
    private int mFontSize;
    private int mFontMargin;
    // The game objects
    private Bat mBat;
    private Ball mBall;
    // The current score and lives remaining
    private  int mScore;
    private int mLives;

    // The PongGame constructor
    // Called when this line:
    // mPongGame = new PongGame(this, size.x, size.y);
    // is executed from PongActivity
    public PongGame(Context context, int x, int y){
        // Super ... calls the parent class
        // constructor of SurfaceView
        // provided by Android
        super(context);
        // Initialize these two members/fields
        // With the values passed in as parameters
        mScreenX = x;
        mScreenY = y;
        // Font is 5% (1/20th) of screen width
        mFontSize = mScreenX/20;
        // Margin is 1.5% (1/75) of screen width
        mFontMargin = mScreenX/75;
        // Initialize the objects
        // ready for drawing with
        // getHolder is a method of SurfaceView
        mOurHolder = getHolder();
        mPaint = new Paint();
        // Initialize the bat and ball

        // Everything is ready to start the game
        startNewGame();

    }
    // The player has just lost
    // or starting their first game
    private void startNewGame(){
        // Put the ball back to the starting position

        // Reset the score and the player's chances
        mScore = 0;
        mLives = 3;

    }
}
