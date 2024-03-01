package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public abstract class Class390 implements Interface45, Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
	static final int anInt3020 = 32;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
	static int anInt3021;

	@OriginalMember(owner = "client!pi", name = "ai", descriptor = "J")
	static final long aLong231 = 3221225472L;

	@OriginalMember(owner = "client!pi", name = "aq", descriptor = "I")
	static final int anInt3025 = 1048576;

	@OriginalMember(owner = "client!pi", name = "ao", descriptor = "Ljava/lang/String;")
	static final String aString140 = "main_file_cache.dat2";

	@OriginalMember(owner = "client!pi", name = "ap", descriptor = "Ljava/lang/String;")
	static final String aString141 = "main_file_cache.idx";

	@OriginalMember(owner = "client!pi", name = "ab", descriptor = "Ljava/lang/String;")
	static final String aString142 = "main_file_cache.idx255";

	@OriginalMember(owner = "client!pi", name = "au", descriptor = "Ljava/lang/String;")
	static final String aString143 = "random.dat";

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	protected static int anInt3026;

	@OriginalMember(owner = "client!pi", name = "ac", descriptor = "I")
	static final int anInt3028 = 0;

	@OriginalMember(owner = "client!pi", name = "bw", descriptor = "I")
	static final int anInt3029 = 1;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	static int anInt3030;

	@OriginalMember(owner = "client!pi", name = "av", descriptor = "Ljava/lang/String;")
	static final String aString144 = "rw";

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "J")
	static long aLong229 = 4991196340713632000L;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	public static int anInt3019 = 0;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "[J")
	static long[] aLongArray11 = new long[32];

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "[J")
	static long[] aLongArray12 = new long[32];

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
	public static int anInt3022 = 0;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
	public static int anInt3024 = 0;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "Ljava/lang/String;")
	protected static String aString139 = null;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Z")
	protected static volatile boolean aBoolean558 = true;

	@OriginalMember(owner = "client!pi", name = "at", descriptor = "I")
	static int anInt3023 = -1190332996;

	@OriginalMember(owner = "client!pi", name = "af", descriptor = "Z")
	protected static volatile boolean aBoolean559 = false;

	@OriginalMember(owner = "client!pi", name = "ak", descriptor = "J")
	static volatile long aLong228 = 0L;

	@OriginalMember(owner = "client!pi", name = "ah", descriptor = "Z")
	protected static boolean aBoolean563 = false;

	@OriginalMember(owner = "client!pi", name = "an", descriptor = "Z")
	static volatile boolean aBoolean560 = true;

	@OriginalMember(owner = "client!pi", name = "ay", descriptor = "Lclient!xa;")
	static Class569 aClass569_5 = null;

	@OriginalMember(owner = "client!pi", name = "ag", descriptor = "Lclient!xa;")
	protected static Class569 aClass569_4 = null;

	@OriginalMember(owner = "client!pi", name = "am", descriptor = "Lclient!xa;")
	protected static Class569 aClass569_6 = null;

	@OriginalMember(owner = "client!pi", name = "bp", descriptor = "Lclient!ph;")
	static Class389 aClass389_2 = null;

	@OriginalMember(owner = "client!pi", name = "bd", descriptor = "J")
	static long aLong230 = 0L;

	@OriginalMember(owner = "client!pi", name = "bs", descriptor = "Z")
	static boolean aBoolean561 = false;

	@OriginalMember(owner = "client!pi", name = "bf", descriptor = "I")
	public static int anInt3031 = -331442163;

	@OriginalMember(owner = "client!pi", name = "bt", descriptor = "I")
	public static int anInt3018 = -835241639;

	@OriginalMember(owner = "client!pi", name = "bm", descriptor = "Z")
	boolean aBoolean562 = false;

	@OriginalMember(owner = "client!pi", name = "bk", descriptor = "Z")
	boolean aBoolean557 = false;

	@OriginalMember(owner = "client!pi", name = "bg", descriptor = "Z")
	public boolean aBoolean564 = false;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V", line = 54)
	public static void method22351() {
		Class516.aClass56_Sub2_1.method12583();
		Class516.aClass56_Sub1_1.method12583();
		Class516.aLong283 = 2488218721681104173L;
		Class516.aBoolean819 = true;
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 90)
	Class390() {
	}

	@OriginalMember(owner = "client!pi", name = "supplyApplet", descriptor = "(Ljava/applet/Applet;)V", line = 93)
	@Override
	public void supplyApplet(@OriginalArg(0) Applet arg0) {
		Class524.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "ar", descriptor = "(Ljava/applet/Applet;)V", line = 93)
	@Override
	public void method22222(@OriginalArg(0) Applet arg0) {
		Class524.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "am", descriptor = "(Ljava/applet/Applet;)V", line = 93)
	@Override
	public void method22225(@OriginalArg(0) Applet arg0) {
		Class524.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "(Lclient!pm;Ljava/lang/String;Ljava/lang/String;IIIIZI)V", line = 98)
	final void method22245(@OriginalArg(0) Class394 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method22261(Class389.aClass389_4, arg7);
			anInt3026 = (Class128.anInt3317 = arg0.method27431() * 1955991213) * 1108287715;
			Class613.anInt5546 = (Class575.anInt5428 = arg0.method27432() * -1314402953) * -1435611853;
			anInt3022 = 0;
			anInt3024 = 0;
			if (Class527.method32424() == Class389.aClass389_5) {
				anInt3026 += arg0.method27433() * 839861966;
				Class613.anInt5546 += arg0.method27434() * 1488548714;
				this.method22295(arg0.method27435());
			}
			Class632.anApplet3 = Class524.anApplet2;
			this.method22328(arg1, arg2, arg3, arg4, arg5, arg6);
		} catch (@Pc(67) Throwable local67) {
			Class27_Sub1.method7214(null, local67);
			this.method22257("crash");
		}
	}

	@OriginalMember(owner = "client!pi", name = "ad", descriptor = "(Lclient!pm;Ljava/lang/String;Ljava/lang/String;IIIIZ)V", line = 98)
	final void method22311(@OriginalArg(0) Class394 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method22261(Class389.aClass389_4, arg7);
			anInt3026 = (Class128.anInt3317 = arg0.method27431() * 1955991213) * 1108287715;
			Class613.anInt5546 = (Class575.anInt5428 = arg0.method27432() * -1314402953) * -1435611853;
			anInt3022 = 0;
			anInt3024 = 0;
			if (Class527.method32424() == Class389.aClass389_5) {
				anInt3026 += arg0.method27433() * 839861966;
				Class613.anInt5546 += arg0.method27434() * 1488548714;
				this.method22295(arg0.method27435());
			}
			Class632.anApplet3 = Class524.anApplet2;
			this.method22328(arg1, arg2, arg3, arg4, arg5, arg6);
		} catch (@Pc(67) Throwable local67) {
			Class27_Sub1.method7214(null, local67);
			this.method22257("crash");
		}
	}

	@OriginalMember(owner = "client!pi", name = "ae", descriptor = "(Lclient!pm;Ljava/lang/String;Ljava/lang/String;IIIIZ)V", line = 98)
	final void method22336(@OriginalArg(0) Class394 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method22261(Class389.aClass389_4, arg7);
			anInt3026 = (Class128.anInt3317 = arg0.method27431() * 1955991213) * 1108287715;
			Class613.anInt5546 = (Class575.anInt5428 = arg0.method27432() * -1314402953) * -1435611853;
			anInt3022 = 0;
			anInt3024 = 0;
			if (Class527.method32424() == Class389.aClass389_5) {
				anInt3026 += arg0.method27433() * 839861966;
				Class613.anInt5546 += arg0.method27434() * 1488548714;
				this.method22295(arg0.method27435());
			}
			Class632.anApplet3 = Class524.anApplet2;
			this.method22328(arg1, arg2, arg3, arg4, arg5, arg6);
		} catch (@Pc(67) Throwable local67) {
			Class27_Sub1.method7214(null, local67);
			this.method22257("crash");
		}
	}

	@OriginalMember(owner = "client!pi", name = "aw", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)V", line = 118)
	final void method22270(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) throws Exception {
		Class341.anInt4603 = arg3 * -836670317;
		Class284.anInt4354 = arg2 * 1494320187;
		RuntimeException_Sub3.anInt2805 = arg4 * 949844803;
		Class291.anInt4370 = arg5 * 1772807031;
		Class67.aString65 = "Unknown";
		Class498.aString228 = "1.1";
		try {
			Class67.aString65 = System.getProperty("java.vendor");
			Class498.aString228 = System.getProperty("java.version");
		} catch (@Pc(27) Exception local27) {
		}
		try {
			Class314.aString203 = System.getProperty("os.name");
		} catch (@Pc(32) Exception local32) {
			Class314.aString203 = "Unknown";
		}
		Class344.aString208 = Class314.aString203.toLowerCase();
		try {
			Class300.aString198 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
			Class300.aString198 = "";
		}
		try {
			Class3_Sub10.aString44 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
			Class3_Sub10.aString44 = "";
		}
		try {
			Class406.aString218 = System.getProperty("user.home");
			if (Class406.aString218 != null) {
				Class406.aString218 = Class406.aString218 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (Class344.aString208.startsWith("win")) {
				if (Class406.aString218 == null) {
					Class406.aString218 = System.getenv("USERPROFILE");
				}
			} else if (Class406.aString218 == null) {
				Class406.aString218 = System.getenv("HOME");
			}
			if (Class406.aString218 != null) {
				Class406.aString218 = Class406.aString218 + "/";
			}
		} catch (@Pc(99) Exception local99) {
		}
		if (Class406.aString218 == null) {
			Class406.aString218 = "~/";
		}
		try {
			Class155.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(108) Throwable local108) {
		}
		Class197.aStringArray12 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class406.aString218, "/tmp/", "" };
		Class220.aStringArray13 = new String[] { ".jagex_cache_" + Class284.anInt4354 * 1372763379, ".file_store_" + Class284.anInt4354 * 1372763379 };
		@Pc(174) int local174 = 0;
		@Pc(199) int local199;
		label131: while (local174 < 4) {
			Class510.aFile4 = this.method22238(arg0, arg1, local174);
			if (!Class510.aFile4.exists()) {
				Class510.aFile4.mkdirs();
			}
			@Pc(193) File[] local193 = Class510.aFile4.listFiles();
			if (local193 == null) {
				break;
			}
			@Pc(197) File[] local197 = local193;
			local199 = 0;
			while (true) {
				if (local199 >= local197.length) {
					break label131;
				}
				@Pc(207) File local207 = local197[local199];
				if (!this.method22241(local207, false)) {
					local174++;
					break;
				}
				local199++;
			}
		}
		Class471.method28769(Class510.aFile4);
		Class147.method23096();
		aClass569_4 = new Class569(new Class592(Class370.method27082("main_file_cache.dat2"), "rw", 3221225472L), 5200, 0);
		aClass569_6 = new Class569(new Class592(Class370.method27082("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Class3_Sub18_Sub2.aClass569Array1 = new Class569[Class341.anInt4603 * 1043108251];
		for (local174 = 0; local174 < Class341.anInt4603 * 1043108251; local174++) {
			Class3_Sub18_Sub2.aClass569Array1[local174] = new Class569(new Class592(Class370.method27082("main_file_cache.idx" + local174), "rw", 1048576L), 6000, 0);
		}
		try {
			Class3_Sub24_Sub9.aClass556_1 = new Class556();
		} catch (@Pc(295) Exception local295) {
			Class552.aBoolean823 = false;
		}
		Class316.aClass393_1 = new Class393();
		@Pc(304) ThreadGroup local304 = Thread.currentThread().getThreadGroup();
		for (@Pc(307) ThreadGroup local307 = local304.getParent(); local307 != null; local307 = local307.getParent()) {
			local304 = local307;
		}
		@Pc(318) Thread[] local318 = new Thread[1000];
		local304.enumerate(local318);
		for (local199 = 0; local199 < local318.length; local199++) {
			if (local318[local199] != null && local318[local199].getName().startsWith("AWT")) {
				local318[local199].setPriority(1);
			}
		}
		@Pc(351) Thread local351 = new Thread(this);
		local351.setDaemon(true);
		local351.start();
		local351.setPriority(1);
	}

	@OriginalMember(owner = "client!pi", name = "ac", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)V", line = 118)
	final void method22271(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) throws Exception {
		Class341.anInt4603 = arg3 * -836670317;
		Class284.anInt4354 = arg2 * 1494320187;
		RuntimeException_Sub3.anInt2805 = arg4 * 949844803;
		Class291.anInt4370 = arg5 * 1772807031;
		Class67.aString65 = "Unknown";
		Class498.aString228 = "1.1";
		try {
			Class67.aString65 = System.getProperty("java.vendor");
			Class498.aString228 = System.getProperty("java.version");
		} catch (@Pc(27) Exception local27) {
		}
		try {
			Class314.aString203 = System.getProperty("os.name");
		} catch (@Pc(32) Exception local32) {
			Class314.aString203 = "Unknown";
		}
		Class344.aString208 = Class314.aString203.toLowerCase();
		try {
			Class300.aString198 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
			Class300.aString198 = "";
		}
		try {
			Class3_Sub10.aString44 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
			Class3_Sub10.aString44 = "";
		}
		try {
			Class406.aString218 = System.getProperty("user.home");
			if (Class406.aString218 != null) {
				Class406.aString218 = Class406.aString218 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (Class344.aString208.startsWith("win")) {
				if (Class406.aString218 == null) {
					Class406.aString218 = System.getenv("USERPROFILE");
				}
			} else if (Class406.aString218 == null) {
				Class406.aString218 = System.getenv("HOME");
			}
			if (Class406.aString218 != null) {
				Class406.aString218 = Class406.aString218 + "/";
			}
		} catch (@Pc(99) Exception local99) {
		}
		if (Class406.aString218 == null) {
			Class406.aString218 = "~/";
		}
		try {
			Class155.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(108) Throwable local108) {
		}
		Class197.aStringArray12 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class406.aString218, "/tmp/", "" };
		Class220.aStringArray13 = new String[] { ".jagex_cache_" + Class284.anInt4354 * 1372763379, ".file_store_" + Class284.anInt4354 * 1372763379 };
		@Pc(174) int local174 = 0;
		@Pc(199) int local199;
		label131: while (local174 < 4) {
			Class510.aFile4 = this.method22238(arg0, arg1, local174);
			if (!Class510.aFile4.exists()) {
				Class510.aFile4.mkdirs();
			}
			@Pc(193) File[] local193 = Class510.aFile4.listFiles();
			if (local193 == null) {
				break;
			}
			@Pc(197) File[] local197 = local193;
			local199 = 0;
			while (true) {
				if (local199 >= local197.length) {
					break label131;
				}
				@Pc(207) File local207 = local197[local199];
				if (!this.method22241(local207, false)) {
					local174++;
					break;
				}
				local199++;
			}
		}
		Class471.method28769(Class510.aFile4);
		Class147.method23096();
		aClass569_4 = new Class569(new Class592(Class370.method27082("main_file_cache.dat2"), "rw", 3221225472L), 5200, 0);
		aClass569_6 = new Class569(new Class592(Class370.method27082("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Class3_Sub18_Sub2.aClass569Array1 = new Class569[Class341.anInt4603 * 1043108251];
		for (local174 = 0; local174 < Class341.anInt4603 * 1043108251; local174++) {
			Class3_Sub18_Sub2.aClass569Array1[local174] = new Class569(new Class592(Class370.method27082("main_file_cache.idx" + local174), "rw", 1048576L), 6000, 0);
		}
		try {
			Class3_Sub24_Sub9.aClass556_1 = new Class556();
		} catch (@Pc(295) Exception local295) {
			Class552.aBoolean823 = false;
		}
		Class316.aClass393_1 = new Class393();
		@Pc(304) ThreadGroup local304 = Thread.currentThread().getThreadGroup();
		for (@Pc(307) ThreadGroup local307 = local304.getParent(); local307 != null; local307 = local307.getParent()) {
			local304 = local307;
		}
		@Pc(318) Thread[] local318 = new Thread[1000];
		local304.enumerate(local318);
		for (local199 = 0; local199 < local318.length; local199++) {
			if (local318[local199] != null && local318[local199].getName().startsWith("AWT")) {
				local318[local199].setPriority(1);
			}
		}
		@Pc(351) Thread local351 = new Thread(this);
		local351.setDaemon(true);
		local351.start();
		local351.setPriority(1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V", line = 118)
	final void method22328(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) throws Exception {
		Class341.anInt4603 = arg3 * -836670317;
		Class284.anInt4354 = arg2 * 1494320187;
		RuntimeException_Sub3.anInt2805 = arg4 * 949844803;
		Class291.anInt4370 = arg5 * 1772807031;
		Class67.aString65 = "Unknown";
		Class498.aString228 = "1.1";
		try {
			Class67.aString65 = System.getProperty("java.vendor");
			Class498.aString228 = System.getProperty("java.version");
		} catch (@Pc(27) Exception local27) {
		}
		try {
			Class314.aString203 = System.getProperty("os.name");
		} catch (@Pc(32) Exception local32) {
			Class314.aString203 = "Unknown";
		}
		Class344.aString208 = Class314.aString203.toLowerCase();
		try {
			Class300.aString198 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
			Class300.aString198 = "";
		}
		try {
			Class3_Sub10.aString44 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
			Class3_Sub10.aString44 = "";
		}
		try {
			Class406.aString218 = System.getProperty("user.home");
			if (Class406.aString218 != null) {
				Class406.aString218 = Class406.aString218 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (Class344.aString208.startsWith("win")) {
				if (Class406.aString218 == null) {
					Class406.aString218 = System.getenv("USERPROFILE");
				}
			} else if (Class406.aString218 == null) {
				Class406.aString218 = System.getenv("HOME");
			}
			if (Class406.aString218 != null) {
				Class406.aString218 = Class406.aString218 + "/";
			}
		} catch (@Pc(99) Exception local99) {
		}
		if (Class406.aString218 == null) {
			Class406.aString218 = "~/";
		}
		try {
			Class155.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(108) Throwable local108) {
		}
		Class197.aStringArray12 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class406.aString218, "/tmp/", "" };
		Class220.aStringArray13 = new String[] { ".jagex_cache_" + Class284.anInt4354 * 1372763379, ".file_store_" + Class284.anInt4354 * 1372763379 };
		@Pc(174) int local174 = 0;
		@Pc(199) int local199;
		label131: while (local174 < 4) {
			Class510.aFile4 = this.method22238(arg0, arg1, local174);
			if (!Class510.aFile4.exists()) {
				Class510.aFile4.mkdirs();
			}
			@Pc(193) File[] local193 = Class510.aFile4.listFiles();
			if (local193 == null) {
				break;
			}
			@Pc(197) File[] local197 = local193;
			local199 = 0;
			while (true) {
				if (local199 >= local197.length) {
					break label131;
				}
				@Pc(207) File local207 = local197[local199];
				if (!this.method22241(local207, false)) {
					local174++;
					break;
				}
				local199++;
			}
		}
		Class471.method28769(Class510.aFile4);
		Class147.method23096();
		aClass569_4 = new Class569(new Class592(Class370.method27082("main_file_cache.dat2"), "rw", 3221225472L), 5200, 0);
		aClass569_6 = new Class569(new Class592(Class370.method27082("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Class3_Sub18_Sub2.aClass569Array1 = new Class569[Class341.anInt4603 * 1043108251];
		for (local174 = 0; local174 < Class341.anInt4603 * 1043108251; local174++) {
			Class3_Sub18_Sub2.aClass569Array1[local174] = new Class569(new Class592(Class370.method27082("main_file_cache.idx" + local174), "rw", 1048576L), 6000, 0);
		}
		try {
			Class3_Sub24_Sub9.aClass556_1 = new Class556();
		} catch (@Pc(295) Exception local295) {
			Class552.aBoolean823 = false;
		}
		Class316.aClass393_1 = new Class393();
		@Pc(304) ThreadGroup local304 = Thread.currentThread().getThreadGroup();
		for (@Pc(307) ThreadGroup local307 = local304.getParent(); local307 != null; local307 = local307.getParent()) {
			local304 = local307;
		}
		@Pc(318) Thread[] local318 = new Thread[1000];
		local304.enumerate(local318);
		for (local199 = 0; local199 < local318.length; local199++) {
			if (local318[local199] != null && local318[local199].getName().startsWith("AWT")) {
				local318[local199].setPriority(1);
			}
		}
		@Pc(351) Thread local351 = new Thread(this);
		local351.setDaemon(true);
		local351.start();
		local351.setPriority(1);
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;", line = 226)
	File method22238(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13 = arg2 == 0 ? "" : "" + arg2;
		Class198.aFile1 = new File(Class406.aString218, "jagex_cl_" + arg0 + "_" + arg1 + local13 + ".dat");
		@Pc(36) String local36 = null;
		@Pc(38) String local38 = null;
		@Pc(40) boolean local40 = false;
		@Pc(175) File local175;
		if (Class198.aFile1.exists()) {
			try {
				@Pc(50) Class592 local50 = new Class592(Class198.aFile1, "rw", 10000L);
				@Pc(58) Class3_Sub41 local58 = new Class3_Sub41((int) local50.method33340());
				@Pc(84) int local84;
				while (local58.anInt2803 * 62066237 < local58.aByteArray51.length) {
					local84 = local50.method33341(local58.aByteArray51, local58.anInt2803 * 62066237, local58.aByteArray51.length - local58.anInt2803 * 62066237);
					if (local84 == -1) {
						throw new IOException();
					}
					local58.anInt2803 += local84 * -918980331;
				}
				local58.anInt2803 = 0;
				local84 = local58.method20269();
				if (local84 < 1 || local84 > 3) {
					throw new IOException("" + local84);
				}
				@Pc(127) int local127 = 0;
				if (local84 > 1) {
					local127 = local58.method20269();
				}
				if (local84 <= 2) {
					local36 = local58.method20284();
					if (local127 == 1) {
						local38 = local58.method20284();
					}
				} else {
					local36 = local58.method20285();
					if (local127 == 1) {
						local38 = local58.method20285();
					}
				}
				local50.method33339();
			} catch (@Pc(165) IOException local165) {
				local165.printStackTrace();
			}
			if (local36 != null) {
				local175 = new File(local36);
				if (!local175.exists()) {
					local36 = null;
				}
			}
			if (local36 != null) {
				local175 = new File(local36, "test.dat");
				if (!this.method22241(local175, true)) {
					local36 = null;
				}
			}
		}
		if (local36 == null && arg2 == 0) {
			label103: for (@Pc(203) int local203 = 0; local203 < Class220.aStringArray13.length; local203++) {
				for (@Pc(209) int local209 = 0; local209 < Class197.aStringArray12.length; local209++) {
					@Pc(235) File local235 = new File(Class197.aStringArray12[local209] + Class220.aStringArray13[local203] + File.separatorChar + arg0 + File.separatorChar);
					if (local235.exists() && this.method22241(new File(local235, "test.dat"), true)) {
						local36 = local235.toString();
						local40 = true;
						break label103;
					}
				}
			}
		}
		if (local36 == null) {
			local36 = Class406.aString218 + File.separatorChar + "jagexcache" + local13 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local40 = true;
		}
		if (local38 != null) {
			@Pc(294) File local294 = new File(local38);
			local175 = new File(local36);
			try {
				@Pc(302) File[] local302 = local294.listFiles();
				@Pc(304) File[] local304 = local302;
				for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
					@Pc(314) File local314 = local304[local306];
					@Pc(321) File local321 = new File(local175, local314.getName());
					@Pc(325) boolean local325 = local314.renameTo(local321);
					if (!local325) {
						throw new IOException();
					}
				}
			} catch (@Pc(335) Exception local335) {
				local335.printStackTrace();
			}
			local40 = true;
		}
		if (local40) {
			this.method22240(new File(local36), null);
		}
		return new File(local36);
	}

	@OriginalMember(owner = "client!pi", name = "bw", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 226)
	File method22272(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13 = arg2 == 0 ? "" : "" + arg2;
		Class198.aFile1 = new File(Class406.aString218, "jagex_cl_" + arg0 + "_" + arg1 + local13 + ".dat");
		@Pc(36) String local36 = null;
		@Pc(38) String local38 = null;
		@Pc(40) boolean local40 = false;
		@Pc(175) File local175;
		if (Class198.aFile1.exists()) {
			try {
				@Pc(50) Class592 local50 = new Class592(Class198.aFile1, "rw", 10000L);
				@Pc(58) Class3_Sub41 local58 = new Class3_Sub41((int) local50.method33340());
				@Pc(84) int local84;
				while (local58.anInt2803 * 62066237 < local58.aByteArray51.length) {
					local84 = local50.method33341(local58.aByteArray51, local58.anInt2803 * 62066237, local58.aByteArray51.length - local58.anInt2803 * 62066237);
					if (local84 == -1) {
						throw new IOException();
					}
					local58.anInt2803 += local84 * -918980331;
				}
				local58.anInt2803 = 0;
				local84 = local58.method20269();
				if (local84 < 1 || local84 > 3) {
					throw new IOException("" + local84);
				}
				@Pc(127) int local127 = 0;
				if (local84 > 1) {
					local127 = local58.method20269();
				}
				if (local84 <= 2) {
					local36 = local58.method20284();
					if (local127 == 1) {
						local38 = local58.method20284();
					}
				} else {
					local36 = local58.method20285();
					if (local127 == 1) {
						local38 = local58.method20285();
					}
				}
				local50.method33339();
			} catch (@Pc(165) IOException local165) {
				local165.printStackTrace();
			}
			if (local36 != null) {
				local175 = new File(local36);
				if (!local175.exists()) {
					local36 = null;
				}
			}
			if (local36 != null) {
				local175 = new File(local36, "test.dat");
				if (!this.method22241(local175, true)) {
					local36 = null;
				}
			}
		}
		if (local36 == null && arg2 == 0) {
			label103: for (@Pc(203) int local203 = 0; local203 < Class220.aStringArray13.length; local203++) {
				for (@Pc(209) int local209 = 0; local209 < Class197.aStringArray12.length; local209++) {
					@Pc(235) File local235 = new File(Class197.aStringArray12[local209] + Class220.aStringArray13[local203] + File.separatorChar + arg0 + File.separatorChar);
					if (local235.exists() && this.method22241(new File(local235, "test.dat"), true)) {
						local36 = local235.toString();
						local40 = true;
						break label103;
					}
				}
			}
		}
		if (local36 == null) {
			local36 = Class406.aString218 + File.separatorChar + "jagexcache" + local13 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local40 = true;
		}
		if (local38 != null) {
			@Pc(294) File local294 = new File(local38);
			local175 = new File(local36);
			try {
				@Pc(302) File[] local302 = local294.listFiles();
				@Pc(304) File[] local304 = local302;
				for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
					@Pc(314) File local314 = local304[local306];
					@Pc(321) File local321 = new File(local175, local314.getName());
					@Pc(325) boolean local325 = local314.renameTo(local321);
					if (!local325) {
						throw new IOException();
					}
				}
			} catch (@Pc(335) Exception local335) {
				local335.printStackTrace();
			}
			local40 = true;
		}
		if (local40) {
			this.method22240(new File(local36), null);
		}
		return new File(local36);
	}

	@OriginalMember(owner = "client!pi", name = "bp", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 226)
	File method22300(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13 = arg2 == 0 ? "" : "" + arg2;
		Class198.aFile1 = new File(Class406.aString218, "jagex_cl_" + arg0 + "_" + arg1 + local13 + ".dat");
		@Pc(36) String local36 = null;
		@Pc(38) String local38 = null;
		@Pc(40) boolean local40 = false;
		@Pc(175) File local175;
		if (Class198.aFile1.exists()) {
			try {
				@Pc(50) Class592 local50 = new Class592(Class198.aFile1, "rw", 10000L);
				@Pc(58) Class3_Sub41 local58 = new Class3_Sub41((int) local50.method33340());
				@Pc(84) int local84;
				while (local58.anInt2803 * 62066237 < local58.aByteArray51.length) {
					local84 = local50.method33341(local58.aByteArray51, local58.anInt2803 * 62066237, local58.aByteArray51.length - local58.anInt2803 * 62066237);
					if (local84 == -1) {
						throw new IOException();
					}
					local58.anInt2803 += local84 * -918980331;
				}
				local58.anInt2803 = 0;
				local84 = local58.method20269();
				if (local84 < 1 || local84 > 3) {
					throw new IOException("" + local84);
				}
				@Pc(127) int local127 = 0;
				if (local84 > 1) {
					local127 = local58.method20269();
				}
				if (local84 <= 2) {
					local36 = local58.method20284();
					if (local127 == 1) {
						local38 = local58.method20284();
					}
				} else {
					local36 = local58.method20285();
					if (local127 == 1) {
						local38 = local58.method20285();
					}
				}
				local50.method33339();
			} catch (@Pc(165) IOException local165) {
				local165.printStackTrace();
			}
			if (local36 != null) {
				local175 = new File(local36);
				if (!local175.exists()) {
					local36 = null;
				}
			}
			if (local36 != null) {
				local175 = new File(local36, "test.dat");
				if (!this.method22241(local175, true)) {
					local36 = null;
				}
			}
		}
		if (local36 == null && arg2 == 0) {
			label103: for (@Pc(203) int local203 = 0; local203 < Class220.aStringArray13.length; local203++) {
				for (@Pc(209) int local209 = 0; local209 < Class197.aStringArray12.length; local209++) {
					@Pc(235) File local235 = new File(Class197.aStringArray12[local209] + Class220.aStringArray13[local203] + File.separatorChar + arg0 + File.separatorChar);
					if (local235.exists() && this.method22241(new File(local235, "test.dat"), true)) {
						local36 = local235.toString();
						local40 = true;
						break label103;
					}
				}
			}
		}
		if (local36 == null) {
			local36 = Class406.aString218 + File.separatorChar + "jagexcache" + local13 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local40 = true;
		}
		if (local38 != null) {
			@Pc(294) File local294 = new File(local38);
			local175 = new File(local36);
			try {
				@Pc(302) File[] local302 = local294.listFiles();
				@Pc(304) File[] local304 = local302;
				for (@Pc(306) int local306 = 0; local306 < local304.length; local306++) {
					@Pc(314) File local314 = local304[local306];
					@Pc(321) File local321 = new File(local175, local314.getName());
					@Pc(325) boolean local325 = local314.renameTo(local321);
					if (!local325) {
						throw new IOException();
					}
				}
			} catch (@Pc(335) Exception local335) {
				local335.printStackTrace();
			}
			local40 = true;
		}
		if (local40) {
			this.method22240(new File(local36), null);
		}
		return new File(local36);
	}

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "(Ljava/io/File;I)Z", line = 317)
	public boolean method22239(@OriginalArg(0) File arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.exists()) {
			return false;
		} else if (!arg0.isDirectory()) {
			return false;
		} else if (arg0.listFiles().length != 0) {
			return false;
		} else if (this.method22241(new File(arg0, "test.dat"), true)) {
			this.method22240(arg0, Class510.aFile4);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "bd", descriptor = "(Ljava/io/File;)Z", line = 317)
	public boolean method22274(@OriginalArg(0) File arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.exists()) {
			return false;
		} else if (!arg0.isDirectory()) {
			return false;
		} else if (arg0.listFiles().length != 0) {
			return false;
		} else if (this.method22241(new File(arg0, "test.dat"), true)) {
			this.method22240(arg0, Class510.aFile4);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "bs", descriptor = "(Ljava/io/File;)Z", line = 317)
	public boolean method22275(@OriginalArg(0) File arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.exists()) {
			return false;
		} else if (!arg0.isDirectory()) {
			return false;
		} else if (arg0.listFiles().length != 0) {
			return false;
		} else if (this.method22241(new File(arg0, "test.dat"), true)) {
			this.method22240(arg0, Class510.aFile4);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "bm", descriptor = "(Ljava/io/File;)Z", line = 317)
	public boolean method22276(@OriginalArg(0) File arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.exists()) {
			return false;
		} else if (!arg0.isDirectory()) {
			return false;
		} else if (arg0.listFiles().length != 0) {
			return false;
		} else if (this.method22241(new File(arg0, "test.dat"), true)) {
			this.method22240(arg0, Class510.aFile4);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(Ljava/io/File;Ljava/io/File;I)V", line = 329)
	void method22240(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) Class592 local6 = new Class592(Class198.aFile1, "rw", 10000L);
			@Pc(11) Class3_Sub41 local11 = new Class3_Sub41(500);
			local11.method20250(3);
			local11.method20250(arg1 == null ? 0 : 1);
			local11.method20281(arg0.getPath());
			if (arg1 != null) {
				local11.method20281(arg1.getPath());
			}
			local6.method33338(local11.aByteArray51, 0, local11.anInt2803 * 62066237);
			local6.method33339();
		} catch (@Pc(51) IOException local51) {
			local51.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!pi", name = "bf", descriptor = "(Ljava/io/File;Ljava/io/File;)V", line = 329)
	void method22277(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) Class592 local6 = new Class592(Class198.aFile1, "rw", 10000L);
			@Pc(11) Class3_Sub41 local11 = new Class3_Sub41(500);
			local11.method20250(3);
			local11.method20250(arg1 == null ? 0 : 1);
			local11.method20281(arg0.getPath());
			if (arg1 != null) {
				local11.method20281(arg1.getPath());
			}
			local6.method33338(local11.aByteArray51, 0, local11.anInt2803 * 62066237);
			local6.method33339();
		} catch (@Pc(51) IOException local51) {
			local51.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!pi", name = "bt", descriptor = "(Ljava/io/File;Ljava/io/File;)V", line = 329)
	void method22329(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) Class592 local6 = new Class592(Class198.aFile1, "rw", 10000L);
			@Pc(11) Class3_Sub41 local11 = new Class3_Sub41(500);
			local11.method20250(3);
			local11.method20250(arg1 == null ? 0 : 1);
			local11.method20281(arg0.getPath());
			if (arg1 != null) {
				local11.method20281(arg1.getPath());
			}
			local6.method33338(local11.aByteArray51, 0, local11.anInt2803 * 62066237);
			local6.method33339();
		} catch (@Pc(51) IOException local51) {
			local51.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "(Ljava/io/File;ZI)Z", line = 345)
	boolean method22241(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) RandomAccessFile local5 = new RandomAccessFile(arg0, "rw");
			@Pc(8) int local8 = local5.read();
			local5.seek(0L);
			local5.write(local8);
			local5.seek(0L);
			local5.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "bk", descriptor = "(Ljava/io/File;Z)Z", line = 345)
	boolean method22249(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) RandomAccessFile local5 = new RandomAccessFile(arg0, "rw");
			@Pc(8) int local8 = local5.read();
			local5.seek(0L);
			local5.write(local8);
			local5.seek(0L);
			local5.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "bg", descriptor = "(Ljava/io/File;Z)Z", line = 345)
	boolean method22279(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) RandomAccessFile local5 = new RandomAccessFile(arg0, "rw");
			@Pc(8) int local8 = local5.read();
			local5.seek(0L);
			local5.write(local8);
			local5.seek(0L);
			local5.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "br", descriptor = "(Ljava/io/File;Z)Z", line = 345)
	boolean method22280(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) RandomAccessFile local5 = new RandomAccessFile(arg0, "rw");
			@Pc(8) int local8 = local5.read();
			local5.seek(0L);
			local5.write(local8);
			local5.seek(0L);
			local5.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "bb", descriptor = "(Ljava/io/File;Z)Z", line = 345)
	boolean method22281(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) RandomAccessFile local5 = new RandomAccessFile(arg0, "rw");
			@Pc(8) int local8 = local5.read();
			local5.seek(0L);
			local5.write(local8);
			local5.seek(0L);
			local5.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "by", descriptor = "()Ljava/io/File;", line = 360)
	public static File method22273() {
		return Class510.aFile4;
	}

	@OriginalMember(owner = "client!pi", name = "bl", descriptor = "()V", line = 393)
	static void method22283() {
		try {
			@Pc(5) File local5 = new File(Class406.aString218, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				aClass569_5 = new Class569(new Class592(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class220.aStringArray13.length; local23++) {
					for (local29 = 0; local29 < Class197.aStringArray12.length; local29++) {
						@Pc(53) File local53 = new File(Class197.aStringArray12[local29] + Class220.aStringArray13[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							aClass569_5 = new Class569(new Class592(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (aClass569_5 == null) {
				@Pc(81) RandomAccessFile local81 = new RandomAccessFile(local5, "rw");
				local29 = local81.read();
				local81.seek(0L);
				local81.write(local29);
				local81.seek(0L);
				local81.close();
				aClass569_5 = new Class569(new Class592(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(109) IOException local109) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "bo", descriptor = "(Lclient!ahb;)V", line = 422)
	public static void method22287(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass569_5.method32982(0L);
			aClass569_5.method32988(local2);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.method20248(local2, 0, 24);
	}

	@OriginalMember(owner = "client!pi", name = "bu", descriptor = "(Lclient!ahb;)V", line = 422)
	public static void method22291(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass569_5.method32982(0L);
			aClass569_5.method32988(local2);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.method20248(local2, 0, 24);
	}

	@OriginalMember(owner = "client!pi", name = "ba", descriptor = "(Lclient!ahb;)V", line = 422)
	public static void method22301(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass569_5.method32982(0L);
			aClass569_5.method32988(local2);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.method20248(local2, 0, 24);
	}

	@OriginalMember(owner = "client!pi", name = "bi", descriptor = "(Lclient!ahb;)V", line = 422)
	public static void method22324(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass569_5.method32982(0L);
			aClass569_5.method32988(local2);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.method20248(local2, 0, 24);
	}

	@OriginalMember(owner = "client!pi", name = "bc", descriptor = "(Lclient!ahb;I)V", line = 439)
	static void method22288(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (aClass569_5 == null) {
			return;
		}
		try {
			aClass569_5.method32982(0L);
			aClass569_5.method32984(arg0.aByteArray51, arg1, 24);
		} catch (@Pc(13) Exception local13) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "bn", descriptor = "(Ljava/lang/String;)V", line = 449)
	synchronized void method22289(@OriginalArg(0) String arg0) {
		Class212.aFrame2 = new Frame();
		Class212.aFrame2.setTitle(arg0);
		Class212.aFrame2.setResizable(true);
		Class212.aFrame2.addWindowListener(this);
		Class212.aFrame2.setBackground(Color.black);
		Class212.aFrame2.setVisible(true);
		Class212.aFrame2.toFront();
		@Pc(23) Insets local23 = Class212.aFrame2.getInsets();
		Class212.aFrame2.setSize(local23.right + anInt3026 * -2098608041 + local23.left, local23.bottom + local23.top + Class613.anInt5546 * -457495395);
	}

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "(Ljava/lang/String;B)V", line = 449)
	synchronized void method22295(@OriginalArg(0) String arg0) {
		Class212.aFrame2 = new Frame();
		Class212.aFrame2.setTitle(arg0);
		Class212.aFrame2.setResizable(true);
		Class212.aFrame2.addWindowListener(this);
		Class212.aFrame2.setBackground(Color.black);
		Class212.aFrame2.setVisible(true);
		Class212.aFrame2.toFront();
		@Pc(23) Insets local23 = Class212.aFrame2.getInsets();
		Class212.aFrame2.setSize(local23.right + anInt3026 * -2098608041 + local23.left, local23.bottom + local23.top + Class613.anInt5546 * -457495395);
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V", line = 461)
	synchronized void method22243() {
		this.method22315();
		@Pc(5) Container local5 = Class3_Sub45.method13019();
		Class106.aCanvas6 = new Canvas_Sub1(local5);
		this.method22282(local5);
	}

	@OriginalMember(owner = "client!pi", name = "bx", descriptor = "()Ljava/awt/Container;", line = 468)
	public static Container method22262() {
		if (Class350.aFrame3 == null) {
			return Class212.aFrame2 == null ? Class524.anApplet2 : Class212.aFrame2;
		} else {
			return Class350.aFrame3;
		}
	}

	@OriginalMember(owner = "client!pi", name = "be", descriptor = "()Ljava/awt/Container;", line = 468)
	public static Container method22290() {
		if (Class350.aFrame3 == null) {
			return Class212.aFrame2 == null ? Class524.anApplet2 : Class212.aFrame2;
		} else {
			return Class350.aFrame3;
		}
	}

	@OriginalMember(owner = "client!pi", name = "bh", descriptor = "(Ljava/awt/Container;)V", line = 474)
	void method22252(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class106.aCanvas6);
		Class106.aCanvas6.setSize(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
		Class106.aCanvas6.setVisible(true);
		if (Class212.aFrame2 == arg0) {
			@Pc(26) Insets local26 = Class212.aFrame2.getInsets();
			Class106.aCanvas6.setLocation(anInt3022 * 426445859 + local26.left, local26.top + anInt3024 * 2076797327);
		} else {
			Class106.aCanvas6.setLocation(anInt3022 * 426445859, anInt3024 * 2076797327);
		}
		Class106.aCanvas6.addFocusListener(this);
		Class106.aCanvas6.requestFocus();
		Canvas_Sub1.aBoolean481 = true;
		aBoolean560 = true;
		Class106.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean558 = true;
		aBoolean559 = false;
		aLong228 = Class176.method23413() * -1816811150761209135L;
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(Ljava/awt/Container;I)V", line = 474)
	void method22282(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class106.aCanvas6);
		Class106.aCanvas6.setSize(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
		Class106.aCanvas6.setVisible(true);
		if (Class212.aFrame2 == arg0) {
			@Pc(26) Insets local26 = Class212.aFrame2.getInsets();
			Class106.aCanvas6.setLocation(anInt3022 * 426445859 + local26.left, local26.top + anInt3024 * 2076797327);
		} else {
			Class106.aCanvas6.setLocation(anInt3022 * 426445859, anInt3024 * 2076797327);
		}
		Class106.aCanvas6.addFocusListener(this);
		Class106.aCanvas6.requestFocus();
		Canvas_Sub1.aBoolean481 = true;
		aBoolean560 = true;
		Class106.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean558 = true;
		aBoolean559 = false;
		aLong228 = Class176.method23413() * -1816811150761209135L;
	}

	@OriginalMember(owner = "client!pi", name = "bj", descriptor = "(Ljava/awt/Container;)V", line = 474)
	void method22292(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class106.aCanvas6);
		Class106.aCanvas6.setSize(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
		Class106.aCanvas6.setVisible(true);
		if (Class212.aFrame2 == arg0) {
			@Pc(26) Insets local26 = Class212.aFrame2.getInsets();
			Class106.aCanvas6.setLocation(anInt3022 * 426445859 + local26.left, local26.top + anInt3024 * 2076797327);
		} else {
			Class106.aCanvas6.setLocation(anInt3022 * 426445859, anInt3024 * 2076797327);
		}
		Class106.aCanvas6.addFocusListener(this);
		Class106.aCanvas6.requestFocus();
		Canvas_Sub1.aBoolean481 = true;
		aBoolean560 = true;
		Class106.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean558 = true;
		aBoolean559 = false;
		aLong228 = Class176.method23413() * -1816811150761209135L;
	}

	@OriginalMember(owner = "client!pi", name = "bq", descriptor = "(Ljava/awt/Container;)V", line = 474)
	void method22293(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class106.aCanvas6);
		Class106.aCanvas6.setSize(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
		Class106.aCanvas6.setVisible(true);
		if (Class212.aFrame2 == arg0) {
			@Pc(26) Insets local26 = Class212.aFrame2.getInsets();
			Class106.aCanvas6.setLocation(anInt3022 * 426445859 + local26.left, local26.top + anInt3024 * 2076797327);
		} else {
			Class106.aCanvas6.setLocation(anInt3022 * 426445859, anInt3024 * 2076797327);
		}
		Class106.aCanvas6.addFocusListener(this);
		Class106.aCanvas6.requestFocus();
		Canvas_Sub1.aBoolean481 = true;
		aBoolean560 = true;
		Class106.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean558 = true;
		aBoolean559 = false;
		aLong228 = Class176.method23413() * -1816811150761209135L;
	}

	@OriginalMember(owner = "client!pi", name = "bv", descriptor = "()V", line = 495)
	void method22294() {
		if (Class106.aCanvas6 != null) {
			Class106.aCanvas6.removeFocusListener(this);
			Class106.aCanvas6.getParent().setBackground(Color.black);
			Class106.aCanvas6.getParent().remove(Class106.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "(I)V", line = 495)
	void method22315() {
		if (Class106.aCanvas6 != null) {
			Class106.aCanvas6.removeFocusListener(this);
			Class106.aCanvas6.getParent().setBackground(Color.black);
			Class106.aCanvas6.getParent().remove(Class106.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "(I)Z", line = 503)
	final boolean method22286() {
		@Pc(4) String local4 = Class524.anApplet2.getDocumentBase().getHost().toLowerCase();
		if (local4.equals("jagex.com") || local4.endsWith(".jagex.com")) {
			return true;
		} else if (local4.equals("runescape.com") || local4.endsWith(".runescape.com")) {
			return true;
		} else if (local4.equals("stellardawn.com") || local4.endsWith(".stellardawn.com")) {
			return true;
		} else if (local4.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local4.length() > 0 && local4.charAt(local4.length() - 1) >= '0' && local4.charAt(local4.length() - 1) <= '9') {
				local4 = local4.substring(0, local4.length() - 1);
			}
			if (local4.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method22257("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "run", descriptor = "()V", line = 517)
	@Override
	public void run() {
		try {
			this.method22268();
		} catch (@Pc(8) ThreadDeath local8) {
			throw local8;
		} catch (@Pc(11) Throwable local11) {
			Class27_Sub1.method7214(this.method22248(), local11);
			this.method22257("crash");
		} finally {
			this.method22265();
		}
	}

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "()V", line = 517)
	public void method22263() {
		try {
			this.method22268();
		} catch (@Pc(8) ThreadDeath local8) {
			throw local8;
		} catch (@Pc(11) Throwable local11) {
			Class27_Sub1.method7214(this.method22248(), local11);
			this.method22257("crash");
		} finally {
			this.method22265();
		}
	}

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "()V", line = 517)
	public void method22312() {
		try {
			this.method22268();
		} catch (@Pc(8) ThreadDeath local8) {
			throw local8;
		} catch (@Pc(11) Throwable local11) {
			Class27_Sub1.method7214(this.method22248(), local11);
			this.method22257("crash");
		} finally {
			this.method22265();
		}
	}

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "(I)V", line = 533)
	void method22268() {
		if (Class67.aString65 != null) {
			@Pc(5) String local5 = Class67.aString65.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class498.aString228;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method22257("wrongjava");
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class85.method21638(local17.charAt(local72)); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class469.method28756(local89) && Class70.method33883(local89) < 10) {
						this.method22257("wrongjava");
						return;
					}
				}
			}
		}
		Class3_Sub45.method13019().setFocusCycleRoot(true);
		anInt3031 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 331442163;
		anInt3018 = Runtime.getRuntime().availableProcessors() * -835241639;
		this.method22243();
		this.method22253();
		Class265.aClass47_1 = Class273.method25343();
		while (aLong230 * 5859039317603751785L == 0L || Class176.method23413() < aLong230 * 5859039317603751785L) {
			anInt3021 = Class265.aClass47_1.method9222(aLong229 * -6807432894711606595L) * 596417091;
			for (@Pc(154) int local154 = 0; local154 < anInt3021 * -1444085141; local154++) {
				this.method22344();
			}
			this.method22237();
			Class482.method29095(Class106.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!pi", name = "ck", descriptor = "()V", line = 533)
	void method22296() {
		if (Class67.aString65 != null) {
			@Pc(5) String local5 = Class67.aString65.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class498.aString228;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method22257("wrongjava");
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class85.method21638(local17.charAt(local72)); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class469.method28756(local89) && Class70.method33883(local89) < 10) {
						this.method22257("wrongjava");
						return;
					}
				}
			}
		}
		Class3_Sub45.method13019().setFocusCycleRoot(true);
		anInt3031 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 331442163;
		anInt3018 = Runtime.getRuntime().availableProcessors() * -835241639;
		this.method22243();
		this.method22253();
		Class265.aClass47_1 = Class273.method25343();
		while (aLong230 * 5859039317603751785L == 0L || Class176.method23413() < aLong230 * 5859039317603751785L) {
			anInt3021 = Class265.aClass47_1.method9222(aLong229 * -6807432894711606595L) * 596417091;
			for (@Pc(154) int local154 = 0; local154 < anInt3021 * -1444085141; local154++) {
				this.method22344();
			}
			this.method22237();
			Class482.method29095(Class106.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!pi", name = "bz", descriptor = "()V", line = 533)
	void method22332() {
		if (Class67.aString65 != null) {
			@Pc(5) String local5 = Class67.aString65.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class498.aString228;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method22257("wrongjava");
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class85.method21638(local17.charAt(local72)); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class469.method28756(local89) && Class70.method33883(local89) < 10) {
						this.method22257("wrongjava");
						return;
					}
				}
			}
		}
		Class3_Sub45.method13019().setFocusCycleRoot(true);
		anInt3031 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 331442163;
		anInt3018 = Runtime.getRuntime().availableProcessors() * -835241639;
		this.method22243();
		this.method22253();
		Class265.aClass47_1 = Class273.method25343();
		while (aLong230 * 5859039317603751785L == 0L || Class176.method23413() < aLong230 * 5859039317603751785L) {
			anInt3021 = Class265.aClass47_1.method9222(aLong229 * -6807432894711606595L) * 596417091;
			for (@Pc(154) int local154 = 0; local154 < anInt3021 * -1444085141; local154++) {
				this.method22344();
			}
			this.method22237();
			Class482.method29095(Class106.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!pi", name = "cm", descriptor = "(Ljava/lang/Object;)V", line = 567)
	static void method22297(@OriginalArg(0) Object arg0) {
		if (Class155.anEventQueue1 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 50 && Class155.anEventQueue1.peekEvent() != null; local4++) {
			Class60_Sub11.method13407(1L);
		}
		try {
			if (arg0 != null) {
				Class155.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "cj", descriptor = "()V", line = 576)
	void method22298() {
		@Pc(2) long local2 = Class176.method23413();
		@Pc(8) long local8 = aLongArray12[anInt3030 * -1554677709];
		aLongArray12[anInt3030 * -1554677709] = local2;
		anInt3030 = (anInt3030 * -1554677709 + 1 & 0x1F) * -1801356549;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Canvas_Sub1.aBoolean481 = aBoolean560;
		}
		this.method22254();
	}

	@OriginalMember(owner = "client!pi", name = "cu", descriptor = "()V", line = 576)
	void method22299() {
		@Pc(2) long local2 = Class176.method23413();
		@Pc(8) long local8 = aLongArray12[anInt3030 * -1554677709];
		aLongArray12[anInt3030 * -1554677709] = local2;
		anInt3030 = (anInt3030 * -1554677709 + 1 & 0x1F) * -1801356549;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Canvas_Sub1.aBoolean481 = aBoolean560;
		}
		this.method22254();
	}

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "(B)V", line = 576)
	void method22344() {
		@Pc(2) long local2 = Class176.method23413();
		@Pc(8) long local8 = aLongArray12[anInt3030 * -1554677709];
		aLongArray12[anInt3030 * -1554677709] = local2;
		anInt3030 = (anInt3030 * -1554677709 + 1 & 0x1F) * -1801356549;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Canvas_Sub1.aBoolean481 = aBoolean560;
		}
		this.method22254();
	}

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "(I)V", line = 588)
	void method22237() {
		@Pc(2) long local2 = Class176.method23413();
		@Pc(12) long local12 = aLongArray11[Class453.anInt5057 * -425897209 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray11[Class453.anInt5057 * -425897209];
		aLongArray11[Class453.anInt5057 * -425897209] = local2;
		Class453.anInt5057 = (-425897209 * Class453.anInt5057 + 1 & 0x1F) * -1549686089;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3027 = (int) (local2 - local12) * 1937012841;
			anInt3019 = ((local47 >> 1) + 32000) / local47 * -415716141;
		}
		if ((anInt3023 += -423287461) * -272727341 - 1 > 50) {
			anInt3023 -= 310463430;
			aBoolean558 = true;
			Class106.aCanvas6.setSize(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
			Class106.aCanvas6.setVisible(true);
			if (Class212.aFrame2 != null && Class350.aFrame3 == null) {
				@Pc(100) Insets local100 = Class212.aFrame2.getInsets();
				Class106.aCanvas6.setLocation(local100.left + anInt3022 * 426445859, local100.top + anInt3024 * 2076797327);
			} else {
				Class106.aCanvas6.setLocation(anInt3022 * 426445859, anInt3024 * 2076797327);
			}
		}
		this.method22255();
	}

	@OriginalMember(owner = "client!pi", name = "cv", descriptor = "()V", line = 588)
	void method22285() {
		@Pc(2) long local2 = Class176.method23413();
		@Pc(12) long local12 = aLongArray11[Class453.anInt5057 * -425897209 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray11[Class453.anInt5057 * -425897209];
		aLongArray11[Class453.anInt5057 * -425897209] = local2;
		Class453.anInt5057 = (-425897209 * Class453.anInt5057 + 1 & 0x1F) * -1549686089;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3027 = (int) (local2 - local12) * 1937012841;
			anInt3019 = ((local47 >> 1) + 32000) / local47 * -415716141;
		}
		if ((anInt3023 += -423287461) * -272727341 - 1 > 50) {
			anInt3023 -= 310463430;
			aBoolean558 = true;
			Class106.aCanvas6.setSize(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
			Class106.aCanvas6.setVisible(true);
			if (Class212.aFrame2 != null && Class350.aFrame3 == null) {
				@Pc(100) Insets local100 = Class212.aFrame2.getInsets();
				Class106.aCanvas6.setLocation(local100.left + anInt3022 * 426445859, local100.top + anInt3024 * 2076797327);
			} else {
				Class106.aCanvas6.setLocation(anInt3022 * 426445859, anInt3024 * 2076797327);
			}
		}
		this.method22255();
	}

	@OriginalMember(owner = "client!pi", name = "cl", descriptor = "()V", line = 588)
	void method22340() {
		@Pc(2) long local2 = Class176.method23413();
		@Pc(12) long local12 = aLongArray11[Class453.anInt5057 * -425897209 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray11[Class453.anInt5057 * -425897209];
		aLongArray11[Class453.anInt5057 * -425897209] = local2;
		Class453.anInt5057 = (-425897209 * Class453.anInt5057 + 1 & 0x1F) * -1549686089;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3027 = (int) (local2 - local12) * 1937012841;
			anInt3019 = ((local47 >> 1) + 32000) / local47 * -415716141;
		}
		if ((anInt3023 += -423287461) * -272727341 - 1 > 50) {
			anInt3023 -= 310463430;
			aBoolean558 = true;
			Class106.aCanvas6.setSize(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
			Class106.aCanvas6.setVisible(true);
			if (Class212.aFrame2 != null && Class350.aFrame3 == null) {
				@Pc(100) Insets local100 = Class212.aFrame2.getInsets();
				Class106.aCanvas6.setLocation(local100.left + anInt3022 * 426445859, local100.top + anInt3024 * 2076797327);
			} else {
				Class106.aCanvas6.setLocation(anInt3022 * 426445859, anInt3024 * 2076797327);
			}
		}
		this.method22255();
	}

	@OriginalMember(owner = "client!pi", name = "ag", descriptor = "()Ljava/lang/String;", line = 613)
	String method22246() {
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "(I)Ljava/lang/String;", line = 613)
	String method22248() {
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(ZB)V", line = 617)
	final void method22265() {
		synchronized (this) {
			if (aBoolean561) {
				return;
			}
			aBoolean561 = true;
		}
		try {
			this.method22256();
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass569_4.method32981();
			for (@Pc(28) int local28 = 0; local28 < Class341.anInt4603 * 1043108251; local28++) {
				Class3_Sub18_Sub2.aClass569Array1[local28].method32981();
			}
			aClass569_6.method32981();
			aClass569_5.method32981();
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean557) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class17.method3595()) {
			Class289.method25518().method27789();
		}
		if (Class106.aCanvas6 != null) {
			try {
				Class106.aCanvas6.removeFocusListener(this);
				Class106.aCanvas6.getParent().remove(Class106.aCanvas6);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Class212.aFrame2 != null) {
			Class212.aFrame2.setVisible(false);
			Class212.aFrame2.dispose();
			Class212.aFrame2 = null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "cq", descriptor = "(Z)V", line = 617)
	final void method22302() {
		synchronized (this) {
			if (aBoolean561) {
				return;
			}
			aBoolean561 = true;
		}
		try {
			this.method22256();
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass569_4.method32981();
			for (@Pc(28) int local28 = 0; local28 < Class341.anInt4603 * 1043108251; local28++) {
				Class3_Sub18_Sub2.aClass569Array1[local28].method32981();
			}
			aClass569_6.method32981();
			aClass569_5.method32981();
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean557) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class17.method3595()) {
			Class289.method25518().method27789();
		}
		if (Class106.aCanvas6 != null) {
			try {
				Class106.aCanvas6.removeFocusListener(this);
				Class106.aCanvas6.getParent().remove(Class106.aCanvas6);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Class212.aFrame2 != null) {
			Class212.aFrame2.setVisible(false);
			Class212.aFrame2.dispose();
			Class212.aFrame2 = null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "cg", descriptor = "(Z)V", line = 617)
	final void method22303() {
		synchronized (this) {
			if (aBoolean561) {
				return;
			}
			aBoolean561 = true;
		}
		try {
			this.method22256();
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass569_4.method32981();
			for (@Pc(28) int local28 = 0; local28 < Class341.anInt4603 * 1043108251; local28++) {
				Class3_Sub18_Sub2.aClass569Array1[local28].method32981();
			}
			aClass569_6.method32981();
			aClass569_5.method32981();
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean557) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class17.method3595()) {
			Class289.method25518().method27789();
		}
		if (Class106.aCanvas6 != null) {
			try {
				Class106.aCanvas6.removeFocusListener(this);
				Class106.aCanvas6.getParent().remove(Class106.aCanvas6);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Class212.aFrame2 != null) {
			Class212.aFrame2.setVisible(false);
			Class212.aFrame2.dispose();
			Class212.aFrame2 = null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "cp", descriptor = "()I", line = 656)
	public static final int method22304() {
		return (int) (1000000000L / (aLong229 * -6807432894711606595L));
	}

	@OriginalMember(owner = "client!pi", name = "cc", descriptor = "()I", line = 656)
	public static final int method22305() {
		return (int) (1000000000L / (aLong229 * -6807432894711606595L));
	}

	@OriginalMember(owner = "client!pi", name = "cs", descriptor = "()I", line = 656)
	public static final int method22306() {
		return (int) (1000000000L / (aLong229 * -6807432894711606595L));
	}

	@OriginalMember(owner = "client!pi", name = "ct", descriptor = "()V", line = 660)
	public static final void method22307() {
		Class265.aClass47_1.method9221();
		@Pc(4) int local4;
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray11[local4] = 0L;
		}
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray12[local4] = 0L;
		}
		anInt3021 = 0;
	}

	@OriginalMember(owner = "client!pi", name = "cx", descriptor = "()V", line = 660)
	public static final void method22308() {
		Class265.aClass47_1.method9221();
		@Pc(4) int local4;
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray11[local4] = 0L;
		}
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray12[local4] = 0L;
		}
		anInt3021 = 0;
	}

	@OriginalMember(owner = "client!pi", name = "cy", descriptor = "()J", line = 667)
	static long method22309() {
		return Class265.aClass47_1.method9226();
	}

	@OriginalMember(owner = "client!pi", name = "cb", descriptor = "()J", line = 667)
	static long method22348() {
		return Class265.aClass47_1.method9226();
	}

	@OriginalMember(owner = "client!pi", name = "start", descriptor = "()V", line = 671)
	@Override
	public void start() {
		if (!aBoolean561) {
			aLong230 = 0L;
		}
	}

	@OriginalMember(owner = "client!pi", name = "cz", descriptor = "()V", line = 671)
	@Override
	public void method22223() {
		if (!aBoolean561) {
			aLong230 = 0L;
		}
	}

	@OriginalMember(owner = "client!pi", name = "stop", descriptor = "()V", line = 676)
	@Override
	public void stop() {
		if (!aBoolean561) {
			aLong230 = (Class176.method23413() + 4000L) * 6534530727889103065L;
		}
	}

	@OriginalMember(owner = "client!pi", name = "cn", descriptor = "()V", line = 676)
	@Override
	public void method22226() {
		if (!aBoolean561) {
			aLong230 = (Class176.method23413() + 4000L) * 6534530727889103065L;
		}
	}

	@OriginalMember(owner = "client!pi", name = "destroy", descriptor = "()V", line = 681)
	@Override
	public void destroy() {
		if (!aBoolean561) {
			aLong230 = Class176.method23413() * 6534530727889103065L;
			Class60_Sub11.method13407(5000L);
			this.method22265();
		}
	}

	@OriginalMember(owner = "client!pi", name = "co", descriptor = "()V", line = 681)
	@Override
	public void method22227() {
		if (!aBoolean561) {
			aLong230 = Class176.method23413() * 6534530727889103065L;
			Class60_Sub11.method13407(5000L);
			this.method22265();
		}
	}

	@OriginalMember(owner = "client!pi", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 688)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pi", name = "ch", descriptor = "(Ljava/awt/Graphics;)V", line = 688)
	@Override
	public final void method22229(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pi", name = "cd", descriptor = "(Ljava/awt/Graphics;)V", line = 688)
	@Override
	public final void method22224(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pi", name = "ce", descriptor = "(Ljava/awt/Graphics;)V", line = 692)
	@Override
	public final synchronized void method22233(@OriginalArg(0) Graphics arg0) {
		if (aBoolean561) {
			return;
		}
		aBoolean558 = true;
		if (Class176.method23413() - aLong228 * -3623480615598111183L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= anInt3026 * -2098608041 && local16.height >= Class613.anInt5546 * -457495395) {
				aBoolean559 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 692)
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (aBoolean561) {
			return;
		}
		aBoolean558 = true;
		if (Class176.method23413() - aLong228 * -3623480615598111183L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= anInt3026 * -2098608041 && local16.height >= Class613.anInt5546 * -457495395) {
				aBoolean559 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "ci", descriptor = "(Ljava/awt/Graphics;)V", line = 692)
	@Override
	public final synchronized void method22228(@OriginalArg(0) Graphics arg0) {
		if (aBoolean561) {
			return;
		}
		aBoolean558 = true;
		if (Class176.method23413() - aLong228 * -3623480615598111183L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= anInt3026 * -2098608041 && local16.height >= Class613.anInt5546 * -457495395) {
				aBoolean559 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "ca", descriptor = "(Ljava/awt/Graphics;)V", line = 692)
	@Override
	public final synchronized void method22231(@OriginalArg(0) Graphics arg0) {
		if (aBoolean561) {
			return;
		}
		aBoolean558 = true;
		if (Class176.method23413() - aLong228 * -3623480615598111183L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= anInt3026 * -2098608041 && local16.height >= Class613.anInt5546 * -457495395) {
				aBoolean559 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "cr", descriptor = "(Ljava/awt/Graphics;)V", line = 692)
	@Override
	public final synchronized void method22232(@OriginalArg(0) Graphics arg0) {
		if (aBoolean561) {
			return;
		}
		aBoolean558 = true;
		if (Class176.method23413() - aLong228 * -3623480615598111183L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= anInt3026 * -2098608041 && local16.height >= Class613.anInt5546 * -457495395) {
				aBoolean559 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 701)
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		aBoolean560 = true;
		aBoolean558 = true;
	}

	@OriginalMember(owner = "client!pi", name = "cw", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 706)
	public final void method22235(@OriginalArg(0) FocusEvent arg0) {
		aBoolean560 = false;
	}

	@OriginalMember(owner = "client!pi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 706)
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		aBoolean560 = false;
	}

	@OriginalMember(owner = "client!pi", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 709)
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "cf", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 709)
	public final void method22316(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 710)
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "dv", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 710)
	public final void method22317(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "df", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 710)
	public final void method22318(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "dh", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 710)
	public final void method22319(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 713)
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		aBoolean563 = true;
		this.destroy();
	}

	@OriginalMember(owner = "client!pi", name = "db", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 713)
	public final void method22320(@OriginalArg(0) WindowEvent arg0) {
		aBoolean563 = true;
		this.destroy();
	}

	@OriginalMember(owner = "client!pi", name = "dp", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 713)
	public final void method22321(@OriginalArg(0) WindowEvent arg0) {
		aBoolean563 = true;
		this.destroy();
	}

	@OriginalMember(owner = "client!pi", name = "dk", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 717)
	public final void method22242(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 717)
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "dg", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 718)
	public final void method22244(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "dq", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 718)
	public final void method22247(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 718)
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "dy", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 718)
	public final void method22322(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 719)
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "dt", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 719)
	public final void method22269(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "dd", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 719)
	public final void method22323(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "ds", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 719)
	public final void method22325(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "dr", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 719)
	public final void method22326(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "dc", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 719)
	public final void method22327(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 720)
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "dz", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 720)
	public final void method22313(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "da", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 720)
	public final void method22330(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pi", name = "du", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", line = 729)
	public static final void method22264(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Class106.aCanvas6.getGraphics();
			if (Class410.aFont2 == null) {
				Class410.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(76) int local76;
			@Pc(84) int local84;
			try {
				if (Class160.anImage4 == null) {
					Class160.anImage4 = Class106.aCanvas6.createImage(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
				}
				@Pc(55) Graphics local55 = Class160.anImage4.getGraphics();
				local55.setColor(Color.black);
				local55.fillRect(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
				local76 = Class128.anInt3317 * 2037417253 / 2 - 152;
				local84 = Class575.anInt5428 * 1261116487 / 2 - 18;
				local55.setColor(arg3);
				local55.drawRect(local76, local84, 303, 33);
				local55.setColor(arg2);
				local55.fillRect(local76 + 2, local84 + 2, arg0 * 3, 30);
				local55.setColor(Color.black);
				local55.drawRect(local76 + 1, local84 + 1, 301, 31);
				local55.fillRect(arg0 * 3 + local76 + 2, local84 + 2, 300 - arg0 * 3, 30);
				local55.setFont(Class410.aFont2);
				local55.setColor(arg4);
				local55.drawString(arg1, local76 + (304 - arg1.length() * 6) / 2, local84 + 22);
				if (aString139 != null) {
					local55.setFont(Class410.aFont2);
					local55.setColor(arg4);
					local55.drawString(aString139, Class128.anInt3317 * 2037417253 / 2 - aString139.length() * 6 / 2, Class575.anInt5428 * 1261116487 / 2 - 26);
				}
				local2.drawImage(Class160.anImage4, 0, 0, null);
			} catch (@Pc(201) Exception local201) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
				local76 = Class128.anInt3317 * 2037417253 / 2 - 152;
				local84 = Class575.anInt5428 * 1261116487 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local76, local84, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local76 + 2, local84 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local76 + 1, local84 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + 2 + local76, local84 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class410.aFont2);
				local2.setColor(arg4);
				if (aString139 != null) {
					local2.setFont(Class410.aFont2);
					local2.setColor(arg4);
					local2.drawString(aString139, Class128.anInt3317 * 2037417253 / 2 - aString139.length() * 6 / 2, Class575.anInt5428 * 1261116487 / 2 - 26);
				}
				local2.drawString(arg1, local76 + (304 - arg1.length() * 6) / 2, local84 + 22);
			}
		} catch (@Pc(339) Exception local339) {
			Class106.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!pi", name = "do", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", line = 729)
	public static final void method22278(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Class106.aCanvas6.getGraphics();
			if (Class410.aFont2 == null) {
				Class410.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(76) int local76;
			@Pc(84) int local84;
			try {
				if (Class160.anImage4 == null) {
					Class160.anImage4 = Class106.aCanvas6.createImage(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
				}
				@Pc(55) Graphics local55 = Class160.anImage4.getGraphics();
				local55.setColor(Color.black);
				local55.fillRect(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
				local76 = Class128.anInt3317 * 2037417253 / 2 - 152;
				local84 = Class575.anInt5428 * 1261116487 / 2 - 18;
				local55.setColor(arg3);
				local55.drawRect(local76, local84, 303, 33);
				local55.setColor(arg2);
				local55.fillRect(local76 + 2, local84 + 2, arg0 * 3, 30);
				local55.setColor(Color.black);
				local55.drawRect(local76 + 1, local84 + 1, 301, 31);
				local55.fillRect(arg0 * 3 + local76 + 2, local84 + 2, 300 - arg0 * 3, 30);
				local55.setFont(Class410.aFont2);
				local55.setColor(arg4);
				local55.drawString(arg1, local76 + (304 - arg1.length() * 6) / 2, local84 + 22);
				if (aString139 != null) {
					local55.setFont(Class410.aFont2);
					local55.setColor(arg4);
					local55.drawString(aString139, Class128.anInt3317 * 2037417253 / 2 - aString139.length() * 6 / 2, Class575.anInt5428 * 1261116487 / 2 - 26);
				}
				local2.drawImage(Class160.anImage4, 0, 0, null);
			} catch (@Pc(201) Exception local201) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
				local76 = Class128.anInt3317 * 2037417253 / 2 - 152;
				local84 = Class575.anInt5428 * 1261116487 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local76, local84, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local76 + 2, local84 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local76 + 1, local84 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + 2 + local76, local84 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class410.aFont2);
				local2.setColor(arg4);
				if (aString139 != null) {
					local2.setFont(Class410.aFont2);
					local2.setColor(arg4);
					local2.drawString(aString139, Class128.anInt3317 * 2037417253 / 2 - aString139.length() * 6 / 2, Class575.anInt5428 * 1261116487 / 2 - 26);
				}
				local2.drawString(arg1, local76 + (304 - arg1.length() * 6) / 2, local84 + 22);
			}
		} catch (@Pc(339) Exception local339) {
			Class106.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!pi", name = "di", descriptor = "()V", line = 788)
	public static final void method22337() {
		Class160.anImage4 = null;
		Class410.aFont2 = null;
	}

	@OriginalMember(owner = "client!pi", name = "ai", descriptor = "(Ljava/lang/String;B)V", line = 793)
	void method22257(@OriginalArg(0) String arg0) {
		if (this.aBoolean562) {
			return;
		}
		this.aBoolean562 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class588.method33291(Class524.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class524.anApplet2.getAppletContext().showDocument(new URL(Class524.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "dn", descriptor = "(Ljava/lang/String;)V", line = 793)
	void method22338(@OriginalArg(0) String arg0) {
		if (this.aBoolean562) {
			return;
		}
		this.aBoolean562 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class588.method33291(Class524.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class524.anApplet2.getAppletContext().showDocument(new URL(Class524.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "ee", descriptor = "(Ljava/lang/String;)V", line = 793)
	void method22339(@OriginalArg(0) String arg0) {
		if (this.aBoolean562) {
			return;
		}
		this.aBoolean562 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class588.method33291(Class524.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class524.anApplet2.getAppletContext().showDocument(new URL(Class524.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "aq", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 807)
	void method22258(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (this.aBoolean562) {
			return;
		}
		this.aBoolean562 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class588.method33291(Class524.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class524.anApplet2.getAppletContext().showDocument(new URL(Class524.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "ex", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V", line = 807)
	void method22266(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (this.aBoolean562) {
			return;
		}
		this.aBoolean562 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class588.method33291(Class524.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class524.anApplet2.getAppletContext().showDocument(new URL(Class524.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "av", descriptor = "(I)V", line = 821)
	public void method22259() throws Exception_Sub6 {
		if (this.aBoolean557) {
			return;
		}
		Class289.method25518().method27797("jaclib");
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class344.aString208.startsWith("win")) {
				throw new Exception_Sub6(128, "jaclib");
			}
		}
		this.aBoolean557 = true;
	}

	@OriginalMember(owner = "client!pi", name = "eb", descriptor = "()V", line = 821)
	public void method22341() throws Exception_Sub6 {
		if (this.aBoolean557) {
			return;
		}
		Class289.method25518().method27797("jaclib");
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class344.aString208.startsWith("win")) {
				throw new Exception_Sub6(128, "jaclib");
			}
		}
		this.aBoolean557 = true;
	}

	@OriginalMember(owner = "client!pi", name = "ef", descriptor = "()V", line = 821)
	public void method22342() throws Exception_Sub6 {
		if (this.aBoolean557) {
			return;
		}
		Class289.method25518().method27797("jaclib");
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class344.aString208.startsWith("win")) {
				throw new Exception_Sub6(128, "jaclib");
			}
		}
		this.aBoolean557 = true;
	}

	@OriginalMember(owner = "client!pi", name = "ax", descriptor = "(I)V", line = 833)
	public void method22260() throws Exception_Sub6 {
		if (!this.aBoolean564) {
			Class289.method25518().method27797("jagtheora");
			this.aBoolean564 = true;
		}
	}

	@OriginalMember(owner = "client!pi", name = "ey", descriptor = "()V", line = 833)
	public void method22343() throws Exception_Sub6 {
		if (!this.aBoolean564) {
			Class289.method25518().method27797("jagtheora");
			this.aBoolean564 = true;
		}
	}

	@OriginalMember(owner = "client!pi", name = "az", descriptor = "(Lclient!ph;ZI)V", line = 839)
	void method22261(@OriginalArg(0) Class389 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class389.aClass389_4 == arg0 || arg0 == Class389.aClass389_3) {
			aClass389_2 = arg0;
			if (Class389.aClass389_3 != aClass389_2 && arg1) {
				aClass389_2 = Class389.aClass389_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!pi", name = "er", descriptor = "(Lclient!ph;Z)V", line = 839)
	void method22310(@OriginalArg(0) Class389 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class389.aClass389_4 == arg0 || arg0 == Class389.aClass389_3) {
			aClass389_2 = arg0;
			if (Class389.aClass389_3 != aClass389_2 && arg1) {
				aClass389_2 = Class389.aClass389_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!pi", name = "ej", descriptor = "(Lclient!ph;Z)V", line = 839)
	void method22345(@OriginalArg(0) Class389 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class389.aClass389_4 == arg0 || arg0 == Class389.aClass389_3) {
			aClass389_2 = arg0;
			if (Class389.aClass389_3 != aClass389_2 && arg1) {
				aClass389_2 = Class389.aClass389_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!pi", name = "em", descriptor = "()Lclient!ph;", line = 855)
	public static Class389 method22251() {
		return aClass389_2;
	}

	@OriginalMember(owner = "client!pi", name = "ec", descriptor = "()Lclient!ph;", line = 855)
	public static Class389 method22331() {
		return aClass389_2;
	}

	@OriginalMember(owner = "client!pi", name = "en", descriptor = "()Lclient!ph;", line = 855)
	public static Class389 method22346() {
		return aClass389_2;
	}

	@OriginalMember(owner = "client!pi", name = "ew", descriptor = "()Lclient!ph;", line = 855)
	public static Class389 method22347() {
		return aClass389_2;
	}

	@OriginalMember(owner = "client!pi", name = "ea", descriptor = "()Lclient!ph;", line = 855)
	public static Class389 method22350() {
		return aClass389_2;
	}

	@OriginalMember(owner = "client!pi", name = "fm", descriptor = "(ZI)V", line = 1892)
	static void method22354(@OriginalArg(0) boolean arg0) {
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
			client.anInt3125 = Class630.aClass493_1.anInt5222 * -927697897;
			if (client.anInt3125 * -1579500007 != -1) {
				Class298.method25633(false);
				Class401.method27608();
				Class331.method26182(client.anInt3125 * -1579500007, null);
			}
		}
		Class190.aBoolean661 = true;
	}

	@OriginalMember(owner = "client!pi", name = "jy", descriptor = "(Lclient!vs;I)V", line = 5730)
	static final void method22353(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		RuntimeException_Sub1.method20141(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!pi", name = "xg", descriptor = "(Lclient!vs;I)V", line = 8353)
	static final void method22352(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		Class107.method21925(local13);
	}

	@OriginalMember(owner = "client!pi", name = "aff", descriptor = "(Lclient!vs;B)V", line = 9873)
	static final void method22355(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
	}

	@OriginalMember(owner = "client!pi", name = "dj", descriptor = "()V")
	abstract void method22236();

	@OriginalMember(owner = "client!pi", name = "ap", descriptor = "()V")
	abstract void method22250();

	@OriginalMember(owner = "client!pi", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!pi", name = "ak", descriptor = "(I)V")
	abstract void method22253();

	@OriginalMember(owner = "client!pi", name = "aa", descriptor = "(I)V")
	abstract void method22254();

	@OriginalMember(owner = "client!pi", name = "ah", descriptor = "(I)V")
	abstract void method22255();

	@OriginalMember(owner = "client!pi", name = "an", descriptor = "(B)V")
	abstract void method22256();

	@OriginalMember(owner = "client!pi", name = "au", descriptor = "()V")
	abstract void method22267();

	@OriginalMember(owner = "client!pi", name = "dl", descriptor = "()V")
	public abstract void method22230();

	@OriginalMember(owner = "client!pi", name = "ay", descriptor = "()V")
	abstract void method22284();

	@OriginalMember(owner = "client!pi", name = "ao", descriptor = "()V")
	abstract void method22314();

	@OriginalMember(owner = "client!pi", name = "de", descriptor = "()V")
	public abstract void method22234();

	@OriginalMember(owner = "client!pi", name = "dx", descriptor = "()V")
	abstract void method22333();

	@OriginalMember(owner = "client!pi", name = "dm", descriptor = "()V")
	abstract void method22334();

	@OriginalMember(owner = "client!pi", name = "dw", descriptor = "()V")
	abstract void method22335();

	@OriginalMember(owner = "client!pi", name = "ab", descriptor = "()V")
	abstract void method22349();
}
