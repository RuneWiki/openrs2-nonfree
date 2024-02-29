package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public class Class329 {

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "Lclient!iq;")
	public static final Class329 aClass329_6 = new Class329(0, 104);

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "Lclient!iq;")
	static final Class329 aClass329_2 = new Class329(1, 120);

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "Lclient!iq;")
	static final Class329 aClass329_1 = new Class329(2, 136);

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "Lclient!iq;")
	static final Class329 aClass329_3 = new Class329(3, 168);

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "Lclient!iq;")
	static final Class329 aClass329_4 = new Class329(4, 72);

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "Lclient!iq;")
	static final Class329 aClass329_5 = new Class329(5, 256);

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
	public final int anInt4094;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public final int anInt4093;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "()[Lclient!iq;", line = 15)
	static Class329[] method27582() {
		return new Class329[] { aClass329_5, aClass329_2, aClass329_4, aClass329_3, aClass329_6, aClass329_1 };
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(II)V", line = 18)
	Class329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4094 = arg0 * 1774498883;
		this.anInt4093 = arg1 * -254532387;
	}

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "(I)Lclient!iq;", line = 25)
	public static Class329 method27583(@OriginalArg(0) int arg0) {
		@Pc(2) Class329[] local2 = Class368.method28152();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class329 local12 = local2[local4];
			if (local12.anInt4094 * 1453209707 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "(I)Lclient!iq;", line = 25)
	public static Class329 method27584(@OriginalArg(0) int arg0) {
		@Pc(2) Class329[] local2 = Class368.method28152();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class329 local12 = local2[local4];
			if (local12.anInt4094 * 1453209707 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "(Lclient!akv;Lclient!adw;B)Lclient!aah;", line = 33)
	static Class9 method27585(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class80_Sub1 arg1) {
		@Pc(4) Class9 local4 = new Class9(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22478();
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class489 local18 = (Class489) Class386.method28346(Class489.class, local8);
			while (true) {
				@Pc(22) int local22 = arg0.method22478();
				if (local22 == 255) {
					break;
				}
				arg0.anInt3089 -= -1387468933;
				@Pc(38) Class438 local38 = arg1.method1952(arg0, local18);
				if (local38 != null) {
					local4.method128(local38.anInt4927 * -608978823, local38.anObject19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "aj", descriptor = "(B)Z", line = 400)
	public static boolean method27586() {
		return Class574.aBoolean804;
	}

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "(IB)V", line = 506)
	public static void method27587(@OriginalArg(0) int arg0) {
		@Pc(2) Class232 local2 = Class628.aClass232_90;
		synchronized (Class628.aClass232_90) {
			Class628.aClass232_90.method25847(arg0);
		}
		local2 = Class628.aClass232_91;
		synchronized (Class628.aClass232_91) {
			Class628.aClass232_91.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "ki", descriptor = "(Lclient!yf;I)V", line = 6520)
	static final void method27588(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class146.method15271(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!iq", name = "tn", descriptor = "(Lclient!yf;I)V", line = 8035)
	static final void method27589(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class215.method25644(local13);
	}

	@OriginalMember(owner = "client!iq", name = "acu", descriptor = "(Lclient!yf;B)V", line = 9616)
	static final void method27590(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class223.method25767(local13, local23, local33);
	}
}
