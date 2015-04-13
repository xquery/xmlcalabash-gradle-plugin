package com.xmlcalabash.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class XProc implements Plugin<Project> {
  void apply(Project target) {
    target.task('run', type: XProcTask)
  }
}