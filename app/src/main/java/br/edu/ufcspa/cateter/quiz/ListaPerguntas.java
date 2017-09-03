package br.edu.ufcspa.cateter.quiz;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.edu.ufcspa.cateter.R;


/**
 * Created by eduardo-pooch on 07/10/2016.
 */

class ListaPerguntas {

    private List<Pergunta> listaPerguntasCamarao;
    private Context context;

    ListaPerguntas(Context context, int nQuiz) {
        listaPerguntasCamarao = new ArrayList<>();
        this.context = context;
        if (nQuiz == 1){
            criaQuiz1();
        } else if (nQuiz == 2){
            criaQuiz2();
        }

    }

    private void criaQuiz2() {
        criaPerguntaTexto(R.string.pergunta_2_1,
                R.string.pergunta_2_1_resposta_certa,
                R.string.pergunta_2_1_resposta_1,
                R.string.pergunta_2_1_resposta_2,
                R.string.pergunta_2_1_resposta_3);

        criaPerguntaTexto(R.string.pergunta_2_2,
                R.string.pergunta_2_2_resposta_1,
                R.string.pergunta_2_2_resposta_2,
                R.string.pergunta_2_2_resposta_certa,
                R.string.pergunta_2_2_resposta_3);

        criaPerguntaTexto(R.string.pergunta_2_3,
                R.string.pergunta_2_3_resposta_1,
                R.string.pergunta_2_3_resposta_certa,
                R.string.pergunta_2_3_resposta_2,
                R.string.pergunta_2_3_resposta_3);

        criaPerguntaTexto(R.string.pergunta_2_4,
                R.string.pergunta_2_4_resposta_1,
                R.string.pergunta_2_4_resposta_2,
                R.string.pergunta_2_4_resposta_3,
                R.string.pergunta_2_4_resposta_certa);

        criaPerguntaTexto(R.string.pergunta_2_5,
                R.string.pergunta_2_5_resposta_certa,
                R.string.pergunta_2_5_resposta_1,
                R.string.pergunta_2_5_resposta_2,
                R.string.pergunta_2_5_resposta_3);

        criaPerguntaTexto(R.string.pergunta_2_6,
                R.string.pergunta_2_6_resposta_certa,
                R.string.pergunta_2_6_resposta_1);

        criaPerguntaTexto(R.string.pergunta_2_7,
                R.string.pergunta_2_7_resposta_certa,
                R.string.pergunta_2_7_resposta_2,
                R.string.pergunta_2_7_resposta_3,
                R.string.pergunta_2_7_resposta_1);

        criaPerguntaTexto(R.string.pergunta_2_8,
                R.string.pergunta_2_8_resposta_1,
                R.string.pergunta_2_8_resposta_certa,
                R.string.pergunta_2_8_resposta_2,
                R.string.pergunta_2_8_resposta_3);

        criaPerguntaTexto(R.string.pergunta_2_9,
                R.string.pergunta_2_9_resposta_1,
                R.string.pergunta_2_9_resposta_certa);

        criaPerguntaTexto(R.string.pergunta_2_10,
                R.string.pergunta_2_10_resposta_1,
                R.string.pergunta_2_10_resposta_certa);
    }

    private void criaQuiz1() {
        criaPerguntaTexto(R.string.pergunta_1,
                R.string.pergunta_1_resposta_1,
                R.string.pergunta_1_resposta_2,
                R.string.pergunta_1_resposta_certa,
                R.string.pergunta_1_resposta_3);

        criaPerguntaTexto(R.string.pergunta_2,
                R.string.pergunta_2_resposta_certa,
                R.string.pergunta_2_resposta_1);

        criaPerguntaTexto(R.string.pergunta_3,
                R.string.pergunta_3_resposta_1,
                R.string.pergunta_3_resposta_2,
                R.string.pergunta_3_resposta_certa,
                R.string.pergunta_3_resposta_3);

        criaPerguntaTexto(R.string.pergunta_4,
                R.string.pergunta_4_resposta_1,
                R.string.pergunta_4_resposta_certa);

        criaPerguntaTexto(R.string.pergunta_5,
                R.string.pergunta_5_resposta_1,
                R.string.pergunta_5_resposta_certa);

        criaPerguntaTexto(R.string.pergunta_6,
                R.string.pergunta_6_resposta_1,
                R.string.pergunta_6_resposta_certa);

        criaPerguntaTexto(R.string.pergunta_7,
                R.string.pergunta_7_resposta_certa,
                R.string.pergunta_7_resposta_1);

        criaPerguntaTexto(R.string.pergunta_8,
                R.string.pergunta_8_resposta_1,
                R.string.pergunta_8_resposta_certa,
                R.string.pergunta_8_resposta_2,
                R.string.pergunta_8_resposta_3);

        criaPerguntaTexto(R.string.pergunta_9,
                R.string.pergunta_9_resposta_1,
                R.string.pergunta_9_resposta_2,
                R.string.pergunta_9_resposta_certa,
                R.string.pergunta_9_resposta_3);

        criaPerguntaTexto(R.string.pergunta_10,
                R.string.pergunta_10_resposta_1,
                R.string.pergunta_10_resposta_2,
                R.string.pergunta_10_resposta_3,
                R.string.pergunta_10_resposta_certa);
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

    private boolean isCerta(int resId) {
        return context.getResources().getResourceEntryName(resId).contains("certa");
    }

    List<Pergunta> getListaPerguntas() {
        return listaPerguntasCamarao;
    }

}
