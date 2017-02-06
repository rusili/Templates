package nyc.c4q.rusili.utilitytemplates.sound;

import android.view.SoundEffectConstants;
import android.view.View;

// Sets up the default clicking sound effect
// Needs:   1) Parent view

public class CustomSoundEffects {
    private View mView;

    public CustomSoundEffects (View viewParam) {
        this.mView = viewParam;
    }

    public void set () {
        mView.playSoundEffect(SoundEffectConstants.CLICK);
    }
}
