package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public class Class200 {

	@OriginalMember(owner = "client!c", name = "fx", descriptor = "Lclient!py;")
	public static Class497 aClass497_96;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "I")
	int anInt3375;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "I")
	int anInt3376;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	int anInt3377;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	boolean aBoolean578;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!ge;")
	Class286 aClass286_2 = Class286.aClass286_5;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 12)
	Class200() {
	}

	@OriginalMember(owner = "client!c", name = "aq", descriptor = "(Lclient!arm;I)Ljava/lang/String;", line = 1100)
	public static String method24629(@OriginalArg(0) Class93_Sub1_Sub7 arg0) {
		if (Class454.aBoolean773 || arg0 == null) {
			return "";
		} else {
			@Pc(10) int[] local10 = Class477.method29706(arg0);
			return local10 == null ? "" : Class7.method122(local10);
		}
	}
}
