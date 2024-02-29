package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public class Class419 {

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
	public static final int anInt4724 = 11;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	public static final int anInt4725 = 13;

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
	public static final int anInt4726 = 27;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public static final int anInt4727 = 14;

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
	public static final int anInt4728 = 16;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	public static final int anInt4729 = 4;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
	public static final int anInt4730 = 3;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	public static final int anInt4731 = 24;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
	public static final int anInt4732 = 22;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	public static final int anInt4733 = 2;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
	public static final int anInt4734 = 10;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
	public static final int anInt4735 = 9;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
	public static final int anInt4736 = 15;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
	public static final int anInt4737 = 1;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
	public static final int anInt4738 = 19;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	public static final int anInt4739 = 29;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
	public static final int anInt4740 = 25;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
	public static final int anInt4741 = 26;

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
	public static final int anInt4742 = 6;

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
	public static final int anInt4743 = 20;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	public static final int anInt4744 = 21;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
	public static final int anInt4745 = 8;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
	public static final int anInt4746 = 17;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
	public static final int anInt4747 = 7;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
	public static final int anInt4748 = 28;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	public static final int anInt4749 = 23;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V", line = 31)
	Class419() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "(II)Z", line = 873)
	public static boolean method28686(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class77_Sub1_Sub7 local4 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36395(); local4 != null; local4 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36406()) {
			if (Class77_Sub4.method13217(local4.anInt2987 * -1986934021) && (long) arg0 == local4.aLong149 * -7225575275964615095L) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ni", name = "ec", descriptor = "(IB)Z", line = 1732)
	static boolean method28687(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 6;
	}

	@OriginalMember(owner = "client!ni", name = "ac", descriptor = "(Lclient!yf;I)V", line = 4486)
	static final void method28688(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray537[arg0.anIntArray535[arg0.anInt5786 * 662605117]] = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
	}

	@OriginalMember(owner = "client!ni", name = "mo", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6782)
	static final void method28689(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray25 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!ni", name = "agc", descriptor = "(Lclient!yf;I)V", line = 10520)
	static final void method28690(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (local23 == -1) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class615.aClass465_1.method29551(local13).method22832((char) local23);
		}
	}

	@OriginalMember(owner = "client!ni", name = "ayx", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 13555)
	static void method28691(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (client.aClass82_2 == null) {
			return;
		}
		@Pc(7) Class77_Sub20 local7 = Class365.method28132(Class414.aClass414_25, client.aClass82_2.aClass16_1);
		local7.aClass77_Sub39_Sub1_2.method22408(Class430.method28814(arg1) + 1 + Class430.method28814(arg2));
		local7.aClass77_Sub39_Sub1_2.method22587(arg0);
		local7.aClass77_Sub39_Sub1_2.method22444(arg2);
		local7.aClass77_Sub39_Sub1_2.method22444(arg1);
		client.aClass82_2.method2004(local7);
	}
}
