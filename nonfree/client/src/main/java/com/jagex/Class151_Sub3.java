package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anm")
public class Class151_Sub3 extends Class151 {

	@OriginalMember(owner = "client!anm", name = "k", descriptor = "Lclient!alc;")
	Class104_Sub1 aClass104_Sub1_19;

	@OriginalMember(owner = "client!anm", name = "<init>", descriptor = "(Lclient!alc;Z)V", line = 12)
	Class151_Sub3(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass104_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!anm", name = "h", descriptor = "(Lclient!et;II)V", line = 17)
	@Override
	void method23472(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		Class94_Sub4.aClass261_1.method26371(arg0, arg1, this.aClass104_Sub1_19);
	}

	@OriginalMember(owner = "client!anm", name = "ag", descriptor = "(Lclient!et;I)V", line = 17)
	@Override
	void method23473(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		Class94_Sub4.aClass261_1.method26371(arg0, arg1, this.aClass104_Sub1_19);
	}

	@OriginalMember(owner = "client!anm", name = "al", descriptor = "(Lclient!et;I)V", line = 17)
	@Override
	void method23474(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		Class94_Sub4.aClass261_1.method26371(arg0, arg1, this.aClass104_Sub1_19);
	}

	@OriginalMember(owner = "client!anm", name = "ao", descriptor = "(Lclient!et;I)V", line = 17)
	@Override
	void method23475(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		Class94_Sub4.aClass261_1.method26371(arg0, arg1, this.aClass104_Sub1_19);
	}
}
