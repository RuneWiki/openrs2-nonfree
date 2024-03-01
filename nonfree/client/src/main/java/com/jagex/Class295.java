package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public class Class295 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public static final int anInt4391 = 1;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	public static final int anInt4392 = 797;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 7)
	Class295() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ld", name = "as", descriptor = "(Lclient!fo;IIB)V", line = 954)
	static void method25567(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class250.aClass178_15 = arg0;
		Class250.anInt3813 = arg1 * -906615763;
		Class250.anInt3807 = arg2 * -397864581;
	}

	@OriginalMember(owner = "client!ld", name = "agp", descriptor = "(Lclient!vs;I)V", line = 10174)
	static final void method25568(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (Class58_Sub1.aClass581_14 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			@Pc(19) Class3 local19 = Class58_Sub1.aClass581_14.method33217((long) local12);
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local19 == null ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "apv", descriptor = "(Lclient!vs;I)V", line = 11655)
	static final void method25569(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aBoolean568 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ld", name = "aph", descriptor = "(Lclient!vs;B)V", line = 11687)
	static final void method25570(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		client.aShort150 = (short) arg0.anIntArray496[arg0.anInt5319 * 960738381];
		if (client.aShort150 <= 0) {
			client.aShort150 = 256;
		}
		client.aShort147 = (short) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (client.aShort147 <= 0) {
			client.aShort147 = 205;
		}
	}
}
