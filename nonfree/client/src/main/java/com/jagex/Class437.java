package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public class Class437 {

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "Lclient!ro;")
	static Class437 aClass437_2;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
	static int anInt4893 = 0;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Lclient!ro;")
	public Class437 aClass437_3;

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "Lclient!ano;")
	public Class26_Sub1_Sub1 aClass26_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V", line = 11)
	Class437() {
	}

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "(Lclient!ano;)Lclient!ro;", line = 15)
	static Class437 method28025(@OriginalArg(0) Class26_Sub1_Sub1 arg0) {
		@Pc(6) Class437 local6;
		if (aClass437_2 == null) {
			local6 = new Class437();
		} else {
			local6 = aClass437_2;
			aClass437_2 = aClass437_2.aClass437_3;
			local6.aClass437_3 = null;
			anInt4893 -= -270933611;
		}
		local6.aClass26_Sub1_Sub1_1 = arg0;
		return local6;
	}

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "()V", line = 27)
	void method28024() {
		if (anInt4893 * -230727235 < 500) {
			this.aClass26_Sub1_Sub1_1 = null;
			this.aClass437_3 = aClass437_2;
			aClass437_2 = this;
			anInt4893 += -270933611;
		}
	}

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "()V", line = 27)
	void method28026() {
		if (anInt4893 * -230727235 < 500) {
			this.aClass26_Sub1_Sub1_1 = null;
			this.aClass437_3 = aClass437_2;
			aClass437_2 = this;
			anInt4893 += -270933611;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 27)
	void method28027() {
		if (anInt4893 * -230727235 < 500) {
			this.aClass26_Sub1_Sub1_1 = null;
			this.aClass437_3 = aClass437_2;
			aClass437_2 = this;
			anInt4893 += -270933611;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Lclient!uh;", line = 36)
	public static Class502 method28028(@OriginalArg(0) int arg0) {
		@Pc(2) Class502[] local2 = Class196.method24111();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			if (arg0 == local2[local4].anInt5248 * 1303174509) {
				return local2[local4];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 50)
	public static void method28029() {
		Class417.method27820();
	}

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "(IB)V", line = 143)
	public static void method28032(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(12, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!ro", name = "jo", descriptor = "(IIIIIB)I", line = 6022)
	public static final int method28031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (client.aClass370_1.method26950() == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(12) Class346 local12 = client.aClass370_1.method27075();
			@Pc(16) int local16 = arg0 >> 9;
			@Pc(20) int local20 = arg1 >> 9;
			if (arg2 < 0 || arg3 < 0 || arg2 > client.aClass370_1.method26943() - 1 || arg3 > client.aClass370_1.method27062() - 1) {
				return 0;
			}
			if (local16 < 1 || local20 < 1 || local16 > client.aClass370_1.method26943() - 1 || local20 > client.aClass370_1.method27062() - 1) {
				return 0;
			}
			@Pc(82) boolean local82 = (local12.aByteArrayArrayArray12[1][arg0 >> 9][arg1 >> 9] & 0x2) != 0;
			@Pc(106) boolean local106;
			@Pc(123) boolean local123;
			if ((arg0 & 0x1FF) == 0) {
				local106 = (local12.aByteArrayArrayArray12[1][local16 - 1][arg1 >> 9] & 0x2) != 0;
				local123 = (local12.aByteArrayArrayArray12[1][local16][arg1 >> 9] & 0x2) != 0;
				if (local123 != local106) {
					local82 = (local12.aByteArrayArrayArray12[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if ((arg1 & 0x1FF) == 0) {
				local106 = (local12.aByteArrayArrayArray12[1][arg0 >> 9][local20 - 1] & 0x2) != 0;
				local123 = (local12.aByteArrayArrayArray12[1][arg0 >> 9][local20] & 0x2) != 0;
				if (local106 != local123) {
					local82 = (local12.aByteArrayArrayArray12[1][arg2][arg3] & 0x2) != 0;
				}
			}
			if (local82) {
				arg4++;
			}
		}
		return client.aClass370_1.method26950().aClass17Array3[arg4].method3583(arg0, arg1);
	}

	@OriginalMember(owner = "client!ro", name = "uv", descriptor = "(Lclient!vs;I)V", line = 7808)
	static final void method28030(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16663().method28625();
	}
}
