package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ax")
public class Class159 {

	@OriginalMember(owner = "client!ax", name = "p", descriptor = "Z")
	static boolean aBoolean554 = false;

	@OriginalMember(owner = "client!ax", name = "<init>", descriptor = "()V", line = 11)
	Class159() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ax", name = "v", descriptor = "()V", line = 16)
	public static void method24313() {
		if (aBoolean554) {
			return;
		}
		Class245.method26120(client.aClass517_1.method30435().aClass567ArrayArrayArray2);
		if (client.aClass517_1.method30435().aClass567ArrayArrayArray3 != null) {
			Class245.method26120(client.aClass517_1.method30435().aClass567ArrayArrayArray3);
		}
		aBoolean554 = true;
	}

	@OriginalMember(owner = "client!ax", name = "y", descriptor = "()V", line = 16)
	public static void method24314() {
		if (aBoolean554) {
			return;
		}
		Class245.method26120(client.aClass517_1.method30435().aClass567ArrayArrayArray2);
		if (client.aClass517_1.method30435().aClass567ArrayArrayArray3 != null) {
			Class245.method26120(client.aClass517_1.method30435().aClass567ArrayArrayArray3);
		}
		aBoolean554 = true;
	}

	@OriginalMember(owner = "client!ax", name = "l", descriptor = "()V", line = 16)
	public static void method24315() {
		if (aBoolean554) {
			return;
		}
		Class245.method26120(client.aClass517_1.method30435().aClass567ArrayArrayArray2);
		if (client.aClass517_1.method30435().aClass567ArrayArrayArray3 != null) {
			Class245.method26120(client.aClass517_1.method30435().aClass567ArrayArrayArray3);
		}
		aBoolean554 = true;
	}

	@OriginalMember(owner = "client!ax", name = "w", descriptor = "([[[Lclient!ty;)V", line = 23)
	static void method24316(@OriginalArg(0) Class567[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class567[][] local9 = arg0[local1];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(17) int local17 = 0; local17 < local9[local11].length; local17++) {
					@Pc(29) Class567 local29 = local9[local11][local17];
					if (local29 != null) {
						if (local29.aClass104_Sub1_Sub4_1 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub4_1).method13059();
						}
						if (local29.aClass104_Sub1_Sub3_1 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub3_1).method13059();
						}
						if (local29.aClass104_Sub1_Sub3_2 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub3_2).method13059();
						}
						if (local29.aClass104_Sub1_Sub2_2 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub2_2).method13059();
						}
						if (local29.aClass104_Sub1_Sub2_1 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub2_1).method13059();
						}
						for (@Pc(81) Class559 local81 = local29.aClass559_3; local81 != null; local81 = local81.aClass559_1) {
							@Pc(87) Class104_Sub1_Sub1 local87 = local81.aClass104_Sub1_Sub1_1;
							if (local87 instanceof Interface61) {
								((Interface61) local87).method13059();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ax", name = "t", descriptor = "([[[Lclient!ty;)V", line = 23)
	static void method24317(@OriginalArg(0) Class567[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class567[][] local9 = arg0[local1];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(17) int local17 = 0; local17 < local9[local11].length; local17++) {
					@Pc(29) Class567 local29 = local9[local11][local17];
					if (local29 != null) {
						if (local29.aClass104_Sub1_Sub4_1 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub4_1).method13059();
						}
						if (local29.aClass104_Sub1_Sub3_1 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub3_1).method13059();
						}
						if (local29.aClass104_Sub1_Sub3_2 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub3_2).method13059();
						}
						if (local29.aClass104_Sub1_Sub2_2 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub2_2).method13059();
						}
						if (local29.aClass104_Sub1_Sub2_1 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub2_1).method13059();
						}
						for (@Pc(81) Class559 local81 = local29.aClass559_3; local81 != null; local81 = local81.aClass559_1) {
							@Pc(87) Class104_Sub1_Sub1 local87 = local81.aClass104_Sub1_Sub1_1;
							if (local87 instanceof Interface61) {
								((Interface61) local87).method13059();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ax", name = "p", descriptor = "(I)J", line = 37)
	public static long method24318() {
		try {
			@Pc(14) URL local14 = new URL(Class246.method26128("services", false) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Class77_Sub39 local50 = new Class77_Sub39(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.aByteArray53, local50.anInt3089 * 31645619, 1000 - local50.anInt3089 * 31645619);
				if (local65 == -1) {
					local50.anInt3089 = 0;
					return local50.method22510();
				}
				local50.anInt3089 += local65 * -1387468933;
			} while (local50.anInt3089 * 31645619 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!ax", name = "aez", descriptor = "(Lclient!yf;I)V", line = 9973)
	static final void method24319(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(26) int local26 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class541.method30937(local13, local26 == 1);
	}
}
