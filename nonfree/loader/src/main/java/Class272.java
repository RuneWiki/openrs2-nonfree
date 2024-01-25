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

@OriginalClass("loader!hf")
public final class Class272 implements Runnable {

	@OriginalMember(owner = "loader!hf", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!hf", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "loader!hf", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!hf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "loader!hf", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!hf", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!hf", name = "v", descriptor = "Ljava/lang/String;")
	private static String aString82;

	@OriginalMember(owner = "loader!hf", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!hf", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!hf", name = "p", descriptor = "I")
	private static final int anInt7281 = 1;

	@OriginalMember(owner = "loader!hf", name = "m", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!hf", name = "y", descriptor = "J")
	private static volatile long aLong219 = 0L;

	@OriginalMember(owner = "loader!hf", name = "q", descriptor = "Lloader!td;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "loader!hf", name = "e", descriptor = "Lloader!uu;")
	private Class275 aClass275_1 = null;

	@OriginalMember(owner = "loader!hf", name = "k", descriptor = "Z")
	private boolean aBoolean497 = false;

	@OriginalMember(owner = "loader!hf", name = "t", descriptor = "Lloader!ko;")
	private Class274 aClass274_1 = null;

	@OriginalMember(owner = "loader!hf", name = "j", descriptor = "Lloader!uu;")
	private Class275 aClass275_2 = null;

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "Lloader!ko;")
	private Class274 aClass274_2 = null;

	@OriginalMember(owner = "loader!hf", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!hf", name = "b", descriptor = "Lloader!ko;")
	private Class274 aClass274_3 = null;

	@OriginalMember(owner = "loader!hf", name = "z", descriptor = "Ljava/lang/String;")
	private String aString78;

	@OriginalMember(owner = "loader!hf", name = "d", descriptor = "I")
	private final int anInt7280;

	@OriginalMember(owner = "loader!hf", name = "f", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!hf", name = "l", descriptor = "[Lloader!ko;")
	private final Class274[] aClass274Array1;

	@OriginalMember(owner = "loader!hf", name = "o", descriptor = "Lloader!c;")
	private Class268 aClass268_1;

	@OriginalMember(owner = "loader!hf", name = "r", descriptor = "Lloader!e;")
	private Class270 aClass270_1;

	@OriginalMember(owner = "loader!hf", name = "A", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)Lloader!ko;")
	private static Class274 method6011(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(19) String local19;
		if (arg2 == 33) {
			local19 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local19 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(92) String[] local92 = new String[] { "c:/rscache/", "/rscache/", aString77, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(94) int local94 = 0; local94 < local92.length; local94++) {
			@Pc(106) String local106 = local92[local94];
			if (local106.length() <= 0 || (new File(local106)).exists()) {
				try {
					return new Class274(new File(local106, local19), "rw", 10000L);
				} catch (@Pc(129) Exception local129) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method6019(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(55) String[] local55 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString77, "/tmp/", "" };
		@Pc(80) String[] local80 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(82) int local82 = 0; local82 < 2; local82++) {
			for (@Pc(89) int local89 = 0; local89 < local80.length; local89++) {
				for (@Pc(95) int local95 = 0; local95 < local55.length; local95++) {
					@Pc(130) String local130 = local55[local95] + local80[local89] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(132) RandomAccessFile local132 = null;
					try {
						@Pc(137) File local137 = new File(local130);
						if (local82 != 0 || local137.exists()) {
							@Pc(151) String local151 = local55[local95];
							if (local82 != 1 || local151.length() <= 0 || (new File(local151)).exists()) {
								(new File(local55[local95] + local80[local89])).mkdir();
								if (arg1 != null) {
									(new File(local55[local95] + local80[local89] + "/" + arg1)).mkdir();
								}
								local132 = new RandomAccessFile(local137, "rw");
								@Pc(215) int local215 = local132.read();
								local132.seek(0L);
								local132.write(local215);
								local132.seek(0L);
								local132.close();
								aHashtable4.put(arg2, local137);
								return local137;
							}
						}
					} catch (@Pc(234) Exception local234) {
						try {
							if (local132 != null) {
								local132.close();
							}
						} catch (@Pc(242) Exception local242) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!hf", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class272(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString78 = arg2;
		aString79 = "1.1";
		aString76 = "Unknown";
		this.anApplet2 = arg0;
		this.anInt7280 = arg1;
		try {
			aString76 = System.getProperty("java.vendor");
			aString79 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString82 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString82 = "Unknown";
		}
		aString80 = aString82.toLowerCase();
		try {
			aString81 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString81 = "";
		}
		try {
			aString75 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString75 = "";
		}
		try {
			aString77 = System.getProperty("user.home");
			if (aString77 != null) {
				aString77 = aString77 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString77 == null) {
			aString77 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(150) Exception local150) {
		}
		this.aClass274_2 = new Class274(method6019(this.anInt7280, null, "random.dat"), "rw", 25L);
		this.aClass274_1 = new Class274(this.method6021("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass274_3 = new Class274(this.method6021("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass274Array1 = new Class274[arg3];
		for (@Pc(191) int local191 = 0; local191 < arg3; local191++) {
			this.aClass274Array1[local191] = new Class274(this.method6021("main_file_cache.idx" + local191), "rw", 1048576L);
		}
		try {
			this.aClass268_1 = new Class268();
		} catch (@Pc(227) Throwable local227) {
		}
		try {
			this.aClass270_1 = new Class270();
		} catch (@Pc(234) Throwable local234) {
		}
		@Pc(237) ThreadGroup local237 = Thread.currentThread().getThreadGroup();
		for (@Pc(240) ThreadGroup local240 = local237.getParent(); local240 != null; local240 = local240.getParent()) {
			local237 = local240;
		}
		@Pc(251) Thread[] local251 = new Thread[1000];
		local237.enumerate(local251);
		for (@Pc(257) int local257 = 0; local257 < local251.length; local257++) {
			if (local251[local257] != null && local251[local257].getName().startsWith("AWT")) {
				local251[local257].setPriority(1);
			}
		}
		this.aBoolean497 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!uu;")
	private Class275 method6007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class275 local3 = new Class275();
		local3.anObject13 = arg4;
		local3.anInt7286 = arg2;
		local3.anInt7289 = arg0;
		local3.anInt7287 = arg1;
		synchronized (this) {
			if (arg3 >= -35) {
				this.aString78 = null;
			}
			if (this.aClass275_1 == null) {
				this.aClass275_1 = this.aClass275_2 = local3;
			} else {
				this.aClass275_1.aClass275_3 = local3;
				this.aClass275_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lloader!uu;")
	private Class275 method6008(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 == -52 ? this.method6007(19, 0, 0, arg0 ^ 0x6, arg1) : (Class275) null;
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!uu;")
	private Class275 method6009(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 78) {
			this.method6014(75, null, (byte) 52, 77);
		}
		return this.method6007(4, 0, 0, -61, arg0);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(IILjava/awt/Component;[IBLjava/awt/Point;)Lloader!uu;")
	private Class275 method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) Point arg5) {
		if (arg4 != 104) {
			this.method6021(null);
		}
		return this.method6007(17, arg1, arg0, -112, new Object[] { arg2, arg3, arg5 });
	}

	@OriginalMember(owner = "loader!hf", name = "b", descriptor = "(I)Lloader!uu;")
	private Class275 method6012(@OriginalArg(0) int arg0) {
		if (arg0 <= 107) {
			aString81 = null;
		}
		return this.method6007(5, 0, 0, -116, null);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!uu;")
	private Class275 method6013(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 < 71) {
			aString77 = null;
		}
		return this.method6007(16, 0, 0, -73, arg0);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(ILjava/awt/Component;BI)Lloader!uu;")
	private Class275 method6014(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		if (arg2 > -71) {
			this.method6030(87, null, null);
		}
		@Pc(13) Point local13 = arg1.getLocationOnScreen();
		return this.method6007(14, local13.y + arg0, local13.x + arg3, -43, null);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method6015(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.aThread4 = null;
		}
		@Pc(13) Class275 local13 = this.method6031(0, 21, 0, 0, arg0);
		return (byte[]) local13.anObject12;
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(BLjava/lang/String;)Lloader!uu;")
	private Class275 method6016(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 72) {
			this.method6020(-35);
		}
		return this.method6007(12, 0, 0, -84, arg1);
	}

	@OriginalMember(owner = "loader!hf", name = "c", descriptor = "(I)Z")
	private boolean method6017(@OriginalArg(0) int arg0) {
		if (arg0 != -35) {
			this.method6030(-86, null, null);
		}
		return this.aClass268_1 != null;
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!uu;")
	private Class275 method6018(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 > -15) {
			this.method6008((byte) -85, null);
		}
		return this.method6007(11, 0, 0, -40, arg1);
	}

	@OriginalMember(owner = "loader!hf", name = "d", descriptor = "(I)V")
	private void method6020(@OriginalArg(0) int arg0) {
		aLong219 = (long) arg0 + Class273.method6036();
	}

	@OriginalMember(owner = "loader!hf", name = "b", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method6021(@OriginalArg(1) String arg0) {
		return method6019(this.anInt7280, this.aString78, arg0);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Lloader!uu;")
	private Class275 method6022(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) String arg3) {
		if (arg1 != 60) {
			this.aBoolean497 = true;
		}
		return this.method6007(8, 0, 0, -74, new Object[] { arg0, arg3, arg2 });
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(Ljava/lang/String;IB)Lloader!uu;")
	private Class275 method6023(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method6007(1, 0, arg1, -58, arg0);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(IIBII)Lloader!uu;")
	private Class275 method6024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != -107) {
			this.method6018(-33, null);
		}
		return this.method6007(6, (arg1 << 16) + arg3, arg4 + (arg0 << 16), -114, null);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(I)Lloader!td;")
	private Interface13 method6025(@OriginalArg(0) int arg0) {
		return arg0 <= 40 ? (Interface13) null : this.anInterface13_1;
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(BLjava/awt/Frame;)Lloader!uu;")
	private Class275 method6026(@OriginalArg(0) byte arg0, @OriginalArg(1) Frame arg1) {
		return arg0 > -100 ? (Class275) null : this.method6007(7, 0, 0, -37, arg1);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(ZLjava/awt/Component;I)Lloader!uu;")
	private Class275 method6027(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 15) {
			aString80 = null;
		}
		return this.method6007(15, 0, arg0 ? 1 : 0, -121, arg1);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(B)Lloader!uu;")
	private Class275 method6028(@OriginalArg(0) byte arg0) {
		return arg0 == -49 ? this.method6007(18, 0, 0, -73, null) : (Class275) null;
	}

	@OriginalMember(owner = "loader!hf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class275 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean497) {
						return;
					}
					if (this.aClass275_2 != null) {
						local17 = this.aClass275_2;
						this.aClass275_2 = this.aClass275_2.aClass275_3;
						if (this.aClass275_2 == null) {
							this.aClass275_1 = null;
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
				@Pc(45) int local45 = local17.anInt7289;
				if (local45 == 1) {
					if (Class273.method6036() < aLong219) {
						throw new IOException();
					}
					local17.anObject12 = new Socket(InetAddress.getByName((String) local17.anObject13), local17.anInt7286);
				} else if (local45 == 2) {
					@Pc(85) Thread local85 = new Thread((Runnable) local17.anObject13);
					local85.setDaemon(true);
					local85.start();
					local85.setPriority(local17.anInt7286);
					local17.anObject12 = local85;
				} else if (local45 == 4) {
					if (Class273.method6036() < aLong219) {
						throw new IOException();
					}
					local17.anObject12 = new DataInputStream(((URL) local17.anObject13).openStream());
				} else {
					@Pc(315) Object[] local315;
					if (local45 == 8) {
						local315 = (Object[]) local17.anObject13;
						if (((Class) local315[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject12 = ((Class) local315[0]).getDeclaredMethod((String) local315[1], (Class[]) local315[2]);
					} else if (local45 == 9) {
						local315 = (Object[]) local17.anObject13;
						if (((Class) local315[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject12 = ((Class) local315[0]).getDeclaredField((String) local315[1]);
					} else if (local45 == 18) {
						@Pc(601) Clipboard local601 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject12 = local601.getContents(null);
					} else if (local45 == 19) {
						@Pc(121) Transferable local121 = (Transferable) local17.anObject13;
						@Pc(124) Clipboard local124 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local124.setContents(local121, null);
					} else {
						@Pc(181) String local181;
						if (local45 == 3) {
							if (Class273.method6036() < aLong219) {
								throw new IOException();
							}
							local181 = (local17.anInt7286 >> 24 & 0xFF) + "." + (local17.anInt7286 >> 16 & 0xFF) + "." + (local17.anInt7286 >> 8 & 0xFF) + "." + (local17.anInt7286 & 0xFF);
							local17.anObject12 = InetAddress.getByName(local181).getHostName();
						} else if (local45 == 21) {
							if (aLong219 > Class273.method6036()) {
								throw new IOException();
							}
							local17.anObject12 = InetAddress.getByName((String) local17.anObject13).getAddress();
						} else if (local45 == 5) {
							local17.anObject12 = this.aClass268_1.method5996();
						} else if (local45 == 6) {
							@Pc(210) Frame local210 = new Frame("Jagex Full Screen");
							local17.anObject12 = local210;
							local210.setResizable(false);
							this.aClass268_1.method5995(local17.anInt7286 & 0xFFFF, local210, local17.anInt7287 >> 16, local17.anInt7286 >>> 16, local17.anInt7287 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass268_1.method5994();
						} else {
							@Pc(463) int local463;
							if (local45 == 11) {
								@Pc(513) Field local513 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local513.setAccessible(true);
								@Pc(524) Vector local524 = (Vector) local513.get(((Class) local17.anObject13).getClassLoader());
								for (local463 = 0; local524.size() > local463; local463++) {
									@Pc(534) Object local534 = local524.elementAt(local463);
									@Pc(541) Method local541 = local534.getClass().getDeclaredMethod("finalize");
									local541.setAccessible(true);
									local541.invoke(local534);
									local541.setAccessible(false);
									@Pc(558) Field local558 = local534.getClass().getDeclaredField("handle");
									local558.setAccessible(true);
									local558.set(local534, Integer.valueOf(0));
									local558.setAccessible(false);
								}
								local513.setAccessible(false);
							} else if (local45 == 12) {
								@Pc(264) Class274 local264 = method6011((String) local17.anObject13, this.aString78, this.anInt7280);
								local17.anObject12 = local264;
							} else if (local45 == 14) {
								@Pc(274) int local274 = local17.anInt7286;
								@Pc(277) int local277 = local17.anInt7287;
								this.aClass270_1.method6000(local274, local277);
							} else if (local45 == 15) {
								@Pc(296) boolean local296 = local17.anInt7286 != 0;
								@Pc(300) Component local300 = (Component) local17.anObject13;
								this.aClass270_1.method5999(local296, local300);
							} else if (local45 == 17) {
								local315 = (Object[]) local17.anObject13;
								this.aClass270_1.method5998((Component) local315[0], (Point) local315[2], local17.anInt7287, local17.anInt7286, (int[]) local315[1]);
							} else if (local45 == 16) {
								try {
									if (!aString80.startsWith("win")) {
										throw new Exception();
									}
									local181 = (String) local17.anObject13;
									if (!local181.startsWith("http://") && !local181.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(461) String local461 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local463 = 0; local181.length() > local463; local463++) {
										if (local461.indexOf(local181.charAt(local463)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local181 + "\"");
									local17.anObject12 = null;
								} catch (@Pc(503) Exception local503) {
									local17.anObject12 = local503;
									throw local503;
								}
							} else if (local45 == 20) {
								try {
									@Pc(358) Class[] local358 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(360) Runtime local360 = Runtime.getRuntime();
									@Pc(366) Method local366 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local358);
									local366.setAccessible(true);
									if (aString80.startsWith("win")) {
										if (aString81.startsWith("amd64") || aString81.startsWith("x86_64")) {
											local366.invoke(local360, local17.anObject13, this.method6021("jagmisc64.dll").toString());
										} else {
											local366.invoke(local360, local17.anObject13, this.method6021("jagmisc.dll").toString());
										}
									}
									local366.setAccessible(false);
								} catch (@Pc(426) Throwable local426) {
									local17.anObject12 = local426;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local17.anInt7288 = 1;
			} catch (@Pc(690) ThreadDeath local690) {
				throw local690;
			} catch (@Pc(693) Throwable local693) {
				local17.anInt7288 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(ILjava/lang/String;)Lloader!uu;")
	private Class275 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == -1 ? this.method6007(21, 0, 0, -62, arg1) : (Class275) null;
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lloader!uu;")
	private Class275 method6030(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		if (arg0 != 9) {
			aString82 = null;
		}
		return this.method6007(9, 0, 0, -95, new Object[] { arg1, arg2 });
	}

	@OriginalMember(owner = "loader!hf", name = "b", descriptor = "(IIIILjava/lang/Object;)Lloader!uu;")
	private Class275 method6031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class275 local3 = new Class275();
		synchronized (local3) {
			local3.anInt7286 = arg3;
			local3.anObject13 = arg4;
			local3.anInt7289 = arg1;
			local3.anInt7287 = arg0;
			synchronized (this) {
				if (this.aClass275_1 == null) {
					this.aClass275_1 = this.aClass275_2 = local3;
				} else {
					this.aClass275_1.aClass275_3 = local3;
					this.aClass275_1 = local3;
				}
				this.notify();
			}
			if (arg2 != 0) {
				this.method6027(false, null, 66);
			}
			try {
				local3.wait();
			} catch (@Pc(64) InterruptedException local64) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(IZ)Lloader!uu;")
	private Class275 method6032(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? (Class275) null : this.method6007(3, 0, arg0, -97, null);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lloader!uu;")
	private Class275 method6033(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 2) {
			this.anEventQueue2 = null;
		}
		return this.method6007(2, 0, arg0, -61, arg1);
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(Z)V")
	private void method6034(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			this.aBoolean497 = arg0;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass274_1 != null) {
			try {
				this.aClass274_1.method6040();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass274_3 != null) {
			try {
				this.aClass274_3.method6040();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass274Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass274Array1.length; local47++) {
				if (this.aClass274Array1[local47] != null) {
					try {
						this.aClass274Array1[local47].method6040();
					} catch (@Pc(65) IOException local65) {
					}
				}
			}
		}
		if (this.aClass274_2 != null) {
			try {
				this.aClass274_2.method6040();
			} catch (@Pc(77) IOException local77) {
			}
		}
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!uu;")
	private Class275 method6035(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		return arg0 <= 91 ? (Class275) null : this.method6007(20, 0, 0, -38, arg1);
	}
}
