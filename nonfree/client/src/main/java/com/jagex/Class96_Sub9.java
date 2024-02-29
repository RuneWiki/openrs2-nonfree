package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afi")
public class Class96_Sub9 extends Class96 {

	@OriginalMember(owner = "client!afi", name = "tx", descriptor = "I")
	public static int anInt833;

	@OriginalMember(owner = "client!afi", name = "<init>", descriptor = "(Lclient!akv;)V", line = 7)
	Class96_Sub9(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!afi", name = "c", descriptor = "(I)V", line = 11)
	@Override
	public void method19911() {
		Class161.method24332(true);
	}

	@OriginalMember(owner = "client!afi", name = "y", descriptor = "()V", line = 11)
	@Override
	public void method19912() {
		Class161.method24332(true);
	}

	@OriginalMember(owner = "client!afi", name = "w", descriptor = "()V", line = 11)
	@Override
	public void method19913() {
		Class161.method24332(true);
	}

	@OriginalMember(owner = "client!afi", name = "v", descriptor = "(IIIZS)I", line = 44)
	public static int method7216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class343 local5 = (Class343) Class61.aClass35_Sub11_1.method18319(arg2);
		@Pc(8) Class75 local8 = local5.aClass75_1;
		@Pc(13) Class77_Sub7 local13 = Class112.method9473(arg0, arg3);
		@Pc(38) int local38;
		if (local13 == null || arg1 < 0 || arg1 >= local13.anIntArray193.length || local13.aClass9Array1 == null || local13.aClass9Array1[arg1] == null) {
			local38 = (Integer) local8.method1144();
		} else {
			local38 = local13.aClass9Array1[arg1].method131(local8.anInt223 * -1270946121);
		}
		return local5.method27799(local38);
	}

	@OriginalMember(owner = "client!afi", name = "ai", descriptor = "(Lclient!yf;B)V", line = 4425)
	static final void method7217(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		if (arg0.anIntArray536[arg0.anInt5784 * 2088438307] == arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!afi", name = "awi", descriptor = "(Lclient!yf;I)V", line = 13232)
	static final void method7218(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
