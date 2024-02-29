package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public class Class50 {

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljava/lang/String;")
	String aString8;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "B")
	public byte aByte2;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 11)
	Class50() {
	}

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "(I)[Lclient!nl;", line = 28)
	static Class422[] method753() {
		return new Class422[] { Class422.aClass422_6, Class422.aClass422_7, Class422.aClass422_4, Class422.aClass422_8, Class422.aClass422_3, Class422.aClass422_5, Class422.aClass422_12, Class422.aClass422_9, Class422.aClass422_11, Class422.aClass422_10, Class422.aClass422_2, Class422.aClass422_1 };
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(Lclient!yf;Lclient!rt;Ljava/lang/Exception;Ljava/lang/String;I)V", line = 393)
	static void method754(@OriginalArg(0) Class665 arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) Exception arg2, @OriginalArg(3) String arg3) {
		@Pc(4) StringBuilder local4 = new StringBuilder(30);
		local4.append(arg3 + " ").append(arg0.aClass77_Sub1_Sub9_2.aLong229 * 8258869577519436579L).append(" ");
		for (@Pc(30) int local30 = arg0.anInt5783 * -1712769137 - 1; local30 >= 0; local30--) {
			local4.append("").append(arg0.aClass654Array1[local30].aClass77_Sub1_Sub9_1.aLong229 * 8258869577519436579L).append(" ");
		}
		local4.append("").append(arg1.anInt5127 * 1391779877);
		Class293.method27014(local4.toString(), arg2);
	}

	@OriginalMember(owner = "client!ac", name = "dd", descriptor = "(ZI)V", line = 819)
	static void method755(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class595 local3 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21131();
		@Pc(13) Class77_Sub1_Sub8 local13 = Class136_Sub1.method13908(local3.anInt5504 * -424199969, local3.anInt5506 * -1166289421);
		if (local13 == null) {
			local13 = Class136_Sub1.method13911(Class136_Sub1.aClass619_2.anInt5615 * -1604882349);
		}
		if (local13 == Class524.aClass77_Sub1_Sub8_4 && !arg0) {
			return;
		}
		Class524.aClass77_Sub1_Sub8_4 = local13;
		@Pc(32) boolean local32 = Class136_Sub1.method13906(local13);
		if (local32) {
			Class136_Sub1.aBoolean338 = true;
			Class208.method25580();
		}
	}

	@OriginalMember(owner = "client!ac", name = "ym", descriptor = "(Lclient!yf;I)V", line = 9030)
	static final void method756(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.aString163 == null || local12 >= Class462.anInt4970 * -217094943) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class204.aClass50Array1[local12].aString11;
		}
	}

	@OriginalMember(owner = "client!ac", name = "ajw", descriptor = "(Lclient!yf;B)V", line = 11119)
	static final void method757(@OriginalArg(0) Class665 arg0) {
		@Pc(17) int local17 = client.anIntArrayArrayArray15[arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]].length >> 1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17;
	}

	@OriginalMember(owner = "client!ac", name = "ajt", descriptor = "(Lclient!yf;I)V", line = 11222)
	static final void method758(@OriginalArg(0) Class665 arg0) {
		Class413.aClass413_4.method28607();
	}
}
