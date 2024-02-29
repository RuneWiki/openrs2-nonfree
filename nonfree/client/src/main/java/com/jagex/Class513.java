package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public class Class513 {

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "Lclient!rl;")
	public static final Class513 aClass513_4 = new Class513();

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!rl;")
	static final Class513 aClass513_3 = new Class513();

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "Lclient!rl;")
	static final Class513 aClass513_5 = new Class513();

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 846)
	Class513() {
	}

	@OriginalMember(owner = "client!rl", name = "vr", descriptor = "(Lclient!yf;B)V", line = 8432)
	static final void method30344(@OriginalArg(0) Class665 arg0) {
		@Pc(3) Class595 local3 = new Class595();
		local3.method31898((Class77_Sub36) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147]);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local3.method31901();
	}

	@OriginalMember(owner = "client!rl", name = "ale", descriptor = "(Lclient!yf;I)V", line = 11491)
	static final void method30345(@OriginalArg(0) Class665 arg0) {
		@Pc(13) Class77_Sub36 local13 = (Class77_Sub36) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (Class597.aClass107_Sub1_2.method8879() != Class321.aClass321_9) {
			throw new RuntimeException();
		}
		@Pc(27) Class149_Sub1 local27 = (Class149_Sub1) Class597.aClass107_Sub1_2.method8873();
		local27.method15830(local13);
		client.aBoolean612 = true;
	}
}
