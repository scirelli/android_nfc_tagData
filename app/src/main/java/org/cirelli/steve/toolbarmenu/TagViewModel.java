package org.cirelli.steve.toolbarmenu;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.nfc.Tag;

/**
 * Created by kls602 on 1/7/18.
 */

public class TagViewModel extends ViewModel {
    private LiveData<Tag> tag;

    public LiveData<Tag> getTag(){
        return tag;
    }
}
