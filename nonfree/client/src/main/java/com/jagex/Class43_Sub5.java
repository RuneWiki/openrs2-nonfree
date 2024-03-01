package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aev")
final class Class43_Sub5 extends Class43 {

	@OriginalMember(owner = "client!aev", name = "dv", descriptor = "Lclient!ds;")
	public static Class134 aClass134_5;

	@OriginalMember(owner = "client!aev", name = "<init>", descriptor = "(Lclient!fv;IZZ)V", line = 13)
	Class43_Sub5(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class43_Sub5) null);
	}

	@OriginalMember(owner = "client!aev", name = "u", descriptor = "(Lclient!cy;B)Ljava/lang/Object;", line = 15)
	@Override
	Object method9490(@OriginalArg(0) Class11 arg0) {
		return Class339.aClass339_5 == arg0.aClass339_3 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aev", name = "y", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 15)
	@Override
	Object method9494(@OriginalArg(0) Class11 arg0) {
		return Class339.aClass339_5 == arg0.aClass339_3 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aev", name = "b", descriptor = "(Lclient!cy;)Ljava/lang/Object;", line = 15)
	@Override
	Object method9495(@OriginalArg(0) Class11 arg0) {
		return Class339.aClass339_5 == arg0.aClass339_3 ? -1 : arg0.aClass339_3.method26425();
	}

	@OriginalMember(owner = "client!aev", name = "hl", descriptor = "(B)V", line = 4516)
	public static final void method9508() {
		@Pc(4) int local4 = Class510.aClass3_Sub45_37.aClass60_Sub21_2.method13688();
		if (local4 == 0) {
			client.aClass370_1.method26958(null);
			Class34.method16498(0);
		} else if (local4 == 1) {
			Class16.method1678((byte) 0);
			Class34.method16498(512);
			if (client.aClass370_1.method26950() != null) {
				Class625.method33796();
			}
		} else {
			Class16.method1678((byte) (client.anInt3100 * -630801869 - 4 & 0xFF));
			Class34.method16498(2);
		}
		client.anInt3109 = Class141.anInt3427 * 624026357;
	}

	@OriginalMember(owner = "client!aev", name = "ajv", descriptor = "(Lclient!vs;B)V", line = 10666)
	static final void method9509(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
	}
}
