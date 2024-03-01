package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afe")
public class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!afe", name = "cz", descriptor = "Lclient!dw;")
	static Class14 aClass14_5;

	@OriginalMember(owner = "client!afe", name = "l", descriptor = "I")
	int anInt1157;

	@OriginalMember(owner = "client!afe", name = "h", descriptor = "I")
	int anInt1158;

	@OriginalMember(owner = "client!afe", name = "x", descriptor = "I")
	int anInt1156;

	@OriginalMember(owner = "client!afe", name = "s", descriptor = "I")
	int anInt1159;

	@OriginalMember(owner = "client!afe", name = "u", descriptor = "I")
	int anInt1160;

	@OriginalMember(owner = "client!afe", name = "y", descriptor = "Z")
	boolean aBoolean253;

	@OriginalMember(owner = "client!afe", name = "<init>", descriptor = "(IIIIIZ)V", line = 66)
	Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1157 = arg0 * -1453497021;
		this.anInt1158 = arg1 * -432829515;
		this.anInt1156 = arg2 * -972939137;
		this.anInt1159 = arg3 * 1313610335;
		this.anInt1160 = arg4 * 1603622225;
		this.aBoolean253 = arg5;
	}
}
