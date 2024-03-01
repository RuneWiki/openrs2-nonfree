package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!acc")
public class Class13_Sub6 extends Class13 {

	@OriginalMember(owner = "client!acc", name = "fb", descriptor = "Lclient!ny;")
	public static Class359 aClass359_2;

	@OriginalMember(owner = "client!acc", name = "a", descriptor = "I")
	int anInt595;

	@OriginalMember(owner = "client!acc", name = "g", descriptor = "Ljava/lang/String;")
	final String aString20;

	@OriginalMember(owner = "client!acc", name = "l", descriptor = "I")
	final int anInt594;

	@OriginalMember(owner = "client!acc", name = "h", descriptor = "I")
	final int anInt593;

	@OriginalMember(owner = "client!acc", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 12)
	Class13_Sub6(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt595 = arg0.method20271() * 450598795;
		this.aString20 = arg0.method20283();
		this.anInt594 = arg0.method20275() * -840595301;
		this.anInt593 = arg0.method20271() * 292834749;
	}

	@OriginalMember(owner = "client!acc", name = "h", descriptor = "()V", line = 20)
	@Override
	public void method16896() {
		Class131.aClass163Array1[this.anInt595 * 536336419].method23278().method16655(this.aString20, this.anInt594 * -348447341, 0, this.anInt593 * -1578412651);
	}

	@OriginalMember(owner = "client!acc", name = "a", descriptor = "(I)V", line = 20)
	@Override
	public void method16888() {
		Class131.aClass163Array1[this.anInt595 * 536336419].method23278().method16655(this.aString20, this.anInt594 * -348447341, 0, this.anInt593 * -1578412651);
	}
}
