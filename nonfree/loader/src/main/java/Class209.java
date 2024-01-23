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

@OriginalClass("loader!gn")
public final class Class209 implements Runnable {

	@OriginalMember(owner = "loader!gn", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString206;

	@OriginalMember(owner = "loader!gn", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString208;

	@OriginalMember(owner = "loader!gn", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString209;

	@OriginalMember(owner = "loader!gn", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString210;

	@OriginalMember(owner = "loader!gn", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString211;

	@OriginalMember(owner = "loader!gn", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString212;

	@OriginalMember(owner = "loader!gn", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString213;

	@OriginalMember(owner = "loader!gn", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod7;

	@OriginalMember(owner = "loader!gn", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod8;

	@OriginalMember(owner = "loader!gn", name = "b", descriptor = "I")
	private static int anInt6255 = 1;

	@OriginalMember(owner = "loader!gn", name = "k", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!gn", name = "s", descriptor = "J")
	private static volatile long aLong1323 = 0L;

	@OriginalMember(owner = "loader!gn", name = "p", descriptor = "Lloader!pk;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "loader!gn", name = "j", descriptor = "Z")
	private boolean aBoolean369 = false;

	@OriginalMember(owner = "loader!gn", name = "m", descriptor = "Lloader!ma;")
	private Class210 aClass210_1 = null;

	@OriginalMember(owner = "loader!gn", name = "i", descriptor = "Lloader!ma;")
	private Class210 aClass210_3 = null;

	@OriginalMember(owner = "loader!gn", name = "z", descriptor = "Lloader!ea;")
	private Class207 aClass207_3 = null;

	@OriginalMember(owner = "loader!gn", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!gn", name = "v", descriptor = "Lloader!ma;")
	private Class210 aClass210_2 = null;

	@OriginalMember(owner = "loader!gn", name = "w", descriptor = "Lloader!ea;")
	private Class207 aClass207_2 = null;

	@OriginalMember(owner = "loader!gn", name = "d", descriptor = "Ljava/lang/String;")
	private String aString207;

	@OriginalMember(owner = "loader!gn", name = "y", descriptor = "I")
	private int anInt6256;

	@OriginalMember(owner = "loader!gn", name = "q", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!gn", name = "f", descriptor = "[Lloader!ma;")
	private Class210[] aClass210Array1;

	@OriginalMember(owner = "loader!gn", name = "g", descriptor = "Lloader!b;")
	private Class205 aClass205_1;

	@OriginalMember(owner = "loader!gn", name = "x", descriptor = "Lloader!d;")
	private Class206 aClass206_1;

	@OriginalMember(owner = "loader!gn", name = "A", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!gn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	public static File method5185(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString208, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(77) int local77 = 0; local77 < local70.length; local77++) {
				for (@Pc(87) int local87 = 0; local87 < local45.length; local87++) {
					@Pc(125) String local125 = local45[local87] + local70[local77] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(127) RandomAccessFile local127 = null;
					try {
						@Pc(132) File local132 = new File(local125);
						if (local72 != 0 || local132.exists()) {
							@Pc(143) String local143 = local45[local87];
							if (local72 != 1 || local143.length() <= 0 || (new File(local143)).exists()) {
								(new File(local45[local87] + local70[local77])).mkdir();
								if (arg1 != null) {
									(new File(local45[local87] + local70[local77] + "/" + arg1)).mkdir();
								}
								local127 = new RandomAccessFile(local132, "rw");
								@Pc(208) int local208 = local127.read();
								local127.seek(0L);
								local127.write(local208);
								local127.seek(0L);
								local127.close();
								aHashtable2.put(arg0, local132);
								return local132;
							}
						}
					} catch (@Pc(227) Exception local227) {
						try {
							if (local127 != null) {
								local127.close();
							}
						} catch (@Pc(235) Exception local235) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!gn", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!ma;")
	private static Class210 method5197(@OriginalArg(0) String arg0) {
		@Pc(40) String[] local40 = new String[] { "c:/rscache/", "/rscache/", aString208, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
			@Pc(50) String local50 = local40[local42];
			if (local50.length() <= 0 || (new File(local50)).exists()) {
				try {
					return new Class210(new File(local50, "jagex_" + arg0 + "_preferences.dat"), "rw", 10000L);
				} catch (@Pc(83) Exception local83) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!gn", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class209(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString211 = "1.1";
		this.aString207 = arg2;
		this.anApplet2 = arg0;
		this.anInt6256 = arg1;
		aString210 = "Unknown";
		try {
			aString210 = System.getProperty("java.vendor");
			aString211 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString209 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString209 = "Unknown";
		}
		aString212 = aString209.toLowerCase();
		try {
			aString213 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString213 = "";
		}
		try {
			aString206 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString206 = "";
		}
		try {
			aString208 = System.getProperty("user.home");
			if (aString208 != null) {
				aString208 = aString208 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString208 == null) {
			aString208 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
		}
		try {
			if (arg0 == null) {
				aMethod8 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod8 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod7 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod7 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass210_3 = new Class210(method5185("random.dat", null, this.anInt6256), "rw", 25L);
		this.aClass210_2 = new Class210(method5185("main_file_cache.dat2", this.aString207, this.anInt6256), "rw", 104857600L);
		this.aClass210_1 = new Class210(method5185("main_file_cache.idx255", this.aString207, this.anInt6256), "rw", 1048576L);
		this.aClass210Array1 = new Class210[arg3];
		for (@Pc(199) int local199 = 0; local199 < arg3; local199++) {
			this.aClass210Array1[local199] = new Class210(method5185("main_file_cache.idx" + local199, this.aString207, this.anInt6256), "rw", 1048576L);
		}
		try {
			this.aClass205_1 = new Class205();
		} catch (@Pc(238) Throwable local238) {
		}
		try {
			this.aClass206_1 = new Class206();
		} catch (@Pc(245) Throwable local245) {
		}
		@Pc(248) ThreadGroup local248 = Thread.currentThread().getThreadGroup();
		for (@Pc(251) ThreadGroup local251 = local248.getParent(); local251 != null; local251 = local251.getParent()) {
			local248 = local251;
		}
		@Pc(263) Thread[] local263 = new Thread[1000];
		local248.enumerate(local263);
		for (@Pc(269) int local269 = 0; local269 < local263.length; local269++) {
			if (local263[local269] != null && local263[local269].getName().startsWith("AWT")) {
				local263[local269].setPriority(1);
			}
		}
		this.aBoolean369 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!gn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class207 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean369) {
						return;
					}
					if (this.aClass207_2 != null) {
						local17 = this.aClass207_2;
						this.aClass207_2 = this.aClass207_2.aClass207_1;
						if (this.aClass207_2 == null) {
							this.aClass207_3 = null;
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
				@Pc(45) int local45 = local17.anInt6250;
				if (local45 == 1) {
					if (Class211.method5217() < aLong1323) {
						throw new IOException();
					}
					local17.anObject9 = new Socket(InetAddress.getByName((String) local17.anObject8), local17.anInt6249);
				} else if (local45 == 2) {
					@Pc(60) Thread local60 = new Thread((Runnable) local17.anObject8);
					local60.setDaemon(true);
					local60.start();
					local60.setPriority(local17.anInt6249);
					local17.anObject9 = local60;
				} else if (local45 == 4) {
					if (aLong1323 > Class211.method5217()) {
						throw new IOException();
					}
					local17.anObject9 = new DataInputStream(((URL) local17.anObject8).openStream());
				} else {
					@Pc(88) Object[] local88;
					if (local45 == 8) {
						local88 = (Object[]) local17.anObject8;
						if (((Class) local88[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject9 = ((Class) local88[0]).getDeclaredMethod((String) local88[1], (Class[]) local88[2]);
					} else if (local45 == 9) {
						local88 = (Object[]) local17.anObject8;
						if (((Class) local88[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject9 = ((Class) local88[0]).getDeclaredField((String) local88[1]);
					} else if (local45 == 18) {
						@Pc(127) Clipboard local127 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject9 = local127.getContents(null);
					} else if (local45 == 19) {
						@Pc(773) Transferable local773 = (Transferable) local17.anObject8;
						@Pc(776) Clipboard local776 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local776.setContents(local773, null);
					} else {
						@Pc(273) String local273;
						if (local45 == 3) {
							if (Class211.method5217() < aLong1323) {
								throw new IOException();
							}
							local273 = (local17.anInt6249 >> 24 & 0xFF) + "." + (local17.anInt6249 >> 16 & 0xFF) + "." + (local17.anInt6249 >> 8 & 0xFF) + "." + (local17.anInt6249 & 0xFF);
							local17.anObject9 = InetAddress.getByName(local273).getHostName();
						} else if (local45 == 5) {
							local17.anObject9 = this.aClass205_1.method5161();
						} else if (local45 == 6) {
							@Pc(152) Frame local152 = new Frame("Jagex Full Screen");
							local17.anObject9 = local152;
							local152.setResizable(false);
							this.aClass205_1.method5159(local17.anInt6249 >>> 16, local17.anInt6249 & 0xFFFF, local17.anInt6251 >> 16, local17.anInt6251 & 0xFFFF, local152);
						} else if (local45 == 7) {
							this.aClass205_1.method5160();
						} else if (local45 == 10) {
							@Pc(451) Class[] local451 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
							@Pc(453) Runtime local453 = Runtime.getRuntime();
							@Pc(464) Method local464;
							if (!aString212.startsWith("mac")) {
								local464 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local451);
								local464.setAccessible(true);
								local464.invoke(local453, local17.anObject8, "jawt");
								local464.setAccessible(false);
							}
							local464 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local451);
							local464.setAccessible(true);
							if (aString212.startsWith("linux") || aString212.startsWith("sunos")) {
								local464.invoke(local453, local17.anObject8, method5185("libgluegen-rt.so", this.aString207, this.anInt6256).toString());
								@Pc(633) Class local633 = ((Class) local17.anObject8).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
								local633.getMethod("begin").invoke(null);
								local464.invoke(local453, local17.anObject8, method5185("libjogl.so", this.aString207, this.anInt6256).toString());
								local633.getMethod("end").invoke(null);
								local464.invoke(local453, local17.anObject8, method5185("libjogl_awt.so", this.aString207, this.anInt6256).toString());
							} else if (aString212.startsWith("mac")) {
								local464.invoke(local453, local17.anObject8, method5185("libjogl.jnilib", this.aString207, this.anInt6256).toString());
								local464.invoke(local453, local17.anObject8, method5185("libjogl_awt.jnilib", this.aString207, this.anInt6256).toString());
							} else if (aString212.startsWith("win")) {
								local464.invoke(local453, local17.anObject8, method5185("jogl.dll", this.aString207, this.anInt6256).toString());
								local464.invoke(local453, local17.anObject8, method5185("jogl_awt.dll", this.aString207, this.anInt6256).toString());
							} else {
								throw new Exception();
							}
							local464.setAccessible(false);
						} else {
							@Pc(209) int local209;
							if (local45 == 11) {
								@Pc(196) Field local196 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local196.setAccessible(true);
								@Pc(207) Vector local207 = (Vector) local196.get(((Class) local17.anObject8).getClassLoader());
								for (local209 = 0; local207.size() > local209; local209++) {
									@Pc(221) Object local221 = local207.elementAt(local209);
									@Pc(228) Method local228 = local221.getClass().getDeclaredMethod("finalize");
									local228.setAccessible(true);
									local228.invoke(local221);
									local228.setAccessible(false);
									@Pc(245) Field local245 = local221.getClass().getDeclaredField("handle");
									local245.setAccessible(true);
									local245.set(local221, Integer.valueOf(0));
									local245.setAccessible(false);
								}
								local196.setAccessible(false);
							} else if (local45 == 12) {
								local273 = (String) local17.anObject8;
								@Pc(277) Class210 local277 = method5197(local273);
								local17.anObject9 = local277;
							} else if (local45 == 14) {
								@Pc(289) int local289 = local17.anInt6251;
								@Pc(292) int local292 = local17.anInt6249;
								this.aClass206_1.method5165(local289, local292);
							} else if (local45 == 15) {
								@Pc(427) boolean local427 = local17.anInt6249 != 0;
								@Pc(431) Component local431 = (Component) local17.anObject8;
								this.aClass206_1.method5164(local427, local431);
							} else if (local45 == 17) {
								local88 = (Object[]) local17.anObject8;
								this.aClass206_1.method5163(local17.anInt6249, (int[]) local88[1], (Point) local88[2], (Component) local88[0], local17.anInt6251);
							} else if (local45 == 16) {
								try {
									if (!aString212.startsWith("win")) {
										throw new Exception();
									}
									local273 = (String) local17.anObject8;
									if (!local273.startsWith("http://") && !local273.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(344) String local344 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local209 = 0; local273.length() > local209; local209++) {
										if (local344.indexOf(local273.charAt(local209)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local273 + "\"");
									local17.anObject9 = null;
								} catch (@Pc(386) Exception local386) {
									local17.anObject9 = local386;
								}
							} else {
								throw new Exception();
							}
						}
					}
				}
				local17.anInt6252 = 1;
			} catch (@Pc(858) ThreadDeath local858) {
				throw local858;
			} catch (@Pc(861) Throwable local861) {
				local17.anInt6252 = 2;
			}
		}
	}
}
