package com.jagex;

import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public class Class293 {

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Lclient!zp;")
	static Class698 aClass698_1;

	@OriginalMember(owner = "client!hb", name = "bi", descriptor = "Ljava/lang/String;")
	public static String aString184;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Ljava/lang/String;")
	final String aString183;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	final int anInt4009;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
	final int anInt4010;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 38)
	public static void method27014(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = Class475.method29689(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			Class352.method27911(local1);
			local1 = Class283.method26700(local1);
			@Pc(38) URL local38 = null;
			if (RuntimeException_Sub1.anApplet1 != null) {
				local38 = RuntimeException_Sub1.anApplet1.getCodeBase();
			} else if (RuntimeException_Sub1.anInterface60_1 != null) {
				local38 = RuntimeException_Sub1.anInterface60_1.method30575();
			}
			if (local38 == null) {
				return;
			}
			@Pc(58) String local58 = "Unknown";
			@Pc(60) String local60 = "1.1";
			try {
				local58 = System.getProperty("java.vendor");
				local60 = System.getProperty("java.version");
			} catch (@Pc(68) Exception local68) {
			}
			@Pc(124) URL local124 = new URL(local38, "clienterror.ws?c=" + RuntimeException_Sub1.anInt3138 * 1141119879 + "&cs=" + Class26.anInt123 * 855690843 + "&u=" + (RuntimeException_Sub1.aString115 == null ? "" + RuntimeException_Sub1.aLong209 * 2640931341331960365L : Class283.method26700(RuntimeException_Sub1.aString115)) + "&v1=" + Class283.method26700(local58) + "&v2=" + Class283.method26700(local60) + "&e=" + local1);
			@Pc(130) DataInputStream local130 = new DataInputStream(local124.openStream());
			local130.read();
			local130.close();
		} catch (@Pc(137) Exception local137) {
			local137.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Ljava/lang/String;II)V", line = 134)
	Class293(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aString183 = arg0;
		this.anInt4009 = arg1 * -602776789;
		this.anInt4010 = arg2 * -1165466785;
	}

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "(Lclient!uq;IILclient!yo;Lclient!atl;I)V", line = 294)
	public static void method27015(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class672 arg3, @OriginalArg(4) Class104_Sub1_Sub5_Sub1 arg4) {
		@Pc(2) Class665 local2 = Class566.method31372();
		local2.aClass104_Sub1_Sub5_Sub1_1 = arg4;
		Class274.method26548(arg0, arg1, arg2, local2);
		local2.aClass104_Sub1_Sub5_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!hb", name = "agp", descriptor = "(Lclient!yf;B)V", line = 10556)
	static final void method27016(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.aClass404_1.anIntArray460[local13] = local23;
	}

	@OriginalMember(owner = "client!hb", name = "ats", descriptor = "(Lclient!yf;B)V", line = 12774)
	static final void method27017(@OriginalArg(0) Class665 arg0) {
		@Pc(3) int local3 = client.aClass12_20.method183();
		if (client.anInt3459 * -993629849 != -1) {
			local3++;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local3;
	}

	@OriginalMember(owner = "client!hb", name = "avs", descriptor = "(Lclient!yf;B)V", line = 13216)
	static final void method27018(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1.method16063() ? 1 : 0;
	}
}
