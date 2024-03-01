package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public class Class270 {

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static final int anInt4214 = 41;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
	public static final int anInt4215 = 6;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
	public static final int anInt4216 = 2;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
	public static final int anInt4217 = 3;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	public static final int anInt4218 = 4;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
	public static final int anInt4219 = 20;

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
	public static final int anInt4220 = 99;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
	public static final int anInt4221 = 1;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
	public static final int anInt4222 = 9;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public static final int anInt4223 = 17;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
	public static final int anInt4224 = 18;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
	public static final int anInt4225 = 19;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
	public static final int anInt4226 = 98;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	public static final int anInt4227 = 7;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public static final int anInt4228 = 42;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	public static final int anInt4229 = 43;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	public static final int anInt4230 = 44;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	public static final int anInt4231 = 45;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
	public static final int anInt4232 = 46;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
	public static final int anInt4233 = 5;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
	public static final int anInt4234 = 0;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V", line = 26)
	Class270() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "(Lclient!ny;ILclient!sv;ZLclient!ew;I)Lclient!tn;", line = 41)
	public static Interface52 method25287(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class161 arg4) {
		if (Class514.aClass48_6 == null) {
			return null;
		} else {
			return (Interface52) (arg3 ? new Class481(arg0, arg1, Class514.aClass48_6, arg2) : new Class485(arg0, arg1, Class514.aClass48_6, arg2, arg4));
		}
	}

	@OriginalMember(owner = "client!ka", name = "ry", descriptor = "(Lclient!vs;I)V", line = 7185)
	static final void method25291(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class21.method17423(local16, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "sq", descriptor = "(Lclient!vs;I)V", line = 7467)
	static final void method25288(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		Class412.method27707(local13);
	}

	@OriginalMember(owner = "client!ka", name = "aco", descriptor = "(Lclient!vs;I)V", line = 9135)
	static final void method25289(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class44_Sub3.aClass596_1.method33435(local12).anInt5473 * 1865134295 == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ka", name = "mj", descriptor = "(IB)V", line = 11597)
	static void method25290(@OriginalArg(0) int arg0) {
		for (@Pc(3) Class3 local3 = client.aClass581_20.method33221(); local3 != null; local3 = client.aClass581_20.method33231()) {
			if ((local3.aLong296 * -1930649055099428229L >> 48 & 0xFFFFL) == (long) arg0) {
				local3.method33656();
			}
		}
	}
}
