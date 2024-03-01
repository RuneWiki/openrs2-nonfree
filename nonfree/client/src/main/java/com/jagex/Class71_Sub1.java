package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajf")
public class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!ajf", name = "d", descriptor = "Z")
	public boolean aBoolean351 = false;

	@OriginalMember(owner = "client!ajf", name = "q", descriptor = "Lclient!act;")
	Class26_Sub1_Sub1_Sub1 aClass26_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ajf", name = "<init>", descriptor = "(Lclient!act;Z)V", line = 12)
	Class71_Sub1(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg1);
		this.aClass26_Sub1_Sub1_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!ajf", name = "k", descriptor = "(Lclient!rs;II)V", line = 17)
	@Override
	void method20045(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean351 || !this.aClass26_Sub1_Sub1_Sub1_2.aClass71_3.method20021() || this.aClass26_Sub1_Sub1_Sub1_2.aClass71_3.method20032()) {
			Class510.aClass183_1.method23635(arg0, arg1, this.aClass26_Sub1_Sub1_Sub1_2);
		}
	}

	@OriginalMember(owner = "client!ajf", name = "aa", descriptor = "(Lclient!rs;I)V", line = 17)
	@Override
	void method20049(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean351 || !this.aClass26_Sub1_Sub1_Sub1_2.aClass71_3.method20021() || this.aClass26_Sub1_Sub1_Sub1_2.aClass71_3.method20032()) {
			Class510.aClass183_1.method23635(arg0, arg1, this.aClass26_Sub1_Sub1_Sub1_2);
		}
	}

	@OriginalMember(owner = "client!ajf", name = "ak", descriptor = "(Lclient!rs;I)V", line = 17)
	@Override
	void method20048(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean351 || !this.aClass26_Sub1_Sub1_Sub1_2.aClass71_3.method20021() || this.aClass26_Sub1_Sub1_Sub1_2.aClass71_3.method20032()) {
			Class510.aClass183_1.method23635(arg0, arg1, this.aClass26_Sub1_Sub1_Sub1_2);
		}
	}
}
