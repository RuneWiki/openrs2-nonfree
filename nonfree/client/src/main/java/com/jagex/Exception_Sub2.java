package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aog")
public class Exception_Sub2 extends Exception {

	@OriginalMember(owner = "client!aog", name = "<init>", descriptor = "()V", line = 4)
	Exception_Sub2() {
	}

	@OriginalMember(owner = "client!aog", name = "aag", descriptor = "(Lclient!yf;B)V", line = 9318)
	static final void method17685(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.anIntArray449[local12];
	}
}
