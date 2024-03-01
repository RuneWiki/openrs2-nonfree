package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public class Class392 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "Ljava/io/File;")
	static File aFile3;

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "Z")
	static boolean aBoolean750 = false;

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Ljava/util/Hashtable;")
	static Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 11)
	Class392() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "(Ljava/io/File;)V", line = 16)
	static void method27422(@OriginalArg(0) File arg0) {
		aFile3 = arg0;
		if (!aFile3.exists()) {
			throw new RuntimeException("");
		}
		aBoolean750 = true;
	}

	@OriginalMember(owner = "client!pk", name = "l", descriptor = "(Ljava/io/File;)V", line = 16)
	static void method27424(@OriginalArg(0) File arg0) {
		aFile3 = arg0;
		if (!aFile3.exists()) {
			throw new RuntimeException("");
		}
		aBoolean750 = true;
	}

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "(Ljava/lang/String;)Ljava/io/File;", line = 22)
	public static File method27423(@OriginalArg(0) String arg0) {
		if (!aBoolean750) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) File local22 = new File(aFile3, arg0);
		@Pc(24) RandomAccessFile local24 = null;
		try {
			@Pc(30) File local30 = new File(local22.getParent());
			if (!local30.exists()) {
				throw new RuntimeException("");
			}
			local24 = new RandomAccessFile(local22, "rw");
			@Pc(47) int local47 = local24.read();
			local24.seek(0L);
			local24.write(local47);
			local24.seek(0L);
			local24.close();
			aHashtable9.put(arg0, local22);
			return local22;
		} catch (@Pc(66) Exception local66) {
			try {
				if (local24 != null) {
					local24.close();
				}
			} catch (@Pc(75) Exception local75) {
			}
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "(Ljava/lang/String;)Ljava/io/File;", line = 22)
	public static File method27425(@OriginalArg(0) String arg0) {
		if (!aBoolean750) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) File local22 = new File(aFile3, arg0);
		@Pc(24) RandomAccessFile local24 = null;
		try {
			@Pc(30) File local30 = new File(local22.getParent());
			if (!local30.exists()) {
				throw new RuntimeException("");
			}
			local24 = new RandomAccessFile(local22, "rw");
			@Pc(47) int local47 = local24.read();
			local24.seek(0L);
			local24.write(local47);
			local24.seek(0L);
			local24.close();
			aHashtable9.put(arg0, local22);
			return local22;
		} catch (@Pc(66) Exception local66) {
			try {
				if (local24 != null) {
					local24.close();
				}
			} catch (@Pc(75) Exception local75) {
			}
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "([I[IIII)V", line = 77)
	public static void method27426(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < (local47 & local45) + local14) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method27426(arg0, arg1, arg2, local10 - 1);
		method27426(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "(Lclient!agb;II)V", line = 218)
	static void method27429(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub1_Sub6 local12 = Class118.method22820(local8);
		if (local12 == null) {
			return;
		}
		@Pc(19) Class536 local19 = Class27.method15271();
		local19.anIntArray494 = new int[local12.anInt2657 * -1110480365];
		@Pc(28) int local28 = 0;
		local19.anObjectArray41 = new String[local12.anInt2656 * 1386116957];
		@Pc(37) int local37 = 0;
		local19.aLongArray17 = new long[local12.anInt2661 * 1291811773];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 1; local48 < local2.length; local48++) {
			if (local2[local48] instanceof Integer) {
				@Pc(63) int local63 = (Integer) local2[local48];
				if (local63 == -2147483647) {
					local63 = arg0.anInt1257 * 1292801391;
				}
				if (local63 == -2147483646) {
					local63 = arg0.anInt1258 * 248814101;
				}
				if (local63 == -2147483645) {
					local63 = arg0.aClass178_2 == null ? -1 : arg0.aClass178_2.anInt3570 * 954808515;
				}
				if (local63 == -2147483644) {
					local63 = arg0.anInt1259 * 633007527;
				}
				if (local63 == -2147483643) {
					local63 = arg0.aClass178_2 == null ? -1 : arg0.aClass178_2.anInt3491 * 18828465;
				}
				if (local63 == -2147483642) {
					local63 = arg0.aClass178_3 == null ? -1 : arg0.aClass178_3.anInt3570 * 954808515;
				}
				if (local63 == -2147483641) {
					local63 = arg0.aClass178_3 == null ? -1 : arg0.aClass178_3.anInt3491 * 18828465;
				}
				if (local63 == -2147483640) {
					local63 = arg0.anInt1260 * -1114215687;
				}
				if (local63 == -2147483639) {
					local63 = arg0.anInt1261 * 1447905271;
				}
				local19.anIntArray494[local28++] = local63;
			} else if (local2[local48] instanceof String) {
				@Pc(178) String local178 = (String) local2[local48];
				if (local178.equals("event_opbase")) {
					local178 = arg0.aString45;
				}
				local19.anObjectArray41[local37++] = local178;
			} else if (local2[local48] instanceof Long) {
				@Pc(203) long local203 = (Long) local2[local48];
				local19.aLongArray17[local46++] = local203;
			}
		}
		local19.anInt5313 = arg0.anInt1262 * -1099161283;
		Class60_Sub6.method12969(local12, arg1, local19);
	}

	@OriginalMember(owner = "client!pk", name = "fp", descriptor = "(ZB)V", line = 1853)
	public static void method27428(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (client.anInt3125 * -1579500007 != -1) {
				Class467.method28739(client.anInt3125 * -1579500007);
			}
			for (@Pc(16) Class3_Sub42 local16 = (Class3_Sub42) client.aClass581_22.method33221(); local16 != null; local16 = (Class3_Sub42) client.aClass581_22.method33231()) {
				if (!local16.method33657()) {
					local16 = (Class3_Sub42) client.aClass581_22.method33221();
					if (local16 == null) {
						break;
					}
				}
				Class490.method29244(local16, true, false);
			}
			client.anInt3125 = 334905815;
			client.aClass581_22 = new Class581(8);
			Class161.method23260();
			client.anInt3125 = Class630.aClass493_1.anInt5221 * -2099231181;
			if (-1579500007 * client.anInt3125 != -1) {
				Class298.method25633(false);
				Class401.method27608();
				Class331.method26182(client.anInt3125 * -1579500007, null);
			}
		}
		Class329.method26167();
		Class190.aBoolean661 = false;
		Class603.method33531();
		client.anInt3159 = -1299803289;
		Class532.method32502(client.anInt3120 * -592303601);
		Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 = new Class26_Sub1_Sub1_Sub1_Sub2(null);
		Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21437((float) (client.aClass370_1.method26943() * 512 / 2), 0.0F, (float) (client.aClass370_1.method27062() * 512 / 2));
		Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] = client.aClass370_1.method26943() / 2;
		Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] = client.aClass370_1.method27062() / 2;
		Class149.anInt3434 = 0;
		Class586.anInt5460 = 0;
		if (Class72.anInt2086 * 81180077 == 2) {
			Class586.anInt5460 = (Class272.anInt4297 * 1235909055 << 9) * 1317181071;
			Class149.anInt3434 = (Class177.anInt3473 * -1211408809 << 9) * 1723080977;
		} else {
			Class16.method1679();
		}
		client.aClass370_1.method26953().method28901();
	}

	@OriginalMember(owner = "client!pk", name = "he", descriptor = "(Lclient!vs;I)V", line = 5487)
	static final void method27427(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class85.method21635(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!pk", name = "aqv", descriptor = "(Lclient!vs;B)V", line = 11973)
	static final void method27430(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class586.method33284(2, local13 << 16 | local23, local33, "");
	}
}
