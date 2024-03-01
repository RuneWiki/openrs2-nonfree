package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afg")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!afg", name = "ac", descriptor = "I")
	public static int anInt1161;

	@OriginalMember(owner = "client!afg", name = "l", descriptor = "I")
	public int anInt1163;

	@OriginalMember(owner = "client!afg", name = "h", descriptor = "I")
	int anInt1162;

	@OriginalMember(owner = "client!afg", name = "<init>", descriptor = "(II)V", line = 9)
	Class3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1163 = arg0 * 1137918441;
		this.anInt1162 = arg1 * -2021822347;
	}

	@OriginalMember(owner = "client!afg", name = "mg", descriptor = "(Lclient!fo;II)I", line = 11631)
	static int method10251(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1) {
		if (!client.method22372(arg0).method11807(arg1) && arg0.anObjectArray26 == null) {
			return -1;
		} else if (arg0.anIntArray365 == null || arg0.anIntArray365.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray365[arg1];
		}
	}
}
