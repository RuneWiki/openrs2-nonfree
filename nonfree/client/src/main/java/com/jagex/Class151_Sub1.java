package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!and")
public class Class151_Sub1 extends Class151 {

	@OriginalMember(owner = "client!and", name = "k", descriptor = "Z")
	public boolean aBoolean363 = false;

	@OriginalMember(owner = "client!and", name = "u", descriptor = "Lclient!agh;")
	Class104_Sub1_Sub1_Sub1 aClass104_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!and", name = "<init>", descriptor = "(Lclient!agh;Z)V", line = 12)
	Class151_Sub1(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass104_Sub1_Sub1_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!and", name = "ag", descriptor = "(Lclient!et;I)V", line = 17)
	@Override
	void method23473(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean363 || !this.aClass104_Sub1_Sub1_Sub1_2.aClass151_3.method23396() || this.aClass104_Sub1_Sub1_Sub1_2.aClass151_3.method23422()) {
			Class94_Sub4.aClass261_1.method26371(arg0, arg1, this.aClass104_Sub1_Sub1_Sub1_2);
		}
	}

	@OriginalMember(owner = "client!and", name = "ao", descriptor = "(Lclient!et;I)V", line = 17)
	@Override
	void method23475(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean363 || !this.aClass104_Sub1_Sub1_Sub1_2.aClass151_3.method23396() || this.aClass104_Sub1_Sub1_Sub1_2.aClass151_3.method23422()) {
			Class94_Sub4.aClass261_1.method26371(arg0, arg1, this.aClass104_Sub1_Sub1_Sub1_2);
		}
	}

	@OriginalMember(owner = "client!and", name = "al", descriptor = "(Lclient!et;I)V", line = 17)
	@Override
	void method23474(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean363 || !this.aClass104_Sub1_Sub1_Sub1_2.aClass151_3.method23396() || this.aClass104_Sub1_Sub1_Sub1_2.aClass151_3.method23422()) {
			Class94_Sub4.aClass261_1.method26371(arg0, arg1, this.aClass104_Sub1_Sub1_Sub1_2);
		}
	}

	@OriginalMember(owner = "client!and", name = "h", descriptor = "(Lclient!et;II)V", line = 17)
	@Override
	void method23472(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean363 || !this.aClass104_Sub1_Sub1_Sub1_2.aClass151_3.method23396() || this.aClass104_Sub1_Sub1_Sub1_2.aClass151_3.method23422()) {
			Class94_Sub4.aClass261_1.method26371(arg0, arg1, this.aClass104_Sub1_Sub1_Sub1_2);
		}
	}
}
