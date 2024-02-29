package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public class Class1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	int anInt1;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	int anInt2;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 1011)
	Class1() {
	}

	@OriginalMember(owner = "client!a", name = "acm", descriptor = "(Lclient!yf;I)V", line = 9537)
	static final void method1(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 % local23;
	}

	@OriginalMember(owner = "client!a", name = "alw", descriptor = "(Lclient!yf;B)V", line = 11623)
	static final void method2(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(37) Class312 local37 = Class459.method29504(local13);
		@Pc(40) float local40 = (float) local23;
		if (Class312.aClass312_5 == local37 || local37 == Class312.aClass312_6 || Class312.aClass312_7 == local37) {
			local40 = Class436.method28911(local23);
		}
		@Pc(65) Class77_Sub1_Sub12_Sub2 local65 = new Class77_Sub1_Sub12_Sub2(Class597.aClass107_Sub1_2.method8934(), local37, local40, (float) local33 / 1000.0F);
		Class597.aClass107_Sub1_2.method8846(local65);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local65.anInt3212 * -997430305;
	}

	@OriginalMember(owner = "client!a", name = "ash", descriptor = "(Lclient!yf;I)V", line = 12607)
	static final void method3(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(42) long local42 = Class149_Sub3.method16726(0, 0, 12, local13, local23, local33);
		@Pc(45) int local45 = Class628.method32559(local42);
		if (local33 < 1970) {
			local45--;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local45;
	}
}
