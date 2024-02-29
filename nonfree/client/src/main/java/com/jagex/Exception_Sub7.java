package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aow")
public class Exception_Sub7 extends Exception {

	@OriginalMember(owner = "client!aow", name = "p", descriptor = "I")
	final int anInt2540;

	@OriginalMember(owner = "client!aow", name = "<init>", descriptor = "()V", line = 6)
	Exception_Sub7() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aow", name = "p", descriptor = "(I)I", line = 11)
	public int method18239() {
		return this.anInt2540 * -1992361111;
	}

	@OriginalMember(owner = "client!aow", name = "ah", descriptor = "(Lclient!aqm;S)Ljava/lang/String;", line = 1100)
	public static String method18240(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		if (Class683.aBoolean861 || arg0 == null) {
			return "";
		} else {
			@Pc(10) int[] local10 = Class11.method171(arg0);
			return local10 == null ? "" : Class35_Sub21.method18312(local10);
		}
	}
}
