package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class Class111 {

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 8)
	Class111() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;I)Lclient!de;", line = 13)
	public static Class21 method22015(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3) {
		return new Class21_Sub2(arg0, arg1, arg2, arg3);
	}
}
