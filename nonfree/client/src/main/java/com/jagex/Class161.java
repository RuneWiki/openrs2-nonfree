package com.jagex;

import java.applet.Applet;
import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!az")
public class Class161 {

	@OriginalMember(owner = "client!az", name = "sw", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!az", name = "p", descriptor = "I")
	final int anInt3258;

	@OriginalMember(owner = "client!az", name = "c", descriptor = "S")
	final short aShort134;

	@OriginalMember(owner = "client!az", name = "v", descriptor = "S")
	final short aShort133;

	@OriginalMember(owner = "client!az", name = "l", descriptor = "S")
	final short aShort135;

	@OriginalMember(owner = "client!az", name = "w", descriptor = "B")
	final byte aByte102;

	@OriginalMember(owner = "client!az", name = "y", descriptor = "B")
	final byte aByte103;

	@OriginalMember(owner = "client!az", name = "t", descriptor = "Z")
	final boolean aBoolean555;

	@OriginalMember(owner = "client!az", name = "q", descriptor = "I")
	final int anInt3259;

	@OriginalMember(owner = "client!az", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 13)
	Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt3258 = arg0 * 1689146905;
		this.aShort134 = (short) arg4;
		this.aShort133 = (short) arg5;
		this.aShort135 = (short) arg6;
		this.aByte102 = (byte) arg7;
		this.aByte103 = (byte) arg8;
		this.aBoolean555 = arg9;
		this.anInt3259 = arg10 * 1672896963;
	}

	@OriginalMember(owner = "client!az", name = "p", descriptor = "(Lclient!yf;I)V", line = 17)
	static void method24330(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class253.method26189();
	}

	@OriginalMember(owner = "client!az", name = "p", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", line = 23)
	public static void method24331(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		Class524.anApplet3 = arg0;
		Class524.aString226 = arg1;
	}

	@OriginalMember(owner = "client!az", name = "y", descriptor = "(ZI)V", line = 174)
	public static void method24332(@OriginalArg(0) boolean arg0) {
		if (client.anInt3443 * -1468443459 == 4 || client.anInt3443 * -1468443459 == 1) {
			return;
		}
		if (!arg0) {
			if (Class695.aClass96Array1 != null) {
				@Pc(16) Class96[] local16 = Class695.aClass96Array1;
				for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
					@Pc(26) Class96 local26 = local16[local18];
					local26.method19901();
				}
			}
			if (Class230.anInt3760 * -1908237265 != -1) {
				Class94_Sub4.aClass261_1.method26354(Class230.anInt3760 * -1908237265, 255);
			}
		}
		client.anInt3443 = -575071660;
		Class705.aClass77_Sub39_17 = null;
		client.aBoolean607 = false;
		if (Class230.anInt3759 * 1689023681 > 0) {
			Class675.method35962(Class135.aClass135_41, Class230.anInt3759 * 1689023681, -1);
		}
		Class93_Sub1.method6436();
		@Pc(68) Class77_Sub20 local68 = Class365.method28132(Class414.aClass414_94, client.aClass82_2.aClass16_1);
		local68.aClass77_Sub39_Sub1_2.method22403(arg0 ? 1 : 0);
		client.aClass82_2.method2004(local68);
	}

	@OriginalMember(owner = "client!az", name = "eu", descriptor = "(II)I", line = 979)
	public static int method24333(@OriginalArg(0) int arg0) {
		if (Class136_Sub1.anInt1706 * -363511917 == arg0) {
			return Class136_Sub1.aBoolean342 ? 1 : 0;
		} else if (arg0 == Class136_Sub1.anInt1698 * 1272099037) {
			return Class136_Sub1.aBoolean340 ? 1 : 0;
		} else if (arg0 == Class136_Sub1.anInt1709 * -1565977311) {
			return Class136_Sub1.aBoolean343 ? 1 : 0;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!az", name = "bd", descriptor = "(Lclient!yf;I)V", line = 4649)
	static final void method24334(@OriginalArg(0) Class665 arg0) {
		if (arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 0) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!az", name = "os", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 7163)
	static final void method24335(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray37 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!az", name = "pe", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 7377)
	static final void method24336(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray42 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}
}
