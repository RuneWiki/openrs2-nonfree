package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alv")
public class Class143_Sub17 extends Class143 {

	@OriginalMember(owner = "client!alv", name = "t", descriptor = "I")
	public static final int anInt2145 = 1;

	@OriginalMember(owner = "client!alv", name = "w", descriptor = "I")
	static final int anInt2146 = 2;

	@OriginalMember(owner = "client!alv", name = "q", descriptor = "I")
	public static final int anInt2147 = 0;

	@OriginalMember(owner = "client!alv", name = "<init>", descriptor = "(Lclient!akq;)V", line = 13)
	public Class143_Sub17(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alv", name = "<init>", descriptor = "(ILclient!akq;)V", line = 17)
	public Class143_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!alv", name = "i", descriptor = "(I)V", line = 21)
	public void method15457() {
		if (this.aClass77_Sub35_44.method14391() != Class670.aClass670_5) {
			this.anInt2324 = 1823770475;
		}
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
				this.anInt2324 = this.method16256() * 1823770475;
			}
		} else if (this.anInt2324 * 189295939 != 0 && this.anInt2324 * 189295939 != 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alv", name = "e", descriptor = "()V", line = 21)
	public void method15458() {
		if (this.aClass77_Sub35_44.method14391() != Class670.aClass670_5) {
			this.anInt2324 = 1823770475;
		}
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
				this.anInt2324 = this.method16256() * 1823770475;
			}
		} else if (this.anInt2324 * 189295939 != 0 && this.anInt2324 * 189295939 != 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alv", name = "f", descriptor = "()V", line = 21)
	public void method15459() {
		if (this.aClass77_Sub35_44.method14391() != Class670.aClass670_5) {
			this.anInt2324 = 1823770475;
		}
		if (this.aClass77_Sub35_44.method14392().method36362()) {
			if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
				this.anInt2324 = this.method16256() * 1823770475;
			}
		} else if (this.anInt2324 * 189295939 != 0 && this.anInt2324 * 189295939 != 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alv", name = "p", descriptor = "(I)I", line = 31)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!alv", name = "t", descriptor = "()I", line = 31)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!alv", name = "y", descriptor = "()I", line = 31)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!alv", name = "w", descriptor = "()I", line = 31)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!alv", name = "k", descriptor = "(I)Z", line = 35)
	public boolean method15460() {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5;
	}

	@OriginalMember(owner = "client!alv", name = "o", descriptor = "()Z", line = 35)
	public boolean method15461() {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5;
	}

	@OriginalMember(owner = "client!alv", name = "c", descriptor = "(II)I", line = 40)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		if (this.aClass77_Sub35_44.method14391() == Class670.aClass670_5) {
			return arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!alv", name = "s", descriptor = "(I)I", line = 40)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		if (this.aClass77_Sub35_44.method14391() == Class670.aClass670_5) {
			return arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!alv", name = "r", descriptor = "(I)I", line = 40)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		if (this.aClass77_Sub35_44.method14391() == Class670.aClass670_5) {
			return arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!alv", name = "g", descriptor = "(I)I", line = 40)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		if (this.aClass77_Sub35_44.method14391() == Class670.aClass670_5) {
			return arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!alv", name = "z", descriptor = "(I)I", line = 40)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		if (this.aClass77_Sub35_44.method14391() == Class670.aClass670_5) {
			return arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!alv", name = "l", descriptor = "(II)V", line = 48)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alv", name = "x", descriptor = "(I)V", line = 48)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alv", name = "d", descriptor = "(I)V", line = 48)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alv", name = "q", descriptor = "(I)V", line = 48)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alv", name = "b", descriptor = "()I", line = 52)
	public int method15462() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alv", name = "u", descriptor = "(B)I", line = 52)
	public int method15463() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alv", name = "ajo", descriptor = "(Lclient!yf;I)V", line = 11154)
	static final void method15464(@OriginalArg(0) Class665 arg0) {
		System.out.println(arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147]);
	}
}
