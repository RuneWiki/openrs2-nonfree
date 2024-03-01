package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public abstract class Class51 {

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	static final int anInt1106 = 512;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
	static final int anInt1107 = 100;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
	static final int anInt1108 = 20;

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
	static final int anInt1112 = 5;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
	static final int anInt1114 = 3;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	static final int anInt1117 = 5;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
	int anInt1110;

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "J")
	long aLong39;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "Lclient!wc;")
	Class546 aClass546_8 = new Class546();

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "Lclient!wc;")
	Class546 aClass546_5 = new Class546();

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "Lclient!wc;")
	Class546 aClass546_7 = new Class546();

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!wc;")
	Class546 aClass546_6 = new Class546();

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient!ahb;")
	Class3_Sub41 aClass3_Sub41_4 = new Class3_Sub41(6);

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "B")
	byte aByte33 = 0;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
	public volatile int anInt1113 = 0;

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
	public volatile int anInt1115 = 0;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	public volatile int anInt1109 = 155394861;

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
	public volatile int anInt1116 = -1698205817;

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Lclient!ahb;")
	Class3_Sub41 aClass3_Sub41_5 = new Class3_Sub41(5);

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "Lclient!ahb;")
	Class3_Sub41 aClass3_Sub41_6 = new Class3_Sub41(5);

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
	int anInt1111 = 0;

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "Lclient!aor;")
	Class3_Sub1_Sub12_Sub3 aClass3_Sub1_Sub12_Sub3_2 = null;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 30)
	Class51() {
	}

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "(IIBZB)Lclient!aor;", line = 33)
	Class3_Sub1_Sub12_Sub3 method9818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long local7 = ((long) arg0 << 32) + (long) arg1;
		@Pc(11) Class3_Sub1_Sub12_Sub3 local11 = new Class3_Sub1_Sub12_Sub3();
		local11.aLong297 = local7 * -2199417693621122125L;
		local11.aByte98 = arg2;
		local11.aBoolean515 = arg3;
		if (arg3) {
			if (this.method9835() >= 100) {
				throw new RuntimeException();
			}
			this.aClass546_8.method32621(local11);
		} else if (this.method9828() < 20) {
			this.aClass546_7.method32621(local11);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "(IIBZ)Lclient!aor;", line = 33)
	Class3_Sub1_Sub12_Sub3 method9830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long local7 = ((long) arg0 << 32) + (long) arg1;
		@Pc(11) Class3_Sub1_Sub12_Sub3 local11 = new Class3_Sub1_Sub12_Sub3();
		local11.aLong297 = local7 * -2199417693621122125L;
		local11.aByte98 = arg2;
		local11.aBoolean515 = arg3;
		if (arg3) {
			if (this.method9835() >= 100) {
				throw new RuntimeException();
			}
			this.aClass546_8.method32621(local11);
		} else if (this.method9828() < 20) {
			this.aClass546_7.method32621(local11);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "(IIBZ)Lclient!aor;", line = 33)
	Class3_Sub1_Sub12_Sub3 method9831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long local7 = ((long) arg0 << 32) + (long) arg1;
		@Pc(11) Class3_Sub1_Sub12_Sub3 local11 = new Class3_Sub1_Sub12_Sub3();
		local11.aLong297 = local7 * -2199417693621122125L;
		local11.aByte98 = arg2;
		local11.aBoolean515 = arg3;
		if (arg3) {
			if (this.method9835() >= 100) {
				throw new RuntimeException();
			}
			this.aClass546_8.method32621(local11);
		} else if (this.method9828() < 20) {
			this.aClass546_7.method32621(local11);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)Z", line = 54)
	public boolean method9819() {
		return this.method9828() >= 20;
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "()Z", line = 54)
	public boolean method9839() {
		return this.method9828() >= 20;
	}

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "(I)Z", line = 58)
	public boolean method9820() {
		return this.method9835() >= 100;
	}

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "()Z", line = 58)
	public boolean method9832() {
		return this.method9835() >= 100;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "()Z", line = 58)
	public boolean method9833() {
		return this.method9835() >= 100;
	}

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "()I", line = 62)
	int method9821() {
		return this.aClass546_7.method32626() + this.aClass546_6.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "()I", line = 62)
	int method9822() {
		return this.aClass546_7.method32626() + this.aClass546_6.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "(I)I", line = 62)
	int method9828() {
		return this.aClass546_7.method32626() + this.aClass546_6.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "()I", line = 62)
	int method9834() {
		return this.aClass546_7.method32626() + this.aClass546_6.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "()I", line = 62)
	int method9848() {
		return this.aClass546_7.method32626() + this.aClass546_6.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "(I)I", line = 66)
	public int method9835() {
		return this.aClass546_8.method32626() + this.aClass546_5.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "()I", line = 66)
	public int method9836() {
		return this.aClass546_8.method32626() + this.aClass546_5.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "()I", line = 66)
	public int method9840() {
		return this.aClass546_8.method32626() + this.aClass546_5.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "()I", line = 66)
	public int method9841() {
		return this.aClass546_8.method32626() + this.aClass546_5.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "()I", line = 66)
	public int method9842() {
		return this.aClass546_8.method32626() + this.aClass546_5.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "at", descriptor = "()I", line = 66)
	public int method9843() {
		return this.aClass546_8.method32626() + this.aClass546_5.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "()I", line = 66)
	public int method9852() {
		return this.aClass546_8.method32626() + this.aClass546_5.method32626();
	}

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "(IIIB)I", line = 1593)
	static final int method9862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(13) int local13 = arg1 / arg2;
		@Pc(19) int local19 = arg1 & arg2 - 1;
		@Pc(24) int local24 = Class538.method32561(local3, local13);
		@Pc(31) int local31 = Class538.method32561(local3 + 1, local13);
		@Pc(38) int local38 = Class538.method32561(local3, local13 + 1);
		@Pc(47) int local47 = Class538.method32561(local3 + 1, local13 + 1);
		@Pc(54) int local54 = Class525.method32382(local24, local31, local9, arg2);
		@Pc(61) int local61 = Class525.method32382(local38, local47, local9, arg2);
		return Class525.method32382(local54, local61, local19, arg2);
	}

	@OriginalMember(owner = "client!nk", name = "ed", descriptor = "(Lclient!vs;I)V", line = 4874)
	static final void method9861(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class245.method24866(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!nk", name = "fe", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5045)
	static final void method9860(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 624249098;
		arg0.anInt3526 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * 1885353519;
		arg0.anInt3521 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * 1945181181;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!nk", name = "xu", descriptor = "(Lclient!vs;I)V", line = 8414)
	static final void method9858(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class206.aByte128;
	}

	@OriginalMember(owner = "client!nk", name = "aqp", descriptor = "(Lclient!vs;B)V", line = 11965)
	static final void method9859(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class586.method33284(1, local13 << 16 | local23, local33, "");
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
	public abstract void method9817();

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "(III)V")
	abstract void method9823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nk", name = "aq", descriptor = "()V")
	public abstract void method9824();

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "(Ljava/lang/Object;ZI)V")
	public abstract void method9825(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "(ZI)V")
	public abstract void method9826(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	public abstract void method9827();

	@OriginalMember(owner = "client!nk", name = "ak", descriptor = "(II)V")
	abstract void method9829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "(B)V")
	public abstract void method9837();

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "(I)Z")
	public abstract boolean method9838();

	@OriginalMember(owner = "client!nk", name = "af", descriptor = "(II)V")
	abstract void method9844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nk", name = "an", descriptor = "(Z)V")
	public abstract void method9845(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nk", name = "aa", descriptor = "(Ljava/lang/Object;Z)V")
	public abstract void method9846(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!nk", name = "ah", descriptor = "(Z)V")
	public abstract void method9847(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nk", name = "aj", descriptor = "()V")
	public abstract void method9849();

	@OriginalMember(owner = "client!nk", name = "as", descriptor = "()V")
	public abstract void method9850();

	@OriginalMember(owner = "client!nk", name = "ai", descriptor = "()V")
	public abstract void method9851();

	@OriginalMember(owner = "client!nk", name = "av", descriptor = "()V")
	public abstract void method9853();

	@OriginalMember(owner = "client!nk", name = "ax", descriptor = "()V")
	public abstract void method9854();

	@OriginalMember(owner = "client!nk", name = "az", descriptor = "()V")
	public abstract void method9855();

	@OriginalMember(owner = "client!nk", name = "al", descriptor = "()V")
	public abstract void method9856();

	@OriginalMember(owner = "client!nk", name = "ao", descriptor = "()Z")
	public abstract boolean method9857();
}
