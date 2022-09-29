/*
 * Copyright 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hyman.home.diff

import androidx.recyclerview.widget.ListUpdateCallback
import androidx.recyclerview.widget.RecyclerView

/**
 * ListUpdateCallback that dispatches update events to the given adapter.
 *
 * @see DiffUtil.DiffResult.dispatchUpdatesTo
 *
 * @Author: guangjin.xian
 * @date: 2022/8/29
 * @Description:
 */
class AdapterDiffListUpdateCallback
/**
 * Creates an AdapterListUpdateCallback that will dispatch update events to the given adapter.
 *
 * @param adapter The Adapter to send updates to.
 */(private val mAdapter:DiffAdapter) : ListUpdateCallback {
    /**
     * {@inheritDoc}
     */
    override fun onInserted(position: Int, count: Int) {
        mAdapter.notifyItemRangeInserted(realPosition(position), count)
    }

    /**
     * {@inheritDoc}
     */
    override fun onRemoved(position: Int, count: Int) {
        mAdapter.notifyItemRangeRemoved(realPosition(position), count)
    }

    /**
     * {@inheritDoc}
     */
    override fun onMoved(fromPosition: Int, toPosition: Int) {
        mAdapter.notifyItemMoved(realPosition(fromPosition), realPosition(toPosition))
    }

    /**
     * {@inheritDoc}
     */
    override fun onChanged(position: Int, count: Int, payload: Any?) {
        mAdapter.notifyItemRangeChanged(realPosition(position), count, payload)
    }

    fun realPosition(position: Int): Int {
//        if(mAdapter.)
//        return mAdapter.headerItems.size + position
        return position
    }

}
