package com.pheakdey.curriculumvitaeapp.model

import com.google.gson.annotations.SerializedName

class Skills {
    @SerializedName("skills")
    lateinit var skills:ArrayList<Skill>
}
