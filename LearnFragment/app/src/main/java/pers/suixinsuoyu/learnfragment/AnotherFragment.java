package pers.suixinsuoyu.learnfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 24suixinsuoyu on 16/3/9. All rights reserved.
 * <p>
 * stay hungry, stay foolish
 * ever youthful, ever weeping
 * think different, think independently
 * <p>
 */
public class AnotherFragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_another, container, false);

        root.findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });

        return root;
    }
}
