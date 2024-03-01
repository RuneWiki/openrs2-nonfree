package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zp")
public class Class626 {

	@OriginalMember(owner = "client!zp", name = "eu", descriptor = "Lclient!mw;")
	public static Class334 aClass334_1;

	@OriginalMember(owner = "client!zp", name = "bg", descriptor = "Lclient!co;")
	public static Class6 aClass6_38;

	@OriginalMember(owner = "client!zp", name = "p", descriptor = "I")
	public final int anInt5579;

	@OriginalMember(owner = "client!zp", name = "a", descriptor = "I")
	public final int anInt5578;

	@OriginalMember(owner = "client!zp", name = "g", descriptor = "I")
	public final int anInt5580;

	@OriginalMember(owner = "client!zp", name = "<init>", descriptor = "(III)V", line = 142)
	Class626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5579 = arg0 * 1710810367;
		this.anInt5578 = arg1 * 1816476421;
		this.anInt5580 = arg2 * -2082409663;
	}

	@OriginalMember(owner = "client!zp", name = "ly", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6190)
	static final void method33798(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray18 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}
}
