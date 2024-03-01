package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class285 {

	@OriginalMember(owner = "client!kq", name = "bw", descriptor = "I")
	public static int anInt4357;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "Ljava/lang/Object;")
	final Object anObject16;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
	int anInt4356;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "(Lclient!ahb;I)Lclient!sk;", line = 12)
	public static Interface50 method25471(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) Class451 local5 = Class196.method24108(arg0.method20269());
		if (local5 == Class451.aClass451_1) {
			return Class339.method26433(arg0);
		} else if (Class451.aClass451_2 == local5) {
			return Class489.method29234(arg0);
		} else if (local5 == Class451.aClass451_3) {
			return Class377.method27241(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 157)
	Class285(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		this.anObject16 = arg0;
		this.anInt4356 = arg1 * -869056105;
	}

	@OriginalMember(owner = "client!kq", name = "fx", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4986)
	static final void method25475(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean634 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!kq", name = "sc", descriptor = "(Lclient!vs;B)V", line = 7405)
	static final void method25472(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(18) Class3_Sub42 local18 = (Class3_Sub42) client.aClass581_22.method33217((long) local12);
		if (local18 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
		}
	}

	@OriginalMember(owner = "client!kq", name = "ami", descriptor = "(Lclient!vs;I)V", line = 11325)
	static final void method25473(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1 ? 1 : 0);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}

	@OriginalMember(owner = "client!kq", name = "atd", descriptor = "(Lclient!vs;I)V", line = 12477)
	static final void method25474(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub30_1.method14599(local12);
	}
}
