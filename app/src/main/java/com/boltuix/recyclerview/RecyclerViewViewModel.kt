package com.boltuix.recyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecyclerViewViewModel : ViewModel() {
    val livaDataOfList = MutableLiveData<ArrayList<MyData>>()

    private var recyclerItemModels = ArrayList<MyData>()
    private var newRecyclerItemModels = ArrayList<MyData>()

//    init {
//        fetchSampleData()
//    }

    fun fetchSampleData2() {
        newRecyclerItemModels.clear()

        newRecyclerItemModels.add(MyData("new Card View", "This is a test."))
        newRecyclerItemModels.add(MyData("Card View2", "This is a test."))
        newRecyclerItemModels.add(
            MyData(
                "Recycler View",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."
            )
        )
        newRecyclerItemModels.add(MyData("Dialog", "Lorem ipsum dolor sit amet."))
        newRecyclerItemModels.add(
            MyData(
                "Snackbar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "App Intro",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Permission",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Button",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Recycler View",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."
            )
        )
        newRecyclerItemModels.add(MyData("Card View", "Lorem ipsum dolor sit amet."))
        newRecyclerItemModels.add(MyData("Dialog", "Lorem ipsum dolor sit amet."))
        newRecyclerItemModels.add(
            MyData(
                "Snackbar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "App Intro",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Permission",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Button",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Recycler View",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."
            )
        )
        newRecyclerItemModels.add(MyData("Card View", "Lorem ipsum dolor sit amet."))
        newRecyclerItemModels.add(MyData("Dialog", "Lorem ipsum dolor sit amet."))
        newRecyclerItemModels.add(
            MyData(
                "Snackbar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "App Intro",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Permission",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Button",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Recycler View",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."
            )
        )
        newRecyclerItemModels.add(MyData("Card View", "Lorem ipsum dolor sit amet."))
        newRecyclerItemModels.add(MyData("Dialog", "Lorem ipsum dolor sit amet."))
        newRecyclerItemModels.add(
            MyData(
                "Snackbar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "App Intro",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Permission",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Button",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Recycler View",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."
            )
        )
        newRecyclerItemModels.add(MyData("Card View", "Lorem ipsum dolor sit amet."))
        newRecyclerItemModels.add(MyData("Dialog", "Lorem ipsum dolor sit amet."))
        newRecyclerItemModels.add(
            MyData(
                "Snackbar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "App Intro",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Permission",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        newRecyclerItemModels.add(
            MyData(
                "Button",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        livaDataOfList.value = newRecyclerItemModels
    }






    fun fetchSampleData() {
        recyclerItemModels.clear()

        recyclerItemModels.add(MyData("Card View", "Lorem ipsum dolor sit amet."))
        recyclerItemModels.add(
            MyData(
                "Recycler View",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."
            )
        )
        recyclerItemModels.add(MyData("Dialog", "Lorem ipsum dolor sit amet."))
        recyclerItemModels.add(
            MyData(
                "Snackbar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "App Intro",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Permission",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Button",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Recycler View",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."
            )
        )
        recyclerItemModels.add(MyData("Card View", "Lorem ipsum dolor sit amet."))
        recyclerItemModels.add(MyData("Dialog", "Lorem ipsum dolor sit amet."))
        recyclerItemModels.add(
            MyData(
                "Snackbar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "App Intro",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Permission",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Button",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Recycler View",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."
            )
        )
        recyclerItemModels.add(MyData("Card View", "Lorem ipsum dolor sit amet."))
        recyclerItemModels.add(MyData("Dialog", "Lorem ipsum dolor sit amet."))
        recyclerItemModels.add(
            MyData(
                "Snackbar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "App Intro",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Permission",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Button",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Recycler View",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."
            )
        )
        recyclerItemModels.add(MyData("Card View", "Lorem ipsum dolor sit amet."))
        recyclerItemModels.add(MyData("Dialog", "Lorem ipsum dolor sit amet."))
        recyclerItemModels.add(
            MyData(
                "Snackbar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "App Intro",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Permission",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Button",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Recycler View",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.."
            )
        )
        recyclerItemModels.add(MyData("Card View", "Lorem ipsum dolor sit amet."))
        recyclerItemModels.add(MyData("Dialog", "Lorem ipsum dolor sit amet."))
        recyclerItemModels.add(
            MyData(
                "Snackbar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "App Intro",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Permission",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        recyclerItemModels.add(
            MyData(
                "Button",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor."
            )
        )
        livaDataOfList.value = recyclerItemModels
    }
}