package com.android.sharedatabetweenfragmentsusingviewmodel.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.android.sharedatabetweenfragmentsusingviewmodel.databinding.FragmentReceiverBinding
import com.android.sharedatabetweenfragmentsusingviewmodel.viewmodel.SharedViewModel


class ReceiverFragment : Fragment() {
    lateinit var binding: FragmentReceiverBinding
    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReceiverBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedViewModel.message.observe(viewLifecycleOwner, Observer {
            binding.txtReceiveMessage.text = it
        })

    }

}