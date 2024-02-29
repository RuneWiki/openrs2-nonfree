package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amw")
public class Class143_Sub40 extends Class143 {

	@OriginalMember(owner = "client!amw", name = "w", descriptor = "I")
	public static final int anInt2302 = 1;

	@OriginalMember(owner = "client!amw", name = "t", descriptor = "I")
	static final int anInt2303 = 0;

	@OriginalMember(owner = "client!amw", name = "<init>", descriptor = "(Lclient!akq;)V", line = 12)
	public Class143_Sub40(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amw", name = "<init>", descriptor = "(ILclient!akq;)V", line = 16)
	public Class143_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amw", name = "i", descriptor = "(I)V", line = 20)
	public void method16202() {
		@Pc(5) int local5 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
		if (local5 != 3 && local5 != 5) {
			this.anInt2324 = 0;
		}
		if (this.aClass77_Sub35_44.method14392().method36354() < 2) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 != 0 && this.anInt2324 * 189295939 != 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amw", name = "u", descriptor = "()V", line = 20)
	public void method16203() {
		@Pc(5) int local5 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
		if (local5 != 3 && local5 != 5) {
			this.anInt2324 = 0;
		}
		if (this.aClass77_Sub35_44.method14392().method36354() < 2) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 != 0 && this.anInt2324 * 189295939 != 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amw", name = "e", descriptor = "()V", line = 20)
	public void method16204() {
		@Pc(5) int local5 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
		if (local5 != 3 && local5 != 5) {
			this.anInt2324 = 0;
		}
		if (this.aClass77_Sub35_44.method14392().method36354() < 2) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 != 0 && this.anInt2324 * 189295939 != 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amw", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16256() {
		@Pc(5) int local5 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!amw", name = "t", descriptor = "()I", line = 27)
	@Override
	int method16257() {
		@Pc(5) int local5 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!amw", name = "w", descriptor = "()I", line = 27)
	@Override
	int method16260() {
		@Pc(5) int local5 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!amw", name = "y", descriptor = "()I", line = 27)
	@Override
	int method16259() {
		@Pc(5) int local5 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
		return local5 == 3 || local5 == 5 ? 0 : 0;
	}

	@OriginalMember(owner = "client!amw", name = "c", descriptor = "(II)I", line = 33)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass77_Sub35_44.method14392().method36354() < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!amw", name = "s", descriptor = "(I)I", line = 33)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass77_Sub35_44.method14392().method36354() < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!amw", name = "r", descriptor = "(I)I", line = 33)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass77_Sub35_44.method14392().method36354() < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!amw", name = "g", descriptor = "(I)I", line = 33)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass77_Sub35_44.method14392().method36354() < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!amw", name = "z", descriptor = "(I)I", line = 33)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return 1;
		} else if (this.aClass77_Sub35_44.method14392().method36354() < 2) {
			return 3;
		} else {
			@Pc(19) int local19 = this.aClass77_Sub35_44.aClass143_Sub6_2.method15109();
			return local19 == 3 || local19 == 5 ? 1 : 3;
		}
	}

	@OriginalMember(owner = "client!amw", name = "d", descriptor = "(I)V", line = 41)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amw", name = "l", descriptor = "(II)V", line = 41)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amw", name = "x", descriptor = "(I)V", line = 41)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amw", name = "q", descriptor = "(I)V", line = 41)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amw", name = "o", descriptor = "()I", line = 45)
	public int method16205() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amw", name = "k", descriptor = "(S)I", line = 45)
	public int method16206() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amw", name = "f", descriptor = "()I", line = 45)
	public int method16207() {
		return this.anInt2324 * 189295939;
	}
}
