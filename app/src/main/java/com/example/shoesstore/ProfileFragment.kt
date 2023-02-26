package com.example.shoesstore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.shoesstore.databinding.FragmentProfileBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private lateinit var dialog: BottomSheetDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        initListeners()
    }

    private fun initViews() {
        with(binding){
            cardNotifications.textForCard.text = "Уведомление"
            cardMyData.textForCard.text = "Мои Данные"
            cardCards.textForCard.text = "Карты"
            cardHelp.textForCard.text ="Помощь"
            cardQuestion.textForCard.text = "Вопросы и ответы"
            cardNotifications.imgNext.visibility = View.GONE
            cardNotifications.cardContainer.isClickable = false
            cardNotifications.switchNotifications.visibility = View.VISIBLE
            Glide.with(cardMyOrders.imgForCard).load(R.drawable.my_orders).into(cardMyOrders.imgForCard)
            Glide.with(cardNotifications.imgForCard).load(R.drawable.notification).into(cardNotifications.imgForCard)
            Glide.with(cardCards.imgForCard).load(R.drawable.cards).into(cardCards.imgForCard)
            Glide.with(cardHelp.imgForCard).load(R.drawable.help_24).into(cardHelp.imgForCard)
            Glide.with(cardQuestion.imgForCard).load(R.drawable.question_24).into(cardQuestion.imgForCard)
        }
    }

    private fun initListeners(){
        with(binding){
            btnSetImage.setOnClickListener {
                NewSheetFragment().show(parentFragmentManager,"newTaskTag")
            }
        }
    }
}