package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public class Class549 {

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	static final int anInt5217 = 2048;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
	public static final int anInt5218 = 16384;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
	static final int anInt5219 = 2048;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	public static final int anInt5220 = 16384;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 9)
	Class549() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "(Lclient!akz;I)V", line = 67)
	public static void method30980(@OriginalArg(0) Class77_Sub42 arg0) {
		if (Class35_Sub22.method18346(client.anInt3390 * -1850530127)) {
			Class640.aClass147_Sub2_1.method15614(arg0);
		} else {
			arg0.method22720();
		}
	}

	@OriginalMember(owner = "client!tc", name = "amn", descriptor = "(Lclient!yf;I)V", line = 11790)
	static final void method30981(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class330 local16 = Class152.method17432(local12);
		if (local16 == null) {
			throw new RuntimeException();
		}
		Class597.aClass107_Sub1_2.method8803(local16);
	}
}
