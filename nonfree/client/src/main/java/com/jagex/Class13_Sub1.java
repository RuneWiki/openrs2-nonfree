package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
	final int anInt141;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
	final int anInt140;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 10)
	Class13_Sub1(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt141 = arg0.method20271() * -2127433367;
		this.anInt140 = arg0.method20271() * -1492263753;
	}

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "()V", line = 16)
	@Override
	public void method16896() {
		Class131.aClass163Array1[this.anInt141 * -1102205223].method23278().method16634(this.anInt140 * -678444793, true);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V", line = 16)
	@Override
	public void method16888() {
		Class131.aClass163Array1[this.anInt141 * -1102205223].method23278().method16634(this.anInt140 * -678444793, true);
	}
}
