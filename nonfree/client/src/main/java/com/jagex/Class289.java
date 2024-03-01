package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kx")
public class Class289 {

	@OriginalMember(owner = "client!kx", name = "r", descriptor = "I")
	static int anInt4365;

	@OriginalMember(owner = "client!kx", name = "p", descriptor = "Lclient!kx;")
	public static final Class289 aClass289_2 = new Class289();

	@OriginalMember(owner = "client!kx", name = "a", descriptor = "Lclient!kx;")
	public static final Class289 aClass289_3 = new Class289();

	@OriginalMember(owner = "client!kx", name = "a", descriptor = "(I)Lclient!oy;", line = 21)
	public static Interface42 method25518() {
		if (Class369.anInterface42_1 == null) {
			throw new IllegalStateException("");
		}
		return Class369.anInterface42_1;
	}

	@OriginalMember(owner = "client!kx", name = "<init>", descriptor = "()V", line = 52)
	Class289() {
	}

	@OriginalMember(owner = "client!kx", name = "du", descriptor = "(II)V", line = 785)
	public static void method25519(@OriginalArg(0) int arg0) {
		@Pc(5) Class472 local5 = (Class472) Class58_Sub1.aHashMap4.get(arg0);
		if (local5 == null) {
			local5 = new Class472();
		}
		local5.anInt5119 = Class58_Sub1.anInt1438 * 216696365;
		local5.anInt5118 = Class58_Sub1.anInt1439 * 747886611;
		Class58_Sub1.aHashMap4.put(arg0, local5);
	}

	@OriginalMember(owner = "client!kx", name = "bw", descriptor = "(Lclient!vs;I)V", line = 4172)
	static final void method25517(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5316 -= -43584562;
		if (arg0.aLongArray18[arg0.anInt5316 * 196643287] > arg0.aLongArray18[arg0.anInt5316 * 196643287 + 1]) {
			arg0.anInt5318 += arg0.anIntArray497[arg0.anInt5318 * -2140198955] * -836839043;
		}
	}
}
