package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public class Class429 {

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
	public static final int anInt4827 = 881;

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
	public static final int anInt4828 = 1;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V", line = 7)
	Class429() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!nv", name = "bi", descriptor = "(IB)Z", line = 1420)
	static boolean method28810(@OriginalArg(0) int arg0) {
		if (arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6 || arg0 == 1001 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 2;
		}
	}

	@OriginalMember(owner = "client!nv", name = "vu", descriptor = "(Lclient!yf;I)V", line = 8407)
	static final void method28811(@OriginalArg(0) Class665 arg0) {
		@Pc(13) Class77_Sub36 local13 = (Class77_Sub36) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13.anInt1778 * -1203728391;
	}

	@OriginalMember(owner = "client!nv", name = "yl", descriptor = "(Lclient!yf;B)V", line = 8993)
	static final void method28812(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3453 * -1050164879 == 0 || local12 >= client.anInt3532 * 2103713403) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
			return;
		}
		@Pc(25) Class217 local25 = client.aClass217Array1[local12];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local25.aString169;
		if (local25.aString171 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local25.aString171;
		}
	}

	@OriginalMember(owner = "client!nv", name = "apw", descriptor = "(Lclient!yf;I)V", line = 12256)
	static final void method28813(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		Class667.method33150();
		client.aBoolean598 = true;
	}
}
