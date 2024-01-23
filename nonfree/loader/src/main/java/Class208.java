import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
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

@OriginalClass("loader!jh")
public final class Class208 implements Runnable {

	@OriginalMember(owner = "loader!jh", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString198;

	@OriginalMember(owner = "loader!jh", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString200;

	@OriginalMember(owner = "loader!jh", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString201;

	@OriginalMember(owner = "loader!jh", name = "x", descriptor = "Ljava/lang/String;")
	private static String aString202;

	@OriginalMember(owner = "loader!jh", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString203;

	@OriginalMember(owner = "loader!jh", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString204;

	@OriginalMember(owner = "loader!jh", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString205;

	@OriginalMember(owner = "loader!jh", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod7;

	@OriginalMember(owner = "loader!jh", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod8;

	@OriginalMember(owner = "loader!jh", name = "d", descriptor = "I")
	private static int anInt5933 = 1;

	@OriginalMember(owner = "loader!jh", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!jh", name = "u", descriptor = "J")
	private static volatile long aLong1322 = 0L;

	@OriginalMember(owner = "loader!jh", name = "o", descriptor = "Lloader!dk;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "loader!jh", name = "i", descriptor = "Lloader!n;")
	private Class209 aClass209_1 = null;

	@OriginalMember(owner = "loader!jh", name = "q", descriptor = "Lloader!n;")
	private Class209 aClass209_3 = null;

	@OriginalMember(owner = "loader!jh", name = "n", descriptor = "Lloader!n;")
	private Class209 aClass209_2 = null;

	@OriginalMember(owner = "loader!jh", name = "z", descriptor = "Lloader!nc;")
	private Class210 aClass210_2 = null;

	@OriginalMember(owner = "loader!jh", name = "v", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!jh", name = "w", descriptor = "Z")
	private boolean aBoolean475 = false;

	@OriginalMember(owner = "loader!jh", name = "e", descriptor = "Lloader!nc;")
	private Class210 aClass210_1 = null;

	@OriginalMember(owner = "loader!jh", name = "f", descriptor = "I")
	private int anInt5934;

	@OriginalMember(owner = "loader!jh", name = "k", descriptor = "Ljava/lang/String;")
	private String aString199;

	@OriginalMember(owner = "loader!jh", name = "p", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!jh", name = "j", descriptor = "[Lloader!n;")
	private Class209[] aClass209Array1;

	@OriginalMember(owner = "loader!jh", name = "h", descriptor = "Lloader!c;")
	private Class205 aClass205_1;

	@OriginalMember(owner = "loader!jh", name = "A", descriptor = "Lloader!a;")
	private Class204 aClass204_1;

	@OriginalMember(owner = "loader!jh", name = "y", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!jh", name = "a", descriptor = "(ILjava/lang/String;)Lloader!n;")
	private static Class209 method4890(@OriginalArg(1) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString202, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
			@Pc(44) String local44 = local34[local36];
			if (local44.length() <= 0 || (new File(local44)).exists()) {
				try {
					return new Class209(new File(local44, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(77) Exception local77) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!jh", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)Ljava/io/File;")
	public static File method4893(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(9) File local9 = (File) aHashtable2.get(arg1);
		if (local9 != null) {
			return local9;
		}
		@Pc(48) String[] local48 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString202, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(80) int local80 = 0; local80 < local73.length; local80++) {
				for (@Pc(86) int local86 = 0; local86 < local48.length; local86++) {
					@Pc(96) RandomAccessFile local96 = null;
					@Pc(126) String local126 = local48[local86] + local73[local80] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					try {
						@Pc(131) File local131 = new File(local126);
						if (local75 != 0 || local131.exists()) {
							@Pc(145) String local145 = local48[local86];
							if (local75 != 1 || local145.length() <= 0 || (new File(local145)).exists()) {
								(new File(local48[local86] + local73[local80])).mkdir();
								if (arg0 != null) {
									(new File(local48[local86] + local73[local80] + "/" + arg0)).mkdir();
								}
								local96 = new RandomAccessFile(local131, "rw");
								@Pc(209) int local209 = local96.read();
								local96.seek(0L);
								local96.write(local209);
								local96.seek(0L);
								local96.close();
								aHashtable2.put(arg1, local131);
								return local131;
							}
						}
					} catch (@Pc(228) Exception local228) {
						try {
							if (local96 != null) {
								local96.close();
							}
						} catch (@Pc(237) Exception local237) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!jh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class208(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString203 = "1.1";
		aString200 = "Unknown";
		this.anApplet2 = arg0;
		this.anInt5934 = arg1;
		this.aString199 = arg2;
		try {
			aString200 = System.getProperty("java.vendor");
			aString203 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString205 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString205 = "Unknown";
		}
		aString201 = aString205.toLowerCase();
		try {
			aString204 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString204 = "";
		}
		try {
			aString198 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString198 = "";
		}
		try {
			aString202 = System.getProperty("user.home");
			if (aString202 != null) {
				aString202 = aString202 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString202 == null) {
			aString202 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
		}
		try {
			if (arg0 == null) {
				aMethod8 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod8 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		try {
			if (arg0 == null) {
				aMethod7 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod7 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass209_1 = new Class209(method4893(null, "random.dat", this.anInt5934), "rw", 25L);
		this.aClass209_2 = new Class209(method4893(this.aString199, "main_file_cache.dat2", this.anInt5934), "rw", 104857600L);
		this.aClass209_3 = new Class209(method4893(this.aString199, "main_file_cache.idx255", this.anInt5934), "rw", 1048576L);
		this.aClass209Array1 = new Class209[arg3];
		for (@Pc(200) int local200 = 0; local200 < arg3; local200++) {
			this.aClass209Array1[local200] = new Class209(method4893(this.aString199, "main_file_cache.idx" + local200, this.anInt5934), "rw", 1048576L);
		}
		try {
			this.aClass205_1 = new Class205();
		} catch (@Pc(239) Throwable local239) {
		}
		try {
			this.aClass204_1 = new Class204();
		} catch (@Pc(246) Throwable local246) {
		}
		@Pc(249) Thread[] local249 = new Thread[1000];
		@Pc(252) ThreadGroup local252 = Thread.currentThread().getThreadGroup();
		for (@Pc(255) ThreadGroup local255 = local252.getParent(); local255 != null; local255 = local255.getParent()) {
			local252 = local255;
		}
		local252.enumerate(local249);
		for (@Pc(269) int local269 = 0; local269 < local249.length; local269++) {
			if (local249[local269] != null && local249[local269].getName().startsWith("AWT")) {
				local249[local269].setPriority(1);
			}
		}
		this.aBoolean475 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!jh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class210 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean475) {
						return;
					}
					if (this.aClass210_1 != null) {
						local17 = this.aClass210_1;
						this.aClass210_1 = this.aClass210_1.aClass210_3;
						if (this.aClass210_1 == null) {
							this.aClass210_2 = null;
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
				@Pc(47) int local47 = local17.anInt5941;
				if (local47 == 1) {
					if (Class211.method4913() < aLong1322) {
						throw new IOException();
					}
					local17.anObject9 = new Socket(InetAddress.getByName((String) local17.anObject8), local17.anInt5942);
				} else if (local47 == 2) {
					@Pc(62) Thread local62 = new Thread((Runnable) local17.anObject8);
					local62.setDaemon(true);
					local62.start();
					local62.setPriority(local17.anInt5942);
					local17.anObject9 = local62;
				} else if (local47 == 4) {
					if (Class211.method4913() < aLong1322) {
						throw new IOException();
					}
					local17.anObject9 = new DataInputStream(((URL) local17.anObject8).openStream());
				} else {
					@Pc(244) Object[] local244;
					if (local47 == 8) {
						local244 = (Object[]) local17.anObject8;
						if (((Class) local244[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject9 = ((Class) local244[0]).getDeclaredMethod((String) local244[1], (Class[]) local244[2]);
					} else if (local47 == 9) {
						local244 = (Object[]) local17.anObject8;
						if (((Class) local244[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject9 = ((Class) local244[0]).getDeclaredField((String) local244[1]);
					} else {
						@Pc(140) String local140;
						if (local47 == 3) {
							if (aLong1322 > Class211.method4913()) {
								throw new IOException();
							}
							local140 = (local17.anInt5942 >> 24 & 0xFF) + "." + (local17.anInt5942 >> 16 & 0xFF) + "." + (local17.anInt5942 >> 8 & 0xFF) + "." + (local17.anInt5942 & 0xFF);
							local17.anObject9 = InetAddress.getByName(local140).getHostName();
						} else if (local47 == 5) {
							local17.anObject9 = this.aClass205_1.method4867();
						} else if (local47 == 6) {
							@Pc(161) Frame local161 = new Frame("Jagex Full Screen");
							local17.anObject9 = local161;
							local161.setResizable(false);
							this.aClass205_1.method4868(local161, local17.anInt5942 & 0xFFFF, local17.anInt5940 & 0xFFFF, local17.anInt5942 >>> 16, local17.anInt5940 >> 16);
						} else if (local47 == 7) {
							this.aClass205_1.method4866();
						} else if (local47 == 10) {
							@Pc(452) Class[] local452 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
							@Pc(454) Runtime local454 = Runtime.getRuntime();
							@Pc(464) Method local464;
							if (!aString201.startsWith("mac")) {
								local464 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local452);
								local464.setAccessible(true);
								local464.invoke(local454, local17.anObject8, "jawt");
								local464.setAccessible(false);
							}
							local464 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local452);
							local464.setAccessible(true);
							if (aString201.startsWith("linux") || aString201.startsWith("sunos")) {
								local464.invoke(local454, local17.anObject8, method4893(this.aString199, "libgluegen-rt.so", this.anInt5934).toString());
								@Pc(633) Class local633 = ((Class) local17.anObject8).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
								local633.getMethod("begin").invoke(null);
								local464.invoke(local454, local17.anObject8, method4893(this.aString199, "libjogl.so", this.anInt5934).toString());
								local633.getMethod("end").invoke(null);
								local464.invoke(local454, local17.anObject8, method4893(this.aString199, "libjogl_awt.so", this.anInt5934).toString());
							} else if (aString201.startsWith("mac")) {
								local464.invoke(local454, local17.anObject8, method4893(this.aString199, "libjogl.jnilib", this.anInt5934).toString());
								local464.invoke(local454, local17.anObject8, method4893(this.aString199, "libjogl_awt.jnilib", this.anInt5934).toString());
							} else if (aString201.startsWith("win")) {
								local464.invoke(local454, local17.anObject8, method4893(this.aString199, "jogl.dll", this.anInt5934).toString());
								local464.invoke(local454, local17.anObject8, method4893(this.aString199, "jogl_awt.dll", this.anInt5934).toString());
							} else {
								throw new Exception();
							}
							local464.setAccessible(false);
						} else {
							@Pc(304) int local304;
							if (local47 == 11) {
								@Pc(375) Field local375 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local375.setAccessible(true);
								@Pc(386) Vector local386 = (Vector) local375.get(((Class) local17.anObject8).getClassLoader());
								for (local304 = 0; local304 < local386.size(); local304++) {
									@Pc(396) Object local396 = local386.elementAt(local304);
									@Pc(403) Method local403 = local396.getClass().getDeclaredMethod("finalize");
									local403.setAccessible(true);
									local403.invoke(local396);
									local403.setAccessible(false);
									@Pc(420) Field local420 = local396.getClass().getDeclaredField("handle");
									local420.setAccessible(true);
									local420.set(local396, Integer.valueOf(0));
									local420.setAccessible(false);
								}
								local375.setAccessible(false);
							} else if (local47 == 12) {
								local140 = (String) local17.anObject8;
								@Pc(366) Class209 local366 = method4890(local140);
								local17.anObject9 = local366;
							} else if (local47 == 14) {
								@Pc(348) int local348 = local17.anInt5942;
								@Pc(351) int local351 = local17.anInt5940;
								this.aClass204_1.method4859(local348, local351);
							} else if (local47 == 15) {
								@Pc(223) boolean local223 = local17.anInt5942 != 0;
								@Pc(227) Component local227 = (Component) local17.anObject8;
								this.aClass204_1.method4858(local223, local227);
							} else if (local47 == 17) {
								local244 = (Object[]) local17.anObject8;
								this.aClass204_1.method4857((Component) local244[0], local17.anInt5940, (Point) local244[2], local17.anInt5942, (int[]) local244[1]);
							} else if (local47 == 16) {
								try {
									if (!aString201.startsWith("win")) {
										throw new Exception();
									}
									local140 = (String) local17.anObject8;
									if (!local140.startsWith("http://") && !local140.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(302) String local302 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local304 = 0; local304 < local140.length(); local304++) {
										if (local302.indexOf(local140.charAt(local304)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local140 + "\"");
									local17.anObject9 = null;
								} catch (@Pc(341) Exception local341) {
									local17.anObject9 = local341;
								}
							} else {
								throw new Exception();
							}
						}
					}
				}
				local17.anInt5939 = 1;
			} catch (@Pc(824) ThreadDeath local824) {
				throw local824;
			} catch (@Pc(827) Throwable local827) {
				local17.anInt5939 = 2;
			}
		}
	}
}
