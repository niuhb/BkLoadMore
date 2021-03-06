/*
 * Copyright (c) 2017.  bakumon@aliyun.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.bakumon.library.bkloadmore;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.bakumon.library.R;


/**
 * Create a line that indicates that it is loading.
 * Created by Bakumon on 2017/4/13 17:00.
 */
public interface LoadingItem {
    /**
     * Create new loading list item {@link android.support.v7.widget.RecyclerView.ViewHolder}.
     * @param parent parent ViewGroup.
     * @param viewType viewType type of the loading list item.
     * @return ViewHolder that will be used as loading list item.
     */
    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    /**
     * Bind the loading list item.
     * @param holder loading list item ViewHolder.
     * @param position position loading list item position.
     */
    void onBindViewHolder(RecyclerView.ViewHolder holder, int position);

    /**
     * Create a default implementation for LoadingItem.
     */
    LoadingItem DEFAULT = new LoadingItem() {
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.loading_row, parent, false);
            return new RecyclerView.ViewHolder(view) {
            };
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            // No binding for default loading row
        }
    };
}
