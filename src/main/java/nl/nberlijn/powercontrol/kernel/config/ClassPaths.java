package nl.nberlijn.powercontrol.kernel.config;

import nl.nberlijn.powercontrol.config.App;

@SuppressWarnings("unused")
public final class ClassPaths {

    public static final String APP = App.CLASSPATH;

    public static final String CONFIG = APP + Symbols.DOT + "config";

    public static final String CONTROLLERS = APP + Symbols.DOT + "controllers";

    public static final String DATA = APP + Symbols.DOT + "data";

    public static final String MODELS = DATA + Symbols.DOT + "models";

    public static final String OBJECTS = DATA + Symbols.DOT + "objects";

    public static final String SEEDS = DATA + Symbols.DOT + "seeds";

    public static final String GUI = APP + Symbols.DOT + "gui";

    public static final String KERNEL = APP + Symbols.DOT + "kernel";

    public static final String SERVICES = APP + Symbols.DOT + "services";

}
