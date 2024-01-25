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

@OriginalClass("loader!od")
public final class Class279 implements Runnable {

	@OriginalMember(owner = "loader!od", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "loader!od", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!od", name = "t", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!od", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString82;

	@OriginalMember(owner = "loader!od", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!od", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString84;

	@OriginalMember(owner = "loader!od", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString85;

	@OriginalMember(owner = "loader!od", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!od", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!od", name = "m", descriptor = "I")
	private static final int anInt7427 = 1;

	@OriginalMember(owner = "loader!od", name = "z", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!od", name = "v", descriptor = "J")
	private static volatile long aLong225 = 0L;

	@OriginalMember(owner = "loader!od", name = "s", descriptor = "Lloader!fa;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!od", name = "d", descriptor = "Z")
	private boolean aBoolean516 = false;

	@OriginalMember(owner = "loader!od", name = "p", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!od", name = "i", descriptor = "Lloader!am;")
	private Class273 aClass273_2 = null;

	@OriginalMember(owner = "loader!od", name = "n", descriptor = "Lloader!am;")
	private Class273 aClass273_3 = null;

	@OriginalMember(owner = "loader!od", name = "r", descriptor = "Lloader!sh;")
	private Class280 aClass280_3 = null;

	@OriginalMember(owner = "loader!od", name = "w", descriptor = "Lloader!sh;")
	private Class280 aClass280_2 = null;

	@OriginalMember(owner = "loader!od", name = "u", descriptor = "Lloader!sh;")
	private Class280 aClass280_1 = null;

	@OriginalMember(owner = "loader!od", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString78;

	@OriginalMember(owner = "loader!od", name = "A", descriptor = "I")
	private int anInt7428;

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!od", name = "o", descriptor = "[Lloader!sh;")
	private final Class280[] aClass280Array1;

	@OriginalMember(owner = "loader!od", name = "b", descriptor = "Lloader!g;")
	private Class276 aClass276_1;

	@OriginalMember(owner = "loader!od", name = "l", descriptor = "Lloader!e;")
	private Class274 aClass274_1;

	@OriginalMember(owner = "loader!od", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	private static File method6058(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(49) String[] local49 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString83, "/tmp/", "" };
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(83) int local83 = 0; local83 < local74.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local49.length; local93++) {
					@Pc(132) String local132 = local49[local93] + local74[local83] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(134) RandomAccessFile local134 = null;
					try {
						@Pc(139) File local139 = new File(local132);
						if (local76 != 0 || local139.exists()) {
							@Pc(149) String local149 = local49[local93];
							if (local76 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local49[local93] + local74[local83])).mkdir();
								if (arg0 != null) {
									(new File(local49[local93] + local74[local83] + "/" + arg0)).mkdir();
								}
								local134 = new RandomAccessFile(local139, "rw");
								@Pc(218) int local218 = local134.read();
								local134.seek(0L);
								local134.write(local218);
								local134.seek(0L);
								local134.close();
								aHashtable4.put(arg2, local139);
								return local139;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local134 != null) {
								local134.close();
							}
						} catch (@Pc(246) Exception local246) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)Lloader!sh;")
	private static Class280 method6071(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(17) String local17;
		if (arg2 == 33) {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString83, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			@Pc(114) String local114 = local89[local91];
			if (local114.length() <= 0 || (new File(local114)).exists()) {
				try {
					return new Class280(new File(local114, local17), "rw", 10000L);
				} catch (@Pc(140) Exception local140) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!od", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class279(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet3 = arg0;
		this.aString78 = arg2;
		aString84 = "Unknown";
		this.anInt7428 = arg1;
		aString79 = "1.1";
		try {
			aString84 = System.getProperty("java.vendor");
			aString79 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString85 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString85 = "Unknown";
		}
		aString81 = aString85.toLowerCase();
		try {
			aString82 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString82 = "";
		}
		try {
			aString80 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString80 = "";
		}
		try {
			aString83 = System.getProperty("user.home");
			if (aString83 != null) {
				aString83 = aString83 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString83 == null) {
			aString83 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass280_1 = new Class280(method6058(null, this.anInt7428, "random.dat"), "rw", 25L);
		this.aClass280_3 = new Class280(this.method6080("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass280_2 = new Class280(this.method6080("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass280Array1 = new Class280[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass280Array1[local194] = new Class280(this.method6080("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass276_1 = new Class276();
		} catch (@Pc(226) Throwable local226) {
		}
		try {
			this.aClass274_1 = new Class274();
		} catch (@Pc(233) Throwable local233) {
		}
		@Pc(236) ThreadGroup local236 = Thread.currentThread().getThreadGroup();
		for (@Pc(239) ThreadGroup local239 = local236.getParent(); local239 != null; local239 = local239.getParent()) {
			local236 = local239;
		}
		@Pc(250) Thread[] local250 = new Thread[1000];
		local236.enumerate(local250);
		for (@Pc(256) int local256 = 0; local256 < local250.length; local256++) {
			if (local250[local256] != null && local250[local256].getName().startsWith("AWT")) {
				local250[local256].setPriority(1);
			}
		}
		this.aBoolean516 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!od", name = "b", descriptor = "(I)Lloader!am;")
	private Class273 method6053(@OriginalArg(0) int arg0) {
		if (arg0 != 7) {
			this.aClass276_1 = null;
		}
		return this.method6057(null, 0, 87, 0, 18);
	}

	@OriginalMember(owner = "loader!od", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class273 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean516) {
						return;
					}
					if (this.aClass273_3 != null) {
						local16 = this.aClass273_3;
						this.aClass273_3 = this.aClass273_3.aClass273_1;
						if (this.aClass273_3 == null) {
							this.aClass273_2 = null;
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
				@Pc(45) int local45 = local16.anInt7418;
				if (local45 == 1) {
					if (Class278.method6052() < aLong225) {
						throw new IOException();
					}
					local16.anObject12 = new Socket(InetAddress.getByName((String) local16.anObject11), local16.anInt7415);
				} else if (local45 == 2) {
					@Pc(80) Thread local80 = new Thread((Runnable) local16.anObject11);
					local80.setDaemon(true);
					local80.start();
					local80.setPriority(local16.anInt7415);
					local16.anObject12 = local80;
				} else if (local45 == 4) {
					if (Class278.method6052() < aLong225) {
						throw new IOException();
					}
					local16.anObject12 = new DataInputStream(((URL) local16.anObject11).openStream());
				} else {
					@Pc(108) Object[] local108;
					if (local45 == 8) {
						local108 = (Object[]) local16.anObject11;
						if (((Class) local108[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject12 = ((Class) local108[0]).getDeclaredMethod((String) local108[1], (Class[]) local108[2]);
					} else if (local45 == 9) {
						local108 = (Object[]) local16.anObject11;
						if (((Class) local108[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject12 = ((Class) local108[0]).getDeclaredField((String) local108[1]);
					} else if (local45 == 18) {
						@Pc(686) Clipboard local686 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject12 = local686.getContents(null);
					} else if (local45 == 19) {
						@Pc(675) Transferable local675 = (Transferable) local16.anObject11;
						@Pc(678) Clipboard local678 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local678.setContents(local675, null);
					} else {
						@Pc(393) String local393;
						if (local45 == 3) {
							if (Class278.method6052() < aLong225) {
								throw new IOException();
							}
							local393 = (local16.anInt7415 >> 24 & 0xFF) + "." + (local16.anInt7415 >> 16 & 0xFF) + "." + (local16.anInt7415 >> 8 & 0xFF) + "." + (local16.anInt7415 & 0xFF);
							local16.anObject12 = InetAddress.getByName(local393).getHostName();
						} else if (local45 == 21) {
							if (Class278.method6052() < aLong225) {
								throw new IOException();
							}
							local16.anObject12 = InetAddress.getByName((String) local16.anObject11).getAddress();
						} else if (local45 == 5) {
							local16.anObject12 = this.aClass276_1.method6045();
						} else if (local45 == 6) {
							@Pc(573) Frame local573 = new Frame("Jagex Full Screen");
							local16.anObject12 = local573;
							local573.setResizable(false);
							this.aClass276_1.method6043(local16.anInt7415 >>> 16, local16.anInt7415 & 0xFFFF, local16.anInt7416 & 0xFFFF, local573, local16.anInt7416 >> 16);
						} else if (local45 == 7) {
							this.aClass276_1.method6044();
						} else {
							@Pc(410) int local410;
							if (local45 == 11) {
								@Pc(500) Field local500 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local500.setAccessible(true);
								@Pc(511) Vector local511 = (Vector) local500.get(((Class) local16.anObject11).getClassLoader());
								for (local410 = 0; local410 < local511.size(); local410++) {
									@Pc(525) Object local525 = local511.elementAt(local410);
									@Pc(532) Method local532 = local525.getClass().getDeclaredMethod("finalize");
									local532.setAccessible(true);
									local532.invoke(local525);
									local532.setAccessible(false);
									@Pc(549) Field local549 = local525.getClass().getDeclaredField("handle");
									local549.setAccessible(true);
									local549.set(local525, Integer.valueOf(0));
									local549.setAccessible(false);
								}
								local500.setAccessible(false);
							} else {
								@Pc(231) Class280 local231;
								if (local45 == 12) {
									local231 = method6071((String) local16.anObject11, this.aString78, this.anInt7428);
									local16.anObject12 = local231;
								} else if (local45 == 13) {
									local231 = method6071((String) local16.anObject11, "", this.anInt7428);
									local16.anObject12 = local231;
								} else if (local45 == 14) {
									@Pc(243) int local243 = local16.anInt7415;
									@Pc(246) int local246 = local16.anInt7416;
									this.aClass274_1.method6034(local246, local243);
								} else if (local45 == 15) {
									@Pc(266) boolean local266 = local16.anInt7415 != 0;
									@Pc(270) Component local270 = (Component) local16.anObject11;
									this.aClass274_1.method6033(local266, local270);
								} else if (local45 == 17) {
									local108 = (Object[]) local16.anObject11;
									this.aClass274_1.method6035(local16.anInt7416, (Component) local108[0], local16.anInt7415, (Point) local108[2], (int[]) local108[1]);
								} else if (local45 == 16) {
									try {
										if (!aString81.startsWith("win")) {
											throw new Exception();
										}
										local393 = (String) local16.anObject11;
										if (!local393.startsWith("http://") && !local393.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(408) String local408 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local410 = 0; local393.length() > local410; local410++) {
											if (local408.indexOf(local393.charAt(local410)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local393 + "\"");
										local16.anObject12 = null;
									} catch (@Pc(449) Exception local449) {
										local16.anObject12 = local449;
										throw local449;
									}
								} else if (local45 == 20) {
									try {
										@Pc(308) Class[] local308 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(310) Runtime local310 = Runtime.getRuntime();
										@Pc(316) Method local316 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local308);
										local316.setAccessible(true);
										if (aString81.startsWith("win")) {
											if (aString82.startsWith("amd64") || aString82.startsWith("x86_64")) {
												local316.invoke(local310, local16.anObject11, this.method6080("jagmisc64.dll").toString());
											} else {
												local316.invoke(local310, local16.anObject11, this.method6080("jagmisc.dll").toString());
											}
										}
										local316.setAccessible(false);
									} catch (@Pc(376) Throwable local376) {
										local16.anObject12 = local376;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local16.anInt7417 = 1;
			} catch (@Pc(719) ThreadDeath local719) {
				throw local719;
			} catch (@Pc(722) Throwable local722) {
				local16.anInt7417 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!am;")
	private Class273 method6054(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -12949) {
			this.anApplet3 = null;
		}
		return this.method6057(arg0, 0, 1, 0, 7);
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!am;")
	private Class273 method6055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 != -1686) {
			aHashtable4 = null;
		}
		@Pc(8) Point local8 = arg3.getLocationOnScreen();
		return this.method6057(null, local8.x + arg2, -121, arg0 - -local8.y, 14);
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lloader!am;")
	private Class273 method6056(@OriginalArg(0) boolean arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 ? this.method6057(arg1, 0, 123, 0, 19) : (Class273) null;
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!am;")
	private Class273 method6057(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class273 local3 = new Class273();
		local3.anInt7416 = arg3;
		local3.anInt7418 = arg4;
		local3.anObject11 = arg0;
		local3.anInt7415 = arg1;
		synchronized (this) {
			if (this.aClass273_2 == null) {
				this.aClass273_2 = this.aClass273_3 = local3;
			} else {
				this.aClass273_2.aClass273_1 = local3;
				this.aClass273_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!od", name = "d", descriptor = "(I)Z")
	private boolean method6059(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			this.method6053(-49);
		}
		return this.aClass276_1 != null;
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/lang/Class;I)V")
	private void method6060(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) throws Exception {
		if (arg1 != 0) {
			this.anInt7428 = 17;
		}
		@Pc(17) Class[] local17 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(19) Runtime local19 = Runtime.getRuntime();
		@Pc(30) Method local30 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(41) Method local41;
		if (!aString81.startsWith("mac")) {
			local41 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local17);
			local30.invoke(local41, Boolean.TRUE);
			local41.invoke(local19, arg0, "jawt");
			local30.invoke(local41, Boolean.FALSE);
		}
		local41 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local17);
		local30.invoke(local41, Boolean.TRUE);
		if (!aString81.startsWith("win")) {
			throw new Exception();
		}
		local41.invoke(local19, arg0, this.method6080("sw3d.dll").toString());
		local30.invoke(local41, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!od", name = "b", descriptor = "(Ljava/lang/Class;I)Lloader!am;")
	private Class273 method6061(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 == 0 ? this.method6057(arg0, 0, arg1 ^ 0xFFFFFFA9, 0, 20) : (Class273) null;
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!am;")
	private Class273 method6062(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		return arg1 >= -102 ? (Class273) null : this.method6057(arg0, 0, -106, 0, 21);
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lloader!am;")
	private Class273 method6063(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg1 == 10000 ? this.method6057(arg0, arg2 ? 1 : 0, -109, 0, 15) : (Class273) null;
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lloader!am;")
	private Class273 method6064(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return arg2 == 25556 ? this.method6057(new Object[] { arg0, arg1 }, 0, arg2 - 25649, 0, 9) : (Class273) null;
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method6065(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 == -24846) {
			@Pc(13) Class273 local13 = this.method6074(0, 0, arg1, 21, 0);
			return (byte[]) local13.anObject12;
		} else {
			return (byte[]) null;
		}
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(ILjava/net/URL;)Lloader!am;")
	private Class273 method6066(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		if (arg0 != 2281) {
			this.anEventQueue2 = null;
		}
		return this.method6057(arg1, 0, 119, 0, 4);
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lloader!am;")
	private Class273 method6067(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) boolean arg3) {
		return arg3 ? this.method6057(new Object[] { arg0, arg1, arg2 }, 0, 39, 0, 8) : (Class273) null;
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(II)Lloader!am;")
	private Class273 method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == -1732301360 ? this.method6057(null, arg1, -85, 0, 3) : (Class273) null;
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Z)Lloader!fa;")
	private Interface14 method6069(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method6082(-80, null, -21);
		}
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!am;")
	private Class273 method6070(@OriginalArg(0) String arg0) {
		return this.method6057(arg0, 0, -107, 0, 16);
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(BIIII)Lloader!am;")
	private Class273 method6072(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0 < 107 ? (Class273) null : this.method6057(null, (arg2 << 16) + arg1, -91, (arg3 << 16) + arg4, 6);
	}

	@OriginalMember(owner = "loader!od", name = "c", descriptor = "(I)Lloader!am;")
	private Class273 method6073(@OriginalArg(0) int arg0) {
		if (arg0 != 5) {
			this.method6054(null, -8);
		}
		return this.method6057(null, 0, 105, 0, 5);
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!am;")
	private Class273 method6074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class273 local3 = new Class273();
		synchronized (local3) {
			local3.anInt7416 = arg1;
			local3.anInt7418 = arg3;
			local3.anInt7415 = arg0;
			local3.anObject11 = arg2;
			synchronized (this) {
				if (arg4 != 0) {
					return (Class273) null;
				}
				if (this.aClass273_2 == null) {
					this.aClass273_2 = this.aClass273_3 = local3;
				} else {
					this.aClass273_2.aClass273_1 = local3;
					this.aClass273_2 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(63) InterruptedException local63) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(I)V")
	private void method6075() {
		aLong225 = Class278.method6052() + 5000L;
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!am;")
	private Class273 method6076(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 41) {
			this.method6067(null, null, null, true);
		}
		return this.method6057(arg1, 0, 14, 0, 11);
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!am;")
	private Class273 method6077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		if (arg1 != 0) {
			this.method6082(24, null, 100);
		}
		return this.method6057(arg2, arg0, 44, 0, 2);
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(B)V")
	private void method6078(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean516 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass280_3 != null) {
			try {
				this.aClass280_3.method6086(-32307);
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass280_2 != null) {
			try {
				this.aClass280_2.method6086(-32307);
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (arg0 != -125) {
			aLong225 = 117L;
		}
		if (this.aClass280Array1 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aClass280Array1.length; local51++) {
				if (this.aClass280Array1[local51] != null) {
					try {
						this.aClass280Array1[local51].method6086(arg0 - 32182);
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass280_1 != null) {
			try {
				this.aClass280_1.method6086(-32307);
			} catch (@Pc(83) IOException local83) {
			}
		}
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/awt/Point;[IIBLjava/awt/Component;I)Lloader!am;")
	private Class273 method6079(@OriginalArg(0) Point arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) Component arg4, @OriginalArg(5) int arg5) {
		if (arg3 >= -12) {
			this.method6075();
		}
		return this.method6057(new Object[] { arg4, arg1, arg0 }, arg5, -105, arg2, 17);
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method6080(@OriginalArg(1) String arg0) {
		return method6058(this.aString78, this.anInt7428, arg0);
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/lang/String;ZI)Lloader!am;")
	private Class273 method6081(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return arg1 ? this.method6057(arg0, 0, 22, 0, 12) : this.method6057(arg0, 0, -1, 0, 13);
		} else {
			return (Class273) null;
		}
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!am;")
	private Class273 method6082(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return arg2 == 0 ? this.method6057(arg1, arg0, arg2 ^ 0xFFFFFF97, 0, 1) : (Class273) null;
	}
}
