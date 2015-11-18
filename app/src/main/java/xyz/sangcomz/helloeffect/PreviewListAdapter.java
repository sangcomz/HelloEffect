package xyz.sangcomz.helloeffect;

import android.opengl.GLSurfaceView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PreviewListAdapter
        extends RecyclerView.Adapter<PreviewListAdapter.ViewHolder> {


    Effector effector;
    int[] effectId = {R.id.none, R.id.autofix, R.id.bw, R.id.brightness,
            R.id.contrast, R.id.crossprocess, R.id.documentary, R.id.duotone, R.id.filllight,
            R.id.flipvert, R.id.fliphor, R.id.grain, R.id.grayscale, R.id.lomoish, R.id.posterize,
            R.id.saturate, R.id.sepia, R.id.sharpen, R.id.temperature, R.id.tint, R.id.vignette};


    PreviewListAdapter(Effector effector){
        this.effector = effector;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private GLSurfaceView effectsView;


        public ViewHolder(View view) {
            super(view);
            effectsView = (GLSurfaceView) view.findViewById(R.id.effectsview);


        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_effect_preview, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Effector effector = new Effector(holder.effectsView.getContext(), holder.effectsView);
//        effector.setCurrentEffect(effectId[position]);
//        holder.effectsView.requestRender();
    }

    @Override
    public int getItemCount() {
        return effectId.length;
    }


}


