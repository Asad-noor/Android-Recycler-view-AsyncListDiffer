package com.boltuix.recyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecyclerViewViewModel : ViewModel() {
    val livaDataOfList = MutableLiveData<ArrayList<MyData>>()

    private var recyclerItemModels  =   ArrayList<MyData>()

    init {
        fetchSampleData()
    }

     private fun fetchSampleData(){
        recyclerItemModels.clear()

         recyclerItemModels.add(MyData("Card View","Lorem ipsum dolor sit amet."))
         recyclerItemModels.add(MyData("Recycler View", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."))
         recyclerItemModels.add(MyData("Dialog","Lorem ipsum dolor sit amet."))
         recyclerItemModels.add(MyData("Snackbar","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("App Intro","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Permission","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Button","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Recycler View","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."))
         recyclerItemModels.add(MyData("Card View","Lorem ipsum dolor sit amet."))
         recyclerItemModels.add(MyData("Dialog","Lorem ipsum dolor sit amet."))
         recyclerItemModels.add(MyData("Snackbar","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("App Intro","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Permission","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Button","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Recycler View","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."))
         recyclerItemModels.add(MyData("Card View","Lorem ipsum dolor sit amet."))
         recyclerItemModels.add(MyData("Dialog","Lorem ipsum dolor sit amet."))
         recyclerItemModels.add(MyData("Snackbar","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("App Intro","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Permission","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Button","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Recycler View","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."))
         recyclerItemModels.add(MyData("Card View","Lorem ipsum dolor sit amet."))
         recyclerItemModels.add(MyData("Dialog","Lorem ipsum dolor sit amet."))
         recyclerItemModels.add(MyData("Snackbar","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("App Intro","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Permission","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Button","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Recycler View","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."))
         recyclerItemModels.add(MyData("Card View","Lorem ipsum dolor sit amet."))
         recyclerItemModels.add(MyData("Dialog","Lorem ipsum dolor sit amet."))
         recyclerItemModels.add(MyData("Snackbar","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("App Intro","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Permission","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
         recyclerItemModels.add(MyData("Button","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."))
        livaDataOfList.value = recyclerItemModels
    }
}