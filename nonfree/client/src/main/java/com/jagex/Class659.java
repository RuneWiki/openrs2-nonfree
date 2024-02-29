package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!y")
public class Class659 {

	@OriginalMember(owner = "client!y", name = "l", descriptor = "I")
	static final int anInt5769 = 1000;

	@OriginalMember(owner = "client!y", name = "v", descriptor = "Ljava/lang/String;")
	static final String aString240 = "passwordchoice.ws";

	@OriginalMember(owner = "client!y", name = "t", descriptor = "I")
	static final int anInt5770 = 2;

	@OriginalMember(owner = "client!y", name = "r", descriptor = "I")
	static final int anInt5771 = 7;

	@OriginalMember(owner = "client!y", name = "p", descriptor = "Ljava/lang/String;")
	static final String aString241 = "m=accountappeal/login.ws";

	@OriginalMember(owner = "client!y", name = "q", descriptor = "I")
	static final int anInt5772 = 3;

	@OriginalMember(owner = "client!y", name = "x", descriptor = "I")
	static final int anInt5773 = 4;

	@OriginalMember(owner = "client!y", name = "d", descriptor = "I")
	public static final int anInt5774 = 5;

	@OriginalMember(owner = "client!y", name = "s", descriptor = "I")
	static final int anInt5775 = 6;

	@OriginalMember(owner = "client!y", name = "c", descriptor = "Ljava/lang/String;")
	static final String aString242 = "services";

	@OriginalMember(owner = "client!y", name = "g", descriptor = "I")
	static final int anInt5776 = 2;

	@OriginalMember(owner = "client!y", name = "vf", descriptor = "I")
	public static int anInt5777;

	@OriginalMember(owner = "client!y", name = "y", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger7 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

	@OriginalMember(owner = "client!y", name = "w", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger8 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	@OriginalMember(owner = "client!y", name = "<init>", descriptor = "()V", line = 31)
	Class659() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!y", name = "l", descriptor = "()J", line = 37)
	public static long method33061() {
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

	@OriginalMember(owner = "client!y", name = "y", descriptor = "()J", line = 37)
	public static long method33062() {
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

	@OriginalMember(owner = "client!y", name = "t", descriptor = "(I)V", line = 41)
	public static void method33063() {
		if (IcmpService_Sub1.anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!y", name = "w", descriptor = "(JLjava/lang/String;)I", line = 66)
	public static final int method33064(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		@Pc(3) Random local3 = new Random();
		@Pc(8) Class77_Sub39 local8 = new Class77_Sub39(128);
		@Pc(13) Class77_Sub39 local13 = new Class77_Sub39(128);
		@Pc(16) int[] local16 = new int[] { local3.nextInt(), local3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		local8.method22403(10);
		@Pc(44) int local44;
		for (local44 = 0; local44 < 4; local44++) {
			local8.method22417(local3.nextInt());
		}
		local8.method22417(local16[0]);
		local8.method22417(local16[1]);
		local8.method22428(arg0);
		local8.method22428(0L);
		for (local44 = 0; local44 < 4; local44++) {
			local8.method22417(local3.nextInt());
		}
		local8.method22572(aBigInteger7, aBigInteger8);
		local13.method22403(10);
		for (local44 = 0; local44 < 3; local44++) {
			local13.method22417(local3.nextInt());
		}
		local13.method22428(local3.nextLong());
		local13.method22427(local3.nextLong());
		Class644.method32825(local13);
		local13.method22428(local3.nextLong());
		local13.method22572(aBigInteger7, aBigInteger8);
		local44 = Class664.method33107(arg1);
		if (local44 % 8 != 0) {
			local44 += 8 - local44 % 8;
		}
		@Pc(147) Class77_Sub39 local147 = new Class77_Sub39(local44);
		local147.method22440(arg1);
		local147.anInt3089 = local44 * -1387468933;
		local147.method22559(local16);
		@Pc(180) Class77_Sub39 local180 = new Class77_Sub39(local13.anInt3089 * 31645619 + local8.anInt3089 * 31645619 + 5 + local147.anInt3089 * 31645619);
		local180.method22403(2);
		local180.method22403(local8.anInt3089 * 31645619);
		local180.method22452(local8.aByteArray53, 0, local8.anInt3089 * 31645619);
		local180.method22403(local13.anInt3089 * 31645619);
		local180.method22452(local13.aByteArray53, 0, local13.anInt3089 * 31645619);
		local180.method22408(local147.anInt3089 * 31645619);
		local180.method22452(local147.aByteArray53, 0, local147.anInt3089 * 31645619);
		@Pc(240) String local240 = Class498.method30185(local180.aByteArray53);
		try {
			@Pc(255) URL local255 = new URL(Class246.method26128("services", false) + "m=accountappeal/login.ws");
			@Pc(258) URLConnection local258 = local255.openConnection();
			local258.setDoInput(true);
			local258.setDoOutput(true);
			local258.setConnectTimeout(5000);
			@Pc(273) OutputStreamWriter local273 = new OutputStreamWriter(local258.getOutputStream());
			local273.write("data2=" + Class283.method26700(local240) + "&dest=" + Class283.method26700("passwordchoice.ws"));
			local273.flush();
			@Pc(296) InputStream local296 = local258.getInputStream();
			local180 = new Class77_Sub39(new byte[1000]);
			do {
				@Pc(317) int local317 = local296.read(local180.aByteArray53, local180.anInt3089 * 31645619, 1000 - local180.anInt3089 * 31645619);
				if (local317 == -1) {
					local273.close();
					local296.close();
					@Pc(348) String local348 = new String(local180.aByteArray53);
					if (local348.startsWith("OFFLINE")) {
						return 4;
					} else if (local348.startsWith("WRONG")) {
						return 7;
					} else if (local348.startsWith("RELOAD")) {
						return 3;
					} else if (local348.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						local180.method22561(local16);
						while (local180.anInt3089 * 31645619 > 0 && local180.aByteArray53[local180.anInt3089 * 31645619 - 1] == 0) {
							local180.anInt3089 -= -1387468933;
						}
						local348 = new String(local180.aByteArray53, 0, local180.anInt3089 * 31645619);
						if (Class661.method33083(local348)) {
							Class474.method29663(local348, true, client.aBoolean591);
							return 2;
						} else {
							return 5;
						}
					}
				}
				local180.anInt3089 += local317 * -1387468933;
			} while (local180.anInt3089 * 31645619 < 1000);
			return 5;
		} catch (@Pc(424) Throwable local424) {
			local424.printStackTrace();
			return 5;
		}
	}

	@OriginalMember(owner = "client!y", name = "x", descriptor = "(Ljava/lang/String;)Z", line = 162)
	static boolean method33065(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (@Pc(11) MalformedURLException local11) {
			return false;
		}
	}

	@OriginalMember(owner = "client!y", name = "t", descriptor = "(Ljava/lang/String;)Z", line = 162)
	static boolean method33066(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (@Pc(11) MalformedURLException local11) {
			return false;
		}
	}

	@OriginalMember(owner = "client!y", name = "q", descriptor = "(Ljava/lang/String;)Z", line = 162)
	static boolean method33067(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (@Pc(11) MalformedURLException local11) {
			return false;
		}
	}

	@OriginalMember(owner = "client!y", name = "y", descriptor = "([BIII)[B", line = 178)
	public static byte[] method33068(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte[] local4;
		if (arg1 > 0) {
			local4 = new byte[arg2];
			for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
				local4[local6] = arg0[arg1 + local6];
			}
		} else {
			local4 = arg0;
		}
		@Pc(26) Class6 local26 = new Class6();
		local26.method55();
		local26.method61(local4, (long) (arg2 * 8));
		@Pc(39) byte[] local39 = new byte[64];
		local26.method63(local39, 0);
		return local39;
	}

	@OriginalMember(owner = "client!y", name = "n", descriptor = "(Lclient!aqm;I)V", line = 835)
	static void method33069(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		if (Class683.aBoolean861) {
			return;
		}
		arg0.method24063();
		Class683.anInt5826 -= 914117357;
		if (!arg0.aBoolean491) {
			@Pc(17) long local17 = arg0.aLong150 * -6387465159951953483L;
			@Pc(22) Class77_Sub1_Sub11 local22;
			for (local22 = (Class77_Sub1_Sub11) Class683.aClass12_39.method173(local17); local22 != null && !local22.aString107.equals(arg0.aString93); local22 = (Class77_Sub1_Sub11) Class683.aClass12_39.method176()) {
			}
			if (local22 != null && local22.method22233(arg0)) {
				Class532.method30743(local22);
			}
			return;
		}
		for (@Pc(54) Class77_Sub1_Sub11 local54 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36335(); local54 != null; local54 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36340()) {
			if (local54.aString107.equals(arg0.aString93)) {
				@Pc(65) boolean local65 = false;
				for (@Pc(71) Class77_Sub1_Sub7 local71 = (Class77_Sub1_Sub7) local54.aClass691_11.method36335(); local71 != null; local71 = (Class77_Sub1_Sub7) local54.aClass691_11.method36340()) {
					if (local71 == arg0) {
						if (local54.method22233(arg0)) {
							Class532.method30743(local54);
						}
						local65 = true;
						break;
					}
				}
				if (local65) {
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!y", name = "ak", descriptor = "(III)V", line = 938)
	static void method33070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class683.anInt5831 = arg0 * -1105907919;
		Class683.anInt5832 = arg1 * -1266523535;
	}

	@OriginalMember(owner = "client!y", name = "fr", descriptor = "(Lclient!yf;I)V", line = 5559)
	static final void method33071(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class173.method24541(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!y", name = "ln", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6612)
	static final void method33072(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray20 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}
}
