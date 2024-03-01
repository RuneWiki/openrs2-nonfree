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

@OriginalClass("client!ai")
public class Class67 {

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
	static final int anInt1833 = 350;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	static int anInt1834;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray7;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Ljava/io/FileOutputStream;")
	static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Ljava/lang/String;")
	static final String aString62 = "Success";

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "Ljava/lang/String;")
	static final String aString63 = "\\/.:, _-+[]~@";

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "Ljava/lang/String;")
	static final String aString64 = "Failure";

	@OriginalMember(owner = "client!ai", name = "br", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	static int anInt1840 = 0;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
	static int anInt1835 = 0;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "Ljava/lang/String;")
	static String aString61 = "";

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
	static int anInt1836 = 0;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
	static int anInt1837 = 0;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	static int anInt1838 = 0;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Z")
	static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
	static int anInt1839 = -929964355;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 61)
	Class67() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "()Z", line = 66)
	static boolean method13215() {
		return !Class429.method27933(client.anInt3039 * 1115111877);
	}

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "()Z", line = 66)
	static boolean method13218() {
		return !Class429.method27933(client.anInt3039 * 1115111877);
	}

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "()V", line = 71)
	static void method13217() {
		if (!Class239.method24623()) {
			return;
		}
		if (aStringArray7 == null) {
			Class127.method22879();
		}
		aBoolean337 = true;
		anInt1838 = 0;
	}

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "()V", line = 79)
	static void method13219() {
		Class147.anInt3433 = Class224.aClass611_8.anInt5537 * 738681091 + -192438930 + Class224.aClass611_8.anInt5536 * -1664384675;
		anInt1834 = Class222.aClass611_7.anInt5536 * 1311339935 + Class222.aClass611_7.anInt5537 * -596823935 + 1193841530;
		aStringArray7 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < aStringArray7.length; local28++) {
			aStringArray7[local28] = "";
		}
		Class215.method24289(Class601.aClass601_172.method33512(Class469.aClass530_2));
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "()V", line = 79)
	static void method13220() {
		Class147.anInt3433 = Class224.aClass611_8.anInt5537 * 738681091 + -192438930 + Class224.aClass611_8.anInt5536 * -1664384675;
		anInt1834 = Class222.aClass611_7.anInt5536 * 1311339935 + Class222.aClass611_7.anInt5537 * -596823935 + 1193841530;
		aStringArray7 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < aStringArray7.length; local28++) {
			aStringArray7[local28] = "";
		}
		Class215.method24289(Class601.aClass601_172.method33512(Class469.aClass530_2));
	}

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "()V", line = 79)
	static void method13244() {
		Class147.anInt3433 = Class224.aClass611_8.anInt5537 * 738681091 + -192438930 + Class224.aClass611_8.anInt5536 * -1664384675;
		anInt1834 = Class222.aClass611_7.anInt5536 * 1311339935 + Class222.aClass611_7.anInt5537 * -596823935 + 1193841530;
		aStringArray7 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < aStringArray7.length; local28++) {
			aStringArray7[local28] = "";
		}
		Class215.method24289(Class601.aClass601_172.method33512(Class469.aClass530_2));
	}

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "()V", line = 87)
	static void method13222() {
		aBoolean337 = false;
		Class401.method27608();
	}

	@OriginalMember(owner = "client!ai", name = "at", descriptor = "()V", line = 87)
	static void method13223() {
		aBoolean337 = false;
		Class401.method27608();
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "()V", line = 87)
	static void method13224() {
		aBoolean337 = false;
		Class401.method27608();
	}

	@OriginalMember(owner = "client!ai", name = "af", descriptor = "()V", line = 87)
	static void method13251() {
		aBoolean337 = false;
		Class401.method27608();
	}

	@OriginalMember(owner = "client!ai", name = "ak", descriptor = "()V", line = 92)
	static void method13214() {
		if (aFileOutputStream1 != null) {
			try {
				aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ai", name = "aa", descriptor = "()V", line = 92)
	static void method13231() {
		if (aFileOutputStream1 != null) {
			try {
				aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ai", name = "an", descriptor = "()V", line = 92)
	static void method13239() {
		if (aFileOutputStream1 != null) {
			try {
				aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ai", name = "ah", descriptor = "()V", line = 92)
	static void method13247() {
		if (aFileOutputStream1 != null) {
			try {
				aFileOutputStream1.close();
			} catch (@Pc(5) IOException local5) {
			}
		}
		aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ai", name = "aj", descriptor = "([Ljava/lang/String;)V", line = 106)
	static void method13228(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			aString61 = aString61 + arg0[0];
			anInt1837 += arg0[0].length() * 1751742251;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class215.method24289("Pausing for " + local17 + " seconds...");
				Class123.aStringArray10 = arg0;
				anInt1839 = (local5 + 1) * 929964355;
				Class13_Sub4.aLong13 = (Class176.method23413() + (long) (local17 * 1000)) * -2321551396921019679L;
				return;
			}
			aString61 = arg0[local5];
			Class203.method24163(false);
		}
	}

	@OriginalMember(owner = "client!ai", name = "as", descriptor = "([Ljava/lang/String;)V", line = 106)
	static void method13229(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			aString61 = aString61 + arg0[0];
			anInt1837 += arg0[0].length() * 1751742251;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class215.method24289("Pausing for " + local17 + " seconds...");
				Class123.aStringArray10 = arg0;
				anInt1839 = (local5 + 1) * 929964355;
				Class13_Sub4.aLong13 = (Class176.method23413() + (long) (local17 * 1000)) * -2321551396921019679L;
				return;
			}
			aString61 = arg0[local5];
			Class203.method24163(false);
		}
	}

	@OriginalMember(owner = "client!ai", name = "ai", descriptor = "([Ljava/lang/String;)V", line = 106)
	static void method13230(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			aString61 = aString61 + arg0[0];
			anInt1837 += arg0[0].length() * 1751742251;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class215.method24289("Pausing for " + local17 + " seconds...");
				Class123.aStringArray10 = arg0;
				anInt1839 = (local5 + 1) * 929964355;
				Class13_Sub4.aLong13 = (Class176.method23413() + (long) (local17 * 1000)) * -2321551396921019679L;
				return;
			}
			aString61 = arg0[local5];
			Class203.method24163(false);
		}
	}

	@OriginalMember(owner = "client!ai", name = "aq", descriptor = "()V", line = 133)
	static void method13221() {
		if (anInt1838 * -47428739 < 102) {
			anInt1838 += 1642636030;
		}
		@Pc(24) int local24;
		if (anInt1839 * -1678937237 != -1 && Class13_Sub4.aLong13 * 6789746077315813665L < Class176.method23413()) {
			for (local24 = anInt1839 * -1678937237; local24 < Class123.aStringArray10.length; local24++) {
				if (Class123.aStringArray10[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class123.aStringArray10[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class215.method24289("Pausing for " + local36 + " seconds...");
					anInt1839 = (local24 + 1) * 929964355;
					Class13_Sub4.aLong13 = (Class176.method23413() + (long) (local36 * 1000)) * -2321551396921019679L;
					return;
				}
				aString61 = Class123.aStringArray10[local24];
				Class203.method24163(false);
			}
			anInt1839 = -929964355;
		}
		if (client.anInt3098 * -1965800379 != 0) {
			anInt1835 -= client.anInt3098 * 1572635567;
			if (anInt1835 * 393384311 >= anInt1840 * 1387788187) {
				anInt1835 = anInt1840 * -1116163075 - -1933731769;
			}
			if (anInt1835 * 393384311 < 0) {
				anInt1835 = 0;
			}
			client.anInt3098 = 0;
		}
		for (local24 = 0; local24 < client.anInt3154 * 1723265727; local24++) {
			@Pc(128) Interface46 local128 = client.anInterface46Array1[local24];
			@Pc(132) int local132 = local128.method11582();
			@Pc(136) char local136 = local128.method11581();
			@Pc(140) int local140 = local128.method11584();
			if (local132 == 84) {
				Class203.method24163(false);
			}
			if (local132 == 80) {
				Class203.method24163(true);
			} else if (local132 == 66 && (local140 & 0x4) != 0) {
				if (Class146.aClipboard1 != null) {
					@Pc(165) String local165 = "";
					for (@Pc(170) int local170 = aStringArray7.length - 1; local170 >= 0; local170--) {
						if (aStringArray7[local170] != null && aStringArray7[local170].length() > 0) {
							local165 = local165 + aStringArray7[local170] + '\n';
						}
					}
					Class146.aClipboard1.setContents(new StringSelection(local165), null);
				}
			} else if (local132 == 67 && (local140 & 0x4) != 0) {
				if (Class146.aClipboard1 != null) {
					try {
						@Pc(217) Transferable local217 = Class146.aClipboard1.getContents(null);
						if (local217 != null) {
							@Pc(224) String local224 = (String) local217.getTransferData(DataFlavor.stringFlavor);
							if (local224 != null) {
								@Pc(231) String[] local231 = Class230.method24546(local224, '\n');
								Class633.method33877(local231);
							}
						}
					} catch (@Pc(236) Exception local236) {
					}
				}
			} else if (local132 == 85 && anInt1837 * -1377464445 > 0) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445 - 1) + aString61.substring(anInt1837 * -1377464445);
				anInt1837 -= 1751742251;
			} else if (local132 == 101 && anInt1837 * -1377464445 < aString61.length()) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445) + aString61.substring(anInt1837 * -1377464445 + 1);
			} else if (local132 == 96 && anInt1837 * -1377464445 > 0) {
				anInt1837 -= 1751742251;
			} else if (local132 == 97 && anInt1837 * -1377464445 < aString61.length()) {
				anInt1837 += 1751742251;
			} else if (local132 == 102) {
				anInt1837 = 0;
			} else if (local132 == 103) {
				anInt1837 = aString61.length() * 1751742251;
			} else if (local132 == 104 && anInt1836 * 1487902593 < aStringArray7.length) {
				anInt1836 += -535254911;
				Class616.method33693();
				anInt1837 = aString61.length() * 1751742251;
			} else if (local132 == 105 && anInt1836 * 1487902593 > 0) {
				anInt1836 -= -535254911;
				Class616.method33693();
				anInt1837 = aString61.length() * 1751742251;
			} else if (Exception_Sub5.method14670(local136) || "\\/.:, _-+[]~@".indexOf(local136) != -1) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445) + client.anInterface46Array1[local24].method11581() + aString61.substring(anInt1837 * -1377464445);
				anInt1837 += 1751742251;
			}
		}
		client.anInt3154 = 0;
		client.anInt3144 = 0;
		Class401.method27608();
	}

	@OriginalMember(owner = "client!ai", name = "ax", descriptor = "()V", line = 133)
	static void method13225() {
		if (anInt1838 * -47428739 < 102) {
			anInt1838 += 1642636030;
		}
		@Pc(24) int local24;
		if (anInt1839 * -1678937237 != -1 && Class13_Sub4.aLong13 * 6789746077315813665L < Class176.method23413()) {
			for (local24 = anInt1839 * -1678937237; local24 < Class123.aStringArray10.length; local24++) {
				if (Class123.aStringArray10[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class123.aStringArray10[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class215.method24289("Pausing for " + local36 + " seconds...");
					anInt1839 = (local24 + 1) * 929964355;
					Class13_Sub4.aLong13 = (Class176.method23413() + (long) (local36 * 1000)) * -2321551396921019679L;
					return;
				}
				aString61 = Class123.aStringArray10[local24];
				Class203.method24163(false);
			}
			anInt1839 = -929964355;
		}
		if (client.anInt3098 * -1965800379 != 0) {
			anInt1835 -= client.anInt3098 * 1572635567;
			if (anInt1835 * 393384311 >= anInt1840 * 1387788187) {
				anInt1835 = anInt1840 * -1116163075 - -1933731769;
			}
			if (anInt1835 * 393384311 < 0) {
				anInt1835 = 0;
			}
			client.anInt3098 = 0;
		}
		for (local24 = 0; local24 < client.anInt3154 * 1723265727; local24++) {
			@Pc(128) Interface46 local128 = client.anInterface46Array1[local24];
			@Pc(132) int local132 = local128.method11582();
			@Pc(136) char local136 = local128.method11581();
			@Pc(140) int local140 = local128.method11584();
			if (local132 == 84) {
				Class203.method24163(false);
			}
			if (local132 == 80) {
				Class203.method24163(true);
			} else if (local132 == 66 && (local140 & 0x4) != 0) {
				if (Class146.aClipboard1 != null) {
					@Pc(165) String local165 = "";
					for (@Pc(170) int local170 = aStringArray7.length - 1; local170 >= 0; local170--) {
						if (aStringArray7[local170] != null && aStringArray7[local170].length() > 0) {
							local165 = local165 + aStringArray7[local170] + '\n';
						}
					}
					Class146.aClipboard1.setContents(new StringSelection(local165), null);
				}
			} else if (local132 == 67 && (local140 & 0x4) != 0) {
				if (Class146.aClipboard1 != null) {
					try {
						@Pc(217) Transferable local217 = Class146.aClipboard1.getContents(null);
						if (local217 != null) {
							@Pc(224) String local224 = (String) local217.getTransferData(DataFlavor.stringFlavor);
							if (local224 != null) {
								@Pc(231) String[] local231 = Class230.method24546(local224, '\n');
								Class633.method33877(local231);
							}
						}
					} catch (@Pc(236) Exception local236) {
					}
				}
			} else if (local132 == 85 && anInt1837 * -1377464445 > 0) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445 - 1) + aString61.substring(anInt1837 * -1377464445);
				anInt1837 -= 1751742251;
			} else if (local132 == 101 && anInt1837 * -1377464445 < aString61.length()) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445) + aString61.substring(anInt1837 * -1377464445 + 1);
			} else if (local132 == 96 && anInt1837 * -1377464445 > 0) {
				anInt1837 -= 1751742251;
			} else if (local132 == 97 && anInt1837 * -1377464445 < aString61.length()) {
				anInt1837 += 1751742251;
			} else if (local132 == 102) {
				anInt1837 = 0;
			} else if (local132 == 103) {
				anInt1837 = aString61.length() * 1751742251;
			} else if (local132 == 104 && anInt1836 * 1487902593 < aStringArray7.length) {
				anInt1836 += -535254911;
				Class616.method33693();
				anInt1837 = aString61.length() * 1751742251;
			} else if (local132 == 105 && anInt1836 * 1487902593 > 0) {
				anInt1836 -= -535254911;
				Class616.method33693();
				anInt1837 = aString61.length() * 1751742251;
			} else if (Exception_Sub5.method14670(local136) || "\\/.:, _-+[]~@".indexOf(local136) != -1) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445) + client.anInterface46Array1[local24].method11581() + aString61.substring(anInt1837 * -1377464445);
				anInt1837 += 1751742251;
			}
		}
		client.anInt3154 = 0;
		client.anInt3144 = 0;
		Class401.method27608();
	}

	@OriginalMember(owner = "client!ai", name = "av", descriptor = "()V", line = 133)
	static void method13233() {
		if (anInt1838 * -47428739 < 102) {
			anInt1838 += 1642636030;
		}
		@Pc(24) int local24;
		if (anInt1839 * -1678937237 != -1 && Class13_Sub4.aLong13 * 6789746077315813665L < Class176.method23413()) {
			for (local24 = anInt1839 * -1678937237; local24 < Class123.aStringArray10.length; local24++) {
				if (Class123.aStringArray10[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class123.aStringArray10[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class215.method24289("Pausing for " + local36 + " seconds...");
					anInt1839 = (local24 + 1) * 929964355;
					Class13_Sub4.aLong13 = (Class176.method23413() + (long) (local36 * 1000)) * -2321551396921019679L;
					return;
				}
				aString61 = Class123.aStringArray10[local24];
				Class203.method24163(false);
			}
			anInt1839 = -929964355;
		}
		if (client.anInt3098 * -1965800379 != 0) {
			anInt1835 -= client.anInt3098 * 1572635567;
			if (anInt1835 * 393384311 >= anInt1840 * 1387788187) {
				anInt1835 = anInt1840 * -1116163075 - -1933731769;
			}
			if (anInt1835 * 393384311 < 0) {
				anInt1835 = 0;
			}
			client.anInt3098 = 0;
		}
		for (local24 = 0; local24 < client.anInt3154 * 1723265727; local24++) {
			@Pc(128) Interface46 local128 = client.anInterface46Array1[local24];
			@Pc(132) int local132 = local128.method11582();
			@Pc(136) char local136 = local128.method11581();
			@Pc(140) int local140 = local128.method11584();
			if (local132 == 84) {
				Class203.method24163(false);
			}
			if (local132 == 80) {
				Class203.method24163(true);
			} else if (local132 == 66 && (local140 & 0x4) != 0) {
				if (Class146.aClipboard1 != null) {
					@Pc(165) String local165 = "";
					for (@Pc(170) int local170 = aStringArray7.length - 1; local170 >= 0; local170--) {
						if (aStringArray7[local170] != null && aStringArray7[local170].length() > 0) {
							local165 = local165 + aStringArray7[local170] + '\n';
						}
					}
					Class146.aClipboard1.setContents(new StringSelection(local165), null);
				}
			} else if (local132 == 67 && (local140 & 0x4) != 0) {
				if (Class146.aClipboard1 != null) {
					try {
						@Pc(217) Transferable local217 = Class146.aClipboard1.getContents(null);
						if (local217 != null) {
							@Pc(224) String local224 = (String) local217.getTransferData(DataFlavor.stringFlavor);
							if (local224 != null) {
								@Pc(231) String[] local231 = Class230.method24546(local224, '\n');
								Class633.method33877(local231);
							}
						}
					} catch (@Pc(236) Exception local236) {
					}
				}
			} else if (local132 == 85 && anInt1837 * -1377464445 > 0) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445 - 1) + aString61.substring(anInt1837 * -1377464445);
				anInt1837 -= 1751742251;
			} else if (local132 == 101 && anInt1837 * -1377464445 < aString61.length()) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445) + aString61.substring(anInt1837 * -1377464445 + 1);
			} else if (local132 == 96 && anInt1837 * -1377464445 > 0) {
				anInt1837 -= 1751742251;
			} else if (local132 == 97 && anInt1837 * -1377464445 < aString61.length()) {
				anInt1837 += 1751742251;
			} else if (local132 == 102) {
				anInt1837 = 0;
			} else if (local132 == 103) {
				anInt1837 = aString61.length() * 1751742251;
			} else if (local132 == 104 && anInt1836 * 1487902593 < aStringArray7.length) {
				anInt1836 += -535254911;
				Class616.method33693();
				anInt1837 = aString61.length() * 1751742251;
			} else if (local132 == 105 && anInt1836 * 1487902593 > 0) {
				anInt1836 -= -535254911;
				Class616.method33693();
				anInt1837 = aString61.length() * 1751742251;
			} else if (Exception_Sub5.method14670(local136) || "\\/.:, _-+[]~@".indexOf(local136) != -1) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445) + client.anInterface46Array1[local24].method11581() + aString61.substring(anInt1837 * -1377464445);
				anInt1837 += 1751742251;
			}
		}
		client.anInt3154 = 0;
		client.anInt3144 = 0;
		Class401.method27608();
	}

	@OriginalMember(owner = "client!ai", name = "az", descriptor = "()V", line = 133)
	static void method13234() {
		if (anInt1838 * -47428739 < 102) {
			anInt1838 += 1642636030;
		}
		@Pc(24) int local24;
		if (anInt1839 * -1678937237 != -1 && Class13_Sub4.aLong13 * 6789746077315813665L < Class176.method23413()) {
			for (local24 = anInt1839 * -1678937237; local24 < Class123.aStringArray10.length; local24++) {
				if (Class123.aStringArray10[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class123.aStringArray10[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class215.method24289("Pausing for " + local36 + " seconds...");
					anInt1839 = (local24 + 1) * 929964355;
					Class13_Sub4.aLong13 = (Class176.method23413() + (long) (local36 * 1000)) * -2321551396921019679L;
					return;
				}
				aString61 = Class123.aStringArray10[local24];
				Class203.method24163(false);
			}
			anInt1839 = -929964355;
		}
		if (client.anInt3098 * -1965800379 != 0) {
			anInt1835 -= client.anInt3098 * 1572635567;
			if (anInt1835 * 393384311 >= anInt1840 * 1387788187) {
				anInt1835 = anInt1840 * -1116163075 - -1933731769;
			}
			if (anInt1835 * 393384311 < 0) {
				anInt1835 = 0;
			}
			client.anInt3098 = 0;
		}
		for (local24 = 0; local24 < client.anInt3154 * 1723265727; local24++) {
			@Pc(128) Interface46 local128 = client.anInterface46Array1[local24];
			@Pc(132) int local132 = local128.method11582();
			@Pc(136) char local136 = local128.method11581();
			@Pc(140) int local140 = local128.method11584();
			if (local132 == 84) {
				Class203.method24163(false);
			}
			if (local132 == 80) {
				Class203.method24163(true);
			} else if (local132 == 66 && (local140 & 0x4) != 0) {
				if (Class146.aClipboard1 != null) {
					@Pc(165) String local165 = "";
					for (@Pc(170) int local170 = aStringArray7.length - 1; local170 >= 0; local170--) {
						if (aStringArray7[local170] != null && aStringArray7[local170].length() > 0) {
							local165 = local165 + aStringArray7[local170] + '\n';
						}
					}
					Class146.aClipboard1.setContents(new StringSelection(local165), null);
				}
			} else if (local132 == 67 && (local140 & 0x4) != 0) {
				if (Class146.aClipboard1 != null) {
					try {
						@Pc(217) Transferable local217 = Class146.aClipboard1.getContents(null);
						if (local217 != null) {
							@Pc(224) String local224 = (String) local217.getTransferData(DataFlavor.stringFlavor);
							if (local224 != null) {
								@Pc(231) String[] local231 = Class230.method24546(local224, '\n');
								Class633.method33877(local231);
							}
						}
					} catch (@Pc(236) Exception local236) {
					}
				}
			} else if (local132 == 85 && anInt1837 * -1377464445 > 0) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445 - 1) + aString61.substring(anInt1837 * -1377464445);
				anInt1837 -= 1751742251;
			} else if (local132 == 101 && anInt1837 * -1377464445 < aString61.length()) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445) + aString61.substring(anInt1837 * -1377464445 + 1);
			} else if (local132 == 96 && anInt1837 * -1377464445 > 0) {
				anInt1837 -= 1751742251;
			} else if (local132 == 97 && anInt1837 * -1377464445 < aString61.length()) {
				anInt1837 += 1751742251;
			} else if (local132 == 102) {
				anInt1837 = 0;
			} else if (local132 == 103) {
				anInt1837 = aString61.length() * 1751742251;
			} else if (local132 == 104 && anInt1836 * 1487902593 < aStringArray7.length) {
				anInt1836 += -535254911;
				Class616.method33693();
				anInt1837 = aString61.length() * 1751742251;
			} else if (local132 == 105 && anInt1836 * 1487902593 > 0) {
				anInt1836 -= -535254911;
				Class616.method33693();
				anInt1837 = aString61.length() * 1751742251;
			} else if (Exception_Sub5.method14670(local136) || "\\/.:, _-+[]~@".indexOf(local136) != -1) {
				aString61 = aString61.substring(0, anInt1837 * -1377464445) + client.anInterface46Array1[local24].method11581() + aString61.substring(anInt1837 * -1377464445);
				anInt1837 += 1751742251;
			}
		}
		client.anInt3154 = 0;
		client.anInt3144 = 0;
		Class401.method27608();
	}

	@OriginalMember(owner = "client!ai", name = "al", descriptor = "(Ljava/lang/String;)V", line = 238)
	public static void method13235(@OriginalArg(0) String arg0) {
		aString61 = arg0;
		anInt1837 = aString61.length() * 1751742251;
	}

	@OriginalMember(owner = "client!ai", name = "ao", descriptor = "(Ljava/lang/String;)V", line = 238)
	public static void method13236(@OriginalArg(0) String arg0) {
		aString61 = arg0;
		anInt1837 = aString61.length() * 1751742251;
	}

	@OriginalMember(owner = "client!ai", name = "ap", descriptor = "(Ljava/lang/String;)V", line = 238)
	public static void method13237(@OriginalArg(0) String arg0) {
		aString61 = arg0;
		anInt1837 = aString61.length() * 1751742251;
	}

	@OriginalMember(owner = "client!ai", name = "au", descriptor = "(Z)V", line = 243)
	static void method13226(@OriginalArg(0) boolean arg0) {
		aString61 = aString61.trim();
		anInt1836 = 0;
		if (aString61.length() == 0) {
			anInt1837 = 0;
			return;
		}
		Class215.method24289("--> " + aString61);
		Class339.method26424(aString61, false, arg0);
		if (arg0) {
			anInt1837 = aString61.length() * 1751742251;
		} else {
			anInt1837 = 0;
			aString61 = "";
		}
	}

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "(Z)V", line = 243)
	static void method13238(@OriginalArg(0) boolean arg0) {
		aString61 = aString61.trim();
		anInt1836 = 0;
		if (aString61.length() == 0) {
			anInt1837 = 0;
			return;
		}
		Class215.method24289("--> " + aString61);
		Class339.method26424(aString61, false, arg0);
		if (arg0) {
			anInt1837 = aString61.length() * 1751742251;
		} else {
			anInt1837 = 0;
			aString61 = "";
		}
	}

	@OriginalMember(owner = "client!ai", name = "ay", descriptor = "(Ljava/lang/String;)V", line = 259)
	public static void method13240(@OriginalArg(0) String arg0) {
		if (aStringArray7 == null) {
			Class127.method22879();
		}
		client.aCalendar1.setTime(new Date(Class176.method23413()));
		@Pc(15) int local15 = client.aCalendar1.get(11);
		@Pc(19) int local19 = client.aCalendar1.get(12);
		@Pc(23) int local23 = client.aCalendar1.get(13);
		@Pc(57) String local57 = Integer.toString(local15 / 10) + local15 % 10 + ":" + local19 / 10 + local19 % 10 + ":" + local23 / 10 + local23 % 10;
		@Pc(62) String[] local62 = Class230.method24546(arg0, '\n');
		for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
			for (@Pc(72) int local72 = anInt1840 * 1387788187; local72 > 0; local72--) {
				aStringArray7[local72] = aStringArray7[local72 - 1];
			}
			aStringArray7[0] = local57 + ": " + local62[local64];
			if (aFileOutputStream1 != null) {
				try {
					aFileOutputStream1.write(Class281.method25434(aStringArray7[0] + "\n"));
				} catch (@Pc(118) IOException local118) {
				}
			}
			if (anInt1840 * 1387788187 < aStringArray7.length - 1) {
				anInt1840 += 1213765267;
				if (anInt1835 * 393384311 > 0) {
					anInt1835 += -1933731769;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "ag", descriptor = "(Ljava/lang/String;)V", line = 259)
	public static void method13241(@OriginalArg(0) String arg0) {
		if (aStringArray7 == null) {
			Class127.method22879();
		}
		client.aCalendar1.setTime(new Date(Class176.method23413()));
		@Pc(15) int local15 = client.aCalendar1.get(11);
		@Pc(19) int local19 = client.aCalendar1.get(12);
		@Pc(23) int local23 = client.aCalendar1.get(13);
		@Pc(57) String local57 = Integer.toString(local15 / 10) + local15 % 10 + ":" + local19 / 10 + local19 % 10 + ":" + local23 / 10 + local23 % 10;
		@Pc(62) String[] local62 = Class230.method24546(arg0, '\n');
		for (@Pc(64) int local64 = 0; local64 < local62.length; local64++) {
			for (@Pc(72) int local72 = anInt1840 * 1387788187; local72 > 0; local72--) {
				aStringArray7[local72] = aStringArray7[local72 - 1];
			}
			aStringArray7[0] = local57 + ": " + local62[local64];
			if (aFileOutputStream1 != null) {
				try {
					aFileOutputStream1.write(Class281.method25434(aStringArray7[0] + "\n"));
				} catch (@Pc(118) IOException local118) {
				}
			}
			if (anInt1840 * 1387788187 < aStringArray7.length - 1) {
				anInt1840 += 1213765267;
				if (anInt1835 * 393384311 > 0) {
					anInt1835 += -1933731769;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "ae", descriptor = "(Lclient!de;)V", line = 285)
	static void method13216(@OriginalArg(0) Class21 arg0) {
		arg0.method17079(0, 0, Class128.anInt3317 * 2037417253, 350);
		arg0.method17050(0, 0, Class128.anInt3317 * 2037417253, 350, anInt1838 * -47428739 << 24 | 0x332277, 1);
		@Pc(29) int local29 = 350 / (anInt1834 * -54642283);
		@Pc(41) int local41;
		if (anInt1840 * 1387788187 > 0) {
			local41 = 346 - anInt1834 * -54642283 - 4;
			@Pc(53) int local53 = local29 * local41 / (local29 + anInt1840 * 1387788187 - 1);
			@Pc(55) int local55 = 4;
			if (anInt1840 * 1387788187 > 1) {
				local55 += (local41 - local53) * (anInt1840 * 1387788187 - 1 - anInt1835 * 393384311) / (anInt1840 * 1387788187 - 1);
			}
			arg0.method17050(Class128.anInt3317 * 2037417253 - 16, local55, 12, local53, anInt1838 * -47428739 << 24 | 0x332277, 2);
			for (@Pc(104) int local104 = anInt1835 * 393384311; local104 < anInt1835 * 393384311 + local29 && local104 < anInt1840 * 1387788187; local104++) {
				@Pc(123) String[] local123 = Class230.method24546(aStringArray7[local104], '\b');
				@Pc(134) int local134 = (Class128.anInt3317 * 2037417253 - 8 - 16) / local123.length;
				for (@Pc(136) int local136 = 0; local136 < local123.length; local136++) {
					@Pc(146) int local146 = local136 * local134 + 8;
					arg0.method17079(local146, 0, local134 + local146 - 8, 350);
					Class454.aClass14_12.method3329(Class107.method21926(local123[local136]), local146, 350 - Class147.anInt3433 * 110915335 - 2 - Class222.aClass611_7.anInt5536 * -1990992757 - anInt1834 * -54642283 * (local104 - anInt1835 * 393384311), -1, -16777216);
				}
			}
		}
		Class418.aClass14_11.method3309("797 1", Class128.anInt3317 * 2037417253 - 25, 330, -1, -16777216);
		arg0.method17079(0, 0, Class128.anInt3317 * 2037417253, 350);
		arg0.method17065(0, 350 - Class147.anInt3433 * 110915335, Class128.anInt3317 * 2037417253, -1);
		Class568.aClass14_13.method3329("--> " + Class107.method21926(aString61), 10, 350 - Class224.aClass611_8.anInt5536 * -1990992757 - 1, -1, -16777216);
		if (Canvas_Sub1.aBoolean481) {
			local41 = -1;
			if (client.anInt3034 % 30 > 15) {
				local41 = 16777215;
			}
			arg0.method17066(Class224.aClass611_8.method33592("--> " + Class107.method21926(aString61).substring(0, anInt1837 * -1377464445)) + 10, 350 - Class224.aClass611_8.anInt5536 * -1990992757 - 11, 12, local41);
		}
		arg0.method17056();
		Class439.method28218();
	}

	@OriginalMember(owner = "client!ai", name = "am", descriptor = "(Lclient!de;)V", line = 285)
	static void method13242(@OriginalArg(0) Class21 arg0) {
		arg0.method17079(0, 0, Class128.anInt3317 * 2037417253, 350);
		arg0.method17050(0, 0, Class128.anInt3317 * 2037417253, 350, anInt1838 * -47428739 << 24 | 0x332277, 1);
		@Pc(29) int local29 = 350 / (anInt1834 * -54642283);
		@Pc(41) int local41;
		if (anInt1840 * 1387788187 > 0) {
			local41 = 346 - anInt1834 * -54642283 - 4;
			@Pc(53) int local53 = local29 * local41 / (local29 + anInt1840 * 1387788187 - 1);
			@Pc(55) int local55 = 4;
			if (anInt1840 * 1387788187 > 1) {
				local55 += (local41 - local53) * (anInt1840 * 1387788187 - 1 - anInt1835 * 393384311) / (anInt1840 * 1387788187 - 1);
			}
			arg0.method17050(Class128.anInt3317 * 2037417253 - 16, local55, 12, local53, anInt1838 * -47428739 << 24 | 0x332277, 2);
			for (@Pc(104) int local104 = anInt1835 * 393384311; local104 < anInt1835 * 393384311 + local29 && local104 < anInt1840 * 1387788187; local104++) {
				@Pc(123) String[] local123 = Class230.method24546(aStringArray7[local104], '\b');
				@Pc(134) int local134 = (Class128.anInt3317 * 2037417253 - 8 - 16) / local123.length;
				for (@Pc(136) int local136 = 0; local136 < local123.length; local136++) {
					@Pc(146) int local146 = local136 * local134 + 8;
					arg0.method17079(local146, 0, local134 + local146 - 8, 350);
					Class454.aClass14_12.method3329(Class107.method21926(local123[local136]), local146, 350 - Class147.anInt3433 * 110915335 - 2 - Class222.aClass611_7.anInt5536 * -1990992757 - anInt1834 * -54642283 * (local104 - anInt1835 * 393384311), -1, -16777216);
				}
			}
		}
		Class418.aClass14_11.method3309("797 1", Class128.anInt3317 * 2037417253 - 25, 330, -1, -16777216);
		arg0.method17079(0, 0, Class128.anInt3317 * 2037417253, 350);
		arg0.method17065(0, 350 - Class147.anInt3433 * 110915335, Class128.anInt3317 * 2037417253, -1);
		Class568.aClass14_13.method3329("--> " + Class107.method21926(aString61), 10, 350 - Class224.aClass611_8.anInt5536 * -1990992757 - 1, -1, -16777216);
		if (Canvas_Sub1.aBoolean481) {
			local41 = -1;
			if (client.anInt3034 % 30 > 15) {
				local41 = 16777215;
			}
			arg0.method17066(Class224.aClass611_8.method33592("--> " + Class107.method21926(aString61).substring(0, anInt1837 * -1377464445)) + 10, 350 - Class224.aClass611_8.anInt5536 * -1990992757 - 11, 12, local41);
		}
		arg0.method17056();
		Class439.method28218();
	}

	@OriginalMember(owner = "client!ai", name = "ar", descriptor = "(Lclient!de;)V", line = 285)
	static void method13243(@OriginalArg(0) Class21 arg0) {
		arg0.method17079(0, 0, Class128.anInt3317 * 2037417253, 350);
		arg0.method17050(0, 0, Class128.anInt3317 * 2037417253, 350, anInt1838 * -47428739 << 24 | 0x332277, 1);
		@Pc(29) int local29 = 350 / (anInt1834 * -54642283);
		@Pc(41) int local41;
		if (anInt1840 * 1387788187 > 0) {
			local41 = 346 - anInt1834 * -54642283 - 4;
			@Pc(53) int local53 = local29 * local41 / (local29 + anInt1840 * 1387788187 - 1);
			@Pc(55) int local55 = 4;
			if (anInt1840 * 1387788187 > 1) {
				local55 += (local41 - local53) * (anInt1840 * 1387788187 - 1 - anInt1835 * 393384311) / (anInt1840 * 1387788187 - 1);
			}
			arg0.method17050(Class128.anInt3317 * 2037417253 - 16, local55, 12, local53, anInt1838 * -47428739 << 24 | 0x332277, 2);
			for (@Pc(104) int local104 = anInt1835 * 393384311; local104 < anInt1835 * 393384311 + local29 && local104 < anInt1840 * 1387788187; local104++) {
				@Pc(123) String[] local123 = Class230.method24546(aStringArray7[local104], '\b');
				@Pc(134) int local134 = (Class128.anInt3317 * 2037417253 - 8 - 16) / local123.length;
				for (@Pc(136) int local136 = 0; local136 < local123.length; local136++) {
					@Pc(146) int local146 = local136 * local134 + 8;
					arg0.method17079(local146, 0, local134 + local146 - 8, 350);
					Class454.aClass14_12.method3329(Class107.method21926(local123[local136]), local146, 350 - Class147.anInt3433 * 110915335 - 2 - Class222.aClass611_7.anInt5536 * -1990992757 - anInt1834 * -54642283 * (local104 - anInt1835 * 393384311), -1, -16777216);
				}
			}
		}
		Class418.aClass14_11.method3309("797 1", Class128.anInt3317 * 2037417253 - 25, 330, -1, -16777216);
		arg0.method17079(0, 0, Class128.anInt3317 * 2037417253, 350);
		arg0.method17065(0, 350 - Class147.anInt3433 * 110915335, Class128.anInt3317 * 2037417253, -1);
		Class568.aClass14_13.method3329("--> " + Class107.method21926(aString61), 10, 350 - Class224.aClass611_8.anInt5536 * -1990992757 - 1, -1, -16777216);
		if (Canvas_Sub1.aBoolean481) {
			local41 = -1;
			if (client.anInt3034 % 30 > 15) {
				local41 = 16777215;
			}
			arg0.method17066(Class224.aClass611_8.method33592("--> " + Class107.method21926(aString61).substring(0, anInt1837 * -1377464445)) + 10, 350 - Class224.aClass611_8.anInt5536 * -1990992757 - 11, 12, local41);
		}
		arg0.method17056();
		Class439.method28218();
	}

	@OriginalMember(owner = "client!ai", name = "dh", descriptor = "(Lclient!de;IIIII)V", line = 303)
	static void method13256(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method17079(arg1, arg2, arg1 + arg3, arg4 + arg2);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (Class58_Sub1.anInt1434 * 1235407417 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg3 / 2 + arg1;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method17050(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method17068(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3130 * 548516575].getRGB(), 0);
			arg0.method17050(local22 - 150, local32 + 2, Class58_Sub1.anInt1434 * -588745045, 30, client.aColorArray1[client.anInt3130 * 548516575].getRGB(), 0);
			Class568.aClass14_13.method3282(Class601.aClass601_124.method33512(Class469.aClass530_2), local22, local16 + local32, client.aColorArray3[client.anInt3130 * 548516575].getRGB(), -1);
			return;
		}
		@Pc(103) int local103 = Class485.anInt5182 * 826696483 - (int) ((float) arg3 / Class58_Sub1.aFloat149);
		local22 = (int) ((float) arg4 / Class58_Sub1.aFloat149) + Class161.anInt3445 * 2105263663;
		local32 = (int) ((float) arg3 / Class58_Sub1.aFloat149) + Class485.anInt5182 * 826696483;
		@Pc(133) int local133 = Class161.anInt3445 * 2105263663 - (int) ((float) arg4 / Class58_Sub1.aFloat149);
		Class177.anInt3475 = (Class485.anInt5182 * 826696483 - (int) ((float) arg3 / Class58_Sub1.aFloat149)) * 291202019;
		Class408.anInt4816 = (Class161.anInt3445 * 2105263663 - (int) ((float) arg4 / Class58_Sub1.aFloat149)) * -1365949555;
		Class463.anInt5070 = (int) ((float) (arg3 * 2) / Class58_Sub1.aFloat149) * -1550147811;
		Class237.anInt3749 = (int) ((float) (arg4 * 2) / Class58_Sub1.aFloat149) * -829018415;
		Class58_Sub1.aClass161_9 = Class58_Sub1.aClass161_8;
		Class58_Sub1.method12399(Class58_Sub1.anInt1429 + local103, local22 + Class58_Sub1.anInt1406, local32 + Class58_Sub1.anInt1429, local133 + Class58_Sub1.anInt1406, arg1, arg2, arg1 + arg3, arg2 + arg4 + 1);
		Class58_Sub1.method12400(arg0, !Class58_Sub1.aBoolean323, !Class58_Sub1.aBoolean324, client.aBoolean590, false);
		@Pc(219) Class553 local219 = Class58_Sub1.method12455(arg0);
		Class42.method8328(arg0, local219, 0, 0);
		if (client.aBoolean574) {
			@Pc(233) int local233 = arg1 + arg3 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class454.aClass14_12.method3309("Fps: " + Class390.anInt3019 * 1617726299 + " (" + Class390.anInt3027 * 222336985 + " ms)", local233, local239, 16776960, -1);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class454.aClass14_12.method3309("Mem:" + local276 + "k", local233, local265, local278, -1);
			local239 = local265 - 15;
		}
		Class58_Sub1.aClass161_8.method23240(5);
	}

	@OriginalMember(owner = "client!ai", name = "ac", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 318)
	static String method13227(@OriginalArg(0) String arg0) {
		@Pc(1) String local1 = null;
		@Pc(5) int local5 = arg0.indexOf("--> ");
		if (local5 >= 0) {
			local1 = arg0.substring(0, local5 + 4);
			arg0 = arg0.substring(local5 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(30) int local30 = arg0.indexOf(" ", "directlogin ".length());
			if (local30 >= 0) {
				@Pc(35) int local35 = arg0.length();
				arg0 = arg0.substring(0, local30) + " ";
				for (@Pc(51) int local51 = local30 + 1; local51 < local35; local51++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local1 == null ? arg0 : local1 + arg0;
	}

	@OriginalMember(owner = "client!ai", name = "ad", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 318)
	static String method13245(@OriginalArg(0) String arg0) {
		@Pc(1) String local1 = null;
		@Pc(5) int local5 = arg0.indexOf("--> ");
		if (local5 >= 0) {
			local1 = arg0.substring(0, local5 + 4);
			arg0 = arg0.substring(local5 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(30) int local30 = arg0.indexOf(" ", "directlogin ".length());
			if (local30 >= 0) {
				@Pc(35) int local35 = arg0.length();
				arg0 = arg0.substring(0, local30) + " ";
				for (@Pc(51) int local51 = local30 + 1; local51 < local35; local51++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local1 == null ? arg0 : local1 + arg0;
	}

	@OriginalMember(owner = "client!ai", name = "aw", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 318)
	static String method13246(@OriginalArg(0) String arg0) {
		@Pc(1) String local1 = null;
		@Pc(5) int local5 = arg0.indexOf("--> ");
		if (local5 >= 0) {
			local1 = arg0.substring(0, local5 + 4);
			arg0 = arg0.substring(local5 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(30) int local30 = arg0.indexOf(" ", "directlogin ".length());
			if (local30 >= 0) {
				@Pc(35) int local35 = arg0.length();
				arg0 = arg0.substring(0, local30) + " ";
				for (@Pc(51) int local51 = local30 + 1; local51 < local35; local51++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local1 == null ? arg0 : local1 + arg0;
	}

	@OriginalMember(owner = "client!ai", name = "bw", descriptor = "()V", line = 336)
	static void method13248() {
	}

	@OriginalMember(owner = "client!ai", name = "bp", descriptor = "(Ljava/lang/String;ZZ)V", line = 340)
	public static void method13232(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class215.method24289("commands - This command");
				Class215.method24289("cls - Clear console");
				Class215.method24289("displayfps - Toggle FPS and other information");
				Class215.method24289("renderer - Print graphics renderer information");
				Class215.method24289("heap - Print java memory information");
				Class215.method24289("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				anInt1840 = 0;
				anInt1835 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean574 = !client.aBoolean574;
				if (client.aBoolean574) {
					Class215.method24289("FPS on");
				} else {
					Class215.method24289("FPS off");
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class117 local62 = Class613.aClass21_13.method17016();
				Class215.method24289("Toolkit ID: " + Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373());
				Class215.method24289("Vendor: " + local62.anInt3201 * -1635434713);
				Class215.method24289("Name: " + local62.aString158);
				Class215.method24289("Version: " + local62.anInt3202 * -1645999417);
				Class215.method24289("Device: " + local62.aString157);
				Class215.method24289("Driver Version: " + local62.aLong237 * 3118557101980400735L);
				local139 = Class613.aClass21_13.method17035();
				if (local139.length() > 0) {
					Class215.method24289(local139);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class215.method24289("Heap: " + Class390.anInt3031 * -435910341 + "MB");
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class464 local173 = client.aClass370_1.method26942();
				if (Class72.anInt2086 * 81180077 == 3) {
					@Pc(182) Class320 local182 = Class80.aClass23_Sub1_1.method5908();
					@Pc(186) Class320 local186 = Class80.aClass23_Sub1_1.method5834();
					Class215.method24289("Pos: " + (new Class464(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, (int) local182.aFloat259 >> 9, (int) local182.aFloat261 >> 9)).toString() + " Height: " + (Class186.method23926((int) local182.aFloat259 - (local173.anInt5071 * -1567811631 << 9), (int) local182.aFloat261 - (local173.anInt5073 * 1360175441 << 9), Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) + (int) local182.aFloat260));
					Class215.method24289("Look: " + (new Class464(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, (int) local186.aFloat259 >> 9, (int) local186.aFloat261 >> 9)).toString() + " Height: " + (Class186.method23926((int) local186.aFloat259 - (local173.anInt5071 * -1567811631 << 9), (int) local182.aFloat261 - (local173.anInt5073 * 1360175441 << 9), Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) + (int) local182.aFloat260));
				} else {
					Class215.method24289("Pos: " + Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 + "," + (local173.anInt5071 * -1567811631 + (Class586.anInt5460 * -1129330577 >> 9) >> 6) + "," + (local173.anInt5073 * 1360175441 + (Class149.anInt3434 * -324079631 >> 9) >> 6) + "," + (local173.anInt5071 * -1567811631 + (Class586.anInt5460 * -1129330577 >> 9) & 0x3F) + "," + (local173.anInt5073 * 1360175441 + (Class149.anInt3434 * -324079631 >> 9) & 0x3F) + " Height: " + (Class186.method23926(Class586.anInt5460 * -1129330577, Class149.anInt3434 * -324079631, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) - Class140.anInt3424 * 1701665129));
					Class215.method24289("Look: " + Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 + "," + (Class346.anInt4621 * -745863761 + local173.anInt5071 * -1567811631 >> 6) + "," + (local173.anInt5073 * 1360175441 + Class309.anInt4525 * 291210915 >> 6) + "," + (local173.anInt5071 * -1567811631 + Class346.anInt4621 * -745863761 & 0x3F) + "," + (Class309.anInt4525 * 291210915 + local173.anInt5073 * 1360175441 & 0x3F) + " Height: " + (Class186.method23926(Class346.anInt4621 * -745863761, Class309.anInt4525 * 291210915, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) - Class316.anInt4548 * -616425307));
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class215.method24289(Class601.aClass601_4.method33512(Class469.aClass530_2));
			return;
		}
		if (Class1.aClass527_1 != Class527.aClass527_10 || client.anInt3116 * -1336253523 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class157.method23193(1, -1, -1, false);
					if (Class492.method29292() == 1) {
						Class215.method24289("Success");
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class157.method23193(2, -1, -1, false);
					if (Class492.method29292() == 2) {
						Class215.method24289("Success");
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (Class552.aBoolean823 && arg0.equalsIgnoreCase("wm3")) {
					Class157.method23193(3, 1024, 768, false);
					if (Class492.method29292() == 3) {
						Class215.method24289("Success");
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				@Pc(574) String local574;
				@Pc(578) int local578;
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.anInt3039 * 1115111877 != 2) {
						Class215.method24289("Failure");
						return;
					}
					local568 = -1;
					local574 = arg0.substring(9);
					local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class215.method24289("Failure");
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class215.method24289("Failure");
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class396.method27510(local139, local568);
					Class215.method24289("Success");
					return;
				}
				if (arg0.startsWith("setmediastream ")) {
					if (client.anInt3039 * 1115111877 != 2) {
						Class215.method24289("Failure");
						return;
					}
					local568 = -1;
					local574 = arg0.substring(15);
					local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class215.method24289("Failure");
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(662) NumberFormatException local662) {
					}
					if (local568 == -1) {
						Class215.method24289("Failure");
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class515.method29647(local139, local568);
					Class571.aClass348_3.method26552(Class570.aClass585_6.aString242, Class570.aClass585_6.method33271());
					Class626.aClass334_1.method26277();
					Class215.method24289("Success");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class546.method32647(0, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 0) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class546.method32647(1, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 1) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 1);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class546.method32647(3, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 3) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 3);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class546.method32647(5, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 5) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 5);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.anInt3039 * 1115111877 == 5) {
						Class486.method29181();
					} else if (client.anInt3039 * 1115111877 == 7) {
						client.aClass82_2.aBoolean531 = true;
					}
					return;
				}
				@Pc(858) int local858;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(856) Class82[] local856 = client.aClass82Array1;
					for (local858 = 0; local858 < local856.length; local858++) {
						@Pc(866) Class82 local866 = local856[local858];
						if (local866.method21621() != null) {
							local866.method21621().method12857();
						}
					}
					Class117.aClass51_2.method9837();
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class215.method24289("varpbit=" + Class424.aClass165_1.method32384(Class424.aClass165_1.method24296(local568)));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class215.method24289("varp=" + Class424.aClass165_1.method32385(Class424.aClass165_1.method24295(Class43.aClass43_68, local568)));
					return;
				}
				@Pc(945) String[] local945;
				if (arg0.startsWith("directlogin")) {
					local945 = Class230.method24546(arg0.substring(12), ' ');
					if (local945.length == 2) {
						Class3_Sub29.method11606(local945[0], local945[1]);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local945 = Class230.method24546(arg0.substring(8), ' ');
					local858 = Integer.parseInt(local945[0]);
					Class163.method23296(local858);
					return;
				}
				@Pc(989) File local989;
				if (arg0.startsWith("setoutput ")) {
					local989 = new File(arg0.substring(10));
					if (local989.exists()) {
						local989 = new File(arg0.substring(10) + "." + Class176.method23413() + ".log");
						if (local989.exists()) {
							Class215.method24289("file already exists!");
							return;
						}
					}
					if (aFileOutputStream1 != null) {
						aFileOutputStream1.close();
						aFileOutputStream1 = null;
					}
					try {
						aFileOutputStream1 = new FileOutputStream(local989);
						return;
					} catch (@Pc(1032) FileNotFoundException local1032) {
						Class215.method24289("Could not create " + local989.getName());
						return;
					} catch (@Pc(1045) SecurityException local1045) {
						Class215.method24289("Cannot write to " + local989.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (aFileOutputStream1 != null) {
						aFileOutputStream1.close();
					}
					aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local989 = new File(arg0.substring(10));
					if (!local989.exists()) {
						Class215.method24289("No such file");
						return;
					}
					@Pc(1091) byte[] local1091 = Class106.method21919(local989);
					if (local1091 == null) {
						Class215.method24289("Failed to read file");
						return;
					}
					@Pc(1108) String[] local1108 = Class230.method24546(Class230.method24545(Class11.method1212(local1091), '\r', ""), '\n');
					Class633.method33877(local1108);
				}
				if (client.anInt3039 * 1115111877 == 5 || client.anInt3039 * 1115111877 == 18) {
					@Pc(1124) Class82 local1124 = Class406.method27657();
					@Pc(1130) Class3_Sub23 local1130 = Class269.method25284(Class311.aClass311_108, local1124.aClass577_2);
					local1130.aClass3_Sub41_Sub1_1.method20250(arg0.length() + 3);
					local1130.aClass3_Sub41_Sub1_1.method20250(arg1 ? 1 : 0);
					local1130.aClass3_Sub41_Sub1_1.method20250(arg2 ? 1 : 0);
					local1130.aClass3_Sub41_Sub1_1.method20260(arg0);
					local1124.method21601(local1130);
				}
			} catch (@Pc(1167) Exception local1167) {
				Class215.method24289(Class601.aClass601_4.method33512(Class469.aClass530_2));
				return;
			}
		}
		if (client.anInt3039 * 1115111877 != 5 && client.anInt3039 * 1115111877 != 18) {
			Class215.method24289(Class601.aClass601_9.method33512(Class469.aClass530_2) + arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "bd", descriptor = "(Ljava/lang/String;ZZ)V", line = 340)
	public static void method13250(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class215.method24289("commands - This command");
				Class215.method24289("cls - Clear console");
				Class215.method24289("displayfps - Toggle FPS and other information");
				Class215.method24289("renderer - Print graphics renderer information");
				Class215.method24289("heap - Print java memory information");
				Class215.method24289("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				anInt1840 = 0;
				anInt1835 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean574 = !client.aBoolean574;
				if (client.aBoolean574) {
					Class215.method24289("FPS on");
				} else {
					Class215.method24289("FPS off");
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class117 local62 = Class613.aClass21_13.method17016();
				Class215.method24289("Toolkit ID: " + Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373());
				Class215.method24289("Vendor: " + local62.anInt3201 * -1635434713);
				Class215.method24289("Name: " + local62.aString158);
				Class215.method24289("Version: " + local62.anInt3202 * -1645999417);
				Class215.method24289("Device: " + local62.aString157);
				Class215.method24289("Driver Version: " + local62.aLong237 * 3118557101980400735L);
				local139 = Class613.aClass21_13.method17035();
				if (local139.length() > 0) {
					Class215.method24289(local139);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class215.method24289("Heap: " + Class390.anInt3031 * -435910341 + "MB");
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class464 local173 = client.aClass370_1.method26942();
				if (Class72.anInt2086 * 81180077 == 3) {
					@Pc(182) Class320 local182 = Class80.aClass23_Sub1_1.method5908();
					@Pc(186) Class320 local186 = Class80.aClass23_Sub1_1.method5834();
					Class215.method24289("Pos: " + (new Class464(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, (int) local182.aFloat259 >> 9, (int) local182.aFloat261 >> 9)).toString() + " Height: " + (Class186.method23926((int) local182.aFloat259 - (local173.anInt5071 * -1567811631 << 9), (int) local182.aFloat261 - (local173.anInt5073 * 1360175441 << 9), Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) + (int) local182.aFloat260));
					Class215.method24289("Look: " + (new Class464(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101, (int) local186.aFloat259 >> 9, (int) local186.aFloat261 >> 9)).toString() + " Height: " + (Class186.method23926((int) local186.aFloat259 - (local173.anInt5071 * -1567811631 << 9), (int) local182.aFloat261 - (local173.anInt5073 * 1360175441 << 9), Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) + (int) local182.aFloat260));
				} else {
					Class215.method24289("Pos: " + Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 + "," + (local173.anInt5071 * -1567811631 + (Class586.anInt5460 * -1129330577 >> 9) >> 6) + "," + (local173.anInt5073 * 1360175441 + (Class149.anInt3434 * -324079631 >> 9) >> 6) + "," + (local173.anInt5071 * -1567811631 + (Class586.anInt5460 * -1129330577 >> 9) & 0x3F) + "," + (local173.anInt5073 * 1360175441 + (Class149.anInt3434 * -324079631 >> 9) & 0x3F) + " Height: " + (Class186.method23926(Class586.anInt5460 * -1129330577, Class149.anInt3434 * -324079631, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) - Class140.anInt3424 * 1701665129));
					Class215.method24289("Look: " + Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 + "," + (Class346.anInt4621 * -745863761 + local173.anInt5071 * -1567811631 >> 6) + "," + (local173.anInt5073 * 1360175441 + Class309.anInt4525 * 291210915 >> 6) + "," + (local173.anInt5071 * -1567811631 + Class346.anInt4621 * -745863761 & 0x3F) + "," + (Class309.anInt4525 * 291210915 + local173.anInt5073 * 1360175441 & 0x3F) + " Height: " + (Class186.method23926(Class346.anInt4621 * -745863761, Class309.anInt4525 * 291210915, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) - Class316.anInt4548 * -616425307));
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class215.method24289(Class601.aClass601_4.method33512(Class469.aClass530_2));
			return;
		}
		if (Class1.aClass527_1 != Class527.aClass527_10 || client.anInt3116 * -1336253523 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class157.method23193(1, -1, -1, false);
					if (Class492.method29292() == 1) {
						Class215.method24289("Success");
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class157.method23193(2, -1, -1, false);
					if (Class492.method29292() == 2) {
						Class215.method24289("Success");
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (Class552.aBoolean823 && arg0.equalsIgnoreCase("wm3")) {
					Class157.method23193(3, 1024, 768, false);
					if (Class492.method29292() == 3) {
						Class215.method24289("Success");
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				@Pc(574) String local574;
				@Pc(578) int local578;
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.anInt3039 * 1115111877 != 2) {
						Class215.method24289("Failure");
						return;
					}
					local568 = -1;
					local574 = arg0.substring(9);
					local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class215.method24289("Failure");
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class215.method24289("Failure");
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class396.method27510(local139, local568);
					Class215.method24289("Success");
					return;
				}
				if (arg0.startsWith("setmediastream ")) {
					if (client.anInt3039 * 1115111877 != 2) {
						Class215.method24289("Failure");
						return;
					}
					local568 = -1;
					local574 = arg0.substring(15);
					local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class215.method24289("Failure");
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(662) NumberFormatException local662) {
					}
					if (local568 == -1) {
						Class215.method24289("Failure");
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class515.method29647(local139, local568);
					Class571.aClass348_3.method26552(Class570.aClass585_6.aString242, Class570.aClass585_6.method33271());
					Class626.aClass334_1.method26277();
					Class215.method24289("Success");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class546.method32647(0, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 0) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class546.method32647(1, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 1) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 1);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class546.method32647(3, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 3) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 3);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class546.method32647(5, false);
					if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 5) {
						Class215.method24289("Success");
						Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 5);
						Class26_Sub1_Sub1_Sub1.method16728();
						client.aBoolean573 = false;
					} else {
						Class215.method24289("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.anInt3039 * 1115111877 == 5) {
						Class486.method29181();
					} else if (client.anInt3039 * 1115111877 == 7) {
						client.aClass82_2.aBoolean531 = true;
					}
					return;
				}
				@Pc(858) int local858;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(856) Class82[] local856 = client.aClass82Array1;
					for (local858 = 0; local858 < local856.length; local858++) {
						@Pc(866) Class82 local866 = local856[local858];
						if (local866.method21621() != null) {
							local866.method21621().method12857();
						}
					}
					Class117.aClass51_2.method9837();
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class215.method24289("varpbit=" + Class424.aClass165_1.method32384(Class424.aClass165_1.method24296(local568)));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class215.method24289("varp=" + Class424.aClass165_1.method32385(Class424.aClass165_1.method24295(Class43.aClass43_68, local568)));
					return;
				}
				@Pc(945) String[] local945;
				if (arg0.startsWith("directlogin")) {
					local945 = Class230.method24546(arg0.substring(12), ' ');
					if (local945.length == 2) {
						Class3_Sub29.method11606(local945[0], local945[1]);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local945 = Class230.method24546(arg0.substring(8), ' ');
					local858 = Integer.parseInt(local945[0]);
					Class163.method23296(local858);
					return;
				}
				@Pc(989) File local989;
				if (arg0.startsWith("setoutput ")) {
					local989 = new File(arg0.substring(10));
					if (local989.exists()) {
						local989 = new File(arg0.substring(10) + "." + Class176.method23413() + ".log");
						if (local989.exists()) {
							Class215.method24289("file already exists!");
							return;
						}
					}
					if (aFileOutputStream1 != null) {
						aFileOutputStream1.close();
						aFileOutputStream1 = null;
					}
					try {
						aFileOutputStream1 = new FileOutputStream(local989);
						return;
					} catch (@Pc(1032) FileNotFoundException local1032) {
						Class215.method24289("Could not create " + local989.getName());
						return;
					} catch (@Pc(1045) SecurityException local1045) {
						Class215.method24289("Cannot write to " + local989.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (aFileOutputStream1 != null) {
						aFileOutputStream1.close();
					}
					aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local989 = new File(arg0.substring(10));
					if (!local989.exists()) {
						Class215.method24289("No such file");
						return;
					}
					@Pc(1091) byte[] local1091 = Class106.method21919(local989);
					if (local1091 == null) {
						Class215.method24289("Failed to read file");
						return;
					}
					@Pc(1108) String[] local1108 = Class230.method24546(Class230.method24545(Class11.method1212(local1091), '\r', ""), '\n');
					Class633.method33877(local1108);
				}
				if (client.anInt3039 * 1115111877 == 5 || client.anInt3039 * 1115111877 == 18) {
					@Pc(1124) Class82 local1124 = Class406.method27657();
					@Pc(1130) Class3_Sub23 local1130 = Class269.method25284(Class311.aClass311_108, local1124.aClass577_2);
					local1130.aClass3_Sub41_Sub1_1.method20250(arg0.length() + 3);
					local1130.aClass3_Sub41_Sub1_1.method20250(arg1 ? 1 : 0);
					local1130.aClass3_Sub41_Sub1_1.method20250(arg2 ? 1 : 0);
					local1130.aClass3_Sub41_Sub1_1.method20260(arg0);
					local1124.method21601(local1130);
				}
			} catch (@Pc(1167) Exception local1167) {
				Class215.method24289(Class601.aClass601_4.method33512(Class469.aClass530_2));
				return;
			}
		}
		if (client.anInt3039 * 1115111877 != 5 && client.anInt3039 * 1115111877 != 18) {
			Class215.method24289(Class601.aClass601_9.method33512(Class469.aClass530_2) + arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "bs", descriptor = "(I)V", line = 615)
	static void method13249(@OriginalArg(0) int arg0) {
		if (arg0 == 26) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 4) {
					Class5_Sub3.method752();
				} else if (arg0 == 14) {
					Class215.method24289("" + Class390.anInt3019 * 1617726299);
				} else if (arg0 == 17) {
					@Pc(43) Class444 local43 = client.aClass370_1.method26950().aClass444_1;
					local43.aBoolean769 = !local43.aBoolean769;
				} else if (arg0 == 1) {
					client.aBoolean574 = true;
				} else if (arg0 == 24) {
					client.aBoolean574 = false;
				} else if (arg0 == 7) {
					client.aClass559_7.method32818();
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 21) {
						Class502.method29462();
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class215.method24289("" + local95);
					} else if (arg0 == 25) {
						Class502.method29462();
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class215.method24289("" + local95);
						Class334.method26291();
						Class502.method29462();
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class215.method24289("" + local95);
					} else if (arg0 == 27) {
						Class215.method24289(Class370.aClass417_1.method27789() ? "Success" : "Failure");
					} else if (arg0 == 6) {
						FileFilter_Sub1.aClass585_1.method33273();
					} else if (arg0 == 11) {
						Class117.aClass51_2.method9817();
					} else if (arg0 == 23) {
						Class117.aClass51_2.method9827();
					} else if (arg0 == 29) {
						Class106.aCanvas6.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class106.aCanvas6.setLocation(Class390.anInt3022 * 426445859, Class390.anInt3024 * 2076797327);
					} else if (arg0 == 13) {
						Class250.method25080();
					} else if (arg0 == 19) {
						client.aClass370_1.aLong267 = Class176.method23413() * -4368627482611790673L;
						client.aClass370_1.aBoolean728 = true;
						Class250.method25080();
					} else {
						@Pc(254) Class320 local254;
						if (arg0 == 10) {
							local254 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
							Class215.method24289(((int) local254.aFloat259 >> 9) + " " + ((int) local254.aFloat261 >> 9));
						} else if (arg0 == 9) {
							local254 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
							Class215.method24289("" + client.aClass370_1.method26950().aClass17Array3[Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101].method3548((int) local254.aFloat259 >> 9, (int) local254.aFloat261 >> 9));
						} else if (arg0 == 8) {
							Class215.method24289(Class178.aClass161_17.method23257() + " " + Class178.aClass161_17.method23225());
							Class215.method24289(Class178.aClass161_19.method23257() + " " + Class178.aClass161_19.method23225());
							Class215.method24289(Class44_Sub3.aClass596_1.aClass466_1.method28654() + " " + Class44_Sub3.aClass596_1.aClass466_1.method28653());
						} else if (arg0 == 15) {
							Class604.method33534(false);
						} else if (arg0 == 3) {
							client.aBoolean575 = !client.aBoolean575;
							Class613.aClass21_13.method17142(client.aBoolean575);
							Class201.method24153();
							return;
						} else if (arg0 == 28) {
							client.anInt3044 = 0;
							client.aClass370_1.method26968();
						} else if (arg0 == 16) {
							client.anInt3044 = -882018297;
							client.aClass370_1.method26968();
						} else if (arg0 == 20) {
							client.anInt3044 = -1764036594;
							client.aClass370_1.method26968();
						}
					}
				}
			} catch (@Pc(413) Exception local413) {
				Class215.method24289(Class601.aClass601_4.method33512(Class469.aClass530_2));
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "bm", descriptor = "(I)V", line = 615)
	static void method13252(@OriginalArg(0) int arg0) {
		if (arg0 == 26) {
			throw new Error();
		} else if (arg0 == 2) {
			throw new OutOfMemoryError();
		} else {
			try {
				if (arg0 == 4) {
					Class5_Sub3.method752();
				} else if (arg0 == 14) {
					Class215.method24289("" + Class390.anInt3019 * 1617726299);
				} else if (arg0 == 17) {
					@Pc(43) Class444 local43 = client.aClass370_1.method26950().aClass444_1;
					local43.aBoolean769 = !local43.aBoolean769;
				} else if (arg0 == 1) {
					client.aBoolean574 = true;
				} else if (arg0 == 24) {
					client.aBoolean574 = false;
				} else if (arg0 == 7) {
					client.aClass559_7.method32818();
				} else {
					@Pc(95) int local95;
					@Pc(78) int local78;
					@Pc(86) Runtime local86;
					if (arg0 == 21) {
						Class502.method29462();
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class215.method24289("" + local95);
					} else if (arg0 == 25) {
						Class502.method29462();
						for (local78 = 0; local78 < 10; local78++) {
							System.gc();
						}
						local86 = Runtime.getRuntime();
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class215.method24289("" + local95);
						Class334.method26291();
						Class502.method29462();
						for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
							System.gc();
						}
						local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
						Class215.method24289("" + local95);
					} else if (arg0 == 27) {
						Class215.method24289(Class370.aClass417_1.method27789() ? "Success" : "Failure");
					} else if (arg0 == 6) {
						FileFilter_Sub1.aClass585_1.method33273();
					} else if (arg0 == 11) {
						Class117.aClass51_2.method9817();
					} else if (arg0 == 23) {
						Class117.aClass51_2.method9827();
					} else if (arg0 == 29) {
						Class106.aCanvas6.setLocation(50, 50);
					} else if (arg0 == 22) {
						Class106.aCanvas6.setLocation(Class390.anInt3022 * 426445859, Class390.anInt3024 * 2076797327);
					} else if (arg0 == 13) {
						Class250.method25080();
					} else if (arg0 == 19) {
						client.aClass370_1.aLong267 = Class176.method23413() * -4368627482611790673L;
						client.aClass370_1.aBoolean728 = true;
						Class250.method25080();
					} else {
						@Pc(254) Class320 local254;
						if (arg0 == 10) {
							local254 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
							Class215.method24289(((int) local254.aFloat259 >> 9) + " " + ((int) local254.aFloat261 >> 9));
						} else if (arg0 == 9) {
							local254 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
							Class215.method24289("" + client.aClass370_1.method26950().aClass17Array3[Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101].method3548((int) local254.aFloat259 >> 9, (int) local254.aFloat261 >> 9));
						} else if (arg0 == 8) {
							Class215.method24289(Class178.aClass161_17.method23257() + " " + Class178.aClass161_17.method23225());
							Class215.method24289(Class178.aClass161_19.method23257() + " " + Class178.aClass161_19.method23225());
							Class215.method24289(Class44_Sub3.aClass596_1.aClass466_1.method28654() + " " + Class44_Sub3.aClass596_1.aClass466_1.method28653());
						} else if (arg0 == 15) {
							Class604.method33534(false);
						} else if (arg0 == 3) {
							client.aBoolean575 = !client.aBoolean575;
							Class613.aClass21_13.method17142(client.aBoolean575);
							Class201.method24153();
							return;
						} else if (arg0 == 28) {
							client.anInt3044 = 0;
							client.aClass370_1.method26968();
						} else if (arg0 == 16) {
							client.anInt3044 = -882018297;
							client.aClass370_1.method26968();
						} else if (arg0 == 20) {
							client.anInt3044 = -1764036594;
							client.aClass370_1.method26968();
						}
					}
				}
			} catch (@Pc(413) Exception local413) {
				Class215.method24289(Class601.aClass601_4.method33512(Class469.aClass530_2));
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "bf", descriptor = "()V", line = 704)
	static void method13253() {
		if (Class510.aClass3_Sub45_37.aClass60_Sub16_1.method13548() == 1) {
			Class30_Sub1.aClass379_1.method27252(new Class374(Class380.aClass380_9, null));
		} else {
			client.aClass370_1.method26968();
			Class157.method23191();
		}
	}

	@OriginalMember(owner = "client!ai", name = "ew", descriptor = "(Lclient!vs;I)V", line = 4835)
	static final void method13254(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class608.method33564(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "wz", descriptor = "(Lclient!vs;B)V", line = 8019)
	static final void method13255(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Canvas_Sub1.aBoolean481 ? 1 : 0;
	}
}
