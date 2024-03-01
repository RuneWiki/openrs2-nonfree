package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public class Class219 {

	@OriginalMember(owner = "client!he", name = "r", descriptor = "I")
	public static int anInt3728;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Ljava/lang/String;")
	final String aString186;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/lang/String;")
	final String aString187;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Ljava/lang/String;")
	final String aString185;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 8)
	Class219(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString186 = arg0;
		this.aString187 = arg1;
		this.aString185 = arg2;
	}

	@OriginalMember(owner = "client!he", name = "z", descriptor = "(Lclient!vs;I)V", line = 60)
	static void method24361(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArrayArray60 == null ? 0 : local15.anIntArrayArray60.length;
	}

	@OriginalMember(owner = "client!he", name = "agl", descriptor = "(Lclient!vs;I)V", line = 10202)
	static final void method24362(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(28) boolean local28 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1;
		if (local13 == 0) {
			Class58_Sub1.aBoolean320 = local28;
		} else if (local13 == 1) {
			Class58_Sub1.aBoolean321 = local28;
		} else if (local13 == 2) {
			Class58_Sub1.aBoolean322 = local28;
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!he", name = "asq", descriptor = "(Lclient!vs;S)V", line = 12276)
	static final void method24363(@OriginalArg(0) Class536 arg0) {
		if (client.aBoolean565) {
			Class300.aClass300_16.method25643();
		}
	}
}
