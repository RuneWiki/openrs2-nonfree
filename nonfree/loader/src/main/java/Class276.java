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

@OriginalClass("loader!gt")
public final class Class276 implements Runnable {

	@OriginalMember(owner = "loader!gt", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "loader!gt", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString82;

	@OriginalMember(owner = "loader!gt", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!gt", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString84;

	@OriginalMember(owner = "loader!gt", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString85;

	@OriginalMember(owner = "loader!gt", name = "q", descriptor = "Ljava/lang/String;")
	private static String aString86;

	@OriginalMember(owner = "loader!gt", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString87;

	@OriginalMember(owner = "loader!gt", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!gt", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!gt", name = "e", descriptor = "I")
	private static final int anInt7556 = 1;

	@OriginalMember(owner = "loader!gt", name = "o", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!gt", name = "x", descriptor = "J")
	private static volatile long aLong237 = 0L;

	@OriginalMember(owner = "loader!gt", name = "b", descriptor = "Lloader!ik;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "loader!gt", name = "t", descriptor = "Lloader!km;")
	private Class278 aClass278_1 = null;

	@OriginalMember(owner = "loader!gt", name = "y", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!gt", name = "k", descriptor = "Lloader!wk;")
	private Class280 aClass280_1 = null;

	@OriginalMember(owner = "loader!gt", name = "A", descriptor = "Z")
	private boolean aBoolean509 = false;

	@OriginalMember(owner = "loader!gt", name = "l", descriptor = "Lloader!wk;")
	private Class280 aClass280_2 = null;

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "Lloader!km;")
	private Class278 aClass278_2 = null;

	@OriginalMember(owner = "loader!gt", name = "s", descriptor = "Lloader!km;")
	private Class278 aClass278_3 = null;

	@OriginalMember(owner = "loader!gt", name = "f", descriptor = "Ljava/lang/String;")
	private final String aString80;

	@OriginalMember(owner = "loader!gt", name = "z", descriptor = "I")
	private final int anInt7555;

	@OriginalMember(owner = "loader!gt", name = "u", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!gt", name = "d", descriptor = "[Lloader!km;")
	private final Class278[] aClass278Array1;

	@OriginalMember(owner = "loader!gt", name = "j", descriptor = "Lloader!h;")
	private Class277 aClass277_1;

	@OriginalMember(owner = "loader!gt", name = "p", descriptor = "Lloader!f;")
	private Class274 aClass274_1;

	@OriginalMember(owner = "loader!gt", name = "h", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)Lloader!km;")
	private static Class278 method6092(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(30) String local30;
		if (arg2 == 33) {
			local30 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local30 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local30 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(97) String[] local97 = new String[] { "c:/rscache/", "/rscache/", aString82, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(99) int local99 = 0; local99 < local97.length; local99++) {
			@Pc(111) String local111 = local97[local99];
			if (local111.length() <= 0 || (new File(local111)).exists()) {
				try {
					return new Class278(new File(local111, local30), "rw", 10000L);
				} catch (@Pc(138) Exception local138) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	private static File method6112(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(10) File local10 = (File) aHashtable4.get(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(49) String[] local49 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString82, "/tmp/", "" };
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(81) int local81 = 0; local81 < local74.length; local81++) {
				for (@Pc(87) int local87 = 0; local87 < local49.length; local87++) {
					@Pc(121) String local121 = local49[local87] + local74[local81] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(123) RandomAccessFile local123 = null;
					try {
						@Pc(128) File local128 = new File(local121);
						if (local76 != 0 || local128.exists()) {
							@Pc(141) String local141 = local49[local87];
							if (local76 != 1 || local141.length() <= 0 || (new File(local141)).exists()) {
								(new File(local49[local87] + local74[local81])).mkdir();
								if (arg1 != null) {
									(new File(local49[local87] + local74[local81] + "/" + arg1)).mkdir();
								}
								local123 = new RandomAccessFile(local128, "rw");
								@Pc(208) int local208 = local123.read();
								local123.seek(0L);
								local123.write(local208);
								local123.seek(0L);
								local123.close();
								aHashtable4.put(arg0, local128);
								return local128;
							}
						}
					} catch (@Pc(227) Exception local227) {
						try {
							if (local123 != null) {
								local123.close();
							}
						} catch (@Pc(236) Exception local236) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!gt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class276(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString87 = "Unknown";
		this.anApplet2 = arg0;
		this.aString80 = arg2;
		aString81 = "1.1";
		this.anInt7555 = arg1;
		try {
			aString87 = System.getProperty("java.vendor");
			aString81 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString84 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString84 = "Unknown";
		}
		aString86 = aString84.toLowerCase();
		try {
			aString85 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString85 = "";
		}
		try {
			aString83 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString83 = "";
		}
		try {
			aString82 = System.getProperty("user.home");
			if (aString82 != null) {
				aString82 = aString82 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString82 == null) {
			aString82 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass278_2 = new Class278(method6112("random.dat", null, this.anInt7555), "rw", 25L);
		this.aClass278_1 = new Class278(this.method6099("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass278_3 = new Class278(this.method6099("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass278Array1 = new Class278[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass278Array1[local194] = new Class278(this.method6099("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass277_1 = new Class277();
		} catch (@Pc(230) Throwable local230) {
		}
		try {
			this.aClass274_1 = new Class274();
		} catch (@Pc(237) Throwable local237) {
		}
		@Pc(240) ThreadGroup local240 = Thread.currentThread().getThreadGroup();
		for (@Pc(243) ThreadGroup local243 = local240.getParent(); local243 != null; local243 = local243.getParent()) {
			local240 = local243;
		}
		@Pc(254) Thread[] local254 = new Thread[1000];
		local240.enumerate(local254);
		for (@Pc(260) int local260 = 0; local260 < local254.length; local260++) {
			if (local254[local260] != null && local254[local260].getName().startsWith("AWT")) {
				local254[local260].setPriority(1);
			}
		}
		this.aBoolean509 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!wk;")
	private Class280 method6089(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		return arg1 == 19779 ? this.method6109(4, false, 0, 0, arg0) : (Class280) null;
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!wk;")
	private Class280 method6090(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 26530) {
			aString87 = null;
		}
		return this.method6109(11, false, 0, 0, arg1);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!wk;")
	private Class280 method6091(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 < 61 ? (Class280) null : this.method6109(21, false, 0, 0, arg0);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/Class;I)V")
	private void method6093(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		if (arg1 != 18238) {
			this.method6089(null, 99);
		}
		@Pc(34) Method local34 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(45) Method local45;
		if (!aString86.startsWith("mac")) {
			local45 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local34.invoke(local45, Boolean.TRUE);
			local45.invoke(local14, arg0, "jawt");
			local34.invoke(local45, Boolean.FALSE);
		}
		local45 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local34.invoke(local45, Boolean.TRUE);
		if (!aString86.startsWith("win")) {
			throw new Exception();
		}
		local45.invoke(local14, arg0, this.method6099("sw3d.dll").toString());
		local34.invoke(local45, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(IIIII)Lloader!wk;")
	private Class280 method6094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 > -101) {
			this.method6117(null, 47);
		}
		return this.method6109(6, false, (arg3 << 16) + arg1, (arg0 << 16) - -arg4, null);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lloader!wk;")
	private Class280 method6095(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 10000) {
			this.anEventQueue2 = null;
		}
		return this.method6109(9, false, 0, 0, new Object[] { arg0, arg1 });
	}

	@OriginalMember(owner = "loader!gt", name = "c", descriptor = "(I)Lloader!wk;")
	private Class280 method6096(@OriginalArg(0) int arg0) {
		if (arg0 != 18) {
			method6092(null, null, -111);
		}
		return this.method6109(18, false, 0, 0, null);
	}

	@OriginalMember(owner = "loader!gt", name = "b", descriptor = "(I)Lloader!wk;")
	private Class280 method6097(@OriginalArg(0) int arg0) {
		return arg0 == -15864 ? this.method6109(5, false, 0, 0, null) : (Class280) null;
	}

	@OriginalMember(owner = "loader!gt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class280 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean509) {
						return;
					}
					if (this.aClass280_1 != null) {
						local16 = this.aClass280_1;
						this.aClass280_1 = this.aClass280_1.aClass280_3;
						if (this.aClass280_1 == null) {
							this.aClass280_2 = null;
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
				@Pc(46) int local46 = local16.anInt7564;
				if (local46 == 1) {
					if (Class279.method6141() < aLong237) {
						throw new IOException();
					}
					local16.anObject13 = new Socket(InetAddress.getByName((String) local16.anObject12), local16.anInt7562);
				} else if (local46 == 2) {
					@Pc(698) Thread local698 = new Thread((Runnable) local16.anObject12);
					local698.setDaemon(true);
					local698.start();
					local698.setPriority(local16.anInt7562);
					local16.anObject13 = local698;
				} else if (local46 == 4) {
					if (aLong237 > Class279.method6141()) {
						throw new IOException();
					}
					local16.anObject13 = new DataInputStream(((URL) local16.anObject12).openStream());
				} else {
					@Pc(93) Object[] local93;
					if (local46 == 8) {
						local93 = (Object[]) local16.anObject12;
						if (((Class) local93[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject13 = ((Class) local93[0]).getDeclaredMethod((String) local93[1], (Class[]) local93[2]);
					} else if (local46 == 9) {
						local93 = (Object[]) local16.anObject12;
						if (((Class) local93[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject13 = ((Class) local93[0]).getDeclaredField((String) local93[1]);
					} else if (local46 == 18) {
						@Pc(637) Clipboard local637 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject13 = local637.getContents(null);
					} else if (local46 == 19) {
						@Pc(626) Transferable local626 = (Transferable) local16.anObject12;
						@Pc(629) Clipboard local629 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local629.setContents(local626, null);
					} else {
						@Pc(461) String local461;
						if (local46 == 3) {
							if (Class279.method6141() < aLong237) {
								throw new IOException();
							}
							local461 = (local16.anInt7562 >> 24 & 0xFF) + "." + (local16.anInt7562 >> 16 & 0xFF) + "." + (local16.anInt7562 >> 8 & 0xFF) + "." + (local16.anInt7562 & 0xFF);
							local16.anObject13 = InetAddress.getByName(local461).getHostName();
						} else if (local46 == 21) {
							if (Class279.method6141() < aLong237) {
								throw new IOException();
							}
							local16.anObject13 = InetAddress.getByName((String) local16.anObject12).getAddress();
						} else if (local46 == 5) {
							local16.anObject13 = this.aClass277_1.method6119();
						} else if (local46 == 6) {
							@Pc(184) Frame local184 = new Frame("Jagex Full Screen");
							local16.anObject13 = local184;
							local184.setResizable(false);
							this.aClass277_1.method6121(local16.anInt7563 & 0xFFFF, local16.anInt7562 >>> 16, local16.anInt7563 >> 16, local184, local16.anInt7562 & 0xFFFF);
						} else if (local46 == 7) {
							this.aClass277_1.method6122();
						} else {
							@Pc(243) int local243;
							if (local46 == 11) {
								@Pc(230) Field local230 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local230.setAccessible(true);
								@Pc(241) Vector local241 = (Vector) local230.get(((Class) local16.anObject12).getClassLoader());
								for (local243 = 0; local241.size() > local243; local243++) {
									@Pc(251) Object local251 = local241.elementAt(local243);
									@Pc(258) Method local258 = local251.getClass().getDeclaredMethod("finalize");
									local258.setAccessible(true);
									local258.invoke(local251);
									local258.setAccessible(false);
									@Pc(275) Field local275 = local251.getClass().getDeclaredField("handle");
									local275.setAccessible(true);
									local275.set(local251, Integer.valueOf(0));
									local275.setAccessible(false);
								}
								local230.setAccessible(false);
							} else {
								@Pc(307) Class278 local307;
								if (local46 == 12) {
									local307 = method6092(this.aString80, (String) local16.anObject12, this.anInt7555);
									local16.anObject13 = local307;
								} else if (local46 == 13) {
									local307 = method6092("", (String) local16.anObject12, this.anInt7555);
									local16.anObject13 = local307;
								} else if (local46 == 14) {
									@Pc(547) int local547 = local16.anInt7562;
									@Pc(550) int local550 = local16.anInt7563;
									this.aClass274_1.method6087(local550, local547);
								} else if (local46 == 15) {
									@Pc(336) boolean local336 = local16.anInt7562 != 0;
									@Pc(340) Component local340 = (Component) local16.anObject12;
									this.aClass274_1.method6086(local336, local340);
								} else if (local46 == 17) {
									local93 = (Object[]) local16.anObject12;
									this.aClass274_1.method6088(local16.anInt7563, (int[]) local93[1], (Component) local93[0], local16.anInt7562, (Point) local93[2]);
								} else if (local46 == 16) {
									try {
										if (!aString86.startsWith("win")) {
											throw new Exception();
										}
										local461 = (String) local16.anObject12;
										if (!local461.startsWith("http://") && !local461.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(475) String local475 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local243 = 0; local243 < local461.length(); local243++) {
											if (local475.indexOf(local461.charAt(local243)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local461 + "\"");
										local16.anObject13 = null;
									} catch (@Pc(512) Exception local512) {
										local16.anObject13 = local512;
										throw local512;
									}
								} else if (local46 == 20) {
									try {
										@Pc(376) Class[] local376 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(378) Runtime local378 = Runtime.getRuntime();
										@Pc(384) Method local384 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local376);
										local384.setAccessible(true);
										if (aString86.startsWith("win")) {
											if (aString85.startsWith("amd64") || aString85.startsWith("x86_64")) {
												local384.invoke(local378, local16.anObject12, this.method6099("jagmisc64.dll").toString());
											} else {
												local384.invoke(local378, local16.anObject12, this.method6099("jagmisc.dll").toString());
											}
										}
										local384.setAccessible(false);
									} catch (@Pc(444) Throwable local444) {
										local16.anObject13 = local444;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local16.anInt7561 = 1;
			} catch (@Pc(715) ThreadDeath local715) {
				throw local715;
			} catch (@Pc(718) Throwable local718) {
				local16.anInt7561 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!wk;")
	private Class280 method6098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		if (arg2 != -13361) {
			aString82 = null;
		}
		@Pc(9) Class280 local9 = new Class280();
		synchronized (local9) {
			local9.anInt7562 = arg3;
			local9.anInt7564 = arg0;
			local9.anObject12 = arg4;
			local9.anInt7563 = arg1;
			synchronized (this) {
				if (this.aClass280_2 == null) {
					this.aClass280_2 = this.aClass280_1 = local9;
				} else {
					this.aClass280_2.aClass280_3 = local9;
					this.aClass280_2 = local9;
				}
				this.notify();
			}
			try {
				local9.wait();
			} catch (@Pc(60) InterruptedException local60) {
			}
			return local9;
		}
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public File method6099(@OriginalArg(0) String arg0) {
		return method6112(arg0, this.aString80, this.anInt7555);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Z)Lloader!ik;")
	private Interface15 method6100(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aThread6 = null;
		}
		return this.anInterface15_1;
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/String;ZB)Lloader!wk;")
	private Class280 method6101(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (arg2 == 12) {
			return arg1 ? this.method6109(12, false, 0, 0, arg0) : this.method6109(13, false, 0, 0, arg0);
		} else {
			return (Class280) null;
		}
	}

	@OriginalMember(owner = "loader!gt", name = "b", descriptor = "(Z)V")
	private void method6102(@OriginalArg(0) boolean arg0) {
		aLong237 = Class279.method6141() + 5000L;
		if (!arg0) {
			this.run();
		}
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(IB)Lloader!wk;")
	private Class280 method6103(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg1 > -126 ? (Class280) null : this.method6109(3, false, arg0, 0, null);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method6104(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 < 47) {
			return (byte[]) null;
		} else {
			@Pc(13) Class280 local13 = this.method6098(21, 0, -13361, 0, arg1);
			return (byte[]) local13.anObject13;
		}
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(B)V")
	private void method6105() {
		synchronized (this) {
			this.aBoolean509 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass278_1 != null) {
			try {
				this.aClass278_1.method6130();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass278_3 != null) {
			try {
				this.aClass278_3.method6130();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass278Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.aClass278Array1.length; local46++) {
				if (this.aClass278Array1[local46] != null) {
					try {
						this.aClass278Array1[local46].method6130();
					} catch (@Pc(69) IOException local69) {
					}
				}
			}
		}
		if (this.aClass278_2 != null) {
			try {
				this.aClass278_2.method6130();
			} catch (@Pc(88) IOException local88) {
			}
		}
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(I[IILjava/awt/Component;ILjava/awt/Point;)Lloader!wk;")
	private Class280 method6106(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Point arg5) {
		if (arg0 != 17) {
			this.aClass278_3 = null;
		}
		return this.method6109(17, false, arg2, arg4, new Object[] { arg3, arg1, arg5 });
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(I)Z")
	private boolean method6107(@OriginalArg(0) int arg0) {
		if (arg0 < 88) {
			this.method6117(null, -58);
		}
		return this.aClass277_1 != null;
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lloader!wk;")
	private Class280 method6108(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) byte arg2) {
		if (arg2 < 71) {
			this.method6110(-55, null);
		}
		return this.method6109(2, false, arg0, 0, arg1);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(IZIILjava/lang/Object;)Lloader!wk;")
	private Class280 method6109(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class280 local3 = new Class280();
		local3.anInt7562 = arg2;
		local3.anInt7564 = arg0;
		local3.anObject12 = arg4;
		local3.anInt7563 = arg3;
		synchronized (this) {
			if (arg1) {
				return (Class280) null;
			}
			if (this.aClass280_2 == null) {
				this.aClass280_2 = this.aClass280_1 = local3;
			} else {
				this.aClass280_2.aClass280_3 = local3;
				this.aClass280_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!gt", name = "b", descriptor = "(ILjava/lang/Class;)Lloader!wk;")
	private Class280 method6110(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 > -38) {
			aMethod4 = null;
		}
		return this.method6109(20, false, 0, 0, arg1);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/awt/Frame;B)Lloader!wk;")
	private Class280 method6111(@OriginalArg(0) Frame arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -21) {
			this.method6090(-45, null);
		}
		return this.method6109(7, false, 0, 0, arg0);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/awt/Component;III)Lloader!wk;")
	private Class280 method6113(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 != 14) {
			this.aBoolean509 = false;
		}
		@Pc(8) Point local8 = arg0.getLocationOnScreen();
		return this.method6109(14, false, arg3 + local8.x, arg2 - -local8.y, null);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(IILjava/lang/String;)Lloader!wk;")
	private Class280 method6114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 != 10503) {
			this.run();
		}
		return this.method6109(1, false, arg0, 0, arg2);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lloader!wk;")
	private Class280 method6115(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		if (arg2 != 2) {
			this.anApplet2 = null;
		}
		return this.method6109(8, false, 0, 0, new Object[] { arg3, arg0, arg1 });
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ZLjava/awt/Component;I)Lloader!wk;")
	private Class280 method6116(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 <= 26) {
			this.method6101(null, true, (byte) -26);
		}
		return this.method6109(15, false, arg0 ? 1 : 0, 0, arg1);
	}

	@OriginalMember(owner = "loader!gt", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!wk;")
	private Class280 method6117(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method6115(null, null, 38, null);
		}
		return this.method6109(16, false, 0, 0, arg0);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!wk;")
	private Class280 method6118(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -10606) {
			this.method6114(98, 102, null);
		}
		return this.method6109(19, false, 0, 0, arg0);
	}
}
