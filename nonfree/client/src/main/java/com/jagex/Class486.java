package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public class Class486 {

	@OriginalMember(owner = "client!to", name = "p", descriptor = "I")
	public static final int anInt5183 = 6;

	@OriginalMember(owner = "client!to", name = "i", descriptor = "[Lclient!co;")
	static Class6[] aClass6Array14;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V", line = 6)
	Class486() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!to", name = "gj", descriptor = "(I)V", line = 2608)
	static final void method29181() {
		if (Class108.method21938(client.anInt3039 * 1115111877) || Class318.method25855(client.anInt3039 * 1115111877)) {
			Class394.method27445(false);
		} else {
			Class195.aClass62_3 = client.aClass82_2.method21621();
			client.aClass82_2.method21605();
			Class166.method23342(14);
		}
	}

	@OriginalMember(owner = "client!to", name = "lx", descriptor = "(Lclient!vs;I)V", line = 6095)
	static final void method29180(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class408.method27667(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!to", name = "abm", descriptor = "(Lclient!vs;B)V", line = 9005)
	static final void method29182(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class60_Sub30.method13959((char) local12) ? 1 : 0;
	}
}
