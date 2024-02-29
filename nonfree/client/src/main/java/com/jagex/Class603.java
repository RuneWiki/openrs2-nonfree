package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public class Class603 implements Interface75 {

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "Lclient!vr;")
	static final Class603 aClass603_3 = new Class603(0);

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "Lclient!vr;")
	static final Class603 aClass603_1 = new Class603(1);

	@OriginalMember(owner = "client!vr", name = "v", descriptor = "Lclient!vr;")
	static final Class603 aClass603_2 = new Class603(2);

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "Lclient!vr;")
	static final Class603 aClass603_4 = new Class603(3);

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "Lclient!vr;")
	static final Class603 aClass603_5 = new Class603(4);

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "Lclient!vr;")
	static final Class603 aClass603_6 = new Class603(5);

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "I")
	final int anInt5559;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "()[Lclient!vr;", line = 17)
	public static Class603[] method32055() {
		return new Class603[] { aClass603_5, aClass603_4, aClass603_2, aClass603_1, aClass603_3, aClass603_6 };
	}

	@OriginalMember(owner = "client!vr", name = "v", descriptor = "()[Lclient!vr;", line = 17)
	public static Class603[] method32056() {
		return new Class603[] { aClass603_5, aClass603_4, aClass603_2, aClass603_1, aClass603_3, aClass603_6 };
	}

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "()[Lclient!vr;", line = 17)
	public static Class603[] method32057() {
		return new Class603[] { aClass603_5, aClass603_4, aClass603_2, aClass603_1, aClass603_3, aClass603_6 };
	}

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "()[Lclient!vr;", line = 17)
	public static Class603[] method32058() {
		return new Class603[] { aClass603_5, aClass603_4, aClass603_2, aClass603_1, aClass603_3, aClass603_6 };
	}

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(I)V", line = 20)
	Class603(@OriginalArg(0) int arg0) {
		this.anInt5559 = arg0 * -1772624491;
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "()I", line = 25)
	@Override
	public int method36479() {
		return this.anInt5559 * -368362051;
	}

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "()I", line = 25)
	@Override
	public int method36478() {
		return this.anInt5559 * -368362051;
	}

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "()I", line = 25)
	@Override
	public int method36477() {
		return this.anInt5559 * -368362051;
	}

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)V", line = 647)
	public static void method32059() {
		if (Class307.aClass327_1 != null) {
			Class307.aClass327_1.method27570();
		}
		if (Class354.aThread7 == null) {
			return;
		}
		while (true) {
			try {
				Class354.aThread7.join();
				break;
			} catch (@Pc(11) InterruptedException local11) {
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "ox", descriptor = "(Lclient!yf;I)V", line = 7214)
	static final void method32060(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class285.method26726(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!vr", name = "rf", descriptor = "(Lclient!yf;I)V", line = 7784)
	static final void method32061(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		Class524.method30636(local16, arg0);
	}

	@OriginalMember(owner = "client!vr", name = "ut", descriptor = "(Lclient!yf;B)V", line = 8291)
	static final void method32062(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3414;
	}

	@OriginalMember(owner = "client!vr", name = "avo", descriptor = "(Lclient!yf;I)V", line = 13188)
	static final void method32063(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1.method15666() && Class284.aClass86_9.method20296() ? 1 : 0;
	}
}
