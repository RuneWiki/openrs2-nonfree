package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class424 {

	@OriginalMember(owner = "client!nn", name = "v", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "Ljava/lang/Object;")
	final Object anObject18;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
	int anInt4808;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(II)I", line = 16)
	static int method28737(@OriginalArg(0) int arg0) {
		if (arg0 == 9 || arg0 == 10) {
			return 1;
		} else if (arg0 == 11) {
			return 8;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!nn", name = "bf", descriptor = "(III)I", line = 44)
	static int method28738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class593.aClass593_3.anInt5501 * 847393323 || arg0 == Class593.aClass593_5.anInt5501 * 847393323 ? Class104_Sub1_Sub2_Sub2.anIntArray138[arg1 & 0x3] : Class104_Sub1_Sub2_Sub2.anIntArray139[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "(Lclient!akv;IB)Lclient!ara;", line = 93)
	static Class77_Sub1_Sub8 method28739(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(30) Class77_Sub1_Sub8 local30 = new Class77_Sub1_Sub8(arg1, arg0.method22523(), arg0.method22523(), arg0.method22500(), arg0.method22500(), arg0.method22478() == 1, arg0.method22478(), arg0.method22478());
		@Pc(34) int local34 = arg0.method22478();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			local30.aClass695_41.method36383(new Class77_Sub34(arg0.method22478(), arg0.method22483(), arg0.method22483(), arg0.method22483(), arg0.method22483(), arg0.method22483(), arg0.method22483(), arg0.method22483(), arg0.method22483()));
		}
		local30.method21874();
		return local30;
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 157)
	Class424(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		this.anObject18 = arg0;
		this.anInt4808 = arg1 * -1235882561;
	}

	@OriginalMember(owner = "client!nn", name = "tk", descriptor = "(Lclient!yf;I)V", line = 8040)
	static final void method28740(@OriginalArg(0) Class665 arg0) {
		Class149.method23151(true);
	}

	@OriginalMember(owner = "client!nn", name = "ua", descriptor = "(Lclient!yf;B)V", line = 8295)
	static final void method28741(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class449.method29227(local13, local23, false);
	}

	@OriginalMember(owner = "client!nn", name = "wa", descriptor = "(Lclient!yf;I)V", line = 8552)
	static final void method28742(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class128.aClass667_3.method36479();
	}
}
