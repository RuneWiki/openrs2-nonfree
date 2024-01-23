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

@OriginalClass("loader!wa")
public final class Class210 implements Runnable {

	@OriginalMember(owner = "loader!wa", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString342;

	@OriginalMember(owner = "loader!wa", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString344;

	@OriginalMember(owner = "loader!wa", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString345;

	@OriginalMember(owner = "loader!wa", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString346;

	@OriginalMember(owner = "loader!wa", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString347;

	@OriginalMember(owner = "loader!wa", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString348;

	@OriginalMember(owner = "loader!wa", name = "z", descriptor = "Ljava/lang/String;")
	private static String aString349;

	@OriginalMember(owner = "loader!wa", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod7;

	@OriginalMember(owner = "loader!wa", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod8;

	@OriginalMember(owner = "loader!wa", name = "e", descriptor = "I")
	private static int anInt5665 = 1;

	@OriginalMember(owner = "loader!wa", name = "n", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!wa", name = "s", descriptor = "J")
	private static volatile long aLong1327 = 0L;

	@OriginalMember(owner = "loader!wa", name = "w", descriptor = "Lloader!ub;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "loader!wa", name = "d", descriptor = "Lloader!o;")
	private Class209 aClass209_2 = null;

	@OriginalMember(owner = "loader!wa", name = "g", descriptor = "Lloader!nn;")
	private Class208 aClass208_1 = null;

	@OriginalMember(owner = "loader!wa", name = "u", descriptor = "Lloader!nn;")
	private Class208 aClass208_2 = null;

	@OriginalMember(owner = "loader!wa", name = "A", descriptor = "Lloader!o;")
	private Class209 aClass209_3 = null;

	@OriginalMember(owner = "loader!wa", name = "j", descriptor = "Z")
	private boolean aBoolean479 = false;

	@OriginalMember(owner = "loader!wa", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!wa", name = "h", descriptor = "Lloader!nn;")
	private Class208 aClass208_3 = null;

	@OriginalMember(owner = "loader!wa", name = "x", descriptor = "I")
	private int anInt5664;

	@OriginalMember(owner = "loader!wa", name = "m", descriptor = "Ljava/lang/String;")
	private String aString343;

	@OriginalMember(owner = "loader!wa", name = "l", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!wa", name = "i", descriptor = "[Lloader!nn;")
	private Class208[] aClass208Array1;

	@OriginalMember(owner = "loader!wa", name = "q", descriptor = "Lloader!f;")
	private Class207 aClass207_1;

	@OriginalMember(owner = "loader!wa", name = "b", descriptor = "Lloader!e;")
	private Class206 aClass206_1;

	@OriginalMember(owner = "loader!wa", name = "y", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!wa", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!nn;")
	private static Class208 method4819(@OriginalArg(0) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString349, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(42) int local42 = 0; local42 < local34.length; local42++) {
			@Pc(54) String local54 = local34[local42];
			if (local54.length() <= 0 || (new File(local54)).exists()) {
				try {
					return new Class208(new File(local54, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(89) Exception local89) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!wa", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method4820(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(10) File local10 = (File) aHashtable2.get(arg2);
		if (local10 != null) {
			return local10;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString349, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(84) int local84 = 0; local84 < local75.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local50.length; local90++) {
					@Pc(125) String local125 = local50[local90] + local75[local84] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(127) RandomAccessFile local127 = null;
					try {
						@Pc(132) File local132 = new File(local125);
						if (local77 != 0 || local132.exists()) {
							@Pc(143) String local143 = local50[local90];
							if (local77 != 1 || local143.length() <= 0 || (new File(local143)).exists()) {
								(new File(local50[local90] + local75[local84])).mkdir();
								if (arg1 != null) {
									(new File(local50[local90] + local75[local84] + "/" + arg1)).mkdir();
								}
								local127 = new RandomAccessFile(local132, "rw");
								@Pc(212) int local212 = local127.read();
								local127.seek(0L);
								local127.write(local212);
								local127.seek(0L);
								local127.close();
								aHashtable2.put(arg2, local132);
								return local132;
							}
						}
					} catch (@Pc(231) Exception local231) {
						try {
							if (local127 != null) {
								local127.close();
							}
						} catch (@Pc(240) Exception local240) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!wa", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class210(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString347 = "Unknown";
		this.anInt5664 = arg1;
		this.anApplet3 = arg0;
		this.aString343 = arg2;
		aString346 = "1.1";
		try {
			aString347 = System.getProperty("java.vendor");
			aString346 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString345 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString345 = "Unknown";
		}
		aString342 = aString345.toLowerCase();
		try {
			aString348 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString348 = "";
		}
		try {
			aString344 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString344 = "";
		}
		try {
			aString349 = System.getProperty("user.home");
			if (aString349 != null) {
				aString349 = aString349 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString349 == null) {
			aString349 = "~/";
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
		} catch (@Pc(126) Exception local126) {
		}
		try {
			if (arg0 == null) {
				aMethod7 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod7 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(154) Exception local154) {
		}
		this.aClass208_3 = new Class208(method4820(this.anInt5664, null, "random.dat"), "rw", 25L);
		this.aClass208_2 = new Class208(method4820(this.anInt5664, this.aString343, "main_file_cache.dat2"), "rw", 104857600L);
		this.aClass208_1 = new Class208(method4820(this.anInt5664, this.aString343, "main_file_cache.idx255"), "rw", 1048576L);
		this.aClass208Array1 = new Class208[arg3];
		for (@Pc(201) int local201 = 0; local201 < arg3; local201++) {
			this.aClass208Array1[local201] = new Class208(method4820(this.anInt5664, this.aString343, "main_file_cache.idx" + local201), "rw", 1048576L);
		}
		try {
			this.aClass207_1 = new Class207();
		} catch (@Pc(240) Throwable local240) {
		}
		try {
			this.aClass206_1 = new Class206();
		} catch (@Pc(247) Throwable local247) {
		}
		@Pc(250) ThreadGroup local250 = Thread.currentThread().getThreadGroup();
		@Pc(253) Thread[] local253 = new Thread[1000];
		for (@Pc(256) ThreadGroup local256 = local250.getParent(); local256 != null; local256 = local256.getParent()) {
			local250 = local256;
		}
		local250.enumerate(local253);
		for (@Pc(271) int local271 = 0; local271 < local253.length; local271++) {
			if (local253[local271] != null && local253[local271].getName().startsWith("AWT")) {
				local253[local271].setPriority(1);
			}
		}
		this.aBoolean479 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!wa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class209 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean479) {
						return;
					}
					if (this.aClass209_3 != null) {
						local16 = this.aClass209_3;
						this.aClass209_3 = this.aClass209_3.aClass209_1;
						if (this.aClass209_3 == null) {
							this.aClass209_2 = null;
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
				@Pc(45) int local45 = local16.anInt5663;
				if (local45 == 1) {
					if (Class211.method4828() < aLong1327) {
						throw new IOException();
					}
					local16.anObject8 = new Socket(InetAddress.getByName((String) local16.anObject9), local16.anInt5662);
				} else if (local45 == 2) {
					@Pc(86) Thread local86 = new Thread((Runnable) local16.anObject9);
					local86.setDaemon(true);
					local86.start();
					local86.setPriority(local16.anInt5662);
					local16.anObject8 = local86;
				} else if (local45 == 4) {
					if (Class211.method4828() < aLong1327) {
						throw new IOException();
					}
					local16.anObject8 = new DataInputStream(((URL) local16.anObject9).openStream());
				} else {
					@Pc(699) Object[] local699;
					if (local45 == 8) {
						local699 = (Object[]) local16.anObject9;
						if (((Class) local699[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local699[0]).getDeclaredMethod((String) local699[1], (Class[]) local699[2]);
					} else if (local45 == 9) {
						local699 = (Object[]) local16.anObject9;
						if (((Class) local699[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local699[0]).getDeclaredField((String) local699[1]);
					} else {
						@Pc(182) String local182;
						if (local45 == 3) {
							if (Class211.method4828() < aLong1327) {
								throw new IOException();
							}
							local182 = (local16.anInt5662 >> 24 & 0xFF) + "." + (local16.anInt5662 >> 16 & 0xFF) + "." + (local16.anInt5662 >> 8 & 0xFF) + "." + (local16.anInt5662 & 0xFF);
							local16.anObject8 = InetAddress.getByName(local182).getHostName();
						} else if (local45 == 5) {
							local16.anObject8 = this.aClass207_1.method4780();
						} else if (local45 == 6) {
							@Pc(206) Frame local206 = new Frame("Jagex Full Screen");
							local16.anObject8 = local206;
							local206.setResizable(false);
							this.aClass207_1.method4779(local206, local16.anInt5662 >>> 16, local16.anInt5660 & 0xFFFF, local16.anInt5662 & 0xFFFF, local16.anInt5660 >> 16);
						} else if (local45 == 7) {
							this.aClass207_1.method4781();
						} else if (local45 == 10) {
							@Pc(260) Class[] local260 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
							@Pc(262) Runtime local262 = Runtime.getRuntime();
							@Pc(273) Method local273;
							if (!aString342.startsWith("mac")) {
								local273 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local260);
								local273.setAccessible(true);
								local273.invoke(local262, local16.anObject9, "jawt");
								local273.setAccessible(false);
							}
							local273 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local260);
							local273.setAccessible(true);
							if (aString342.startsWith("linux") || aString342.startsWith("sunos")) {
								local273.invoke(local262, local16.anObject9, method4820(this.anInt5664, this.aString343, "libgluegen-rt.so").toString());
								@Pc(442) Class local442 = ((Class) local16.anObject9).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
								local442.getMethod("begin").invoke(null);
								local273.invoke(local262, local16.anObject9, method4820(this.anInt5664, this.aString343, "libjogl.so").toString());
								local442.getMethod("end").invoke(null);
								local273.invoke(local262, local16.anObject9, method4820(this.anInt5664, this.aString343, "libjogl_awt.so").toString());
							} else if (aString342.startsWith("mac")) {
								local273.invoke(local262, local16.anObject9, method4820(this.anInt5664, this.aString343, "libjogl.jnilib").toString());
								local273.invoke(local262, local16.anObject9, method4820(this.anInt5664, this.aString343, "libjogl_awt.jnilib").toString());
							} else if (aString342.startsWith("win")) {
								local273.invoke(local262, local16.anObject9, method4820(this.anInt5664, this.aString343, "jogl.dll").toString());
								local273.invoke(local262, local16.anObject9, method4820(this.anInt5664, this.aString343, "jogl_awt.dll").toString());
							} else {
								throw new Exception();
							}
							local273.setAccessible(false);
						} else {
							@Pc(533) int local533;
							if (local45 == 11) {
								@Pc(520) Field local520 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local520.setAccessible(true);
								@Pc(531) Vector local531 = (Vector) local520.get(((Class) local16.anObject9).getClassLoader());
								for (local533 = 0; local531.size() > local533; local533++) {
									@Pc(541) Object local541 = local531.elementAt(local533);
									@Pc(548) Method local548 = local541.getClass().getDeclaredMethod("finalize");
									local548.setAccessible(true);
									local548.invoke(local541);
									local548.setAccessible(false);
									@Pc(565) Field local565 = local541.getClass().getDeclaredField("handle");
									local565.setAccessible(true);
									local565.set(local541, Integer.valueOf(0));
									local565.setAccessible(false);
								}
								local520.setAccessible(false);
							} else if (local45 == 12) {
								local182 = (String) local16.anObject9;
								@Pc(747) Class208 local747 = method4819(local182);
								local16.anObject8 = local747;
							} else if (local45 == 14) {
								@Pc(593) int local593 = local16.anInt5660;
								@Pc(596) int local596 = local16.anInt5662;
								this.aClass206_1.method4775(local596, local593);
							} else if (local45 == 15) {
								@Pc(725) Component local725 = (Component) local16.anObject9;
								@Pc(732) boolean local732 = local16.anInt5662 != 0;
								this.aClass206_1.method4777(local725, local732);
							} else if (local45 == 17) {
								local699 = (Object[]) local16.anObject9;
								this.aClass206_1.method4776((Point) local699[2], local16.anInt5662, local16.anInt5660, (int[]) local699[1], (Component) local699[0]);
							} else if (local45 == 16) {
								try {
									if (!aString342.startsWith("win")) {
										throw new Exception();
									}
									local182 = (String) local16.anObject9;
									if (!local182.startsWith("http://") && !local182.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(648) String local648 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local533 = 0; local533 < local182.length(); local533++) {
										if (local648.indexOf(local182.charAt(local533)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local182 + "\"");
									local16.anObject8 = null;
								} catch (@Pc(690) Exception local690) {
									local16.anObject8 = local690;
								}
							} else {
								throw new Exception();
							}
						}
					}
				}
				local16.anInt5661 = 1;
			} catch (@Pc(814) ThreadDeath local814) {
				throw local814;
			} catch (@Pc(817) Throwable local817) {
				local16.anInt5661 = 2;
			}
		}
	}
}
