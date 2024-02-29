package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iy")
public class Class335 {

	@OriginalMember(owner = "client!iy", name = "p", descriptor = "Lclient!iy;")
	static final Class335 aClass335_4 = new Class335(0);

	@OriginalMember(owner = "client!iy", name = "c", descriptor = "Lclient!iy;")
	static final Class335 aClass335_3 = new Class335(1);

	@OriginalMember(owner = "client!iy", name = "<init>", descriptor = "(I)V", line = 7)
	Class335(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!iy", name = "n", descriptor = "(Lclient!yf;B)V", line = 183)
	static void method27669(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		arg0.anIntArray536[arg0.anInt5784 * 2088438307] = Class126.method11564(arg0.anIntArray536[arg0.anInt5784 * 2088438307], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]);
		arg0.anInt5784 += 308999563;
	}

	@OriginalMember(owner = "client!iy", name = "av", descriptor = "(B)Lclient!rl;", line = 838)
	public static Class513 method27670() {
		return Class504.aClass513_2;
	}

	@OriginalMember(owner = "client!iy", name = "sw", descriptor = "(Lclient!yf;S)V", line = 7864)
	static final void method27671(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3881 * 1500908359;
	}

	@OriginalMember(owner = "client!iy", name = "alk", descriptor = "(Lclient!yf;I)V", line = 11530)
	static final void method27672(@OriginalArg(0) Class665 arg0) {
		Class622.method32435(arg0, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3);
	}
}
