package app;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/appletviewer")
public final class appletviewer implements ComponentListener, AdjustmentListener {

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "Ljava/awt/Component;")
	private static Component aComponent1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "b", descriptor = "Ljava/applet/Applet;")
	private static Applet anApplet1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "c", descriptor = "Ljagexappletviewer!app/o;")
	private static Canvas_Sub2 aCanvas_Sub2_1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "d", descriptor = "Ljava/awt/Frame;")
	static Frame aFrame1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "e", descriptor = "Ljagexappletviewer!app/c;")
	private static Canvas_Sub1 aCanvas_Sub1_1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "f", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "g", descriptor = "Ljava/awt/Canvas;")
	private static Canvas aCanvas1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "h", descriptor = "Z")
	private static boolean aBoolean1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "i", descriptor = "Ljagexappletviewer!app/a;")
	private static Class2 aClass2_1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "j", descriptor = "Z")
	static boolean aBoolean2;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "k", descriptor = "Ljava/awt/Panel;")
	private static Panel aPanel1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "l", descriptor = "Ljagexappletviewer!app/a;")
	private static Class2 aClass2_2;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "m", descriptor = "[I")
	static int[] anIntArray1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "n", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "o", descriptor = "Ljava/util/Hashtable;")
	static Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "p", descriptor = "F")
	private static float aFloat1 = 58988.0F;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "q", descriptor = "Ljava/io/File;")
	private static File aFile1 = null;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "r", descriptor = "Ljagexappletviewer!app/s;")
	private static Class17 aClass17_1 = null;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "s", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray1;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "t", descriptor = "[Ljagexappletviewer!app/s;")
	private static Class17[] aClass17Array1 = null;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "u", descriptor = "[I")
	private static int[] anIntArray2;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "v", descriptor = "Z")
	private static boolean aBoolean3 = true;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "w", descriptor = "Z")
	private static volatile boolean aBoolean4 = false;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "x", descriptor = "F")
	private static float aFloat2 = 0.0F;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "y", descriptor = "Ljava/lang/String;")
	private static String aString1 = null;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "B", descriptor = "I")
	public static int anInt2;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "C", descriptor = "I")
	public static int anInt3;

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(Ljagexappletviewer!app/s;B)V")
	private static final void method5(@OriginalArg(0) Class17 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return;
		}
		Component_Sub2.method48(true, method11(117, "loading_app"));
		Component_Sub2.method47(0, false);
		Component_Sub2.method46(arg1 ^ 0x5A);
		Component_Sub2.method49(arg1 ^ 0xFFFFD703);
		if (anApplet1 != null) {
			if (aComponent1.isVisible()) {
				aComponent1.setVisible(false);
				method14(-127);
			}
			anApplet1.stop();
			Component_Sub2.method47(25, false);
			Component_Sub2.method49(10432);
			anApplet1.destroy();
			aPanel1.remove(anApplet1);
			anApplet1 = null;
			aPanel1.remove(aComponent1);
		}
		aClass17_1 = arg0;
		Component_Sub2.method47(50, false);
		Component_Sub2.method49(10432);
		method17(arg1 - 36);
		if (arg1 != -61) {
			return;
		}
		aPanel1.add(anApplet1);
		aComponent1 = new Component_Sub1(method11(arg1 ^ 0xFFFFFF9B, "tandc"));
		aPanel1.add(aComponent1);
		aBoolean3 = true;
		method14(-126);
		anApplet1.setStub(new Class8());
		anApplet1.init();
		anApplet1.start();
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "componentResized", descriptor = "(Ljava/awt/event/ComponentEvent;)V")
	public final void componentResized(@OriginalArg(0) ComponentEvent arg0) {
		method14(-127);
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "componentShown", descriptor = "(Ljava/awt/event/ComponentEvent;)V")
	public final void componentShown(@OriginalArg(0) ComponentEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(ILjava/io/File;ZLjava/lang/String;Z)Z")
	private static final boolean method6(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4) {
		Class6.method26(arg0, (byte) -99);
		@Pc(6) int local6 = 0;
		@Pc(10) Hashtable local10 = new Hashtable();
		@Pc(14) Hashtable local14 = new Hashtable();
		if (arg4) {
			aClass17Array1 = null;
		}
		@Pc(26) Hashtable local26 = new Hashtable(aHashtable4);
		@Pc(28) Object local28 = null;
		@Pc(30) Class17 local30 = null;
		@Pc(32) int local32 = 0;
		@Pc(35) Class17[] local35 = new Class17[50];
		@Pc(142) int local142;
		try {
			@Pc(40) BufferedReader local40 = method13(arg1, (byte) 94, arg3);
			@Pc(42) Hashtable local42 = local10;
			@Pc(44) Hashtable local44 = local14;
			@Pc(46) Hashtable local46 = local26;
			label203: while (true) {
				@Pc(49) String local49 = local40.readLine();
				if (local49 == null) {
					local40.close();
					break;
				}
				local49 = local49.trim();
				if (!local49.startsWith("//") && !local49.startsWith("#")) {
					if (local49.startsWith("[")) {
						@Pc(78) String local78 = local49.substring(1, local49.lastIndexOf(93));
						@Pc(83) Class17 local83 = new Class17(local78);
						if (local35.length <= local32) {
							@Pc(96) Class17[] local96 = new Class17[local32 + 10];
							System.arraycopy(local35, 0, local96, 0, local35.length);
							local35 = local96;
						}
						if (local30 == null) {
							local30 = local83;
						}
						local35[local32++] = local83;
						local44 = local83.aHashtable9;
						local46 = local83.aHashtable11;
						local42 = local83.aHashtable10;
					}
					@Pc(154) String local154;
					@Pc(274) String local274;
					if (local49.startsWith("param=")) {
						local49 = local49.substring(6);
						local142 = local49.indexOf(61);
						if (local142 != -1) {
							local154 = local49.substring(0, local142).trim();
							local274 = local49.substring(local142 + 1).trim();
							local42.put(local154, local274);
						}
					} else if (local49.startsWith("msg=")) {
						local49 = local49.substring(4);
						local142 = local49.indexOf(61);
						if (local142 != -1) {
							local154 = local49.substring(0, local142).trim().toLowerCase();
							@Pc(164) StringBuffer local164 = new StringBuffer(local49.substring(local142 + 1).trim());
							@Pc(166) int local166 = 0;
							while (true) {
								while (true) {
									@Pc(171) int local171 = local164.indexOf("\\\\", local166);
									@Pc(176) int local176 = local164.indexOf("\\n", local166);
									if (local171 < 0 && local176 < 0) {
										if (local154.startsWith("lang")) {
											try {
												local6++;
												Integer.parseInt(local154.substring(4));
											} catch (@Pc(243) NumberFormatException local243) {
											}
										}
										local46.put(local154, local164.toString());
										continue label203;
									}
									if (local171 >= 0 && (local176 < 0 || local176 >= local171)) {
										local166 = local171 + 1;
										local164.replace(local171, local171 + 2, "\\");
									} else {
										local166 = local176 + 1;
										local164.replace(local176, local176 + 2, "\n");
									}
								}
							}
						}
					} else {
						local142 = local49.indexOf(61);
						if (local142 != -1) {
							local154 = local49.substring(0, local142).trim().toLowerCase();
							local274 = local49.substring(local142 + 1).trim();
							local44.put(local154, local274);
						}
					}
				}
			}
		} catch (@Pc(318) IOException local318) {
			if (arg2) {
				Class16.method41(method11(113, "err_load_config"), (byte) -118);
			} else {
				Class16.method40(method11(81, "err_load_config"), -124);
			}
			return false;
		} catch (@Pc(339) Exception local339) {
			if (arg2) {
				Class16.method41(method11(127, "err_decode_config"), (byte) -124);
			} else {
				Class16.method40(method11(115, "err_decode_config"), -109);
			}
			return false;
		}
		aClass17Array1 = (Class17[]) local28;
		aClass17_1 = local30;
		aHashtable3.clear();
		aHashtable3.putAll(local10);
		aHashtable2.clear();
		aHashtable2.putAll(local14);
		aHashtable4.clear();
		aHashtable4.putAll(local26);
		if (local32 > 0 || !arg2 && aClass2_1 != null) {
			aClass17Array1 = new Class17[local32];
			System.arraycopy(local35, 0, aClass17Array1, 0, local32);
			aClass2_1 = new Class2(method11(96, "switchserver"));
		}
		if (local6 <= 0) {
			return true;
		}
		anIntArray2 = new int[local6];
		aStringArray1 = new String[local6];
		@Pc(423) int local423 = 0;
		@Pc(426) Enumeration local426 = local26.keys();
		while (true) {
			@Pc(433) String var30;
			@Pc(446) int var32;
			while (true) {
				do {
					if (!local426.hasMoreElements()) {
						if (local6 > 1 || !arg2 && aClass2_2 != null) {
							aClass2_2 = new Class2(method11(113, "language"));
							aClass2_2.method2(0, aStringArray1);
						}
						if (Class14.method33(92, "Language") == null) {
							return method8(-1) < 0;
						}
						return true;
					}
					var30 = (String) local426.nextElement();
				} while (!var30.startsWith("lang"));
				@Pc(441) boolean local441 = false;
				try {
					var32 = Integer.parseInt(var30.substring(4));
					break;
				} catch (@Pc(448) NumberFormatException local448) {
				}
			}
			for (@Pc(452) int local452 = 0; local452 <= local423; local452++) {
				if (local452 == local423 || anIntArray2[local452] > var32) {
					for (local142 = local423; local142 > local452; local142--) {
						aStringArray1[local142] = aStringArray1[local142 - 1];
						anIntArray2[local142] = anIntArray2[local142 - 1];
					}
					anIntArray2[local452] = var32;
					aStringArray1[local452] = method11(94, var30);
					break;
				}
			}
			local423++;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "componentHidden", descriptor = "(Ljava/awt/event/ComponentEvent;)V")
	public final void componentHidden(@OriginalArg(0) ComponentEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(I)V")
	public static final void method7(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			aFile1 = null;
		}
		@Pc(8) boolean local8 = false;
		if (!aCanvas_Sub2_1.isVisible()) {
			aCanvas_Sub2_1.setVisible(true);
			local8 = true;
		}
		if (!aComponent1.isVisible()) {
			aComponent1.setVisible(true);
			local8 = true;
		}
		if (local8) {
			method14(-126);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "b", descriptor = "(I)I")
	static final int method8(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = aClass2_2 == null ? -1 : aClass2_2.method4((byte) -78);
		if (~local9 <= arg0) {
			Class14.method34("Language", 23853, Integer.toString(anIntArray2[local9]));
			Class14.method35(0);
			return local9;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(B)V")
	static final void method9(@OriginalArg(0) byte arg0) {
		@Pc(5) String local5 = method15("serverlist", -21747);
		@Pc(7) Class17[] local7 = aClass17Array1;
		@Pc(10) int local10 = aClass17Array1.length;
		if (local5 != null) {
			local10 = 0;
			local7 = new Class17[aClass17Array1.length];
			try {
				@Pc(24) BufferedReader local24 = method13(null, (byte) -114, local5);
				label62: while (true) {
					@Pc(42) String[] local42;
					do {
						do {
							@Pc(27) String local27;
							do {
								local27 = local24.readLine();
								if (local27 == null) {
									local24.close();
									break label62;
								}
								local27 = local27.trim();
							} while (local27.startsWith("//"));
							local42 = local27.split(",");
						} while (local42.length < 2);
					} while (!local42[1].trim().toLowerCase().equals("true"));
					@Pc(65) String local65 = local42[0].trim();
					for (@Pc(67) int local67 = 0; local67 < aClass17Array1.length; local67++) {
						if (aClass17Array1[local67].aString7.equals(local65)) {
							local7[local10++] = aClass17Array1[local67];
						}
					}
				}
			} catch (@Pc(96) IOException local96) {
				local7 = aClass17Array1;
				local10 = aClass17Array1.length;
			}
		}
		@Pc(104) String[] local104 = new String[local10];
		@Pc(112) int local112 = -18 % ((arg0 - 18) / 52);
		@Pc(114) int local114;
		for (local114 = 0; local114 < local10; local114++) {
			local104[local114] = (String) local7[local114].aHashtable9.get("servername");
		}
		aClass2_1.method2(0, local104);
		local114 = aClass2_1.method4((byte) -104);
		if (local114 >= 0) {
			method5(local7[local114], (byte) -61);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static final void method10(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		aBoolean4 = false;
		try {
			System.setProperty("https.protocols", "SSLv3");
		} catch (@Pc(9) SecurityException local9) {
		}
		Class14.method32(-6979);
		@Pc(17) String local17 = Class14.method33(arg0 ^ 0x228F, "Language");
		@Pc(19) int local19 = 0;
		@Pc(35) String local35;
		if (local17 == null) {
			@Pc(29) Locale local29 = Locale.getDefault();
			@Pc(32) String local32 = local29.getISO3Language();
			local35 = local29.getISO3Country();
			@Pc(37) byte local37 = -1;
			if (local32 != null) {
				if (local32.equals("eng")) {
					local37 = 0;
				}
				if (local32.equals("ger") || local32.equals("deu")) {
					local37 = 1;
				}
				if (local32.equals("fre") || local32.equals("fra")) {
					local37 = 2;
				}
				if (local32.equals("por")) {
					local37 = 3;
				}
			} else if (local35 != null) {
				if (local35.equals("GB") || local35.equals("US")) {
					local37 = 0;
				}
				if (local35.equals("DE")) {
					local37 = 1;
				}
				if (local35.equals("FR")) {
					local37 = 2;
				}
				if (local35.equals("BR")) {
					local37 = 3;
				}
			}
			if (local37 >= 0) {
				Class14.method34("Language", 23853, Integer.toString(local37));
				Class14.method35(0);
			}
		} else {
			local19 = Integer.parseInt(local17);
		}
		Class6.method26(local19, (byte) -88);
		aFrame1 = new Frame();
		aFrame1.getToolkit().setDynamicLayout(true);
		aFrame1.setBackground(Color.BLACK);
		@Pc(160) File local160 = new File((new File(System.getProperty("user.dir"))).getParentFile(), arg1);
		@Pc(166) File local166 = new File(local160, "jagexappletviewer.png");
		System.out.println("Trying to load icon file: " + local166.getAbsolutePath());
		if (local166.exists()) {
			@Pc(185) Image local185 = Toolkit.getDefaultToolkit().getImage(local166.getAbsolutePath());
			if (local185 != null) {
				aFrame1.setIconImage(local185);
			}
		}
		System.out.println("Loader init");
		Component_Sub2.method45((byte) 109);
		System.out.println("Loader show");
		Component_Sub2.method46(-25);
		System.out.println("Loader set message");
		Component_Sub2.method48(true, method11(109, "loading_config"));
		local35 = System.getProperty("com.jagex.config");
		System.out.println("Config url:" + local35);
		@Pc(226) String local226 = System.getProperty("com.jagex.configfile");
		if (local35 == null) {
			if (local226 == null) {
				Class16.method41(method11(109, "err_missing_config"), (byte) -66);
			}
			aFile1 = new File(local226);
		}
		while (true) {
			if (local35 != null) {
				aString1 = method12(local35, -1);
				System.out.println("Config URL is " + aString1);
			}
			if (method19(local19, 61)) {
				@Pc(283) String local283 = System.getProperty("os.name").toLowerCase();
				@Pc(287) String local287 = System.getProperty("os.arch").toLowerCase();
				aBoolean2 = local283.startsWith("win");
				aBoolean1 = aBoolean2 && (local287.startsWith("amd64") || local287.startsWith("x86_64"));
				@Pc(314) String local314 = method15("viewerversion", -21747);
				if (local314 != null) {
					try {
						@Pc(321) int local321 = Integer.parseInt(local314);
						if (local321 > 124) {
							Class16.method39(method11(100, "new_version"), method11(109, "new_version_link"), method11(127, "new_version_linktext"), (byte) 125);
						} else if (local321 == 124) {
							if (aBoolean2) {
								if (Integer.parseInt(method15("win_sub_version", arg0 - 30612)) > 2) {
									Class16.method39(method11(arg0 - 8757, "new_version"), method11(arg0 - 8746, "new_version_link"), method11(94, "new_version_linktext"), (byte) 126);
								}
							} else if (local287.startsWith("mac")) {
								if (Integer.parseInt(method15("mac_sub_version", -21747)) > 2) {
									Class16.method39(method11(95, "new_version"), method11(arg0 ^ 0x22F0, "new_version_link"), method11(111, "new_version_linktext"), (byte) -35);
								}
							} else if (Integer.parseInt(method15("other_sub_version", -21747)) > 2) {
								Class16.method39(method11(83, "new_version"), method11(109, "new_version_link"), method11(99, "new_version_linktext"), (byte) 126);
							}
						}
					} catch (@Pc(439) NumberFormatException local439) {
					}
				}
				@Pc(443) String local443 = method15("storebase", -21747);
				if (local443 == null) {
					local443 = method21("modewhat", (byte) 98);
				}
				@Pc(455) int local455 = Integer.parseInt(local443) + 32;
				@Pc(459) String local459 = method15("cachesubdir", -21747);
				@Pc(463) String local463 = method15("codebase", -21747);
				@Pc(465) String local465 = null;
				try {
					local465 = System.getProperty("user.home");
					if (local465 != null) {
						local465 = local465 + "/";
					}
				} catch (@Pc(484) Exception local484) {
				}
				if (local465 == null) {
					local465 = "~/";
				}
				Component_Sub2.method48(true, method11(arg0 - 8744, "loading_app_resources"));
				@Pc(499) String local499 = method15("download", -21747);
				if (local499 != null) {
					aFloat1 = Integer.parseInt(local499);
				}
				@Pc(509) File local509 = null;
				try {
					@Pc(520) byte[] local520;
					@Pc(537) byte[] local537;
					if (aBoolean1) {
						local520 = method23(false, local463, -30819, method15("browsercontrol_win_amd64_jar", -21747)).aByteArray2;
						local509 = method18(local455, "browsercontrol64.dll", local465, -10002, local459);
						local537 = (new Class12(local520)).method31(arg0 - 8960, "browsercontrol64.dll");
						if (local537 == null) {
							Class16.method41(method11(120, "err_verify_bc64"), (byte) -46);
							local509 = null;
						}
						method20(local537, arg0 - 8947, local509);
					} else if (aBoolean2) {
						local520 = method23(false, local463, -30819, method15("browsercontrol_win_x86_jar", arg0 ^ -30292)).aByteArray2;
						local509 = method18(local455, "browsercontrol.dll", local465, -10002, local459);
						local537 = (new Class12(local520)).method31(-118, "browsercontrol.dll");
						if (local537 == null) {
							Class16.method41(method11(98, "err_verify_bc"), (byte) -119);
							local509 = null;
						}
						method20(local537, -87, local509);
					}
				} catch (@Pc(600) Exception local600) {
					Class16.method41(method11(80, "err_load_bc"), (byte) -40);
				}
				method17(118);
				Class15.method36(arg0 ^ 0x22FC);
				aFrame1.setTitle(method15("title", arg0 - 30612));
				@Pc(628) int local628 = aBoolean2 ? Integer.parseInt(method15("advert_height", -21747)) : 0;
				@Pc(633) int local633 = Integer.parseInt(method15("window_preferredwidth", -21747));
				@Pc(638) int local638 = Integer.parseInt(method15("window_preferredheight", -21747));
				@Pc(643) int local643 = Integer.parseInt(method15("applet_minwidth", -21747));
				@Pc(648) int local648 = Integer.parseInt(method15("applet_minheight", -21747));
				@Pc(650) byte local650 = 40;
				aFrame1.setVisible(true);
				aFrame1.createBufferStrategy(2);
				@Pc(659) Insets local659 = aFrame1.getInsets();
				@Pc(669) int local669 = local633 + local659.left + local659.right + 15;
				@Pc(681) int local681 = local659.bottom + local638 + local628 + local659.top + local650;
				@Pc(685) Rectangle local685 = aFrame1.getGraphicsConfiguration().getBounds();
				@Pc(690) int local690 = local685.width - 50;
				if (local690 < local669) {
					local669 = local643 + local659.left + local659.right + 15;
				}
				@Pc(708) int local708 = local685.height - 50;
				if (local708 < local681) {
					local681 = local659.bottom + local650 + local628 + local659.top + local648;
				}
				@Pc(728) boolean local728 = false;
				if (local690 < local669) {
					local728 = true;
					local669 = local690;
				}
				if (local681 > local708) {
					local681 = local708;
					local728 = true;
				}
				aFrame1.setSize(local669, local681);
				aFrame1.setLocationRelativeTo(null);
				if (local728) {
					aFrame1.setExtendedState(6);
				}
				if (arg0 != 8865) {
					method9((byte) -73);
				}
				aPanel1 = new Panel_Sub2();
				aPanel1.setBackground(Color.black);
				aPanel1.setLayout(null);
				aFrame1.setLayout(new BorderLayout());
				@Pc(790) appletviewer local790 = new appletviewer();
				aFrame1.add(aPanel1, "Center");
				aPanel1.addComponentListener(local790);
				aCanvas_Sub1_1 = new Canvas_Sub1();
				aCanvas_Sub1_1.addAdjustmentListener(local790);
				@Pc(810) boolean local810 = "no".equals(Class14.method33(81, "Member"));
				if (aBoolean2 && local810) {
					aCanvas1 = new Canvas();
					aPanel1.add(aCanvas1);
				}
				aPanel1.add(anApplet1);
				@Pc(845) boolean local845 = aStringArray1 != null && aStringArray1.length > 1;
				@Pc(858) boolean local858 = aClass17Array1 != null && aClass17Array1.length > 1;
				anIntArray1 = new int[2];
				@Pc(863) int local863 = 0;
				if (local845) {
					anIntArray1[local863++] = 0;
				}
				if (local858) {
					anIntArray1[local863++] = 1;
				}
				aCanvas_Sub2_1 = new Canvas_Sub2(new Class11());
				aCanvas_Sub2_1.setBackground(Color.BLACK);
				aCanvas_Sub2_1.setForeground(Color.GRAY);
				if (local845) {
					aCanvas_Sub2_1.method37((byte) 109, method11(arg0 ^ 0x22C0, "language"));
				}
				if (local858) {
					aCanvas_Sub2_1.method37((byte) 109, method11(100, "switchserver"));
				}
				aCanvas_Sub2_1.setFont(new Font("SansSerif", 0, 10));
				aPanel1.add(aCanvas_Sub2_1);
				aComponent1 = new Component_Sub1(method11(84, "tandc"));
				aPanel1.add(aComponent1);
				aBoolean4 = true;
				aFrame1.doLayout();
				method14(-126);
				if (aBoolean2) {
					try {
						System.load(local509.toString());
					} catch (@Pc(954) Throwable local954) {
						Class16.method41(method11(104, "err_create_advertising"), (byte) -128);
						return;
					}
				}
				if (aBoolean2 && local810) {
					while (true) {
						if (aCanvas1.isDisplayable() && aCanvas1.isShowing()) {
							try {
								browsercontrol.create(aCanvas1, method15("adverturl", arg0 ^ 0xFFFF89AC));
								browsercontrol.resize(aCanvas1.getSize().width, aCanvas1.getSize().height);
								break;
							} catch (@Pc(999) Throwable local999) {
								Class16.method41(method11(arg0 ^ 0x22D6, "err_create_advertising"), (byte) -40);
								return;
							}
						}
						try {
							Thread.sleep(100L);
						} catch (@Pc(980) Exception local980) {
						}
					}
				}
				aFrame1.addWindowListener(WindowAdapter_Sub2.method27((byte) -42));
				anApplet1.setStub(new Class8());
				anApplet1.init();
				anApplet1.start();
				return;
			}
			local19 = 0;
			local17 = Class14.method33(-116, "Language");
			if (local17 != null) {
				local19 = Integer.parseInt(local17);
			}
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static final String method11(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (aClass17_1 != null) {
			@Pc(10) String local10 = (String) aClass17_1.aHashtable11.get(arg1);
			if (local10 != null) {
				return local10;
			}
		}
		if (arg0 <= 78) {
			aHashtable3 = null;
		}
		return (String) aHashtable4.get(arg1);
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	private static final String method12(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -1) {
			return (String) null;
		}
		@Pc(10) String local10 = arg0;
		while (true) {
			@Pc(14) int local14 = local10.indexOf("$(");
			if (local14 < 0) {
				break;
			}
			@Pc(24) int local24 = local10.indexOf(":", local14);
			@Pc(29) int local29 = local10.indexOf(")", local24);
			if (local24 < 0 || local29 < 0) {
				break;
			}
			@Pc(46) String local46 = local10.substring(local14 + 2, local24);
			@Pc(53) String local53 = local10.substring(local24 + 1, local29);
			@Pc(57) String local57 = Class14.method33(52, local46);
			if (local57 != null) {
				local53 = local57;
			}
			if (local10.length() - 1 > local29) {
				local10 = local10.substring(0, local14) + local53 + local10.substring(local29 + 1);
			} else {
				local10 = local10.substring(0, local14) + local53;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(Ljava/io/File;BLjava/lang/String;)Ljava/io/BufferedReader;")
	private static final BufferedReader method13(@OriginalArg(0) File arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) throws IOException {
		if (arg2 == null) {
			@Pc(24) int local24 = -116 % ((arg1 + 70) / 40);
			return arg0 == null ? null : new BufferedReader(new FileReader(arg0));
		} else {
			return new BufferedReader(new InputStreamReader((new URL(arg2)).openStream(), "CP1252"));
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "componentMoved", descriptor = "(Ljava/awt/event/ComponentEvent;)V")
	public final void componentMoved(@OriginalArg(0) ComponentEvent arg0) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "c", descriptor = "(I)V")
	private static final void method14(@OriginalArg(0) int arg0) {
		if (!aBoolean4) {
			return;
		}
		@Pc(11) int local11 = aCanvas_Sub2_1.isVisible() ? 20 : 0;
		@Pc(21) int local21 = aCanvas1 == null ? 0 : Integer.parseInt(method15("advert_height", -21747));
		@Pc(29) int local29 = aComponent1.isVisible() ? 40 : 0;
		@Pc(34) int local34 = Integer.parseInt(method15("applet_minwidth", -21747));
		@Pc(39) int local39 = Integer.parseInt(method15("applet_minheight", -21747));
		@Pc(44) int local44 = Integer.parseInt(method15("applet_maxwidth", -21747));
		if (arg0 > -125) {
			readdadvert();
		}
		@Pc(55) int local55 = Integer.parseInt(method15("applet_maxheight", -21747));
		@Pc(58) Dimension local58 = aPanel1.getSize();
		@Pc(61) Insets local61 = aPanel1.getInsets();
		@Pc(71) int local71 = local58.width - local61.right - local61.left;
		@Pc(82) int local82 = local58.height - local61.bottom - local61.top;
		@Pc(84) int local84 = local71;
		@Pc(93) int local93 = local82 - local29 - local21 - local11;
		if (local71 < local34) {
			local84 = local34;
		}
		@Pc(102) boolean local102 = false;
		if (local93 < local39) {
			local102 = true;
			local93 = local39;
		}
		if (local102) {
			if (aCanvas_Sub1_1.getParent() == null) {
				aFrame1.add(aCanvas_Sub1_1, "East");
				aCanvas_Sub1_1.setValue(0);
				aFrame1.validate();
			}
		} else if (aCanvas_Sub1_1.getParent() != null) {
			aFrame1.remove(aCanvas_Sub1_1);
			aFrame1.validate();
		}
		if (aBoolean3) {
			if (local44 < local84) {
				local84 = local44;
			}
			if (local55 < local93) {
				local93 = local55;
			}
		}
		@Pc(173) int local173 = local71;
		if (local71 < local34) {
			local173 = local34;
		}
		if (local11 + local39 + local21 + local29 > local82) {
			@Pc(197) int local197 = local11 + local39 + local21 + local29;
		}
		@Pc(200) int local200 = 0;
		if (aCanvas_Sub1_1.getParent() != null) {
			local200 = aCanvas_Sub1_1.getValue();
			@Pc(215) int local215 = local93 + local21 + local11 + local29;
			if (local215 < local82 + local200) {
				local200 = local215 - local82;
				if (local200 < 0) {
					local200 = 0;
				}
				aCanvas_Sub1_1.setValue(local200);
			}
			aCanvas_Sub1_1.setMaximum(local215);
			aCanvas_Sub1_1.setVisibleAmount(local82);
		}
		aCanvas_Sub2_1.setBounds((local173 - local84) / 2, -local200, local84, local11);
		if (aCanvas1 != null) {
			aCanvas1.setBounds((local173 - local84) / 2, local11 - local200, local84, local21);
		}
		anApplet1.setBounds((local173 - local84) / 2, local21 + local11 - local200, local84, local93);
		aComponent1.setBounds((local173 - local84) / 2, local93 + local21 + local11 - local200, local84, local29);
		if (aCanvas1 != null && browsercontrol.iscreated()) {
			browsercontrol.resize(aCanvas1.getSize().width, aCanvas1.getSize().height);
		}
		aFrame1.repaint();
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "adjustmentValueChanged", descriptor = "(Ljava/awt/event/AdjustmentEvent;)V")
	public final void adjustmentValueChanged(@OriginalArg(0) AdjustmentEvent arg0) {
		if (arg0.getValueIsAdjusting()) {
			method14(-126);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "removeadvert", descriptor = "()V")
	public static void removeadvert() {
		if (aCanvas1 == null) {
			return;
		}
		if (browsercontrol.iscreated()) {
			browsercontrol.destroy();
		}
		aPanel1.remove(aCanvas1);
		aCanvas1 = null;
		method14(-128);
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	static final String method15(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -21747) {
			return (String) null;
		}
		if (aClass17_1 != null) {
			@Pc(14) String local14 = (String) aClass17_1.aHashtable9.get(arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return (String) aHashtable2.get(arg0);
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "d", descriptor = "(I)V")
	public static final void method16(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = false;
		if (arg0 != 15028) {
			return;
		}
		if (aClass17Array1 == null && aCanvas_Sub2_1.isVisible()) {
			aCanvas_Sub2_1.setVisible(false);
			local1 = true;
		}
		if (aComponent1.isVisible()) {
			aComponent1.setVisible(false);
			local1 = true;
		}
		if (local1) {
			method14(-128);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "readdadvert", descriptor = "()V")
	public static void readdadvert() {
		if (!aBoolean2 || aCanvas1 != null) {
			return;
		}
		aCanvas1 = new Canvas();
		aPanel1.add(aCanvas1);
		method14(-126);
		while (!aCanvas1.isDisplayable() || !aCanvas1.isShowing()) {
			try {
				Thread.sleep(100L);
			} catch (@Pc(30) Exception local30) {
			}
		}
		try {
			browsercontrol.create(aCanvas1, method15("adverturl", -21747));
			browsercontrol.resize(aCanvas1.getSize().width, aCanvas1.getSize().height);
		} catch (@Pc(46) Throwable local46) {
			Class16.method41(method11(81, "err_create_advertising"), (byte) -76);
			return;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "doresize", descriptor = "(I)V")
	public static void doresize(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (!aBoolean3) {
				aBoolean3 = true;
				method14(-126);
			}
		} else if (arg0 == 1 && aBoolean3) {
			aBoolean3 = false;
			method14(-128);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "e", descriptor = "(I)V")
	private static final void method17(@OriginalArg(0) int arg0) {
		Component_Sub2.method48(true, method11(97, "loading_app"));
		ClassLoader_Sub2.method42(-22510);
		try {
			@Pc(10) String local10 = method15("initial_jar", -21747);
			if (local10 == null) {
				local10 = method15("loader_jar", -21747);
			}
			@Pc(24) Class18 local24 = method23(true, method15("codebase", -21747), -30819, local10);
			@Pc(32) int local32 = 51 / ((arg0 + 37) / 45);
			@Pc(35) byte[] local35 = local24.aByteArray2;
			@Pc(40) boolean local40 = "gzip".equals(local24.aString8);
			@Pc(45) boolean local45 = "pack200-gzip".equals(local24.aString8);
			@Pc(52) ClassLoader_Sub1 local52 = new ClassLoader_Sub1(local35, local45, local40);
			@Pc(56) String local56 = method15("initial_class", -21747);
			if (local56 == null) {
				local56 = "loader";
			} else if (local56.indexOf(".class") != -1) {
				local56 = local56.substring(0, local56.indexOf(".class"));
			}
			anApplet1 = (Applet) local52.loadClass(local56).getDeclaredConstructor().newInstance();
		} catch (@Pc(89) Exception local89) {
			Class16.method41(method11(114, "err_create_target"), (byte) -87);
		}
		Component_Sub2.method44(124);
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static final File method18(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		@Pc(36) String[] local36 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", arg2, "/tmp/", "" };
		@Pc(61) String[] local61 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(63) int local63 = 0; local63 < 2; local63++) {
			for (@Pc(70) int local70 = 0; local70 < local61.length; local70++) {
				for (@Pc(76) int local76 = 0; local76 < local36.length; local76++) {
					@Pc(112) String local112 = local36[local76] + local61[local70] + "/" + (arg4 == null ? "" : arg4 + "/") + arg1;
					@Pc(114) RandomAccessFile local114 = null;
					try {
						@Pc(119) File local119 = new File(local112);
						if (local63 != 0 || local119.exists()) {
							@Pc(137) String local137 = local36[local76];
							if (local63 != 1 || local137.length() <= 0 || (new File(local137)).exists()) {
								(new File(local36[local76] + local61[local70])).mkdir();
								if (arg4 != null) {
									(new File(local36[local76] + local61[local70] + "/" + arg4)).mkdir();
								}
								local114 = new RandomAccessFile(local119, "rw");
								@Pc(213) int local213 = local114.read();
								local114.seek(0L);
								local114.write(local213);
								local114.seek(0L);
								local114.close();
								return local119;
							}
						}
					} catch (@Pc(227) Exception local227) {
						try {
							if (local114 != null) {
								local114.close();
								local114 = null;
							}
						} catch (@Pc(236) Exception local236) {
						}
					}
				}
			}
		}
		if (arg3 != -10002) {
			aComponent1 = null;
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(II)Z")
	private static final boolean method19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 61) {
			aClass2_1 = null;
		}
		return method6(arg0, aFile1, true, aString1, false);
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "([BILjava/io/File;)Z")
	private static final boolean method20(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) File arg2) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg2);
			local4.write(arg0, 0, arg0.length);
			if (arg1 >= -50) {
				aClass17_1 = null;
			}
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			Class16.method41(method11(84, "err_save_file"), (byte) -69);
			return false;
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	static final String method21(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 98) {
			aCanvas_Sub2_1 = null;
		}
		if (aClass17_1 != null) {
			@Pc(18) String local18 = (String) aClass17_1.aHashtable10.get(arg0);
			if (local18 != null) {
				return local18;
			}
		}
		return (String) aHashtable3.get(arg0);
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "f", descriptor = "(I)V")
	static final void method22(@OriginalArg(0) int arg0) {
		if (browsercontrol.iscreated()) {
			browsercontrol.destroy();
		}
		System.exit(arg0);
	}

	@OriginalMember(owner = "jagexappletviewer!app/appletviewer", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljagexappletviewer!app/t;")
	private static final Class18 method23(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(4) byte[] local4 = new byte[4000000];
		@Pc(6) int local6 = 0;
		@Pc(10) Class18 local10 = new Class18();
		try {
			if (arg2 != -30819) {
				return (Class18) null;
			}
			@Pc(29) URLConnection local29 = (new URL(arg1 + arg3)).openConnection();
			if (arg0) {
				local29.addRequestProperty("accept-encoding", "pack200-gzip");
			}
			@Pc(40) InputStream local40 = local29.getInputStream();
			local10.aString8 = local29.getContentEncoding();
			while (local4.length > local6) {
				@Pc(58) int local58 = local40.read(local4, local6, local4.length - local6);
				if (local58 < 0) {
					break;
				}
				local6 += local58;
				aFloat2 += local58;
				Component_Sub2.method47((int) (aFloat2 / aFloat1 * 100.0F), false);
			}
			local40.close();
		} catch (@Pc(83) Exception local83) {
			Class16.method41(method11(120, "err_downloading") + ": " + arg3, (byte) -41);
		}
		@Pc(100) byte[] local100 = new byte[local6];
		System.arraycopy(local4, 0, local100, 0, local6);
		local10.aByteArray2 = local100;
		return local10;
	}
}
