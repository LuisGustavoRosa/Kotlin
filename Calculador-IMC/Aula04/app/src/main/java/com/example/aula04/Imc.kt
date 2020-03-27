package com.example.aula04

import android.os.Parcel
import android.os.Parcelable
import android.widget.Spinner

 data class Imc (var altura:Double,var peso:Double): Parcelable{
     constructor(parcel: Parcel) : this(
         parcel.readDouble(),
         parcel.readDouble()
     ) {
     }

     override fun writeToParcel(parcel: Parcel, flags: Int) {
         parcel.writeDouble(altura)
         parcel.writeDouble(peso)
     }

     override fun describeContents(): Int {
         return 0
     }

     companion object CREATOR : Parcelable.Creator<Imc> {
         override fun createFromParcel(parcel: Parcel): Imc {
             return Imc(parcel)
         }

         override fun newArray(size: Int): Array<Imc?> {
             return arrayOfNulls(size)
         }
     }


 }


