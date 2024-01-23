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

@OriginalClass("loader!bk")
public final class Class206 implements Runnable {

	@OriginalMember(owner = "loader!bk", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString207;

	@OriginalMember(owner = "loader!bk", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString208;

	@OriginalMember(owner = "loader!bk", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString209;

	@OriginalMember(owner = "loader!bk", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString210;

	@OriginalMember(owner = "loader!bk", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString211;

	@OriginalMember(owner = "loader!bk", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString212;

	@OriginalMember(owner = "loader!bk", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString213;

	@OriginalMember(owner = "loader!bk", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod7;

	@OriginalMember(owner = "loader!bk", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod8;

	@OriginalMember(owner = "loader!bk", name = "d", descriptor = "I")
	private static int anInt5738 = 1;

	@OriginalMember(owner = "loader!bk", name = "y", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "loader!bk", name = "v", descriptor = "J")
	private static volatile long aLong1324 = 0L;

	@OriginalMember(owner = "loader!bk", name = "p", descriptor = "Lloader!gi;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "loader!bk", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!bk", name = "q", descriptor = "Lloader!dd;")
	private Class208 aClass208_2 = null;

	@OriginalMember(owner = "loader!bk", name = "c", descriptor = "Lloader!dd;")
	private Class208 aClass208_1 = null;

	@OriginalMember(owner = "loader!bk", name = "z", descriptor = "Z")
	private boolean aBoolean503 = false;

	@OriginalMember(owner = "loader!bk", name = "i", descriptor = "Lloader!dd;")
	private Class208 aClass208_3 = null;

	@OriginalMember(owner = "loader!bk", name = "j", descriptor = "Lloader!ub;")
	private Class211 aClass211_2 = null;

	@OriginalMember(owner = "loader!bk", name = "x", descriptor = "Lloader!ub;")
	private Class211 aClass211_1 = null;

	@OriginalMember(owner = "loader!bk", name = "e", descriptor = "Ljava/lang/String;")
	private String aString206;

	@OriginalMember(owner = "loader!bk", name = "A", descriptor = "I")
	private int anInt5739;

	@OriginalMember(owner = "loader!bk", name = "f", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!bk", name = "r", descriptor = "[Lloader!dd;")
	private Class208[] aClass208Array1;

	@OriginalMember(owner = "loader!bk", name = "w", descriptor = "Lloader!g;")
	private Class210 aClass210_1;

	@OriginalMember(owner = "loader!bk", name = "h", descriptor = "Lloader!b;")
	private Class205 aClass205_1;

	@OriginalMember(owner = "loader!bk", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!bk", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!dd;")
	private static Class208 method4637(@OriginalArg(0) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString207, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(47) int local47 = 0; local47 < local34.length; local47++) {
			@Pc(55) String local55 = local34[local47];
			if (local55.length() <= 0 || (new File(local55)).exists()) {
				try {
					return new Class208(new File(local55, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(91) Exception local91) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!bk", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	public static File method4639(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(34) String[] local34 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(69) String[] local69 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString207, "/tmp/", "" };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(78) int local78 = 0; local78 < local34.length; local78++) {
				for (@Pc(84) int local84 = 0; local84 < local69.length; local84++) {
					@Pc(118) String local118 = local69[local84] + local34[local78] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(120) RandomAccessFile local120 = null;
					try {
						@Pc(125) File local125 = new File(local118);
						if (local71 != 0 || local125.exists()) {
							@Pc(138) String local138 = local69[local84];
							if (local71 != 1 || local138.length() <= 0 || (new File(local138)).exists()) {
								(new File(local69[local84] + local34[local78])).mkdir();
								if (arg1 != null) {
									(new File(local69[local84] + local34[local78] + "/" + arg1)).mkdir();
								}
								local120 = new RandomAccessFile(local125, "rw");
								@Pc(203) int local203 = local120.read();
								local120.seek(0L);
								local120.write(local203);
								local120.seek(0L);
								local120.close();
								aHashtable1.put(arg0, local125);
								return local125;
							}
						}
					} catch (@Pc(222) Exception local222) {
						try {
							if (local120 != null) {
								local120.close();
							}
						} catch (@Pc(231) Exception local231) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!bk", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class206(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString210 = "Unknown";
		this.aString206 = arg2;
		this.anApplet2 = arg0;
		this.anInt5739 = arg1;
		aString211 = "1.1";
		try {
			aString210 = System.getProperty("java.vendor");
			aString211 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString212 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString212 = "Unknown";
		}
		aString213 = aString212.toLowerCase();
		try {
			aString208 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString208 = "";
		}
		try {
			aString209 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString209 = "";
		}
		try {
			aString207 = System.getProperty("user.home");
			if (aString207 != null) {
				aString207 = aString207 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString207 == null) {
			aString207 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				aMethod7 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod7 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod8 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod8 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass208_2 = new Class208(method4639("random.dat", null, this.anInt5739), "rw", 25L);
		this.aClass208_3 = new Class208(method4639("main_file_cache.dat2", this.aString206, this.anInt5739), "rw", 104857600L);
		this.aClass208_1 = new Class208(method4639("main_file_cache.idx255", this.aString206, this.anInt5739), "rw", 1048576L);
		this.aClass208Array1 = new Class208[arg3];
		for (@Pc(198) int local198 = 0; local198 < arg3; local198++) {
			this.aClass208Array1[local198] = new Class208(method4639("main_file_cache.idx" + local198, this.aString206, this.anInt5739), "rw", 1048576L);
		}
		try {
			this.aClass210_1 = new Class210();
		} catch (@Pc(233) Throwable local233) {
		}
		try {
			this.aClass205_1 = new Class205();
		} catch (@Pc(240) Throwable local240) {
		}
		@Pc(243) Thread[] local243 = new Thread[1000];
		@Pc(246) ThreadGroup local246 = Thread.currentThread().getThreadGroup();
		for (@Pc(249) ThreadGroup local249 = local246.getParent(); local249 != null; local249 = local249.getParent()) {
			local246 = local249;
		}
		local246.enumerate(local243);
		for (@Pc(263) int local263 = 0; local263 < local243.length; local263++) {
			if (local243[local263] != null && local243[local263].getName().startsWith("AWT")) {
				local243[local263].setPriority(1);
			}
		}
		this.aBoolean503 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!bk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class211 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean503) {
						return;
					}
					if (this.aClass211_1 != null) {
						local16 = this.aClass211_1;
						this.aClass211_1 = this.aClass211_1.aClass211_3;
						if (this.aClass211_1 == null) {
							this.aClass211_2 = null;
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
				@Pc(45) int local45 = local16.anInt5747;
				if (local45 == 1) {
					if (aLong1324 > Class209.method4671()) {
						throw new IOException();
					}
					local16.anObject8 = new Socket(InetAddress.getByName((String) local16.anObject9), local16.anInt5749);
				} else if (local45 == 2) {
					@Pc(823) Thread local823 = new Thread((Runnable) local16.anObject9);
					local823.setDaemon(true);
					local823.start();
					local823.setPriority(local16.anInt5749);
					local16.anObject8 = local823;
				} else if (local45 == 4) {
					if (aLong1324 > Class209.method4671()) {
						throw new IOException();
					}
					local16.anObject8 = new DataInputStream(((URL) local16.anObject9).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local45 == 8) {
						local92 = (Object[]) local16.anObject9;
						if (((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local45 == 9) {
						local92 = (Object[]) local16.anObject9;
						if (((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else if (local45 == 18) {
						@Pc(156) Clipboard local156 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject8 = local156.getContents(null);
					} else if (local45 == 19) {
						@Pc(171) Transferable local171 = (Transferable) local16.anObject9;
						@Pc(174) Clipboard local174 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local174.setContents(local171, null);
					} else {
						@Pc(230) String local230;
						if (local45 == 3) {
							if (Class209.method4671() < aLong1324) {
								throw new IOException();
							}
							local230 = (local16.anInt5749 >> 24 & 0xFF) + "." + (local16.anInt5749 >> 16 & 0xFF) + "." + (local16.anInt5749 >> 8 & 0xFF) + "." + (local16.anInt5749 & 0xFF);
							local16.anObject8 = InetAddress.getByName(local230).getHostName();
						} else if (local45 == 5) {
							local16.anObject8 = this.aClass210_1.method4674();
						} else if (local45 == 6) {
							@Pc(249) Frame local249 = new Frame("Jagex Full Screen");
							local16.anObject8 = local249;
							local249.setResizable(false);
							this.aClass210_1.method4673(local16.anInt5746 >> 16, local16.anInt5749 & 0xFFFF, local16.anInt5749 >>> 16, local249, local16.anInt5746 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass210_1.method4672();
						} else if (local45 == 10) {
							@Pc(535) Class[] local535 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
							@Pc(537) Runtime local537 = Runtime.getRuntime();
							@Pc(547) Method local547;
							if (!aString213.startsWith("mac")) {
								local547 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local535);
								local547.setAccessible(true);
								local547.invoke(local537, local16.anObject9, "jawt");
								local547.setAccessible(false);
							}
							local547 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local535);
							local547.setAccessible(true);
							if (aString213.startsWith("linux") || aString213.startsWith("sunos")) {
								local547.invoke(local537, local16.anObject9, method4639("libgluegen-rt.so", this.aString206, this.anInt5739).toString());
								@Pc(614) Class local614 = ((Class) local16.anObject9).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
								local614.getMethod("begin").invoke(null);
								local547.invoke(local537, local16.anObject9, method4639("libjogl.so", this.aString206, this.anInt5739).toString());
								local614.getMethod("end").invoke(null);
								local547.invoke(local537, local16.anObject9, method4639("libjogl_awt.so", this.aString206, this.anInt5739).toString());
							} else if (aString213.startsWith("mac")) {
								local547.invoke(local537, local16.anObject9, method4639("libjogl.jnilib", this.aString206, this.anInt5739).toString());
								local547.invoke(local537, local16.anObject9, method4639("libjogl_awt.jnilib", this.aString206, this.anInt5739).toString());
							} else if (aString213.startsWith("win")) {
								local547.invoke(local537, local16.anObject9, method4639("jogl.dll", this.aString206, this.anInt5739).toString());
								local547.invoke(local537, local16.anObject9, method4639("jogl_awt.dll", this.aString206, this.anInt5739).toString());
							} else {
								throw new Exception();
							}
							local547.setAccessible(false);
						} else {
							@Pc(308) int local308;
							if (local45 == 11) {
								@Pc(295) Field local295 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local295.setAccessible(true);
								@Pc(306) Vector local306 = (Vector) local295.get(((Class) local16.anObject9).getClassLoader());
								for (local308 = 0; local308 < local306.size(); local308++) {
									@Pc(316) Object local316 = local306.elementAt(local308);
									@Pc(323) Method local323 = local316.getClass().getDeclaredMethod("finalize");
									local323.setAccessible(true);
									local323.invoke(local316);
									local323.setAccessible(false);
									@Pc(340) Field local340 = local316.getClass().getDeclaredField("handle");
									local340.setAccessible(true);
									local340.set(local316, Integer.valueOf(0));
									local340.setAccessible(false);
								}
								local295.setAccessible(false);
							} else if (local45 == 12) {
								local230 = (String) local16.anObject9;
								@Pc(370) Class208 local370 = method4637(local230);
								local16.anObject8 = local370;
							} else if (local45 == 14) {
								@Pc(512) int local512 = local16.anInt5749;
								@Pc(515) int local515 = local16.anInt5746;
								this.aClass205_1.method4630(local515, local512);
							} else if (local45 == 15) {
								@Pc(498) boolean local498 = local16.anInt5749 != 0;
								@Pc(502) Component local502 = (Component) local16.anObject9;
								this.aClass205_1.method4631(local498, local502);
							} else if (local45 == 17) {
								local92 = (Object[]) local16.anObject9;
								this.aClass205_1.method4629(local16.anInt5749, local16.anInt5746, (int[]) local92[1], (Point) local92[2], (Component) local92[0]);
							} else if (local45 == 16) {
								try {
									if (!aString213.startsWith("win")) {
										throw new Exception();
									}
									local230 = (String) local16.anObject9;
									if (!local230.startsWith("http://") && !local230.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(450) String local450 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local308 = 0; local308 < local230.length(); local308++) {
										if (local450.indexOf(local230.charAt(local308)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local230 + "\"");
									local16.anObject8 = null;
								} catch (@Pc(487) Exception local487) {
									local16.anObject8 = local487;
								}
							} else {
								throw new Exception();
							}
						}
					}
				}
				local16.anInt5748 = 1;
			} catch (@Pc(840) ThreadDeath local840) {
				throw local840;
			} catch (@Pc(843) Throwable local843) {
				local16.anInt5748 = 2;
			}
		}
	}
}
