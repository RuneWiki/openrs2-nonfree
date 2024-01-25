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

@OriginalClass("loader!ne")
public final class Class224 implements Runnable {

	@OriginalMember(owner = "loader!ne", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString72;

	@OriginalMember(owner = "loader!ne", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "loader!ne", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!ne", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "loader!ne", name = "z", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!ne", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!ne", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ne", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ne", name = "l", descriptor = "I")
	private static final int anInt6861 = 1;

	@OriginalMember(owner = "loader!ne", name = "w", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!ne", name = "t", descriptor = "J")
	private static volatile long aLong238 = 0L;

	@OriginalMember(owner = "loader!ne", name = "g", descriptor = "Lloader!kl;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!ne", name = "f", descriptor = "Lloader!bc;")
	private Class220 aClass220_2 = null;

	@OriginalMember(owner = "loader!ne", name = "b", descriptor = "Lloader!ih;")
	private Class223 aClass223_1 = null;

	@OriginalMember(owner = "loader!ne", name = "r", descriptor = "Lloader!ih;")
	private Class223 aClass223_2 = null;

	@OriginalMember(owner = "loader!ne", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ne", name = "n", descriptor = "Z")
	private boolean aBoolean598 = false;

	@OriginalMember(owner = "loader!ne", name = "d", descriptor = "Lloader!ih;")
	private Class223 aClass223_3 = null;

	@OriginalMember(owner = "loader!ne", name = "A", descriptor = "Lloader!bc;")
	private Class220 aClass220_3 = null;

	@OriginalMember(owner = "loader!ne", name = "y", descriptor = "Ljava/lang/String;")
	private final String aString77;

	@OriginalMember(owner = "loader!ne", name = "x", descriptor = "I")
	private final int anInt6862;

	@OriginalMember(owner = "loader!ne", name = "e", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ne", name = "k", descriptor = "[Lloader!ih;")
	private final Class223[] aClass223Array1;

	@OriginalMember(owner = "loader!ne", name = "i", descriptor = "Lloader!a;")
	private Class218 aClass218_1;

	@OriginalMember(owner = "loader!ne", name = "p", descriptor = "Lloader!d;")
	private Class222 aClass222_1;

	@OriginalMember(owner = "loader!ne", name = "o", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	private static File method6099(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString78, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < local76.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local51.length; local93++) {
					@Pc(131) String local131 = local51[local93] + local76[local83] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local78 != 0 || local138.exists()) {
							@Pc(148) String local148 = local51[local93];
							if (local78 != 1 || local148.length() <= 0 || (new File(local148)).exists()) {
								(new File(local51[local93] + local76[local83])).mkdir();
								if (arg0 != null) {
									(new File(local51[local93] + local76[local83] + "/" + arg0)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(212) int local212 = local133.read();
								local133.seek(0L);
								local133.write(local212);
								local133.seek(0L);
								local133.close();
								aHashtable2.put(arg1, local138);
								return local138;
							}
						}
					} catch (@Pc(231) Exception local231) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(240) Exception local240) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ILjava/lang/String;B)Lloader!ih;")
	private static Class223 method6112(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) String local13;
		if (arg0 == 33) {
			local13 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local13 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local13 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString78, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local77.length; local85++) {
			@Pc(93) String local93 = local77[local85];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class223(new File(local93, local13), "rw", 10000L);
				} catch (@Pc(119) Exception local119) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(IILjava/lang/String;)Lloader!ih;")
	private static Class223 method6125(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) String local13;
		if (arg0 == 33) {
			local13 = "jagex_" + arg1 + "_preferences2_rc.dat";
		} else if (arg0 == 34) {
			local13 = "jagex_" + arg1 + "_preferences2_wip.dat";
		} else {
			local13 = "jagex_" + arg1 + "_preferences2.dat";
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", aString78, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			@Pc(89) String local89 = local75[local77];
			if (local89.length() <= 0 || (new File(local89)).exists()) {
				try {
					return new Class223(new File(local89, local13), "rw", 10000L);
				} catch (@Pc(116) Exception local116) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ne", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class224(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString76 = "Unknown";
		aString73 = "1.1";
		this.aString77 = arg2;
		this.anInt6862 = arg1;
		this.anApplet3 = arg0;
		try {
			aString76 = System.getProperty("java.vendor");
			aString73 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString79 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString79 = "Unknown";
		}
		aString72 = aString79.toLowerCase();
		try {
			aString74 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString74 = "";
		}
		try {
			aString75 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString75 = "";
		}
		try {
			aString78 = System.getProperty("user.home");
			if (aString78 != null) {
				aString78 = aString78 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString78 == null) {
			aString78 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass223_3 = new Class223(method6099(null, "random.dat", this.anInt6862), "rw", 25L);
		this.aClass223_2 = new Class223(this.method6105("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass223_1 = new Class223(this.method6105("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass223Array1 = new Class223[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass223Array1[local193] = new Class223(this.method6105("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass218_1 = new Class218();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass222_1 = new Class222();
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
		this.aBoolean598 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ne", name = "d", descriptor = "(I)Lloader!bc;")
	private Class220 method6094(@OriginalArg(0) int arg0) {
		if (arg0 >= -28) {
			this.method6102(23);
		}
		return this.method6122(0, 0, 12, -2291, null);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lloader!bc;")
	private Class220 method6095(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		if (arg0) {
			this.method6121(0, -127, -29, 1, -118);
		}
		return this.method6122(0, 0, 9, -2291, new Object[] { arg2, arg1 });
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ILjava/net/URL;)Lloader!bc;")
	private Class220 method6096(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		if (arg0 != 4) {
			this.method6116(null, (byte) -114, 14);
		}
		return this.method6122(0, 0, 4, -2291, arg1);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method6097(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class220 local7 = this.method6113(0, arg1, 0, arg0, -20392);
		return (byte[]) local7.anObject8;
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ZLjava/lang/String;)Lloader!bc;")
	private Class220 method6098(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		return arg0 ? this.method6122(0, 0, 16, -2291, arg1) : (Class220) null;
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!bc;")
	private Class220 method6100(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 9) {
			this.aClass223_2 = null;
		}
		return this.method6122(0, 0, 11, -2291, arg1);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(Z)V")
	private void method6101(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6096(-106, null);
		}
		synchronized (this) {
			this.aBoolean598 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		if (this.aClass223_2 != null) {
			try {
				this.aClass223_2.method6077();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass223_1 != null) {
			try {
				this.aClass223_1.method6077();
			} catch (@Pc(51) IOException local51) {
			}
		}
		if (this.aClass223Array1 != null) {
			for (@Pc(58) int local58 = 0; local58 < this.aClass223Array1.length; local58++) {
				if (this.aClass223Array1[local58] != null) {
					try {
						this.aClass223Array1[local58].method6077();
					} catch (@Pc(77) IOException local77) {
					}
				}
			}
		}
		if (this.aClass223_3 != null) {
			try {
				this.aClass223_3.method6077();
			} catch (@Pc(89) IOException local89) {
			}
		}
	}

	@OriginalMember(owner = "loader!ne", name = "b", descriptor = "(I)Lloader!bc;")
	private Class220 method6102(@OriginalArg(0) int arg0) {
		if (arg0 <= 68) {
			this.method6121(-61, 121, 13, 21, -120);
		}
		return this.method6122(0, 0, 18, -2291, null);
	}

	@OriginalMember(owner = "loader!ne", name = "c", descriptor = "(I)Lloader!bc;")
	private Class220 method6103(@OriginalArg(0) int arg0) {
		if (arg0 != 5) {
			this.aThread4 = null;
		}
		return this.method6122(0, 0, 5, arg0 ^ 0xFFFFF708, null);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ZLjava/lang/Class;)Lloader!bc;")
	private Class220 method6104(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) {
		if (!arg0) {
			this.method6114(true);
		}
		return this.method6122(0, 0, 20, -2291, arg1);
	}

	@OriginalMember(owner = "loader!ne", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class220 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean598) {
						return;
					}
					if (this.aClass220_2 != null) {
						local17 = this.aClass220_2;
						this.aClass220_2 = this.aClass220_2.aClass220_1;
						if (this.aClass220_2 == null) {
							this.aClass220_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local17.anInt6852;
				if (local47 == 1) {
					if (Class225.method6126() < aLong238) {
						throw new IOException();
					}
					local17.anObject8 = new Socket(InetAddress.getByName((String) local17.anObject9), local17.anInt6853);
				} else if (local47 == 2) {
					@Pc(879) Thread local879 = new Thread((Runnable) local17.anObject9);
					local879.setDaemon(true);
					local879.start();
					local879.setPriority(local17.anInt6853);
					local17.anObject8 = local879;
				} else if (local47 == 4) {
					if (aLong238 > Class225.method6126()) {
						throw new IOException();
					}
					local17.anObject8 = new DataInputStream(((URL) local17.anObject9).openStream());
				} else {
					@Pc(576) Object[] local576;
					if (local47 == 8) {
						local576 = (Object[]) local17.anObject9;
						if (((Class) local576[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local576[0]).getDeclaredMethod((String) local576[1], (Class[]) local576[2]);
					} else if (local47 == 9) {
						local576 = (Object[]) local17.anObject9;
						if (((Class) local576[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject8 = ((Class) local576[0]).getDeclaredField((String) local576[1]);
					} else if (local47 == 18) {
						@Pc(781) Clipboard local781 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject8 = local781.getContents(null);
					} else if (local47 == 19) {
						@Pc(102) Transferable local102 = (Transferable) local17.anObject9;
						@Pc(105) Clipboard local105 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local105.setContents(local102, null);
					} else {
						@Pc(161) String local161;
						if (local47 == 3) {
							if (aLong238 > Class225.method6126()) {
								throw new IOException();
							}
							local161 = (local17.anInt6853 >> 24 & 0xFF) + "." + (local17.anInt6853 >> 16 & 0xFF) + "." + (local17.anInt6853 >> 8 & 0xFF) + "." + (local17.anInt6853 & 0xFF);
							local17.anObject8 = InetAddress.getByName(local161).getHostName();
						} else if (local47 == 21) {
							if (Class225.method6126() < aLong238) {
								throw new IOException();
							}
							local17.anObject8 = InetAddress.getByName((String) local17.anObject9).getAddress();
						} else if (local47 == 5) {
							local17.anObject8 = this.aClass218_1.method6061();
						} else if (local47 == 6) {
							@Pc(202) Frame local202 = new Frame("Jagex Full Screen");
							local17.anObject8 = local202;
							local202.setResizable(false);
							this.aClass218_1.method6060(local17.anInt6853 & 0xFFFF, local17.anInt6853 >>> 16, local202, local17.anInt6854 & 0xFFFF, local17.anInt6854 >> 16);
						} else if (local47 == 7) {
							this.aClass218_1.method6062();
						} else {
							@Pc(253) Runtime local253;
							@Pc(263) Method local263;
							@Pc(251) Class[] local251;
							if (local47 == 10) {
								local251 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local253 = Runtime.getRuntime();
								if (!aString72.startsWith("mac")) {
									local263 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local251);
									local263.setAccessible(true);
									local263.invoke(local253, local17.anObject9, "jawt");
									local263.setAccessible(false);
								}
								local263 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local251);
								local263.setAccessible(true);
								if (aString72.startsWith("linux") || aString72.startsWith("sunos")) {
									local263.invoke(local253, local17.anObject9, this.method6105("libjaggl_dri.so").toString());
									@Pc(327) Class local327 = ((Class) local17.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local327.getMethod("bind").invoke(null);
									local263.invoke(local253, local17.anObject9, this.method6105("libjaggl.so").toString());
									local327.getMethod("close").invoke(null);
								} else if (aString72.startsWith("mac")) {
									local263.invoke(local253, local17.anObject9, this.method6105("libjaggl.jnilib").toString());
								} else if (aString72.startsWith("win")) {
									local263.invoke(local253, local17.anObject9, this.method6105("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local263.setAccessible(false);
							} else {
								@Pc(445) int local445;
								if (local47 == 11) {
									@Pc(432) Field local432 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local432.setAccessible(true);
									@Pc(443) Vector local443 = (Vector) local432.get(((Class) local17.anObject9).getClassLoader());
									for (local445 = 0; local445 < local443.size(); local445++) {
										@Pc(457) Object local457 = local443.elementAt(local445);
										@Pc(464) Method local464 = local457.getClass().getDeclaredMethod("finalize");
										local464.setAccessible(true);
										local464.invoke(local457);
										local464.setAccessible(false);
										@Pc(481) Field local481 = local457.getClass().getDeclaredField("handle");
										local481.setAccessible(true);
										local481.set(local457, Integer.valueOf(0));
										local481.setAccessible(false);
									}
									local432.setAccessible(false);
								} else {
									@Pc(510) Class223 local510;
									if (local47 == 12) {
										local510 = method6112(this.anInt6862, this.aString77);
										local17.anObject8 = local510;
									} else if (local47 == 13) {
										local510 = method6125(this.anInt6862, this.aString77);
										local17.anObject8 = local510;
									} else if (local47 == 14) {
										@Pc(534) int local534 = local17.anInt6853;
										@Pc(537) int local537 = local17.anInt6854;
										this.aClass222_1.method6065(local537, local534);
									} else if (local47 == 15) {
										@Pc(557) boolean local557 = local17.anInt6853 != 0;
										@Pc(561) Component local561 = (Component) local17.anObject9;
										this.aClass222_1.method6064(local561, local557);
									} else if (local47 == 17) {
										local576 = (Object[]) local17.anObject9;
										this.aClass222_1.method6063((Point) local576[2], (Component) local576[0], (int[]) local576[1], local17.anInt6853, local17.anInt6854);
									} else if (local47 == 16) {
										try {
											if (!aString72.startsWith("win")) {
												throw new Exception();
											}
											local161 = (String) local17.anObject9;
											if (!local161.startsWith("http://") && !local161.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(627) String local627 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local445 = 0; local445 < local161.length(); local445++) {
												if (local627.indexOf(local161.charAt(local445)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local161 + "\"");
											local17.anObject8 = null;
										} catch (@Pc(669) Exception local669) {
											local17.anObject8 = local669;
										}
									} else if (local47 == 20) {
										try {
											local251 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local253 = Runtime.getRuntime();
											local263 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local251);
											local263.setAccessible(true);
											if (aString72.startsWith("win")) {
												if (aString74.startsWith("amd64") || aString74.startsWith("x86_64")) {
													local263.invoke(local253, local17.anObject9, this.method6105("jagmisc64.dll").toString());
												} else {
													local263.invoke(local253, local17.anObject9, this.method6105("jagmisc.dll").toString());
												}
											}
											local263.setAccessible(false);
										} catch (@Pc(757) Throwable local757) {
											local17.anObject8 = local757;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local17.anInt6851 = 1;
			} catch (@Pc(896) ThreadDeath local896) {
				throw local896;
			} catch (@Pc(899) Throwable local899) {
				local17.anInt6851 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ne", name = "b", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method6105(@OriginalArg(1) String arg0) {
		return method6099(this.aString77, arg0, this.anInt6862);
	}

	@OriginalMember(owner = "loader!ne", name = "f", descriptor = "(I)Z")
	private boolean method6106(@OriginalArg(0) int arg0) {
		if (arg0 != -34) {
			this.aClass218_1 = null;
		}
		return this.aClass218_1 != null;
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!bc;")
	private Class220 method6107(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		return arg1 == -76 ? this.method6122(0, 0, 21, -2291, arg0) : (Class220) null;
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(I)Lloader!bc;")
	private Class220 method6108(@OriginalArg(0) int arg0) {
		if (arg0 != -1939) {
			this.method6101(false);
		}
		return this.method6122(0, 0, 13, -2291, null);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!bc;")
	private Class220 method6109(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 11) {
			aString74 = null;
		}
		return this.method6122(0, 0, 10, -2291, arg0);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(BILjava/lang/String;)Lloader!bc;")
	private Class220 method6110(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return arg0 > -37 ? (Class220) null : this.method6122(0, arg1, 1, -2291, arg2);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!bc;")
	private Class220 method6111(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 <= 16) {
			this.method6101(true);
		}
		return this.method6122(0, 0, 19, -2291, arg0);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!bc;")
	private Class220 method6113(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class220 local3 = new Class220();
		synchronized (local3) {
			if (arg4 != -20392) {
				this.aClass223_3 = null;
			}
			local3.anInt6853 = arg0;
			local3.anObject9 = arg1;
			local3.anInt6854 = arg2;
			local3.anInt6852 = arg3;
			synchronized (this) {
				if (this.aClass220_3 == null) {
					this.aClass220_3 = this.aClass220_2 = local3;
				} else {
					this.aClass220_3.aClass220_1 = local3;
					this.aClass220_3 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(62) InterruptedException local62) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ne", name = "b", descriptor = "(Z)V")
	private void method6114(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aClass222_1 = null;
		}
		aLong238 = Class225.method6126() + 5000L;
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ZLjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lloader!bc;")
	private Class220 method6115(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) String arg3) {
		if (!arg0) {
			this.method6096(-76, null);
		}
		return this.method6122(0, 0, 8, -2291, new Object[] { arg1, arg3, arg2 });
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lloader!bc;")
	private Class220 method6116(@OriginalArg(0) Runnable arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		return arg1 == 103 ? this.method6122(0, arg2, 2, arg1 - 2394, arg0) : (Class220) null;
	}

	@OriginalMember(owner = "loader!ne", name = "e", descriptor = "(I)Lloader!kl;")
	private Interface11 method6117(@OriginalArg(0) int arg0) {
		return arg0 == 33 ? this.anInterface11_1 : (Interface11) null;
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!bc;")
	private Class220 method6118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 == 5081) {
			@Pc(8) Point local8 = arg3.getLocationOnScreen();
			return this.method6122(arg0 + local8.y, arg2 - -local8.x, 14, -2291, null);
		} else {
			return (Class220) null;
		}
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!bc;")
	private Class220 method6119(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 != 19905) {
			this.aClass223_3 = null;
		}
		return this.method6122(0, 0, 7, arg0 - 22196, arg1);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(BLjava/awt/Component;Z)Lloader!bc;")
	private Class220 method6120(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 >= -59) {
			this.method6120((byte) 70, null, false);
		}
		return this.method6122(0, arg2 ? 1 : 0, 15, -2291, arg1);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(IIIII)Lloader!bc;")
	private Class220 method6121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg4 == 1353396240 ? this.method6122(arg0 + (arg3 << 16), arg2 + (arg1 << 16), 6, -2291, null) : (Class220) null;
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!bc;")
	private Class220 method6122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class220 local3 = new Class220();
		local3.anObject9 = arg4;
		local3.anInt6852 = arg2;
		local3.anInt6854 = arg0;
		local3.anInt6853 = arg1;
		synchronized (this) {
			if (this.aClass220_3 == null) {
				this.aClass220_3 = this.aClass220_2 = local3;
			} else {
				this.aClass220_3.aClass220_1 = local3;
				this.aClass220_3 = local3;
			}
			this.notify();
		}
		if (arg3 != -2291) {
			this.run();
		}
		return local3;
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(II)Lloader!bc;")
	private Class220 method6123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 <= 119) {
			this.method6121(-96, 126, -22, -52, -47);
		}
		return this.method6122(0, arg1, 3, -2291, null);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(Ljava/awt/Component;IILjava/awt/Point;[II)Lloader!bc;")
	private Class220 method6124(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Point arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		return arg5 <= 29 ? (Class220) null : this.method6122(arg2, arg1, 17, -2291, new Object[] { arg0, arg4, arg3 });
	}
}
