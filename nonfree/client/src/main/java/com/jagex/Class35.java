package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abh")
public class Class35 {

	@OriginalMember(owner = "client!abh", name = "n", descriptor = "I")
	public static final int anInt110 = 2;

	@OriginalMember(owner = "client!abh", name = "e", descriptor = "I")
	public static final int anInt111 = 1;

	@OriginalMember(owner = "client!abh", name = "m", descriptor = "I")
	public static final int anInt112 = 3;

	@OriginalMember(owner = "client!abh", name = "k", descriptor = "I")
	public static final int anInt113 = 4;

	@OriginalMember(owner = "client!abh", name = "uy", descriptor = "I")
	static int anInt114;

	@OriginalMember(owner = "client!abh", name = "<init>", descriptor = "()V", line = 9)
	Class35() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!abh", name = "gu", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6034)
	static final void method686(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		@Pc(12) int local12 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091];
		@Pc(26) String local26 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		@Pc(32) Class87 local32 = (Class87) Class124.aClass32_Sub21_7.method18261(local12);
		if (local32.aString11.equals(local26)) {
			arg0.method26862(local12);
		} else {
			arg0.method26911(local12, local26);
		}
	}

	@OriginalMember(owner = "client!abh", name = "kl", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;S)V", line = 6820)
	static final void method688(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		arg0.anInt4032 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * -141980023;
	}

	@OriginalMember(owner = "client!abh", name = "lf", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 12029)
	public static final void method687(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(2) Class175 local2 = Class330.method27372();
		@Pc(8) Class93_Sub22 local8 = Class102.method2592(Class446.aClass446_102, local2.aClass24_2);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		local8.aClass93_Sub41_Sub2_1.method22510(Class46.method894(arg0) + Class46.method894(arg1));
		local8.aClass93_Sub41_Sub2_1.method22402(arg1);
		local8.aClass93_Sub41_Sub2_1.method22402(arg0);
		local2.method24351(local8);
	}
}
