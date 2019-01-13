package com.onespan.takeshisugai.aisatsuapp1

import android.app.Dialog
import android.widget.TimePicker
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.support.v4.app.DialogFragment


 class TimePick() : DialogFragment(), TimePickerDialog.OnTimeSetListener, Parcelable {
//çlass TimePick() : DialogFragment(), TimePickerDialog.OnTimeSetListener, Parcelable {


    protected constructor(parcel: Parcel) : this() {
    }

    // Bundle sould be nullable, Bundle?

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // to initialize a Calender instance
        val c = Calendar.getInstance()

        // at the first, to get the system current hour and minute
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        return TimePickerDialog(
            activity,
            // in order to return parameters to MainActivity
            activity as MainActivity?,
            hour,
            minute,
            true)
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        //
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TimePick> {
        override fun createFromParcel(parcel: Parcel): TimePick {
            return TimePick(parcel)
        }

        override fun newArray(size: Int): Array<TimePick?> {
            return arrayOfNulls(size)
        }
    }
}