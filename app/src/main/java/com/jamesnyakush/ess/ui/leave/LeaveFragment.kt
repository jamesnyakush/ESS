package com.jamesnyakush.ess.ui.leave


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.jamesnyakush.ess.R

class LeaveFragment : Fragment() {
    companion object {
        fun newInstance() = LeaveFragment()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.leave_fragment, container, false)
    }


}
