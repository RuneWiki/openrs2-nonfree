package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ard")
public abstract class Class77_Sub1_Sub10 extends Class77_Sub1 {

	@OriginalMember(owner = "client!ard", name = "t", descriptor = "I")
	final int anInt3181;

	@OriginalMember(owner = "client!ard", name = "<init>", descriptor = "(I)V", line = 8)
	Class77_Sub1_Sub10(@OriginalArg(0) int arg0) {
		this.anInt3181 = arg0 * 1514714877;
	}

	@OriginalMember(owner = "client!ard", name = "aiw", descriptor = "(Lclient!yf;B)V", line = 10976)
	static final void method23606(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 == 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class136_Sub1.aBoolean346 ? 1 : 0;
		} else if (local12 == 1) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class136_Sub1.aBoolean347 ? 1 : 0;
		} else if (local12 == 2) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class136_Sub1.aBoolean348 ? 1 : 0;
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ard", name = "y", descriptor = "()Ljava/lang/Object;")
	abstract Object method23607();

	@OriginalMember(owner = "client!ard", name = "p", descriptor = "(I)Ljava/lang/Object;")
	abstract Object method23608();

	@OriginalMember(owner = "client!ard", name = "c", descriptor = "(S)Z")
	abstract boolean method23609();

	@OriginalMember(owner = "client!ard", name = "v", descriptor = "()Ljava/lang/Object;")
	abstract Object method23610();

	@OriginalMember(owner = "client!ard", name = "l", descriptor = "()Ljava/lang/Object;")
	abstract Object method23611();

	@OriginalMember(owner = "client!ard", name = "w", descriptor = "()Z")
	abstract boolean method23612();

	@OriginalMember(owner = "client!ard", name = "t", descriptor = "()Z")
	abstract boolean method23613();
}
