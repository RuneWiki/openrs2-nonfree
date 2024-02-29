package com.jagex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public class Class509 {

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Ljava/io/File;")
	static File aFile3;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Ljava/io/FileOutputStream;")
	static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "Z")
	static boolean aBoolean775 = false;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "Ljava/util/Hashtable;")
	static Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V", line = 11)
	Class509() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "(Ljava/io/File;)V", line = 16)
	static void method30270(@OriginalArg(0) File arg0) {
		aFile3 = arg0;
		if (!aFile3.exists()) {
			throw new RuntimeException("");
		}
		aBoolean775 = true;
	}

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "(Ljava/io/File;)V", line = 16)
	static void method30271(@OriginalArg(0) File arg0) {
		aFile3 = arg0;
		if (!aFile3.exists()) {
			throw new RuntimeException("");
		}
		aBoolean775 = true;
	}

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "(Ljava/io/File;)V", line = 16)
	static void method30272(@OriginalArg(0) File arg0) {
		aFile3 = arg0;
		if (!aFile3.exists()) {
			throw new RuntimeException("");
		}
		aBoolean775 = true;
	}

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "(Ljava/io/File;)V", line = 16)
	static void method30273(@OriginalArg(0) File arg0) {
		aFile3 = arg0;
		if (!aFile3.exists()) {
			throw new RuntimeException("");
		}
		aBoolean775 = true;
	}

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "(Ljava/io/File;)V", line = 16)
	static void method30274(@OriginalArg(0) File arg0) {
		aFile3 = arg0;
		if (!aFile3.exists()) {
			throw new RuntimeException("");
		}
		aBoolean775 = true;
	}

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "()Ljava/lang/String;", line = 22)
	public static String method30275() {
		return aFile3.getAbsolutePath();
	}

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "()Ljava/lang/String;", line = 22)
	public static String method30276() {
		return aFile3.getAbsolutePath();
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "()Ljava/lang/String;", line = 22)
	public static String method30277() {
		return aFile3.getAbsolutePath();
	}

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "(Ljava/lang/String;)Ljava/io/File;", line = 26)
	public static File method30278(@OriginalArg(0) String arg0) {
		if (!aBoolean775) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(21) File local21 = new File(aFile3, arg0);
		@Pc(23) RandomAccessFile local23 = null;
		try {
			@Pc(29) File local29 = new File(local21.getParent());
			if (!local29.exists()) {
				throw new RuntimeException("");
			}
			local23 = new RandomAccessFile(local21, "rw");
			@Pc(46) int local46 = local23.read();
			local23.seek(0L);
			local23.write(local46);
			local23.seek(0L);
			local23.close();
			aHashtable9.put(arg0, local21);
			return local21;
		} catch (@Pc(65) Exception local65) {
			try {
				if (local23 != null) {
					local23.close();
					local23 = null;
				}
			} catch (@Pc(73) Exception local73) {
			}
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "(I)V", line = 37)
	static void method30279() {
		if (Class424.anIntArray462 != null) {
			return;
		}
		Class424.anIntArray462 = new int[65536];
		@Pc(7) double local7 = 0.7D;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 512; local11++) {
			@Pc(26) float local26 = ((float) (local11 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(35) float local35 = (float) (local11 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(37) int local37 = 0; local37 < 128; local37++) {
				@Pc(45) float local45 = (float) local37 / 128.0F;
				@Pc(47) float local47 = 0.0F;
				@Pc(49) float local49 = 0.0F;
				@Pc(51) float local51 = 0.0F;
				@Pc(55) float local55 = local26 / 60.0F;
				@Pc(58) int local58 = (int) local55;
				@Pc(62) int local62 = local58 % 6;
				@Pc(67) float local67 = local55 - (float) local58;
				@Pc(73) float local73 = (1.0F - local35) * local45;
				@Pc(81) float local81 = local45 * (1.0F - local67 * local35);
				@Pc(91) float local91 = local45 * (1.0F - local35 * (1.0F - local67));
				if (local62 == 0) {
					local47 = local45;
					local49 = local91;
					local51 = local73;
				} else if (local62 == 1) {
					local47 = local81;
					local49 = local45;
					local51 = local73;
				} else if (local62 == 2) {
					local47 = local73;
					local49 = local45;
					local51 = local91;
				} else if (local62 == 3) {
					local47 = local73;
					local49 = local81;
					local51 = local45;
				} else if (local62 == 4) {
					local47 = local91;
					local49 = local73;
					local51 = local45;
				} else if (local62 == 5) {
					local47 = local45;
					local49 = local73;
					local51 = local81;
				}
				local47 = (float) Math.pow((double) local47, local7);
				local49 = (float) Math.pow((double) local49, local7);
				local51 = (float) Math.pow((double) local51, local7);
				@Pc(173) int local173 = (int) (local47 * 256.0F);
				@Pc(178) int local178 = (int) (local49 * 256.0F);
				@Pc(183) int local183 = (int) (local51 * 256.0F);
				@Pc(195) int local195 = local183 + (local178 << 8) + -16777216 + (local173 << 16);
				Class424.anIntArray462[local9++] = local195;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "(Lclient!arc;B)V", line = 42)
	static final void method30280(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		arg0.method22187();
		@Pc(6) int local6 = client.anInt3389 * -643758853;
		@Pc(19) Class104_Sub1_Sub1_Sub1_Sub2 local19 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class104_Sub1_Sub1_Sub1_Sub2(client.aClass517_1.method30435());
		local19.anInt2867 = local6 * -2061161143;
		@Pc(29) int local29 = arg0.method22189(30);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class595 local48 = client.aClass517_1.method30409();
		local19.anIntArray274[0] = local40 - local48.anInt5504 * -424199969;
		local19.anIntArray275[0] = local44 - local48.anInt5506 * -1166289421;
		local19.method24106((float) ((local19.anIntArray274[0] << 9) + (local19.method21095() << 8)), local19.method24082().aClass447_61.aFloat276, (float) ((local19.anIntArray275[0] << 9) + (local19.method21095() << 8)));
		Class669.anInt5790 = (local19.aByte100 = local19.aByte99 = local34) * -2078297599;
		if (client.aClass517_1.method30441().method29665(local19.anIntArray274[0], local19.anIntArray275[0])) {
			local19.aByte99++;
		}
		if (Class152.aClass77_Sub39Array2[local6] != null) {
			local19.method21163(Class152.aClass77_Sub39Array2[local6]);
		}
		if (Class152.aClass77_Sub39Array1[local6] != null) {
			local19.method21166(Class152.aClass77_Sub39Array1[local6]);
		}
		Class152.anInt2399 = 0;
		Class152.anIntArray221[(Class152.anInt2399 += 76736439) * -1843550713 - 1] = local6;
		Class152.aByteArray37[local6] = 0;
		Class152.anInt2402 = 0;
		for (@Pc(175) int local175 = 1; local175 < 2048; local175++) {
			if (local6 != local175) {
				@Pc(187) int local187 = arg0.method22189(18);
				@Pc(193) int local193 = local187 >> 16 & 0x3;
				@Pc(199) int local199 = local187 >> 8 & 0xFF;
				@Pc(203) int local203 = local187 & 0xFF;
				@Pc(211) Class526 local211 = Class152.aClass526Array1[local175] = new Class526();
				local211.anInt5166 = (local203 + (local199 << 14) + (local193 << 28)) * 186312257;
				local211.anInt5164 = 0;
				local211.anInt5165 = -587751205;
				local211.aClass282_5 = Class282.aClass282_4;
				local211.aBoolean783 = false;
				Class152.anIntArray222[(Class152.anInt2402 += -989241915) * 918952205 - 1] = local175;
				Class152.aByteArray37[local175] = 0;
			}
		}
		arg0.method22192();
		@Pc(261) Class331 local261 = Class597.aClass107_Sub1_2.method8880();
		if (local261 == Class331.aClass331_4) {
			@Pc(269) Class115_Sub1 local269 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
			local269.method9836();
		}
		@Pc(276) Class321 local276 = Class597.aClass107_Sub1_2.method8879();
		if (Class321.aClass321_4 == local276) {
			@Pc(284) Class149_Sub4 local284 = (Class149_Sub4) Class597.aClass107_Sub1_2.method8873();
			local284.method16843();
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V", line = 90)
	public static void method30281() {
		@Pc(4) Class77_Sub16 local4;
		for (local4 = (Class77_Sub16) Class77_Sub16.aClass695_20.method36395(); local4 != null; local4 = (Class77_Sub16) Class77_Sub16.aClass695_20.method36406()) {
			if (local4.aBoolean328) {
				local4.method13438();
			}
		}
		for (local4 = (Class77_Sub16) Class77_Sub16.aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) Class77_Sub16.aClass695_21.method36406()) {
			if (local4.aBoolean328) {
				local4.method13438();
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "(Ljava/lang/String;ZZI)V", line = 343)
	public static void method30282(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
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
				Class157.anInt3240 = 0;
				Class157.anInt3247 = 0;
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
					if (aFileOutputStream1 != null) {
						aFileOutputStream1.close();
						aFileOutputStream1 = null;
					}
					try {
						aFileOutputStream1 = new FileOutputStream(local940);
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
					if (aFileOutputStream1 != null) {
						aFileOutputStream1.close();
					}
					aFileOutputStream1 = null;
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

	@OriginalMember(owner = "client!rh", name = "lh", descriptor = "(Lclient!yf;I)V", line = 6598)
	static final void method30283(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class545.method30967(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!rh", name = "ra", descriptor = "(Lclient!gm;Lclient!yf;I)V", line = 7734)
	static final void method30284(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(12) int local12 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
		@Pc(27) int local27 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307] - 1;
		@Pc(29) int local29 = local27;
		if (arg0.anInt3888 * -1866862435 != 6 && arg0.anInt3888 * -1866862435 != 2) {
			throw new RuntimeException("");
		}
		@Pc(55) Class333 local55 = (Class333) Class578.aClass35_Sub3_1.method18319(arg0.anInt3889 * 939166901);
		if (arg0.aClass328_2 == null) {
			arg0.aClass328_2 = new Class328(local55, arg0.anInt3888 * -1866862435 == 6);
		}
		arg0.aClass328_2.aLong257 = Class244.method26114() * 8855449811293583851L;
		if (local55.aByteArray77 != null) {
			if (local27 < 0 || local27 >= local55.aByteArray77.length) {
				throw new RuntimeException("");
			}
			local29 = local55.aByteArray77[local27];
		}
		if (local55.aShortArray117 == null || local29 < 0 || local29 >= local55.aShortArray117.length) {
			throw new RuntimeException("");
		}
		arg0.aClass328_2.aShortArray114[local29] = (short) local12;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "sc", descriptor = "(Lclient!yf;B)V", line = 7962)
	static final void method30285(@OriginalArg(0) Class665 arg0) {
		@Pc(14) Class277 local14 = Class155.method23628(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local14.anInt3936 * 403396513;
	}

	@OriginalMember(owner = "client!rh", name = "adu", descriptor = "(Lclient!yf;I)V", line = 9772)
	static final void method30286(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class601.method32040((char) local12) ? 1 : 0;
	}

	@OriginalMember(owner = "client!rh", name = "akb", descriptor = "(Lclient!yf;B)V", line = 11385)
	static final void method30287(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 == -1) {
			Class70.anInt203 = 1899572639;
			Class142.anInt2017 = 309821991;
			return;
		}
		@Pc(21) int local21 = local12 >> 14 & 0x3FFF;
		@Pc(25) int local25 = local12 & 0x3FFF;
		@Pc(29) Class595 local29 = client.aClass517_1.method30409();
		local21 -= local29.anInt5504 * -424199969;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 >= client.aClass517_1.method30411()) {
			local21 = client.aClass517_1.method30411();
		}
		local25 -= local29.anInt5506 * -1166289421;
		if (local25 < 0) {
			local25 = 0;
		} else if (local25 >= client.aClass517_1.method30417()) {
			local25 = client.aClass517_1.method30417();
		}
		Class70.anInt203 = ((local21 << 9) + 256) * -1899572639;
		Class142.anInt2017 = ((local25 << 9) + 256) * -309821991;
	}
}
