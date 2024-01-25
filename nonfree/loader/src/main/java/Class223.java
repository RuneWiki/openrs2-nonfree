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

@OriginalClass("loader!ml")
public final class Class223 implements Runnable {

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString72;

	@OriginalMember(owner = "loader!ml", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString73;

	@OriginalMember(owner = "loader!ml", name = "w", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!ml", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "loader!ml", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "loader!ml", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!ml", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!ml", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ml", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ml", name = "m", descriptor = "I")
	private static final int anInt6832 = 1;

	@OriginalMember(owner = "loader!ml", name = "x", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!ml", name = "u", descriptor = "J")
	private static volatile long aLong226 = 0L;

	@OriginalMember(owner = "loader!ml", name = "c", descriptor = "Lloader!sb;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!ml", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ml", name = "d", descriptor = "Lloader!hd;")
	private Class222 aClass222_1 = null;

	@OriginalMember(owner = "loader!ml", name = "f", descriptor = "Lloader!sm;")
	private Class225 aClass225_1 = null;

	@OriginalMember(owner = "loader!ml", name = "l", descriptor = "Lloader!hd;")
	private Class222 aClass222_2 = null;

	@OriginalMember(owner = "loader!ml", name = "k", descriptor = "Z")
	private boolean aBoolean496 = false;

	@OriginalMember(owner = "loader!ml", name = "A", descriptor = "Lloader!sm;")
	private Class225 aClass225_2 = null;

	@OriginalMember(owner = "loader!ml", name = "p", descriptor = "Lloader!hd;")
	private Class222 aClass222_3 = null;

	@OriginalMember(owner = "loader!ml", name = "e", descriptor = "I")
	private final int anInt6831;

	@OriginalMember(owner = "loader!ml", name = "z", descriptor = "Ljava/lang/String;")
	private final String aString75;

	@OriginalMember(owner = "loader!ml", name = "o", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ml", name = "i", descriptor = "[Lloader!hd;")
	private Class222[] aClass222Array1;

	@OriginalMember(owner = "loader!ml", name = "s", descriptor = "Lloader!f;")
	private Class221 aClass221_1;

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "Lloader!e;")
	private Class220 aClass220_1;

	@OriginalMember(owner = "loader!ml", name = "y", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ZILjava/lang/String;)Lloader!hd;")
	private static Class222 method5753(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(18) String local18;
		if (arg0 == 33) {
			local18 = "jagex_" + arg1 + "_preferences2_rc.dat";
		} else if (arg0 == 34) {
			local18 = "jagex_" + arg1 + "_preferences2_wip.dat";
		} else {
			local18 = "jagex_" + arg1 + "_preferences2.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString74, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			@Pc(87) String local87 = local77[local79];
			if (local87.length() <= 0 || (new File(local87)).exists()) {
				try {
					return new Class222(new File(local87, local18), "rw", 10000L);
				} catch (@Pc(113) Exception local113) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IILjava/lang/String;)Lloader!hd;")
	private static Class222 method5762(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(18) String local18;
		if (arg0 == 33) {
			local18 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local18 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local18 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(83) String[] local83 = new String[] { "c:/rscache/", "/rscache/", aString74, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local83.length; local85++) {
			@Pc(97) String local97 = local83[local85];
			if (local97.length() <= 0 || (new File(local97)).exists()) {
				try {
					return new Class222(new File(local97, local18), "rw", 10000L);
				} catch (@Pc(121) Exception local121) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)Ljava/io/File;")
	private static File method5766(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString74, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(76) int local76 = 0; local76 < local69.length; local76++) {
				for (@Pc(82) int local82 = 0; local82 < local44.length; local82++) {
					@Pc(121) String local121 = local44[local82] + local69[local76] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(123) RandomAccessFile local123 = null;
					try {
						@Pc(128) File local128 = new File(local121);
						if (local71 != 0 || local128.exists()) {
							@Pc(142) String local142 = local44[local82];
							if (local71 != 1 || local142.length() <= 0 || (new File(local142)).exists()) {
								(new File(local44[local82] + local69[local76])).mkdir();
								if (arg2 != null) {
									(new File(local44[local82] + local69[local76] + "/" + arg2)).mkdir();
								}
								local123 = new RandomAccessFile(local128, "rw");
								@Pc(211) int local211 = local123.read();
								local123.seek(0L);
								local123.write(local211);
								local123.seek(0L);
								local123.close();
								aHashtable2.put(arg0, local128);
								return local128;
							}
						}
					} catch (@Pc(230) Exception local230) {
						try {
							if (local123 != null) {
								local123.close();
							}
						} catch (@Pc(238) Exception local238) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ml", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class223(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt6831 = arg1;
		this.anApplet3 = arg0;
		this.aString75 = arg2;
		aString77 = "Unknown";
		aString76 = "1.1";
		try {
			aString77 = System.getProperty("java.vendor");
			aString76 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString79 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString79 = "Unknown";
		}
		aString78 = aString79.toLowerCase();
		try {
			aString72 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString72 = "";
		}
		try {
			aString73 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString73 = "";
		}
		try {
			aString74 = System.getProperty("user.home");
			if (aString74 != null) {
				aString74 = aString74 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString74 == null) {
			aString74 = "~/";
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
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(150) Exception local150) {
		}
		this.aClass222_3 = new Class222(method5766("random.dat", this.anInt6831, null), "rw", 25L);
		this.aClass222_1 = new Class222(this.method5742("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass222_2 = new Class222(this.method5742("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass222Array1 = new Class222[arg3];
		for (@Pc(191) int local191 = 0; local191 < arg3; local191++) {
			this.aClass222Array1[local191] = new Class222(this.method5742("main_file_cache.idx" + local191), "rw", 1048576L);
		}
		try {
			this.aClass221_1 = new Class221();
		} catch (@Pc(223) Throwable local223) {
		}
		try {
			this.aClass220_1 = new Class220();
		} catch (@Pc(230) Throwable local230) {
		}
		@Pc(233) ThreadGroup local233 = Thread.currentThread().getThreadGroup();
		for (@Pc(236) ThreadGroup local236 = local233.getParent(); local236 != null; local236 = local236.getParent()) {
			local233 = local236;
		}
		@Pc(248) Thread[] local248 = new Thread[1000];
		local233.enumerate(local248);
		for (@Pc(254) int local254 = 0; local254 < local248.length; local254++) {
			if (local248[local254] != null && local248[local254].getName().startsWith("AWT")) {
				local248[local254].setPriority(1);
			}
		}
		this.aBoolean496 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ml", name = "e", descriptor = "(I)Lloader!sm;")
	private Class225 method5735(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			aString76 = null;
		}
		return this.method5736(0, 18, 0, (byte) 103, null);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IIIBLjava/lang/Object;)Lloader!sm;")
	private Class225 method5736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class225 local3 = new Class225();
		local3.anInt6836 = arg2;
		if (arg3 < 20) {
			aString76 = null;
		}
		local3.anObject8 = arg4;
		local3.anInt6833 = arg1;
		local3.anInt6834 = arg0;
		synchronized (this) {
			if (this.aClass225_1 == null) {
				this.aClass225_1 = this.aClass225_2 = local3;
			} else {
				this.aClass225_1.aClass225_3 = local3;
				this.aClass225_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(B)Lloader!sm;")
	private Class225 method5737(@OriginalArg(0) byte arg0) {
		return arg0 == 85 ? this.method5736(0, 5, 0, (byte) 83, null) : (Class225) null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ILjava/lang/String;)Lloader!sm;")
	private Class225 method5738(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 0) {
			this.aClass220_1 = null;
		}
		return this.method5736(0, 16, 0, (byte) 23, arg1);
	}

	@OriginalMember(owner = "loader!ml", name = "d", descriptor = "(I)Z")
	private boolean method5739(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			aString72 = null;
		}
		return this.aClass221_1 != null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IIIII)Lloader!sm;")
	private Class225 method5740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != 2089629072) {
			this.method5763(94);
		}
		return this.method5736((arg0 << 16) + arg3, 6, arg4 + (arg1 << 16), (byte) 118, null);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!sm;")
	private Class225 method5741(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		return arg1 == -107 ? this.method5736(0, 10, 0, (byte) 32, arg0) : (Class225) null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method5742(@OriginalArg(0) String arg0) {
		return method5766(arg0, this.anInt6831, this.aString75);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ZLjava/awt/Frame;)Lloader!sm;")
	private Class225 method5743(@OriginalArg(0) boolean arg0, @OriginalArg(1) Frame arg1) {
		return arg0 ? this.method5736(0, 7, 0, (byte) 43, arg1) : (Class225) null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IZLjava/awt/Component;)Lloader!sm;")
	private Class225 method5744(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0 != 0) {
			this.method5757(true, null, null);
		}
		return this.method5736(arg1 ? 1 : 0, 15, 0, (byte) 70, arg2);
	}

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "(ZLjava/lang/String;)Lloader!sm;")
	private Class225 method5745(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (!arg0) {
			this.run();
		}
		return this.method5736(0, 21, 0, (byte) 54, arg1);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!sm;")
	private Class225 method5746(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return arg2 == 2099 ? this.method5736(arg0, 1, 0, (byte) 43, arg1) : (Class225) null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lloader!sm;")
	private Class225 method5747(@OriginalArg(0) boolean arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0) {
			this.aClass222Array1 = null;
		}
		return this.method5736(0, 19, 0, (byte) 105, arg1);
	}

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "(I)Lloader!sb;")
	private Interface11 method5748(@OriginalArg(0) int arg0) {
		if (arg0 != 2) {
			this.aClass225_1 = null;
		}
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!ml", name = "b", descriptor = "(B)V")
	private void method5749() {
		synchronized (this) {
			this.aBoolean496 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		if (this.aClass222_1 != null) {
			try {
				this.aClass222_1.method5723();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass222_2 != null) {
			try {
				this.aClass222_2.method5723();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass222Array1 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.aClass222Array1.length; local55++) {
				if (this.aClass222Array1[local55] != null) {
					try {
						this.aClass222Array1[local55].method5723();
					} catch (@Pc(75) IOException local75) {
					}
				}
			}
		}
		if (this.aClass222_3 != null) {
			try {
				this.aClass222_3.method5723();
			} catch (@Pc(88) IOException local88) {
			}
		}
	}

	@OriginalMember(owner = "loader!ml", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class225 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean496) {
						return;
					}
					if (this.aClass225_2 != null) {
						local17 = this.aClass225_2;
						this.aClass225_2 = this.aClass225_2.aClass225_3;
						if (this.aClass225_2 == null) {
							this.aClass225_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local17.anInt6833;
				if (local46 == 1) {
					if (Class224.method5767() < aLong226) {
						throw new IOException();
					}
					local17.anObject9 = new Socket(InetAddress.getByName((String) local17.anObject8), local17.anInt6834);
				} else if (local46 == 2) {
					@Pc(881) Thread local881 = new Thread((Runnable) local17.anObject8);
					local881.setDaemon(true);
					local881.start();
					local881.setPriority(local17.anInt6834);
					local17.anObject9 = local881;
				} else if (local46 == 4) {
					if (aLong226 > Class224.method5767()) {
						throw new IOException();
					}
					local17.anObject9 = new DataInputStream(((URL) local17.anObject8).openStream());
				} else {
					@Pc(483) Object[] local483;
					if (local46 == 8) {
						local483 = (Object[]) local17.anObject8;
						if (((Class) local483[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject9 = ((Class) local483[0]).getDeclaredMethod((String) local483[1], (Class[]) local483[2]);
					} else if (local46 == 9) {
						local483 = (Object[]) local17.anObject8;
						if (((Class) local483[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject9 = ((Class) local483[0]).getDeclaredField((String) local483[1]);
					} else if (local46 == 18) {
						@Pc(808) Clipboard local808 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject9 = local808.getContents(null);
					} else if (local46 == 19) {
						@Pc(797) Transferable local797 = (Transferable) local17.anObject8;
						@Pc(800) Clipboard local800 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local800.setContents(local797, null);
					} else {
						@Pc(418) String local418;
						if (local46 == 3) {
							if (Class224.method5767() < aLong226) {
								throw new IOException();
							}
							local418 = (local17.anInt6834 >> 24 & 0xFF) + "." + (local17.anInt6834 >> 16 & 0xFF) + "." + (local17.anInt6834 >> 8 & 0xFF) + "." + (local17.anInt6834 & 0xFF);
							local17.anObject9 = InetAddress.getByName(local418).getHostName();
						} else if (local46 == 21) {
							if (aLong226 > Class224.method5767()) {
								throw new IOException();
							}
							local17.anObject9 = InetAddress.getByName((String) local17.anObject8).getAddress();
						} else if (local46 == 5) {
							local17.anObject9 = this.aClass221_1.method5714();
						} else if (local46 == 6) {
							@Pc(134) Frame local134 = new Frame("Jagex Full Screen");
							local17.anObject9 = local134;
							local134.setResizable(false);
							this.aClass221_1.method5712(local17.anInt6834 & 0xFFFF, local17.anInt6836 >> 16, local17.anInt6834 >>> 16, local134, local17.anInt6836 & 0xFFFF);
						} else if (local46 == 7) {
							this.aClass221_1.method5713();
						} else {
							@Pc(342) Method local342;
							@Pc(334) Class[] local334;
							@Pc(336) Runtime local336;
							if (local46 == 10) {
								local334 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local336 = Runtime.getRuntime();
								if (!aString78.startsWith("mac")) {
									local342 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local334);
									local342.setAccessible(true);
									local342.invoke(local336, local17.anObject8, "jawt");
									local342.setAccessible(false);
								}
								local342 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local334);
								local342.setAccessible(true);
								if (aString78.startsWith("linux") || aString78.startsWith("sunos")) {
									local342.invoke(local336, local17.anObject8, this.method5742("libjaggl_dri.so").toString());
									@Pc(660) Class local660 = ((Class) local17.anObject8).getClassLoader().loadClass("jaggl.X11.dri");
									local660.getMethod("bind").invoke(null);
									local342.invoke(local336, local17.anObject8, this.method5742("libjaggl.so").toString());
									local660.getMethod("close").invoke(null);
								} else if (aString78.startsWith("mac")) {
									local342.invoke(local336, local17.anObject8, this.method5742("libjaggl.jnilib").toString());
								} else if (aString78.startsWith("win")) {
									local342.invoke(local336, local17.anObject8, this.method5742("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local342.setAccessible(false);
							} else {
								@Pc(191) int local191;
								if (local46 == 11) {
									@Pc(178) Field local178 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local178.setAccessible(true);
									@Pc(189) Vector local189 = (Vector) local178.get(((Class) local17.anObject8).getClassLoader());
									for (local191 = 0; local189.size() > local191; local191++) {
										@Pc(203) Object local203 = local189.elementAt(local191);
										@Pc(210) Method local210 = local203.getClass().getDeclaredMethod("finalize");
										local210.setAccessible(true);
										local210.invoke(local203);
										local210.setAccessible(false);
										@Pc(227) Field local227 = local203.getClass().getDeclaredField("handle");
										local227.setAccessible(true);
										local227.set(local203, Integer.valueOf(0));
										local227.setAccessible(false);
									}
									local178.setAccessible(false);
								} else {
									@Pc(258) Class222 local258;
									if (local46 == 12) {
										local258 = method5762(this.anInt6831, this.aString75);
										local17.anObject9 = local258;
									} else if (local46 == 13) {
										local258 = method5753(this.anInt6831, this.aString75);
										local17.anObject9 = local258;
									} else if (local46 == 14) {
										@Pc(508) int local508 = local17.anInt6834;
										@Pc(511) int local511 = local17.anInt6836;
										this.aClass220_1.method5709(local511, local508);
									} else if (local46 == 15) {
										@Pc(294) boolean local294 = local17.anInt6834 != 0;
										@Pc(298) Component local298 = (Component) local17.anObject8;
										this.aClass220_1.method5710(local298, local294);
									} else if (local46 == 17) {
										local483 = (Object[]) local17.anObject8;
										this.aClass220_1.method5708((int[]) local483[1], (Component) local483[0], local17.anInt6836, local17.anInt6834, (Point) local483[2]);
									} else if (local46 == 16) {
										try {
											if (!aString78.startsWith("win")) {
												throw new Exception();
											}
											local418 = (String) local17.anObject8;
											if (!local418.startsWith("http://") && !local418.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(433) String local433 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local191 = 0; local191 < local418.length(); local191++) {
												if (local433.indexOf(local418.charAt(local191)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local418 + "\"");
											local17.anObject9 = null;
										} catch (@Pc(474) Exception local474) {
											local17.anObject9 = local474;
										}
									} else if (local46 == 20) {
										try {
											local334 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local336 = Runtime.getRuntime();
											local342 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local334);
											local342.setAccessible(true);
											if (aString78.startsWith("win")) {
												if (aString72.startsWith("amd64") || aString72.startsWith("x86_64")) {
													local342.invoke(local336, local17.anObject8, this.method5742("jagmisc64.dll").toString());
												} else {
													local342.invoke(local336, local17.anObject8, this.method5742("jagmisc.dll").toString());
												}
											}
											local342.setAccessible(false);
										} catch (@Pc(402) Throwable local402) {
											local17.anObject9 = local402;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local17.anInt6835 = 1;
			} catch (@Pc(898) ThreadDeath local898) {
				throw local898;
			} catch (@Pc(901) Throwable local901) {
				local17.anInt6835 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!sm;")
	private Class225 method5750(@OriginalArg(0) Class arg0) {
		return this.method5736(0, 11, 0, (byte) 54, arg0);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!sm;")
	private Class225 method5751(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class225 local3 = new Class225();
		if (arg0 != -17994) {
			return (Class225) null;
		}
		synchronized (local3) {
			local3.anInt6834 = arg4;
			local3.anInt6836 = arg3;
			local3.anObject8 = arg1;
			local3.anInt6833 = arg2;
			synchronized (this) {
				if (this.aClass225_1 == null) {
					this.aClass225_1 = this.aClass225_2 = local3;
				} else {
					this.aClass225_1.aClass225_3 = local3;
					this.aClass225_1 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(60) InterruptedException local60) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	private byte[] method5752(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg0) {
			return (byte[]) null;
		} else {
			@Pc(12) Class225 local12 = this.method5751(-17994, arg1, 21, 0, 0);
			return (byte[]) local12.anObject9;
		}
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lloader!sm;")
	private Class225 method5754(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) Class[] arg3) {
		if (arg1 != 27783) {
			this.aClass222_1 = null;
		}
		return this.method5736(0, 8, 0, (byte) 108, new Object[] { arg2, arg0, arg3 });
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Z)V")
	private void method5755(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anEventQueue2 = null;
		}
		aLong226 = Class224.method5767() + 5000L;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!sm;")
	private Class225 method5756(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 0) {
			this.aBoolean496 = true;
		}
		return this.method5736(0, 20, 0, (byte) 48, arg1);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lloader!sm;")
	private Class225 method5757(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		if (!arg0) {
			this.method5765(null);
		}
		return this.method5736(0, 9, 0, (byte) 108, new Object[] { arg2, arg1 });
	}

	@OriginalMember(owner = "loader!ml", name = "c", descriptor = "(I)Lloader!sm;")
	private Class225 method5758(@OriginalArg(0) int arg0) {
		return arg0 == 12 ? this.method5736(0, 13, 0, (byte) 122, null) : (Class225) null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IIBLjava/awt/Component;)Lloader!sm;")
	private Class225 method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Component arg3) {
		if (arg2 >= -38) {
			return (Class225) null;
		} else {
			@Pc(8) Point local8 = arg3.getLocationOnScreen();
			return this.method5736(arg1 + local8.x, 14, local8.y + arg0, (byte) 117, null);
		}
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!sm;")
	private Class225 method5760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		if (arg1 <= 40) {
			this.run();
		}
		return this.method5736(arg0, 2, 0, (byte) 116, arg2);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(Ljava/awt/Point;IILjava/awt/Component;[II)Lloader!sm;")
	private Class225 method5761(@OriginalArg(0) Point arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		return arg2 == 19 ? this.method5736(arg5, 17, arg1, (byte) 103, new Object[] { arg3, arg4, arg0 }) : (Class225) null;
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(I)Lloader!sm;")
	private Class225 method5763(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method5737((byte) 8);
		}
		return this.method5736(0, 12, 0, (byte) 29, null);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(II)Lloader!sm;")
	private Class225 method5764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 3) {
			aMethod3 = null;
		}
		return this.method5736(arg0, 3, 0, (byte) 116, null);
	}

	@OriginalMember(owner = "loader!ml", name = "a", descriptor = "(ILjava/net/URL;)Lloader!sm;")
	private Class225 method5765(@OriginalArg(1) URL arg0) {
		return this.method5736(0, 4, 0, (byte) 28, arg0);
	}
}
