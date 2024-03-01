package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
class Class152 implements Interface25 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!el", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!ft;)V", line = 490)
	Class152(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "p", descriptor = "(S)F", line = 492)
	@Override
	public float method23202() {
		return (float) Class510.aClass3_Sub45_37.aClass60_Sub33_1.method14179() / 255.0F;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "()F", line = 492)
	@Override
	public float method23203() {
		return (float) Class510.aClass3_Sub45_37.aClass60_Sub33_1.method14179() / 255.0F;
	}

	@OriginalMember(owner = "client!el", name = "adk", descriptor = "(Lclient!vs;I)V", line = 9218)
	static final void method23144(@OriginalArg(0) Class536 arg0) {
		if (Class354.aShortArray108 == null || Class21_Sub1.anInt289 * -1362105085 >= Class177.anInt3474 * -908764545) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class354.aShortArray108[(Class21_Sub1.anInt289 += -2118916693) * -1362105085 - 1] & 0xFFFF;
		}
	}
}
