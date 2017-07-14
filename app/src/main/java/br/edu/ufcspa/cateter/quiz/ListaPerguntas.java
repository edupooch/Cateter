package br.edu.ufcspa.cateter.quiz;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.edu.ufcspa.cateter.R;


/**
 * Created by eduardo-pooch on 07/10/2016.
 */
public class ListaPerguntas {

    private List<Pergunta> listaPerguntasCamarao;
    Context context;

    public ListaPerguntas(Context context) {
        listaPerguntasCamarao = new ArrayList<>();
        this.context = context;

        criaPerguntaTexto(R.string.pergunta_1,
                R.string.pergunta_1_resposta_1,
                R.string.pergunta_1_resposta_2,
                R.string.pergunta_1_resposta_certa,
                R.string.pergunta_1_resposta_3);

        criaPerguntaTexto(R.string.pergunta_2,
                R.string.pergunta_2_resposta_certa,
                R.string.pergunta_2_resposta_2);


    }

    private void criaPerguntaTexto(int resIdPergunta, int resIdResposta_1, int resIdResposta_2,
                                   int resIdResposta_3, int resIdResposta_4) {

        ArrayList<Resposta> respostas = new ArrayList<>(4);
        respostas.add(new Resposta(context.getString(resIdResposta_1), isCerta(resIdResposta_1)));
        respostas.add(new Resposta(context.getString(resIdResposta_2), isCerta(resIdResposta_2)));
        respostas.add(new Resposta(context.getString(resIdResposta_3), isCerta(resIdResposta_3)));
        respostas.add(new Resposta(context.getString(resIdResposta_4), isCerta(resIdResposta_4)));

        Pergunta pergunta = new Pergunta(context.getString(resIdPergunta), respostas);
        listaPerguntasCamarao.add(pergunta);
    }
    private void criaPerguntaTexto(int resIdPergunta, int resIdResposta_1, int resIdResposta_2) {

        ArrayList<Resposta> respostas = new ArrayList<>(4);
        respostas.add(new Resposta(context.getString(resIdResposta_1), isCerta(resIdResposta_1)));
        respostas.add(new Resposta(context.getString(resIdResposta_2), isCerta(resIdResposta_2)));

        Pergunta pergunta = new Pergunta(context.getString(resIdPergunta), respostas);
        listaPerguntasCamarao.add(pergunta);
    }

    private boolean isCerta(int resId){
        return context.getResources().getResourceEntryName(resId).contains("certa");
    }

    public List<Pergunta> getListaPerguntas() {
        return listaPerguntasCamarao;
    }

}
