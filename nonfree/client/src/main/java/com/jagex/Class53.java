package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public class Class53 {

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "Lclient!pt;")
	public Class53 aClass53_17;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!pt;")
	public Class53 aClass53_18;

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "(I)V", line = 8)
	public void method20615() {
		if (this.aClass53_18 != null) {
			this.aClass53_18.aClass53_17 = this.aClass53_17;
			this.aClass53_17.aClass53_18 = this.aClass53_18;
			this.aClass53_17 = null;
			this.aClass53_18 = null;
		}
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)V", line = 133)
	static void method20619() {
		Class3_Sub8.aClass581_6.method33222();
	}

	@OriginalMember(owner = "client!pt", name = "cw", descriptor = "(Lclient!vs;I)V", line = 4562)
	static final void method20616(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class108.method21943(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!pt", name = "le", descriptor = "(Lclient!vs;I)V", line = 6162)
	static final void method20617(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class275.method25382(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!pt", name = "agc", descriptor = "(Lclient!vs;I)V", line = 10132)
	static final void method20618(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class289.method25519(local12);
	}

	@OriginalMember(owner = "client!pt", name = "apc", descriptor = "(Lclient!vs;I)V", line = 11733)
	static final void method20620(@OriginalArg(0) Class536 arg0) {
		@Pc(2) long local2 = Class176.method23413();
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) (local2 / 60000L);
	}
}
