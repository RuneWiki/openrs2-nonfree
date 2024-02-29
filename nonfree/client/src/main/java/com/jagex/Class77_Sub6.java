package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aje")
public class Class77_Sub6 extends Class77 {

	@OriginalMember(owner = "client!aje", name = "l", descriptor = "Ljava/lang/Object;")
	public final Object anObject5;

	@OriginalMember(owner = "client!aje", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 6)
	public Class77_Sub6(@OriginalArg(0) Object arg0) {
		this.anObject5 = arg0;
	}

	@OriginalMember(owner = "client!aje", name = "uv", descriptor = "(Lclient!yf;I)V", line = 8260)
	static final void method13242(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		Class94_Sub4.aClass261_1.method26290(local13);
	}
}
