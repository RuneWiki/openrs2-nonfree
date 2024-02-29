package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xv")
public class Class654 {

	@OriginalMember(owner = "client!xv", name = "p", descriptor = "Lclient!arb;")
	Class77_Sub1_Sub9 aClass77_Sub1_Sub9_1;

	@OriginalMember(owner = "client!xv", name = "l", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray44;

	@OriginalMember(owner = "client!xv", name = "v", descriptor = "[I")
	int[] anIntArray530;

	@OriginalMember(owner = "client!xv", name = "y", descriptor = "[J")
	long[] aLongArray26;

	@OriginalMember(owner = "client!xv", name = "c", descriptor = "I")
	int anInt5765 = 520043783;

	@OriginalMember(owner = "client!xv", name = "<init>", descriptor = "()V", line = 12)
	Class654() {
	}

	@OriginalMember(owner = "client!xv", name = "c", descriptor = "(B)V", line = 46)
	static void method32978() {
		Class590.aClass548_3 = Class548.aClass548_2;
		Class314.aClass690_1 = Class690.aClass690_4;
		Class35_Sub20.aClass699_1 = Class699.aClass699_5;
		Class293.aClass698_1 = Class698.aClass698_7;
		Class98.aClass697_2 = Class697.aClass697_3;
		Class298.aClass694_1 = Class694.aClass694_6;
		Class77_Sub3_Sub2.aString96 = null;
	}

	@OriginalMember(owner = "client!xv", name = "aii", descriptor = "(Lclient!yf;I)V", line = 10922)
	static final void method32979(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(28) boolean local28 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		if (Class136_Sub1.aClass12_15 == null) {
			return;
		}
		@Pc(36) Class77 local36 = Class136_Sub1.aClass12_15.method173((long) local13);
		if (local36 != null && !local28) {
			local36.method24063();
		} else if (local36 == null && local28) {
			local36 = new Class77();
			Class136_Sub1.aClass12_15.method184(local36, (long) local13);
		}
	}
}
