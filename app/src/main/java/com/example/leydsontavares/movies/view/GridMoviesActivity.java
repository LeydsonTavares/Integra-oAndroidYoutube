package com.example.leydsontavares.movies.view;

import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.leydsontavares.movies.R;
import com.example.leydsontavares.movies.adpter.MoviePagerAdpter;
import com.example.leydsontavares.movies.model.Movie;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by LeydsonTavares on 19/04/2016.
 */
public class GridMoviesActivity extends AppCompatActivity {

    List<Movie> mMovies;
    MoviePagerAdpter mPagerAdapter;

    @Bind(R.id.vp_movies)
    ViewPager mVpMovies;

    @Bind(R.id.pager_tab_strip)
    PagerTabStrip mPagerTabStrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity);
        ButterKnife.bind(this);

        mPagerTabStrip.setDrawFullUnderline(true);
        mPagerTabStrip.setTabIndicatorColorResource(R.color.Turquoise);
        mPagerTabStrip.setTextSize(0, 40);


        mMovies = new ArrayList<>();
        populateData();
        mPagerAdapter = new MoviePagerAdpter(getSupportFragmentManager(), mMovies, getBaseContext());
        mVpMovies.setAdapter(mPagerAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_grid_movie , menu);
        return super.onCreateOptionsMenu(menu);
    }


    public void populateData() {


        Movie m1 = new Movie();
        m1.setmTitulo("Assassins Creed");
        m1.setmAno("2016");
        m1.setmDescricao("È um filme de ação e aventura baseado na popular série de jogos eletrônicos de " +
                "mesmo nome. Está sendo dirigido por Justin Kurzel e conta com as participações de Michael " +
                "Fassbender, Marion Cotillard, Michael K. Williams, Ariane Labed, Jeremy Irons e Brendan Gleeson.");
        m1.setmDuracao("1h 55m");
        m1.setmQualificação("10.0");
        m1.setmTipos("Ação");
        m1.setmVideoID("K5C59PljZb0");
        m1.setmPoster("" + R.drawable.img_assassins_creed);


        Movie m2 = new Movie();
        m2.setmTitulo("Ben Hur");
        m2.setmAno("2016");
        m2.setmDescricao("Ben-Hur é um filme norte-americano épico e histórico, realizado por " +
                "Timur Bekmambetov e escrito por Keith R. Clarke e John Ridley. É baseado no romance de 1880 " +
                "Ben-Hur: A Tale of the Christ de Lew Wallace. O livro teve outras adaptações cinematográficos " +
                "com o mesmo nome incluindo os filmes de 1925 e de 1959. Tem a participação de Jack Huston, Morgan Freeman, " +
                "Toby Kebbell, Nazanin Boniadi e Rodrigo Santoro. " +
                "A fotografia começou em Fevereiro de 2015 em Roma, e durou cerca de seis meses até Agosto de 2015");
        m2.setmDuracao("2h 10m");
        m2.setmQualificação("9.0");
        m2.setmTipos("Ação");
        m2.setmVideoID("zUEDdgutKFw");
        m2.setmPoster("" + R.drawable.img_ben_hur);


        Movie m3 = new Movie();
        m3.setmTitulo("Deuses do Egito");
        m3.setmAno("2016");
        m3.setmDescricao("Set, o impiedoso deus das trevas, conquistou o trono do Egito e mergulhou " +
                "o até então pacífico e próspero império em caos e conflitos. Poucos ousam rebelar-se " +
                "contra ele. Um jovem ladrão, cuja amada foi raptada por Set, busca destronar e derrotar " +
                "o imperador - com a ajuda do poderoso deus Hórus.");
        m3.setmDuracao("2h 8m");
        m3.setmQualificação("8.5");
        m3.setmTipos("Ação");
        m3.setmVideoID("IJBnK2wNQSo");
        m3.setmPoster("" + R.drawable.img_deuses_do_egito);


        Movie m4 = new Movie();
        m4.setmTitulo("Warcraft");
        m4.setmAno("2016");
        m4.setmDescricao("È um filme norte-americano de ação, fantasia épica e aventura, dirigido " +
                "por Duncan Jones e escrito por Jones e Charles Leavitt, " +
                "que é distribuído mundialmente pela Universal Pictures, " +
                "assim tendo seus efeitos visuais produzidos pela Industrial Light & Magic.");
        m4.setmDuracao("2h 20");
        m4.setmQualificação("9.0");
        m4.setmTipos("Ação");
        m4.setmPoster("" + R.drawable.img_warcraft);


        Movie m5 = new Movie();
        m5.setmTitulo("Boneco do Mal");
        m5.setmAno("2016");
        m5.setmDescricao("Greta, uma jovem mulher norte-americana, busca fugir de seu passado " +
                "conturbado, e acaba aceitando um emprego em uma pequena aldeia na Inglaterra " +
                "como babá para o filho de oito anos de um casal rico, enquanto eles tiram um " +
                "tempo de férias. Greta chega na remota mansão para descobrir que as coisas não " +
                "estão lá muito boas");
        m5.setmDuracao("1h 38m");
        m5.setmQualificação("7.5");
        m5.setmTipos("Terror");
        m5.setmVideoID("X1U21VBSbSs");
        m5.setmPoster("" + R.drawable.img_boneco_do_mal);


        Movie m6 = new Movie();
        m6.setmTitulo("Floresta Maldita");
        m6.setmAno("2016");
        m6.setmDescricao("Thriller sobrenatural que se passa na lendária floresta Aokigahara, " +
                "situada na base do Monte Fuji, no Japão, conhecida como a floresta dos suicidas. " +
                "Neste cenário literalmente incrível, Sara (Natalie Dormer) uma jovem americana vai " +
                "em busca de sua irmã gêmea, que desapareceu misteriosamente nas perigosas trilhas da " +
                "floresta. Apesar das advertências de todos Sara entra na floresta determinada a " +
                "descobrir a verdade sobre o destino de sua irmã.");
        m6.setmDuracao("1h 35m");
        m6.setmQualificação("9.5");
        m6.setmTipos("Terror");
        m6.setmVideoID("0IR7NWJ2ymg");
        m6.setmPoster("" + R.drawable.img_floresta_maldita);

        Movie m7 = new Movie();
        m7.setmTitulo("O Sono da Morte");
        m7.setmAno("2016");
        m7.setmDescricao("O filme conta a história de um casal que adota uma criança (Tremblay) " +
                "cujos sonhos e pesadelos se materializam na vida real. Annabeth Gish (Arquivo X), " +
                "Thomas Jane (The Expanse) e Kate Bosworth (Para Sempre Alice) também estão no elenco.");
        m7.setmDuracao("1h 37m");
        m7.setmQualificação("9.5");
        m7.setmTipos("Terror");
        m7.setmVideoID("wUcQ1AUH_6s");
        m7.setmPoster("" + R.drawable.img_sono_da_morte);

        Movie m8 = new Movie();
        m8.setmTitulo("Olhos Famintos 3");
        m8.setmAno("2016");
        m8.setmDescricao("È um filme estadunidense, que estrearia em 2013 e acabou ficando parado " +
                "por tempo indeterminado devido a falência de um estúdio ligado a MGM que produziria o " +
                "filme, escrito e dirigido por Victor Salva. Segundo o site Bloody-Disgusting o " +
                "terceiro capítulo da saga criada por Victor Salva começará sua produção no primeiro " +
                "trimestre de 2016 pelo estúdio Myriad Pictures. " +
                "Está confirmado de volta ao elenco Jonathan Breck, como a criatura alada." +
                "Ainda não está confirmado se irá direto para Blu-Ray ou cinemas.");
        m8.setmDuracao("2h 10m");
        m8.setmQualificação("9.0");
        m8.setmTipos("Terror");
        m8.setmVideoID("0vMwquLRAFk");
        m8.setmPoster("" + R.drawable.img_jeepers);

        Movie m9 = new Movie();
        m9.setmTitulo("Batman vs Superman");
        m9.setmAno("2016");
        m9.setmDescricao("Preocupado com as ações de um super-herói com poderes " +
                "quase divinos e sem restrições, o formidável e implacável vigilante de " +
                "Gotham City enfrenta o mais adorado salvador de Metrópolis, enquanto todos se " +
                "questionam sobre o tipo de herói que o mundo realmente precisa. " +
                "E com Batman e Superman em guerra um com o outro, surge uma nova ameaça, " +
                "colocando a humanidade sob um risco maior do que jamais conheceu.");
        m9.setmDuracao("2h 33m");
        m9.setmQualificação("10.0");
        m9.setmTipos("Ficção Científica");
        m9.setmVideoID("BvP4RIqSbiw");
        m9.setmPoster("" + R.drawable.img_batman_superman);


        Movie m10 = new Movie();
        m10.setmTitulo("Capitão América: Guerra Civil");
        m10.setmAno("2016");
        m10.setmDescricao("È um filme de super-herói produzido pela Marvel Studios e distribuído " +
                "pela Walt Disney Studios Motion Pictures. É a sequência de Capitão América: " +
                "O Primeiro Vingador e Capitão América: O Soldado Invernal, e a décima terceira " +
                "sequência do Universo Cinematográfico Marvel (MCU)");
        m10.setmDuracao("2h 27m");
        m10.setmQualificação("10.0");
        m10.setmTipos("Ficção Científica");
        m10.setmVideoID("FRLYZn5PGuA");
        m10.setmPoster("" + R.drawable.img_capitao_america);

        Movie m11 = new Movie();
        m11.setmTitulo("Esquadão Suicída");
        m11.setmAno("2016");
        m11.setmDescricao("È um futuro filme de ação estadunidense de 2016 escrito e dirigido por" +
                " David Ayer, baseado na equipe de anti-heróis de mesmo nome da DC Comics. Será o " +
                "terceiro filme do Universo Estendido DC. O elenco é composto por Will Smith, Jared " +
                "Leto, Margot Robbie, Joel Kinnaman, Viola Davis, Cara Delevingne, Scott Eastwood, " +
                "Adewale Akinnuoye-Agbaje, Karen Fukuhara e Jay Hernandez.");
        m11.setmDuracao("1h 50m");
        m11.setmQualificação("10.0");
        m11.setmTipos("Ficção Científica");
        m11.setmVideoID("EOLW-jE8jUA");
        m11.setmPoster("" + R.drawable.img_esquadrao_suicida);

        Movie m12 = new Movie();
        m12.setmTitulo("X-Men Apocalipse");
        m12.setmAno("2016");
        m12.setmDescricao("X-Men: Apocalipse é um futuro filme de super-herói estadunidense baseado" +
                " nos personagens X-Men que aparecem na Marvel Comics. Destina-se a ser a sequência " +
                "direta de X-Men: Dias de Um Futuro Esquecido e o nono capítulo da série de filmes X-Men.");
        m12.setmDuracao("2h 27m");
        m12.setmQualificação("10.0");
        m12.setmTipos("Ficção Científica");
        m12.setmVideoID("3vYpPwBKJ28");
        m12.setmPoster("" + R.drawable.img_x_men_apocalipse);


        Movie m14 = new Movie();
        m14.setmTitulo("Zoolander 2");
        m14.setmAno("2016");
        m14.setmDescricao("È um filme de comédia estadunidense de 2016 dirigido e estrelado por " +
                "Ben Stiller em que satiriza o mundo dos modelos e da moda. Nesta sequência de Zoolander (2001), " +
                "os ex-modelos mais famosos do mundo, Derek Zoolander e Hansel foram humilhados em um desfile e " +
                "sumiram dos holofotes. Mas quando as personalidades mais bonitas do mundo começam a ser assassinadas, " +
                "uma top model especializada em fotos de bíquini pede a ajuda da dupla para investigar o caso. Logo, " +
                "Zoolander e Hansel se infiltram nos bastidores da alta costura para combater os ataques de Mugatu");
        m14.setmDuracao("1h 42m");
        m14.setmQualificação("9.0");
        m14.setmTipos("Comédia");
        m14.setmVideoID("4CL4LNWHegk");
        m14.setmPoster("" + R.drawable.img_zoolander);


        Movie m15 = new Movie();
        m15.setmTitulo("Um Suburbano Sortudo");
        m15.setmAno("2016");
        m15.setmDescricao("Denílson é um carismático camelô que, de repente, descobre ser o único " +
                "filho de um empresário milionário. Antes de morrer, o ricaço deixou sua fortuna " +
                "inteira para ele, surpreendendo toda a família. Totalmente ligado à sua origem humilde, " +
                "Denílson passa por situações hilárias enquanto tenta se adaptar à nova vida de luxo " +
                "e regalias ao lado dos parentes oportunistas do falecido, que querem se livrar do intruso e reaver a herança.");
        m15.setmDuracao("1h 50m");
        m15.setmQualificação("10.0");
        m15.setmTipos("Comédia");
        m15.setmVideoID("cHX_g96YJI");
        m15.setmPoster("" + R.drawable.img_um_suburbano_sortudo);


        Movie m16 = new Movie();
        m16.setmTitulo("Pee-wee’s Big Holiday");
        m16.setmAno("2016");
        m16.setmDescricao("È um filme norte-americano, lançado diretamente pelo o Netflix de 2016, " +
                "com a direção de John Lee.");
        m16.setmDuracao("1h 29m");
        m16.setmQualificação("8.0");
        m16.setmTipos("Comédia");
        m16.setmVideoID("Quo-Oen1wkY");
        m16.setmPoster("" + R.drawable.img_pee_wees_big_holiday);

        Movie m17 = new Movie();
        m17.setmTitulo("Cinquenta Tons de Preto");
        m17.setmAno("2016");
        m17.setmDescricao("Christian Black é um empreendedor de sucesso com um passado obscuro " +
                "e gostos bem peculiares. Quando conhece a Hannah Steale, ele fica obcecado por " +
                "ela e tenta fazer com que ela se submeta a todos os seus desejos. Sexuais, é claro." +
                " O problema é que a única coisa que ele consegue dominar é a sua atenção, e a " +
                "única dor que ele consegue causar é na barriga, de tanto rir.");
        m17.setmDuracao("1h 32m");
        m17.setmQualificação("10.0");
        m17.setmTipos("Comédia");
        m17.setmVideoID("J1pOTTcdRO8");
        m17.setmPoster("" + R.drawable.img_tons_de_preto);


        Movie m18 = new Movie();
        m18.setmTitulo("O Caçador e a Rainha do Gelo");
        m18.setmAno("2016");
        m18.setmDescricao("Sequência do sucesso Branca de Neve e o Caçador, o longa se passa antes " +
                "e depois de A Branca de Neve e o Caçador, quando a Rainha Ravenna recruta o " +
                "Eric para matar sua enteada, Branca de Neve. Em O Caçador e a Rainha do Gelo, " +
                "Hemsworth e Jessica Chastain, que interpreta a guerreira, travam uma nova batalha " +
                "com a Rainha e sua irmã Freya, a Rainha do Gelo - que por décadas viveu sozinha em " +
                "um remoto palácio, criando seu próprio grupo de caçadores mortais.");
        m18.setmDuracao("2h 3m");
        m18.setmQualificação("10.0");
        m18.setmTipos("Fantasia");
        m18.setmVideoID("b3f5PxlsaS8");
        m18.setmPoster("" + R.drawable.img_o_cacador_rainha);


        Movie m19 = new Movie();
        m19.setmTitulo("Mogli: O Menino Lobo");
        m19.setmAno("2016");
        m19.setmDescricao("Dirigido por Jon Favreau, baseado nas eternas histórias de " +
                "Rudyard Kipling e inspirado no clássico longa de animação da Disney, " +
                "Mogli - O Menino Lobo chega uma aventura épica inédita sobre Mogli, " +
                "um menino criado por uma família de lobos. Mas Mogli sente que não é " +
                "mais bem-vindo na floresta quando o temido tigre Shere Khan, que carrega " +
                "cicatrizes causadas por caçadores, promete eliminar o que ele considera uma " +
                "ameaça. Forçado a abandonar o único lar que conhece, Mogli embarca em uma " +
                "cativante jornada de autoconhecimento, guiado pela pantera e mentora Bagheera e " +
                "pelo alegre urso Baloo. Pelo caminho, Mogli encontra criaturas da selva que não " +
                "são exatamente bondosas, incluindo Kaa, uma cobra cuja voz sedutora e olhar " +
                "penetrante hipnotizam o menino-lobo, e Rei Loiue, o nobre de fala mansa que tenta " +
                "convencer Mogli a contar o segredo da ilusória flor vermelha mortal: o fogo.");
        m19.setmDuracao("1h 51m");
        m19.setmQualificação("10.0");
        m19.setmTipos("Fantasia");
        m19.setmVideoID("jqmUoteadZI");
        m19.setmPoster("" + R.drawable.img_mogli);


        Movie m20 = new Movie();
        m20.setmTitulo("Alice Através do Espelho");
        m20.setmAno("2016");
        m20.setmDescricao("È um futuro filme estadunidense que está previsto para estreiar em 2016, " +
                "dirigido por James Bobin e roterizado por Linda Woolverton. Foi baseado romance " +
                "intitulado Through the Looking-Glass escrito por Lewis Carroll.Tem como principais " +
                "estrelas: Mia Wasikowska, Johnny Depp, Helena Bonham Carter, Anne Hathaway, " +
                "Stephen Fry, Toby Jones e Sacha Baron Cohen. O filme está previsto para estrear dia " +
                "27 de maio de 2016 nos Estados Unidos e dia 26 de maio de 2016 em Portugal e no Brasil.");
        m20.setmDuracao("1h 48m");
        m20.setmQualificação("9.0");
        m20.setmTipos("Fantasia");
        m20.setmVideoID("anvGUW-vsLE");
        m20.setmPoster("" + R.drawable.img_alice_espelho);


        Movie m21 = new Movie();
        m21.setmTitulo("Rogue One: Uma História Star Wars");
        m21.setmAno("2016");
        m21.setmDescricao("È um futuro filme norte-americano de ação e fantasia, baseado na franquia " +
                "de filmes de space opera épica Star Wars de George Lucas, que está previsto para ser " +
                "lançado em 2016, com a direção de Gareth Edwards e escrito por Chris Weitz. " +
                "O filme faz parte de uma nova série de spin-offs produzidos pela Disney com base " +
                "na série Star Wars, o filme teve seus efeitos especiais produzidos pela Industrial " +
                "Light & Magic e será distribuída mundialmente pela Walt Disney Studios Motion Pictures, " +
                "que lançara o filme em 16 de dezembro de 2016.");
        m21.setmDuracao("1h 55m");
        m21.setmQualificação("9.5");
        m21.setmTipos("Fantasia");
        m21.setmVideoID("MLlyhGo5_8U");
        m21.setmPoster("" + R.drawable.img_star_wars);


        Movie m22 = new Movie();
        m22.setmTitulo("Angry Birds: O Filme");
        m22.setmAno("2016");
        m22.setmDescricao("È um filme estado-unidense animado por computador de ação e comédia que " +
                "está em produção, realizado por Clay Kaytis e Fergal Reilly, produzido por " +
                "John Cohen e Catherine Winder[5] e escrito e adaptado por Jon Vitti." +
                "Este filme é baseado na série de jogos Angry Birds. O filme será protagonizado por " +
                "Jason Sudeikis, Josh Gad, Danny McBride, Bill Hader, Maya Rudolph, e Peter Dinklage. " +
                "Será lançado nos cinemas dos Estados Unidos a 20 de maio, no Brasil em 12 de maio " +
                "em Portugal a 1 de junho de 2016.");
        m22.setmDuracao("1h 35m");
        m22.setmQualificação("9.0");
        m22.setmTipos("Aventura");
        m22.setmVideoID("QRmKa7vvct4");
        m22.setmPoster("" + R.drawable.img_angry_birds);


        Movie m23 = new Movie();
        m23.setmTitulo("Kung Fu Panda 3");
        m23.setmAno("2016");
        m23.setmDuracao("1h 35m");
        m23.setmDescricao("Em 2016, uma das franquias animadas mais bem-sucedidas do mundo retorna" +
                " com sua maior aventura até agora: Kung Fu Panda 3. Quando o pai perdido de Po " +
                "reaparece de repente, a dupla viaja a um paraíso secreto dos pandas, conhecendo " +
                "assim hilários novos personagens. Mas quando descobre que o vilão sobrenatural " +
                "Kai está percorrendo a China para acabar com todos os mestres do Kung Fu, " +
                "Po deverá realizar o impossível: treinar um vilarejo repleto de irmãos divertidos, " +
                "amorosos e desajeitados para que eles tornem-se os mais poderosos Kung Fu Pandas!.");
        m23.setmQualificação("9.5");
        m23.setmTipos("Aventura");
        m23.setmVideoID("q75bGipJzIg");
        m23.setmPoster("" + R.drawable.img_kung_fu_panda);


        Movie m24 = new Movie();
        m24.setmTitulo("Procurando Dory");
        m24.setmAno("2016");
        m24.setmDescricao("È um futuro filme de animação dos gêneros comédia e aventura, produzido " +
                "pela Pixar Animation Studios e lançado pela Walt Disney Pictures. É a sequela do " +
                "filme Finding Nemo (2003). Andrew Stanton, que realizou o primeiro filme, regressa " +
                "como realizador e escritor, juntamente com Angus MacLane como co-realizador. " +
                "Confirmado pela Walt Disney Pictures em abril de 2013, Finding Dory tem lançamento " +
                "previsto para 17 de junho de 2016 nos Estados Unidos, 30 de junho de 2016 no Brasil " +
                "e 23 de junho de 2016 em Portugal");
        m24.setmDuracao("1h 35m");
        m24.setmQualificação("10.0");
        m24.setmTipos("Aventura");
        m24.setmVideoID("3JNLwlcPBPI");
        m24.setmPoster("" + R.drawable.img_procurando_dory);

        Movie m25 = new Movie();
        m25.setmTitulo("A Era do Gelo 5");
        m25.setmAno("2016");
        m25.setmDescricao("È um futuro filme de animação infantil de 3D, norte-americano produzido " +
                "pela 20th Century Fox em 2016.O filme é a continuação de Ice Age 4, sendo o " +
                "5° filme da franquia..");
        m25.setmDuracao("1h 40m");
        m25.setmQualificação("10.0");
        m25.setmTipos("Aventura");
        m25.setmVideoID("yVzFEsWYZmQ");
        m25.setmPoster("" + R.drawable.img_ice);


        mMovies.add(m1);
        mMovies.add(m2);
        mMovies.add(m3);
        mMovies.add(m4);
        mMovies.add(m5);
        mMovies.add(m6);
        mMovies.add(m7);
        mMovies.add(m8);
        mMovies.add(m9);
        mMovies.add(m10);
        mMovies.add(m11);
        mMovies.add(m12);
        mMovies.add(m14);
        mMovies.add(m15);
        mMovies.add(m16);
        mMovies.add(m17);
        mMovies.add(m18);
        mMovies.add(m19);
        mMovies.add(m20);
        mMovies.add(m21);
        mMovies.add(m22);
        mMovies.add(m23);
        mMovies.add(m24);
        mMovies.add(m25);

    }


}