package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aon")
public class Exception_Sub3 extends Exception {

	@OriginalMember(owner = "client!aon", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 5)
	public Exception_Sub3(@OriginalArg(0) String arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aon", name = "bg", descriptor = "(Lclient!yf;I)V", line = 4690)
	static final void method23360(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class662 local18;
		if (arg0.aBoolean857) {
			local18 = arg0.aClass662_1;
		} else {
			local18 = arg0.aClass662_2;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.method33092(local12, -1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aon", name = "aue", descriptor = "(Lclient!yf;B)V", line = 13038)
	static final void method23361(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class479.anInt5014 * 286863169;
	}
}
