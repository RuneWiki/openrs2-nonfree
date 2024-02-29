package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anf")
public class Class151_Sub2 extends Class151 {

	@OriginalMember(owner = "client!anf", name = "<init>", descriptor = "()V", line = 8)
	public Class151_Sub2() {
		super(true);
	}

	@OriginalMember(owner = "client!anf", name = "h", descriptor = "(Lclient!et;II)V", line = 12)
	@Override
	void method23472(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		Class94_Sub4.aClass261_1.method26374(arg0, arg1);
	}

	@OriginalMember(owner = "client!anf", name = "ag", descriptor = "(Lclient!et;I)V", line = 12)
	@Override
	void method23473(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		Class94_Sub4.aClass261_1.method26374(arg0, arg1);
	}

	@OriginalMember(owner = "client!anf", name = "al", descriptor = "(Lclient!et;I)V", line = 12)
	@Override
	void method23474(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		Class94_Sub4.aClass261_1.method26374(arg0, arg1);
	}

	@OriginalMember(owner = "client!anf", name = "ao", descriptor = "(Lclient!et;I)V", line = 12)
	@Override
	void method23475(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		Class94_Sub4.aClass261_1.method26374(arg0, arg1);
	}

	@OriginalMember(owner = "client!anf", name = "j", descriptor = "(IS)V", line = 137)
	public static void method16694(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(11, (long) arg0);
		local4.method21544();
	}
}
