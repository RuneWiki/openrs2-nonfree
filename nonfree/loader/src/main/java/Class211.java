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

@OriginalClass("loader!vl")
public final class Class211 implements Runnable {

	@OriginalMember(owner = "loader!vl", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString309;

	@OriginalMember(owner = "loader!vl", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString310;

	@OriginalMember(owner = "loader!vl", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString311;

	@OriginalMember(owner = "loader!vl", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString312;

	@OriginalMember(owner = "loader!vl", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString313;

	@OriginalMember(owner = "loader!vl", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString315;

	@OriginalMember(owner = "loader!vl", name = "y", descriptor = "Ljava/lang/String;")
	private static String aString316;

	@OriginalMember(owner = "loader!vl", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod7;

	@OriginalMember(owner = "loader!vl", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod8;

	@OriginalMember(owner = "loader!vl", name = "e", descriptor = "I")
	private static int anInt6238 = 1;

	@OriginalMember(owner = "loader!vl", name = "x", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!vl", name = "t", descriptor = "J")
	private static volatile long aLong1440 = 0L;

	@OriginalMember(owner = "loader!vl", name = "a", descriptor = "Lloader!pb;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "loader!vl", name = "c", descriptor = "Lloader!ch;")
	private Class206 aClass206_2 = null;

	@OriginalMember(owner = "loader!vl", name = "w", descriptor = "Lloader!ch;")
	private Class206 aClass206_3 = null;

	@OriginalMember(owner = "loader!vl", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!vl", name = "n", descriptor = "Lloader!mc;")
	private Class210 aClass210_2 = null;

	@OriginalMember(owner = "loader!vl", name = "k", descriptor = "Z")
	private boolean aBoolean520 = false;

	@OriginalMember(owner = "loader!vl", name = "r", descriptor = "Lloader!mc;")
	private Class210 aClass210_1 = null;

	@OriginalMember(owner = "loader!vl", name = "d", descriptor = "Lloader!mc;")
	private Class210 aClass210_3 = null;

	@OriginalMember(owner = "loader!vl", name = "o", descriptor = "I")
	private int anInt6239;

	@OriginalMember(owner = "loader!vl", name = "i", descriptor = "Ljava/lang/String;")
	private String aString314;

	@OriginalMember(owner = "loader!vl", name = "j", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!vl", name = "l", descriptor = "[Lloader!mc;")
	private Class210[] aClass210Array1;

	@OriginalMember(owner = "loader!vl", name = "A", descriptor = "Lloader!f;")
	private Class209 aClass209_1;

	@OriginalMember(owner = "loader!vl", name = "z", descriptor = "Lloader!d;")
	private Class207 aClass207_1;

	@OriginalMember(owner = "loader!vl", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!vl", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!mc;")
	private static Class210 method5292(@OriginalArg(0) String arg0) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", aString316, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
			@Pc(44) String local44 = local34[local36];
			if (local44.length() <= 0 || (new File(local44)).exists()) {
				try {
					return new Class210(new File(local44, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(79) Exception local79) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!vl", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)Ljava/io/File;")
	public static File method5299(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString316, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(82) int local82 = 0; local82 < local75.length; local82++) {
				for (@Pc(88) int local88 = 0; local88 < local50.length; local88++) {
					@Pc(94) RandomAccessFile local94 = null;
					@Pc(124) String local124 = local50[local88] + local75[local82] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					try {
						@Pc(129) File local129 = new File(local124);
						if (local77 != 0 || local129.exists()) {
							@Pc(142) String local142 = local50[local88];
							if (local77 != 1 || local142.length() <= 0 || (new File(local142)).exists()) {
								(new File(local50[local88] + local75[local82])).mkdir();
								if (arg0 != null) {
									(new File(local50[local88] + local75[local82] + "/" + arg0)).mkdir();
								}
								local94 = new RandomAccessFile(local129, "rw");
								@Pc(211) int local211 = local94.read();
								local94.seek(0L);
								local94.write(local211);
								local94.seek(0L);
								local94.close();
								aHashtable2.put(arg2, local129);
								return local129;
							}
						}
					} catch (@Pc(230) Exception local230) {
						try {
							if (local94 != null) {
								local94.close();
							}
						} catch (@Pc(239) Exception local239) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!vl", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class211(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt6239 = arg1;
		this.aString314 = arg2;
		this.anApplet3 = arg0;
		aString311 = "1.1";
		aString313 = "Unknown";
		try {
			aString313 = System.getProperty("java.vendor");
			aString311 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString312 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString312 = "Unknown";
		}
		aString309 = aString312.toLowerCase();
		try {
			aString310 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString310 = "";
		}
		try {
			aString315 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString315 = "";
		}
		try {
			aString316 = System.getProperty("user.home");
			if (aString316 != null) {
				aString316 = aString316 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString316 == null) {
			aString316 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
		}
		try {
			if (arg0 == null) {
				aMethod7 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod7 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		try {
			if (arg0 == null) {
				aMethod8 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod8 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(154) Exception local154) {
		}
		this.aClass210_3 = new Class210(method5299(null, this.anInt6239, "random.dat"), "rw", 25L);
		this.aClass210_1 = new Class210(method5299(this.aString314, this.anInt6239, "main_file_cache.dat2"), "rw", 104857600L);
		this.aClass210_2 = new Class210(method5299(this.aString314, this.anInt6239, "main_file_cache.idx255"), "rw", 1048576L);
		this.aClass210Array1 = new Class210[arg3];
		for (@Pc(201) int local201 = 0; local201 < arg3; local201++) {
			this.aClass210Array1[local201] = new Class210(method5299(this.aString314, this.anInt6239, "main_file_cache.idx" + local201), "rw", 1048576L);
		}
		try {
			this.aClass209_1 = new Class209();
		} catch (@Pc(240) Throwable local240) {
		}
		try {
			this.aClass207_1 = new Class207();
		} catch (@Pc(247) Throwable local247) {
		}
		@Pc(250) ThreadGroup local250 = Thread.currentThread().getThreadGroup();
		for (@Pc(253) ThreadGroup local253 = local250.getParent(); local253 != null; local253 = local253.getParent()) {
			local250 = local253;
		}
		@Pc(264) Thread[] local264 = new Thread[1000];
		local250.enumerate(local264);
		for (@Pc(270) int local270 = 0; local270 < local264.length; local270++) {
			if (local264[local270] != null && local264[local270].getName().startsWith("AWT")) {
				local264[local270].setPriority(1);
			}
		}
		this.aBoolean520 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!vl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class206 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean520) {
						return;
					}
					if (this.aClass206_3 != null) {
						local16 = this.aClass206_3;
						this.aClass206_3 = this.aClass206_3.aClass206_1;
						if (this.aClass206_3 == null) {
							this.aClass206_2 = null;
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
				@Pc(46) int local46 = local16.anInt6227;
				if (local46 == 1) {
					if (Class204.method5253() < aLong1440) {
						throw new IOException();
					}
					local16.anObject8 = new Socket(InetAddress.getByName((String) local16.anObject9), local16.anInt6228);
				} else if (local46 == 2) {
					@Pc(82) Thread local82 = new Thread((Runnable) local16.anObject9);
					local82.setDaemon(true);
					local82.start();
					local82.setPriority(local16.anInt6228);
					local16.anObject8 = local82;
				} else if (local46 == 4) {
					if (aLong1440 > Class204.method5253()) {
						throw new IOException();
					}
					local16.anObject8 = new DataInputStream(((URL) local16.anObject9).openStream());
				} else {
					@Pc(375) Object[] local375;
					if (local46 == 8) {
						local375 = (Object[]) local16.anObject9;
						if (((Class) local375[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local375[0]).getDeclaredMethod((String) local375[1], (Class[]) local375[2]);
					} else if (local46 == 9) {
						local375 = (Object[]) local16.anObject9;
						if (((Class) local375[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local375[0]).getDeclaredField((String) local375[1]);
					} else {
						@Pc(161) String local161;
						if (local46 == 3) {
							if (Class204.method5253() < aLong1440) {
								throw new IOException();
							}
							local161 = (local16.anInt6228 >> 24 & 0xFF) + "." + (local16.anInt6228 >> 16 & 0xFF) + "." + (local16.anInt6228 >> 8 & 0xFF) + "." + (local16.anInt6228 & 0xFF);
							local16.anObject8 = InetAddress.getByName(local161).getHostName();
						} else if (local46 == 5) {
							local16.anObject8 = this.aClass209_1.method5258();
						} else if (local46 == 6) {
							@Pc(696) Frame local696 = new Frame("Jagex Full Screen");
							local16.anObject8 = local696;
							local696.setResizable(false);
							this.aClass209_1.method5257(local16.anInt6225 & 0xFFFF, local16.anInt6228 & 0xFFFF, local16.anInt6228 >>> 16, local16.anInt6225 >> 16, local696);
						} else if (local46 == 7) {
							this.aClass209_1.method5260();
						} else if (local46 == 10) {
							@Pc(435) Class[] local435 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
							@Pc(437) Runtime local437 = Runtime.getRuntime();
							@Pc(448) Method local448;
							if (!aString309.startsWith("mac")) {
								local448 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local435);
								local448.setAccessible(true);
								local448.invoke(local437, local16.anObject9, "jawt");
								local448.setAccessible(false);
							}
							local448 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local435);
							local448.setAccessible(true);
							if (aString309.startsWith("linux") || aString309.startsWith("sunos")) {
								local448.invoke(local437, local16.anObject9, method5299(this.aString314, this.anInt6239, "libgluegen-rt.so").toString());
								@Pc(515) Class local515 = ((Class) local16.anObject9).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
								local515.getMethod("begin").invoke(null);
								local448.invoke(local437, local16.anObject9, method5299(this.aString314, this.anInt6239, "libjogl.so").toString());
								local515.getMethod("end").invoke(null);
								local448.invoke(local437, local16.anObject9, method5299(this.aString314, this.anInt6239, "libjogl_awt.so").toString());
							} else if (aString309.startsWith("mac")) {
								local448.invoke(local437, local16.anObject9, method5299(this.aString314, this.anInt6239, "libjogl.jnilib").toString());
								local448.invoke(local437, local16.anObject9, method5299(this.aString314, this.anInt6239, "libjogl_awt.jnilib").toString());
							} else if (aString309.startsWith("win")) {
								local448.invoke(local437, local16.anObject9, method5299(this.aString314, this.anInt6239, "jogl.dll").toString());
								local448.invoke(local437, local16.anObject9, method5299(this.aString314, this.anInt6239, "jogl_awt.dll").toString());
							} else {
								throw new Exception();
							}
							local448.setAccessible(false);
						} else {
							@Pc(206) int local206;
							if (local46 == 11) {
								@Pc(193) Field local193 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local193.setAccessible(true);
								@Pc(204) Vector local204 = (Vector) local193.get(((Class) local16.anObject9).getClassLoader());
								for (local206 = 0; local206 < local204.size(); local206++) {
									@Pc(214) Object local214 = local204.elementAt(local206);
									@Pc(221) Method local221 = local214.getClass().getDeclaredMethod("finalize");
									local221.setAccessible(true);
									local221.invoke(local214);
									local221.setAccessible(false);
									@Pc(238) Field local238 = local214.getClass().getDeclaredField("handle");
									local238.setAccessible(true);
									local238.set(local214, Integer.valueOf(0));
									local238.setAccessible(false);
								}
								local193.setAccessible(false);
							} else if (local46 == 12) {
								local161 = (String) local16.anObject9;
								@Pc(418) Class210 local418 = method5292(local161);
								local16.anObject8 = local418;
							} else if (local46 == 14) {
								@Pc(400) int local400 = local16.anInt6228;
								@Pc(403) int local403 = local16.anInt6225;
								this.aClass207_1.method5255(local400, local403);
							} else if (local46 == 15) {
								@Pc(277) boolean local277 = local16.anInt6228 != 0;
								@Pc(281) Component local281 = (Component) local16.anObject9;
								this.aClass207_1.method5256(local277, local281);
							} else if (local46 == 17) {
								local375 = (Object[]) local16.anObject9;
								this.aClass207_1.method5254(local16.anInt6225, (int[]) local375[1], local16.anInt6228, (Point) local375[2], (Component) local375[0]);
							} else if (local46 == 16) {
								try {
									if (!aString309.startsWith("win")) {
										throw new Exception();
									}
									local161 = (String) local16.anObject9;
									if (!local161.startsWith("http://") && !local161.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(329) String local329 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local206 = 0; local161.length() > local206; local206++) {
										if (local329.indexOf(local161.charAt(local206)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local161 + "\"");
									local16.anObject8 = null;
								} catch (@Pc(366) Exception local366) {
									local16.anObject8 = local366;
								}
							} else {
								throw new Exception();
							}
						}
					}
				}
				local16.anInt6226 = 1;
			} catch (@Pc(818) ThreadDeath local818) {
				throw local818;
			} catch (@Pc(821) Throwable local821) {
				local16.anInt6226 = 2;
			}
		}
	}
}
