package javamobile.minhas_anotacoes.bancodedados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GerenciarBanco extends SQLiteOpenHelper{
    public static final String NOME_BANCO = "bancoDeDados.db";
    public static final int VERSAO = 1;

    public GerenciarBanco(Context context){
        super(context,NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE anotacoes (_id integer primary key autoincrement, titulo text, conteudo text)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS anotacoes");
        onCreate(db);
    }
}
