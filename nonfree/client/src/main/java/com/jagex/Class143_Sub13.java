package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alq")
public class Class143_Sub13 extends Class143 {

	@OriginalMember(owner = "client!alq", name = "t", descriptor = "I")
	static final int anInt2117 = 1;

	@OriginalMember(owner = "client!alq", name = "q", descriptor = "I")
	static final int anInt2118 = 4;

	@OriginalMember(owner = "client!alq", name = "w", descriptor = "I")
	static final int anInt2119 = 0;

	@OriginalMember(owner = "client!alq", name = "<init>", descriptor = "(Lclient!akq;)V", line = 12)
	public Class143_Sub13(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alq", name = "<init>", descriptor = "(ILclient!akq;)V", line = 16)
	public Class143_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!alq", name = "i", descriptor = "(I)V", line = 20)
	public void method15353() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 4) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alq", name = "e", descriptor = "()V", line = 20)
	public void method15354() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 4) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alq", name = "t", descriptor = "()I", line = 24)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!alq", name = "y", descriptor = "()I", line = 24)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!alq", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!alq", name = "p", descriptor = "(I)I", line = 24)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!alq", name = "k", descriptor = "(I)Z", line = 28)
	public boolean method15355() {
		return true;
	}

	@OriginalMember(owner = "client!alq", name = "f", descriptor = "()Z", line = 28)
	public boolean method15356() {
		return true;
	}

	@OriginalMember(owner = "client!alq", name = "o", descriptor = "()Z", line = 28)
	public boolean method15357() {
		return true;
	}

	@OriginalMember(owner = "client!alq", name = "r", descriptor = "(I)I", line = 32)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alq", name = "c", descriptor = "(II)I", line = 32)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alq", name = "s", descriptor = "(I)I", line = 32)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alq", name = "g", descriptor = "(I)I", line = 32)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alq", name = "z", descriptor = "(I)I", line = 32)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alq", name = "d", descriptor = "(I)V", line = 36)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alq", name = "l", descriptor = "(II)V", line = 36)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alq", name = "q", descriptor = "(I)V", line = 36)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alq", name = "x", descriptor = "(I)V", line = 36)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alq", name = "m", descriptor = "()I", line = 40)
	public int method15358() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alq", name = "u", descriptor = "(I)I", line = 40)
	public int method15359() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alq", name = "b", descriptor = "()I", line = 40)
	public int method15360() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alq", name = "n", descriptor = "()I", line = 40)
	public int method15361() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alq", name = "a", descriptor = "()I", line = 40)
	public int method15362() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alq", name = "w", descriptor = "(Lclient!aky;II)V", line = 234)
	static void method15363(@OriginalArg(0) Class77_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class77_Sub1_Sub9 local12 = Class257.method26225(local8);
		if (local12 == null) {
			return;
		}
		@Pc(18) Class665 local18 = Class566.method31372();
		local18.anIntArray537 = new int[local12.anInt3012 * -39710947];
		@Pc(27) int local27 = 0;
		local18.anObjectArray46 = new String[local12.anInt3013 * 1127446605];
		@Pc(36) int local36 = 0;
		local18.aLongArray27 = new long[local12.anInt3015 * -2103375343];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 1; local47 < local2.length; local47++) {
			if (local2[local47] instanceof Integer) {
				@Pc(62) int local62 = (Integer) local2[local47];
				if (local62 == -2147483647) {
					local62 = arg0.anInt2004 * -406505557;
				}
				if (local62 == -2147483646) {
					local62 = arg0.anInt2001 * -1708547577;
				}
				if (local62 == -2147483645) {
					local62 = arg0.aClass277_2 == null ? -1 : arg0.aClass277_2.anInt3863 * -1278450723;
				}
				if (local62 == -2147483644) {
					local62 = arg0.anInt2003 * 1297952613;
				}
				if (local62 == -2147483643) {
					local62 = arg0.aClass277_2 == null ? -1 : arg0.aClass277_2.anInt3927 * 1365669833;
				}
				if (local62 == -2147483642) {
					local62 = arg0.aClass277_3 == null ? -1 : arg0.aClass277_3.anInt3863 * -1278450723;
				}
				if (local62 == -2147483641) {
					local62 = arg0.aClass277_3 == null ? -1 : arg0.aClass277_3.anInt3927 * 1365669833;
				}
				if (local62 == -2147483640) {
					local62 = arg0.anInt2005 * 2103033019;
				}
				if (local62 == -2147483639) {
					local62 = arg0.anInt2002 * 1550982069;
				}
				local18.anIntArray537[local27++] = local62;
			} else if (local2[local47] instanceof String) {
				@Pc(176) String local176 = (String) local2[local47];
				if (local176.equals("event_opbase")) {
					local176 = arg0.aString57;
				}
				local18.anObjectArray46[local36++] = local176;
			} else if (local2[local47] instanceof Long) {
				@Pc(201) long local201 = (Long) local2[local47];
				local18.aLongArray27[local45++] = local201;
			}
		}
		local18.anInt5780 = arg0.anInt2006 * -864422403;
		Class320.method27452(local12, arg1, local18);
		local18.anInt5780 = 0;
	}

	@OriginalMember(owner = "client!alq", name = "aes", descriptor = "(Lclient!yf;I)V", line = 9860)
	static final void method15364(@OriginalArg(0) Class665 arg0) {
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class232.method25837((long) arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] * 60000L, Class128.aClass667_3.method36479(), true) + " UTC";
	}
}
