package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ads")
public class Class90 {

	@OriginalMember(owner = "client!ads", name = "n", descriptor = "Z")
	final boolean aBoolean37;

	@OriginalMember(owner = "client!ads", name = "e", descriptor = "[Lclient!adk;")
	final Class84[] aClass84Array1;

	@OriginalMember(owner = "client!ads", name = "e", descriptor = "(II)Lclient!jl;", line = 13)
	public static Class363 method1601(@OriginalArg(0) int arg0) {
		if (Class363.aClass363_1.anInt4574 * -693206779 == arg0) {
			return Class363.aClass363_1;
		} else if (arg0 == Class363.aClass363_2.anInt4574 * -693206779) {
			return Class363.aClass363_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ads", name = "<init>", descriptor = "(Z[Lclient!adk;)V", line = 153)
	Class90(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class84[] arg1) {
		this.aBoolean37 = arg0;
		this.aClass84Array1 = arg1;
	}

	@OriginalMember(owner = "client!ads", name = "k", descriptor = "(Lclient!vy;I)Z", line = 157)
	static boolean method1602(@OriginalArg(0) Class628 arg0) {
		return Class296.method26607(arg0, null);
	}
}
