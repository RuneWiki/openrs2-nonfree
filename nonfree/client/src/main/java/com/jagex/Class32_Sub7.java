package com.jagex;

import java.awt.Canvas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoh")
public class Class32_Sub7 extends Class32 {

	@OriginalMember(owner = "client!aoh", name = "g", descriptor = "I")
	static int anInt2393;

	@OriginalMember(owner = "client!aoh", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;)V", line = 12)
	public Class32_Sub7(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2) {
		super(arg0, arg1, arg2, Class667.aClass667_40, 128, new Class52(Class39.class));
	}

	@OriginalMember(owner = "client!aoh", name = "x", descriptor = "(Lclient!afg;Ljava/awt/Canvas;III)Lclient!aph;", line = 18)
	static Class112_Sub2_Sub2 method16822(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class112_Sub2_Sub2_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aoh", name = "s", descriptor = "(Ljava/lang/String;ZZB)V", line = 343)
	public static void method16823(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(139) String local139;
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Class314.method26939("commands - This command");
				Class314.method26939("cls - Clear console");
				Class314.method26939("displayfps - Toggle FPS and other information");
				Class314.method26939("renderer - Print graphics renderer information");
				Class314.method26939("heap - Print java memory information");
				Class314.method26939("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Class168.anInt2442 = 0;
				Class168.anInt2446 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				client.aBoolean599 = !client.aBoolean599;
				if (client.aBoolean599) {
					Class314.method26939("FPS on");
				} else {
					Class314.method26939("FPS off");
				}
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(62) Class219 local62 = Class694.aClass104_14.method20571();
				Class314.method26939("Toolkit ID: " + Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424());
				Class314.method26939("Vendor: " + local62.anInt3623 * -348611355);
				Class314.method26939("Name: " + local62.aString151);
				Class314.method26939("Version: " + local62.anInt3625 * -140508595);
				Class314.method26939("Device: " + local62.aString150);
				Class314.method26939("Driver Version: " + local62.aLong247 * -2731861378298283411L);
				local139 = Class694.aClass104_14.method20431();
				if (local139.length() > 0) {
					Class314.method26939(local139);
				}
				return;
			}
			if (arg0.equals("heap")) {
				Class314.method26939("Heap: " + Class553.anInt3419 * 1798078423 + "MB");
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				@Pc(173) Class611 local173 = client.aClass532_1.method30443();
				if (Class429.anInt4781 * -1453926679 == 3) {
					@Pc(182) Class472 local182 = Class65.aClass123_Sub1_2.method8957();
					@Pc(186) Class472 local186 = Class65.aClass123_Sub1_2.method8954();
					Class314.method26939("Pos: " + (new Class611(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local182.aFloat317 >> 9, (int) local182.aFloat319 >> 9)).toString() + " Height: " + (Class305.method26801((int) local182.aFloat317 - (local173.anInt5623 * 270611681 << 9), (int) local182.aFloat319 - (local173.anInt5624 * -1994307635 << 9), Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) + (int) local182.aFloat318));
					Class314.method26939("Look: " + (new Class611(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local186.aFloat317 >> 9, (int) local186.aFloat319 >> 9)).toString() + " Height: " + (Class305.method26801((int) local186.aFloat317 - (local173.anInt5623 * 270611681 << 9), (int) local182.aFloat319 - (local173.anInt5624 * -1994307635 << 9), Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) + (int) local182.aFloat318));
				} else {
					Class314.method26939("Pos: " + Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + "," + ((Class163.anInt2002 * -1331168249 >> 9) + local173.anInt5623 * 270611681 >> 6) + "," + (local173.anInt5624 * -1994307635 + (Class270.anInt3884 * 466086187 >> 9) >> 6) + "," + ((Class163.anInt2002 * -1331168249 >> 9) + local173.anInt5623 * 270611681 & 0x3F) + "," + (local173.anInt5624 * -1994307635 + (Class270.anInt3884 * 466086187 >> 9) & 0x3F) + " Height: " + (Class305.method26801(Class163.anInt2002 * -1331168249, Class270.anInt3884 * 466086187, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) - Class130_Sub2.anInt1117 * 1055108289));
					Class314.method26939("Look: " + Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + "," + (Class545.anInt5289 * 904567799 + local173.anInt5623 * 270611681 >> 6) + "," + (Class349.anInt4201 * -1998384879 + local173.anInt5624 * -1994307635 >> 6) + "," + (Class545.anInt5289 * 904567799 + local173.anInt5623 * 270611681 & 0x3F) + "," + (local173.anInt5624 * -1994307635 + Class349.anInt4201 * -1998384879 & 0x3F) + " Height: " + (Class305.method26801(Class545.anInt5289 * 904567799, Class349.anInt4201 * -1998384879, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100) - Class290.anInt3911 * -1980774829));
				}
				return;
			}
		} catch (@Pc(470) Exception local470) {
			Class314.method26939(Class74.aClass74_116.method1259(Class106.aClass717_8));
			return;
		}
		if (Class280.aClass693_1 != Class693.aClass693_8 || client.anInt3514 * 2055688893 >= 2) {
			try {
				if (arg0.equalsIgnoreCase("wm1")) {
					Class717.method36895(1, -1, -1, false);
					if (Class255.method26008() == 1) {
						Class314.method26939("Success");
					} else {
						Class314.method26939("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Class717.method36895(2, -1, -1, false);
					if (Class255.method26008() == 2) {
						Class314.method26939("Success");
					} else {
						Class314.method26939("Failure");
					}
					return;
				}
				if (Class4.aBoolean2 && arg0.equalsIgnoreCase("wm3")) {
					Class717.method36895(3, 1024, 768, false);
					if (Class255.method26008() == 3) {
						Class314.method26939("Success");
					} else {
						Class314.method26939("Failure");
					}
					return;
				}
				@Pc(568) int local568;
				if (arg0.startsWith("setlobby ")) {
					if (client.anInt3435 * -849002901 != 4) {
						Class314.method26939("Failure");
						return;
					}
					local568 = -1;
					@Pc(574) String local574 = arg0.substring(9);
					@Pc(578) int local578 = local574.indexOf(32);
					if (local578 == -1) {
						Class314.method26939("Failure");
						return;
					}
					try {
						local568 = Integer.parseInt(local574.substring(0, local578));
					} catch (@Pc(593) NumberFormatException local593) {
					}
					if (local568 == -1) {
						Class314.method26939("Failure");
						return;
					}
					local139 = local574.substring(local578 + 1).trim() + ".runescape.com";
					Class237.method25778(local139, local568);
					Class314.method26939("Success");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Class543.method30948(0, false);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 0) {
						Class314.method26939("Success");
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0);
						Class106_Sub1.method5148();
						client.aBoolean601 = false;
					} else {
						Class314.method26939("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Class543.method30948(1, false);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 1) {
						Class314.method26939("Success");
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 1);
						Class106_Sub1.method5148();
						client.aBoolean601 = false;
					} else {
						Class314.method26939("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Class543.method30948(3, false);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 3) {
						Class314.method26939("Success");
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 3);
						Class106_Sub1.method5148();
						client.aBoolean601 = false;
					} else {
						Class314.method26939("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Class543.method30948(5, false);
					if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 5) {
						Class314.method26939("Success");
						Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 5);
						Class106_Sub1.method5148();
						client.aBoolean601 = false;
					} else {
						Class314.method26939("Failure");
					}
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					if (client.anInt3435 * -849002901 == 18) {
						Class565.method31254();
					} else if (client.anInt3435 * -849002901 == 3) {
						client.aClass175_2.aBoolean564 = true;
					}
					return;
				}
				@Pc(778) int local778;
				if (arg0.equalsIgnoreCase("breakcon")) {
					@Pc(776) Class175[] local776 = client.aClass175Array1;
					for (local778 = 0; local778 < local776.length; local778++) {
						@Pc(786) Class175 local786 = local776[local778];
						if (local786.method24356() != null) {
							local786.method24356().method14714();
						}
					}
					Class520.aClass144_3.method11169();
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local568 = Integer.parseInt(arg0.substring(17));
					Class314.method26939("varpbit=" + Class624.aClass120_1.method33454(Class624.aClass120_1.method27953(local568)));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local568 = Integer.parseInt(arg0.substring(14));
					Class314.method26939("varp=" + Class624.aClass120_1.method33455(Class624.aClass120_1.method27954(Class138.aClass138_65, local568)));
					return;
				}
				@Pc(865) String[] local865;
				if (arg0.startsWith("directlogin")) {
					local865 = client.method25402(arg0.substring(12), ' ');
					if (local865.length == 2 || local865.length == 3) {
						if (Class251.method25973()) {
							Class3.method23();
						}
						Class114.method7634(local865[0], local865[1], local865.length > 2 ? local865[2] : "", true);
					}
					return;
				}
				if (arg0.startsWith("snlogin ")) {
					local865 = client.method25402(arg0.substring(8), ' ');
					local778 = Integer.parseInt(local865[0]);
					@Pc(923) String local923 = local865.length > 1 ? local865[1] : "";
					Class225.method25604(local778, local923, true);
					return;
				}
				@Pc(940) File local940;
				if (arg0.startsWith("setoutput ")) {
					local940 = new File(arg0.substring(10));
					if (local940.exists()) {
						local940 = new File(arg0.substring(10) + "." + Class305.method26796() + ".log");
						if (local940.exists()) {
							Class314.method26939("file already exists!");
							return;
						}
					}
					if (Class168.aFileOutputStream1 != null) {
						Class168.aFileOutputStream1.close();
						Class168.aFileOutputStream1 = null;
					}
					try {
						Class168.aFileOutputStream1 = new FileOutputStream(local940);
						return;
					} catch (@Pc(983) FileNotFoundException local983) {
						Class314.method26939("Could not create " + local940.getName());
						return;
					} catch (@Pc(996) SecurityException local996) {
						Class314.method26939("Cannot write to " + local940.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Class168.aFileOutputStream1 != null) {
						Class168.aFileOutputStream1.close();
					}
					Class168.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local940 = new File(arg0.substring(10));
					if (!local940.exists()) {
						Class314.method26939("No such file");
						return;
					}
					@Pc(1043) byte[] local1043 = Class300.method26720(local940);
					if (local1043 == null) {
						Class314.method26939("Failed to read file");
						return;
					}
					@Pc(1061) String[] local1061 = client.method25402(Class93_Sub13.method13491(Class114.method7636(local1043), '\r', ""), '\n');
					Class96_Sub3.method2331(local1061);
				}
				if (client.anInt3435 * -849002901 == 18 || client.anInt3435 * -849002901 == 13) {
					@Pc(1077) Class175 local1077 = Class330.method27372();
					@Pc(1083) Class93_Sub22 local1083 = Class102.method2592(Class446.aClass446_86, local1077.aClass24_2);
					local1083.aClass93_Sub41_Sub2_1.method22510(arg0.length() + 3);
					local1083.aClass93_Sub41_Sub2_1.method22510(arg1 ? 1 : 0);
					local1083.aClass93_Sub41_Sub2_1.method22510(arg2 ? 1 : 0);
					local1083.aClass93_Sub41_Sub2_1.method22402(arg0);
					local1077.method24351(local1083);
				}
			} catch (@Pc(1120) Exception local1120) {
				Class314.method26939(Class74.aClass74_116.method1259(Class106.aClass717_8));
				return;
			}
		}
		if (client.anInt3435 * -849002901 != 18 && client.anInt3435 * -849002901 != 13) {
			Class314.method26939(Class74.aClass74_4.method1259(Class106.aClass717_8) + arg0);
		}
	}

	@OriginalMember(owner = "client!aoh", name = "axg", descriptor = "(Lclient!yf;I)V", line = 13941)
	static final void method16824(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class322 local18 = (Class322) Class542.aClass32_Sub2_3.method18261(local12);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local18.anInt4116 * 1579741579;
	}
}
