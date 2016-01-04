package org.jurassicraft.client.gui.app;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jurassicraft.common.paleopad.App;
import org.jurassicraft.common.paleopad.AppRegistry;

import java.util.HashMap;
import java.util.Map;

@SideOnly(Side.CLIENT)
public class GuiAppRegistry
{
    private static final Map<App, GuiApp> registeredApps = new HashMap<>();

    private static void registerApp(GuiApp gui)
    {
        registeredApps.put(gui.app, gui);
    }

    public static void register()
    {
        registerApp(new GuiAppDinoPedia(AppRegistry.dinopedia));
        registerApp(new GuiAppFileExplorer(AppRegistry.file_explorer));
        registerApp(new GuiAppFlappyDino(AppRegistry.flappy_dino));
        registerApp(new GuiAppMinimap(AppRegistry.minimap));
        registerApp(new GuiAppSecurity(AppRegistry.security));
    }

    public static GuiApp getGui(App app)
    {
        return registeredApps.get(app);
    }
}
