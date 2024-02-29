package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aoc")
public abstract class Class92_Sub1_Sub2 extends Class92_Sub1 {

	@OriginalMember(owner = "client!aoc", name = "c", descriptor = "Lclient!aed;")
	Class86_Sub1 aClass86_Sub1_34;

	@OriginalMember(owner = "client!aoc", name = "<init>", descriptor = "(Lclient!aed;)V", line = 9)
	Class92_Sub1_Sub2(@OriginalArg(0) Class86_Sub1 arg0) {
		this.aClass86_Sub1_34 = arg0;
	}

	@OriginalMember(owner = "client!aoc", name = "s", descriptor = "()Z", line = 14)
	@Override
	boolean method23494() {
		this.aClass86_Sub1_34.method20441();
		return true;
	}

	@OriginalMember(owner = "client!aoc", name = "l", descriptor = "()Z", line = 14)
	@Override
	boolean method23508() {
		this.aClass86_Sub1_34.method20441();
		return true;
	}

	@OriginalMember(owner = "client!aoc", name = "x", descriptor = "()Z", line = 14)
	@Override
	boolean method23500() {
		this.aClass86_Sub1_34.method20441();
		return true;
	}

	@OriginalMember(owner = "client!aoc", name = "r", descriptor = "()Z", line = 14)
	@Override
	boolean method23495() {
		this.aClass86_Sub1_34.method20441();
		return true;
	}

	@OriginalMember(owner = "client!aoc", name = "d", descriptor = "()Z", line = 14)
	@Override
	boolean method23492() {
		this.aClass86_Sub1_34.method20441();
		return true;
	}

	@OriginalMember(owner = "client!aoc", name = "ax", descriptor = "()V", line = 19)
	void method23526() {
		if (this.aClass86_Sub1_34.method19940() == this) {
			this.aClass86_Sub1_34.method20443();
		}
	}

	@OriginalMember(owner = "client!aoc", name = "ac", descriptor = "()V", line = 19)
	void method23527() {
		if (this.aClass86_Sub1_34.method19940() == this) {
			this.aClass86_Sub1_34.method20443();
		}
	}

	@OriginalMember(owner = "client!aoc", name = "ad", descriptor = "()V", line = 19)
	void method23528() {
		if (this.aClass86_Sub1_34.method19940() == this) {
			this.aClass86_Sub1_34.method20443();
		}
	}

	@OriginalMember(owner = "client!aoc", name = "ar", descriptor = "()V", line = 19)
	void method23529() {
		if (this.aClass86_Sub1_34.method19940() == this) {
			this.aClass86_Sub1_34.method20443();
		}
	}
}
