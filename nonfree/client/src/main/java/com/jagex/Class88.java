package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public abstract class Class88 {

	@OriginalMember(owner = "client!cj", name = "cw", descriptor = "I")
	public static int anInt610;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
	public final int anInt607;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	public final int anInt606;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
	public final int anInt608;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
	public final int anInt609;

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "[[I")
	public final int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(III[[I)V", line = 10)
	Class88(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt607 = arg0 * -1150957665;
		this.anInt606 = arg1 * -637418183;
		@Pc(13) int local13 = 0;
		while (arg2 > 1) {
			local13++;
			arg2 >>= 0x1;
		}
		this.anInt608 = (0x1 << local13) * 126844975;
		this.anInt609 = local13 * 933223795;
		this.anIntArrayArray10 = arg3;
	}

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "(B)V", line = 16)
	public static void method5492() {
		if (Class159.aBoolean554) {
			return;
		}
		Class245.method26120(client.aClass517_1.method30435().aClass567ArrayArrayArray2);
		if (client.aClass517_1.method30435().aClass567ArrayArrayArray3 != null) {
			Class245.method26120(client.aClass517_1.method30435().aClass567ArrayArrayArray3);
		}
		Class159.aBoolean554 = true;
	}

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "(III)I", line = 31)
	public final int method5493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt609 * -1495101509;
		@Pc(13) int local13 = arg1 >> this.anInt609 * -1495101509;
		if (local6 < 0 || local13 < 0 || local6 > this.anInt607 * -1924295585 - 1 || local13 > this.anInt606 * -1466328823 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & this.anInt608 * 127780559 - 1;
		@Pc(53) int local53 = arg1 & this.anInt608 * 127780559 - 1;
		@Pc(83) int local83 = local44 * this.anIntArrayArray10[local6 + 1][local13] + (this.anInt608 * 127780559 - local44) * this.anIntArrayArray10[local6][local13] >> this.anInt609 * -1495101509;
		@Pc(117) int local117 = this.anIntArrayArray10[local6][local13 + 1] * (this.anInt608 * 127780559 - local44) + local44 * this.anIntArrayArray10[local6 + 1][local13 + 1] >> this.anInt609 * -1495101509;
		return local117 * local53 + (this.anInt608 * 127780559 - local53) * local83 >> this.anInt609 * -1495101509;
	}

	@OriginalMember(owner = "client!cj", name = "am", descriptor = "(II)I", line = 31)
	public final int method5494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt609 * -1495101509;
		@Pc(13) int local13 = arg1 >> this.anInt609 * -1495101509;
		if (local6 < 0 || local13 < 0 || local6 > this.anInt607 * -1924295585 - 1 || local13 > this.anInt606 * -1466328823 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & this.anInt608 * 127780559 - 1;
		@Pc(53) int local53 = arg1 & this.anInt608 * 127780559 - 1;
		@Pc(83) int local83 = local44 * this.anIntArrayArray10[local6 + 1][local13] + (this.anInt608 * 127780559 - local44) * this.anIntArrayArray10[local6][local13] >> this.anInt609 * -1495101509;
		@Pc(117) int local117 = this.anIntArrayArray10[local6][local13 + 1] * (this.anInt608 * 127780559 - local44) + local44 * this.anIntArrayArray10[local6 + 1][local13 + 1] >> this.anInt609 * -1495101509;
		return local117 * local53 + (this.anInt608 * 127780559 - local53) * local83 >> this.anInt609 * -1495101509;
	}

	@OriginalMember(owner = "client!cj", name = "ay", descriptor = "(II)I", line = 31)
	public final int method5495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt609 * -1495101509;
		@Pc(13) int local13 = arg1 >> this.anInt609 * -1495101509;
		if (local6 < 0 || local13 < 0 || local6 > this.anInt607 * -1924295585 - 1 || local13 > this.anInt606 * -1466328823 - 1) {
			return 0;
		}
		@Pc(44) int local44 = arg0 & this.anInt608 * 127780559 - 1;
		@Pc(53) int local53 = arg1 & this.anInt608 * 127780559 - 1;
		@Pc(83) int local83 = local44 * this.anIntArrayArray10[local6 + 1][local13] + (this.anInt608 * 127780559 - local44) * this.anIntArrayArray10[local6][local13] >> this.anInt609 * -1495101509;
		@Pc(117) int local117 = this.anIntArrayArray10[local6][local13 + 1] * (this.anInt608 * 127780559 - local44) + local44 * this.anIntArrayArray10[local6 + 1][local13 + 1] >> this.anInt609 * -1495101509;
		return local117 * local53 + (this.anInt608 * 127780559 - local53) * local83 >> this.anInt609 * -1495101509;
	}

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "(III)I", line = 42)
	public final int method5496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt609 * -1495101509;
		@Pc(13) int local13 = arg1 >> this.anInt609 * -1495101509;
		@Pc(24) int local24 = Math.min(this.anInt607 * -1924295585 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt606 * -1466328823 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt607 * -1924295585 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt606 * -1466328823 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt608 * 127780559 - 1;
		@Pc(75) int local75 = arg1 & this.anInt608 * 127780559 - 1;
		@Pc(103) int local103 = this.anIntArrayArray10[local24][local35] * (this.anInt608 * 127780559 - local66) + local66 * this.anIntArrayArray10[local46][local35] >> this.anInt609 * -1495101509;
		@Pc(131) int local131 = local66 * this.anIntArrayArray10[local46][local57] + (this.anInt608 * 127780559 - local66) * this.anIntArrayArray10[local24][local57] >> this.anInt609 * -1495101509;
		return (this.anInt608 * 127780559 - local75) * local103 + local75 * local131 >> this.anInt609 * -1495101509;
	}

	@OriginalMember(owner = "client!cj", name = "af", descriptor = "(II)I", line = 42)
	public final int method5497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt609 * -1495101509;
		@Pc(13) int local13 = arg1 >> this.anInt609 * -1495101509;
		@Pc(24) int local24 = Math.min(this.anInt607 * -1924295585 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt606 * -1466328823 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt607 * -1924295585 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt606 * -1466328823 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt608 * 127780559 - 1;
		@Pc(75) int local75 = arg1 & this.anInt608 * 127780559 - 1;
		@Pc(103) int local103 = this.anIntArrayArray10[local24][local35] * (this.anInt608 * 127780559 - local66) + local66 * this.anIntArrayArray10[local46][local35] >> this.anInt609 * -1495101509;
		@Pc(131) int local131 = local66 * this.anIntArrayArray10[local46][local57] + (this.anInt608 * 127780559 - local66) * this.anIntArrayArray10[local24][local57] >> this.anInt609 * -1495101509;
		return (this.anInt608 * 127780559 - local75) * local103 + local75 * local131 >> this.anInt609 * -1495101509;
	}

	@OriginalMember(owner = "client!cj", name = "an", descriptor = "(II)I", line = 42)
	public final int method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt609 * -1495101509;
		@Pc(13) int local13 = arg1 >> this.anInt609 * -1495101509;
		@Pc(24) int local24 = Math.min(this.anInt607 * -1924295585 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt606 * -1466328823 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt607 * -1924295585 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt606 * -1466328823 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt608 * 127780559 - 1;
		@Pc(75) int local75 = arg1 & this.anInt608 * 127780559 - 1;
		@Pc(103) int local103 = this.anIntArrayArray10[local24][local35] * (this.anInt608 * 127780559 - local66) + local66 * this.anIntArrayArray10[local46][local35] >> this.anInt609 * -1495101509;
		@Pc(131) int local131 = local66 * this.anIntArrayArray10[local46][local57] + (this.anInt608 * 127780559 - local66) * this.anIntArrayArray10[local24][local57] >> this.anInt609 * -1495101509;
		return (this.anInt608 * 127780559 - local75) * local103 + local75 * local131 >> this.anInt609 * -1495101509;
	}

	@OriginalMember(owner = "client!cj", name = "ab", descriptor = "(II)I", line = 42)
	public final int method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 >> this.anInt609 * -1495101509;
		@Pc(13) int local13 = arg1 >> this.anInt609 * -1495101509;
		@Pc(24) int local24 = Math.min(this.anInt607 * -1924295585 - 1, Math.max(0, local6));
		@Pc(35) int local35 = Math.min(this.anInt606 * -1466328823 - 1, Math.max(0, local13));
		@Pc(46) int local46 = Math.min(this.anInt607 * -1924295585 - 1, local24 + 1);
		@Pc(57) int local57 = Math.min(this.anInt606 * -1466328823 - 1, local35 + 1);
		@Pc(66) int local66 = arg0 & this.anInt608 * 127780559 - 1;
		@Pc(75) int local75 = arg1 & this.anInt608 * 127780559 - 1;
		@Pc(103) int local103 = this.anIntArrayArray10[local24][local35] * (this.anInt608 * 127780559 - local66) + local66 * this.anIntArrayArray10[local46][local35] >> this.anInt609 * -1495101509;
		@Pc(131) int local131 = local66 * this.anIntArrayArray10[local46][local57] + (this.anInt608 * 127780559 - local66) * this.anIntArrayArray10[local24][local57] >> this.anInt609 * -1495101509;
		return (this.anInt608 * 127780559 - local75) * local103 + local75 * local131 >> this.anInt609 * -1495101509;
	}

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "(III)I", line = 56)
	public final int method5500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray10[arg0][arg1];
	}

	@OriginalMember(owner = "client!cj", name = "aa", descriptor = "(II)I", line = 56)
	public final int method5501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray10[arg0][arg1];
	}

	@OriginalMember(owner = "client!cj", name = "ap", descriptor = "(II)I", line = 56)
	public final int method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray10[arg0][arg1];
	}

	@OriginalMember(owner = "client!cj", name = "aw", descriptor = "(II)I", line = 56)
	public final int method5503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray10[arg0][arg1];
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 58)
	public static void method5504() {
		Class521.method30579();
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(III)I", line = 60)
	public final int method5505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray10[Math.min(this.anInt607 * -1924295585 - 1, Math.max(0, arg0))][Math.min(this.anInt606 * -1466328823 - 1, Math.max(0, arg1))];
	}

	@OriginalMember(owner = "client!cj", name = "az", descriptor = "(II)I", line = 60)
	public final int method5506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray10[Math.min(this.anInt607 * -1924295585 - 1, Math.max(0, arg0))][Math.min(this.anInt606 * -1466328823 - 1, Math.max(0, arg1))];
	}

	@OriginalMember(owner = "client!cj", name = "aen", descriptor = "(Lclient!yf;B)V", line = 9946)
	static final void method5507(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class18) Class537.aClass35_Sub7_1.method18319(local12)).anInt70 * 83792657;
	}

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "(III)V")
	public abstract void method5508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II[I[I[I[I[I[I[I[ILclient!db;Z)V")
	public abstract void method5509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class202 arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!db;Z)V")
	public abstract void method5510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class202 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "()V")
	public abstract void method5511();

	@OriginalMember(owner = "client!cj", name = "aq", descriptor = "(Lclient!ajv;[I)V")
	public abstract void method5512(@OriginalArg(0) Class77_Sub22 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cj", name = "ae", descriptor = "(Lclient!arp;IIIIZ)Z")
	public abstract boolean method5513(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "(III[[ZZI)V")
	public abstract void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cj", name = "au", descriptor = "(IILclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method5515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2);

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "(Lclient!arp;IIIIZ)V")
	public abstract void method5516(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "(Lclient!arp;IIIIZ)V")
	public abstract void method5517(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "(Lclient!arp;IIIIZ)Z")
	public abstract boolean method5518(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cj", name = "av", descriptor = "(Lclient!arp;IIIIZ)V")
	public abstract void method5519(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "(III[[ZZI)V")
	public abstract void method5520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "(III)V")
	public abstract void method5521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "(III)V")
	public abstract void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(III)V")
	public abstract void method5523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!db;Z)V")
	public abstract void method5524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class202 arg13, @OriginalArg(14) boolean arg14);

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "(III)V")
	public abstract void method5525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "()V")
	public abstract void method5526();

	@OriginalMember(owner = "client!cj", name = "ad", descriptor = "(Lclient!arp;IIIIZ)V")
	public abstract void method5527(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "(III[[ZZI)V")
	public abstract void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "(III[[ZZI)V")
	public abstract void method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cj", name = "aj", descriptor = "(III[[ZZI)V")
	public abstract void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cj", name = "ac", descriptor = "(Lclient!arp;IIIIZ)V")
	public abstract void method5532(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cj", name = "ag", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7);

	@OriginalMember(owner = "client!cj", name = "al", descriptor = "(IILclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2);

	@OriginalMember(owner = "client!cj", name = "ak", descriptor = "(IILclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2);

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "(II[I[I[I[I[I[I[I[ILclient!db;Z)V")
	public abstract void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class202 arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!cj", name = "ax", descriptor = "(IILclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method5537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2);

	@OriginalMember(owner = "client!cj", name = "ar", descriptor = "(IILclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method5538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2);

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "(IILclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method5539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2);

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7);

	@OriginalMember(owner = "client!cj", name = "ao", descriptor = "(IILclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method5541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2);

	@OriginalMember(owner = "client!cj", name = "at", descriptor = "(Lclient!arp;IIIIZ)V")
	public abstract void method5542(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "(Lclient!ajv;[I)V")
	public abstract void method5543(@OriginalArg(0) Class77_Sub22 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cj", name = "ah", descriptor = "(Lclient!arp;IIIIZ)V")
	public abstract void method5544(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cj", name = "as", descriptor = "(Lclient!arp;IIIIZ)V")
	public abstract void method5545(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cj", name = "ai", descriptor = "(III[[ZZI)V")
	public abstract void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);
}
