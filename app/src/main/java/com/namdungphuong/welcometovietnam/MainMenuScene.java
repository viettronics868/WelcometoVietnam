package com.namdungphuong.welcometovietnam;

/**
 * Created by khidot on 1/12/2016.
 */

import android.content.Intent;

import org.andengine.engine.camera.Camera;
import org.andengine.entity.scene.menu.MenuScene;
import org.andengine.entity.scene.menu.MenuScene.IOnMenuItemClickListener;
import org.andengine.entity.scene.menu.item.IMenuItem;
import org.andengine.entity.scene.menu.item.SpriteMenuItem;
import org.andengine.entity.scene.menu.item.decorator.ScaleMenuItemDecorator;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.util.GLState;

//import com.ivoid.bj.Dealer;
//import com.khoanam.bubbleshoot.bubble.shooter.BubbleShootActivity;
//import com.khoanam.bubbleshoot.bubble.shooter.StartMenu;
import com.khoanam.bubbleshoot.bubble.shooter.BubbleShootActivity;
import com.khoanam.bubbleshoot.bubble.shooter.StartMenu;
import com.khoanam.youtubevideowall.FullscreenDemoActivity;
import com.khoanam.youtubevideowall.VideoWallDemoActivity;
import com.namdungphuong.welcometovietnam.SceneManager.SceneType;

//import world.of.words.StartScreen;
//import com.nav.gamepack.GamePackActivity;

public class MainMenuScene extends BaseScene implements IOnMenuItemClickListener
{
    //---------------------------------------------
    // VARIABLES
    //---------------------------------------------

    private MenuScene menuChildScene;

    private final int MENU_PLAY = 0;
    private final int MENU_GAME = 1;
    private final int MENU_SAPA = 2;
    private final int MENU_HALONG = 3;
    private final int MENU_HANOI = 4;
    private final int MENU_QUANGBINH = 5;
    private final int MENU_HUE = 6;
    private final int MENU_DANANG = 7;
    private final int MENU_NHATRANG = 8;
    private final int MENU_PHANTHIET = 9;
    private final int MENU_SAIGON = 10;
    private final int MENU_DALAT = 11;
    private final int MENU_CONDAO = 12;
    private final int MENU_PHUQUOC = 13;



    private static int CAMERA_WIDTH=720;
    private static int CAMERA_HEIGHT=1280;

    //---------------------------------------------
    // METHODS FROM SUPERCLASS
    //---------------------------------------------

    @Override
    public void createScene()
    {
        createBackground();
        createMenuChildScene();
    }

    @Override
    public void onBackKeyPressed()
    {
        System.exit(0);
    }

    @Override
    public SceneType getSceneType()
    {
        return SceneType.SCENE_MENU;
    }


    @Override
    public void disposeScene()
    {
        // TODO Auto-generated method stub
    }

    public boolean onMenuItemClicked(MenuScene pMenuScene, IMenuItem pMenuItem, float pMenuItemLocalX, float pMenuItemLocalY)
    {
        switch(pMenuItem.getID())
        {
            case MENU_PLAY:
                //Load Game Scene!
                final Intent controlsIntent = new Intent(this.activity, VideoWallDemoActivity.class);
                controlsIntent.putExtra("Tag","PLdqmy90rx_N3ylJkPhQObxmnx9c6LkX9t");// VIET NAM WAR
                this.activity.startActivity(controlsIntent);
                //SceneManager.getInstance().loadMovieListScene(engine);
                return true;

            case MENU_GAME:

                final Intent gameIntent = new Intent(this.activity, StartMenu.class);
                //final Intent gameIntent = new Intent(this.activity, StartScreen.class);
                this.activity.startActivity(gameIntent);

                return true;
            case MENU_SAPA:
            //Load Game Scene!
            final Intent sapaIntent = new Intent(this.activity, FullscreenDemoActivity.class);
            sapaIntent.putExtra("Tag1","sHmg7Zj8nYY");
            this.activity.startActivity(sapaIntent);
            //SceneManager.getInstance().loadReadingScene(engine);
            return true;
            case MENU_HALONG:
                //Load Game Scene!
                final Intent halongIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                halongIntent.putExtra("Tag1","jmbys7QaS6U");
                this.activity.startActivity(halongIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            case MENU_HANOI:
                //Load Game Scene!
                final Intent hanoiIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                hanoiIntent.putExtra("Tag1","xUdBWmM7v0o");
                this.activity.startActivity(hanoiIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            case MENU_QUANGBINH:
                //Load Game Scene!
                final Intent quangbinhIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                quangbinhIntent.putExtra("Tag1","DLpjig4hMZ4");
                this.activity.startActivity(quangbinhIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            case MENU_HUE:
                //Load Game Scene!
                final Intent hueIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                hueIntent.putExtra("Tag1","LZQX8s9wteM");
                this.activity.startActivity(hueIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            case MENU_DANANG:
                //Load Game Scene!
                final Intent danangIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                danangIntent.putExtra("Tag1","wfSPcDeKxxs");
                this.activity.startActivity(danangIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            case MENU_NHATRANG:
                //Load Game Scene!
                final Intent nhatrangIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                nhatrangIntent.putExtra("Tag1","g7MdokfTUio");
                this.activity.startActivity(nhatrangIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            case MENU_PHANTHIET:
                //Load Game Scene!
                final Intent phanthietIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                phanthietIntent.putExtra("Tag1","IaG5PDyL6wo");
                this.activity.startActivity(phanthietIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            case MENU_SAIGON:
                //Load Game Scene!
                final Intent saigonIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                saigonIntent.putExtra("Tag1","35Z4GGvCmlU");
                this.activity.startActivity(saigonIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            case MENU_DALAT:
                //Load Game Scene!
                final Intent dalatIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                dalatIntent.putExtra("Tag1","9ykOAHwKCZU");
                this.activity.startActivity(dalatIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            case MENU_CONDAO:
                //Load Game Scene!
                final Intent condaoIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                condaoIntent.putExtra("Tag1","05qD38bJkGY");
                this.activity.startActivity(condaoIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            case MENU_PHUQUOC:
                //Load Game Scene!
                final Intent phuquocIntent = new Intent(this.activity, FullscreenDemoActivity.class);
                phuquocIntent.putExtra("Tag1","iGRRYoVReTw");
                this.activity.startActivity(phuquocIntent);
                //SceneManager.getInstance().loadReadingScene(engine);
                return true;
            default:
                return false;
        }
    }

    //---------------------------------------------
    // CLASS LOGIC
    //---------------------------------------------

    private void createBackground()
    {
        attachChild(new Sprite(360, 640, resourcesManager.menu_background_region, vbom)
        {
            @Override
            protected void preDraw(GLState pGLState, Camera pCamera)
            {
                super.preDraw(pGLState, pCamera);
                pGLState.enableDither();
            }
        });
    }

    private void createMenuChildScene()
    {
        menuChildScene = new MenuScene(camera);
        menuChildScene.setPosition(0, 0);

        final IMenuItem playMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_PLAY,
                                resourcesManager.play_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem gameMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_GAME,
                                resourcesManager.gamebtn_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem sapaMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_SAPA,
                                resourcesManager.sapa_region,
                                vbom),
                        1.2f, 1);

        final IMenuItem halongMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_HALONG,
                                resourcesManager.halong_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem hanoiMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_HANOI,
                                resourcesManager.hanoi_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem quangbinhMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_QUANGBINH,
                                resourcesManager.quangbinh_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem hueMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_HUE,
                                resourcesManager.hue_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem danangMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_DANANG,
                                resourcesManager.danang_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem nhatrangMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_NHATRANG,
                                resourcesManager.nhatrang_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem phanthietMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_PHANTHIET,
                                resourcesManager.phanthiet_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem saigonMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_SAIGON,
                                resourcesManager.saigon_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem dalatMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_DALAT,
                                resourcesManager.dalat_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem condaoMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_CONDAO,
                                resourcesManager.condao_region,
                                vbom),
                        1.2f, 1);
        final IMenuItem phuquocMenuItem =
                new ScaleMenuItemDecorator(
                        new SpriteMenuItem(
                                MENU_PHUQUOC,
                                resourcesManager.phuquoc_region,
                                vbom),
                        1.2f, 1);


        menuChildScene.addMenuItem(playMenuItem);
        menuChildScene.addMenuItem(gameMenuItem);
        menuChildScene.addMenuItem(sapaMenuItem);
        menuChildScene.addMenuItem(halongMenuItem);
        menuChildScene.addMenuItem(hanoiMenuItem);
        menuChildScene.addMenuItem(quangbinhMenuItem);
        menuChildScene.addMenuItem(hueMenuItem);
        menuChildScene.addMenuItem(danangMenuItem);
        menuChildScene.addMenuItem(nhatrangMenuItem);
        menuChildScene.addMenuItem(phanthietMenuItem);
        menuChildScene.addMenuItem(saigonMenuItem);
        menuChildScene.addMenuItem(dalatMenuItem);
        menuChildScene.addMenuItem(condaoMenuItem);
        menuChildScene.addMenuItem(phuquocMenuItem);

        menuChildScene.buildAnimations();
        menuChildScene.setBackgroundEnabled(false);

        //playMenuItem.setPosition(CAMERA_WIDTH *3/5-20, (CAMERA_HEIGHT*2/4+40));
        playMenuItem.setPosition(CAMERA_WIDTH /2-70, (CAMERA_HEIGHT)/5+50);
        gameMenuItem.setPosition(CAMERA_WIDTH*3/4+119, CAMERA_HEIGHT- 61);
        sapaMenuItem.setPosition(CAMERA_WIDTH/4-63, CAMERA_HEIGHT - 253);
        halongMenuItem.setPosition(CAMERA_WIDTH *2/4+95, (CAMERA_HEIGHT)-277);
        hanoiMenuItem.setPosition(CAMERA_WIDTH*2/4+115, CAMERA_HEIGHT-137);
        quangbinhMenuItem.setPosition(CAMERA_WIDTH/2+50, CAMERA_HEIGHT- 400);
        hueMenuItem.setPosition(CAMERA_WIDTH *2/4+111, (CAMERA_HEIGHT)/2+ 125);

        danangMenuItem.setPosition(CAMERA_WIDTH*2/4-50, CAMERA_HEIGHT/2);
        nhatrangMenuItem.setPosition(CAMERA_WIDTH*3/4+119, CAMERA_HEIGHT/2 - 153);
        phanthietMenuItem.setPosition(CAMERA_WIDTH *3/4+59, (CAMERA_HEIGHT/5)-33);
        saigonMenuItem.setPosition(CAMERA_WIDTH*2/4+118, CAMERA_HEIGHT/8+25);
        dalatMenuItem.setPosition(CAMERA_WIDTH*3/4+110, CAMERA_HEIGHT/2 -257);
        condaoMenuItem.setPosition(CAMERA_WIDTH*2/4+30, CAMERA_HEIGHT/9-13);
        phuquocMenuItem.setPosition(CAMERA_WIDTH/2-190, CAMERA_HEIGHT/8);


        menuChildScene.setOnMenuItemClickListener(this);

        setChildScene(menuChildScene);
    }
}