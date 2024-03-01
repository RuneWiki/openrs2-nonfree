package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
class Class257 implements Interface39 {

	@OriginalMember(owner = "client!fa", name = "kx", descriptor = "I")
	public static int anInt3854;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fa", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 this$0;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!fb;)V", line = 490)
	Class257(@OriginalArg(0) Class258 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "()F", line = 492)
	@Override
	public float method26346() {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_3.method16223() / 255.0F;
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)F", line = 492)
	@Override
	public float method26345() {
		return (float) Class51.aClass93_Sub36_1.aClass166_Sub35_3.method16223() / 255.0F;
	}

	@OriginalMember(owner = "client!fa", name = "fv", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 5931)
	static final void method26022(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		arg0.anInt4028 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * -1283265423;
		Class354.method27696(arg0);
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class239.method25823(arg0.anInt3953 * -1549590237);
		}
	}

	@OriginalMember(owner = "client!fa", name = "ji", descriptor = "(Lclient!yf;I)V", line = 6673)
	static final void method26023(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!fa", name = "mo", descriptor = "(Lclient!yf;S)V", line = 7237)
	static final void method26025(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class75.method1266(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!fa", name = "aek", descriptor = "(Lclient!yf;I)V", line = 10429)
	static final void method26024(@OriginalArg(0) Class681 arg0) {
		@Pc(9) int local9 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1];
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1] = Class464.method29281(local9);
	}
}
