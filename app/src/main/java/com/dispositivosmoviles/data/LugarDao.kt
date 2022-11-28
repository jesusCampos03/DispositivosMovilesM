package com.dispositivosmoviles.data

import androidx.lifecycle.LiveData
import com.dispositivosmoviles.model.Lugar


interface LugarDao {
    //FireBase var
    private var codigoUsuario: String
    private var firestore:FirebaseFirestore

    //CRUD Create Read Update Delete

    fun addLugar(lugar: Lugar){

    }

    fun updateLugar(lugar: Lugar){

    }

    fun deleteLugar(lugar: Lugar){

    }

    fun getLugares() : LiveData<List<Lugar>>{

    }
}