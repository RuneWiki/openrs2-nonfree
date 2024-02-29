package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public class Class365 {

	@OriginalMember(owner = "client!km", name = "r", descriptor = "I")
	static final int anInt4522 = 9;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "I")
	static final int anInt4523 = 3;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	static final int anInt4524 = 1;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "I")
	static final int anInt4525 = 10;

	@OriginalMember(owner = "client!km", name = "y", descriptor = "I")
	static final int anInt4526 = 2;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "I")
	static final int anInt4527 = 4;

	@OriginalMember(owner = "client!km", name = "x", descriptor = "I")
	static final int anInt4528 = 6;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	static final int anInt4529 = 7;

	@OriginalMember(owner = "client!km", name = "s", descriptor = "I")
	static final int anInt4530 = 8;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "I")
	static final int anInt4531 = 12;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "I")
	static final int anInt4532 = 5;

	@OriginalMember(owner = "client!km", name = "z", descriptor = "I")
	static final int anInt4533 = 11;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "I")
	static final int anInt4534 = 13;

	@OriginalMember(owner = "client!km", name = "k", descriptor = "I")
	static final int anInt4536 = 14;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "J")
	long aLong261;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "I")
	int anInt4535 = 828518333;

	@OriginalMember(owner = "client!km", name = "v", descriptor = "Lclient!zm;")
	Class695 aClass695_50 = new Class695();

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(Lclient!nb;Lclient!aaq;I)Lclient!ajt;", line = 24)
	public static Class77_Sub20 method28132(@OriginalArg(0) Class414 arg0, @OriginalArg(1) Class16 arg1) {
		@Pc(2) Class77_Sub20 local2 = Class144.method14993();
		local2.aClass414_1 = arg0;
		local2.anInt1527 = arg0.anInt4718 * 182467999;
		if (local2.anInt1527 * 393990279 == -1) {
			local2.aClass77_Sub39_Sub1_2 = new Class77_Sub39_Sub1(260);
		} else if (local2.anInt1527 * 393990279 == -2) {
			local2.aClass77_Sub39_Sub1_2 = new Class77_Sub39_Sub1(10000);
		} else if (local2.anInt1527 * 393990279 <= 18) {
			local2.aClass77_Sub39_Sub1_2 = new Class77_Sub39_Sub1(20);
		} else if (local2.anInt1527 * 393990279 <= 98) {
			local2.aClass77_Sub39_Sub1_2 = new Class77_Sub39_Sub1(100);
		} else {
			local2.aClass77_Sub39_Sub1_2 = new Class77_Sub39_Sub1(260);
		}
		local2.aClass77_Sub39_Sub1_2.method22167(arg1);
		local2.aClass77_Sub39_Sub1_2.method22169(local2.aClass414_1.anInt4717 * 145532973);
		local2.anInt1525 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!akv;)V", line = 26)
	public Class365(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method28134(arg0);
	}

	@OriginalMember(owner = "client!km", name = "l", descriptor = "(Lclient!akv;)V", line = 31)
	void method28133(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aLong261 = arg0.method22510() * -5749192068976987273L;
		this.anInt4535 = arg0.method22500() * -828518333;
		for (@Pc(17) int local17 = arg0.method22478(); local17 != 0; local17 = arg0.method22478()) {
			@Pc(28) Class77_Sub13 local28;
			if (local17 == 3) {
				local28 = new Class77_Sub13_Sub1(this);
			} else if (local17 == 1) {
				local28 = new Class77_Sub13_Sub5(this);
			} else if (local17 == 13) {
				local28 = new Class77_Sub13_Sub3(this);
			} else if (local17 == 4) {
				local28 = new Class77_Sub13_Sub14(this);
			} else if (local17 == 6) {
				local28 = new Class77_Sub13_Sub7(this);
			} else if (local17 == 5) {
				local28 = new Class77_Sub13_Sub4(this);
			} else if (local17 == 2) {
				local28 = new Class77_Sub13_Sub2(this);
			} else if (local17 == 7) {
				local28 = new Class77_Sub13_Sub6(this);
			} else if (local17 == 14) {
				local28 = new Class77_Sub13_Sub13(this);
			} else if (local17 == 8) {
				local28 = new Class77_Sub13_Sub12(this);
			} else if (local17 == 9) {
				local28 = new Class77_Sub13_Sub10(this);
			} else if (local17 == 10) {
				local28 = new Class77_Sub13_Sub9(this);
			} else if (local17 == 11) {
				local28 = new Class77_Sub13_Sub8(this);
			} else if (local17 == 12) {
				local28 = new Class77_Sub13_Sub11(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method21763(arg0);
			this.aClass695_50.method36383(local28);
		}
	}

	@OriginalMember(owner = "client!km", name = "p", descriptor = "(Lclient!akv;B)V", line = 31)
	void method28134(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aLong261 = arg0.method22510() * -5749192068976987273L;
		this.anInt4535 = arg0.method22500() * -828518333;
		for (@Pc(17) int local17 = arg0.method22478(); local17 != 0; local17 = arg0.method22478()) {
			@Pc(28) Class77_Sub13 local28;
			if (local17 == 3) {
				local28 = new Class77_Sub13_Sub1(this);
			} else if (local17 == 1) {
				local28 = new Class77_Sub13_Sub5(this);
			} else if (local17 == 13) {
				local28 = new Class77_Sub13_Sub3(this);
			} else if (local17 == 4) {
				local28 = new Class77_Sub13_Sub14(this);
			} else if (local17 == 6) {
				local28 = new Class77_Sub13_Sub7(this);
			} else if (local17 == 5) {
				local28 = new Class77_Sub13_Sub4(this);
			} else if (local17 == 2) {
				local28 = new Class77_Sub13_Sub2(this);
			} else if (local17 == 7) {
				local28 = new Class77_Sub13_Sub6(this);
			} else if (local17 == 14) {
				local28 = new Class77_Sub13_Sub13(this);
			} else if (local17 == 8) {
				local28 = new Class77_Sub13_Sub12(this);
			} else if (local17 == 9) {
				local28 = new Class77_Sub13_Sub10(this);
			} else if (local17 == 10) {
				local28 = new Class77_Sub13_Sub9(this);
			} else if (local17 == 11) {
				local28 = new Class77_Sub13_Sub8(this);
			} else if (local17 == 12) {
				local28 = new Class77_Sub13_Sub11(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method21763(arg0);
			this.aClass695_50.method36383(local28);
		}
	}

	@OriginalMember(owner = "client!km", name = "v", descriptor = "(Lclient!akv;)V", line = 31)
	void method28135(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aLong261 = arg0.method22510() * -5749192068976987273L;
		this.anInt4535 = arg0.method22500() * -828518333;
		for (@Pc(17) int local17 = arg0.method22478(); local17 != 0; local17 = arg0.method22478()) {
			@Pc(28) Class77_Sub13 local28;
			if (local17 == 3) {
				local28 = new Class77_Sub13_Sub1(this);
			} else if (local17 == 1) {
				local28 = new Class77_Sub13_Sub5(this);
			} else if (local17 == 13) {
				local28 = new Class77_Sub13_Sub3(this);
			} else if (local17 == 4) {
				local28 = new Class77_Sub13_Sub14(this);
			} else if (local17 == 6) {
				local28 = new Class77_Sub13_Sub7(this);
			} else if (local17 == 5) {
				local28 = new Class77_Sub13_Sub4(this);
			} else if (local17 == 2) {
				local28 = new Class77_Sub13_Sub2(this);
			} else if (local17 == 7) {
				local28 = new Class77_Sub13_Sub6(this);
			} else if (local17 == 14) {
				local28 = new Class77_Sub13_Sub13(this);
			} else if (local17 == 8) {
				local28 = new Class77_Sub13_Sub12(this);
			} else if (local17 == 9) {
				local28 = new Class77_Sub13_Sub10(this);
			} else if (local17 == 10) {
				local28 = new Class77_Sub13_Sub9(this);
			} else if (local17 == 11) {
				local28 = new Class77_Sub13_Sub8(this);
			} else if (local17 == 12) {
				local28 = new Class77_Sub13_Sub11(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method21763(arg0);
			this.aClass695_50.method36383(local28);
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(Lclient!kw;I)V", line = 58)
	public void method28136(@OriginalArg(0) Class368 arg0) {
		if (arg0.aLong264 * -1240730156808410261L != this.aLong261 * -1903610295825951161L || this.anInt4535 * 1012464747 != arg0.anInt4550 * -406614527) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class77_Sub13 local29 = (Class77_Sub13) this.aClass695_50.method36395(); local29 != null; local29 = (Class77_Sub13) this.aClass695_50.method36406()) {
			local29.method21764(arg0);
		}
		arg0.anInt4550 += 50360833;
	}

	@OriginalMember(owner = "client!km", name = "y", descriptor = "(Lclient!kw;)V", line = 58)
	public void method28137(@OriginalArg(0) Class368 arg0) {
		if (arg0.aLong264 * -1240730156808410261L != this.aLong261 * -1903610295825951161L || this.anInt4535 * 1012464747 != arg0.anInt4550 * -406614527) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class77_Sub13 local29 = (Class77_Sub13) this.aClass695_50.method36395(); local29 != null; local29 = (Class77_Sub13) this.aClass695_50.method36406()) {
			local29.method21764(arg0);
		}
		arg0.anInt4550 += 50360833;
	}

	@OriginalMember(owner = "client!km", name = "w", descriptor = "(Lclient!kw;)V", line = 58)
	public void method28138(@OriginalArg(0) Class368 arg0) {
		if (arg0.aLong264 * -1240730156808410261L != this.aLong261 * -1903610295825951161L || this.anInt4535 * 1012464747 != arg0.anInt4550 * -406614527) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class77_Sub13 local29 = (Class77_Sub13) this.aClass695_50.method36395(); local29 != null; local29 = (Class77_Sub13) this.aClass695_50.method36406()) {
			local29.method21764(arg0);
		}
		arg0.anInt4550 += 50360833;
	}
}
