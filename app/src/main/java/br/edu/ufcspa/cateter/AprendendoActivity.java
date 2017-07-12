package br.edu.ufcspa.cateter;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

public class AprendendoActivity extends AppCompatActivity {

    View viewPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprendendo);
        viewPrincipal = findViewById(R.id.layout_aprendendo);
    }

    public void abreParentLayout(View view) {
        String tagDaBarra = (String) view.getTag();
        String section = tagDaBarra.replace("barra", "");
        View parentLayout = viewPrincipal.findViewWithTag("layout" + section);
        abreLayout(parentLayout);
    }

    //-------------listener para aumentar e diminuir o layout clicado-------------------------//
    public void abreLayout(View view) {
        final LinearLayout layout = (LinearLayout) view;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
            TransitionManager.beginDelayedTransition(layout);

        int marginTop = dp2Px(10);

        if (layout.getLayoutParams().height == LinearLayout.LayoutParams.WRAP_CONTENT) {
            LinearLayout.LayoutParams posicao =
                    new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp2Px(50));
            posicao.setMargins(0, marginTop, 0, 0);
            layout.setLayoutParams(posicao);
        } else {
            LinearLayout.LayoutParams posicao = new LinearLayout
                    .LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            posicao.setMargins(0, marginTop, 0, 0);
            layout.setLayoutParams(posicao);
        }
    }

    private int dp2Px(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics());
    }
}
