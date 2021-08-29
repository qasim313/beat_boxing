<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="@android:color/black"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/screen"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="2"
        android:focusableInTouchMode="false"
        android:gravity="end|bottom"
        android:text="0"
        android:textColor="@android:color/white"
        android:textSize="30sp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:layout_weight="2">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal"
            android:layout_weight="1">

            <Button
                android:id="@+id/clearBtn"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="2"
                android:text="C"
                android:textSize="30sp"
                android:onClick="clrBtn"/>

            <Button
                android:id="@+id/backspaceBtn"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:text="X"
                android:textSize="30sp"
                android:onClick="backspace"/>

            <Button
                android:id="@+id/divideBtn"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="@android:color/holo_orange_light"
                android:text="/"
                android:textSize="30sp"
                android:onClick="divideBtn" />

       