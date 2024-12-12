package com.cacttus.fragments_gr2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cacttus.fragments_gr2.databinding.FragmentProfileDetailsBinding

class ProfileDetailsFragment : Fragment() {
    private lateinit var binding: FragmentProfileDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTextViewText()
    }

    private fun setTextViewText() {
        var retrievedData = this.arguments?.getString("value", null)
        binding.tvData.text = retrievedData
    }
}