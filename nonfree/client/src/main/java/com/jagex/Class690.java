package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zh")
public class Class690 implements Interface75 {

	@OriginalMember(owner = "client!zh", name = "p", descriptor = "Lclient!zh;")
	static final Class690 aClass690_5 = new Class690(-1);

	@OriginalMember(owner = "client!zh", name = "c", descriptor = "Lclient!zh;")
	public static final Class690 aClass690_3 = new Class690(-2);

	@OriginalMember(owner = "client!zh", name = "v", descriptor = "Lclient!zh;")
	public static final Class690 aClass690_4 = new Class690(-3);

	@OriginalMember(owner = "client!zh", name = "l", descriptor = "Lclient!zh;")
	static final Class690 aClass690_2 = new Class690(-4);

	@OriginalMember(owner = "client!zh", name = "y", descriptor = "Lclient!zh;")
	public static final Class690 aClass690_6 = new Class690(-5);

	@OriginalMember(owner = "client!zh", name = "w", descriptor = "Lclient!zh;")
	public static final Class690 aClass690_7 = new Class690(2);

	@OriginalMember(owner = "client!zh", name = "t", descriptor = "Lclient!zh;")
	static final Class690 aClass690_8 = new Class690(3);

	@OriginalMember(owner = "client!zh", name = "q", descriptor = "Lclient!zh;")
	static final Class690 aClass690_11 = new Class690(7);

	@OriginalMember(owner = "client!zh", name = "x", descriptor = "Lclient!zh;")
	static final Class690 aClass690_10 = new Class690(9);

	@OriginalMember(owner = "client!zh", name = "d", descriptor = "Lclient!zh;")
	static final Class690 aClass690_9 = new Class690(37);

	@OriginalMember(owner = "client!zh", name = "s", descriptor = "I")
	final int anInt5875;

	@OriginalMember(owner = "client!zh", name = "v", descriptor = "()[Lclient!zh;", line = 21)
	public static Class690[] method36317() {
		return new Class690[] { aClass690_4, aClass690_5, aClass690_3, aClass690_7, aClass690_6, aClass690_11, aClass690_10, aClass690_8, aClass690_9, aClass690_2 };
	}

	@OriginalMember(owner = "client!zh", name = "w", descriptor = "()[Lclient!zh;", line = 21)
	public static Class690[] method36318() {
		return new Class690[] { aClass690_4, aClass690_5, aClass690_3, aClass690_7, aClass690_6, aClass690_11, aClass690_10, aClass690_8, aClass690_9, aClass690_2 };
	}

	@OriginalMember(owner = "client!zh", name = "<init>", descriptor = "(I)V", line = 24)
	Class690(@OriginalArg(0) int arg0) {
		this.anInt5875 = arg0 * 867337653;
	}

	@OriginalMember(owner = "client!zh", name = "c", descriptor = "()I", line = 29)
	@Override
	public int method36479() {
		return this.anInt5875 * 1341391005;
	}

	@OriginalMember(owner = "client!zh", name = "l", descriptor = "()I", line = 29)
	@Override
	public int method36478() {
		return this.anInt5875 * 1341391005;
	}

	@OriginalMember(owner = "client!zh", name = "y", descriptor = "()I", line = 29)
	@Override
	public int method36477() {
		return this.anInt5875 * 1341391005;
	}

	@OriginalMember(owner = "client!zh", name = "q", descriptor = "(IB)I", line = 74)
	public static int method36319(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!zh", name = "k", descriptor = "(Lclient!yf;I)V", line = 92)
	static void method36320(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class155.method23635();
	}
}
