package com.example.easycalcio.models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.easycalcio.R

class FriendRequestsArrayAdapter(context: Context, val resource: Int, val users: List<User>) :
    ArrayAdapter<User>(context, resource, users) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val user: User = users[position]
        var view: View? = convertView
        if (view == null) {
            view =
                LayoutInflater.from(context).inflate(R.layout.friend_request_layout, parent, false)
        }
        //TODO: replace profile picture

        val friendUsername: TextView = view!!.findViewById(R.id.friendUsername)
        friendUsername.text = user.username

        //TODO: set on click listeners

        return view
    }
}