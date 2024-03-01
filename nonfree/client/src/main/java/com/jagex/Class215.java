package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public class Class215 {

	@OriginalMember(owner = "client!h", name = "l", descriptor = "I")
	static final int anInt3717 = 1000;

	@OriginalMember(owner = "client!h", name = "z", descriptor = "I")
	static final int anInt3718 = 7;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Ljava/lang/String;")
	static final String aString180 = "passwordchoice.ws";

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	static final int anInt3719 = 6;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "I")
	static final int anInt3720 = 3;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "I")
	static final int anInt3721 = 2;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Ljava/lang/String;")
	static final String aString181 = "services";

	@OriginalMember(owner = "client!h", name = "y", descriptor = "I")
	static final int anInt3722 = 4;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	public static final int anInt3723 = 5;

	@OriginalMember(owner = "client!h", name = "p", descriptor = "Ljava/lang/String;")
	static final String aString182 = "m=accountappeal/login.ws";

	@OriginalMember(owner = "client!h", name = "j", descriptor = "I")
	static final int anInt3724 = 2;

	@OriginalMember(owner = "client!h", name = "nu", descriptor = "J")
	public static long aLong243;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger2 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

	@OriginalMember(owner = "client!h", name = "x", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger1 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	@OriginalMember(owner = "client!h", name = "p", descriptor = "(I)V", line = 29)
	static void method24293() {
		Class227.aClass161_26.method23224();
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 31)
	Class215() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "()J", line = 37)
	public static long method24283() {
		try {
			@Pc(14) URL local14 = new URL(Class599.method33503("services", false) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Class3_Sub41 local50 = new Class3_Sub41(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.aByteArray51, local50.anInt2803 * 62066237, 1000 - local50.anInt2803 * 62066237);
				if (local65 == -1) {
					local50.anInt2803 = 0;
					return local50.method20371();
				}
				local50.anInt2803 += local65 * -918980331;
			} while (local50.anInt2803 * 62066237 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()J", line = 37)
	public static long method24284() {
		try {
			@Pc(14) URL local14 = new URL(Class599.method33503("services", false) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Class3_Sub41 local50 = new Class3_Sub41(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.aByteArray51, local50.anInt2803 * 62066237, 1000 - local50.anInt2803 * 62066237);
				if (local65 == -1) {
					local50.anInt2803 = 0;
					return local50.method20371();
				}
				local50.anInt2803 += local65 * -918980331;
			} while (local50.anInt2803 * 62066237 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!h", name = "x", descriptor = "(JLjava/lang/String;)I", line = 66)
	public static final int method24287(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		@Pc(3) Random local3 = new Random();
		@Pc(8) Class3_Sub41 local8 = new Class3_Sub41(128);
		@Pc(13) Class3_Sub41 local13 = new Class3_Sub41(128);
		@Pc(16) int[] local16 = new int[] { local3.nextInt(), local3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		local8.method20250(10);
		@Pc(44) int local44;
		for (local44 = 0; local44 < 4; local44++) {
			local8.method20254(local3.nextInt());
		}
		local8.method20254(local16[0]);
		local8.method20254(local16[1]);
		local8.method20409(arg0);
		local8.method20409(0L);
		for (local44 = 0; local44 < 4; local44++) {
			local8.method20254(local3.nextInt());
		}
		local8.method20298(aBigInteger2, aBigInteger1);
		local13.method20250(10);
		for (local44 = 0; local44 < 3; local44++) {
			local13.method20254(local3.nextInt());
		}
		local13.method20409(local3.nextLong());
		local13.method20381(local3.nextLong());
		Class527.method32429(local13);
		local13.method20409(local3.nextLong());
		local13.method20298(aBigInteger2, aBigInteger1);
		local44 = Class43_Sub2.method8763(arg1);
		if (local44 % 8 != 0) {
			local44 += 8 - local44 % 8;
		}
		@Pc(147) Class3_Sub41 local147 = new Class3_Sub41(local44);
		local147.method20260(arg1);
		local147.anInt2803 = local44 * -918980331;
		local147.method20359(local16);
		@Pc(180) Class3_Sub41 local180 = new Class3_Sub41(local8.anInt2803 * 62066237 + 5 + local13.anInt2803 * 62066237 + local147.anInt2803 * 62066237);
		local180.method20250(2);
		local180.method20250(local8.anInt2803 * 62066237);
		local180.method20248(local8.aByteArray51, 0, local8.anInt2803 * 62066237);
		local180.method20250(local13.anInt2803 * 62066237);
		local180.method20248(local13.aByteArray51, 0, local13.anInt2803 * 62066237);
		local180.method20251(local147.anInt2803 * 62066237);
		local180.method20248(local147.aByteArray51, 0, local147.anInt2803 * 62066237);
		@Pc(240) String local240 = Class207.method24222(local180.aByteArray51);
		try {
			@Pc(255) URL local255 = new URL(Class599.method33503("services", false) + "m=accountappeal/login.ws");
			@Pc(258) URLConnection local258 = local255.openConnection();
			local258.setDoInput(true);
			local258.setDoOutput(true);
			local258.setConnectTimeout(5000);
			@Pc(273) OutputStreamWriter local273 = new OutputStreamWriter(local258.getOutputStream());
			local273.write("data2=" + Class476.method28797(local240) + "&dest=" + Class476.method28797("passwordchoice.ws"));
			local273.flush();
			@Pc(296) InputStream local296 = local258.getInputStream();
			local180 = new Class3_Sub41(new byte[1000]);
			do {
				@Pc(317) int local317 = local296.read(local180.aByteArray51, local180.anInt2803 * 62066237, 1000 - local180.anInt2803 * 62066237);
				if (local317 == -1) {
					local273.close();
					local296.close();
					@Pc(348) String local348 = new String(local180.aByteArray51);
					if (local348.startsWith("OFFLINE")) {
						return 4;
					} else if (local348.startsWith("WRONG")) {
						return 7;
					} else if (local348.startsWith("RELOAD")) {
						return 3;
					} else if (local348.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						local180.method20295(local16);
						while (local180.anInt2803 * 62066237 > 0 && local180.aByteArray51[local180.anInt2803 * 62066237 - 1] == 0) {
							local180.anInt2803 -= -918980331;
						}
						local348 = new String(local180.aByteArray51, 0, local180.anInt2803 * 62066237);
						if (Class242.method24751(local348)) {
							Class485.method29178(local348, true, client.aBoolean569);
							return 2;
						} else {
							return 5;
						}
					}
				}
				local180.anInt2803 += local317 * -918980331;
			} while (local180.anInt2803 * 62066237 < 1000);
			return 5;
		} catch (@Pc(423) Throwable local423) {
			local423.printStackTrace();
			return 5;
		}
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "(Ljava/lang/String;)Z", line = 162)
	static boolean method24285(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!h", name = "s", descriptor = "(Ljava/lang/String;)Z", line = 162)
	static boolean method24286(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!h", name = "z", descriptor = "(Ljava/lang/String;B)V", line = 259)
	public static void method24289(@OriginalArg(0) String arg0) {
		if (Class67.aStringArray7 == null) {
			Class127.method22879();
		}
		client.aCalendar1.setTime(new Date(Class176.method23413()));
		@Pc(15) int local15 = client.aCalendar1.get(11);
		@Pc(19) int local19 = client.aCalendar1.get(12);
		@Pc(23) int local23 = client.aCalendar1.get(13);
		@Pc(57) String local57 = Integer.toString(local15 / 10) + local15 % 10 + ":" + local19 / 10 + local19 % 10 + ":" + local23 / 10 + local23 % 10;
		@Pc(62) String[] local62 = Class230.method24546(arg0, '\n');
		for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
			for (@Pc(72) int local72 = Class67.anInt1840 * 1387788187; local72 > 0; local72--) {
				Class67.aStringArray7[local72] = Class67.aStringArray7[local72 - 1];
			}
			Class67.aStringArray7[0] = local57 + ": " + local62[local64];
			if (Class67.aFileOutputStream1 != null) {
				try {
					Class67.aFileOutputStream1.write(Class281.method25434(Class67.aStringArray7[0] + "\n"));
				} catch (@Pc(118) IOException local118) {
				}
			}
			if (Class67.anInt1840 * 1387788187 < Class67.aStringArray7.length - 1) {
				Class67.anInt1840 += 1213765267;
				if (Class67.anInt1835 * 393384311 > 0) {
					Class67.anInt1835 += -1933731769;
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "(Lclient!de;Lclient!fo;III)V", line = 418)
	static void method24294(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method17028();
		@Pc(6) Class169 local6 = null;
		@Pc(8) Class5 local8 = null;
		if (arg1.anInt3492 * -107621169 == 5) {
			local6 = arg1.method23435(arg0);
			if (local6 == null) {
				return;
			}
			local8 = local6.aClass5_1;
			if (local6.anInt3457 * -165923349 != arg1.anInt3498 * -1494060731 || local6.anInt3456 * 1164759253 != arg1.anInt3499 * -751005789) {
				throw new IllegalStateException("");
			}
		}
		arg0.method17079(arg2, arg3, arg2 + arg1.anInt3498 * -1494060731, arg1.anInt3499 * -751005789 + arg3);
		if (Class2.anInt4 * -741112023 == 2 || Class2.anInt4 * -741112023 == 5 || Class602.aClass6_37 == null) {
			if (local8 == null) {
				return;
			}
			arg0.method17095(-16777216, local8, arg2, arg3);
			return;
		}
		@Pc(81) Class464 local81 = client.aClass370_1.method26942();
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(100) int local100;
		@Pc(102) int local102;
		if (Class72.anInt2086 * 81180077 == 4) {
			local90 = client.anInt3085 * 1771104941;
			local94 = client.anInt3086 * 1828029883;
			local100 = (int) -client.aFloat238 & 0x3FFF;
			local102 = 4096;
		} else {
			@Pc(107) Class320 local107 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
			local90 = (int) local107.aFloat259;
			local94 = (int) local107.aFloat261;
			if (Class72.anInt2086 * 81180077 == 3) {
				local100 = (int) -((double) Class80.aClass23_Sub1_1.method5836() * 2607.5945876176133D) + client.anInt3081 * 732347007 & 0x3FFF;
			} else {
				local100 = (int) -client.aFloat238 + client.anInt3081 * 732347007 & 0x3FFF;
			}
			local102 = 4096 - client.anInt3083 * 313173968;
		}
		@Pc(158) int local158 = local90 / 128 + 48;
		@Pc(170) int local170 = client.aClass370_1.method27062() * 4 + 48 - local94 / 128;
		if (local8 == null) {
			Class602.aClass6_37.method16837((float) (arg1.anInt3498 * -1494060731) / 2.0F + (float) arg2, (float) arg3 + (float) (arg1.anInt3499 * -751005789) / 2.0F, (float) local158, (float) local170, local102, local100 << 2, 1, -1, 1);
		} else {
			Class602.aClass6_37.method16797((float) (arg1.anInt3498 * -1494060731) / 2.0F + (float) arg2, (float) (arg1.anInt3499 * -751005789) / 2.0F + (float) arg3, (float) local158, (float) local170, local102, local100 << 2, local8, arg2, arg3);
		}
		@Pc(243) Class421 local243 = client.aClass370_1.method26945();
		@Pc(255) int local255;
		@Pc(269) int local269;
		@Pc(281) int local281;
		@Pc(291) int local291;
		@Pc(301) int local301;
		for (@Pc(248) Class3_Sub21 local248 = (Class3_Sub21) Class2.aClass553_1.method32768(); local248 != null; local248 = (Class3_Sub21) Class2.aClass553_1.method32709()) {
			local255 = local248.anInt1285 * 1585682181;
			local269 = (local243.anIntArray435[local255] >> 14 & 0x3FFF) - local81.anInt5071 * -1567811631;
			local281 = (local243.anIntArray435[local255] & 0x3FFF) - local81.anInt5073 * 1360175441;
			local291 = local269 * 4 + 2 - local90 / 128;
			local301 = local281 * 4 + 2 - local94 / 128;
			Class60_Sub24.method13783(arg0, local8, arg1, arg2, arg3, local291, local301, local243.anIntArray434[local255]);
		}
		for (local255 = 0; local255 < Class2.anInt3 * -471644325; local255++) {
			local269 = Class2.anIntArray3[local255] * 4 + 2 - local90 / 128;
			local281 = Class2.anIntArray2[local255] * 4 + 2 - local94 / 128;
			@Pc(360) Class467 local360 = client.aClass370_1.method26954().method28510(Class2.anIntArray1[local255]);
			if (local360.anIntArray464 != null) {
				local360 = local360.method28716(Class424.aClass165_1, Class424.aClass165_1);
				if (local360 == null || local360.anInt5076 * -465575861 == -1) {
					continue;
				}
			}
			Class60_Sub24.method13783(arg0, local8, arg1, arg2, arg3, local269, local281, local360.anInt5076 * -465575861);
		}
		for (@Pc(400) Class3_Sub13 local400 = (Class3_Sub13) client.aClass581_19.method33221(); local400 != null; local400 = (Class3_Sub13) client.aClass581_19.method33231()) {
			local269 = (int) (local400.aLong296 * -1930649055099428229L >> 28 & 0x3L);
			if (Class2.anInt1 * -1226077139 == local269) {
				local281 = (int) (local400.aLong296 * -1930649055099428229L & 0x3FFFL) - local81.anInt5071 * -1567811631;
				local291 = (int) (local400.aLong296 * -1930649055099428229L >> 14 & 0x3FFFL) - local81.anInt5073 * 1360175441;
				local301 = local281 * 4 + 2 - local90 / 128;
				@Pc(466) int local466 = local291 * 4 + 2 - local94 / 128;
				Class154.method23164(arg1, local8, arg2, arg3, local301, local466, Class486.aClass6Array14[0]);
			}
		}
		Class460.method28581(arg0, local90, local94, arg1, local8, arg2, arg3);
		Class614.method33654(local90, local94, arg1, local8, arg2, arg3);
		Class474.method28785(local90, local94, arg1, local6, arg2, arg3);
		if (Class72.anInt2086 * 81180077 == 4) {
			return;
		}
		if (Class2.anInt5 * 1749463705 != -1) {
			local255 = Class2.anInt5 * -1592079772 + 2 - local90 / 128 + (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16630() - 1) * 2;
			local269 = Class2.anInt2 * -1020087876 + 2 - local94 / 128 + (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16630() - 1) * 2;
			Class154.method23164(arg1, local8, arg2, arg3, local255, local269, Class68.aClass6Array5[Class2.aBoolean4 ? 1 : 0]);
		}
		if (!Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aBoolean421) {
			arg0.method17063(arg1.anInt3498 * -1494060731 / 2 + arg2 - 1, arg3 + arg1.anInt3499 * -751005789 / 2 - 1, 3, 3, -1);
		}
	}

	@OriginalMember(owner = "client!h", name = "ao", descriptor = "(Lclient!aml;I)I", line = 1098)
	public static int method24288(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		if (Class250.aBoolean688) {
			return 6;
		} else if (arg0 == null) {
			return 0;
		} else {
			@Pc(13) int local13 = arg0.anInt2664 * 296027207;
			if (Class125.method22871(local13)) {
				return 1;
			} else if (Class623.method33771(local13)) {
				return 2;
			} else if (Class70_Sub1_Sub2.method14741(local13)) {
				return 3;
			} else if (Class314.method25830(local13)) {
				return 4;
			} else if (Class318.method25857(local13)) {
				return 7;
			} else if (local13 == 16) {
				return 8;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "lf", descriptor = "(Lclient!vs;I)V", line = 6225)
	static final void method24291(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class456.method28483(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!h", name = "nd", descriptor = "(Lclient!vs;S)V", line = 6623)
	static final void method24290(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class339.method26438(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!h", name = "aml", descriptor = "(Lclient!vs;I)V", line = 11236)
	static final void method24292(@OriginalArg(0) Class536 arg0) {
		Class553.method32773();
	}
}
