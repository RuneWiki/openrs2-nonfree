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

@OriginalClass("loader!pc")
public final class Class280 implements Runnable {

	@OriginalMember(owner = "loader!pc", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "loader!pc", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!pc", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString84;

	@OriginalMember(owner = "loader!pc", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString85;

	@OriginalMember(owner = "loader!pc", name = "z", descriptor = "Ljava/lang/String;")
	private static String aString86;

	@OriginalMember(owner = "loader!pc", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString87;

	@OriginalMember(owner = "loader!pc", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!pc", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!pc", name = "p", descriptor = "I")
	private static final int anInt7682 = 1;

	@OriginalMember(owner = "loader!pc", name = "k", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!pc", name = "v", descriptor = "J")
	private static volatile long aLong232 = 0L;

	@OriginalMember(owner = "loader!pc", name = "B", descriptor = "Lloader!eu;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!pc", name = "d", descriptor = "Lloader!cw;")
	private Class275 aClass275_2 = null;

	@OriginalMember(owner = "loader!pc", name = "f", descriptor = "Lloader!cw;")
	private Class275 aClass275_3 = null;

	@OriginalMember(owner = "loader!pc", name = "o", descriptor = "Lloader!en;")
	private Class276 aClass276_2 = null;

	@OriginalMember(owner = "loader!pc", name = "t", descriptor = "Z")
	private boolean aBoolean544 = false;

	@OriginalMember(owner = "loader!pc", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!pc", name = "q", descriptor = "Lloader!en;")
	private Class276 aClass276_1 = null;

	@OriginalMember(owner = "loader!pc", name = "u", descriptor = "Lloader!en;")
	private Class276 aClass276_3 = null;

	@OriginalMember(owner = "loader!pc", name = "l", descriptor = "Ljava/lang/String;")
	private String aString82;

	@OriginalMember(owner = "loader!pc", name = "n", descriptor = "I")
	private final int anInt7683;

	@OriginalMember(owner = "loader!pc", name = "r", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!pc", name = "c", descriptor = "[Lloader!en;")
	private final Class276[] aClass276Array1;

	@OriginalMember(owner = "loader!pc", name = "x", descriptor = "Lloader!c;")
	private Class274 aClass274_1;

	@OriginalMember(owner = "loader!pc", name = "g", descriptor = "Lloader!g;")
	private Class278 aClass278_1;

	@OriginalMember(owner = "loader!pc", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method6110(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString86, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(82) int local82 = 0; local82 < local75.length; local82++) {
				for (@Pc(88) int local88 = 0; local88 < local44.length; local88++) {
					@Pc(127) String local127 = local44[local88] + local75[local82] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(129) RandomAccessFile local129 = null;
					try {
						@Pc(134) File local134 = new File(local127);
						if (local77 != 0 || local134.exists()) {
							@Pc(147) String local147 = local44[local88];
							if (local77 != 1 || local147.length() <= 0 || (new File(local147)).exists()) {
								(new File(local44[local88] + local75[local82])).mkdir();
								if (arg2 != null) {
									(new File(local44[local88] + local75[local82] + "/" + arg2)).mkdir();
								}
								local129 = new RandomAccessFile(local134, "rw");
								@Pc(213) int local213 = local129.read();
								local129.seek(0L);
								local129.write(local213);
								local129.seek(0L);
								local129.close();
								aHashtable4.put(arg1, local134);
								return local134;
							}
						}
					} catch (@Pc(232) Exception local232) {
						try {
							if (local129 != null) {
								local129.close();
							}
						} catch (@Pc(241) Exception local241) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lloader!en;")
	private static Class276 method6116(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(20) String local20;
		if (arg1 == 33) {
			local20 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local20 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local20 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(87) String[] local87 = new String[] { "c:/rscache/", "/rscache/", aString86, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(89) int local89 = 0; local89 < local87.length; local89++) {
			@Pc(97) String local97 = local87[local89];
			if (local97.length() <= 0 || (new File(local97)).exists()) {
				try {
					return new Class276(new File(local97, local20), "rw", 10000L);
				} catch (@Pc(123) Exception local123) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!pc", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class280(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString81 = "Unknown";
		this.aString82 = arg2;
		aString80 = "1.1";
		this.anApplet3 = arg0;
		this.anInt7683 = arg1;
		try {
			aString81 = System.getProperty("java.vendor");
			aString80 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString85 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString85 = "Unknown";
		}
		aString83 = aString85.toLowerCase();
		try {
			aString84 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString84 = "";
		}
		try {
			aString87 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString87 = "";
		}
		try {
			aString86 = System.getProperty("user.home");
			if (aString86 != null) {
				aString86 = aString86 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString86 == null) {
			aString86 = "~/";
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
		this.aClass276_3 = new Class276(method6110(this.anInt7683, "random.dat", null), "rw", 25L);
		this.aClass276_1 = new Class276(this.method6106("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass276_2 = new Class276(this.method6106("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass276Array1 = new Class276[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass276Array1[local193] = new Class276(this.method6106("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass274_1 = new Class274();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass278_1 = new Class278();
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
		this.aBoolean544 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!cw;")
	private Class275 method6100(@OriginalArg(0) Transferable arg0) {
		return this.method6122(0, arg0, 0, 0, 19);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(I)Lloader!cw;")
	private Class275 method6101(@OriginalArg(0) int arg0) {
		if (arg0 != -25232) {
			this.method6124(null, -25, -28, -119, -78);
		}
		return this.method6122(0, null, 0, 0, 5);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lloader!cw;")
	private Class275 method6102(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class arg2) {
		if (arg1 <= 120) {
			this.method6121(null, 69, (byte) 70);
		}
		return this.method6122(0, new Object[] { arg2, arg0 }, 0, 0, 9);
	}

	@OriginalMember(owner = "loader!pc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class275 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean544) {
						return;
					}
					if (this.aClass275_3 != null) {
						local17 = this.aClass275_3;
						this.aClass275_3 = this.aClass275_3.aClass275_1;
						if (this.aClass275_3 == null) {
							this.aClass275_2 = null;
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
				@Pc(45) int local45 = local17.anInt7673;
				if (local45 == 1) {
					if (aLong232 > Class279.method6099()) {
						throw new IOException();
					}
					local17.anObject20 = new Socket(InetAddress.getByName((String) local17.anObject19), local17.anInt7671);
				} else if (local45 == 2) {
					@Pc(664) Thread local664 = new Thread((Runnable) local17.anObject19);
					local664.setDaemon(true);
					local664.start();
					local664.setPriority(local17.anInt7671);
					local17.anObject20 = local664;
				} else if (local45 == 4) {
					if (aLong232 > Class279.method6099()) {
						throw new IOException();
					}
					local17.anObject20 = new DataInputStream(((URL) local17.anObject19).openStream());
				} else {
					@Pc(87) Object[] local87;
					if (local45 == 8) {
						local87 = (Object[]) local17.anObject19;
						if (((Class) local87[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject20 = ((Class) local87[0]).getDeclaredMethod((String) local87[1], (Class[]) local87[2]);
					} else if (local45 == 9) {
						local87 = (Object[]) local17.anObject19;
						if (((Class) local87[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject20 = ((Class) local87[0]).getDeclaredField((String) local87[1]);
					} else if (local45 == 18) {
						@Pc(117) Clipboard local117 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject20 = local117.getContents(null);
					} else if (local45 == 19) {
						@Pc(130) Transferable local130 = (Transferable) local17.anObject19;
						@Pc(133) Clipboard local133 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local133.setContents(local130, null);
					} else {
						@Pc(194) String local194;
						if (local45 == 3) {
							if (Class279.method6099() < aLong232) {
								throw new IOException();
							}
							local194 = (local17.anInt7671 >> 24 & 0xFF) + "." + (local17.anInt7671 >> 16 & 0xFF) + "." + (local17.anInt7671 >> 8 & 0xFF) + "." + (local17.anInt7671 & 0xFF);
							local17.anObject20 = InetAddress.getByName(local194).getHostName();
						} else if (local45 == 21) {
							if (aLong232 > Class279.method6099()) {
								throw new IOException();
							}
							local17.anObject20 = InetAddress.getByName((String) local17.anObject19).getAddress();
						} else if (local45 == 5) {
							local17.anObject20 = this.aClass274_1.method6070();
						} else if (local45 == 6) {
							@Pc(589) Frame local589 = new Frame("Jagex Full Screen");
							local17.anObject20 = local589;
							local589.setResizable(false);
							this.aClass274_1.method6067(local17.anInt7671 & 0xFFFF, local589, local17.anInt7670 >> 16, local17.anInt7671 >>> 16, local17.anInt7670 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass274_1.method6068();
						} else {
							@Pc(259) int local259;
							if (local45 == 11) {
								@Pc(246) Field local246 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local246.setAccessible(true);
								@Pc(257) Vector local257 = (Vector) local246.get(((Class) local17.anObject19).getClassLoader());
								for (local259 = 0; local257.size() > local259; local259++) {
									@Pc(267) Object local267 = local257.elementAt(local259);
									@Pc(274) Method local274 = local267.getClass().getDeclaredMethod("finalize");
									local274.setAccessible(true);
									local274.invoke(local267);
									local274.setAccessible(false);
									@Pc(291) Field local291 = local267.getClass().getDeclaredField("handle");
									local291.setAccessible(true);
									local291.set(local267, Integer.valueOf(0));
									local291.setAccessible(false);
								}
								local246.setAccessible(false);
							} else {
								@Pc(323) Class276 local323;
								if (local45 == 12) {
									local323 = method6116(this.aString82, this.anInt7683, (String) local17.anObject19);
									local17.anObject20 = local323;
								} else if (local45 == 13) {
									local323 = method6116("", this.anInt7683, (String) local17.anObject19);
									local17.anObject20 = local323;
								} else if (local45 == 14) {
									@Pc(556) int local556 = local17.anInt7671;
									@Pc(559) int local559 = local17.anInt7670;
									this.aClass278_1.method6089(local559, local556);
								} else if (local45 == 15) {
									@Pc(542) boolean local542 = local17.anInt7671 != 0;
									@Pc(546) Component local546 = (Component) local17.anObject19;
									this.aClass278_1.method6090(local546, local542);
								} else if (local45 == 17) {
									local87 = (Object[]) local17.anObject19;
									this.aClass278_1.method6091((Point) local87[2], local17.anInt7670, (int[]) local87[1], (Component) local87[0], local17.anInt7671);
								} else if (local45 == 16) {
									try {
										if (!aString83.startsWith("win")) {
											throw new Exception();
										}
										local194 = (String) local17.anObject19;
										if (!local194.startsWith("http://") && !local194.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(492) String local492 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local259 = 0; local194.length() > local259; local259++) {
											if (local492.indexOf(local194.charAt(local259)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local194 + "\"");
										local17.anObject20 = null;
									} catch (@Pc(530) Exception local530) {
										local17.anObject20 = local530;
										throw local530;
									}
								} else if (local45 == 20) {
									try {
										@Pc(389) Class[] local389 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(391) Runtime local391 = Runtime.getRuntime();
										@Pc(397) Method local397 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local389);
										local397.setAccessible(true);
										if (aString83.startsWith("win")) {
											if (aString84.startsWith("amd64") || aString84.startsWith("x86_64")) {
												local397.invoke(local391, local17.anObject19, this.method6106("jagmisc64.dll").toString());
											} else {
												local397.invoke(local391, local17.anObject19, this.method6106("jagmisc.dll").toString());
											}
										}
										local397.setAccessible(false);
									} catch (@Pc(456) Throwable local456) {
										local17.anObject20 = local456;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local17.anInt7672 = 1;
			} catch (@Pc(706) ThreadDeath local706) {
				throw local706;
			} catch (@Pc(709) Throwable local709) {
				local17.anInt7672 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(IIZII)Lloader!cw;")
	private Class275 method6103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!arg2) {
			this.method6104(false, (byte) -46, null);
		}
		return this.method6122(arg1 + (arg4 << 16), null, (arg3 << 16) + arg0, 0, 6);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(ZBLjava/awt/Component;)Lloader!cw;")
	private Class275 method6104(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2) {
		if (arg1 != 108) {
			this.aString82 = null;
		}
		return this.method6122(arg0 ? 1 : 0, arg2, 0, 0, 15);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!cw;")
	private Class275 method6105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg0 <= 48) {
			this.aClass274_1 = null;
		}
		@Pc(9) Point local9 = arg3.getLocationOnScreen();
		return this.method6122(local9.x + arg1, null, arg2 + local9.y, 0, 14);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method6106(@OriginalArg(1) String arg0) {
		return method6110(this.anInt7683, arg0, this.aString82);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;[IIB)Lloader!cw;")
	private Class275 method6107(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		return this.method6122(arg0, new Object[] { arg2, arg3, arg1 }, arg4, 0, 17);
	}

	@OriginalMember(owner = "loader!pc", name = "c", descriptor = "(I)Lloader!cw;")
	private Class275 method6108(@OriginalArg(0) int arg0) {
		if (arg0 < 103) {
			this.anApplet3 = null;
		}
		return this.method6122(0, null, 0, 0, 18);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!cw;")
	private Class275 method6109(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 0) {
			this.aString82 = null;
		}
		return this.method6122(0, arg1, 0, 0, 11);
	}

	@OriginalMember(owner = "loader!pc", name = "b", descriptor = "(ILjava/lang/Class;)V")
	private void method6111(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(36) Method local36;
		if (!aString83.startsWith("mac")) {
			local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local36, Boolean.TRUE);
			local36.invoke(local14, arg1, "jawt");
			local25.invoke(local36, Boolean.FALSE);
		}
		local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		if (arg0 != 2) {
			this.aClass278_1 = null;
		}
		local25.invoke(local36, Boolean.TRUE);
		if (!aString83.startsWith("win")) {
			throw new Exception();
		}
		local36.invoke(local14, arg1, this.method6106("sw3d.dll").toString());
		local25.invoke(local36, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(Z[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lloader!cw;")
	private Class275 method6112(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) String arg3) {
		return arg0 ? (Class275) null : this.method6122(0, new Object[] { arg2, arg3, arg1 }, 0, 0, 8);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(Z)Z")
	private boolean method6113(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return false;
		} else {
			return this.aClass274_1 != null;
		}
	}

	@OriginalMember(owner = "loader!pc", name = "b", descriptor = "(I)V")
	private void method6114(@OriginalArg(0) int arg0) {
		if (arg0 != 5000) {
			this.anApplet3 = null;
		}
		aLong232 = Class279.method6099() + 5000L;
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(B)Lloader!eu;")
	private Interface14 method6115(@OriginalArg(0) byte arg0) {
		if (arg0 >= -76) {
			this.method6121(null, 90, (byte) 2);
		}
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(II)Lloader!cw;")
	private Class275 method6117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == -3390 ? this.method6122(arg0, null, 0, 0, 3) : (Class275) null;
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(Ljava/lang/String;ZB)Lloader!cw;")
	private Class275 method6118(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (arg2 >= -5) {
			this.aString82 = null;
		}
		return arg1 ? this.method6122(0, arg0, 0, 0, 12) : this.method6122(0, arg0, 0, 0, 13);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!cw;")
	private Class275 method6119(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 75) {
			this.run();
		}
		return this.method6122(0, arg1, 0, 0, 20);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(ILjava/net/URL;)Lloader!cw;")
	private Class275 method6120(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		if (arg0 > -84) {
			this.method6128(null, (byte) 17);
		}
		return this.method6122(0, arg1, 0, 0, 4);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(Ljava/lang/String;IB)Lloader!cw;")
	private Class275 method6121(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return arg2 == 91 ? this.method6122(arg1, arg0, 0, 0, 1) : (Class275) null;
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!cw;")
	private Class275 method6122(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class275 local3 = new Class275();
		local3.anInt7670 = arg2;
		local3.anInt7671 = arg0;
		local3.anObject19 = arg1;
		local3.anInt7673 = arg4;
		synchronized (this) {
			if (this.aClass275_2 == null) {
				this.aClass275_2 = this.aClass275_3 = local3;
			} else {
				this.aClass275_2.aClass275_1 = local3;
				this.aClass275_2 = local3;
			}
			this.notify();
			if (arg3 != 0) {
				this.method6127(null);
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!pc", name = "d", descriptor = "(I)V")
	private void method6123(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean544 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass276_1 != null) {
			try {
				this.aClass276_1.method6081();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass276_2 != null) {
			try {
				this.aClass276_2.method6081();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass276Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass276Array1.length; local47++) {
				if (this.aClass276Array1[local47] != null) {
					try {
						this.aClass276Array1[local47].method6081();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass276_3 != null) {
			try {
				this.aClass276_3.method6081();
			} catch (@Pc(79) IOException local79) {
			}
		}
		if (arg0 != 27251) {
			this.method6123(105);
		}
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!cw;")
	private Class275 method6124(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class275 local3 = new Class275();
		synchronized (local3) {
			local3.anInt7670 = arg1;
			local3.anInt7671 = arg3;
			local3.anObject19 = arg0;
			local3.anInt7673 = arg4;
			synchronized (this) {
				if (this.aClass275_2 == null) {
					this.aClass275_2 = this.aClass275_3 = local3;
				} else {
					this.aClass275_2.aClass275_1 = local3;
					this.aClass275_2 = local3;
				}
				if (arg2 != -6897) {
					this.method6123(-65);
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(61) InterruptedException local61) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method6125(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class275 local7 = this.method6124(arg1, arg0, -6897, 0, 21);
		return (byte[]) local7.anObject20;
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(ZILjava/lang/Runnable;)Lloader!cw;")
	private Class275 method6126(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		return arg0 ? (Class275) null : this.method6122(arg1, arg2, 0, 0, 2);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!cw;")
	private Class275 method6127(@OriginalArg(0) Frame arg0) {
		return this.method6122(0, arg0, 0, 0, 7);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!cw;")
	private Class275 method6128(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -71) {
			aHashtable4 = null;
		}
		return this.method6122(0, arg0, 0, 0, 16);
	}

	@OriginalMember(owner = "loader!pc", name = "a", descriptor = "(Ljava/lang/String;Z)Lloader!cw;")
	private Class275 method6129(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? (Class275) null : this.method6122(0, arg0, 0, 0, 21);
	}
}
