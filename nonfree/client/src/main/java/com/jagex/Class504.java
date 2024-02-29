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

@OriginalClass("client!ra")
public abstract class Class504 implements Interface58, Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "Lclient!rf;")
	public static Class125 aClass125_2;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	static final int anInt3364 = 32;

	@OriginalMember(owner = "client!ra", name = "ah", descriptor = "Ljava/lang/String;")
	static final String aString147 = "main_file_cache.dat2";

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
	protected static int anInt3365;

	@OriginalMember(owner = "client!ra", name = "as", descriptor = "Ljava/lang/String;")
	static final String aString148 = "main_file_cache.idx";

	@OriginalMember(owner = "client!ra", name = "ac", descriptor = "Ljava/lang/String;")
	static final String aString149 = "rw";

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	static int anInt3368;

	@OriginalMember(owner = "client!ra", name = "ar", descriptor = "J")
	static final long aLong237 = 3221225472L;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
	static int anInt3369;

	@OriginalMember(owner = "client!ra", name = "ad", descriptor = "I")
	static final int anInt3370 = 1048576;

	@OriginalMember(owner = "client!ra", name = "ae", descriptor = "I")
	static int anInt3371;

	@OriginalMember(owner = "client!ra", name = "aq", descriptor = "Ljava/lang/String;")
	static final String aString150 = "main_file_cache.idx255";

	@OriginalMember(owner = "client!ra", name = "am", descriptor = "Ljava/lang/String;")
	static final String aString151 = "random.dat";

	@OriginalMember(owner = "client!ra", name = "az", descriptor = "I")
	static final int anInt3374 = 0;

	@OriginalMember(owner = "client!ra", name = "bc", descriptor = "I")
	static final int anInt3375 = 1;

	@OriginalMember(owner = "client!ra", name = "al", descriptor = "Lclient!aap;")
	protected static Class15 aClass15_2;

	@OriginalMember(owner = "client!ra", name = "bs", descriptor = "Ljava/lang/String;")
	public static String aString153;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "J")
	static long aLong235 = -1844158459144707328L;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	public static int anInt3362 = 0;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	public static int anInt3363 = 0;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "[J")
	static long[] aLongArray21 = new long[32];

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "[J")
	static long[] aLongArray22 = new long[32];

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public static int anInt3366 = 0;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
	public static int anInt3367 = 0;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Ljava/lang/String;")
	protected static String aString152 = null;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Z")
	protected static volatile boolean aBoolean582 = true;

	@OriginalMember(owner = "client!ra", name = "aj", descriptor = "I")
	static int anInt3373 = 1880039444;

	@OriginalMember(owner = "client!ra", name = "ai", descriptor = "Z")
	protected static volatile boolean aBoolean580 = false;

	@OriginalMember(owner = "client!ra", name = "ag", descriptor = "J")
	static volatile long aLong236 = 0L;

	@OriginalMember(owner = "client!ra", name = "ao", descriptor = "Z")
	protected static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!ra", name = "ak", descriptor = "Z")
	static volatile boolean aBoolean586 = true;

	@OriginalMember(owner = "client!ra", name = "ay", descriptor = "Lclient!abj;")
	static Class34 aClass34_4 = null;

	@OriginalMember(owner = "client!ra", name = "af", descriptor = "Lclient!abj;")
	protected static Class34 aClass34_5 = null;

	@OriginalMember(owner = "client!ra", name = "an", descriptor = "Lclient!abj;")
	protected static Class34 aClass34_6 = null;

	@OriginalMember(owner = "client!ra", name = "bj", descriptor = "Lclient!rl;")
	static Class513 aClass513_2 = null;

	@OriginalMember(owner = "client!ra", name = "bv", descriptor = "J")
	static long aLong238 = 0L;

	@OriginalMember(owner = "client!ra", name = "ba", descriptor = "Z")
	static boolean aBoolean585 = false;

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
	public static int anInt3376 = 1178222113;

	@OriginalMember(owner = "client!ra", name = "bd", descriptor = "I")
	public static int anInt3372 = -1640072939;

	@OriginalMember(owner = "client!ra", name = "bl", descriptor = "Z")
	boolean aBoolean584 = false;

	@OriginalMember(owner = "client!ra", name = "by", descriptor = "Z")
	boolean aBoolean583 = false;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 89)
	Class504() {
	}

	@OriginalMember(owner = "client!ra", name = "aw", descriptor = "(Ljava/applet/Applet;)V", line = 92)
	@Override
	public void method24841(@OriginalArg(0) Applet arg0) {
		Class331.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "ap", descriptor = "(Ljava/applet/Applet;)V", line = 92)
	@Override
	public void method24832(@OriginalArg(0) Applet arg0) {
		Class331.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "supplyApplet", descriptor = "(Ljava/applet/Applet;)V", line = 92)
	@Override
	public void supplyApplet(@OriginalArg(0) Applet arg0) {
		Class331.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "(Lclient!rw;Ljava/lang/String;Ljava/lang/String;IIIIZB)V", line = 97)
	final void method24844(@OriginalArg(0) Class522 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method24946(Class513.aClass513_3, arg7);
			Class402.anInt4694 = (Class149_Sub4.anInt2368 = arg0.method30609() * 919220057) * 298502761;
			anInt3365 = (Class19.anInt108 = arg0.method30610() * 533696347) * -98449983;
			anInt3366 = 0;
			anInt3367 = 0;
			if (Class335.method27670() == Class513.aClass513_5) {
				Class402.anInt4694 += arg0.method30611() * -1895347454;
				anInt3365 += arg0.method30613() * 453915958;
				this.method24873(arg0.method30620());
			}
			RuntimeException_Sub1.anApplet1 = Class331.anApplet2;
			this.method24849(arg1, arg2, arg3, arg4, arg5, arg6);
		} catch (@Pc(67) Throwable local67) {
			Class293.method27014(null, local67);
			this.method24936("crash");
		}
	}

	@OriginalMember(owner = "client!ra", name = "az", descriptor = "(Lclient!rw;Ljava/lang/String;Ljava/lang/String;IIIIZ)V", line = 97)
	final void method24845(@OriginalArg(0) Class522 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method24946(Class513.aClass513_3, arg7);
			Class402.anInt4694 = (Class149_Sub4.anInt2368 = arg0.method30609() * 919220057) * 298502761;
			anInt3365 = (Class19.anInt108 = arg0.method30610() * 533696347) * -98449983;
			anInt3366 = 0;
			anInt3367 = 0;
			if (Class335.method27670() == Class513.aClass513_5) {
				Class402.anInt4694 += arg0.method30611() * -1895347454;
				anInt3365 += arg0.method30613() * 453915958;
				this.method24873(arg0.method30620());
			}
			RuntimeException_Sub1.anApplet1 = Class331.anApplet2;
			this.method24849(arg1, arg2, arg3, arg4, arg5, arg6);
		} catch (@Pc(67) Throwable local67) {
			Class293.method27014(null, local67);
			this.method24936("crash");
		}
	}

	@OriginalMember(owner = "client!ra", name = "bc", descriptor = "(Lclient!rw;Ljava/lang/String;Ljava/lang/String;IIIIZ)V", line = 97)
	final void method24846(@OriginalArg(0) Class522 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method24946(Class513.aClass513_3, arg7);
			Class402.anInt4694 = (Class149_Sub4.anInt2368 = arg0.method30609() * 919220057) * 298502761;
			anInt3365 = (Class19.anInt108 = arg0.method30610() * 533696347) * -98449983;
			anInt3366 = 0;
			anInt3367 = 0;
			if (Class335.method27670() == Class513.aClass513_5) {
				Class402.anInt4694 += arg0.method30611() * -1895347454;
				anInt3365 += arg0.method30613() * 453915958;
				this.method24873(arg0.method30620());
			}
			RuntimeException_Sub1.anApplet1 = Class331.anApplet2;
			this.method24849(arg1, arg2, arg3, arg4, arg5, arg6);
		} catch (@Pc(67) Throwable local67) {
			Class293.method27014(null, local67);
			this.method24936("crash");
		}
	}

	@OriginalMember(owner = "client!ra", name = "bj", descriptor = "(Lclient!rw;Ljava/lang/String;Ljava/lang/String;IIIIZ)V", line = 97)
	final void method24847(@OriginalArg(0) Class522 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.method24946(Class513.aClass513_3, arg7);
			Class402.anInt4694 = (Class149_Sub4.anInt2368 = arg0.method30609() * 919220057) * 298502761;
			anInt3365 = (Class19.anInt108 = arg0.method30610() * 533696347) * -98449983;
			anInt3366 = 0;
			anInt3367 = 0;
			if (Class335.method27670() == Class513.aClass513_5) {
				Class402.anInt4694 += arg0.method30611() * -1895347454;
				anInt3365 += arg0.method30613() * 453915958;
				this.method24873(arg0.method30620());
			}
			RuntimeException_Sub1.anApplet1 = Class331.anApplet2;
			this.method24849(arg1, arg2, arg3, arg4, arg5, arg6);
		} catch (@Pc(67) Throwable local67) {
			Class293.method27014(null, local67);
			this.method24936("crash");
		}
	}

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "(I)Lclient!alh;", line = 100)
	public static Class145_Sub1 method24848() {
		return Class8.anInt29 * -120407133 < Class8.aClass145_Sub1Array1.length ? Class8.aClass145_Sub1Array1[(Class8.anInt29 += -1352314869) * -120407133 - 1] : null;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V", line = 117)
	final void method24849(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) throws Exception {
		anInt3371 = arg3 * -1007477835;
		Class236.anInt3778 = arg2 * -98550679;
		RuntimeException_Sub1.anInt3138 = arg4 * -210585033;
		Class26.anInt123 = arg5 * 1229697491;
		Class467.aString216 = "Unknown";
		Class143_Sub1.aString59 = "1.1";
		try {
			Class467.aString216 = System.getProperty("java.vendor");
			Class143_Sub1.aString59 = System.getProperty("java.version");
		} catch (@Pc(27) Exception local27) {
		}
		try {
			Class514.aString224 = System.getProperty("os.name");
		} catch (@Pc(32) Exception local32) {
			Class514.aString224 = "Unknown";
		}
		Class293.aString184 = Class514.aString224.toLowerCase();
		try {
			aString153 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
			aString153 = "";
		}
		try {
			Class483.aString219 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
			Class483.aString219 = "";
		}
		try {
			Class77_Sub42_Sub2.aString113 = System.getProperty("user.home");
			if (Class77_Sub42_Sub2.aString113 != null) {
				Class77_Sub42_Sub2.aString113 = Class77_Sub42_Sub2.aString113 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (Class293.aString184.startsWith("win")) {
				if (Class77_Sub42_Sub2.aString113 == null) {
					Class77_Sub42_Sub2.aString113 = System.getenv("USERPROFILE");
				}
			} else if (Class77_Sub42_Sub2.aString113 == null) {
				Class77_Sub42_Sub2.aString113 = System.getenv("HOME");
			}
			if (Class77_Sub42_Sub2.aString113 != null) {
				Class77_Sub42_Sub2.aString113 = Class77_Sub42_Sub2.aString113 + "/";
			}
		} catch (@Pc(100) Exception local100) {
		}
		if (Class77_Sub42_Sub2.aString113 == null) {
			Class77_Sub42_Sub2.aString113 = "~/";
		}
		try {
			Class683.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(109) Throwable local109) {
		}
		Class110.aStringArray17 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class77_Sub42_Sub2.aString113, "/tmp/", "" };
		Class595.aStringArray33 = new String[] { ".jagex_cache_" + Class236.anInt3778 * -225897511, ".file_store_" + Class236.anInt3778 * -225897511 };
		@Pc(175) int local175 = 0;
		@Pc(200) int local200;
		label131: while (local175 < 4) {
			Class257.aFile2 = this.method24851(arg0, arg1, local175);
			if (!Class257.aFile2.exists()) {
				Class257.aFile2.mkdirs();
			}
			@Pc(194) File[] local194 = Class257.aFile2.listFiles();
			if (local194 == null) {
				break;
			}
			@Pc(198) File[] local198 = local194;
			local200 = 0;
			while (true) {
				if (local200 >= local198.length) {
					break label131;
				}
				@Pc(208) File local208 = local198[local200];
				if (!this.method24855(local208, false)) {
					local175++;
					break;
				}
				local200++;
			}
		}
		Class68.method975(Class257.aFile2);
		Class353.method27927();
		aClass34_5 = new Class34(new Class28(Class313.method27312("main_file_cache.dat2"), "rw", 3221225472L), 5200, 0);
		aClass34_6 = new Class34(new Class28(Class313.method27312("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Class99_Sub1.aClass34Array1 = new Class34[anInt3371 * -4375907];
		for (local175 = 0; local175 < anInt3371 * -4375907; local175++) {
			Class99_Sub1.aClass34Array1[local175] = new Class34(new Class28(Class313.method27312("main_file_cache.idx" + local175), "rw", 1048576L), 6000, 0);
		}
		try {
			aClass15_2 = new Class15();
		} catch (@Pc(296) Exception local296) {
			Class706.aBoolean868 = false;
		}
		Class590.aClass523_1 = new Class523();
		@Pc(305) ThreadGroup local305 = Thread.currentThread().getThreadGroup();
		for (@Pc(308) ThreadGroup local308 = local305.getParent(); local308 != null; local308 = local308.getParent()) {
			local305 = local308;
		}
		@Pc(319) Thread[] local319 = new Thread[1000];
		local305.enumerate(local319);
		for (local200 = 0; local200 < local319.length; local200++) {
			if (local319[local200] != null && local319[local200].getName().startsWith("AWT")) {
				local319[local200].setPriority(1);
			}
		}
		@Pc(352) Thread local352 = new Thread(this);
		local352.setDaemon(true);
		local352.start();
		local352.setPriority(1);
	}

	@OriginalMember(owner = "client!ra", name = "bv", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)V", line = 117)
	final void method24850(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) throws Exception {
		anInt3371 = arg3 * -1007477835;
		Class236.anInt3778 = arg2 * -98550679;
		RuntimeException_Sub1.anInt3138 = arg4 * -210585033;
		Class26.anInt123 = arg5 * 1229697491;
		Class467.aString216 = "Unknown";
		Class143_Sub1.aString59 = "1.1";
		try {
			Class467.aString216 = System.getProperty("java.vendor");
			Class143_Sub1.aString59 = System.getProperty("java.version");
		} catch (@Pc(27) Exception local27) {
		}
		try {
			Class514.aString224 = System.getProperty("os.name");
		} catch (@Pc(32) Exception local32) {
			Class514.aString224 = "Unknown";
		}
		Class293.aString184 = Class514.aString224.toLowerCase();
		try {
			aString153 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(43) Exception local43) {
			aString153 = "";
		}
		try {
			Class483.aString219 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
			Class483.aString219 = "";
		}
		try {
			Class77_Sub42_Sub2.aString113 = System.getProperty("user.home");
			if (Class77_Sub42_Sub2.aString113 != null) {
				Class77_Sub42_Sub2.aString113 = Class77_Sub42_Sub2.aString113 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (Class293.aString184.startsWith("win")) {
				if (Class77_Sub42_Sub2.aString113 == null) {
					Class77_Sub42_Sub2.aString113 = System.getenv("USERPROFILE");
				}
			} else if (Class77_Sub42_Sub2.aString113 == null) {
				Class77_Sub42_Sub2.aString113 = System.getenv("HOME");
			}
			if (Class77_Sub42_Sub2.aString113 != null) {
				Class77_Sub42_Sub2.aString113 = Class77_Sub42_Sub2.aString113 + "/";
			}
		} catch (@Pc(100) Exception local100) {
		}
		if (Class77_Sub42_Sub2.aString113 == null) {
			Class77_Sub42_Sub2.aString113 = "~/";
		}
		try {
			Class683.anEventQueue1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(109) Throwable local109) {
		}
		Class110.aStringArray17 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class77_Sub42_Sub2.aString113, "/tmp/", "" };
		Class595.aStringArray33 = new String[] { ".jagex_cache_" + Class236.anInt3778 * -225897511, ".file_store_" + Class236.anInt3778 * -225897511 };
		@Pc(175) int local175 = 0;
		@Pc(200) int local200;
		label131: while (local175 < 4) {
			Class257.aFile2 = this.method24851(arg0, arg1, local175);
			if (!Class257.aFile2.exists()) {
				Class257.aFile2.mkdirs();
			}
			@Pc(194) File[] local194 = Class257.aFile2.listFiles();
			if (local194 == null) {
				break;
			}
			@Pc(198) File[] local198 = local194;
			local200 = 0;
			while (true) {
				if (local200 >= local198.length) {
					break label131;
				}
				@Pc(208) File local208 = local198[local200];
				if (!this.method24855(local208, false)) {
					local175++;
					break;
				}
				local200++;
			}
		}
		Class68.method975(Class257.aFile2);
		Class353.method27927();
		aClass34_5 = new Class34(new Class28(Class313.method27312("main_file_cache.dat2"), "rw", 3221225472L), 5200, 0);
		aClass34_6 = new Class34(new Class28(Class313.method27312("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Class99_Sub1.aClass34Array1 = new Class34[anInt3371 * -4375907];
		for (local175 = 0; local175 < anInt3371 * -4375907; local175++) {
			Class99_Sub1.aClass34Array1[local175] = new Class34(new Class28(Class313.method27312("main_file_cache.idx" + local175), "rw", 1048576L), 6000, 0);
		}
		try {
			aClass15_2 = new Class15();
		} catch (@Pc(296) Exception local296) {
			Class706.aBoolean868 = false;
		}
		Class590.aClass523_1 = new Class523();
		@Pc(305) ThreadGroup local305 = Thread.currentThread().getThreadGroup();
		for (@Pc(308) ThreadGroup local308 = local305.getParent(); local308 != null; local308 = local308.getParent()) {
			local305 = local308;
		}
		@Pc(319) Thread[] local319 = new Thread[1000];
		local305.enumerate(local319);
		for (local200 = 0; local200 < local319.length; local200++) {
			if (local319[local200] != null && local319[local200].getName().startsWith("AWT")) {
				local319[local200].setPriority(1);
			}
		}
		@Pc(352) Thread local352 = new Thread(this);
		local352.setDaemon(true);
		local352.start();
		local352.setPriority(1);
	}

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;", line = 225)
	File method24851(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(12) String local12 = arg2 == 0 ? "" : "" + arg2;
		Class225.aFile1 = new File(Class77_Sub42_Sub2.aString113, "jagex_cl_" + arg0 + "_" + arg1 + local12 + ".dat");
		@Pc(35) String local35 = null;
		@Pc(37) String local37 = null;
		@Pc(39) boolean local39 = false;
		@Pc(173) File local173;
		if (Class225.aFile1.exists()) {
			try {
				@Pc(49) Class28 local49 = new Class28(Class225.aFile1, "rw", 10000L);
				@Pc(57) Class77_Sub39 local57 = new Class77_Sub39((int) local49.method478());
				@Pc(83) int local83;
				while (local57.anInt3089 * 31645619 < local57.aByteArray53.length) {
					local83 = local49.method486(local57.aByteArray53, local57.anInt3089 * 31645619, local57.aByteArray53.length - local57.anInt3089 * 31645619);
					if (local83 == -1) {
						throw new IOException();
					}
					local57.anInt3089 += local83 * -1387468933;
				}
				local57.anInt3089 = 0;
				local83 = local57.method22478();
				if (local83 < 1 || local83 > 3) {
					throw new IOException("" + local83);
				}
				@Pc(126) int local126 = 0;
				if (local83 > 1) {
					local126 = local57.method22478();
				}
				if (local83 <= 2) {
					local35 = local57.method22526();
					if (local126 == 1) {
						local37 = local57.method22526();
					}
				} else {
					local35 = local57.method22529();
					if (local126 == 1) {
						local37 = local57.method22529();
					}
				}
				local49.method476();
			} catch (@Pc(164) IOException local164) {
				local164.printStackTrace();
			}
			if (local35 != null) {
				local173 = new File(local35);
				if (!local173.exists()) {
					local35 = null;
				}
			}
			if (local35 != null) {
				local173 = new File(local35, "test.dat");
				if (!this.method24855(local173, true)) {
					local35 = null;
				}
			}
		}
		if (local35 == null && arg2 == 0) {
			label103: for (@Pc(202) int local202 = 0; local202 < Class595.aStringArray33.length; local202++) {
				for (@Pc(208) int local208 = 0; local208 < Class110.aStringArray17.length; local208++) {
					@Pc(234) File local234 = new File(Class110.aStringArray17[local208] + Class595.aStringArray33[local202] + File.separatorChar + arg0 + File.separatorChar);
					if (local234.exists() && this.method24855(new File(local234, "test.dat"), true)) {
						local35 = local234.toString();
						local39 = true;
						break label103;
					}
				}
			}
		}
		if (local35 == null) {
			local35 = Class77_Sub42_Sub2.aString113 + File.separatorChar + "jagexcache" + local12 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local39 = true;
		}
		if (local37 != null) {
			@Pc(292) File local292 = new File(local37);
			local173 = new File(local35);
			try {
				@Pc(300) File[] local300 = local292.listFiles();
				@Pc(302) File[] local302 = local300;
				for (@Pc(304) int local304 = 0; local304 < local302.length; local304++) {
					@Pc(312) File local312 = local302[local304];
					@Pc(319) File local319 = new File(local173, local312.getName());
					@Pc(323) boolean local323 = local312.renameTo(local319);
					if (!local323) {
						throw new IOException();
					}
				}
			} catch (@Pc(333) Exception local333) {
				local333.printStackTrace();
			}
			local39 = true;
		}
		if (local39) {
			this.method24854(new File(local35), null);
		}
		return new File(local35);
	}

	@OriginalMember(owner = "client!ra", name = "ba", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 225)
	File method24852(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(12) String local12 = arg2 == 0 ? "" : "" + arg2;
		Class225.aFile1 = new File(Class77_Sub42_Sub2.aString113, "jagex_cl_" + arg0 + "_" + arg1 + local12 + ".dat");
		@Pc(35) String local35 = null;
		@Pc(37) String local37 = null;
		@Pc(39) boolean local39 = false;
		@Pc(173) File local173;
		if (Class225.aFile1.exists()) {
			try {
				@Pc(49) Class28 local49 = new Class28(Class225.aFile1, "rw", 10000L);
				@Pc(57) Class77_Sub39 local57 = new Class77_Sub39((int) local49.method478());
				@Pc(83) int local83;
				while (local57.anInt3089 * 31645619 < local57.aByteArray53.length) {
					local83 = local49.method486(local57.aByteArray53, local57.anInt3089 * 31645619, local57.aByteArray53.length - local57.anInt3089 * 31645619);
					if (local83 == -1) {
						throw new IOException();
					}
					local57.anInt3089 += local83 * -1387468933;
				}
				local57.anInt3089 = 0;
				local83 = local57.method22478();
				if (local83 < 1 || local83 > 3) {
					throw new IOException("" + local83);
				}
				@Pc(126) int local126 = 0;
				if (local83 > 1) {
					local126 = local57.method22478();
				}
				if (local83 <= 2) {
					local35 = local57.method22526();
					if (local126 == 1) {
						local37 = local57.method22526();
					}
				} else {
					local35 = local57.method22529();
					if (local126 == 1) {
						local37 = local57.method22529();
					}
				}
				local49.method476();
			} catch (@Pc(164) IOException local164) {
				local164.printStackTrace();
			}
			if (local35 != null) {
				local173 = new File(local35);
				if (!local173.exists()) {
					local35 = null;
				}
			}
			if (local35 != null) {
				local173 = new File(local35, "test.dat");
				if (!this.method24855(local173, true)) {
					local35 = null;
				}
			}
		}
		if (local35 == null && arg2 == 0) {
			label103: for (@Pc(202) int local202 = 0; local202 < Class595.aStringArray33.length; local202++) {
				for (@Pc(208) int local208 = 0; local208 < Class110.aStringArray17.length; local208++) {
					@Pc(234) File local234 = new File(Class110.aStringArray17[local208] + Class595.aStringArray33[local202] + File.separatorChar + arg0 + File.separatorChar);
					if (local234.exists() && this.method24855(new File(local234, "test.dat"), true)) {
						local35 = local234.toString();
						local39 = true;
						break label103;
					}
				}
			}
		}
		if (local35 == null) {
			local35 = Class77_Sub42_Sub2.aString113 + File.separatorChar + "jagexcache" + local12 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			local39 = true;
		}
		if (local37 != null) {
			@Pc(292) File local292 = new File(local37);
			local173 = new File(local35);
			try {
				@Pc(300) File[] local300 = local292.listFiles();
				@Pc(302) File[] local302 = local300;
				for (@Pc(304) int local304 = 0; local304 < local302.length; local304++) {
					@Pc(312) File local312 = local302[local304];
					@Pc(319) File local319 = new File(local173, local312.getName());
					@Pc(323) boolean local323 = local312.renameTo(local319);
					if (!local323) {
						throw new IOException();
					}
				}
			} catch (@Pc(333) Exception local333) {
				local333.printStackTrace();
			}
			local39 = true;
		}
		if (local39) {
			this.method24854(new File(local35), null);
		}
		return new File(local35);
	}

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "(I[ILclient!gh;ZB)Lclient!gh;", line = 297)
	public static Class273 method24853(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class273 arg2, @OriginalArg(3) boolean arg3) {
		if (!Class277.aClass478_93.method29733(arg0)) {
			return null;
		}
		@Pc(11) int local11 = Class277.aClass478_93.method29752(arg0);
		@Pc(16) Class277[] local16;
		if (local11 == 0) {
			local16 = new Class277[0];
		} else if (arg2 == null) {
			local16 = new Class277[local11];
		} else {
			local16 = arg2.aClass277Array2;
		}
		if (arg2 == null) {
			arg2 = new Class273(arg3, local16);
		} else {
			arg2.aClass277Array2 = local16;
			arg2.aBoolean662 = arg3;
		}
		for (@Pc(45) int local45 = 0; local45 < local11; local45++) {
			if (arg2.aClass277Array2[local45] == null) {
				@Pc(61) byte[] local61 = Class277.aClass478_93.method29726(arg0, local45, arg1);
				if (local61 != null) {
					@Pc(72) Class277 local72 = arg2.aClass277Array2[local45] = new Class277();
					local72.anInt3863 = (local45 + (arg0 << 16)) * -1610085259;
					local72.method26591(new Class77_Sub39(local61));
				}
			}
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "(Ljava/io/File;Ljava/io/File;I)V", line = 318)
	void method24854(@OriginalArg(0) File arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) Class28 local6 = new Class28(Class225.aFile1, "rw", 10000L);
			@Pc(11) Class77_Sub39 local11 = new Class77_Sub39(500);
			local11.method22403(3);
			local11.method22403(arg1 == null ? 0 : 1);
			local11.method22449(arg0.getPath());
			if (arg1 != null) {
				local11.method22449(arg1.getPath());
			}
			local6.method475(local11.aByteArray53, 0, local11.anInt3089 * 31645619);
			local6.method476();
		} catch (@Pc(51) IOException local51) {
			local51.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ra", name = "y", descriptor = "(Ljava/io/File;ZB)Z", line = 334)
	boolean method24855(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1) {
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

	@OriginalMember(owner = "client!ra", name = "bl", descriptor = "(Ljava/io/File;Z)Z", line = 334)
	boolean method24856(@OriginalArg(0) File arg0, @OriginalArg(1) boolean arg1) {
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

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "()Ljava/io/File;", line = 349)
	public static File method24857() {
		return Class257.aFile2;
	}

	@OriginalMember(owner = "client!ra", name = "bd", descriptor = "()Ljava/io/File;", line = 349)
	public static File method24858() {
		return Class257.aFile2;
	}

	@OriginalMember(owner = "client!ra", name = "by", descriptor = "()Ljava/io/File;", line = 349)
	public static File method24859() {
		return Class257.aFile2;
	}

	@OriginalMember(owner = "client!ra", name = "bx", descriptor = "()Ljava/io/File;", line = 349)
	public static File method24860() {
		return Class257.aFile2;
	}

	@OriginalMember(owner = "client!ra", name = "bw", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lclient!abb;", line = 353)
	public static Class28 method24861(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) File local14 = new File(Class257.aFile2, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class28(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class236.anInt3778 * -225897511 == 33) {
			local29 = "_rc";
		} else if (Class236.anInt3778 * -225897511 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class77_Sub42_Sub2.aString113, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class28(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class28(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "bg", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lclient!abb;", line = 353)
	public static Class28 method24862(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) File local14 = new File(Class257.aFile2, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class28(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class236.anInt3778 * -225897511 == 33) {
			local29 = "_rc";
		} else if (Class236.anInt3778 * -225897511 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class77_Sub42_Sub2.aString113, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class28(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class28(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "bi", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lclient!abb;", line = 353)
	public static Class28 method24863(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) File local14 = new File(Class257.aFile2, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class28(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class236.anInt3778 * -225897511 == 33) {
			local29 = "_rc";
		} else if (Class236.anInt3778 * -225897511 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class77_Sub42_Sub2.aString113, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class28(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class28(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "bs", descriptor = "()V", line = 382)
	static void method24864() {
		try {
			@Pc(5) File local5 = new File(Class77_Sub42_Sub2.aString113, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				aClass34_4 = new Class34(new Class28(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class595.aStringArray33.length; local23++) {
					for (local29 = 0; local29 < Class110.aStringArray17.length; local29++) {
						@Pc(53) File local53 = new File(Class110.aStringArray17[local29] + Class595.aStringArray33[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							aClass34_4 = new Class34(new Class28(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (aClass34_4 == null) {
				@Pc(82) RandomAccessFile local82 = new RandomAccessFile(local5, "rw");
				local29 = local82.read();
				local82.seek(0L);
				local82.write(local29);
				local82.seek(0L);
				local82.close();
				aClass34_4 = new Class34(new Class28(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(110) IOException local110) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "bz", descriptor = "()V", line = 382)
	static void method24865() {
		try {
			@Pc(5) File local5 = new File(Class77_Sub42_Sub2.aString113, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				aClass34_4 = new Class34(new Class28(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class595.aStringArray33.length; local23++) {
					for (local29 = 0; local29 < Class110.aStringArray17.length; local29++) {
						@Pc(53) File local53 = new File(Class110.aStringArray17[local29] + Class595.aStringArray33[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							aClass34_4 = new Class34(new Class28(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (aClass34_4 == null) {
				@Pc(82) RandomAccessFile local82 = new RandomAccessFile(local5, "rw");
				local29 = local82.read();
				local82.seek(0L);
				local82.write(local29);
				local82.seek(0L);
				local82.close();
				aClass34_4 = new Class34(new Class28(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(110) IOException local110) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "bt", descriptor = "()V", line = 382)
	static void method24866() {
		try {
			@Pc(5) File local5 = new File(Class77_Sub42_Sub2.aString113, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				aClass34_4 = new Class34(new Class28(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class595.aStringArray33.length; local23++) {
					for (local29 = 0; local29 < Class110.aStringArray17.length; local29++) {
						@Pc(53) File local53 = new File(Class110.aStringArray17[local29] + Class595.aStringArray33[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							aClass34_4 = new Class34(new Class28(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (aClass34_4 == null) {
				@Pc(82) RandomAccessFile local82 = new RandomAccessFile(local5, "rw");
				local29 = local82.read();
				local82.seek(0L);
				local82.write(local29);
				local82.seek(0L);
				local82.close();
				aClass34_4 = new Class34(new Class28(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(110) IOException local110) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "bu", descriptor = "(Lclient!akv;)V", line = 411)
	public static void method24867(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass34_4.method542(0L);
			aClass34_4.method552(local2);
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
		arg0.method22452(local2, 0, 24);
	}

	@OriginalMember(owner = "client!ra", name = "bf", descriptor = "(Lclient!akv;)V", line = 411)
	public static void method24868(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass34_4.method542(0L);
			aClass34_4.method552(local2);
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
		arg0.method22452(local2, 0, 24);
	}

	@OriginalMember(owner = "client!ra", name = "bn", descriptor = "(Lclient!akv;)V", line = 411)
	public static void method24869(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			aClass34_4.method542(0L);
			aClass34_4.method552(local2);
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
		arg0.method22452(local2, 0, 24);
	}

	@OriginalMember(owner = "client!ra", name = "bo", descriptor = "(Lclient!akv;I)V", line = 428)
	static void method24870(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (aClass34_4 == null) {
			return;
		}
		try {
			aClass34_4.method542(0L);
			aClass34_4.method562(arg0.aByteArray53, arg1, 24);
		} catch (@Pc(13) Exception local13) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "bp", descriptor = "(Lclient!akv;I)V", line = 428)
	static void method24871(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (aClass34_4 == null) {
			return;
		}
		try {
			aClass34_4.method542(0L);
			aClass34_4.method562(arg0.aByteArray53, arg1, 24);
		} catch (@Pc(13) Exception local13) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "bm", descriptor = "(Lclient!akv;I)V", line = 428)
	static void method24872(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (aClass34_4 == null) {
			return;
		}
		try {
			aClass34_4.method542(0L);
			aClass34_4.method562(arg0.aByteArray53, arg1, 24);
		} catch (@Pc(13) Exception local13) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "(Ljava/lang/String;B)V", line = 438)
	synchronized void method24873(@OriginalArg(0) String arg0) {
		Class460.aFrame2 = new Frame();
		Class460.aFrame2.setTitle(arg0);
		Class460.aFrame2.setResizable(true);
		Class460.aFrame2.addWindowListener(this);
		Class460.aFrame2.setBackground(Color.black);
		Class460.aFrame2.setVisible(true);
		Class460.aFrame2.toFront();
		@Pc(23) Insets local23 = Class460.aFrame2.getInsets();
		Class460.aFrame2.setSize(Class402.anInt4694 * -166028671 + local23.left + local23.right, anInt3365 * 8272787 + local23.top + local23.bottom);
	}

	@OriginalMember(owner = "client!ra", name = "bk", descriptor = "(Ljava/lang/String;)V", line = 438)
	synchronized void method24874(@OriginalArg(0) String arg0) {
		Class460.aFrame2 = new Frame();
		Class460.aFrame2.setTitle(arg0);
		Class460.aFrame2.setResizable(true);
		Class460.aFrame2.addWindowListener(this);
		Class460.aFrame2.setBackground(Color.black);
		Class460.aFrame2.setVisible(true);
		Class460.aFrame2.toFront();
		@Pc(23) Insets local23 = Class460.aFrame2.getInsets();
		Class460.aFrame2.setSize(Class402.anInt4694 * -166028671 + local23.left + local23.right, anInt3365 * 8272787 + local23.top + local23.bottom);
	}

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "(B)V", line = 450)
	synchronized void method24875() {
		this.method24883();
		@Pc(5) Container local5 = Class94.method7650();
		Class470.aCanvas6 = new Canvas_Sub1(local5);
		this.method24879(local5);
	}

	@OriginalMember(owner = "client!ra", name = "bq", descriptor = "()V", line = 450)
	synchronized void method24876() {
		this.method24883();
		@Pc(5) Container local5 = Class94.method7650();
		Class470.aCanvas6 = new Canvas_Sub1(local5);
		this.method24879(local5);
	}

	@OriginalMember(owner = "client!ra", name = "br", descriptor = "()V", line = 450)
	synchronized void method24877() {
		this.method24883();
		@Pc(5) Container local5 = Class94.method7650();
		Class470.aCanvas6 = new Canvas_Sub1(local5);
		this.method24879(local5);
	}

	@OriginalMember(owner = "client!ra", name = "bh", descriptor = "()Ljava/awt/Container;", line = 457)
	public static Container method24878() {
		if (Class184.aFrame1 == null) {
			return Class460.aFrame2 == null ? Class331.anApplet2 : Class460.aFrame2;
		} else {
			return Class184.aFrame1;
		}
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "(Ljava/awt/Container;B)V", line = 463)
	void method24879(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class470.aCanvas6);
		Class470.aCanvas6.setSize(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
		Class470.aCanvas6.setVisible(true);
		if (arg0 == Class460.aFrame2) {
			@Pc(26) Insets local26 = Class460.aFrame2.getInsets();
			Class470.aCanvas6.setLocation(anInt3366 * -721302779 + local26.left, local26.top + anInt3367 * -350211099);
		} else {
			Class470.aCanvas6.setLocation(anInt3366 * -721302779, anInt3367 * -350211099);
		}
		Class470.aCanvas6.addFocusListener(this);
		Class470.aCanvas6.requestFocus();
		Class77_Sub36.aBoolean351 = true;
		aBoolean586 = true;
		Class470.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean582 = true;
		aBoolean580 = false;
		aLong236 = Class280.method26667() * -10386718407137179L;
	}

	@OriginalMember(owner = "client!ra", name = "be", descriptor = "(Ljava/awt/Container;)V", line = 463)
	void method24880(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class470.aCanvas6);
		Class470.aCanvas6.setSize(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
		Class470.aCanvas6.setVisible(true);
		if (arg0 == Class460.aFrame2) {
			@Pc(26) Insets local26 = Class460.aFrame2.getInsets();
			Class470.aCanvas6.setLocation(anInt3366 * -721302779 + local26.left, local26.top + anInt3367 * -350211099);
		} else {
			Class470.aCanvas6.setLocation(anInt3366 * -721302779, anInt3367 * -350211099);
		}
		Class470.aCanvas6.addFocusListener(this);
		Class470.aCanvas6.requestFocus();
		Class77_Sub36.aBoolean351 = true;
		aBoolean586 = true;
		Class470.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean582 = true;
		aBoolean580 = false;
		aLong236 = Class280.method26667() * -10386718407137179L;
	}

	@OriginalMember(owner = "client!ra", name = "cg", descriptor = "(Ljava/awt/Container;)V", line = 463)
	void method24881(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class470.aCanvas6);
		Class470.aCanvas6.setSize(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
		Class470.aCanvas6.setVisible(true);
		if (arg0 == Class460.aFrame2) {
			@Pc(26) Insets local26 = Class460.aFrame2.getInsets();
			Class470.aCanvas6.setLocation(anInt3366 * -721302779 + local26.left, local26.top + anInt3367 * -350211099);
		} else {
			Class470.aCanvas6.setLocation(anInt3366 * -721302779, anInt3367 * -350211099);
		}
		Class470.aCanvas6.addFocusListener(this);
		Class470.aCanvas6.requestFocus();
		Class77_Sub36.aBoolean351 = true;
		aBoolean586 = true;
		Class470.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean582 = true;
		aBoolean580 = false;
		aLong236 = Class280.method26667() * -10386718407137179L;
	}

	@OriginalMember(owner = "client!ra", name = "cb", descriptor = "(Ljava/awt/Container;)V", line = 463)
	void method24882(@OriginalArg(0) Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Class470.aCanvas6);
		Class470.aCanvas6.setSize(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
		Class470.aCanvas6.setVisible(true);
		if (arg0 == Class460.aFrame2) {
			@Pc(26) Insets local26 = Class460.aFrame2.getInsets();
			Class470.aCanvas6.setLocation(anInt3366 * -721302779 + local26.left, local26.top + anInt3367 * -350211099);
		} else {
			Class470.aCanvas6.setLocation(anInt3366 * -721302779, anInt3367 * -350211099);
		}
		Class470.aCanvas6.addFocusListener(this);
		Class470.aCanvas6.requestFocus();
		Class77_Sub36.aBoolean351 = true;
		aBoolean586 = true;
		Class470.aCanvas6.setFocusTraversalKeysEnabled(false);
		aBoolean582 = true;
		aBoolean580 = false;
		aLong236 = Class280.method26667() * -10386718407137179L;
	}

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "(I)V", line = 484)
	void method24883() {
		if (Class470.aCanvas6 != null) {
			Class470.aCanvas6.removeFocusListener(this);
			Class470.aCanvas6.getParent().setBackground(Color.black);
			Class470.aCanvas6.getParent().remove(Class470.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!ra", name = "cc", descriptor = "()V", line = 484)
	void method24884() {
		if (Class470.aCanvas6 != null) {
			Class470.aCanvas6.removeFocusListener(this);
			Class470.aCanvas6.getParent().setBackground(Color.black);
			Class470.aCanvas6.getParent().remove(Class470.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "(I)Z", line = 492)
	final boolean method24885() {
		@Pc(4) String local4 = Class331.anApplet2.getDocumentBase().getHost().toLowerCase();
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
				this.method24936("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "cp", descriptor = "()Z", line = 492)
	final boolean method24886() {
		@Pc(4) String local4 = Class331.anApplet2.getDocumentBase().getHost().toLowerCase();
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
				this.method24936("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "cf", descriptor = "()Z", line = 492)
	final boolean method24887() {
		@Pc(4) String local4 = Class331.anApplet2.getDocumentBase().getHost().toLowerCase();
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
				this.method24936("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "cl", descriptor = "()Z", line = 492)
	final boolean method24888() {
		@Pc(4) String local4 = Class331.anApplet2.getDocumentBase().getHost().toLowerCase();
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
				this.method24936("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "()V", line = 506)
	public void method24889() {
		try {
			this.method24891();
		} catch (@Pc(8) ThreadDeath local8) {
			throw local8;
		} catch (@Pc(11) Throwable local11) {
			Class293.method27014(this.method24900(), local11);
			this.method24936("crash");
		} finally {
			this.method24903();
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "()V", line = 506)
	public void method24890() {
		try {
			this.method24891();
		} catch (@Pc(8) ThreadDeath local8) {
			throw local8;
		} catch (@Pc(11) Throwable local11) {
			Class293.method27014(this.method24900(), local11);
			this.method24936("crash");
		} finally {
			this.method24903();
		}
	}

	@OriginalMember(owner = "client!ra", name = "run", descriptor = "()V", line = 506)
	@Override
	public void run() {
		try {
			this.method24891();
		} catch (@Pc(8) ThreadDeath local8) {
			throw local8;
		} catch (@Pc(11) Throwable local11) {
			Class293.method27014(this.method24900(), local11);
			this.method24936("crash");
		} finally {
			this.method24903();
		}
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V", line = 522)
	void method24891() {
		if (Class467.aString216 != null) {
			@Pc(5) String local5 = Class467.aString216.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class143_Sub1.aString59;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method24936("wrongjava");
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class465.method29553(local17.charAt(local72)); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class547.method30973(local89) && Class679.method36041(local89) < 10) {
						this.method24936("wrongjava");
						return;
					}
				}
			}
		}
		Class94.method7650().setFocusCycleRoot(true);
		anInt3376 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1178222113;
		anInt3372 = Runtime.getRuntime().availableProcessors() * -1640072939;
		this.method24875();
		this.method24951();
		aClass125_2 = Class122_Sub1_Sub2.method18590();
		while (aLong238 * -7263425836568356405L == 0L || Class280.method26667() < aLong238 * -7263425836568356405L) {
			anInt3369 = aClass125_2.method12676(aLong235 * 435371756202260911L) * -962773997;
			for (@Pc(154) int local154 = 0; local154 < anInt3369 * 1649143323; local154++) {
				this.method24895();
			}
			this.method24897();
			Class431.method28819(Class470.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!ra", name = "cw", descriptor = "()V", line = 522)
	void method24892() {
		if (Class467.aString216 != null) {
			@Pc(5) String local5 = Class467.aString216.toLowerCase();
			if (local5.indexOf("sun") != -1 || local5.indexOf("apple") != -1) {
				@Pc(17) String local17 = Class143_Sub1.aString59;
				if (local17.equals("1.1") || local17.startsWith("1.1.") || local17.equals("1.2") || local17.startsWith("1.2.") || local17.equals("1.3") || local17.startsWith("1.3.") || local17.equals("1.4") || local17.startsWith("1.4.") || local17.equals("1.5") || local17.startsWith("1.5.") || local17.equals("1.6.0")) {
					this.method24936("wrongjava");
					return;
				}
				if (local17.startsWith("1.6.0_")) {
					@Pc(72) int local72;
					for (local72 = 6; local72 < local17.length() && Class465.method29553(local17.charAt(local72)); local72++) {
					}
					@Pc(89) String local89 = local17.substring(6, local72);
					if (Class547.method30973(local89) && Class679.method36041(local89) < 10) {
						this.method24936("wrongjava");
						return;
					}
				}
			}
		}
		Class94.method7650().setFocusCycleRoot(true);
		anInt3376 = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1178222113;
		anInt3372 = Runtime.getRuntime().availableProcessors() * -1640072939;
		this.method24875();
		this.method24951();
		aClass125_2 = Class122_Sub1_Sub2.method18590();
		while (aLong238 * -7263425836568356405L == 0L || Class280.method26667() < aLong238 * -7263425836568356405L) {
			anInt3369 = aClass125_2.method12676(aLong235 * 435371756202260911L) * -962773997;
			for (@Pc(154) int local154 = 0; local154 < anInt3369 * 1649143323; local154++) {
				this.method24895();
			}
			this.method24897();
			Class431.method28819(Class470.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!ra", name = "ch", descriptor = "(Ljava/lang/Object;)V", line = 556)
	static void method24893(@OriginalArg(0) Object arg0) {
		if (Class683.anEventQueue1 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 50 && Class683.anEventQueue1.peekEvent() != null; local4++) {
			Class281.method26679(1L);
		}
		try {
			if (arg0 != null) {
				Class683.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "ck", descriptor = "(Ljava/lang/Object;)V", line = 556)
	static void method24894(@OriginalArg(0) Object arg0) {
		if (Class683.anEventQueue1 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 50 && Class683.anEventQueue1.peekEvent() != null; local4++) {
			Class281.method26679(1L);
		}
		try {
			if (arg0 != null) {
				Class683.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V", line = 565)
	void method24895() {
		@Pc(2) long local2 = Class280.method26667();
		@Pc(8) long local8 = aLongArray22[anInt3368 * -896611215];
		aLongArray22[anInt3368 * -896611215] = local2;
		anInt3368 = (-896611215 * anInt3368 + 1 & 0x1F) * -1851034479;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Class77_Sub36.aBoolean351 = aBoolean586;
		}
		this.method24952();
	}

	@OriginalMember(owner = "client!ra", name = "cz", descriptor = "()V", line = 565)
	void method24896() {
		@Pc(2) long local2 = Class280.method26667();
		@Pc(8) long local8 = aLongArray22[anInt3368 * -896611215];
		aLongArray22[anInt3368 * -896611215] = local2;
		anInt3368 = (-896611215 * anInt3368 + 1 & 0x1F) * -1851034479;
		if (local8 != 0L && local2 > local8) {
		}
		synchronized (this) {
			Class77_Sub36.aBoolean351 = aBoolean586;
		}
		this.method24952();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 577)
	void method24897() {
		@Pc(2) long local2 = Class280.method26667();
		@Pc(12) long local12 = aLongArray21[Class143_Sub14.anInt2124 * 850712361 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray21[Class143_Sub14.anInt2124 * 850712361];
		aLongArray21[Class143_Sub14.anInt2124 * 850712361] = local2;
		Class143_Sub14.anInt2124 = (Class143_Sub14.anInt2124 * 850712361 + 1 & 0x1F) * -1738558183;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3363 = (int) (local2 - local12) * 591308773;
			anInt3362 = ((local47 >> 1) + 32000) / local47 * -281702665;
		}
		if ((anInt3373 += -545995735) * -1070786535 - 1 > 50) {
			anInt3373 -= -1529982974;
			aBoolean582 = true;
			Class470.aCanvas6.setSize(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
			Class470.aCanvas6.setVisible(true);
			if (Class460.aFrame2 != null && Class184.aFrame1 == null) {
				@Pc(101) Insets local101 = Class460.aFrame2.getInsets();
				Class470.aCanvas6.setLocation(anInt3366 * -721302779 + local101.left, local101.top + anInt3367 * -350211099);
			} else {
				Class470.aCanvas6.setLocation(anInt3366 * -721302779, anInt3367 * -350211099);
			}
		}
		this.method24953();
	}

	@OriginalMember(owner = "client!ra", name = "cr", descriptor = "()V", line = 577)
	void method24898() {
		@Pc(2) long local2 = Class280.method26667();
		@Pc(12) long local12 = aLongArray21[Class143_Sub14.anInt2124 * 850712361 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray21[Class143_Sub14.anInt2124 * 850712361];
		aLongArray21[Class143_Sub14.anInt2124 * 850712361] = local2;
		Class143_Sub14.anInt2124 = (Class143_Sub14.anInt2124 * 850712361 + 1 & 0x1F) * -1738558183;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3363 = (int) (local2 - local12) * 591308773;
			anInt3362 = ((local47 >> 1) + 32000) / local47 * -281702665;
		}
		if ((anInt3373 += -545995735) * -1070786535 - 1 > 50) {
			anInt3373 -= -1529982974;
			aBoolean582 = true;
			Class470.aCanvas6.setSize(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
			Class470.aCanvas6.setVisible(true);
			if (Class460.aFrame2 != null && Class184.aFrame1 == null) {
				@Pc(101) Insets local101 = Class460.aFrame2.getInsets();
				Class470.aCanvas6.setLocation(anInt3366 * -721302779 + local101.left, local101.top + anInt3367 * -350211099);
			} else {
				Class470.aCanvas6.setLocation(anInt3366 * -721302779, anInt3367 * -350211099);
			}
		}
		this.method24953();
	}

	@OriginalMember(owner = "client!ra", name = "ca", descriptor = "()V", line = 577)
	void method24899() {
		@Pc(2) long local2 = Class280.method26667();
		@Pc(12) long local12 = aLongArray21[Class143_Sub14.anInt2124 * 850712361 - 1 & 0x1F];
		@Pc(18) long local18 = aLongArray21[Class143_Sub14.anInt2124 * 850712361];
		aLongArray21[Class143_Sub14.anInt2124 * 850712361] = local2;
		Class143_Sub14.anInt2124 = (Class143_Sub14.anInt2124 * 850712361 + 1 & 0x1F) * -1738558183;
		if (local18 != 0L && local2 > local18) {
			@Pc(47) int local47 = (int) (local2 - local18);
			anInt3363 = (int) (local2 - local12) * 591308773;
			anInt3362 = ((local47 >> 1) + 32000) / local47 * -281702665;
		}
		if ((anInt3373 += -545995735) * -1070786535 - 1 > 50) {
			anInt3373 -= -1529982974;
			aBoolean582 = true;
			Class470.aCanvas6.setSize(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
			Class470.aCanvas6.setVisible(true);
			if (Class460.aFrame2 != null && Class184.aFrame1 == null) {
				@Pc(101) Insets local101 = Class460.aFrame2.getInsets();
				Class470.aCanvas6.setLocation(anInt3366 * -721302779 + local101.left, local101.top + anInt3367 * -350211099);
			} else {
				Class470.aCanvas6.setLocation(anInt3366 * -721302779, anInt3367 * -350211099);
			}
		}
		this.method24953();
	}

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "(B)Ljava/lang/String;", line = 602)
	String method24900() {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "()Ljava/lang/String;", line = 602)
	String method24901() {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "aa", descriptor = "()Ljava/lang/String;", line = 602)
	String method24902() {
		return null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V", line = 606)
	final void method24903() {
		synchronized (this) {
			if (aBoolean585) {
				return;
			}
			aBoolean585 = true;
		}
		try {
			this.method24950();
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass34_5.method538();
			for (@Pc(28) int local28 = 0; local28 < anInt3371 * -4375907; local28++) {
				Class99_Sub1.aClass34Array1[local28].method538();
			}
			aClass34_6.method538();
			aClass34_4.method538();
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean583) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class612.method32234()) {
			Class155.method23614().method30925();
		}
		if (Class470.aCanvas6 != null) {
			try {
				Class470.aCanvas6.removeFocusListener(this);
				Class470.aCanvas6.getParent().remove(Class470.aCanvas6);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Class460.aFrame2 != null) {
			Class460.aFrame2.setVisible(false);
			Class460.aFrame2.dispose();
			Class460.aFrame2 = null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "cx", descriptor = "(Z)V", line = 606)
	final void method24904() {
		synchronized (this) {
			if (aBoolean585) {
				return;
			}
			aBoolean585 = true;
		}
		try {
			this.method24950();
		} catch (@Pc(23) Exception local23) {
		}
		try {
			aClass34_5.method538();
			for (@Pc(28) int local28 = 0; local28 < anInt3371 * -4375907; local28++) {
				Class99_Sub1.aClass34Array1[local28].method538();
			}
			aClass34_6.method538();
			aClass34_4.method538();
		} catch (@Pc(48) Exception local48) {
		}
		if (this.aBoolean583) {
			try {
				QueryPerformanceCounter.quit();
			} catch (@Pc(54) Throwable local54) {
			}
		}
		if (Class612.method32234()) {
			Class155.method23614().method30925();
		}
		if (Class470.aCanvas6 != null) {
			try {
				Class470.aCanvas6.removeFocusListener(this);
				Class470.aCanvas6.getParent().remove(Class470.aCanvas6);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Class460.aFrame2 != null) {
			Class460.aFrame2.setVisible(false);
			Class460.aFrame2.dispose();
			Class460.aFrame2 = null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "cu", descriptor = "()I", line = 645)
	public static final int method24905() {
		return (int) (1000000000L / (aLong235 * 435371756202260911L));
	}

	@OriginalMember(owner = "client!ra", name = "cm", descriptor = "()I", line = 645)
	public static final int method24906() {
		return (int) (1000000000L / (aLong235 * 435371756202260911L));
	}

	@OriginalMember(owner = "client!ra", name = "ct", descriptor = "()I", line = 645)
	public static final int method24907() {
		return (int) (1000000000L / (aLong235 * 435371756202260911L));
	}

	@OriginalMember(owner = "client!ra", name = "cv", descriptor = "()I", line = 645)
	public static final int method24908() {
		return (int) (1000000000L / (aLong235 * 435371756202260911L));
	}

	@OriginalMember(owner = "client!ra", name = "ci", descriptor = "()V", line = 649)
	public static final void method24909() {
		aClass125_2.method12687();
		@Pc(4) int local4;
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray21[local4] = 0L;
		}
		for (local4 = 0; local4 < 32; local4++) {
			aLongArray22[local4] = 0L;
		}
		anInt3369 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "co", descriptor = "()J", line = 656)
	static long method24910() {
		return aClass125_2.method12699();
	}

	@OriginalMember(owner = "client!ra", name = "cn", descriptor = "()J", line = 656)
	static long method24911() {
		return aClass125_2.method12699();
	}

	@OriginalMember(owner = "client!ra", name = "cy", descriptor = "()J", line = 656)
	static long method24912() {
		return aClass125_2.method12699();
	}

	@OriginalMember(owner = "client!ra", name = "cq", descriptor = "()J", line = 656)
	static long method24913() {
		return aClass125_2.method12699();
	}

	@OriginalMember(owner = "client!ra", name = "cd", descriptor = "()V", line = 660)
	@Override
	public void method24833() {
		if (!aBoolean585) {
			aLong238 = 0L;
		}
	}

	@OriginalMember(owner = "client!ra", name = "start", descriptor = "()V", line = 660)
	@Override
	public void start() {
		if (!aBoolean585) {
			aLong238 = 0L;
		}
	}

	@OriginalMember(owner = "client!ra", name = "cs", descriptor = "()V", line = 660)
	@Override
	public void method24834() {
		if (!aBoolean585) {
			aLong238 = 0L;
		}
	}

	@OriginalMember(owner = "client!ra", name = "cj", descriptor = "()V", line = 665)
	@Override
	public void method24836() {
		if (!aBoolean585) {
			aLong238 = (Class280.method26667() + 4000L) * 7393495441865868259L;
		}
	}

	@OriginalMember(owner = "client!ra", name = "stop", descriptor = "()V", line = 665)
	@Override
	public void stop() {
		if (!aBoolean585) {
			aLong238 = (Class280.method26667() + 4000L) * 7393495441865868259L;
		}
	}

	@OriginalMember(owner = "client!ra", name = "destroy", descriptor = "()V", line = 670)
	@Override
	public void destroy() {
		if (!aBoolean585) {
			aLong238 = Class280.method26667() * 7393495441865868259L;
			Class281.method26679(5000L);
			this.method24903();
		}
	}

	@OriginalMember(owner = "client!ra", name = "ce", descriptor = "()V", line = 670)
	@Override
	public void method24830() {
		if (!aBoolean585) {
			aLong238 = Class280.method26667() * 7393495441865868259L;
			Class281.method26679(5000L);
			this.method24903();
		}
	}

	@OriginalMember(owner = "client!ra", name = "do", descriptor = "()V", line = 670)
	@Override
	public void method24837() {
		if (!aBoolean585) {
			aLong238 = Class280.method26667() * 7393495441865868259L;
			Class281.method26679(5000L);
			this.method24903();
		}
	}

	@OriginalMember(owner = "client!ra", name = "dt", descriptor = "()V", line = 670)
	@Override
	public void method24838() {
		if (!aBoolean585) {
			aLong238 = Class280.method26667() * 7393495441865868259L;
			Class281.method26679(5000L);
			this.method24903();
		}
	}

	@OriginalMember(owner = "client!ra", name = "dh", descriptor = "()V", line = 670)
	@Override
	public void method24839() {
		if (!aBoolean585) {
			aLong238 = Class280.method26667() * 7393495441865868259L;
			Class281.method26679(5000L);
			this.method24903();
		}
	}

	@OriginalMember(owner = "client!ra", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 677)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "dq", descriptor = "(Ljava/awt/Graphics;)V", line = 677)
	@Override
	public final void method24840(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "dn", descriptor = "(Ljava/awt/Graphics;)V", line = 677)
	@Override
	public final void method24831(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 681)
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (aBoolean585) {
			return;
		}
		aBoolean582 = true;
		if (Class280.method26667() - aLong236 * 3099711367168821613L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= Class402.anInt4694 * -166028671 && local16.height >= anInt3365 * 8272787) {
				aBoolean580 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "dv", descriptor = "(Ljava/awt/Graphics;)V", line = 681)
	@Override
	public final synchronized void method24829(@OriginalArg(0) Graphics arg0) {
		if (aBoolean585) {
			return;
		}
		aBoolean582 = true;
		if (Class280.method26667() - aLong236 * 3099711367168821613L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= Class402.anInt4694 * -166028671 && local16.height >= anInt3365 * 8272787) {
				aBoolean580 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "da", descriptor = "(Ljava/awt/Graphics;)V", line = 681)
	@Override
	public final synchronized void method24842(@OriginalArg(0) Graphics arg0) {
		if (aBoolean585) {
			return;
		}
		aBoolean582 = true;
		if (Class280.method26667() - aLong236 * 3099711367168821613L > 1000L) {
			@Pc(16) Rectangle local16 = arg0.getClipBounds();
			if (local16 == null || local16.width >= Class402.anInt4694 * -166028671 && local16.height >= anInt3365 * 8272787) {
				aBoolean580 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 690)
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		aBoolean586 = true;
		aBoolean582 = true;
	}

	@OriginalMember(owner = "client!ra", name = "dm", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 690)
	public final void method24914(@OriginalArg(0) FocusEvent arg0) {
		aBoolean586 = true;
		aBoolean582 = true;
	}

	@OriginalMember(owner = "client!ra", name = "dy", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 690)
	public final void method24915(@OriginalArg(0) FocusEvent arg0) {
		aBoolean586 = true;
		aBoolean582 = true;
	}

	@OriginalMember(owner = "client!ra", name = "dz", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 690)
	public final void method24916(@OriginalArg(0) FocusEvent arg0) {
		aBoolean586 = true;
		aBoolean582 = true;
	}

	@OriginalMember(owner = "client!ra", name = "dw", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 690)
	public final void method24917(@OriginalArg(0) FocusEvent arg0) {
		aBoolean586 = true;
		aBoolean582 = true;
	}

	@OriginalMember(owner = "client!ra", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 695)
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		aBoolean586 = false;
	}

	@OriginalMember(owner = "client!ra", name = "dr", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 695)
	public final void method24918(@OriginalArg(0) FocusEvent arg0) {
		aBoolean586 = false;
	}

	@OriginalMember(owner = "client!ra", name = "di", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 695)
	public final void method24919(@OriginalArg(0) FocusEvent arg0) {
		aBoolean586 = false;
	}

	@OriginalMember(owner = "client!ra", name = "dp", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 695)
	public final void method24920(@OriginalArg(0) FocusEvent arg0) {
		aBoolean586 = false;
	}

	@OriginalMember(owner = "client!ra", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 698)
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "de", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 698)
	public final void method24921(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 699)
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "du", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 699)
	public final void method24922(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "dk", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 699)
	public final void method24923(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 702)
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		aBoolean581 = true;
		this.destroy();
	}

	@OriginalMember(owner = "client!ra", name = "ds", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 702)
	public final void method24924(@OriginalArg(0) WindowEvent arg0) {
		aBoolean581 = true;
		this.destroy();
	}

	@OriginalMember(owner = "client!ra", name = "dx", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 706)
	public final void method24925(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 706)
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 706)
	public final void method24926(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "df", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 706)
	public final void method24927(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "dc", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 707)
	public final void method24928(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 707)
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "dg", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 707)
	public final void method24929(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "dl", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 707)
	public final void method24930(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "dd", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 708)
	public final void method24931(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 708)
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 709)
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "dj", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 709)
	public final void method24932(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "eh", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 709)
	public final void method24933(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ra", name = "es", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", line = 718)
	public static final void method24934(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Class470.aCanvas6.getGraphics();
			if (Class470.aFont2 == null) {
				Class470.aFont2 = new Font("Helvetica", 1, 13);
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
			@Pc(77) int local77;
			@Pc(85) int local85;
			try {
				if (Class267.anImage4 == null) {
					Class267.anImage4 = Class470.aCanvas6.createImage(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
				}
				@Pc(56) Graphics local56 = Class267.anImage4.getGraphics();
				local56.setColor(Color.black);
				local56.fillRect(0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
				local77 = Class149_Sub4.anInt2368 * 1771907305 / 2 - 152;
				local85 = Class19.anInt108 * -1091172141 / 2 - 18;
				local56.setColor(arg3);
				local56.drawRect(local77, local85, 303, 33);
				local56.setColor(arg2);
				local56.fillRect(local77 + 2, local85 + 2, arg0 * 3, 30);
				local56.setColor(Color.black);
				local56.drawRect(local77 + 1, local85 + 1, 301, 31);
				local56.fillRect(local77 + 2 + arg0 * 3, local85 + 2, 300 - arg0 * 3, 30);
				local56.setFont(Class470.aFont2);
				local56.setColor(arg4);
				local56.drawString(arg1, local77 + (304 - arg1.length() * 6) / 2, local85 + 22);
				if (aString152 != null) {
					local56.setFont(Class470.aFont2);
					local56.setColor(arg4);
					local56.drawString(aString152, Class149_Sub4.anInt2368 * 1771907305 / 2 - aString152.length() * 6 / 2, Class19.anInt108 * -1091172141 / 2 - 26);
				}
				local2.drawImage(Class267.anImage4, 0, 0, null);
			} catch (@Pc(201) Exception local201) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
				local77 = Class149_Sub4.anInt2368 * 1771907305 / 2 - 152;
				local85 = Class19.anInt108 * -1091172141 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local77, local85, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local77 + 2, local85 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local77 + 1, local85 + 1, 301, 31);
				local2.fillRect(local77 + 2 + arg0 * 3, local85 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class470.aFont2);
				local2.setColor(arg4);
				if (aString152 != null) {
					local2.setFont(Class470.aFont2);
					local2.setColor(arg4);
					local2.drawString(aString152, Class149_Sub4.anInt2368 * 1771907305 / 2 - aString152.length() * 6 / 2, Class19.anInt108 * -1091172141 / 2 - 26);
				}
				local2.drawString(arg1, local77 + (304 - arg1.length() * 6) / 2, local85 + 22);
			}
		} catch (@Pc(339) Exception local339) {
			Class470.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!ra", name = "eq", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", line = 718)
	public static final void method24935(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Class470.aCanvas6.getGraphics();
			if (Class470.aFont2 == null) {
				Class470.aFont2 = new Font("Helvetica", 1, 13);
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
			@Pc(77) int local77;
			@Pc(85) int local85;
			try {
				if (Class267.anImage4 == null) {
					Class267.anImage4 = Class470.aCanvas6.createImage(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
				}
				@Pc(56) Graphics local56 = Class267.anImage4.getGraphics();
				local56.setColor(Color.black);
				local56.fillRect(0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
				local77 = Class149_Sub4.anInt2368 * 1771907305 / 2 - 152;
				local85 = Class19.anInt108 * -1091172141 / 2 - 18;
				local56.setColor(arg3);
				local56.drawRect(local77, local85, 303, 33);
				local56.setColor(arg2);
				local56.fillRect(local77 + 2, local85 + 2, arg0 * 3, 30);
				local56.setColor(Color.black);
				local56.drawRect(local77 + 1, local85 + 1, 301, 31);
				local56.fillRect(local77 + 2 + arg0 * 3, local85 + 2, 300 - arg0 * 3, 30);
				local56.setFont(Class470.aFont2);
				local56.setColor(arg4);
				local56.drawString(arg1, local77 + (304 - arg1.length() * 6) / 2, local85 + 22);
				if (aString152 != null) {
					local56.setFont(Class470.aFont2);
					local56.setColor(arg4);
					local56.drawString(aString152, Class149_Sub4.anInt2368 * 1771907305 / 2 - aString152.length() * 6 / 2, Class19.anInt108 * -1091172141 / 2 - 26);
				}
				local2.drawImage(Class267.anImage4, 0, 0, null);
			} catch (@Pc(201) Exception local201) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141);
				local77 = Class149_Sub4.anInt2368 * 1771907305 / 2 - 152;
				local85 = Class19.anInt108 * -1091172141 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local77, local85, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local77 + 2, local85 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local77 + 1, local85 + 1, 301, 31);
				local2.fillRect(local77 + 2 + arg0 * 3, local85 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class470.aFont2);
				local2.setColor(arg4);
				if (aString152 != null) {
					local2.setFont(Class470.aFont2);
					local2.setColor(arg4);
					local2.drawString(aString152, Class149_Sub4.anInt2368 * 1771907305 / 2 - aString152.length() * 6 / 2, Class19.anInt108 * -1091172141 / 2 - 26);
				}
				local2.drawString(arg1, local77 + (304 - arg1.length() * 6) / 2, local85 + 22);
			}
		} catch (@Pc(339) Exception local339) {
			Class470.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!ra", name = "ax", descriptor = "(Ljava/lang/String;I)V", line = 782)
	void method24936(@OriginalArg(0) String arg0) {
		if (this.aBoolean584) {
			return;
		}
		this.aBoolean584 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class31.method519(Class331.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class331.anApplet2.getAppletContext().showDocument(new URL(Class331.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "ee", descriptor = "(Ljava/lang/String;)V", line = 782)
	void method24937(@OriginalArg(0) String arg0) {
		if (this.aBoolean584) {
			return;
		}
		this.aBoolean584 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class31.method519(Class331.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class331.anApplet2.getAppletContext().showDocument(new URL(Class331.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "ei", descriptor = "(Ljava/lang/String;)V", line = 782)
	void method24938(@OriginalArg(0) String arg0) {
		if (this.aBoolean584) {
			return;
		}
		this.aBoolean584 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class31.method519(Class331.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class331.anApplet2.getAppletContext().showDocument(new URL(Class331.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "ed", descriptor = "(Ljava/lang/String;)V", line = 782)
	void method24939(@OriginalArg(0) String arg0) {
		if (this.aBoolean584) {
			return;
		}
		this.aBoolean584 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class31.method519(Class331.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class331.anApplet2.getAppletContext().showDocument(new URL(Class331.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "ar", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 796)
	void method24940(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (this.aBoolean584) {
			return;
		}
		this.aBoolean584 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class31.method519(Class331.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class331.anApplet2.getAppletContext().showDocument(new URL(Class331.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "en", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V", line = 796)
	void method24941(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (this.aBoolean584) {
			return;
		}
		this.aBoolean584 = true;
		System.out.println("error_game_" + arg0);
		try {
			Class31.method519(Class331.anApplet2, "loggedout");
		} catch (@Pc(23) Throwable local23) {
		}
		try {
			Class331.anApplet2.getAppletContext().showDocument(new URL(Class331.anApplet2.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "ad", descriptor = "(I)V", line = 810)
	public void method24942() throws Exception_Sub4 {
		if (this.aBoolean583) {
			return;
		}
		Class155.method23614().method30921("jaclib");
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class293.aString184.startsWith("win")) {
				throw new Exception_Sub4(128, "jaclib");
			}
		}
		this.aBoolean583 = true;
	}

	@OriginalMember(owner = "client!ra", name = "ex", descriptor = "()V", line = 810)
	public void method24943() throws Exception_Sub4 {
		if (this.aBoolean583) {
			return;
		}
		Class155.method23614().method30921("jaclib");
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class293.aString184.startsWith("win")) {
				throw new Exception_Sub4(128, "jaclib");
			}
		}
		this.aBoolean583 = true;
	}

	@OriginalMember(owner = "client!ra", name = "ef", descriptor = "()V", line = 810)
	public void method24944() throws Exception_Sub4 {
		if (this.aBoolean583) {
			return;
		}
		Class155.method23614().method30921("jaclib");
		try {
			QueryPerformanceCounter.init();
		} catch (@Pc(12) Throwable local12) {
			if (Class293.aString184.startsWith("win")) {
				throw new Exception_Sub4(128, "jaclib");
			}
		}
		this.aBoolean583 = true;
	}

	@OriginalMember(owner = "client!ra", name = "er", descriptor = "(Lclient!rl;Z)V", line = 822)
	void method24945(@OriginalArg(0) Class513 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class513.aClass513_3 == arg0 || arg0 == Class513.aClass513_4) {
			aClass513_2 = arg0;
			if (Class513.aClass513_4 != aClass513_2 && arg1) {
				aClass513_2 = Class513.aClass513_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "ac", descriptor = "(Lclient!rl;ZS)V", line = 822)
	void method24946(@OriginalArg(0) Class513 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (Class513.aClass513_3 == arg0 || arg0 == Class513.aClass513_4) {
			aClass513_2 = arg0;
			if (Class513.aClass513_4 != aClass513_2 && arg1) {
				aClass513_2 = Class513.aClass513_5;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "em", descriptor = "()Lclient!rl;", line = 838)
	public static Class513 method24947() {
		return aClass513_2;
	}

	@OriginalMember(owner = "client!ra", name = "zx", descriptor = "(Lclient!yf;I)V", line = 9185)
	static final void method24948(@OriginalArg(0) Class665 arg0) {
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = client.aClass243_1.method26058();
	}

	@OriginalMember(owner = "client!ra", name = "axg", descriptor = "(Lclient!yf;I)V", line = 13425)
	static final void method24949(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class104_Sub1_Sub1_Sub1_Sub1 local16 = (Class104_Sub1_Sub1_Sub1_Sub1) arg0.aClass104_Sub1_Sub1_Sub1_4;
		@Pc(21) int local21 = local16.method19830(local12);
		@Pc(26) int local26 = local16.method19832(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local21;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local26;
	}

	@OriginalMember(owner = "client!ra", name = "ao", descriptor = "(B)V")
	abstract void method24950();

	@OriginalMember(owner = "client!ra", name = "ai", descriptor = "(S)V")
	abstract void method24951();

	@OriginalMember(owner = "client!ra", name = "ag", descriptor = "(I)V")
	abstract void method24952();

	@OriginalMember(owner = "client!ra", name = "al", descriptor = "(I)V")
	abstract void method24953();

	@OriginalMember(owner = "client!ra", name = "at", descriptor = "()V")
	abstract void method24954();

	@OriginalMember(owner = "client!ra", name = "ae", descriptor = "()V")
	abstract void method24955();

	@OriginalMember(owner = "client!ra", name = "ah", descriptor = "()V")
	abstract void method24956();

	@OriginalMember(owner = "client!ra", name = "eo", descriptor = "()V")
	public abstract void method24843();

	@OriginalMember(owner = "client!ra", name = "aq", descriptor = "()V")
	abstract void method24957();

	@OriginalMember(owner = "client!ra", name = "ay", descriptor = "()V")
	abstract void method24958();

	@OriginalMember(owner = "client!ra", name = "af", descriptor = "()V")
	abstract void method24959();

	@OriginalMember(owner = "client!ra", name = "an", descriptor = "()V")
	abstract void method24960();

	@OriginalMember(owner = "client!ra", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ra", name = "as", descriptor = "()V")
	abstract void method24961();

	@OriginalMember(owner = "client!ra", name = "ep", descriptor = "()V")
	abstract void method24962();

	@OriginalMember(owner = "client!ra", name = "ej", descriptor = "()V")
	public abstract void method24835();

	@OriginalMember(owner = "client!ra", name = "am", descriptor = "()V")
	abstract void method24963();
}
