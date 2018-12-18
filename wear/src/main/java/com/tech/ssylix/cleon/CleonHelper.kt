package com.tech.ssylix.cleon

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class CleonHelper : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cleon_helper)

        // Enables Always-on
        setAmbientEnabled()
    }
}
