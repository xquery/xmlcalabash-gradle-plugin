package com.xmlcalabash.gradle

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

class XProcTask extends DefaultTask {
  def greeting = 'Hello'
  
  @TaskAction
  def run() {
    println greeting
  }
}