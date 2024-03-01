package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public class Class117 {

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
	public static final int anInt3197 = 32902;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	public static final int anInt3198 = 4098;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	public static final int anInt3199 = 4318;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
	public static final int anInt3200 = -1;

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
	public static final int anInt3203 = 0;

	@OriginalMember(owner = "client!cr", name = "ek", descriptor = "Lclient!nk;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!cr", name = "to", descriptor = "I")
	static int anInt3204;

	@OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
	public final int anInt3201;

	@OriginalMember(owner = "client!cr", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString158;

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "I")
	public final int anInt3202;

	@OriginalMember(owner = "client!cr", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString157;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "J")
	public final long aLong237;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Z")
	public final boolean aBoolean611;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;JZ)V", line = 16)
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3201 = arg0 * -1775091561;
		this.aString158 = arg1;
		this.anInt3202 = arg2 * 1326421751;
		this.aString157 = arg3;
		this.aLong237 = arg4 * 5466766110190018463L;
		this.aBoolean611 = arg5;
	}

	@OriginalMember(owner = "client!cr", name = "ep", descriptor = "(B)V", line = 1610)
	public static final void method22815() {
		@Pc(6) String local6 = Class442.aString222 == null ? Class404.method27639() : Class442.aString222;
		Class485.method29178(local6, false, client.aBoolean569);
	}

	@OriginalMember(owner = "client!cr", name = "rm", descriptor = "(Lclient!vs;I)V", line = 7308)
	static final void method22813(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3523 * 260568357;
	}

	@OriginalMember(owner = "client!cr", name = "yb", descriptor = "(Lclient!vs;I)V", line = 8525)
	static final void method22814(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3194 * 963130851 == 2 && local12 < client.anInt3042 * -1645830611) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass313Array1[local12].aBoolean714 ? 1 : 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!cr", name = "jf", descriptor = "(Lclient!fo;Lclient!fo;I)V", line = 9561)
	static void method22816(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class178 arg1) {
		@Pc(5) Class3_Sub23 local5 = Class269.method25284(Class311.aClass311_14, client.aClass82_2.aClass577_2);
		local5.aClass3_Sub41_Sub1_1.method20287(arg0.anInt3559 * 1976441867);
		local5.aClass3_Sub41_Sub1_1.method20318(arg0.anInt3491 * 18828465);
		local5.aClass3_Sub41_Sub1_1.method20312(arg1.anInt3491 * 18828465);
		local5.aClass3_Sub41_Sub1_1.method20318(arg1.anInt3559 * 1976441867);
		local5.aClass3_Sub41_Sub1_1.method20254(arg1.anInt3570 * 954808515);
		local5.aClass3_Sub41_Sub1_1.method20322(arg0.anInt3570 * 954808515);
		client.aClass82_2.method21601(local5);
	}

	@OriginalMember(owner = "client!cr", name = "amr", descriptor = "(Lclient!vs;I)V", line = 11286)
	static final void method22817(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1 ? 1 : 0);
		client.aClass370_1.method26968();
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
