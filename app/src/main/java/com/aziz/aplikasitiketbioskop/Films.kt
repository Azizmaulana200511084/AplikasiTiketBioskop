package com.aziz.aplikasitiketbioskop

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Films(
    val nama: String,
    val desCripsi: String,
    val pemeran: String,
    val releas: String,
    val sutradara: String,
    val genr: String,
    val durasi: String,
    val img: Int
) : Parcelable