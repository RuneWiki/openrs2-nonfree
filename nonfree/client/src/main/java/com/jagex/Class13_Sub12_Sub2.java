package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aks")
public class Class13_Sub12_Sub2 extends Class13_Sub12 {

	@OriginalMember(owner = "client!aks", name = "h", descriptor = "I")
	final int anInt2442;

	@OriginalMember(owner = "client!aks", name = "x", descriptor = "I")
	final int anInt2443;

	@OriginalMember(owner = "client!aks", name = "s", descriptor = "I")
	final int anInt2444;

	@OriginalMember(owner = "client!aks", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 11)
	Class13_Sub12_Sub2(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt2442 = arg0.method20271() * -773475553;
		this.anInt2443 = arg0.method20269() * 2106134655;
		this.anInt2444 = arg0.method20271() * -1580658099;
	}

	@OriginalMember(owner = "client!aks", name = "a", descriptor = "(I)V", line = 18)
	@Override
	public void method16888() {
		Class131.aClass163Array1[this.anInt2442 * 1789921503].method23278().method16639(this.anInt2439 * -1230764753, this.anInt2441 * -1040875649 << 16, this.anInt2440 * -1130842579, this.anInt2444 * 1568831109, false, this.anInt2443 * 2085007231);
	}

	@OriginalMember(owner = "client!aks", name = "h", descriptor = "()V", line = 18)
	@Override
	public void method16896() {
		Class131.aClass163Array1[this.anInt2442 * 1789921503].method23278().method16639(this.anInt2439 * -1230764753, this.anInt2441 * -1040875649 << 16, this.anInt2440 * -1130842579, this.anInt2444 * 1568831109, false, this.anInt2443 * 2085007231);
	}
}
