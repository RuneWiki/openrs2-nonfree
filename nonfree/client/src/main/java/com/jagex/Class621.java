package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public class Class621 {

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
	public static final int anInt5629 = 6;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 6)
	Class621() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!wk", name = "bi", descriptor = "(Lclient!yf;I)V", line = 4680)
	static final void method32417(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class662 local29;
		if (arg0.aBoolean857) {
			local29 = arg0.aClass662_1;
		} else {
			local29 = arg0.aClass662_2;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local23 != -1 && local29.method33092(local13, local23) ? 1 : 0;
	}

	@OriginalMember(owner = "client!wk", name = "qh", descriptor = "(Lclient!yf;B)V", line = 7579)
	static final void method32418(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		if (local11.anInt3936 * 403396513 == -1) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3934 * -148110895;
		}
	}

	@OriginalMember(owner = "client!wk", name = "agl", descriptor = "(Lclient!yf;B)V", line = 10549)
	static final void method32419(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.aClass404_1.anIntArray460[local13] = local23;
	}
}
