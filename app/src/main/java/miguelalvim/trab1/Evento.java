package miguelalvim.trab1;

import android.os.Parcel;
import android.os.Parcelable;

public class Evento implements Parcelable{
    public String titulo;
    public String dia;
    public String hora;
    public String facilitador;
    public String descricao;

    protected Evento(Parcel in) {
        titulo = in.readString();
        dia = in.readString();
        hora = in.readString();
        facilitador = in.readString();
        descricao = in.readString();
    }

    public Evento(){};

    public static final Creator<Evento> CREATOR = new Creator<Evento>() {
        @Override
        public Evento createFromParcel(Parcel in) {
            return new Evento(in);
        }

        @Override
        public Evento[] newArray(int size) {
            return new Evento[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.titulo);
        dest.writeString(this.dia);
        dest.writeString(this.hora);
        dest.writeString(this.facilitador);
        dest.writeString(this.descricao);
    }
}
