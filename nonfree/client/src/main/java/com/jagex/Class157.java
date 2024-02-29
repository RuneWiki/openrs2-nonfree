package com.jagex;

import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public class Class157 {

	@OriginalMember(owner = "client!av", name = "z", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray23;

	@OriginalMember(owner = "client!av", name = "v", descriptor = "I")
	static int anInt3239;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "I")
	static int anInt3241;

	@OriginalMember(owner = "client!av", name = "u", descriptor = "Ljava/lang/String;")
	static final String aString123 = "Failure";

	@OriginalMember(owner = "client!av", name = "p", descriptor = "I")
	static final int anInt3246 = 350;

	@OriginalMember(owner = "client!av", name = "i", descriptor = "Ljava/lang/String;")
	static final String aString124 = "\\/.:, _-+[]~@";

	@OriginalMember(owner = "client!av", name = "k", descriptor = "Ljava/lang/String;")
	static final String aString125 = "Success";

	@OriginalMember(owner = "client!av", name = "ds", descriptor = "Ljava/lang/String;")
	public static String aString127;

	@OriginalMember(owner = "client!av", name = "y", descriptor = "I")
	static int anInt3240 = 0;

	@OriginalMember(owner = "client!av", name = "w", descriptor = "I")
	static int anInt3247 = 0;

	@OriginalMember(owner = "client!av", name = "t", descriptor = "Ljava/lang/String;")
	static String aString126 = "";

	@OriginalMember(owner = "client!av", name = "q", descriptor = "I")
	static int anInt3243 = 0;

	@OriginalMember(owner = "client!av", name = "x", descriptor = "I")
	static int anInt3244 = 0;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "I")
	static int anInt3245 = 0;

	@OriginalMember(owner = "client!av", name = "s", descriptor = "Z")
	static boolean aBoolean553 = false;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "I")
	static int anInt3242 = 556419873;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V", line = 62)
	Class157() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!av", name = "e", descriptor = "()Z", line = 67)
	static boolean method24263() {
		return !Class77_Sub1_Sub2.method1497(client.anInt3390 * -1850530127);
	}

	@OriginalMember(owner = "client!av", name = "n", descriptor = "()V", line = 72)
	static void method24264() {
		if (!Class241.method25966()) {
			return;
		}
		if (Class96_Sub12.aStringArray10 == null) {
			Class41.method696();
		}
		aBoolean553 = true;
		anInt3245 = 0;
	}

	@OriginalMember(owner = "client!av", name = "o", descriptor = "()V", line = 72)
	static void method24265() {
		if (!Class241.method25966()) {
			return;
		}
		if (Class96_Sub12.aStringArray10 == null) {
			Class41.method696();
		}
		aBoolean553 = true;
		anInt3245 = 0;
	}

	@OriginalMember(owner = "client!av", name = "f", descriptor = "()V", line = 72)
	static void method24266() {
		if (!Class241.method25966()) {
			return;
		}
		if (Class96_Sub12.aStringArray10 == null) {
			Class41.method696();
		}
		aBoolean553 = true;
		anInt3245 = 0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "()V", line = 72)
	static void method24267() {
		if (!Class241.method25966()) {
			return;
		}
		if (Class96_Sub12.aStringArray10 == null) {
			Class41.method696();
		}
		aBoolean553 = true;
		anInt3245 = 0;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "()V", line = 72)
	static void method24268() {
		if (!Class241.method25966()) {
			return;
		}
		if (Class96_Sub12.aStringArray10 == null) {
			Class41.method696();
		}
		aBoolean553 = true;
		anInt3245 = 0;
	}

	@OriginalMember(owner = "client!av", name = "h", descriptor = "()V", line = 80)
	static void method24269() {
		anInt3241 = Class346.aClass17_12.anInt51 * -858559641 + -218904694 + Class346.aClass17_12.anInt52 * -2123874781;
		anInt3239 = Class611.aClass17_13.anInt52 * -309101603 + Class611.aClass17_13.anInt51 * 376293017 + -1626528650;
		Class96_Sub12.aStringArray10 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class96_Sub12.aStringArray10.length; local28++) {
			Class96_Sub12.aStringArray10[local28] = "";
		}
		Class51.method764(Class44.aClass44_171.method713(Class128.aClass667_3));
	}

	@OriginalMember(owner = "client!av", name = "m", descriptor = "()V", line = 80)
	static void method24270() {
		anInt3241 = Class346.aClass17_12.anInt51 * -858559641 + -218904694 + Class346.aClass17_12.anInt52 * -2123874781;
		anInt3239 = Class611.aClass17_13.anInt52 * -309101603 + Class611.aClass17_13.anInt51 * 376293017 + -1626528650;
		Class96_Sub12.aStringArray10 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class96_Sub12.aStringArray10.length; local28++) {
			Class96_Sub12.aStringArray10[local28] = "";
		}
		Class51.method764(Class44.aClass44_171.method713(Class128.aClass667_3));
	}

	@OriginalMember(owner = "client!av", name = "aj", descriptor = "()V", line = 88)
	static void method24271() {
		aBoolean553 = false;
		Class430.method28815();
	}

	@OriginalMember(owner = "client!av", name = "ai", descriptor = "()V", line = 88)
	static void method24272() {
		aBoolean553 = false;
		Class430.method28815();
	}

	@OriginalMember(owner = "client!av", name = "ag", descriptor = "()V", line = 93)
	static void method24273() {
		if (Class509.aFileOutputStream1 != null) {
			try {
				Class509.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Class509.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!av", name = "al", descriptor = "()V", line = 93)
	static void method24274() {
		if (Class509.aFileOutputStream1 != null) {
			try {
				Class509.aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		Class509.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!av", name = "ak", descriptor = "()Z", line = 103)
	static boolean method24275() {
		return aBoolean553;
	}

	@OriginalMember(owner = "client!av", name = "ao", descriptor = "()Z", line = 103)
	static boolean method24276() {
		return aBoolean553;
	}

	@OriginalMember(owner = "client!av", name = "au", descriptor = "([Ljava/lang/String;)V", line = 107)
	static void method24277(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			aString126 = aString126 + arg0[0];
			anInt3244 += arg0[0].length() * 399107939;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class51.method764("Pausing for " + local17 + " seconds...");
				aStringArray23 = arg0;
				anInt3242 = (local5 + 1) * -556419873;
				Class330.aLong258 = (Class280.method26667() + (long) (local17 * 1000)) * 6271713210732061629L;
				return;
			}
			aString126 = arg0[local5];
			Class647.method32851(false);
		}
	}

	@OriginalMember(owner = "client!av", name = "ax", descriptor = "()V", line = 134)
	static void method24278() {
		if (anInt3245 * 431834035 < 102) {
			anInt3245 += -2067868446;
		}
		@Pc(24) int local24;
		if (anInt3242 * -1804400865 != -1 && Class330.aLong258 * 7283764449686237077L < Class280.method26667()) {
			for (local24 = anInt3242 * -1804400865; local24 < aStringArray23.length; local24++) {
				if (aStringArray23[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(aStringArray23[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class51.method764("Pausing for " + local36 + " seconds...");
					anInt3242 = (local24 + 1) * -556419873;
					Class330.aLong258 = (Class280.method26667() + (long) (local36 * 1000)) * 6271713210732061629L;
					return;
				}
				aString126 = aStringArray23[local24];
				Class647.method32851(false);
			}
			anInt3242 = 556419873;
		}
		if (client.anInt3465 * -1756158727 != 0) {
			anInt3247 -= client.anInt3465 * 643697769;
			if (anInt3247 * -596800939 >= anInt3240 * -1716872169) {
				anInt3247 = anInt3240 * -1262726981 - 719528701;
			}
			if (anInt3247 * -596800939 < 0) {
				anInt3247 = 0;
			}
			client.anInt3465 = 0;
		}
		for (local24 = 0; local24 < client.anInt3401 * 1779655715; local24++) {
			@Pc(127) Interface62 local127 = client.anInterface62Array1[local24];
			@Pc(131) int local131 = local127.method14158();
			@Pc(135) char local135 = local127.method14146();
			@Pc(139) int local139 = local127.method14149();
			if (local131 == 84) {
				Class647.method32851(false);
			}
			if (local131 == 80) {
				Class647.method32851(true);
			} else if (local131 == 66 && (local139 & 0x4) != 0) {
				if (Class161.aClipboard1 != null) {
					@Pc(164) String local164 = "";
					for (@Pc(169) int local169 = Class96_Sub12.aStringArray10.length - 1; local169 >= 0; local169--) {
						if (Class96_Sub12.aStringArray10[local169] != null && Class96_Sub12.aStringArray10[local169].length() > 0) {
							local164 = local164 + Class96_Sub12.aStringArray10[local169] + '\n';
						}
					}
					Class161.aClipboard1.setContents(new StringSelection(local164), null);
				}
			} else if (local131 == 67 && (local139 & 0x4) != 0) {
				if (Class161.aClipboard1 != null) {
					try {
						@Pc(218) Transferable local218 = Class161.aClipboard1.getContents(null);
						if (local218 != null) {
							@Pc(225) String local225 = (String) local218.getTransferData(DataFlavor.stringFlavor);
							if (local225 != null) {
								@Pc(232) String[] local232 = Class398.method28452(local225, '\n');
								Class631.method32613(local232);
							}
						}
					} catch (@Pc(237) Exception local237) {
					}
				}
			} else if (local131 == 85 && anInt3244 * -1360080309 > 0) {
				aString126 = aString126.substring(0, anInt3244 * -1360080309 - 1) + aString126.substring(anInt3244 * -1360080309);
				anInt3244 -= 399107939;
			} else if (local131 == 101 && anInt3244 * -1360080309 < aString126.length()) {
				aString126 = aString126.substring(0, anInt3244 * -1360080309) + aString126.substring(anInt3244 * -1360080309 + 1);
			} else if (local131 == 96 && anInt3244 * -1360080309 > 0) {
				anInt3244 -= 399107939;
			} else if (local131 == 97 && anInt3244 * -1360080309 < aString126.length()) {
				anInt3244 += 399107939;
			} else if (local131 == 102) {
				anInt3244 = 0;
			} else if (local131 == 103) {
				anInt3244 = aString126.length() * 399107939;
			} else if (local131 == 104 && anInt3243 * 2030085227 < Class96_Sub12.aStringArray10.length) {
				anInt3243 += 1417472067;
				Class277.method26577();
				anInt3244 = aString126.length() * 399107939;
			} else if (local131 == 105 && anInt3243 * 2030085227 > 0) {
				anInt3243 -= 1417472067;
				Class277.method26577();
				anInt3244 = aString126.length() * 399107939;
			} else if (Class601.method32040(local135) || "\\/.:, _-+[]~@".indexOf(local135) != -1) {
				aString126 = aString126.substring(0, anInt3244 * -1360080309) + client.anInterface62Array1[local24].method14146() + aString126.substring(anInt3244 * -1360080309);
				anInt3244 += 399107939;
			}
		}
		client.anInt3401 = 0;
		client.anInt3468 = 0;
		Class430.method28815();
	}

	@OriginalMember(owner = "client!av", name = "ar", descriptor = "()V", line = 226)
	static void method24279() {
		if (anInt3243 * 2030085227 <= 0) {
			aString126 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Class96_Sub12.aStringArray10.length; local7++) {
			if (Class96_Sub12.aStringArray10[local7].indexOf("--> ") != -1) {
				local5++;
				if (local5 == anInt3243 * 2030085227) {
					aString126 = Class96_Sub12.aStringArray10[local7].substring(Class96_Sub12.aStringArray10[local7].indexOf(62) + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "at", descriptor = "(Ljava/lang/String;)V", line = 239)
	public static void method24280(@OriginalArg(0) String arg0) {
		aString126 = arg0;
		anInt3244 = aString126.length() * 399107939;
	}

	@OriginalMember(owner = "client!av", name = "ad", descriptor = "(Ljava/lang/String;)V", line = 239)
	public static void method24281(@OriginalArg(0) String arg0) {
		aString126 = arg0;
		anInt3244 = aString126.length() * 399107939;
	}

	@OriginalMember(owner = "client!av", name = "ac", descriptor = "(Ljava/lang/String;)V", line = 239)
	public static void method24282(@OriginalArg(0) String arg0) {
		aString126 = arg0;
		anInt3244 = aString126.length() * 399107939;
	}

	@OriginalMember(owner = "client!av", name = "av", descriptor = "(Ljava/lang/String;)V", line = 239)
	public static void method24283(@OriginalArg(0) String arg0) {
		aString126 = arg0;
		anInt3244 = aString126.length() * 399107939;
	}

	@OriginalMember(owner = "client!av", name = "ae", descriptor = "(Ljava/lang/String;)V", line = 260)
	public static void method24284(@OriginalArg(0) String arg0) {
		if (Class96_Sub12.aStringArray10 == null) {
			Class41.method696();
		}
		client.aCalendar3.setTime(new Date(Class280.method26667()));
		@Pc(15) int local15 = client.aCalendar3.get(11);
		@Pc(19) int local19 = client.aCalendar3.get(12);
		@Pc(23) int local23 = client.aCalendar3.get(13);
		@Pc(57) String local57 = Integer.toString(local15 / 10) + local15 % 10 + ":" + local19 / 10 + local19 % 10 + ":" + local23 / 10 + local23 % 10;
		@Pc(62) String[] local62 = Class398.method28452(arg0, '\n');
		for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
			for (@Pc(72) int local72 = anInt3240 * -1716872169; local72 > 0; local72--) {
				Class96_Sub12.aStringArray10[local72] = Class96_Sub12.aStringArray10[local72 - 1];
			}
			Class96_Sub12.aStringArray10[0] = local57 + ": " + local62[local64];
			if (Class509.aFileOutputStream1 != null) {
				try {
					Class509.aFileOutputStream1.write(Class398.method28451(Class96_Sub12.aStringArray10[0] + "\n"));
				} catch (@Pc(118) IOException local118) {
				}
			}
			if (anInt3240 * -1716872169 < Class96_Sub12.aStringArray10.length - 1) {
				anInt3240 += 1351113639;
				if (anInt3247 * -596800939 > 0) {
					anInt3247 += 719528701;
				}
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "ah", descriptor = "(Lclient!dx;)V", line = 286)
	static void method24285(@OriginalArg(0) Class86 arg0) {
		if (Class257.method26227() && Class329.method27586()) {
			Class667.method33162(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		}
		arg0.method20151(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		arg0.method20088(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350, anInt3245 * 431834035 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt3239 * -103516429);
		@Pc(55) int local55;
		if (anInt3240 * -1716872169 > 0) {
			local55 = 346 - anInt3239 * -103516429 - 4;
			@Pc(67) int local67 = local55 * local43 / (local43 + anInt3240 * -1716872169 - 1);
			@Pc(69) int local69 = 4;
			if (anInt3240 * -1716872169 > 1) {
				local69 += (anInt3240 * -1716872169 - 1 - anInt3247 * -596800939) * (local55 - local67) / (anInt3240 * -1716872169 - 1);
			}
			arg0.method20088(Class149_Sub4.anInt2368 * 1771907305 - 16, local69, 12, local67, anInt3245 * 431834035 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt3247 * -596800939; local118 < local43 + anInt3247 * -596800939 && local118 < anInt3240 * -1716872169; local118++) {
				@Pc(137) String[] local137 = Class398.method28452(Class96_Sub12.aStringArray10[local118], '\b');
				@Pc(148) int local148 = (Class149_Sub4.anInt2368 * 1771907305 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local148 * local150 + 8;
					arg0.method20151(local160, 0, local160 + local148 - 8, 350);
					Class128_Sub1.aClass94_5.method7602(Class338.method27696(local137[local150]), local160, 350 - anInt3241 * -583687411 - 2 - Class611.aClass17_13.anInt51 * 728893755 - (local118 - anInt3247 * -596800939) * anInt3239 * -103516429, -1, -16777216);
				}
			}
		}
		Class248.aClass94_7.method7607("881 1", Class149_Sub4.anInt2368 * 1771907305 - 25, 330, -1, -16777216);
		arg0.method20151(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		arg0.method19994(0, 350 - anInt3241 * -583687411, Class149_Sub4.anInt2368 * 1771907305, -1);
		Class260.aClass94_8.method7602("--> " + Class338.method27696(aString126), 10, 350 - Class346.aClass17_12.anInt51 * 728893755 - 1, -1, -16777216);
		if (Class77_Sub36.aBoolean351) {
			local55 = -1;
			if (client.anInt3414 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method19998(Class346.aClass17_12.method297("--> " + Class338.method27696(aString126).substring(0, anInt3244 * -1360080309)) + 10, 350 - Class346.aClass17_12.anInt51 * 728893755 - 11, 12, local55);
		}
		arg0.method20299();
		Class28.method497();
	}

	@OriginalMember(owner = "client!av", name = "as", descriptor = "(Lclient!dx;)V", line = 286)
	static void method24286(@OriginalArg(0) Class86 arg0) {
		if (Class257.method26227() && Class329.method27586()) {
			Class667.method33162(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		}
		arg0.method20151(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		arg0.method20088(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350, anInt3245 * 431834035 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt3239 * -103516429);
		@Pc(55) int local55;
		if (anInt3240 * -1716872169 > 0) {
			local55 = 346 - anInt3239 * -103516429 - 4;
			@Pc(67) int local67 = local55 * local43 / (local43 + anInt3240 * -1716872169 - 1);
			@Pc(69) int local69 = 4;
			if (anInt3240 * -1716872169 > 1) {
				local69 += (anInt3240 * -1716872169 - 1 - anInt3247 * -596800939) * (local55 - local67) / (anInt3240 * -1716872169 - 1);
			}
			arg0.method20088(Class149_Sub4.anInt2368 * 1771907305 - 16, local69, 12, local67, anInt3245 * 431834035 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt3247 * -596800939; local118 < local43 + anInt3247 * -596800939 && local118 < anInt3240 * -1716872169; local118++) {
				@Pc(137) String[] local137 = Class398.method28452(Class96_Sub12.aStringArray10[local118], '\b');
				@Pc(148) int local148 = (Class149_Sub4.anInt2368 * 1771907305 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local148 * local150 + 8;
					arg0.method20151(local160, 0, local160 + local148 - 8, 350);
					Class128_Sub1.aClass94_5.method7602(Class338.method27696(local137[local150]), local160, 350 - anInt3241 * -583687411 - 2 - Class611.aClass17_13.anInt51 * 728893755 - (local118 - anInt3247 * -596800939) * anInt3239 * -103516429, -1, -16777216);
				}
			}
		}
		Class248.aClass94_7.method7607("881 1", Class149_Sub4.anInt2368 * 1771907305 - 25, 330, -1, -16777216);
		arg0.method20151(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		arg0.method19994(0, 350 - anInt3241 * -583687411, Class149_Sub4.anInt2368 * 1771907305, -1);
		Class260.aClass94_8.method7602("--> " + Class338.method27696(aString126), 10, 350 - Class346.aClass17_12.anInt51 * 728893755 - 1, -1, -16777216);
		if (Class77_Sub36.aBoolean351) {
			local55 = -1;
			if (client.anInt3414 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method19998(Class346.aClass17_12.method297("--> " + Class338.method27696(aString126).substring(0, anInt3244 * -1360080309)) + 10, 350 - Class346.aClass17_12.anInt51 * 728893755 - 11, 12, local55);
		}
		arg0.method20299();
		Class28.method497();
	}

	@OriginalMember(owner = "client!av", name = "aq", descriptor = "(Lclient!dx;)V", line = 286)
	static void method24287(@OriginalArg(0) Class86 arg0) {
		if (Class257.method26227() && Class329.method27586()) {
			Class667.method33162(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		}
		arg0.method20151(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		arg0.method20088(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350, anInt3245 * 431834035 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt3239 * -103516429);
		@Pc(55) int local55;
		if (anInt3240 * -1716872169 > 0) {
			local55 = 346 - anInt3239 * -103516429 - 4;
			@Pc(67) int local67 = local55 * local43 / (local43 + anInt3240 * -1716872169 - 1);
			@Pc(69) int local69 = 4;
			if (anInt3240 * -1716872169 > 1) {
				local69 += (anInt3240 * -1716872169 - 1 - anInt3247 * -596800939) * (local55 - local67) / (anInt3240 * -1716872169 - 1);
			}
			arg0.method20088(Class149_Sub4.anInt2368 * 1771907305 - 16, local69, 12, local67, anInt3245 * 431834035 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt3247 * -596800939; local118 < local43 + anInt3247 * -596800939 && local118 < anInt3240 * -1716872169; local118++) {
				@Pc(137) String[] local137 = Class398.method28452(Class96_Sub12.aStringArray10[local118], '\b');
				@Pc(148) int local148 = (Class149_Sub4.anInt2368 * 1771907305 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local148 * local150 + 8;
					arg0.method20151(local160, 0, local160 + local148 - 8, 350);
					Class128_Sub1.aClass94_5.method7602(Class338.method27696(local137[local150]), local160, 350 - anInt3241 * -583687411 - 2 - Class611.aClass17_13.anInt51 * 728893755 - (local118 - anInt3247 * -596800939) * anInt3239 * -103516429, -1, -16777216);
				}
			}
		}
		Class248.aClass94_7.method7607("881 1", Class149_Sub4.anInt2368 * 1771907305 - 25, 330, -1, -16777216);
		arg0.method20151(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		arg0.method19994(0, 350 - anInt3241 * -583687411, Class149_Sub4.anInt2368 * 1771907305, -1);
		Class260.aClass94_8.method7602("--> " + Class338.method27696(aString126), 10, 350 - Class346.aClass17_12.anInt51 * 728893755 - 1, -1, -16777216);
		if (Class77_Sub36.aBoolean351) {
			local55 = -1;
			if (client.anInt3414 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method19998(Class346.aClass17_12.method297("--> " + Class338.method27696(aString126).substring(0, anInt3244 * -1360080309)) + 10, 350 - Class346.aClass17_12.anInt51 * 728893755 - 11, 12, local55);
		}
		arg0.method20299();
		Class28.method497();
	}

	@OriginalMember(owner = "client!av", name = "am", descriptor = "(Lclient!dx;)V", line = 286)
	static void method24288(@OriginalArg(0) Class86 arg0) {
		if (Class257.method26227() && Class329.method27586()) {
			Class667.method33162(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		}
		arg0.method20151(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		arg0.method20088(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350, anInt3245 * 431834035 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (anInt3239 * -103516429);
		@Pc(55) int local55;
		if (anInt3240 * -1716872169 > 0) {
			local55 = 346 - anInt3239 * -103516429 - 4;
			@Pc(67) int local67 = local55 * local43 / (local43 + anInt3240 * -1716872169 - 1);
			@Pc(69) int local69 = 4;
			if (anInt3240 * -1716872169 > 1) {
				local69 += (anInt3240 * -1716872169 - 1 - anInt3247 * -596800939) * (local55 - local67) / (anInt3240 * -1716872169 - 1);
			}
			arg0.method20088(Class149_Sub4.anInt2368 * 1771907305 - 16, local69, 12, local67, anInt3245 * 431834035 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = anInt3247 * -596800939; local118 < local43 + anInt3247 * -596800939 && local118 < anInt3240 * -1716872169; local118++) {
				@Pc(137) String[] local137 = Class398.method28452(Class96_Sub12.aStringArray10[local118], '\b');
				@Pc(148) int local148 = (Class149_Sub4.anInt2368 * 1771907305 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local148 * local150 + 8;
					arg0.method20151(local160, 0, local160 + local148 - 8, 350);
					Class128_Sub1.aClass94_5.method7602(Class338.method27696(local137[local150]), local160, 350 - anInt3241 * -583687411 - 2 - Class611.aClass17_13.anInt51 * 728893755 - (local118 - anInt3247 * -596800939) * anInt3239 * -103516429, -1, -16777216);
				}
			}
		}
		Class248.aClass94_7.method7607("881 1", Class149_Sub4.anInt2368 * 1771907305 - 25, 330, -1, -16777216);
		arg0.method20151(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		arg0.method19994(0, 350 - anInt3241 * -583687411, Class149_Sub4.anInt2368 * 1771907305, -1);
		Class260.aClass94_8.method7602("--> " + Class338.method27696(aString126), 10, 350 - Class346.aClass17_12.anInt51 * 728893755 - 1, -1, -16777216);
		if (Class77_Sub36.aBoolean351) {
			local55 = -1;
			if (client.anInt3414 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method19998(Class346.aClass17_12.method297("--> " + Class338.method27696(aString126).substring(0, anInt3244 * -1360080309)) + 10, 350 - Class346.aClass17_12.anInt51 * 728893755 - 11, 12, local55);
		}
		arg0.method20299();
		Class28.method497();
	}

	@OriginalMember(owner = "client!av", name = "ay", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 322)
	static String method24289(@OriginalArg(0) String arg0) {
		@Pc(1) String local1 = null;
		@Pc(5) int local5 = arg0.indexOf("--> ");
		if (local5 >= 0) {
			local1 = arg0.substring(0, local5 + 4);
			arg0 = arg0.substring(local5 + 4);
		}
		@Pc(22) int local22 = -1;
		if (arg0.startsWith("directlogin ")) {
			local22 = arg0.indexOf(" ", "directlogin ".length());
		}
		if (local22 >= 0) {
			@Pc(37) int local37 = arg0.length();
			arg0 = arg0.substring(0, local22) + " ";
			for (@Pc(53) int local53 = local22 + 1; local53 < local37; local53++) {
				arg0 = arg0 + "*";
			}
		}
		return local1 == null ? arg0 : local1 + arg0;
	}

	@OriginalMember(owner = "client!av", name = "af", descriptor = "()V", line = 339)
	static void method24290() {
	}

	@OriginalMember(owner = "client!av", name = "an", descriptor = "(Ljava/lang/String;ZZ)V", line = 343)
	public static void method24291(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class51.method764("commands - This command");
				Class51.method764("cls - Clear console");
				Class51.method764("displayfps - Toggle FPS and other information");
				Class51.method764("renderer - Print graphics renderer information");
				Class51.method764("heap - Print java memory information");
				Class51.method764("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				anInt3240 = 0;
				anInt3247 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean626 = !client.aBoolean626;
				if (client.aBoolean626) {
					Class51.method764("FPS on");
				} else {
					Class51.method764("FPS off");
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class208 local62 = Class284.aClass86_9.method20046();
				Class51.method764("Toolkit ID: " + Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109());
				Class51.method764("Vendor: " + local62.anInt3588 * 1866206313);
				Class51.method764("Name: " + local62.aString168);
				Class51.method764("Version: " + local62.anInt3589 * 1458635069);
				Class51.method764("Device: " + local62.aString167);
				Class51.method764("Driver Version: " + local62.aLong244 * -1920893184504226295L);
				local139 = Class284.aClass86_9.method20059();
				if (local139.length() > 0) {
					Class51.method764(local139);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class51.method764("Heap: " + Class504.anInt3376 * 721369631 + "MB");
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class595 local173 = client.aClass517_1.method30409();
				if (Class11.anInt36 * -891094135 == 3) {
					@Pc(182) Class447 local182 = Class597.aClass107_Sub1_2.method8883();
					@Pc(186) Class447 local186 = Class597.aClass107_Sub1_2.method8889();
					Class51.method764("Pos: " + (new Class595(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local182.aFloat277 >> 9, (int) local182.aFloat278 >> 9)).toString() + " Height: " + (Class277.method26658((int) local182.aFloat277 - (local173.anInt5504 * -424199969 << 9), (int) local182.aFloat278 - (local173.anInt5506 * -1166289421 << 9), Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) + (int) local182.aFloat276));
					Class51.method764("Look: " + (new Class595(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local186.aFloat277 >> 9, (int) local186.aFloat278 >> 9)).toString() + " Height: " + (Class277.method26658((int) local186.aFloat277 - (local173.anInt5504 * -424199969 << 9), (int) local182.aFloat278 - (local173.anInt5506 * -1166289421 << 9), Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) + (int) local182.aFloat276));
				} else {
					Class51.method764("Pos: " + Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 + "," + ((Class96_Sub13.anInt883 * -116109187 >> 9) + local173.anInt5504 * -424199969 >> 6) + "," + ((Class633.anInt5710 * -1098179003 >> 9) + local173.anInt5506 * -1166289421 >> 6) + "," + ((Class96_Sub13.anInt883 * -116109187 >> 9) + local173.anInt5504 * -424199969 & 0x3F) + "," + ((Class633.anInt5710 * -1098179003 >> 9) + local173.anInt5506 * -1166289421 & 0x3F) + " Height: " + (Class277.method26658(Class96_Sub13.anInt883 * -116109187, Class633.anInt5710 * -1098179003, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) - Class672.anInt5796 * 1529694271));
					Class51.method764("Look: " + Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 + "," + (Class650.anInt5741 * 2006804215 + local173.anInt5504 * -424199969 >> 6) + "," + (Class605.anInt5562 * 1803758839 + local173.anInt5506 * -1166289421 >> 6) + "," + (Class650.anInt5741 * 2006804215 + local173.anInt5504 * -424199969 & 0x3F) + "," + (Class605.anInt5562 * 1803758839 + local173.anInt5506 * -1166289421 & 0x3F) + " Height: " + (Class277.method26658(Class650.anInt5741 * 2006804215, Class605.anInt5562 * 1803758839, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) - Class111.anInt1096 * -1339841327));
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class51.method764(Class44.aClass44_10.method713(Class128.aClass667_3));
			return;
		}
		if (Class661.aClass661_5 != client.aClass661_1 || client.anInt3466 * 365872613 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class196.method25463(1, -1, -1, false);
					if (Class569.method31421() == 1) {
						Class51.method764("Success");
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class196.method25463(2, -1, -1, false);
					if (Class569.method31421() == 2) {
						Class51.method764("Success");
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (Class706.aBoolean868 && arg0.equalsIgnoreCase("wm3")) {
					Class196.method25463(3, 1024, 768, false);
					if (Class569.method31421() == 3) {
						Class51.method764("Success");
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				@Pc(570) Class77_Sub20 local570;
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.anInt3390 * -1850530127 != 15) {
						Class51.method764("Failure");
						return;
					}
					local568 = -1;
					local570 = null;
					@Pc(574) String local574 = arg0.substring(9);
					@Pc(578) int local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class51.method764("Failure");
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class51.method764("Failure");
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class143_Sub20.method15694(local139, local568);
					Class51.method764("Success");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class533.method30776(0, false);
					if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 0) {
						Class51.method764("Success");
						Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
						Class667.method33150();
						client.aBoolean593 = false;
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class533.method30776(1, false);
					if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 1) {
						Class51.method764("Success");
						Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 1);
						Class667.method33150();
						client.aBoolean593 = false;
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class533.method30776(3, false);
					if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 3) {
						Class51.method764("Success");
						Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 3);
						Class667.method33150();
						client.aBoolean593 = false;
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class533.method30776(5, false);
					if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 5) {
						Class51.method764("Success");
						Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 5);
						Class667.method33150();
						client.aBoolean593 = false;
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.anInt3390 * -1850530127 == 16) {
						Class520.method30572();
					} else if (client.anInt3390 * -1850530127 == 3) {
						client.aClass82_2.aBoolean52 = true;
					}
					return;
				}
				@Pc(778) int local778;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(776) Class82[] local776 = client.aClass82Array1;
					for (local778 = 0; local778 < local776.length; local778++) {
						@Pc(786) Class82 local786 = local776[local778];
						if (local786.method2022() != null) {
							local786.method2022().method14343();
						}
					}
					Class7.aClass129_1.method12199();
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class51.method764("varpbit=" + Class55.aClass124_1.method35935(Class55.aClass124_1.method27606(local568)));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class51.method764("varp=" + Class55.aClass124_1.method35934(Class55.aClass124_1.method27607(Class127.aClass127_63, local568)));
					return;
				}
				@Pc(865) String[] local865;
				if (arg0.startsWith("directlogin")) {
					local865 = Class398.method28452(arg0.substring(12), ' ');
					if (local865.length == 2 || local865.length == 3) {
						if (Class231.method25828()) {
							Class77_Sub13_Sub10.method21676();
						}
						Class96_Sub5.method7143(local865[0], local865[1], local865.length > 2 ? local865[2] : "", true);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local865 = Class398.method28452(arg0.substring(8), ' ');
					local778 = Integer.parseInt(local865[0]);
					@Pc(923) String local923 = local865.length > 1 ? local865[1] : "";
					Class68.method977(local778, local923, true);
					return;
				}
				@Pc(940) File local940;
				if (arg0.startsWith("setoutput ")) {
					local940 = new File(arg0.substring(10));
					if (local940.exists()) {
						local940 = new File(arg0.substring(10) + "." + Class280.method26667() + ".log");
						if (local940.exists()) {
							Class51.method764("file already exists!");
							return;
						}
					}
					if (Class509.aFileOutputStream1 != null) {
						Class509.aFileOutputStream1.close();
						Class509.aFileOutputStream1 = null;
					}
					try {
						Class509.aFileOutputStream1 = new FileOutputStream(local940);
						return;
					} catch (@Pc(982) FileNotFoundException local982) {
						Class51.method764("Could not create " + local940.getName());
						return;
					} catch (@Pc(995) SecurityException local995) {
						Class51.method764("Cannot write to " + local940.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Class509.aFileOutputStream1 != null) {
						Class509.aFileOutputStream1.close();
					}
					Class509.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local940 = new File(arg0.substring(10));
					if (!local940.exists()) {
						Class51.method764("No such file");
						return;
					}
					@Pc(1042) byte[] local1042 = Class143_Sub24.method15786(local940);
					if (local1042 == null) {
						Class51.method764("Failed to read file");
						return;
					}
					@Pc(1060) String[] local1060 = Class398.method28452(Class147.method15625(Class138.method14214(local1042), '\r', ""), '\n');
					Class631.method32613(local1060);
				}
				if (client.anInt3390 * -1850530127 == 16 || client.anInt3390 * -1850530127 == 9) {
					@Pc(1076) Class82 local1076 = Class230.method25826();
					local570 = Class365.method28132(Class414.aClass414_83, local1076.aClass16_1);
					local570.aClass77_Sub39_Sub1_2.method22403(arg0.length() + 3);
					local570.aClass77_Sub39_Sub1_2.method22403(arg1 ? 1 : 0);
					local570.aClass77_Sub39_Sub1_2.method22403(arg2 ? 1 : 0);
					local570.aClass77_Sub39_Sub1_2.method22440(arg0);
					local1076.method2004(local570);
				}
			} catch (@Pc(1119) Exception local1119) {
				Class51.method764(Class44.aClass44_10.method713(Class128.aClass667_3));
				return;
			}
		}
		if (client.anInt3390 * -1850530127 != 16 && client.anInt3390 * -1850530127 != 9) {
			Class51.method764(Class44.aClass44_4.method713(Class128.aClass667_3) + arg0);
		}
	}

	@OriginalMember(owner = "client!av", name = "ab", descriptor = "(Ljava/lang/String;ZZ)V", line = 343)
	public static void method24292(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class51.method764("commands - This command");
				Class51.method764("cls - Clear console");
				Class51.method764("displayfps - Toggle FPS and other information");
				Class51.method764("renderer - Print graphics renderer information");
				Class51.method764("heap - Print java memory information");
				Class51.method764("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				anInt3240 = 0;
				anInt3247 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean626 = !client.aBoolean626;
				if (client.aBoolean626) {
					Class51.method764("FPS on");
				} else {
					Class51.method764("FPS off");
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class208 local62 = Class284.aClass86_9.method20046();
				Class51.method764("Toolkit ID: " + Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109());
				Class51.method764("Vendor: " + local62.anInt3588 * 1866206313);
				Class51.method764("Name: " + local62.aString168);
				Class51.method764("Version: " + local62.anInt3589 * 1458635069);
				Class51.method764("Device: " + local62.aString167);
				Class51.method764("Driver Version: " + local62.aLong244 * -1920893184504226295L);
				local139 = Class284.aClass86_9.method20059();
				if (local139.length() > 0) {
					Class51.method764(local139);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class51.method764("Heap: " + Class504.anInt3376 * 721369631 + "MB");
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class595 local173 = client.aClass517_1.method30409();
				if (Class11.anInt36 * -891094135 == 3) {
					@Pc(182) Class447 local182 = Class597.aClass107_Sub1_2.method8883();
					@Pc(186) Class447 local186 = Class597.aClass107_Sub1_2.method8889();
					Class51.method764("Pos: " + (new Class595(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local182.aFloat277 >> 9, (int) local182.aFloat278 >> 9)).toString() + " Height: " + (Class277.method26658((int) local182.aFloat277 - (local173.anInt5504 * -424199969 << 9), (int) local182.aFloat278 - (local173.anInt5506 * -1166289421 << 9), Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) + (int) local182.aFloat276));
					Class51.method764("Look: " + (new Class595(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local186.aFloat277 >> 9, (int) local186.aFloat278 >> 9)).toString() + " Height: " + (Class277.method26658((int) local186.aFloat277 - (local173.anInt5504 * -424199969 << 9), (int) local182.aFloat278 - (local173.anInt5506 * -1166289421 << 9), Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) + (int) local182.aFloat276));
				} else {
					Class51.method764("Pos: " + Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 + "," + ((Class96_Sub13.anInt883 * -116109187 >> 9) + local173.anInt5504 * -424199969 >> 6) + "," + ((Class633.anInt5710 * -1098179003 >> 9) + local173.anInt5506 * -1166289421 >> 6) + "," + ((Class96_Sub13.anInt883 * -116109187 >> 9) + local173.anInt5504 * -424199969 & 0x3F) + "," + ((Class633.anInt5710 * -1098179003 >> 9) + local173.anInt5506 * -1166289421 & 0x3F) + " Height: " + (Class277.method26658(Class96_Sub13.anInt883 * -116109187, Class633.anInt5710 * -1098179003, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) - Class672.anInt5796 * 1529694271));
					Class51.method764("Look: " + Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 + "," + (Class650.anInt5741 * 2006804215 + local173.anInt5504 * -424199969 >> 6) + "," + (Class605.anInt5562 * 1803758839 + local173.anInt5506 * -1166289421 >> 6) + "," + (Class650.anInt5741 * 2006804215 + local173.anInt5504 * -424199969 & 0x3F) + "," + (Class605.anInt5562 * 1803758839 + local173.anInt5506 * -1166289421 & 0x3F) + " Height: " + (Class277.method26658(Class650.anInt5741 * 2006804215, Class605.anInt5562 * 1803758839, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) - Class111.anInt1096 * -1339841327));
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class51.method764(Class44.aClass44_10.method713(Class128.aClass667_3));
			return;
		}
		if (Class661.aClass661_5 != client.aClass661_1 || client.anInt3466 * 365872613 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class196.method25463(1, -1, -1, false);
					if (Class569.method31421() == 1) {
						Class51.method764("Success");
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class196.method25463(2, -1, -1, false);
					if (Class569.method31421() == 2) {
						Class51.method764("Success");
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (Class706.aBoolean868 && arg0.equalsIgnoreCase("wm3")) {
					Class196.method25463(3, 1024, 768, false);
					if (Class569.method31421() == 3) {
						Class51.method764("Success");
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				@Pc(570) Class77_Sub20 local570;
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.anInt3390 * -1850530127 != 15) {
						Class51.method764("Failure");
						return;
					}
					local568 = -1;
					local570 = null;
					@Pc(574) String local574 = arg0.substring(9);
					@Pc(578) int local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class51.method764("Failure");
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class51.method764("Failure");
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class143_Sub20.method15694(local139, local568);
					Class51.method764("Success");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class533.method30776(0, false);
					if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 0) {
						Class51.method764("Success");
						Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
						Class667.method33150();
						client.aBoolean593 = false;
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class533.method30776(1, false);
					if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 1) {
						Class51.method764("Success");
						Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 1);
						Class667.method33150();
						client.aBoolean593 = false;
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class533.method30776(3, false);
					if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 3) {
						Class51.method764("Success");
						Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 3);
						Class667.method33150();
						client.aBoolean593 = false;
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class533.method30776(5, false);
					if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 5) {
						Class51.method764("Success");
						Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 5);
						Class667.method33150();
						client.aBoolean593 = false;
					} else {
						Class51.method764("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.anInt3390 * -1850530127 == 16) {
						Class520.method30572();
					} else if (client.anInt3390 * -1850530127 == 3) {
						client.aClass82_2.aBoolean52 = true;
					}
					return;
				}
				@Pc(778) int local778;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(776) Class82[] local776 = client.aClass82Array1;
					for (local778 = 0; local778 < local776.length; local778++) {
						@Pc(786) Class82 local786 = local776[local778];
						if (local786.method2022() != null) {
							local786.method2022().method14343();
						}
					}
					Class7.aClass129_1.method12199();
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class51.method764("varpbit=" + Class55.aClass124_1.method35935(Class55.aClass124_1.method27606(local568)));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class51.method764("varp=" + Class55.aClass124_1.method35934(Class55.aClass124_1.method27607(Class127.aClass127_63, local568)));
					return;
				}
				@Pc(865) String[] local865;
				if (arg0.startsWith("directlogin")) {
					local865 = Class398.method28452(arg0.substring(12), ' ');
					if (local865.length == 2 || local865.length == 3) {
						if (Class231.method25828()) {
							Class77_Sub13_Sub10.method21676();
						}
						Class96_Sub5.method7143(local865[0], local865[1], local865.length > 2 ? local865[2] : "", true);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local865 = Class398.method28452(arg0.substring(8), ' ');
					local778 = Integer.parseInt(local865[0]);
					@Pc(923) String local923 = local865.length > 1 ? local865[1] : "";
					Class68.method977(local778, local923, true);
					return;
				}
				@Pc(940) File local940;
				if (arg0.startsWith("setoutput ")) {
					local940 = new File(arg0.substring(10));
					if (local940.exists()) {
						local940 = new File(arg0.substring(10) + "." + Class280.method26667() + ".log");
						if (local940.exists()) {
							Class51.method764("file already exists!");
							return;
						}
					}
					if (Class509.aFileOutputStream1 != null) {
						Class509.aFileOutputStream1.close();
						Class509.aFileOutputStream1 = null;
					}
					try {
						Class509.aFileOutputStream1 = new FileOutputStream(local940);
						return;
					} catch (@Pc(982) FileNotFoundException local982) {
						Class51.method764("Could not create " + local940.getName());
						return;
					} catch (@Pc(995) SecurityException local995) {
						Class51.method764("Cannot write to " + local940.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Class509.aFileOutputStream1 != null) {
						Class509.aFileOutputStream1.close();
					}
					Class509.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local940 = new File(arg0.substring(10));
					if (!local940.exists()) {
						Class51.method764("No such file");
						return;
					}
					@Pc(1042) byte[] local1042 = Class143_Sub24.method15786(local940);
					if (local1042 == null) {
						Class51.method764("Failed to read file");
						return;
					}
					@Pc(1060) String[] local1060 = Class398.method28452(Class147.method15625(Class138.method14214(local1042), '\r', ""), '\n');
					Class631.method32613(local1060);
				}
				if (client.anInt3390 * -1850530127 == 16 || client.anInt3390 * -1850530127 == 9) {
					@Pc(1076) Class82 local1076 = Class230.method25826();
					local570 = Class365.method28132(Class414.aClass414_83, local1076.aClass16_1);
					local570.aClass77_Sub39_Sub1_2.method22403(arg0.length() + 3);
					local570.aClass77_Sub39_Sub1_2.method22403(arg1 ? 1 : 0);
					local570.aClass77_Sub39_Sub1_2.method22403(arg2 ? 1 : 0);
					local570.aClass77_Sub39_Sub1_2.method22440(arg0);
					local1076.method2004(local570);
				}
			} catch (@Pc(1119) Exception local1119) {
				Class51.method764(Class44.aClass44_10.method713(Class128.aClass667_3));
				return;
			}
		}
		if (client.anInt3390 * -1850530127 != 16 && client.anInt3390 * -1850530127 != 9) {
			Class51.method764(Class44.aClass44_4.method713(Class128.aClass667_3) + arg0);
		}
	}

	@OriginalMember(owner = "client!av", name = "aa", descriptor = "(I)V", line = 594)
	static void method24293(@OriginalArg(0) int arg0) {
		if (arg0 == 4) {
			throw new Error();
		} else if (arg0 == 19) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 27) {
					Class277.method26576();
				} else if (arg0 == 14) {
					Class51.method764("" + Class504.anInt3362 * 1720947399);
				} else if (arg0 == 16) {
					@Pc(43) Class553 local43 = client.aClass517_1.method30435().aClass553_1;
					local43.aBoolean792 = !local43.aBoolean792;
				} else if (arg0 == 10) {
					client.aBoolean626 = true;
				} else if (arg0 == 3) {
					client.aBoolean626 = false;
				} else if (arg0 == 13) {
					client.aClass703_7.method36521();
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 7) {
						Class94_Sub4.method7463();
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class51.method764("" + local95);
					} else if (arg0 == 2) {
						Class94_Sub4.method7463();
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class51.method764("" + local95);
						Class88.method5492();
						Class94_Sub4.method7463();
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class51.method764("" + local95);
					} else if (arg0 == 20) {
						Class51.method764(Class629.aClass541_1.method30925() ? "Success" : "Failure");
					} else if (arg0 == 9) {
						Class680.aClass25_8.method450();
					} else if (arg0 == 22) {
						Class7.aClass129_1.method12198();
					} else if (arg0 == 29) {
						Class7.aClass129_1.method12206();
					} else if (arg0 == 1) {
						Class470.aCanvas6.setLocation(50, 50);
					} else if (arg0 == 15) {
						Class470.aCanvas6.setLocation(Class504.anInt3366 * -721302779, Class504.anInt3367 * -350211099);
					} else if (arg0 == 25) {
						Class482.method29828();
					} else if (arg0 == 26) {
						client.aClass517_1.aLong284 = Class280.method26667() * -7615436911730204861L;
						client.aClass517_1.aBoolean779 = true;
						Class482.method29828();
					} else {
						@Pc(254) Class447 local254;
						if (arg0 == 6) {
							local254 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
							Class51.method764(((int) local254.aFloat277 >> 9) + " " + ((int) local254.aFloat278 >> 9));
						} else if (arg0 == 11) {
							local254 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
							Class51.method764("" + client.aClass517_1.method30435().aClass88Array1[Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100].method5500((int) local254.aFloat277 >> 9, (int) local254.aFloat278 >> 9));
						} else if (arg0 == 21) {
							Class51.method764(Class277.aClass232_74.method25853() + " " + Class277.aClass232_74.method25852());
							Class51.method764(Class277.aClass232_72.method25853() + " " + Class277.aClass232_72.method25852());
						} else if (arg0 == 17) {
							Class13.method206(false);
						} else if (arg0 == 8) {
							client.aBoolean596 = !client.aBoolean596;
							Class284.aClass86_9.method20149(client.aBoolean596);
							Class256.method26212();
							return;
						} else if (arg0 == 24) {
							client.anInt3397 = 0;
							client.aClass517_1.method30486();
						} else if (arg0 == 28) {
							client.anInt3397 = -1810851633;
							client.aClass517_1.method30486();
						} else if (arg0 == 23) {
							client.anInt3397 = 673264030;
							client.aClass517_1.method30486();
						}
					}
				}
			} catch (@Pc(397) Exception local397) {
				Class51.method764(Class44.aClass44_10.method713(Class128.aClass667_3));
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "ap", descriptor = "()V", line = 682)
	static void method24294() {
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub40_1.method16206() == 1) {
			Class196.aClass514_1.method30351(new Class516(Class505.aClass505_7, null));
		} else {
			client.aClass517_1.method30486();
			Class561.method31294();
		}
	}

	@OriginalMember(owner = "client!av", name = "aw", descriptor = "()V", line = 682)
	static void method24295() {
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub40_1.method16206() == 1) {
			Class196.aClass514_1.method30351(new Class516(Class505.aClass505_7, null));
		} else {
			client.aClass517_1.method30486();
			Class561.method31294();
		}
	}

	@OriginalMember(owner = "client!av", name = "ee", descriptor = "(Lclient!yf;I)V", line = 5278)
	static final void method24296(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class594.method31850(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!av", name = "ex", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5292)
	static final void method24297(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 926998689;
		arg0.anInt3912 = arg2.anIntArray536[arg2.anInt5784 * 2088438307] * -1503866221;
		arg0.anInt3911 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1] * -223089737;
		arg0.anInt3907 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 2] * 2058666005;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!av", name = "aaj", descriptor = "(Lclient!yf;I)V", line = 9251)
	static final void method24298(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.aByte153;
	}
}
