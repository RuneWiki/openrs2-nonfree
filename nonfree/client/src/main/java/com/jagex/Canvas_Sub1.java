package com.jagex;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anc")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!anc", name = "aj", descriptor = "Z")
	public static boolean aBoolean481;

	@OriginalMember(owner = "client!anc", name = "p", descriptor = "Ljava/awt/Component;")
	Component aComponent3;

	@OriginalMember(owner = "client!anc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 8)
	Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent3 = arg0;
	}

	@OriginalMember(owner = "client!anc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 13)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.update(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 17)
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.paint(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "p", descriptor = "(Ljava/awt/Graphics;)V", line = 17)
	public final void method19581(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.paint(arg0);
	}
}
