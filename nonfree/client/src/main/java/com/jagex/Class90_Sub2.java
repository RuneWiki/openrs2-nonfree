package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aev")
public class Class90_Sub2 extends Class90 {

	@OriginalMember(owner = "client!aev", name = "p", descriptor = "[I")
	int[] anIntArray67;

	@OriginalMember(owner = "client!aev", name = "c", descriptor = "[I")
	int[] anIntArray68;

	@OriginalMember(owner = "client!aev", name = "<init>", descriptor = "(II[I[I)V", line = 9)
	Class90_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray67 = arg2;
		this.anIntArray68 = arg3;
	}

	@OriginalMember(owner = "client!aev", name = "l", descriptor = "(II)I", line = 43)
	static final int method6677(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 8 : 11;
	}

	@OriginalMember(owner = "client!aev", name = "au", descriptor = "(Lclient!yf;B)V", line = 4458)
	static final void method6678(@OriginalArg(0) Class665 arg0) throws Exception_Sub6 {
		@Pc(9) Class343 local9 = (Class343) arg0.aClass77_Sub1_Sub9_2.anObjectArray5[arg0.anInt5786 * 662605117];
		@Pc(33) Interface18 local33 = (Interface18) (arg0.anIntArray535[arg0.anInt5786 * 662605117] == 0 ? arg0.aMap22.get(local9.aClass75_1.aClass127_3) : arg0.aMap23.get(local9.aClass75_1.aClass127_3));
		try {
			local33.method35948(local9, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		} catch (@Pc(51) Exception_Sub6 local51) {
			if (!(local33 instanceof Class608)) {
				throw local51;
			}
			Class50.method754(arg0, Class520.aClass520_5, local51, "VO");
		}
	}
}
