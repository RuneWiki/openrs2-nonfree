package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public class Class372 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!oo", name = "this$0", descriptor = "Lclient!on;")
	final Class371 this$0;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "Lclient!ahb;")
	Class3_Sub41 aClass3_Sub41_18;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "Z")
	boolean aBoolean739;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	int anInt4696;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	int anInt4697;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "(Lclient!aml;B)V", line = 497)
	static void method27205(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		if (arg0 == null) {
			return;
		}
		Class250.aClass553_52.method32702(arg0);
		Class250.anInt3811 += 831615277;
		@Pc(31) Class3_Sub1_Sub9 local31;
		if (arg0.aBoolean468 || "".equals(arg0.aString109)) {
			local31 = new Class3_Sub1_Sub9(arg0.aString109);
			Class250.anInt3812 += -1096261629;
		} else {
			@Pc(26) long local26 = arg0.aLong155 * 4089614541957148765L;
			for (local31 = (Class3_Sub1_Sub9) Class250.aClass581_30.method33217(local26); local31 != null && !local31.aString112.equals(arg0.aString109); local31 = (Class3_Sub1_Sub9) Class250.aClass581_30.method33218()) {
			}
			if (local31 == null) {
				local31 = (Class3_Sub1_Sub9) Class250.aClass161_29.method23219(local26);
				if (local31 != null && !local31.aString112.equals(arg0.aString109)) {
					local31 = null;
				}
				if (local31 == null) {
					local31 = new Class3_Sub1_Sub9(arg0.aString109);
				}
				Class250.aClass581_30.method33241(local31, local26);
				Class250.anInt3812 += -1096261629;
			}
		}
		if (local31.method19052(arg0)) {
			Class159.method23207(local31);
		}
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!on;Lclient!ahb;Z)V", line = 750)
	Class372(@OriginalArg(0) Class371 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) boolean arg2) {
		this.this$0 = arg0;
		this.aClass3_Sub41_18 = arg1;
		this.aBoolean739 = arg2;
		this.anInt4696 = -263113525;
		this.anInt4697 = -1175386987;
	}

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "(B)V", line = 758)
	void method27204() {
		if (this.aClass3_Sub41_18 != null && !this.aBoolean739) {
			this.aClass3_Sub41_18.method20249();
		}
		this.anInt4696 = -263113525;
		this.anInt4697 = -1175386987;
	}

	@OriginalMember(owner = "client!oo", name = "bb", descriptor = "(ZLclient!vs;B)V", line = 4240)
	static final void method27206(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(12) int local12 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		if (arg0) {
			Class379.method27274(local22, local16);
		} else {
			client.method22802(local22, local16);
		}
	}

	@OriginalMember(owner = "client!oo", name = "ix", descriptor = "(Lclient!vs;I)V", line = 5582)
	static final void method27207(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class344.method26489(local11, local14, arg0);
	}
}
