package com.example.geofenceapp.bindingadapters

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.google.android.libraries.places.api.model.AutocompletePrediction

// seta cidade do serviço de preenchimento automático
@BindingAdapter("setCidade")
fun TextView.setCity(prediction: AutocompletePrediction){
    this.text = prediction.getPrimaryText(null).toString()
}
// seta país do serviço de preenchimento automático
@BindingAdapter("setPais")
fun TextView.setCountry(prediction: AutocompletePrediction){
    this.text = prediction.getSecondaryText(null).toString()
}