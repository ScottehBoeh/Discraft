package net.discraft.mod.module.custogui.gui;

import net.discraft.mod.module.custogui.Module_CustoGUI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class GuiElement_CPS extends GuiElementText {

    public GuiElement_CPS(int givenPosX, int givenPosY, GuiScreen givenGUI, Module_CustoGUI givenModule) {
        super(givenPosX, givenPosY, givenGUI, givenModule);
    }

    @Override
    public void onRender(Minecraft mc, float parTick) {
        this.textValue = "CPS: " + this.module.elementData.CPSNodes.size();

        super.onRender(mc, parTick);
    }

    @Override
    public void onUpdate(Minecraft mc) {
        super.onUpdate(mc);
    }

}
