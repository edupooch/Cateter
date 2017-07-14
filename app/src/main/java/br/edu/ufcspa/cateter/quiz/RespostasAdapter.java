package br.edu.ufcspa.cateter.quiz;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;


import java.util.List;

import br.edu.ufcspa.cateter.R;

/**
 * Created by eduardo-pooch on 31/03/2017.
 */
public class RespostasAdapter extends BaseAdapter {

    private final GridView gridParent;
    private List<Resposta> respostas;
    private Context context;
    private int selectedPosition = -1;
    private int screenWidth;

    public RespostasAdapter(Context context, List<Resposta> respostas, GridView gridParent) {
        this.respostas = respostas;
        this.context = context;
        this.gridParent = gridParent;
        this.screenWidth = getScreenWidth();
    }

    @Override
    public int getCount() {
        return respostas.size();
    }

    @Override
    public Object getItem(int position) {
        return respostas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return respostas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Resposta resposta = respostas.get(position);
        LayoutInflater inflater = LayoutInflater.from(context);
        int layoutTipoResposta =R.layout.respostas_texto;

        View view = convertView;
        if (view == null) view = inflater.inflate(layoutTipoResposta, parent, false);

        final RadioButton radioButton = (RadioButton) view.findViewById(R.id.radio_resposta);
        radioButton.setChecked(position == selectedPosition);
        radioButton.setTag(position);
        View.OnClickListener radioClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioClicado(radioButton);
            }
        };
        radioButton.setOnClickListener(radioClickListener);
        view.setOnClickListener(radioClickListener);
        configuraRespostas(resposta, view);

        return view;
    }

    private void configuraRespostas(Resposta resposta, View view) {
            gridParent.setNumColumns(1);
            gridParent.setColumnWidth(screenWidth);
            gridParent.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);

            TextView textoRespota = (TextView) view.findViewById(R.id.texto_resposta);
            textoRespota.setText(resposta.getTexto());
            notifyDataSetChanged();
        }


    private int getScreenWidth() {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.x;
    }


    private void radioClicado(View v) {
        selectedPosition = (Integer) v.getTag();
        notifyDataSetChanged();
    }

    public int getSelectedPosition() {
        return selectedPosition;
    }

}
