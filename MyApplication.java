package co.mwater.acraplugin;

import android.app.Application;
import org.acra.*;
import org.acra.annotation.*;

@ReportsCrashes(formKey="",
	formUri = "http://api.mwater.co/v3/acra_reports",
	reportType = org.acra.sender.HttpSender.Type.JSON)
public class MyApplication extends Application {
  @Override
  public void onCreate() {
    // The following line triggers the initialization of ACRA
    super.onCreate();
    ACRA.init(this);
  }
}	
