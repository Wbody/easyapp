package com.wbody.easyapp.start;

import com.jfinal.config.*;
import com.jfinal.template.Engine;
import com.wbody.jfinal.kit.ExplorerKit;

public class JfinalConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {

    }

    @Override
    public void configRoute(Routes routes) {

    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }

    @Override
    public void afterJFinalStart() {
        super.afterJFinalStart();
        ExplorerKit.openExplorer("http://127.0.0.1:8080");
    }
}