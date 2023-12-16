package com.boltuix.recyclerview

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.boltuix.recyclerview.databinding.RecyclerViewFragmentBinding
import com.google.android.material.snackbar.Snackbar

//https://www.boltuix.com/2022/04/functions_28.html
class RecyclerViewFragment : Fragment() {
    private var _binding: RecyclerViewFragmentBinding? = null

    //private lateinit var adapterOrder: RecyclerViewAdapter
    private lateinit var adapterOrder: ListAdapterWithDiff

    private val viewModel: RecyclerViewViewModel by viewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = RecyclerViewFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.apply {
            layoutManager =
                //LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                    //  GridLayoutManager(context,2)
                    StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)

            //hasFixedSize()

            //adapterOrder = RecyclerViewAdapter()
            adapterOrder = ListAdapterWithDiff(event = {design, item ->
                design.titleText.setTextColor(Color.BLUE)
                Snackbar.make(binding.recyclerView, item.title, Snackbar.LENGTH_SHORT).show()
            })
            adapter= adapterOrder
        }

        viewModel.livaDataOfList.observe(viewLifecycleOwner) { response ->
            //adapterOrder.submitList(null)
            adapterOrder.submitList(response)
        }

        binding.btnUpdate.setOnClickListener {
            viewModel.fetchSampleData2()
        }

        viewModel.fetchSampleData()
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}




