/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xyz.sangcomz.helloeffect;

import android.media.effect.Effect;
import android.media.effect.EffectContext;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

public class HelloEffects extends AppCompatActivity implements View.OnClickListener {

    private GLSurfaceView mEffectView;
    private GLSurfaceView mEffectView2;
    private int[] mTextures = new int[2];
    private EffectContext mEffectContext;
    private Effect mEffect;
    private TextureRenderer mTexRenderer = new TextureRenderer();
    private int mImageWidth;
    private int mImageHeight;
    private boolean mInitialized = false;
    int mCurrentEffect;

    Effector effector;

    RelativeLayout areaEffect;
    RelativeLayout areaCrop;
    RelativeLayout areaRotate;

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    PreviewListAdapter previewListAdapter;

//    public void setCurrentEffect(int effect) {
//        mCurrentEffect = effect;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//        effector = new Effector(this);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        previewListAdapter = new PreviewListAdapter(effector);
        recyclerView.setAdapter(previewListAdapter);

        areaEffect = (RelativeLayout) findViewById(R.id.area_effect);
        areaCrop = (RelativeLayout) findViewById(R.id.area_crop);
        areaRotate = (RelativeLayout) findViewById(R.id.area_rotate);

        areaEffect.setOnClickListener(this);
        areaCrop.setOnClickListener(this);
        areaRotate.setOnClickListener(this);
        /**
         * Initialize the renderer and tell it to only render when
         * explicity requested with the RENDERMODE_WHEN_DIRTY option
         */
        mEffectView = (GLSurfaceView) findViewById(R.id.effectsview);
        effector = new Effector(this, mEffectView);
//        mEffectView.requestRender();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.options_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        effector.setCurrentEffect(item.getItemId());
//        mEffectView.requestRender();
//        return true;
//    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.area_effect:
                break;
            case R.id.area_crop:
                break;
            case R.id.area_rotate:
                break;
        }
    }
}
