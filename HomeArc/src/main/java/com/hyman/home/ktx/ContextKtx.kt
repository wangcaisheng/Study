package com.hyman.home.ktx

import android.content.Context
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine


suspend fun Context.alert(title: String, message: String): Boolean =
    suspendCancellableCoroutine { continuation ->
        AlertDialog.Builder(this)
            .setNegativeButton("no") { dialog, which ->
                dialog.dismiss()
                continuation.resume(false)
            }.setPositiveButton("Yes") { dialog, which ->
                dialog.dismiss()
                continuation.resume(true)
            }.setTitle(title)
            .setOnCancelListener {
                continuation.resume(false)
            }.create()
            .also { dialog ->
                continuation.invokeOnCancellation {
                    dialog.dismiss()
                }
            }
            .show()

    }

