//package com.minecraft.vexview;
//
//import lk.vexview.gui.VexGui;
//import lk.vexview.gui.components.*;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.UUID;
//
//public class IntensifyGui {
//    public static VexGui enhanceGui(UUID puuid){
//        List<VexComponents> vexComponents = new ArrayList<>();
//
//
//        vexComponents.add(new VexButton(1, "测试", "[local]button.png", "[local]button_.png",50,50, 40,20));
//        vexComponents.add(new VexText(100, 100, Arrays.asList("这是测试文本","第二行")));
//        vexComponents.add(new VexCheckBox(2,"[local]check.png", "[local]check_.png", 50, 100, 10, 10, false));
//        vexComponents.add(new VexTextField(100, 50, 80, 15, 10, 3));
//        vexComponents.add(new VexImage("[local]login.png", 200, 100, 200, 150));
//        vexComponents.add(new VexPlayerDraw(200, 70, 30, puuid, "小明"));
//        vexComponents.add(new VexButton(123, "设置", "[local]button.png", "[local]button_.png",50,50, 40,20));
//        return new VexGui("[local]gui.png", -1,-1,400,200,vexComponents);
//
//
//
//
//    }
//}
