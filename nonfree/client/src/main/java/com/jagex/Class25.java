package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public abstract class Class25 implements Interface22 {

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Ljava/lang/String;")
	protected String aString32;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "Ljava/lang/String;")
	protected String aString33;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljava/lang/String;")
	protected String aString34 = null;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 12)
	Class25() {
	}

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "()Ljava/lang/String;", line = 17)
	String method6434() {
		return this.aString34;
	}

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "(B)Ljava/lang/String;", line = 17)
	String method6449() {
		return this.aString34;
	}

	@OriginalMember(owner = "client!fk", name = "ao", descriptor = "(III)V", line = 188)
	static void method6479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(1, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "(Lclient!agh;I)[I", line = 249)
	static int[] method6478(@OriginalArg(0) Class3_Sub23 arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.method20250(10);
		local4.method20254(local7[0]);
		local4.method20254(local7[1]);
		local4.method20254(local7[2]);
		local4.method20254(local7[3]);
		for (local9 = 0; local9 < 10; local9++) {
			local4.method20254((int) (Math.random() * 9.9999999E7D));
		}
		local4.method20251((int) (Math.random() * 9.9999999E7D));
		local4.method20298(Class361.aBigInteger7, Class361.aBigInteger6);
		arg0.aClass3_Sub41_Sub1_1.method20248(local4.aByteArray51, 0, local4.anInt2803 * 62066237);
		return local7;
	}

	@OriginalMember(owner = "client!fk", name = "et", descriptor = "(II)Z", line = 1686)
	static boolean method6477(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 11 || arg0 == 7 || arg0 == 12 || arg0 == 1;
	}

	@OriginalMember(owner = "client!fk", name = "rq", descriptor = "(Lclient!vs;S)V", line = 7234)
	static final void method6474(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3510 * -1926174821;
	}

	@OriginalMember(owner = "client!fk", name = "vk", descriptor = "(Lclient!vs;I)V", line = 7946)
	static final void method6476(@OriginalArg(0) Class536 arg0) {
		if (client.anInt3101 * -1436339711 >= 5 && client.anInt3101 * -1436339711 <= 9) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!fk", name = "ape", descriptor = "(Lclient!vs;I)V", line = 11643)
	static final void method6475(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub19_1.method13635();
	}

	@OriginalMember(owner = "client!fk", name = "ac", descriptor = "(Lclient!alr;FFFF)V")
	abstract void method6416(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "am", descriptor = "(ILclient!mq;)V")
	abstract void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "()Z")
	public abstract boolean method6418();

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "(Lclient!alr;F)V")
	abstract void method6419(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "(Lclient!alr;FF)V")
	abstract void method6420(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!fk", name = "x", descriptor = "(Lclient!alr;FFF)V")
	abstract void method6421(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "(Lclient!alr;FFFF)V")
	abstract void method6422(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "bp", descriptor = "(Lclient!alr;FFFF)V")
	abstract void method6423(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "bk", descriptor = "(I[FI)V")
	abstract void method6424(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fk", name = "ax", descriptor = "(IFFF)V")
	abstract void method6425(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "(Lclient!alr;ILclient!jl;)V")
	abstract void method6426(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2);

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "(IFFF)V")
	abstract void method6427(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(IFFFF)V")
	abstract void method6428(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "(Lclient!alr;Lclient!mq;)V")
	abstract void method6429(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(ILclient!mq;)V")
	abstract void method6430(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "(ILclient!mq;)V")
	abstract void method6431(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "ab", descriptor = "(ILclient!mq;)V")
	abstract void method6432(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "(IILclient!jl;)V")
	abstract void method6433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2);

	@OriginalMember(owner = "client!fk", name = "aq", descriptor = "(Lclient!alr;ILclient!jl;)V")
	abstract void method6435(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2);

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "()Z")
	public abstract boolean method6436();

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "()Z")
	public abstract boolean method6437();

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "()Z")
	public abstract boolean method6438();

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "(Lclient!alr;F)V")
	abstract void method6439(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!fk", name = "aj", descriptor = "(Lclient!alr;Lclient!mq;)V")
	abstract void method6440(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "af", descriptor = "(Lclient!alr;F)V")
	abstract void method6441(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!fk", name = "av", descriptor = "(IFFF)V")
	abstract void method6442(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!fk", name = "aa", descriptor = "(Lclient!alr;FF)V")
	abstract void method6443(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!fk", name = "bf", descriptor = "(IFFFF)V")
	abstract void method6444(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "au", descriptor = "(ILclient!mq;)V")
	abstract void method6445(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "ah", descriptor = "(Lclient!alr;FFF)V")
	abstract void method6446(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!fk", name = "as", descriptor = "(Lclient!alr;Lclient!mq;)V")
	abstract void method6447(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "ai", descriptor = "(Lclient!alr;Lclient!mq;)V")
	abstract void method6448(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "(Lclient!alr;[FI)V")
	abstract void method6450(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fk", name = "bm", descriptor = "(IFFFF)V")
	abstract void method6451(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "()Z")
	public abstract boolean method6452();

	@OriginalMember(owner = "client!fk", name = "al", descriptor = "(ILclient!mq;)V")
	abstract void method6453(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "ao", descriptor = "(ILclient!mq;)V")
	abstract void method6454(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "ap", descriptor = "(ILclient!mq;)V")
	abstract void method6455(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "bt", descriptor = "(IFFFF)V")
	abstract void method6456(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "ar", descriptor = "(IILclient!jl;)V")
	abstract void method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface28 arg2);

	@OriginalMember(owner = "client!fk", name = "ay", descriptor = "(ILclient!mq;)V")
	abstract void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "ag", descriptor = "(ILclient!mq;)V")
	abstract void method6459(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "at", descriptor = "(Lclient!alr;F)V")
	abstract void method6460(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "(I[FI)V")
	abstract void method6461(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fk", name = "ae", descriptor = "(Lclient!alr;FFFF)V")
	abstract void method6462(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "ad", descriptor = "(Lclient!alr;FFFF)V")
	abstract void method6463(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "aw", descriptor = "(Lclient!alr;FFFF)V")
	abstract void method6464(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(Lclient!alr;Lclient!mq;)V")
	abstract void method6465(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "bw", descriptor = "(Lclient!alr;FFFF)V")
	abstract void method6466(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "(ILclient!mq;)V")
	abstract void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "bd", descriptor = "(IFFFF)V")
	abstract void method6468(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "bs", descriptor = "(IFFFF)V")
	abstract void method6469(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!fk", name = "an", descriptor = "(Lclient!alr;[FI)V")
	abstract void method6470(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fk", name = "az", descriptor = "(ILclient!mq;)V")
	abstract void method6471(@OriginalArg(0) int arg0, @OriginalArg(1) Class328 arg1);

	@OriginalMember(owner = "client!fk", name = "ak", descriptor = "(Lclient!alr;FF)V")
	abstract void method6472(@OriginalArg(0) Class3_Sub19_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!fk", name = "bg", descriptor = "(I[FI)V")
	abstract void method6473(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);
}
