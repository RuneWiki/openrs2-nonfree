package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ape")
public abstract class Class92_Sub2_Sub1 extends Class92_Sub2 {

	@OriginalMember(owner = "client!ape", name = "p", descriptor = "Lclient!aed;")
	Class86_Sub1 aClass86_Sub1_33;

	@OriginalMember(owner = "client!ape", name = "<init>", descriptor = "(Lclient!aed;)V", line = 9)
	Class92_Sub2_Sub1(@OriginalArg(0) Class86_Sub1 arg0) {
		this.aClass86_Sub1_33 = arg0;
	}

	@OriginalMember(owner = "client!ape", name = "l", descriptor = "()Z", line = 14)
	@Override
	boolean method23508() {
		this.aClass86_Sub1_33.method20441();
		return true;
	}

	@OriginalMember(owner = "client!ape", name = "x", descriptor = "()Z", line = 14)
	@Override
	boolean method23500() {
		this.aClass86_Sub1_33.method20441();
		return true;
	}

	@OriginalMember(owner = "client!ape", name = "d", descriptor = "()Z", line = 14)
	@Override
	boolean method23492() {
		this.aClass86_Sub1_33.method20441();
		return true;
	}

	@OriginalMember(owner = "client!ape", name = "r", descriptor = "()Z", line = 14)
	@Override
	boolean method23495() {
		this.aClass86_Sub1_33.method20441();
		return true;
	}

	@OriginalMember(owner = "client!ape", name = "s", descriptor = "()Z", line = 14)
	@Override
	boolean method23494() {
		this.aClass86_Sub1_33.method20441();
		return true;
	}

	@OriginalMember(owner = "client!ape", name = "h", descriptor = "(II)V", line = 19)
	@Override
	void method23351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass86_Sub1_33.method19940() == this) {
			this.aClass86_Sub1_33.method20443();
		}
	}

	@OriginalMember(owner = "client!ape", name = "m", descriptor = "(II)V", line = 19)
	@Override
	void method23350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass86_Sub1_33.method19940() == this) {
			this.aClass86_Sub1_33.method20443();
		}
	}
}
