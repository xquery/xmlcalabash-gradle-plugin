package com.xmlcalabash.gradle

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.Input
import com.xmlcalabash.drivers.Main

class XProcTask extends DefaultTask {

  @Input
  String xprocFile

  @Input
  String inputFile

  @Input
  String outputFile
  
  @TaskAction
  def run() {    
    def args = [
    	"--debug",
    	"-isource="+inputFile,
    	"-oresult="+outputFile,
        xprocFile
    ]
    Main.main(args as String[])
  }
}