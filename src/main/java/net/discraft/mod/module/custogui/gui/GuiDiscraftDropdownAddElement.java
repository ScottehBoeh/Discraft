package net.discraft.mod.module.custogui.gui;

import net.discraft.mod.gui.api.GuiDiscraftDropdown;
import net.discraft.mod.module.custogui.Module_CustoGUI;
import net.minecraft.client.gui.GuiScreen;

public class GuiDiscraftDropdownAddElement extends GuiDiscraftDropdown {

    public Module_CustoGUI module;

    /**
     * Create a new drop down menu. Parent Gui, x, y, width, height
     *
     * @param par1
     * @param par2
     * @param par3
     * @param par4
     * @param par5
     */
    public GuiDiscraftDropdownAddElement(GuiScreen par1, int par2, int par3, int par4, int par5, Module_CustoGUI givenModule) {
        super(par1, par2, par3, par4, par5);

        this.addOption("CPS Count", "Shows average clicks-per-second");
        this.addOption("Server Reach", "Displays server-side attack reach");
        this.addOption("Client Reach", "Displays client-side attack reach");
        this.addOption("Ping", "Displays connection ping");
        this.addOption("FPS", "Displays game frames-per-second");
        this.addOption("Kill Count", "Displays client-session kill count");
        this.addOption("Death Count", "Displays client-session death count");

        this.module = givenModule;

    }

    public void onOptionClicked(int par1) {

        /* CPS Count */
        if (par1 == 1) {
            Module_CustoGUI.guiElements.add(new GuiElement_CPS(10, 10, this.parentGui, this.module));
            return;
        }
        /* Server-side Reach */
        if (par1 == 2) {
            Module_CustoGUI.guiElements.add(new GuiElement_Reach_Server(10, 10, this.parentGui, this.module));
            return;
        }
        /* Client-side Reach */
        if (par1 == 3) {
            Module_CustoGUI.guiElements.add(new GuiElement_Reach_Client(10, 10, this.parentGui, this.module));
            return;
        }
        /* Server Ping */
        if (par1 == 4) {
            Module_CustoGUI.guiElements.add(new GuiElement_Ping(10, 10, this.parentGui, this.module));
            return;
        }
        /* FPS */
        if (par1 == 5) {
            Module_CustoGUI.guiElements.add(new GuiElement_FPS(10, 10, this.parentGui, this.module));
            return;
        }

        return;

    }

}
