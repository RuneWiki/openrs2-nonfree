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

@OriginalClass("loader!kd")
public final class Class258 implements Runnable {

	@OriginalMember(owner = "loader!kd", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString68;

	@OriginalMember(owner = "loader!kd", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString69;

	@OriginalMember(owner = "loader!kd", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString70;

	@OriginalMember(owner = "loader!kd", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString71;

	@OriginalMember(owner = "loader!kd", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString72;

	@OriginalMember(owner = "loader!kd", name = "z", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!kd", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "loader!kd", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!kd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!kd", name = "c", descriptor = "I")
	private static int anInt7154 = 1;

	@OriginalMember(owner = "loader!kd", name = "A", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!kd", name = "u", descriptor = "J")
	private static volatile long aLong216 = 0L;

	@OriginalMember(owner = "loader!kd", name = "g", descriptor = "Lloader!bn;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "loader!kd", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!kd", name = "r", descriptor = "Lloader!gj;")
	private Class256 aClass256_2 = null;

	@OriginalMember(owner = "loader!kd", name = "f", descriptor = "Z")
	private boolean aBoolean512 = false;

	@OriginalMember(owner = "loader!kd", name = "b", descriptor = "Lloader!wj;")
	private Class259 aClass259_1 = null;

	@OriginalMember(owner = "loader!kd", name = "s", descriptor = "Lloader!gj;")
	private Class256 aClass256_3 = null;

	@OriginalMember(owner = "loader!kd", name = "l", descriptor = "Lloader!wj;")
	private Class259 aClass259_3 = null;

	@OriginalMember(owner = "loader!kd", name = "d", descriptor = "Lloader!wj;")
	private Class259 aClass259_2 = null;

	@OriginalMember(owner = "loader!kd", name = "y", descriptor = "Ljava/lang/String;")
	private final String aString73;

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "I")
	private final int anInt7153;

	@OriginalMember(owner = "loader!kd", name = "e", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!kd", name = "m", descriptor = "[Lloader!wj;")
	private Class259[] aClass259Array1;

	@OriginalMember(owner = "loader!kd", name = "h", descriptor = "Lloader!f;")
	private Class254 aClass254_1;

	@OriginalMember(owner = "loader!kd", name = "x", descriptor = "Lloader!h;")
	private Class257 aClass257_1;

	@OriginalMember(owner = "loader!kd", name = "w", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!wj;")
	private static Class259 method6162(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(15) String local15;
		if (arg1 == 33) {
			local15 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local15 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local15 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString74, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			@Pc(96) String local96 = local77[local79];
			if (local96.length() <= 0 || (new File(local96)).exists()) {
				try {
					return new Class259(new File(local96, local15), "rw", 10000L);
				} catch (@Pc(119) Exception local119) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!kd", name = "b", descriptor = "(Ljava/lang/String;II)Lloader!wj;")
	private static Class259 method6168(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(15) String local15;
		if (arg1 == 33) {
			local15 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local15 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local15 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString74, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local77.length; local85++) {
			@Pc(97) String local97 = local77[local85];
			if (local97.length() <= 0 || (new File(local97)).exists()) {
				try {
					return new Class259(new File(local97, local15), "rw", 10000L);
				} catch (@Pc(120) Exception local120) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	private static File method6188(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString74, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(82) int local82 = 0; local82 < local75.length; local82++) {
				for (@Pc(92) int local92 = 0; local92 < local50.length; local92++) {
					@Pc(131) String local131 = local50[local92] + local75[local82] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local77 != 0 || local138.exists()) {
							@Pc(151) String local151 = local50[local92];
							if (local77 != 1 || local151.length() <= 0 || (new File(local151)).exists()) {
								(new File(local50[local92] + local75[local82])).mkdir();
								if (arg1 != null) {
									(new File(local50[local92] + local75[local82] + "/" + arg1)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(217) int local217 = local133.read();
								local133.seek(0L);
								local133.write(local217);
								local133.seek(0L);
								local133.close();
								aHashtable2.put(arg0, local138);
								return local138;
							}
						}
					} catch (@Pc(236) Exception local236) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(244) Exception local244) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!kd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class258(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString73 = arg2;
		aString75 = "1.1";
		aString69 = "Unknown";
		this.anApplet2 = arg0;
		this.anInt7153 = arg1;
		try {
			aString69 = System.getProperty("java.vendor");
			aString75 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString72 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString72 = "Unknown";
		}
		aString70 = aString72.toLowerCase();
		try {
			aString71 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString71 = "";
		}
		try {
			aString68 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString68 = "";
		}
		try {
			aString74 = System.getProperty("user.home");
			if (aString74 != null) {
				aString74 = aString74 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString74 == null) {
			aString74 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
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
		this.aClass259_2 = new Class259(method6188("random.dat", null, this.anInt7153), "rw", 25L);
		this.aClass259_3 = new Class259(this.method6192("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass259_1 = new Class259(this.method6192("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass259Array1 = new Class259[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass259Array1[local193] = new Class259(this.method6192("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass254_1 = new Class254();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass257_1 = new Class257();
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
		this.aBoolean512 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lloader!gj;")
	private Class256 method6163(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		return arg0 == 69 ? this.method6179(new Object[] { arg1, arg2 }, arg0 ^ 0x47, 9, 0, 0) : (Class256) null;
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!gj;")
	private Class256 method6164(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 35) {
			this.method6175(true);
		}
		return this.method6179(arg0, 2, 20, 0, 0);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(IBLjava/lang/String;)Lloader!gj;")
	private Class256 method6165(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		return arg1 < 25 ? (Class256) null : this.method6179(arg2, 2, 1, 0, arg0);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(Ljava/awt/Component;III)Lloader!gj;")
	private Class256 method6166(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 != 14) {
			method6162(null, 20);
		}
		@Pc(11) Point local11 = arg0.getLocationOnScreen();
		return this.method6179(null, 2, 14, local11.y + arg2, arg1 - -local11.x);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(I)V")
	private void method6167(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean512 = true;
			this.notifyAll();
		}
		try {
			if (arg0 != 0) {
				this.anInterface13_1 = null;
			}
			this.aThread4.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass259_3 != null) {
			try {
				this.aClass259_3.method6205();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass259_1 != null) {
			try {
				this.aClass259_1.method6205();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass259Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass259Array1.length; local52++) {
				if (this.aClass259Array1[local52] != null) {
					try {
						this.aClass259Array1[local52].method6205();
					} catch (@Pc(76) IOException local76) {
					}
				}
			}
		}
		if (this.aClass259_2 != null) {
			try {
				this.aClass259_2.method6205();
			} catch (@Pc(88) IOException local88) {
			}
		}
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "([IIILjava/awt/Component;BLjava/awt/Point;)Lloader!gj;")
	private Class256 method6169(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) Point arg5) {
		if (arg4 != -36) {
			this.aClass259Array1 = null;
		}
		return this.method6179(new Object[] { arg3, arg0, arg5 }, arg4 + 38, 17, arg2, arg1);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!gj;")
	private Class256 method6170(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -116) {
			this.method6177(56, 33, 117, 62, -104);
		}
		return this.method6179(arg0, 2, 7, 0, 0);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(ZLjava/lang/String;)Lloader!gj;")
	private Class256 method6171(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (!arg0) {
			this.aClass259Array1 = null;
		}
		return this.method6179(arg1, 2, 21, 0, 0);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(B)V")
	private void method6172(@OriginalArg(0) byte arg0) {
		aLong216 = Class255.method6157() + 5000L;
		if (arg0 >= -39) {
			anInt7154 = -57;
		}
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;[Ljava/lang/Class;)Lloader!gj;")
	private Class256 method6173(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class[] arg3) {
		if (arg1 <= 44) {
			this.method6181(-29, null);
		}
		return this.method6179(new Object[] { arg0, arg2, arg3 }, 2, 8, 0, 0);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method6174(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.method6174(null, true);
		}
		@Pc(16) Class256 local16 = this.method6191(11973, 21, 0, 0, arg0);
		return (byte[]) local16.anObject8;
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(Z)Lloader!bn;")
	private Interface13 method6175(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6169(null, -56, 46, null, (byte) -71, null);
		}
		return this.anInterface13_1;
	}

	@OriginalMember(owner = "loader!kd", name = "b", descriptor = "(B)Z")
	private boolean method6176(@OriginalArg(0) byte arg0) {
		if (arg0 < 60) {
			this.method6163((byte) 102, null, null);
		}
		return this.aClass254_1 != null;
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(IIIII)Lloader!gj;")
	private Class256 method6177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg2 == 439 ? this.method6179(null, arg2 - 437, 6, arg1 + (arg4 << 16), (arg3 << 16) - -arg0) : (Class256) null;
	}

	@OriginalMember(owner = "loader!kd", name = "b", descriptor = "(Z)Lloader!gj;")
	private Class256 method6178(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6170(null, -39);
		}
		return this.method6179(null, 2, 13, 0, 0);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!gj;")
	private Class256 method6179(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class256 local3 = new Class256();
		local3.anInt7150 = arg3;
		local3.anObject9 = arg0;
		local3.anInt7151 = arg2;
		local3.anInt7152 = arg4;
		synchronized (this) {
			if (arg1 != 2) {
				return (Class256) null;
			}
			if (this.aClass256_2 == null) {
				this.aClass256_2 = this.aClass256_3 = local3;
			} else {
				this.aClass256_2.aClass256_1 = local3;
				this.aClass256_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lloader!gj;")
	private Class256 method6180(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 == 19 ? this.method6179(arg1, 2, 19, 0, 0) : (Class256) null;
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!gj;")
	private Class256 method6181(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		return arg0 == 0 ? this.method6179(arg1, 2, 10, 0, 0) : (Class256) null;
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!gj;")
	private Class256 method6182(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 102) {
			aString72 = null;
		}
		return this.method6179(arg0, 2, 4, 0, 0);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(II)Lloader!gj;")
	private Class256 method6183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 <= 82 ? (Class256) null : this.method6179(null, 2, 3, 0, arg0);
	}

	@OriginalMember(owner = "loader!kd", name = "c", descriptor = "(I)Lloader!gj;")
	private Class256 method6184(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method6178(true);
		}
		return this.method6179(null, arg0 ^ 0x2, 5, 0, 0);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lloader!gj;")
	private Class256 method6185(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Runnable arg2) {
		return arg1 ? this.method6179(arg2, 2, 2, 0, arg0) : (Class256) null;
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(ZILjava/awt/Component;)Lloader!gj;")
	private Class256 method6186(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		return arg1 == 0 ? this.method6179(arg2, 2, 15, 0, arg0 ? 1 : 0) : (Class256) null;
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!gj;")
	private Class256 method6187(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		return arg0 < 58 ? (Class256) null : this.method6179(arg1, 2, 11, 0, 0);
	}

	@OriginalMember(owner = "loader!kd", name = "d", descriptor = "(I)Lloader!gj;")
	private Class256 method6189() {
		return this.method6179(null, 2, 18, 0, 0);
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!gj;")
	private Class256 method6190(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -122) {
			aString71 = null;
		}
		return this.method6179(arg0, 2, 16, 0, 0);
	}

	@OriginalMember(owner = "loader!kd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class256 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean512) {
						return;
					}
					if (this.aClass256_3 != null) {
						local15 = this.aClass256_3;
						this.aClass256_3 = this.aClass256_3.aClass256_1;
						if (this.aClass256_3 == null) {
							this.aClass256_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(44) int local44 = local15.anInt7151;
				if (local44 == 1) {
					if (aLong216 > Class255.method6157()) {
						throw new IOException();
					}
					local15.anObject8 = new Socket(InetAddress.getByName((String) local15.anObject9), local15.anInt7152);
				} else if (local44 == 2) {
					@Pc(81) Thread local81 = new Thread((Runnable) local15.anObject9);
					local81.setDaemon(true);
					local81.start();
					local81.setPriority(local15.anInt7152);
					local15.anObject8 = local81;
				} else if (local44 == 4) {
					if (aLong216 > Class255.method6157()) {
						throw new IOException();
					}
					local15.anObject8 = new DataInputStream(((URL) local15.anObject9).openStream());
				} else {
					@Pc(132) Object[] local132;
					if (local44 == 8) {
						local132 = (Object[]) local15.anObject9;
						if (((Class) local132[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject8 = ((Class) local132[0]).getDeclaredMethod((String) local132[1], (Class[]) local132[2]);
					} else if (local44 == 9) {
						local132 = (Object[]) local15.anObject9;
						if (((Class) local132[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject8 = ((Class) local132[0]).getDeclaredField((String) local132[1]);
					} else if (local44 == 18) {
						@Pc(849) Clipboard local849 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject8 = local849.getContents(null);
					} else if (local44 == 19) {
						@Pc(166) Transferable local166 = (Transferable) local15.anObject9;
						@Pc(169) Clipboard local169 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local169.setContents(local166, null);
					} else {
						@Pc(452) String local452;
						if (local44 == 3) {
							if (Class255.method6157() < aLong216) {
								throw new IOException();
							}
							local452 = (local15.anInt7152 >> 24 & 0xFF) + "." + (local15.anInt7152 >> 16 & 0xFF) + "." + (local15.anInt7152 >> 8 & 0xFF) + "." + (local15.anInt7152 & 0xFF);
							local15.anObject8 = InetAddress.getByName(local452).getHostName();
						} else if (local44 == 21) {
							if (Class255.method6157() < aLong216) {
								throw new IOException();
							}
							local15.anObject8 = InetAddress.getByName((String) local15.anObject9).getAddress();
						} else if (local44 == 5) {
							local15.anObject8 = this.aClass254_1.method6156();
						} else if (local44 == 6) {
							@Pc(740) Frame local740 = new Frame("Jagex Full Screen");
							local15.anObject8 = local740;
							local740.setResizable(false);
							this.aClass254_1.method6153(local740, local15.anInt7150 >> 16, local15.anInt7152 & 0xFFFF, local15.anInt7152 >>> 16, local15.anInt7150 & 0xFFFF);
						} else if (local44 == 7) {
							this.aClass254_1.method6154();
						} else {
							@Pc(366) Runtime local366;
							@Pc(372) Method local372;
							@Pc(364) Class[] local364;
							if (local44 == 10) {
								local364 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local366 = Runtime.getRuntime();
								if (!aString70.startsWith("mac")) {
									local372 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local364);
									local372.setAccessible(true);
									local372.invoke(local366, local15.anObject9, "jawt");
									local372.setAccessible(false);
								}
								local372 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local364);
								local372.setAccessible(true);
								if (aString70.startsWith("linux") || aString70.startsWith("sunos")) {
									local372.invoke(local366, local15.anObject9, this.method6192("libjaggl_dri.so").toString());
									@Pc(692) Class local692 = ((Class) local15.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local692.getMethod("bind").invoke(null);
									local372.invoke(local366, local15.anObject9, this.method6192("libjaggl.so").toString());
									local692.getMethod("close").invoke(null);
								} else if (aString70.startsWith("mac")) {
									local372.invoke(local366, local15.anObject9, this.method6192("libjaggl.jnilib").toString());
								} else if (aString70.startsWith("win")) {
									local372.invoke(local366, local15.anObject9, this.method6192("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local372.setAccessible(false);
							} else {
								@Pc(235) int local235;
								if (local44 == 11) {
									@Pc(222) Field local222 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local222.setAccessible(true);
									@Pc(233) Vector local233 = (Vector) local222.get(((Class) local15.anObject9).getClassLoader());
									for (local235 = 0; local233.size() > local235; local235++) {
										@Pc(243) Object local243 = local233.elementAt(local235);
										@Pc(250) Method local250 = local243.getClass().getDeclaredMethod("finalize");
										local250.setAccessible(true);
										local250.invoke(local243);
										local250.setAccessible(false);
										@Pc(267) Field local267 = local243.getClass().getDeclaredField("handle");
										local267.setAccessible(true);
										local267.set(local243, Integer.valueOf(0));
										local267.setAccessible(false);
									}
									local222.setAccessible(false);
								} else {
									@Pc(535) Class259 local535;
									if (local44 == 12) {
										local535 = method6162(this.aString73, this.anInt7153);
										local15.anObject8 = local535;
									} else if (local44 == 13) {
										local535 = method6168(this.aString73, this.anInt7153);
										local15.anObject8 = local535;
									} else if (local44 == 14) {
										@Pc(300) int local300 = local15.anInt7152;
										@Pc(303) int local303 = local15.anInt7150;
										this.aClass257_1.method6161(local303, local300);
									} else if (local44 == 15) {
										@Pc(517) boolean local517 = local15.anInt7152 != 0;
										@Pc(521) Component local521 = (Component) local15.anObject9;
										this.aClass257_1.method6159(local521, local517);
									} else if (local44 == 17) {
										local132 = (Object[]) local15.anObject9;
										this.aClass257_1.method6160(local15.anInt7150, local15.anInt7152, (Point) local132[2], (Component) local132[0], (int[]) local132[1]);
									} else if (local44 == 16) {
										try {
											if (!aString70.startsWith("win")) {
												throw new Exception();
											}
											local452 = (String) local15.anObject9;
											if (!local452.startsWith("http://") && !local452.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(467) String local467 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local235 = 0; local452.length() > local235; local235++) {
												if (local467.indexOf(local452.charAt(local235)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local452 + "\"");
											local15.anObject8 = null;
										} catch (@Pc(505) Exception local505) {
											local15.anObject8 = local505;
											throw local505;
										}
									} else if (local44 == 20) {
										try {
											local364 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local366 = Runtime.getRuntime();
											local372 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local364);
											local372.setAccessible(true);
											if (aString70.startsWith("win")) {
												if (aString71.startsWith("amd64") || aString71.startsWith("x86_64")) {
													local372.invoke(local366, local15.anObject9, this.method6192("jagmisc64.dll").toString());
												} else {
													local372.invoke(local366, local15.anObject9, this.method6192("jagmisc.dll").toString());
												}
											}
											local372.setAccessible(false);
										} catch (@Pc(431) Throwable local431) {
											local15.anObject8 = local431;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local15.anInt7149 = 1;
			} catch (@Pc(892) ThreadDeath local892) {
				throw local892;
			} catch (@Pc(895) Throwable local895) {
				local15.anInt7149 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!gj;")
	private Class256 method6191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class256 local3 = new Class256();
		if (arg0 != 11973) {
			anInt7154 = 79;
		}
		synchronized (local3) {
			local3.anInt7151 = arg1;
			local3.anInt7152 = arg3;
			local3.anObject9 = arg4;
			local3.anInt7150 = arg2;
			synchronized (this) {
				if (this.aClass256_2 == null) {
					this.aClass256_2 = this.aClass256_3 = local3;
				} else {
					this.aClass256_2.aClass256_1 = local3;
					this.aClass256_2 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(59) InterruptedException local59) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!kd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method6192(@OriginalArg(1) String arg0) {
		return method6188(arg0, this.aString73, this.anInt7153);
	}

	@OriginalMember(owner = "loader!kd", name = "b", descriptor = "(I)Lloader!gj;")
	private Class256 method6193(@OriginalArg(0) int arg0) {
		if (arg0 > -55) {
			method6188(null, null, 61);
		}
		return this.method6179(null, 2, 12, 0, 0);
	}
}
