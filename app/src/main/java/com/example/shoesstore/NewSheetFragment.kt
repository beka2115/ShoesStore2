package com.example.shoesstore

import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import com.bumptech.glide.load.engine.Resource
import com.example.shoesstore.databinding.FragmentNewSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NewSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentNewSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
    }

    private fun initListener() {

        with(binding) {

            editName.doOnTextChanged { text, start, before, count ->
                if (count>0){
                    btnSave.setBackgroundColor(Color.BLUE)
                    btnSave.setTextColor(Color.WHITE)
                }else{
                    btnSave.setBackgroundColor(Color.WHITE)
                    btnSave.setTextColor(Color.BLACK)
                }
            }
            editSurname.doOnTextChanged { text, start, before, count ->
                if (count>0){
                    btnSave.setBackgroundColor(Color.BLUE)
                    btnSave.setTextColor(Color.WHITE)
                }else{
                    btnSave.setBackgroundColor(Color.WHITE)
                    btnSave.setTextColor(Color.BLACK)
                }
            }
        }
    }

}