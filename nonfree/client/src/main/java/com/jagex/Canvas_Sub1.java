package com.jagex;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asi")
public final class Canvas_Sub1 extends Canvas {

	@OriginalMember(owner = "client!asi", name = "p", descriptor = "Ljava/awt/Component;")
	Component aComponent3;

	@OriginalMember(owner = "client!asi", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 8)
	Canvas_Sub1(@OriginalArg(0) Component arg0) {
		this.aComponent3 = arg0;
	}

	@OriginalMember(owner = "client!asi", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 13)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.update(arg0);
	}

	@OriginalMember(owner = "client!asi", name = "v", descriptor = "(Ljava/awt/Graphics;)V", line = 17)
	public final void method23131(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.paint(arg0);
	}

	@OriginalMember(owner = "client!asi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 17)
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.paint(arg0);
	}

	@OriginalMember(owner = "client!asi", name = "p", descriptor = "(Ljava/awt/Graphics;)V", line = 17)
	public final void method23132(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.paint(arg0);
	}

	@OriginalMember(owner = "client!asi", name = "c", descriptor = "(Ljava/awt/Graphics;)V", line = 17)
	public final void method23133(@OriginalArg(0) Graphics arg0) {
		this.aComponent3.paint(arg0);
	}

	@OriginalMember(owner = "client!asi", name = "xa", descriptor = "(Lclient!yf;I)V", line = 8725)
	static final void method23134(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(46) Class36 local46 = (Class36) Class663.aClass35_Sub21_1.method18319(local23);
		if (local46.aClass498_1.method36479() != local13) {
			throw new RuntimeException();
		}
		@Pc(61) int[] local61 = local46.method631(local33);
		@Pc(63) int local63 = 0;
		if (local61 != null) {
			local63 = local61.length;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local63;
	}
}
