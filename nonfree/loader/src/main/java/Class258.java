import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ng")
public final class Class258 implements Runnable {

	@OriginalMember(owner = "loader!ng", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "loader!ng", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!ng", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!ng", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!ng", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "loader!ng", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!ng", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!ng", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ng", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ng", name = "r", descriptor = "I")
	private static int anInt6441 = 1;

	@OriginalMember(owner = "loader!ng", name = "z", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!ng", name = "u", descriptor = "J")
	private static volatile long aLong209 = 0L;

	@OriginalMember(owner = "loader!ng", name = "x", descriptor = "Lloader!rb;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "loader!ng", name = "m", descriptor = "Lloader!iu;")
	private Class257 aClass257_2 = null;

	@OriginalMember(owner = "loader!ng", name = "e", descriptor = "Lloader!vl;")
	private Class259 aClass259_1 = null;

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "Z")
	private boolean aBoolean603 = false;

	@OriginalMember(owner = "loader!ng", name = "w", descriptor = "Lloader!iu;")
	private Class257 aClass257_3 = null;

	@OriginalMember(owner = "loader!ng", name = "c", descriptor = "Lloader!vl;")
	private Class259 aClass259_2 = null;

	@OriginalMember(owner = "loader!ng", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ng", name = "g", descriptor = "Lloader!vl;")
	private Class259 aClass259_3 = null;

	@OriginalMember(owner = "loader!ng", name = "o", descriptor = "I")
	private int anInt6442;

	@OriginalMember(owner = "loader!ng", name = "A", descriptor = "Ljava/lang/String;")
	private final String aString82;

	@OriginalMember(owner = "loader!ng", name = "i", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ng", name = "l", descriptor = "[Lloader!vl;")
	private Class259[] aClass259Array1;

	@OriginalMember(owner = "loader!ng", name = "q", descriptor = "Lloader!d;")
	private Class255 aClass255_1;

	@OriginalMember(owner = "loader!ng", name = "y", descriptor = "Lloader!a;")
	private Class253 aClass253_1;

	@OriginalMember(owner = "loader!ng", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!ng", name = "b", descriptor = "(IILjava/lang/String;)Lloader!vl;")
	private static Class259 method5627(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(15) String local15;
		if (arg0 == 33) {
			local15 = "jagex_" + arg1 + "_preferences2_rc.dat";
		} else if (arg0 == 34) {
			local15 = "jagex_" + arg1 + "_preferences2_wip.dat";
		} else {
			local15 = "jagex_" + arg1 + "_preferences2.dat";
		}
		@Pc(79) String[] local79 = new String[] { "c:/rscache/", "/rscache/", aString76, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(81) int local81 = 0; local81 < local79.length; local81++) {
			@Pc(89) String local89 = local79[local81];
			if (local89.length() <= 0 || (new File(local89)).exists()) {
				try {
					return new Class259(new File(local89, local15), "rw", 10000L);
				} catch (@Pc(113) Exception local113) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	private static File method5634(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString76, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(76) int local76 = 0; local76 < local69.length; local76++) {
				for (@Pc(86) int local86 = 0; local86 < local44.length; local86++) {
					@Pc(120) String local120 = local44[local86] + local69[local76] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(122) RandomAccessFile local122 = null;
					try {
						@Pc(127) File local127 = new File(local120);
						if (local71 != 0 || local127.exists()) {
							@Pc(140) String local140 = local44[local86];
							if (local71 != 1 || local140.length() <= 0 || (new File(local140)).exists()) {
								(new File(local44[local86] + local69[local76])).mkdir();
								if (arg0 != null) {
									(new File(local44[local86] + local69[local76] + "/" + arg0)).mkdir();
								}
								local122 = new RandomAccessFile(local127, "rw");
								@Pc(209) int local209 = local122.read();
								local122.seek(0L);
								local122.write(local209);
								local122.seek(0L);
								local122.close();
								aHashtable2.put(arg2, local127);
								return local127;
							}
						}
					} catch (@Pc(228) Exception local228) {
						try {
							if (local122 != null) {
								local122.close();
							}
						} catch (@Pc(237) Exception local237) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!vl;")
	private static Class259 method5639(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) String local13;
		if (arg1 == 33) {
			local13 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local13 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local13 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", aString76, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			@Pc(89) String local89 = local75[local77];
			if (local89.length() <= 0 || (new File(local89)).exists()) {
				try {
					return new Class259(new File(local89, local13), "rw", 10000L);
				} catch (@Pc(112) Exception local112) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ng", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class258(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet3 = arg0;
		aString79 = "1.1";
		aString75 = "Unknown";
		this.anInt6442 = arg1;
		this.aString82 = arg2;
		try {
			aString75 = System.getProperty("java.vendor");
			aString79 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString78 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString78 = "Unknown";
		}
		aString80 = aString78.toLowerCase();
		try {
			aString81 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString81 = "";
		}
		try {
			aString77 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString77 = "";
		}
		try {
			aString76 = System.getProperty("user.home");
			if (aString76 != null) {
				aString76 = aString76 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString76 == null) {
			aString76 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass259_1 = new Class259(method5634(null, this.anInt6442, "random.dat"), "rw", 25L);
		this.aClass259_3 = new Class259(this.method5632("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass259_2 = new Class259(this.method5632("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass259Array1 = new Class259[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass259Array1[local193] = new Class259(this.method5632("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass255_1 = new Class255();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass253_1 = new Class253();
		} catch (@Pc(232) Throwable local232) {
		}
		@Pc(235) ThreadGroup local235 = Thread.currentThread().getThreadGroup();
		for (@Pc(238) ThreadGroup local238 = local235.getParent(); local238 != null; local238 = local238.getParent()) {
			local235 = local238;
		}
		@Pc(249) Thread[] local249 = new Thread[1000];
		local235.enumerate(local249);
		for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
			if (local249[local255] != null && local249[local255].getName().startsWith("AWT")) {
				local249[local255].setPriority(1);
			}
		}
		this.aBoolean603 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!iu;")
	private Class257 method5613(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 != 1095) {
			this.method5625((byte) 13, null);
		}
		return this.method5638(7, arg1, -120, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "d", descriptor = "(I)Lloader!iu;")
	private Class257 method5614(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			aString78 = null;
		}
		return this.method5638(18, null, -80, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "c", descriptor = "(I)Lloader!iu;")
	private Class257 method5615(@OriginalArg(0) int arg0) {
		if (arg0 != -8026) {
			this.method5641(null, null, null, true);
		}
		return this.method5638(12, null, -118, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(Ljava/awt/Component;III)Lloader!iu;")
	private Class257 method5616(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 != 1) {
			anInt6441 = 17;
		}
		@Pc(7) Point local7 = arg0.getLocationOnScreen();
		return this.method5638(14, null, -118, arg1 + local7.y, arg3 + local7.x);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(Z)Z")
	private boolean method5617(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method5617(false);
		}
		return this.aClass255_1 != null;
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(III[ILjava/awt/Point;Ljava/awt/Component;)Lloader!iu;")
	private Class257 method5618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Point arg4, @OriginalArg(5) Component arg5) {
		return arg1 == 17 ? this.method5638(17, new Object[] { arg5, arg3, arg4 }, arg1 ^ 0x55, arg2, arg0) : (Class257) null;
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(IZLjava/lang/Object;II)Lloader!iu;")
	private Class257 method5619(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class257 local3 = new Class257();
		synchronized (local3) {
			local3.anObject9 = arg2;
			local3.anInt6436 = arg4;
			local3.anInt6434 = arg3;
			local3.anInt6435 = arg0;
			synchronized (this) {
				if (this.aClass257_3 == null) {
					this.aClass257_3 = this.aClass257_2 = local3;
				} else {
					this.aClass257_3.aClass257_1 = local3;
					this.aClass257_3 = local3;
				}
				this.notify();
			}
			try {
				if (!arg1) {
					this.method5623();
				}
				local3.wait();
			} catch (@Pc(62) InterruptedException local62) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(IZIII)Lloader!iu;")
	private Class257 method5620(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg1 ? this.method5638(6, null, 108, arg3 + (arg0 << 16), (arg2 << 16) + arg4) : (Class257) null;
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!iu;")
	private Class257 method5621(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		return arg0 == -21 ? this.method5638(10, arg1, 68, 0, 0) : (Class257) null;
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(BLjava/lang/String;)Lloader!iu;")
	private Class257 method5622(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 >= -81) {
			this.anInt6442 = -91;
		}
		return this.method5638(21, arg1, -83, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(B)Lloader!iu;")
	private Class257 method5623() {
		return this.method5638(5, null, 124, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lloader!iu;")
	private Class257 method5624(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		return arg2 > -3 ? (Class257) null : this.method5638(15, arg0, 84, 0, arg1 ? 1 : 0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lloader!iu;")
	private Class257 method5625(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 <= 45) {
			this.method5631(null, 38, null);
		}
		return this.method5638(19, arg1, -112, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(BLjava/net/URL;)Lloader!iu;")
	private Class257 method5626(@OriginalArg(0) byte arg0, @OriginalArg(1) URL arg1) {
		return arg0 < 97 ? (Class257) null : this.method5638(4, arg1, 126, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!iu;")
	private Class257 method5628(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			aMethod4 = null;
		}
		return this.method5638(16, arg0, -27, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "e", descriptor = "(I)V")
	private void method5629() {
		synchronized (this) {
			this.aBoolean603 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		if (this.aClass259_3 != null) {
			try {
				this.aClass259_3.method5652();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass259_2 != null) {
			try {
				this.aClass259_2.method5652();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass259Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass259Array1.length; local53++) {
				if (this.aClass259Array1[local53] != null) {
					try {
						this.aClass259Array1[local53].method5652();
					} catch (@Pc(72) IOException local72) {
					}
				}
			}
		}
		if (this.aClass259_1 != null) {
			try {
				this.aClass259_1.method5652();
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(IILjava/lang/String;)Lloader!iu;")
	private Class257 method5630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return arg1 == -4655 ? this.method5638(1, arg2, arg1 + 4730, 0, arg0) : (Class257) null;
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lloader!iu;")
	private Class257 method5631(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 > -4) {
			this.method5614(25);
		}
		return this.method5638(9, new Object[] { arg0, arg2 }, 90, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public File method5632(@OriginalArg(0) String arg0) {
		return method5634(this.aString82, this.anInt6442, arg0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!iu;")
	private Class257 method5633(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 < 76) {
			this.aClass259Array1 = null;
		}
		return this.method5638(20, arg1, -80, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(Ljava/lang/Class;Z)Lloader!iu;")
	private Class257 method5635(@OriginalArg(0) Class arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.method5628(null, 56);
		}
		return this.method5638(11, arg0, 82, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(I)V")
	private void method5636(@OriginalArg(0) int arg0) {
		if (arg0 != -1309) {
			this.anInterface13_1 = null;
		}
		aLong209 = Class260.method5657() + 5000L;
	}

	@OriginalMember(owner = "loader!ng", name = "b", descriptor = "(I)Lloader!iu;")
	private Class257 method5637(@OriginalArg(0) int arg0) {
		if (arg0 <= 13) {
			this.method5641(null, null, null, false);
		}
		return this.method5638(13, null, 83, 0, 0);
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!iu;")
	private Class257 method5638(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class257 local3 = new Class257();
		local3.anInt6436 = arg3;
		local3.anInt6435 = arg4;
		local3.anObject9 = arg1;
		local3.anInt6434 = arg0;
		synchronized (this) {
			if (this.aClass257_3 == null) {
				this.aClass257_3 = this.aClass257_2 = local3;
			} else {
				this.aClass257_3.aClass257_1 = local3;
				this.aClass257_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!iu;")
	private Class257 method5640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		return arg0 == 2 ? this.method5638(2, arg2, 122, 0, arg1) : (Class257) null;
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;Z)Lloader!iu;")
	private Class257 method5641(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) boolean arg3) {
		return arg3 ? this.method5638(8, new Object[] { arg1, arg0, arg2 }, 115, 0, 0) : (Class257) null;
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	private byte[] method5642(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg0) {
			this.method5623();
		}
		@Pc(13) Class257 local13 = this.method5619(0, true, arg1, 21, 0);
		return (byte[]) local13.anObject8;
	}

	@OriginalMember(owner = "loader!ng", name = "a", descriptor = "(II)Lloader!iu;")
	private Class257 method5643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -119) {
			this.method5640(-101, -73, null);
		}
		return this.method5638(3, null, 125, 0, arg0);
	}

	@OriginalMember(owner = "loader!ng", name = "f", descriptor = "(I)Lloader!rb;")
	private Interface13 method5644(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.anInterface13_1 : (Interface13) null;
	}

	@OriginalMember(owner = "loader!ng", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class257 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean603) {
						return;
					}
					if (this.aClass257_2 != null) {
						local17 = this.aClass257_2;
						this.aClass257_2 = this.aClass257_2.aClass257_1;
						if (this.aClass257_2 == null) {
							this.aClass257_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local17.anInt6434;
				if (local45 == 1) {
					if (Class260.method5657() < aLong209) {
						throw new IOException();
					}
					local17.anObject8 = new Socket(InetAddress.getByName((String) local17.anObject9), local17.anInt6435);
				} else if (local45 == 2) {
					@Pc(58) Thread local58 = new Thread((Runnable) local17.anObject9);
					local58.setDaemon(true);
					local58.start();
					local58.setPriority(local17.anInt6435);
					local17.anObject8 = local58;
				} else if (local45 == 4) {
					if (aLong209 > Class260.method5657()) {
						throw new IOException();
					}
					local17.anObject8 = new DataInputStream(((URL) local17.anObject9).openStream());
				} else {
					@Pc(102) Object[] local102;
					if (local45 == 8) {
						local102 = (Object[]) local17.anObject9;
						if (((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local102[0]).getDeclaredMethod((String) local102[1], (Class[]) local102[2]);
					} else if (local45 == 9) {
						local102 = (Object[]) local17.anObject9;
						if (((Class) local102[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local102[0]).getDeclaredField((String) local102[1]);
					} else if (local45 == 18) {
						@Pc(862) Clipboard local862 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject8 = local862.getContents(null);
					} else if (local45 == 19) {
						@Pc(175) Transferable local175 = (Transferable) local17.anObject9;
						@Pc(178) Clipboard local178 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local178.setContents(local175, null);
					} else {
						@Pc(635) String local635;
						if (local45 == 3) {
							if (Class260.method5657() < aLong209) {
								throw new IOException();
							}
							local635 = (local17.anInt6435 >> 24 & 0xFF) + "." + (local17.anInt6435 >> 16 & 0xFF) + "." + (local17.anInt6435 >> 8 & 0xFF) + "." + (local17.anInt6435 & 0xFF);
							local17.anObject8 = InetAddress.getByName(local635).getHostName();
						} else if (local45 == 21) {
							if (aLong209 > Class260.method5657()) {
								throw new IOException();
							}
							local17.anObject8 = InetAddress.getByName((String) local17.anObject9).getAddress();
						} else if (local45 == 5) {
							local17.anObject8 = this.aClass255_1.method5597();
						} else if (local45 == 6) {
							@Pc(750) Frame local750 = new Frame("Jagex Full Screen");
							local17.anObject8 = local750;
							local750.setResizable(false);
							this.aClass255_1.method5595(local17.anInt6435 >>> 16, local17.anInt6436 >> 16, local17.anInt6436 & 0xFFFF, local17.anInt6435 & 0xFFFF, local750);
						} else if (local45 == 7) {
							this.aClass255_1.method5598();
						} else {
							@Pc(225) Class[] local225;
							@Pc(227) Runtime local227;
							@Pc(237) Method local237;
							if (local45 == 10) {
								local225 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local227 = Runtime.getRuntime();
								if (!aString80.startsWith("mac")) {
									local237 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local225);
									local237.setAccessible(true);
									local237.invoke(local227, local17.anObject9, "jawt");
									local237.setAccessible(false);
								}
								local237 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local225);
								local237.setAccessible(true);
								if (aString80.startsWith("linux") || aString80.startsWith("sunos")) {
									local237.invoke(local227, local17.anObject9, this.method5632("libjaggl_dri.so").toString());
									@Pc(353) Class local353 = ((Class) local17.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local353.getMethod("bind").invoke(null);
									local237.invoke(local227, local17.anObject9, this.method5632("libjaggl.so").toString());
									local353.getMethod("close").invoke(null);
								} else if (aString80.startsWith("mac")) {
									local237.invoke(local227, local17.anObject9, this.method5632("libjaggl.jnilib").toString());
								} else if (aString80.startsWith("win")) {
									local237.invoke(local227, local17.anObject9, this.method5632("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local237.setAccessible(false);
							} else {
								@Pc(419) int local419;
								if (local45 == 11) {
									@Pc(406) Field local406 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local406.setAccessible(true);
									@Pc(417) Vector local417 = (Vector) local406.get(((Class) local17.anObject9).getClassLoader());
									for (local419 = 0; local419 < local417.size(); local419++) {
										@Pc(431) Object local431 = local417.elementAt(local419);
										@Pc(438) Method local438 = local431.getClass().getDeclaredMethod("finalize");
										local438.setAccessible(true);
										local438.invoke(local431);
										local438.setAccessible(false);
										@Pc(455) Field local455 = local431.getClass().getDeclaredField("handle");
										local455.setAccessible(true);
										local455.set(local431, Integer.valueOf(0));
										local455.setAccessible(false);
									}
									local406.setAccessible(false);
								} else {
									@Pc(486) Class259 local486;
									if (local45 == 12) {
										local486 = method5639(this.aString82, this.anInt6442);
										local17.anObject8 = local486;
									} else if (local45 == 13) {
										local486 = method5627(this.anInt6442, this.aString82);
										local17.anObject8 = local486;
									} else if (local45 == 14) {
										@Pc(510) int local510 = local17.anInt6435;
										@Pc(513) int local513 = local17.anInt6436;
										this.aClass253_1.method5592(local510, local513);
									} else if (local45 == 15) {
										@Pc(734) boolean local734 = local17.anInt6435 != 0;
										@Pc(738) Component local738 = (Component) local17.anObject9;
										this.aClass253_1.method5591(local734, local738);
									} else if (local45 == 17) {
										local102 = (Object[]) local17.anObject9;
										this.aClass253_1.method5590((Component) local102[0], (Point) local102[2], (int[]) local102[1], local17.anInt6435, local17.anInt6436);
									} else if (local45 == 16) {
										try {
											if (!aString80.startsWith("win")) {
												throw new Exception();
											}
											local635 = (String) local17.anObject9;
											if (!local635.startsWith("http://") && !local635.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(650) String local650 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local419 = 0; local635.length() > local419; local419++) {
												if (local650.indexOf(local635.charAt(local419)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local635 + "\"");
											local17.anObject8 = null;
										} catch (@Pc(692) Exception local692) {
											local17.anObject8 = local692;
											throw local692;
										}
									} else if (local45 == 20) {
										try {
											local225 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local227 = Runtime.getRuntime();
											local237 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local225);
											local237.setAccessible(true);
											if (aString80.startsWith("win")) {
												if (aString81.startsWith("amd64") || aString81.startsWith("x86_64")) {
													local237.invoke(local227, local17.anObject9, this.method5632("jagmisc64.dll").toString());
												} else {
													local237.invoke(local227, local17.anObject9, this.method5632("jagmisc.dll").toString());
												}
											}
											local237.setAccessible(false);
										} catch (@Pc(619) Throwable local619) {
											local17.anObject8 = local619;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local17.anInt6433 = 1;
			} catch (@Pc(898) ThreadDeath local898) {
				throw local898;
			} catch (@Pc(901) Throwable local901) {
				local17.anInt6433 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}
}
