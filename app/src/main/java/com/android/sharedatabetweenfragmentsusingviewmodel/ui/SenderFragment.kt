package com.android.sharedatabetweenfragmentsusingviewmodel.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.android.sharedatabetweenfragmentsusingviewmodel.databinding.FragmentSenderBinding
import com.android.sharedatabetweenfragmentsusingviewmodel.viewmodel.SharedViewModel


class SenderFragment : Fragment() {

    lateinit var binding: FragmentSenderBinding
    private val sharedViewModel: SharedViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSenderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSendMessage.setOnClickListener {
            sharedViewModel.sendMessage("Deepak Rattan")
        }
    }
}