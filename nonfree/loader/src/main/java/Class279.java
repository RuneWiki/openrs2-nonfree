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

@OriginalClass("loader!lt")
public final class Class279 implements Runnable {

	@OriginalMember(owner = "loader!lt", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!lt", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!lt", name = "t", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!lt", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!lt", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString82;

	@OriginalMember(owner = "loader!lt", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!lt", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString84;

	@OriginalMember(owner = "loader!lt", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!lt", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!lt", name = "h", descriptor = "I")
	private static final int anInt7661 = 1;

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!lt", name = "x", descriptor = "J")
	private static volatile long aLong270 = 0L;

	@OriginalMember(owner = "loader!lt", name = "k", descriptor = "Lloader!ed;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!lt", name = "r", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "loader!lt", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!lt", name = "q", descriptor = "Lloader!hl;")
	private Class277 aClass277_2 = null;

	@OriginalMember(owner = "loader!lt", name = "s", descriptor = "Lloader!wp;")
	private Class280 aClass280_1 = null;

	@OriginalMember(owner = "loader!lt", name = "v", descriptor = "Lloader!hl;")
	private Class277 aClass277_1 = null;

	@OriginalMember(owner = "loader!lt", name = "o", descriptor = "Lloader!hl;")
	private Class277 aClass277_3 = null;

	@OriginalMember(owner = "loader!lt", name = "z", descriptor = "Lloader!wp;")
	private Class280 aClass280_2 = null;

	@OriginalMember(owner = "loader!lt", name = "A", descriptor = "Ljava/lang/String;")
	private final String aString85;

	@OriginalMember(owner = "loader!lt", name = "g", descriptor = "I")
	private final int anInt7660;

	@OriginalMember(owner = "loader!lt", name = "j", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!lt", name = "p", descriptor = "[Lloader!hl;")
	private Class277[] aClass277Array1;

	@OriginalMember(owner = "loader!lt", name = "c", descriptor = "Lloader!f;")
	private Class275 aClass275_1;

	@OriginalMember(owner = "loader!lt", name = "l", descriptor = "Lloader!g;")
	private Class276 aClass276_1;

	@OriginalMember(owner = "loader!lt", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method6141(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString79, "/tmp/", "" };
		@Pc(79) String[] local79 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(86) int local86 = 0; local86 < local79.length; local86++) {
				for (@Pc(96) int local96 = 0; local96 < local43.length; local96++) {
					@Pc(134) String local134 = local43[local96] + local79[local86] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(136) RandomAccessFile local136 = null;
					try {
						@Pc(141) File local141 = new File(local134);
						if (local81 != 0 || local141.exists()) {
							@Pc(153) String local153 = local43[local96];
							if (local81 != 1 || local153.length() <= 0 || (new File(local153)).exists()) {
								(new File(local43[local96] + local79[local86])).mkdir();
								if (arg2 != null) {
									(new File(local43[local96] + local79[local86] + "/" + arg2)).mkdir();
								}
								local136 = new RandomAccessFile(local141, "rw");
								@Pc(216) int local216 = local136.read();
								local136.seek(0L);
								local136.write(local216);
								local136.seek(0L);
								local136.close();
								aHashtable4.put(arg1, local141);
								return local141;
							}
						}
					} catch (@Pc(235) Exception local235) {
						try {
							if (local136 != null) {
								local136.close();
							}
						} catch (@Pc(244) Exception local244) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lloader!hl;")
	private static Class277 method6144(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(22) String local22;
		if (arg2 == 33) {
			local22 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local22 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local22 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString79, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			@Pc(99) String local99 = local89[local91];
			if (local99.length() <= 0 || (new File(local99)).exists()) {
				try {
					return new Class277(new File(local99, local22), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!lt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class279(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString82 = "Unknown";
		this.aString85 = arg2;
		aString84 = "1.1";
		this.anApplet3 = arg0;
		this.anInt7660 = arg1;
		try {
			aString82 = System.getProperty("java.vendor");
			aString84 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString83 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString83 = "Unknown";
		}
		aString78 = aString83.toLowerCase();
		try {
			aString81 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString81 = "";
		}
		try {
			aString80 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString80 = "";
		}
		try {
			aString79 = System.getProperty("user.home");
			if (aString79 != null) {
				aString79 = aString79 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString79 == null) {
			aString79 = "~/";
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
		this.aClass277_1 = new Class277(method6141(this.anInt7660, "random.dat", null), "rw", 25L);
		this.aClass277_2 = new Class277(this.method6149("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass277_3 = new Class277(this.method6149("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass277Array1 = new Class277[arg3];
		for (@Pc(191) int local191 = 0; local191 < arg3; local191++) {
			this.aClass277Array1[local191] = new Class277(this.method6149("main_file_cache.idx" + local191), "rw", 1048576L);
		}
		try {
			this.aClass275_1 = new Class275();
		} catch (@Pc(227) Throwable local227) {
		}
		try {
			this.aClass276_1 = new Class276();
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
		this.aBoolean506 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lloader!wp;")
	private Class280 method6142(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2) {
		return arg1 >= -63 ? (Class280) null : this.method6166(15, 0, arg2 ? 1 : 0, 0, arg0);
	}

	@OriginalMember(owner = "loader!lt", name = "e", descriptor = "(I)Lloader!wp;")
	private Class280 method6143(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.method6166(18, 0, 0, 0, null) : (Class280) null;
	}

	@OriginalMember(owner = "loader!lt", name = "b", descriptor = "(I)V")
	private void method6145(@OriginalArg(0) int arg0) {
		aLong270 = (long) arg0 + Class278.method6134();
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!wp;")
	private Class280 method6146(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 19986) {
			this.aClass277Array1 = null;
		}
		return this.method6166(20, arg0 ^ 0x4E12, 0, 0, arg1);
	}

	@OriginalMember(owner = "loader!lt", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!wp;")
	private Class280 method6147(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -25185) {
			this.anApplet3 = null;
		}
		return this.method6166(16, 0, 0, 0, arg0);
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(IILjava/awt/Component;ILjava/awt/Point;[I)Lloader!wp;")
	private Class280 method6148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4, @OriginalArg(5) int[] arg5) {
		if (arg3 != 17) {
			this.method6146(106, null);
		}
		return this.method6166(17, 0, arg0, arg1, new Object[] { arg2, arg5, arg4 });
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method6149(@OriginalArg(0) String arg0) {
		return method6141(this.anInt7660, arg0, this.aString85);
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(IIIII)Lloader!wp;")
	private Class280 method6150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < 108) {
			aString84 = null;
		}
		return this.method6166(6, 0, (arg4 << 16) + arg1, arg2 + (arg3 << 16), null);
	}

	@OriginalMember(owner = "loader!lt", name = "b", descriptor = "(ILjava/lang/Class;)V")
	private void method6151(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!aString78.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg1, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!aString78.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg1, this.method6149("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
		if (arg0 >= -71) {
			aString78 = null;
		}
	}

	@OriginalMember(owner = "loader!lt", name = "f", descriptor = "(I)Lloader!wp;")
	private Class280 method6152(@OriginalArg(0) int arg0) {
		if (arg0 > -124) {
			this.method6145(-111);
		}
		return this.method6166(5, 0, 0, 0, null);
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(II)Lloader!wp;")
	private Class280 method6153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 0) {
			this.method6142(null, (byte) 31, true);
		}
		return this.method6166(3, 0, arg1, 0, null);
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!wp;")
	private Class280 method6154(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 7) {
			this.method6170(null);
		}
		return this.method6166(7, arg1 - 7, 0, 0, arg0);
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(Z[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lloader!wp;")
	private Class280 method6155(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) String arg3) {
		return arg0 ? this.method6166(8, 0, 0, 0, new Object[] { arg2, arg3, arg1 }) : (Class280) null;
	}

	@OriginalMember(owner = "loader!lt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class280 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean506) {
						return;
					}
					if (this.aClass280_2 != null) {
						local18 = this.aClass280_2;
						this.aClass280_2 = this.aClass280_2.aClass280_3;
						if (this.aClass280_2 == null) {
							this.aClass280_1 = null;
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
				@Pc(47) int local47 = local18.anInt7665;
				if (local47 == 1) {
					if (Class278.method6134() < aLong270) {
						throw new IOException();
					}
					local18.anObject12 = new Socket(InetAddress.getByName((String) local18.anObject11), local18.anInt7662);
				} else if (local47 == 2) {
					@Pc(698) Thread local698 = new Thread((Runnable) local18.anObject11);
					local698.setDaemon(true);
					local698.start();
					local698.setPriority(local18.anInt7662);
					local18.anObject12 = local698;
				} else if (local47 == 4) {
					if (Class278.method6134() < aLong270) {
						throw new IOException();
					}
					local18.anObject12 = new DataInputStream(((URL) local18.anObject11).openStream());
				} else {
					@Pc(93) Object[] local93;
					if (local47 == 8) {
						local93 = (Object[]) local18.anObject11;
						if (((Class) local93[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject12 = ((Class) local93[0]).getDeclaredMethod((String) local93[1], (Class[]) local93[2]);
					} else if (local47 == 9) {
						local93 = (Object[]) local18.anObject11;
						if (((Class) local93[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject12 = ((Class) local93[0]).getDeclaredField((String) local93[1]);
					} else if (local47 == 18) {
						@Pc(121) Clipboard local121 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local18.anObject12 = local121.getContents(null);
					} else if (local47 == 19) {
						@Pc(626) Transferable local626 = (Transferable) local18.anObject11;
						@Pc(629) Clipboard local629 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local629.setContents(local626, null);
					} else {
						@Pc(348) String local348;
						if (local47 == 3) {
							if (Class278.method6134() < aLong270) {
								throw new IOException();
							}
							local348 = (local18.anInt7662 >> 24 & 0xFF) + "." + (local18.anInt7662 >> 16 & 0xFF) + "." + (local18.anInt7662 >> 8 & 0xFF) + "." + (local18.anInt7662 & 0xFF);
							local18.anObject12 = InetAddress.getByName(local348).getHostName();
						} else if (local47 == 21) {
							if (aLong270 > Class278.method6134()) {
								throw new IOException();
							}
							local18.anObject12 = InetAddress.getByName((String) local18.anObject11).getAddress();
						} else if (local47 == 5) {
							local18.anObject12 = this.aClass275_1.method6123();
						} else if (local47 == 6) {
							@Pc(155) Frame local155 = new Frame("Jagex Full Screen");
							local18.anObject12 = local155;
							local155.setResizable(false);
							this.aClass275_1.method6120(local18.anInt7664 & 0xFFFF, local155, local18.anInt7664 >> 16, local18.anInt7662 >>> 16, local18.anInt7662 & 0xFFFF);
						} else if (local47 == 7) {
							this.aClass275_1.method6122();
						} else {
							@Pc(364) int local364;
							if (local47 == 11) {
								@Pc(477) Field local477 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local477.setAccessible(true);
								@Pc(488) Vector local488 = (Vector) local477.get(((Class) local18.anObject11).getClassLoader());
								for (local364 = 0; local364 < local488.size(); local364++) {
									@Pc(502) Object local502 = local488.elementAt(local364);
									@Pc(509) Method local509 = local502.getClass().getDeclaredMethod("finalize");
									local509.setAccessible(true);
									local509.invoke(local502);
									local509.setAccessible(false);
									@Pc(526) Field local526 = local502.getClass().getDeclaredField("handle");
									local526.setAccessible(true);
									local526.set(local502, Integer.valueOf(0));
									local526.setAccessible(false);
								}
								local477.setAccessible(false);
							} else {
								@Pc(454) Class277 local454;
								if (local47 == 12) {
									local454 = method6144(this.aString85, (String) local18.anObject11, this.anInt7660);
									local18.anObject12 = local454;
								} else if (local47 == 13) {
									local454 = method6144("", (String) local18.anObject11, this.anInt7660);
									local18.anObject12 = local454;
								} else if (local47 == 14) {
									@Pc(435) int local435 = local18.anInt7662;
									@Pc(438) int local438 = local18.anInt7664;
									this.aClass276_1.method6125(local435, local438);
								} else if (local47 == 15) {
									@Pc(224) boolean local224 = local18.anInt7662 != 0;
									@Pc(228) Component local228 = (Component) local18.anObject11;
									this.aClass276_1.method6126(local224, local228);
								} else if (local47 == 17) {
									local93 = (Object[]) local18.anObject11;
									this.aClass276_1.method6124((Point) local93[2], local18.anInt7662, (Component) local93[0], (int[]) local93[1], local18.anInt7664);
								} else if (local47 == 16) {
									try {
										if (!aString78.startsWith("win")) {
											throw new Exception();
										}
										local348 = (String) local18.anObject11;
										if (!local348.startsWith("http://") && !local348.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(362) String local362 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local364 = 0; local348.length() > local364; local364++) {
											if (local362.indexOf(local348.charAt(local364)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local348 + "\"");
										local18.anObject12 = null;
									} catch (@Pc(400) Exception local400) {
										local18.anObject12 = local400;
										throw local400;
									}
								} else if (local47 == 20) {
									try {
										@Pc(264) Class[] local264 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(266) Runtime local266 = Runtime.getRuntime();
										@Pc(272) Method local272 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local264);
										local272.setAccessible(true);
										if (aString78.startsWith("win")) {
											if (aString81.startsWith("amd64") || aString81.startsWith("x86_64")) {
												local272.invoke(local266, local18.anObject11, this.method6149("jagmisc64.dll").toString());
											} else {
												local272.invoke(local266, local18.anObject11, this.method6149("jagmisc.dll").toString());
											}
										}
										local272.setAccessible(false);
									} catch (@Pc(331) Throwable local331) {
										local18.anObject12 = local331;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local18.anInt7663 = 1;
			} catch (@Pc(715) ThreadDeath local715) {
				throw local715;
			} catch (@Pc(718) Throwable local718) {
				local18.anInt7663 = 2;
			}
			synchronized (local18) {
				local18.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!lt", name = "d", descriptor = "(I)Z")
	private boolean method6156(@OriginalArg(0) int arg0) {
		if (arg0 != 10000) {
			this.aClass277_1 = null;
		}
		return this.aClass275_1 != null;
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!wp;")
	private Class280 method6157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		return arg0 >= -77 ? (Class280) null : this.method6166(2, 0, arg1, 0, arg2);
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lloader!wp;")
	private Class280 method6158(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		if (arg2 == 29) {
			@Pc(8) Point local8 = arg0.getLocationOnScreen();
			return this.method6166(14, 0, local8.x + arg1, local8.y + arg3, null);
		} else {
			return (Class280) null;
		}
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method6159(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) Class280 local7 = this.method6164(0, 21, arg1, 0, arg0);
		return (byte[]) local7.anObject12;
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(BLjava/net/URL;)Lloader!wp;")
	private Class280 method6160(@OriginalArg(1) URL arg0) {
		return this.method6166(4, 0, 0, 0, arg0);
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(Ljava/lang/String;ZI)Lloader!wp;")
	private Class280 method6161(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return arg1 ? this.method6166(12, 0, 0, 0, arg0) : this.method6166(13, 0, 0, 0, arg0);
		} else {
			return (Class280) null;
		}
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(ZLjava/lang/Class;)Lloader!wp;")
	private Class280 method6162(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) {
		return arg0 ? this.method6166(11, 0, 0, 0, arg1) : (Class280) null;
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(I)V")
	private void method6163(@OriginalArg(0) int arg0) {
		if (arg0 >= -12) {
			this.aClass277_1 = null;
		}
		synchronized (this) {
			this.aBoolean506 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass277_2 != null) {
			try {
				this.aClass277_2.method6131();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass277_3 != null) {
			try {
				this.aClass277_3.method6131();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass277Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass277Array1.length; local54++) {
				if (this.aClass277Array1[local54] != null) {
					try {
						this.aClass277Array1[local54].method6131();
					} catch (@Pc(73) IOException local73) {
					}
				}
			}
		}
		if (this.aClass277_1 != null) {
			try {
				this.aClass277_1.method6131();
			} catch (@Pc(86) IOException local86) {
			}
		}
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(IIZILjava/lang/Object;)Lloader!wp;")
	private Class280 method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class280 local3 = new Class280();
		synchronized (local3) {
			local3.anInt7662 = arg0;
			local3.anInt7664 = arg3;
			local3.anObject11 = arg4;
			local3.anInt7665 = arg1;
			synchronized (this) {
				if (this.aClass280_1 == null) {
					this.aClass280_1 = this.aClass280_2 = local3;
				} else {
					this.aClass280_1.aClass280_3 = local3;
					this.aClass280_1 = local3;
				}
				this.notify();
			}
			try {
				if (arg2) {
					aString82 = null;
				}
				local3.wait();
			} catch (@Pc(59) InterruptedException local59) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(ILjava/lang/String;)Lloader!wp;")
	private Class280 method6165(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 18176) {
			this.method6170(null);
		}
		return this.method6166(21, 0, 0, 0, arg1);
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!wp;")
	private Class280 method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class280 local3 = new Class280();
		local3.anInt7665 = arg0;
		local3.anObject11 = arg4;
		if (arg1 != 0) {
			return (Class280) null;
		}
		local3.anInt7662 = arg2;
		local3.anInt7664 = arg3;
		synchronized (this) {
			if (this.aClass280_1 == null) {
				this.aClass280_1 = this.aClass280_2 = local3;
			} else {
				this.aClass280_1.aClass280_3 = local3;
				this.aClass280_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(ZILjava/lang/String;)Lloader!wp;")
	private Class280 method6167(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (!arg0) {
			this.method6169(null, null, 73);
		}
		return this.method6166(1, 0, arg1, 0, arg2);
	}

	@OriginalMember(owner = "loader!lt", name = "c", descriptor = "(I)Lloader!ed;")
	private Interface14 method6168(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method6152(-25);
		}
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lloader!wp;")
	private Class280 method6169(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 22) {
			this.method6161(null, true, 46);
		}
		return this.method6166(9, 0, 0, 0, new Object[] { arg1, arg0 });
	}

	@OriginalMember(owner = "loader!lt", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!wp;")
	private Class280 method6170(@OriginalArg(0) Transferable arg0) {
		return this.method6166(19, 0, 0, 0, arg0);
	}
}
