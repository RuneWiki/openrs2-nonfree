package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xh")
final class Class643 implements Runnable {

	@OriginalMember(owner = "client!xh", name = "ek", descriptor = "Lclient!pn;")
	public static Class469 aClass469_3;

	@OriginalMember(owner = "client!xh", name = "run", descriptor = "()V", line = 29)
	@Override
	public void run() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!xh", name = "r", descriptor = "()V", line = 29)
	public void method32812() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!xh", name = "g", descriptor = "()V", line = 29)
	public void method32813() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!xh", name = "av", descriptor = "(Lclient!yf;B)V", line = 4490)
	static final void method32814(@OriginalArg(0) Class665 arg0) {
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = arg0.anObjectArray46[arg0.anIntArray535[arg0.anInt5786 * 662605117]];
	}

	@OriginalMember(owner = "client!xh", name = "lx", descriptor = "(Lclient!yf;B)V", line = 6647)
	static final void method32815(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class595.method31913(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!xh", name = "pz", descriptor = "(Lclient!yf;I)V", line = 7404)
	static final void method32816(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3873 * -612037017;
	}

	@OriginalMember(owner = "client!xh", name = "sr", descriptor = "(Lclient!yf;B)V", line = 7936)
	static final void method32817(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3910 * 1843164247;
	}
}
