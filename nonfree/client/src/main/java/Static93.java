import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "Lclient!tf;")
	public static Class17 aClass17_14;

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
	public static int anInt1937 = 999999;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
	public static void method1895() {
		Static110.anInt2183 = -1;
		Static78.anInt1643 = -1;
		Static102.anInt10343 = 0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V")
	public static void method1897(@OriginalArg(0) int arg0) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg0, 7);
		local9.method3956();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIZLjava/lang/String;)V")
	public static void method1898(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static383.method8457("commands - This command");
				Static383.method8457("cls - Clear console");
				Static383.method8457("displayfps - Toggle FPS and other information");
				Static383.method8457("renderer - Print graphics renderer information");
				Static383.method8457("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static249.anInt4093 = 0;
				Static319.anInt4944 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static492.aBoolean603 = !Static492.aBoolean603;
				if (Static492.aBoolean603) {
					Static383.method8457("FPS on");
					return;
				}
				Static383.method8457("FPS off");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(70) Class359 local70 = Static582.aClass33_13.method8115();
				Static383.method8457("Vendor: " + local70.anInt9152);
				Static383.method8457("Name: " + local70.aString113);
				Static383.method8457("Version: " + local70.anInt9153);
				Static383.method8457("Device: " + local70.aString112);
				Static383.method8457("Driver Version: " + local70.aLong266);
				return;
			}
			if (arg2.equals("heap")) {
				Static383.method8457("Heap: " + Static197.anInt5439 + "MB");
				return;
			}
		} catch (@Pc(138) Exception local138) {
			Static383.method8457(Static279.aClass179_2.method4066(Static164.anInt2984));
			return;
		}
		if (Static215.aClass60_4 != Static181.aClass60_3 || Static279.anInt4498 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static383.method8457("FPS: " + Static555.anInt8559);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static671.aBoolean798 = !Static671.aBoolean798;
					if (!Static671.aBoolean798) {
						Static383.method8457("Occlsion now off!");
						return;
					}
					Static383.method8457("Occlsion now on!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static492.aBoolean603 = true;
					Static383.method8457("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static492.aBoolean603 = false;
					Static383.method8457("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static383.method8457("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static566.aClass4_Sub41_1.anInt7533 + "Mb");
						return;
					} catch (@Pc(246) Throwable local246) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static505.aClass236_6.method4953();
					Static383.method8457("Text coords cleared");
					return;
				}
				@Pc(284) int local284;
				@Pc(266) int local266;
				@Pc(275) Runtime local275;
				if (arg2.equalsIgnoreCase("gc")) {
					Static642.method8558();
					for (local266 = 0; local266 < 10; local266++) {
						System.gc();
					}
					local275 = Runtime.getRuntime();
					local284 = (int) ((local275.totalMemory() - local275.freeMemory()) / 1024L);
					Static383.method8457("mem=" + local284 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static642.method8558();
					for (local266 = 0; local266 < 10; local266++) {
						System.gc();
					}
					local275 = Runtime.getRuntime();
					local284 = (int) ((local275.totalMemory() - local275.freeMemory()) / 1024L);
					Static383.method8457("Memory before cleanup=" + local284 + "k");
					Static96.method1971();
					Static642.method8558();
					for (@Pc(339) int local339 = 0; local339 < 10; local339++) {
						System.gc();
					}
					local284 = (int) ((local275.totalMemory() - local275.freeMemory()) / 1024L);
					Static383.method8457("Memory after cleanup=" + local284 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static383.method8457(Static251.method1892() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static383.method8457("Dropped client connection");
					if (Static656.anInt10356 == 10) {
						Static665.method8811();
					} else if (Static656.anInt10356 == 11) {
						Static559.aBoolean671 = true;
						return;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static653.aClass382_5.method8696();
					Static383.method8457("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static334.aClass260_4.method5875();
					Static383.method8457("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static334.aClass260_4.method5874();
					Static383.method8457("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static239.aClass207_2.method4571();
					Static375.aClass192_2.method7793();
					Static334.aClass260_4.method5883();
					Static383.method8457("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static270.method3888();
					Static67.method1453();
					Static383.method8457("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static637.aLong284 = Static429.method5935();
					Static222.aBoolean598 = true;
					Static270.method3888();
					Static67.method1453();
					Static383.method8457("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static532.method7162(1, -1, -1, false);
					if (Static324.method4462() != 1) {
						Static383.method8457("wm1 failed");
						return;
					}
					Static383.method8457("wm1 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static532.method7162(2, -1, -1, false);
					if (Static324.method4462() == 2) {
						Static383.method8457("wm2 succeeded");
						return;
					}
					Static383.method8457("wm2 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static532.method7162(3, 768, 1024, false);
					if (Static324.method4462() != 3) {
						Static383.method8457("wm3 failed");
						return;
					}
					Static383.method8457("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static46.method825(0, false);
					if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() != 0) {
						Static383.method8457("Failed to enter tk0");
						return;
					}
					Static383.method8457("Entered tk0");
					Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, 0);
					Static361.method4808();
					Static391.aBoolean438 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static46.method825(1, false);
					if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() != 1) {
						Static383.method8457("Failed to enter tk1");
						return;
					}
					Static383.method8457("Entered tk1");
					Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, 1);
					Static361.method4808();
					Static391.aBoolean438 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static46.method825(2, false);
					if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 2) {
						Static383.method8457("Entered tk2");
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, 2);
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					Static383.method8457("Failed to enter tk2");
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static46.method825(3, false);
					if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() != 3) {
						Static383.method8457("Failed to enter tk3");
						return;
					}
					Static383.method8457("Entered tk3");
					Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, 3);
					Static361.method4808();
					Static391.aBoolean438 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static46.method825(5, false);
					if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 5) {
						Static383.method8457("Entered tk5");
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, 5);
						Static361.method4808();
						Static391.aBoolean438 = false;
						return;
					}
					Static383.method8457("Failed to enter tk5");
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static383.method8457("Invalid buildarea value");
						return;
					}
					local266 = Static613.method8035(arg2.substring(6));
					if (local266 >= 0 && Static175.method2864(Static197.anInt5439) >= local266) {
						Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub26_1, local266);
						Static361.method4808();
						Static391.aBoolean438 = false;
						Static383.method8457("maxbuildarea=" + Static124.aClass4_Sub20_4.aClass8_Sub26_1.method7943());
						return;
					}
					Static383.method8457("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static383.method8457("Invalid rect_debug value");
						return;
					}
					Static602.anInt9261 = Static613.method8035(arg2.substring(10).trim());
					Static383.method8457("rect_debug=" + Static602.anInt9261);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static110.aBoolean147 = true;
					Static383.method8457("qa_op_test=" + Static110.aBoolean147);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static620.aBoolean706 = !Static620.aBoolean706;
					Static383.method8457("clipcomponents=" + Static620.aBoolean706);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(843) boolean local843 = Static582.aClass33_13.method8136();
					if (!Static253.method3680(!local843)) {
						Static383.method8457("Failed to enable bloom");
						return;
					}
					if (!local843) {
						Static383.method8457("Bloom enabled");
						return;
					}
					Static383.method8457("Bloom disabled");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static562.aBoolean673) {
						Static562.aBoolean673 = false;
						Static383.method8457("Forced tweening disabled.");
						return;
					}
					Static562.aBoolean673 = true;
					Static383.method8457("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static625.aBoolean764) {
						Static383.method8457("Shift-click disabled.");
						Static625.aBoolean764 = false;
						return;
					}
					Static383.method8457("Shift-click ENABLED!");
					Static625.aBoolean764 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static383.method8457("x:" + (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 >> 9) + " z:" + (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static383.method8457("Height: " + Static140.aClass42Array4[Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141].method7450(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 >> 9, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static368.aClass34_80.method1228();
					Static368.aClass34_80.method1231();
					Static623.aClass132_4.method2913();
					Static526.aClass59_4.method1795();
					Static67.method1453();
					Static383.method8457("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static582.aClass33_13.method8146()) {
						local266 = Integer.parseInt(arg2.substring(3));
						if (local266 < 1) {
							local266 = 1;
						} else if (local266 > 4) {
							local266 = 4;
						}
						Static75.anInt1617 = local266;
						Static270.method3888();
						Static383.method8457("Render cores now: " + Static75.anInt1617);
						return;
					}
					Static383.method8457("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static383.method8457("I(s): " + Static44.aClass352_3.method7654() + "/" + Static44.aClass352_3.method7658());
					Static383.method8457("I(m): " + Static499.aClass352_55.method7654() + "/" + Static499.aClass352_55.method7658());
					Static383.method8457("O(s): " + Static532.aClass255_2.aClass173_1.method3818() + "/" + Static532.aClass255_2.aClass173_1.method3813());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static383.method8457("Pos: " + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 + "," + (Static445.anInt6949 + (Static611.anInt9382 >> 9) >> 6) + "," + (Static321.anInt5000 + (Static652.anInt10283 >> 9) >> 6) + "," + (Static445.anInt6949 + (Static611.anInt9382 >> 9) & 0x3F) + "," + ((Static652.anInt10283 >> 9) + Static321.anInt5000 & 0x3F) + " Height: " + (Static674.method8951(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141, Static652.anInt10283, Static611.anInt9382) - Static618.anInt9710));
					Static383.method8457("Look: " + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 + "," + (Static260.anInt8169 + Static445.anInt6949 >> 6) + "," + (Static402.anInt5849 + Static321.anInt5000 >> 6) + "," + (Static260.anInt8169 + Static445.anInt6949 & 0x3F) + "," + (Static402.anInt5849 + Static321.anInt5000 & 0x3F) + " Height: " + (Static674.method8951(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141, Static402.anInt5849, Static260.anInt8169) - Static58.anInt1276));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static620.aBoolean705 = !Static620.aBoolean705;
					Static582.aClass33_13.method8102(Static620.aBoolean705);
					Static314.method4358();
					Static383.method8457("showprofiling=" + Static620.aBoolean705);
					return;
				}
				@Pc(1248) String[] local1248;
				@Pc(1237) int local1237;
				if (arg2.startsWith("performancetest")) {
					local266 = -1;
					local1237 = 1000;
					if (arg2.length() > 15) {
						local1248 = Static189.method2958(' ', arg2);
						try {
							if (local1248.length > 1) {
								local1237 = Integer.parseInt(local1248[1]);
							}
						} catch (@Pc(1259) Throwable local1259) {
						}
						try {
							if (local1248.length > 2) {
								local266 = Integer.parseInt(local1248[2]);
							}
						} catch (@Pc(1270) Throwable local1270) {
						}
					}
					if (local266 == -1) {
						Static383.method8457("Java toolkit: " + Static97.method1974(local1237, 0));
						Static383.method8457("SSE toolkit:  " + Static97.method1974(local1237, 2));
						Static383.method8457("D3D toolkit:  " + Static97.method1974(local1237, 3));
						Static383.method8457("GL toolkit:   " + Static97.method1974(local1237, 1));
						Static383.method8457("GLX toolkit:  " + Static97.method1974(local1237, 5));
						return;
					}
					Static383.method8457("Performance: " + Static97.method1974(local1237, local266));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static335.aBoolean403 = !Static335.aBoolean403;
					Static383.method8457("nonpcs=" + Static335.aBoolean403);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static221.method3264();
					Static383.method8457("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local266 = Integer.parseInt(arg2.substring(12));
					Static606.method7952(local266, Static271.method3931(local266).aString12);
					Static383.method8457("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static383.method8457("w: " + Static653.aClass382_5.anInt10282);
					return;
				}
				@Pc(1423) Class4_Sub48 local1423;
				if (arg2.startsWith("pc")) {
					local1423 = Static335.method4615(Static559.aClass216_136, Static669.aClass196_2);
					local1423.aClass4_Sub11_Sub1_2.method8822(0);
					local1237 = local1423.aClass4_Sub11_Sub1_2.anInt10466;
					local284 = arg2.indexOf(" ", 4);
					local1423.aClass4_Sub11_Sub1_2.method8857(arg2.substring(3, local284));
					Static519.method7021(local1423.aClass4_Sub11_Sub1_2, arg2.substring(local284));
					local1423.aClass4_Sub11_Sub1_2.method8835(local1423.aClass4_Sub11_Sub1_2.anInt10466 - local1237);
					Static410.method5170(local1423);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static352.method4721();
					Static383.method8457("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local266 = 0; local266 < Static509.anIntArray546.length; local266++) {
						if (Static51.aBooleanArray3[local266]) {
							Static509.anIntArray546[local266] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static509.anIntArray546[local266] *= -1;
							}
						}
					}
					Static352.method4721();
					Static383.method8457("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static471.aBoolean587 = true;
					Static67.method1453();
					Static383.method8457("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static471.aBoolean587 = false;
					Static67.method1453();
					Static383.method8457("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static424.method5891();
					Static383.method8457("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static383.method8457(Static319.method4404() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local266 = Integer.parseInt(arg2.substring(17));
					Static383.method8457("varpbit=" + Static526.aClass293_1.method6529(local266));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local266 = Integer.parseInt(arg2.substring(14));
					Static383.method8457("varp=" + Static526.aClass293_1.method6530(local266));
					return;
				}
				@Pc(1623) String[] local1623;
				if (arg2.startsWith("directlogin")) {
					local1623 = Static189.method2958(' ', arg2.substring(12));
					if (local1623.length >= 2) {
						local1237 = local1623.length <= 2 ? 0 : Integer.parseInt(local1623[2]);
						Static627.method8415(local1623[1], local1237, local1623[0]);
						return;
					}
				}
				if (arg2.startsWith("snlogin ")) {
					local1623 = Static189.method2958(' ', arg2.substring(8));
					local1237 = Integer.parseInt(local1623[0]);
					local284 = local1623.length == 2 ? Integer.parseInt(local1623[1]) : 0;
					Static156.method2707(local1237, local284);
					return;
				}
				if (arg2.startsWith("csprofileclear")) {
					Static237.method3389();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static237.method3380();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static237.method3380();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local266 = Integer.parseInt(arg2.substring(8));
					Static582.aClass33_13.method8092(local266);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static383.method8457("Active streams: " + Static162.aClass4_Sub3_Sub5_3.method7726());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static653.method8707();
					Static383.method8457("Complete. Toolkit now: " + Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static383.method8457(Static205.aClient1.method1594());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static332.aString65.startsWith("win")) {
						Static515.method6980(new File("C:\\Temp\\heap.dump"));
					} else {
						Static515.method6980(new File("/tmp/heap.dump"));
					}
					Static383.method8457("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static383.method8457("Name: " + Static332.aString65);
					Static383.method8457("Arch: " + Static332.aString64);
					Static383.method8457("Ver: " + Static332.aString62);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local266 = Integer.parseInt(arg2.substring(8, 9));
					Static294.anInt4648 = local266;
					Static270.method3888();
					Static383.method8457("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local266 = arg2.indexOf(32);
					if (local266 < 0) {
						Static383.method8457("Syntax: ortho <n>");
						return;
					}
					local1237 = Static613.method8035(arg2.substring(local266 + 1));
					Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub15_1, local1237);
					Static361.method4808();
					Static391.aBoolean438 = false;
					Static620.method7581();
					if (Static124.aClass4_Sub20_4.aClass8_Sub15_1.method6055() != local1237) {
						Static383.method8457("Failed to change ortho mode");
						return;
					}
					Static383.method8457("Successfully changed ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static124.aClass4_Sub20_4.aClass8_Sub15_1.method6055() == 0) {
						Static383.method8457("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local266 = Static613.method8035(arg2.substring(arg2.indexOf(32) + 1));
					Static140.anInt8125 = local266;
					Static383.method8457("orthozoom=" + Static140.anInt8125);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local266 = Static613.method8035(arg2.substring(arg2.indexOf(32) + 1));
					Static41.anInt851 = local266;
					Static145.anInt2665 = local266;
					Static383.method8457("ortho tile size=" + local266);
					Static620.method7581();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static254.aBoolean305 = !Static254.aBoolean305;
					Static383.method8457("ortho camera lock is " + (Static254.aBoolean305 ? "on" : "off"));
					return;
				}
				@Pc(1998) File local1998;
				if (arg2.startsWith("setoutput ")) {
					local1998 = new File(arg2.substring(10));
					if (local1998.exists()) {
						local1998 = new File(arg2.substring(10) + "." + Static429.method5935() + ".log");
						if (local1998.exists()) {
							Static383.method8457("file already exists!");
							return;
						}
					}
					if (Static244.aFileOutputStream1 != null) {
						Static244.aFileOutputStream1.close();
						Static244.aFileOutputStream1 = null;
					}
					try {
						Static244.aFileOutputStream1 = new FileOutputStream(local1998);
						return;
					} catch (@Pc(2040) FileNotFoundException local2040) {
						Static383.method8457("Could not create " + local1998.getName());
						return;
					} catch (@Pc(2052) SecurityException local2052) {
						Static383.method8457("Cannot write to " + local1998.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static244.aFileOutputStream1 != null) {
						Static244.aFileOutputStream1.close();
					}
					Static244.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local1998 = new File(arg2.substring(10));
					if (!local1998.exists()) {
						Static383.method8457("No such file");
						return;
					}
					@Pc(2096) byte[] local2096 = Static219.method3254(local1998);
					if (local2096 == null) {
						Static383.method8457("Failed to read file");
						return;
					}
					local1248 = Static189.method2958('\n', Static481.method6590(Static92.method1868(local2096), ""));
					Static640.method8550(local1248);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2127) short local2127 = (short) Static613.method8035(arg2.substring(5));
					if (local2127 > 0) {
						Static634.aShort121 = local2127;
					}
					return;
				}
				if (Static656.anInt10356 == 10) {
					local1423 = Static335.method4615(Static452.aClass216_113, Static669.aClass196_2);
					local1423.aClass4_Sub11_Sub1_2.method8822(arg2.length() + 3);
					local1423.aClass4_Sub11_Sub1_2.method8822(arg1 ? 1 : 0);
					local1423.aClass4_Sub11_Sub1_2.method8822(arg0 ? 1 : 0);
					local1423.aClass4_Sub11_Sub1_2.method8857(arg2);
					Static410.method5170(local1423);
				}
				if (arg2.startsWith("fps ") && Static181.aClass60_3 != Static215.aClass60_4) {
					Static7.method146(Static613.method8035(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2196) Exception local2196) {
				Static383.method8457(Static279.aClass179_2.method4066(Static164.anInt2984));
				return;
			}
		}
		if (Static656.anInt10356 != 10) {
			Static383.method8457(Static279.aClass179_3.method4066(Static164.anInt2984) + arg2);
		}
	}
}
