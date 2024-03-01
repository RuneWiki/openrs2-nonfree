package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class507 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "I")
	public volatile int anInt5256 = -694744615;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "Ljava/lang/String;")
	volatile String aString231;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 7)
	Class507(@OriginalArg(0) String arg0) {
		this.aString231 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "jk", descriptor = "(Lclient!vs;B)V", line = 5805)
	static final void method29553(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class431.method27962(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!un", name = "kx", descriptor = "(Lclient!vs;I)V", line = 5877)
	static final void method29552(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class284.method25467(local11, arg0);
	}

	@OriginalMember(owner = "client!un", name = "auj", descriptor = "(Lclient!vs;I)V", line = 12566)
	static final void method29554(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass178_12 == null ? -1 : client.aClass178_12.anInt3570 * 954808515;
	}
}
